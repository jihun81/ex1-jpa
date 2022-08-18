package hellojpa;
import javax.persistence.*;
import java.util.Date;

@Entity
/*@Entity(name = "Member")*/
/*@Table(name="MBR")*//*테이블명*/
/* name 매핑할 테이블
*  catalog /
*   */
/*@Table(uniqueConstraints = ) 유티크 조건*/
public class Member {
    @Id
    private Long id;
    //@Column(unique = true, length = 10)
    @Column(name="name", nullable= false, columnDefinition = "varchar(100) default 'EMPTY'")
    private String name;
    private String age;
    private Integer age2;
    @Enumerated(EnumType.STRING)
    private RoleType roleType;
    @Temporal(TemporalType.TIMESTAMP)
    private Date cretaedDAte;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Lob//대용량 데이타
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

    public Integer getAge2() {
        return age2;
    }

    public void setAge2(Integer age2) {
        this.age2 = age2;
    }


    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Date getCretaedDAte() {
        return cretaedDAte;
    }

    public void setCretaedDAte(Date cretaedDAte) {
        this.cretaedDAte = cretaedDAte;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}