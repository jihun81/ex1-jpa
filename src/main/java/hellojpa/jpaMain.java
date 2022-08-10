package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.awt.*;
import java.util.List;

public class jpaMain {

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();

    /*    Member findMember = em.find(Member.class,1L);
        findMember.setName("HelloA");
        System.out.println(findMember.getId());
        System.out.println(findMember.getName());*/
try{

/*    Member findMember = em.find(Member.class,1L);
    findMember.setName("HelloA2");
    System.out.println(findMember.getId());
    System.out.println(findMember.getName());*/
    List<Member> result = (List<Member>) em.createQuery("select m from Member as m",Member.class)
            .setFirstResult(0)
            .setMaxResults(8)
            .getResultList();
    System.out.println("memver.name =");
    for(Member member : result){
        System.out.println("memver.name ="+ member.getName());
    }
    tx.commit();
}catch (Exception e){
    tx.rollback();
}finally {
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
