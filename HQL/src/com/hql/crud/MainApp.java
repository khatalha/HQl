package com.hql.crud;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class MainApp {

	public static void main(String[] args) {
			Session objsession=HibernateDbConnect.getSessionFactory().openSession();
					
					try 
					{
						String str="delete users where firstname='Ali' ";
						objsession.beginTransaction();
						
						Query query=objsession.createQuery(str);
						query.executeUpdate();
									
					} 
					finally
					{
						objsession.close();
						
					}

	}

}
