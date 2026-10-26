package org.example.miniwaze.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtil {

    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("miniwazePU");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}