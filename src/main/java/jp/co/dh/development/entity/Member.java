package jp.co.dh.development.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Memberエンティティクラス
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2016/04/18 21:00:51")
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;

    /** memberIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long memberId;

    /** nickNameプロパティ */
    @Column(length = 20, nullable = true, unique = false)
    public String nickName;

    /** sexプロパティ */
    @Column(length = 20, nullable = true, unique = false)
    public String sex;

    /** birthDateプロパティ */
    @Column(nullable = true, unique = false)
    public Date birthDate;

    /** mailAddressプロパティ */
    @Column(length = 100, nullable = false, unique = false)
    public String mailAddress;

    /** passwordプロパティ */
    @Column(length = 100, nullable = false, unique = false)
    public String password;

    /** entryDateプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp entryDate;

    /** updateDateプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp updateDate;

    /** lastLoginDateプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp lastLoginDate;

    /** eventAttendanceList関連プロパティ */
    @OneToMany(mappedBy = "member")
    public List<EventAttendance> eventAttendanceList;

    /** inputStatusManagementList関連プロパティ */
    @OneToMany(mappedBy = "member")
    public List<InputStatusManagement> inputStatusManagementList;
}