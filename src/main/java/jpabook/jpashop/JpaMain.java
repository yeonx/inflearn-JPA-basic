package jpabook.jpashop;

import jpabook.jpashop.domain.*;

import javax.persistence.*;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        tx.begin();

        try{

//           Book book = new Book();
//           book.setName("JPA");
//           book.setAuthor("김영한");
//
//           em.persist(book);
            Member member = new Member();
            member.setName("member1");
            member.setAge(10);
            em.persist(member);

            em.flush();
            em.clear();

            List<Member> result = em.createQuery("select m from Member m order by m.age desc",Member.class)
                    .setFirstResult(10)
                    .setMaxResults(20)
                    .getResultList();

//            List<MemberDTO> result = em.createQuery("select new jpql.MemberDTO(m.username,m.age) from Member m",MemberDTO.class)
//                    .getResultList();

//            Member query1 = em.createQuery("select m from Member m.name = :name",Member.class)
//                    .setParameter("name","member1").
//                    getSingleResult();
//
//            TypedQuery<Member> query2 = em.createQuery("select m.name from Member m",Member.class);
//
//            Query query3 = em.createQuery("select m.name, m.age from member m");


            tx.commit();
        } catch (Exception e){
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();

    }
}
