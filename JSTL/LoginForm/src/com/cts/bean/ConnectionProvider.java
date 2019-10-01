package com.cts.bean;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	private static Connection con=null;
	static{
		try{
			Provider p=new Provider();
			Class.forName(p.DRIVER);
			con=DriverManager.getConnection(p.CONNECTION_URL,p.USERNAME,p.PASSWORD);			
		}catch(Exception e){
	      System.out.println(e);
		}		
	}
	public static Connection getCon(){
		return con;		
	}
}
