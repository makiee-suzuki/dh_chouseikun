package jp.co.dh.development.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * InputStatusManagementエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2016/04/18 21:00:51")
public class InputStatusManagement implements Serializable {

    private static final long serialVersionUID = 1L;

    /** inputStatusManagementIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Long inputStatusManagementId;

    /** eventIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Long eventId;

    /** memberIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Long memberId;

    /** inputtedFlagプロパティ */
    @Column(nullable = true, unique = false)
    public Boolean inputtedFlag;

    /** entryDatetimeプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp entryDatetime;

    /** updateDatetimeプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp updateDatetime;

    /** event関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "event_id")
    public Event event;

    /** member関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "member_id", referencedColumnName = "member_id")
    public Member member;
}