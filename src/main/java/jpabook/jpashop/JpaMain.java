package jpabook.jpashop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
        public static void main(String[] args) {

            //팩토리는 실제 애플리케이션 로딩 시점에 딱 하나만 만들어야 함
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

            EntityManager em = emf.createEntityManager();

            EntityTransaction tx = em.getTransaction();
            tx.begin();

            //JPQL은 엔티티 객체를 대상으로 쿼리를 던짐!
            try {
                tx.commit();
            } catch (Exception e) {
                em.close();
            }
            emf.close();
        }
    }
