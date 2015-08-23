/**
 * ����ִֻ��һ�ε�SQL���ѡ��Statement����õ�. �෴, ���SQL��䱻���ִ��ѡ��PreparedStatement����õ�.
 * PreparedStatement�ĵ�һ��ִ�������Ǻܸߵ�. �������������ں�����ظ�ִ��.
 * 
 * PreparedStatement�ĵ�һ��ִ�������Ǻܸߵ�. �������������ں�����ظ�ִ��. ����, ������ʹ��Employee ID, ʹ��prepared�ķ�ʽ��ִ��һ�����Employee��Ĳ�ѯ. JDBC�����ᷢ��һ�������������ݽ������Ż������ѯ. ��ִ��ʱ�������һ����������. ��JDBC�����У���������ͨѶ�����յ�Ŀ��. ����ҵĳ����������ڼ�ֻ��Ҫһ������, ��ô��ʹ��Statement. ����Statement, ͬһ����ѯֻ�����һ�����絽���ݿ��ͨѶ.
 */
package com.alf;

import java.util.Iterator;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
/**
 * @author yinga
 *
 */
public class JDBC_Example {
	private static String url = "jdbc:oracle:thin:@16.157.132.48:1521:SHQA11R2";
	private static String user = "PPM_931_SHARON_TEMP";
	private static String password = "PPM_931_SHARON_TEMP";    
	public static Connection conn;    
	public static PreparedStatement ps;    
	public static ResultSet rs;    
	public static Statement st ;   
	
	public static Connection getConnection(){    
		conn = null;
		try {    
				//Step1: initialize driver class.     
				Class.forName("oracle.jdbc.driver.OracleDriver");    
				//Step2: Setup DB connection     
				conn = DriverManager.getConnection(url, user, password);
				if( conn == null )
				{    
					System.out.println( "Cannot connect to database.");    
				}
				else
				{    
					System.out.println("Connection to database is successful!"); 
				} 
				
			}
		catch (Exception e) {    
				e.printStackTrace();    
			} 
		return conn;
	}   
   
	public static void insert() throws SQLException {    
		conn = getConnection(); 
		/*
		 * The below code is prepare statement execution.
		boolean flag = true;
		try {    
			String insertSql = " insert into employee (User_ID,User_Name)"    
						+ " values (1,?)";
			PreparedStatement ps = conn.prepareStatement(insertSql);
//			ps.setLong(1, 1);
			ps.setString(1, "Alpha");
			ps.addBatch();
			int execResult[] = ps.executeBatch();
			for(int i = 0; i < execResult.length; i++ )
			{
				if( execResult[i] == 0 )
				{
					flag = false;
				}
						
			}
		}
		catch(SQLException e)
		{
			System.out.println("failed to insert data!");
			e.printStackTrace();
		}
		finally
		{
			conn.close();
		}
		*/	
			
		//The below code is based on statement execution.
		try{
			String insertSql = "insert into employee (User_ID,User_Name) values (3,'Alpha')";
			//Step 3: Create Statement object.
			st = (Statement) conn.createStatement();
			//Step 4: Execute insert sql statement, and return count of insert data.
			int count = st.executeUpdate( insertSql );       
			System.out.println("The count of insert data is:\t " + count ); 
		}
		catch (SQLException e) {    
			System.out.println("��������ʧ��" + e.getMessage());    
		}     
		finally{
			//Step 5: Close connection to database.
			conn.close(); 
		}
   }    
   
	
	public static void updateEmp() throws SQLException {    
		conn = getConnection(); 
		boolean flag = true;
		try {    
			/* The below statement is used update data using preparestatement.
			String updateSql = "update employee set USER_NAME=? where USER_NAME=?";
			PreparedStatement ps = conn.prepareStatement(updateSql);
			ps.setString(1, "Gamma");
			ps.setString(2, "BETA");
			ps.addBatch();
			int execResult[] = ps.executeBatch();
			for(int i = 0; i < execResult.length; i++ )
			{
				if( execResult[i] == 0 )
				{
					flag = false;
				}
						
			}
			*/
			String updateSQL = "update employee set USER_NAME='Beta' where USER_NAME='���'";
			st = (Statement)conn.createStatement();
			rs = st.executeQuery(updateSQL);
			
		}
		catch(SQLException e)
		{
			System.out.println("Failed to update data");
			e.printStackTrace();
		}
		finally
		{
			conn.close();
		}
	}
	
	public static void main(String args[]) throws SQLException
	{
		JDBC_Example je = new JDBC_Example();
//		je.insert();
// 		je.updateEmp();
 		je.deleteEmp(3);
		List<Employee> emps = je.queryUser();
		Iterator<Employee> it = emps.iterator();
		while(it.hasNext())
		{
			Employee emp = it.next();
			System.out.println(emp.getUserId() + "\t" + emp.getUserName() + "\t" + emp.getAlias());
			//System.out.println(it.next().getUserName());
		}
		/*
		foreach(Employee emp: emps)
		{
			System.out.println();
		} 
		
		List<String> strs = new ArrayList<String>;
		foreach(String str : strs)
		{
			
		}
		*/
	}
	
	public List<Employee> queryUser() throws SQLException{
        List<Employee> list = new ArrayList<Employee>();
        String sql="select * from employee";
        conn = getConnection();
        try {
              /*
               * the below is execute query using preparestatement.
        	  ps = conn.prepareStatement(sql);
              rs = ps.executeQuery();
              */
              st = (Statement)conn.createStatement();
              rs = st.executeQuery(sql);
              
              while( rs.next() )
              {
            	  Employee employee = new Employee();
            	  employee.setUserName(rs.getString("USER_NAME"));
            	  employee.setUserId(rs.getLong("USER_ID"));
            	  employee.setAlias(rs.getString("ALIAS"));
            	  list.add(employee);
            }
       } catch (SQLException e) {
           e.printStackTrace();
       }finally{
           conn.close();
       }
       
        return list;
    }
	
	public boolean deleteEmp(int id) throws SQLException{
        boolean flag = true;
        String sql="delete from employee where USER_ID=?";
        String deleteSql = "delete from employee where USER_ID=" + id;
        conn = getConnection();
        try {
            /* The below is used to execute delete sql using prepare statement.
        	ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if(i == 0){
                flag=false;
            }
            */
        	st = conn.createStatement();
        	rs = st.executeQuery(deleteSql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            conn.close();
        }
        
        return flag;
    }
}
