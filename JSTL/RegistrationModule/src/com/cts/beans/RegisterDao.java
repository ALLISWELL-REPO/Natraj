package com.cts.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDao {
	public static int register(User u){
		int status=0;
		try{
			Connection con=ConnectionProvider.getCon();
			PreparedStatement ps=con.prepareStatement("insert into user432 values(?,?,?)");
			ps.setString(1,u.getName());
			ps.setString(2,u.getEmail());
			ps.setString(3,u.getPass());
			status=ps.executeUpdate();
			
		}catch(Exception e){
			System.out.println(e);
		}
		return status;
		
	}

}
