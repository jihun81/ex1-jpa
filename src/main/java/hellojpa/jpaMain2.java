package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class jpaMain2 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();


        try {
            Member member = new Member();

                     //비영속

            member.setId(2L);
            member.setName("test2");
            member.setAge("11");
            member.setAge2(10);
            member.setRoleType(RoleType.USER);

            //영속
            em.persist(member);
/*             //비영속
            Member member = new Member();
            member.setId(2L);
            member.setName("test2");
            //영속
            em.persist(member);*/


    /*        Member member1 = new Member(3L,"tset12121","10");
            Member member2 = new Member(4L,"tset99999", "12");


            em.persist(member1);
            em.persist(member2);*/

           // em.detach(member1); // 영속성 컨테스트 차단

/*          Member findMember = em.find(Member.class, 1L);
            findMember.setName("HelloA2");
            System.out.println(findMember.getId());
            System.out.println(findMember.getName());*/

            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            em.close();
            emf.close();
        }


   /*     Member member = new Member();

        member.setId(2L);
        member.setName("test2");
        em.persist(member);*/


        // em.clear();


    }
}
