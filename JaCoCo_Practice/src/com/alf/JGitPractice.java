package com.alf;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.errors.CorruptObjectException;
import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.errors.MissingObjectException;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.ObjectLoader;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevTree;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.treewalk.TreeWalk;
import org.eclipse.jgit.treewalk.filter.PathFilter;

public class JGitPractice {

	public static void main(String[] args) throws MissingObjectException, IncorrectObjectTypeException, CorruptObjectException, IOException {
		// TODO Auto-generated method stub
	    File gitWorkDir = new File("C:/Maas/ess-saw/.git");
	    Git git = Git.open(gitWorkDir);
	    Repository repo = git.getRepository();
	 
	    ObjectId lastCommitId = repo.resolve(Constants.HEAD);
	 
	    RevWalk revWalk = new RevWalk(repo);
	    RevCommit commit = revWalk.parseCommit(lastCommitId);
	 
	    RevTree tree = commit.getTree();
	 
	    TreeWalk treeWalk = new TreeWalk(repo);
	    treeWalk.addTree(tree);
	    treeWalk.setRecursive(true);
	    treeWalk.setFilter(PathFilter.create("file1.txt"));
	    if (!treeWalk.next()) 
	    {
	      System.out.println("Nothing found!");
	      return;
	    }
	 
	    ObjectId objectId = treeWalk.getObjectId(0);
	    ObjectLoader loader = repo.open(objectId);
	 
	    ByteArrayOutputStream out = new ByteArrayOutputStream();
	    loader.copyTo(out);
	    System.out.println("file1.txt:\n" + out.toString());

	}

}
