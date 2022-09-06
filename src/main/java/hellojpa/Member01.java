package hellojpa;

import javax.persistence.*;

@Entity
public class Member01 {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    String name;

    public Member01() {

    }

    public Member01(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
