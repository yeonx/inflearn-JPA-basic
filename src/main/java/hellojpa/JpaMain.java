package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

            /**
             * chapter 02
             */
//            Member member = new Member();
//            member.setName("HelloB");
//            member.setId(2L);
//            em.persist(member); //이렇게 하면 저장 됨

//            Member findMember = em.find(Member.class,1L);
//            System.out.println("findMember.id = " + findMember.getId());
//            System.out.println("findMember.name = " + findMember.getName());
//            findMember.setName("HelloJPA");

//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                    .setFirstResult(5) //paing 처리 예
//                    .setMaxResults(8) //paging 처리 예
//                    .getResultList();
//
//            for (Member member : result){
//                System.out.println("member.name = " + member.getName());
//            }

            /**
             * chapter 03
             */
//            //비영속
//            Member member = new Member();
//            member.setId(101L);
//            member.setName("HelloJPA");
//
//            //영속
//            System.out.println("=== BEFORE ===");
//            em.persist(member);
//            System.out.println("=== AFTER ===");
//
//            Member findMember = em.find(Member.class,101L);
//
//            System.out.println("findMember.id = " + findMember.getId());
//            System.out.println("findMember.name = " + findMember.getName());

//            //회원 엔티티를 영속성 컨텍스트에서 분리, 준영속 상태
//            em.detach(member);

//            Member findMember1 = em.find(Member.class,101L);
//            Member findMember2 = em.find(Member.class,101L);
//
//            System.out.println(findMember1==findMember2); //true 라고 반환

//            Member member1 = new Member(150L,"A");
//            Member member2 = new Member(160L,"B");
//
//            em.persist(member1);
//            em.persist(member2);

//            Member member = em.find(Member.class,150L);
//            member.setName("ABC");
//
//            em.detach(member);

//            Member member = new Member(200L,"member200");
//            em.persist(member);
//
//            em.flush(); //insert쿼리 날림

//            System.out.println("========");

            /**
             * chapter 08
             */
//            Member member = new Member();
//            member.setUsername("hello");
//
//            em.persist(member);
//
//            em.flush();
//            em.clear();
//
////            Member findMember = em.find(Member.class, member.getId());
//            Member findMember = em.getReference(Member.class,member.getId());
//            System.out.println("findMember.id = " + findMember.getId());
//            System.out.println("findMember.username + " + findMember.getUsername());

            /**
             * chapter 09
             */
            Member member = new Member();
            member.setUsername("member1");
            member.setHomeAddress(new Address("homecity","street","zipcode"));

            member.getFavoriteFoods("족발");
            member.getFavoriteFoods("치킨");
            member.getFavoriteFoods("피자");

            member.getAddressHistory().add(new Address("old1","street1","zipcode1"));
            member.getAddressHistory().add(new Address("old2","street2","zipcode2"));

            em.persist(member);

            em.flush();;
            em.clear();

            System.out.println("===START===");
            Member findMember = em.find(Member.class, member.getId());

            Address a = findMember.getHomeAddress();
            findMember.setHomeAddress(new Address("newcity", a.getStreet(),a.getZipcode()));

            findMember.getFavoriteFoods().remove("치킨");
            findMember.getFavoriteFoods().add("한식");

            findMember.getAddressHistory().remove(new Address("old1","street","10000"));
            findMember.getAddressHistory().add(new Address("newCity1","street","10000"));

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }

}
