package jpabook.jpashop;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderItem;

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

                Member member1 = new Member();
                member1.setName("member1");
                em.persist(member1);

                em.flush();
                em.clear();


                Member m1 = em.find(Member.class, member1.getId());
                System.out.println("reference " + m1.getClass()                );

                Member reference = em.getReference(Member.class, member1.getId());

//                em.detach(reference);
                System.out.println("m1 = " + reference.getClass());


                tx.commit();
            } catch (Exception e) {
                em.close();
            }
            emf.close();
        }
    }
