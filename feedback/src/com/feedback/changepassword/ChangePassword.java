package com.feedback.changepassword;

import java.io.IOException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import org.eclipse.jdt.internal.compiler.ast.AllocationExpression;

import com.feedback.database.DatabaseConnection;
import javax.swing.JOptionPane;

public class ChangePassword extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String password = request.getParameter("currentpass");
		String newpass = request.getParameter("newpass");
		String confirm = request.getParameter("cnfrmpass");

		try {

			Connection con = DatabaseConnection.getInstance();
			PreparedStatement st = con.prepareStatement("select * from teacher");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				String usrname = rs.getString("userName");
				String passwd = rs.getString("password");
				if (passwd.equals(password)) {

					if (confirm.equals(newpass)) {

						PreparedStatement st1 = con.prepareStatement(
								"update teacher set password='" + newpass + "' where userName='" + usrname + "'");
						st1.executeUpdate();
						request.setAttribute("infoMessage", "PASSWORD CHANGED");
						request.getRequestDispatcher("/Login/coordinatorhome.jsp").forward(request, response);

					} else {
						
					}
				} else {
					request.setAttribute("infoMessage", "Enter Valid Password");
					request.getRequestDispatcher("/Login/changecoordinatorpassword.jsp").forward(request, response);
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
