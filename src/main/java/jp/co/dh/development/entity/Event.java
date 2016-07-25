package jp.co.dh.development.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

/**
 * Eventエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2016/04/18 21:00:51")
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;

    /** eventIdプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long eventId;

    /** eventNameプロパティ */
    @Column(length = 100, nullable = true, unique = false)
    public String eventName;

    /** contentプロパティ */
    @Lob
    @Column(length = 65535, nullable = true, unique = false)
    public String content;

    /** entryMemberIdプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer entryMemberId;

    /** entryDatetimeプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp entryDatetime;

    /** updateMemberIdプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer updateMemberId;

    /** updateDatetimeプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp updateDatetime;

    /** eventDetailList関連プロパティ */
    @OneToMany(mappedBy = "event")
    public List<EventDetail> eventDetailList;

    /** inputStatusManagementList関連プロパティ */
    @OneToMany(mappedBy = "event")
    public List<InputStatusManagement> inputStatusManagementList;
}