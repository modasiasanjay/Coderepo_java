package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Vo.RegiVo;

public class InsertDao {

	public void insert(RegiVo r) throws SQLException {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/springmvc","root","root");
			Statement st=con.createStatement();
			st.executeUpdate("Insert into register (FirstName,LastName,UserName,Pass) values('"+r.getFirstName()+"','"+r.getLastName()+"','"+r.getUserName()+"','"+r.getPass()+"')");	
			
			}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
	}
	public List search() throws SQLException {
		// TODO Auto-generated method stub
		
		List ls=new ArrayList();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost/springmvc", "root", "root");
			Statement st=con.createStatement();
			String sql = "SELECT * FROM register";
			ResultSet rs = st.executeQuery(sql);
		
			while(rs.next())
			{
				int S1=rs.getInt("id");	
				String S2=rs.getString("FirstName");
				String S3=rs.getString("LastName");
				String S4=rs.getString("UserName");
				String S5=rs.getString("Pass");
				
				RegiVo vo=new RegiVo();
				vo.setId(S1);
				vo.setFirstName(S2);
				vo.setLastName(S3);
				vo.setUserName(S4);
				vo.setPass(S5);

				ls.add(vo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}
	public List edit(RegiVo r) throws SQLException {
		// TODO Auto-generated method stub
		
		List ls=new ArrayList();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost/springmvc", "root", "root");
			Statement st=con.createStatement();
			String sql = "SELECT * FROM register where id='"+r.getId()+"'";
			ResultSet rs = st.executeQuery(sql);
		
			while(rs.next())
			{
				int S1=rs.getInt("id");	
				String S2=rs.getString("FirstName");
				String S3=rs.getString("LastName");
				String S4=rs.getString("UserName");
				String S5=rs.getString("Pass");
				
				RegiVo vo=new RegiVo();
				vo.setId(S1);
				vo.setFirstName(S2);
				vo.setLastName(S3);
				vo.setUserName(S4);
				vo.setPass(S5);

				ls.add(vo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}
		public void update(RegiVo vo){
			try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/springmvc","root","root");
					Statement st = con.createStatement();
					String sql = "update register set FirstName='"+vo.getFirstName()+"',LastName='"+vo.getLastName()+"',UserName='"+vo.getUserName()+"',Pass='"+vo.getPass()+"' where id='"+vo.getId()+"'";
					st.executeUpdate(sql);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
