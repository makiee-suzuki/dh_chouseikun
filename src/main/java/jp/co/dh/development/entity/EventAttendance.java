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
 * EventAttendanceエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2016/04/18 21:00:51")
public class EventAttendance implements Serializable {

    private static final long serialVersionUID = 1L;

    /** eventAttendanceIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Long eventAttendanceId;

    /** eventDetailIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Long eventDetailId;

    /** memberIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Long memberId;

    /** attendanceDivisionプロパティ */
    @Column(length = 2, nullable = true, unique = false)
    public String attendanceDivision;

    /** commentプロパティ */
    @Column(length = 100, nullable = true, unique = false)
    public String comment;

    /** entryDatetimeプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp entryDatetime;

    /** updateDatetimeプロパティ */
    @Column(nullable = true, unique = false)
    public Timestamp updateDatetime;

    /** eventDetail関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "event_detail_id", referencedColumnName = "event_detail_id")
    public EventDetail eventDetail;

    /** member関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "member_id", referencedColumnName = "member_id")
    public Member member;
}