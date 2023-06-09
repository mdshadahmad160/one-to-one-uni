package org.jsp.one2one.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManager factory=Persistence.createEntityManagerFactory("dev").createEntityManager();
	}

}
