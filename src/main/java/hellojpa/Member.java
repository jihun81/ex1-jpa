package hellojpa;
import javax.persistence.*;
import java.util.Date;

@Entity
/*@Entity(name = "Member")*/
/*@Table(name="MBR")*//*테이블명*/
/* name 매핑할 테이블
*  catalog /
*   */
public class Member {
    @Id
    private Long id;
    @Column(unique = true, length = 10)
    private String name;
    private String age;
    private Integer age2;
    @Enumerated(EnumType.STRING)
    private RoleType roleType;
    @Temporal(TemporalType.TIMESTAMP)
    private Date cretaedDAte;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Lob
    private String description;





    //Getter, Setter …

    public Member(){

    }
    public Member(Long id, String name){
        this.id = id;
        this.name = name;
    }

    public Member(Long id, String name, String age){
        this.id = id;
        this.name = name;
        this.age = age;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getAge2() {
        return age2;
    }

    public void setAge2(int age2) {
        this.age2 = age2;
    }
}