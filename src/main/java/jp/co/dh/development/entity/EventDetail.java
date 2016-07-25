package jp.co.dh.development.entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * EventDetailエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2016/04/18 21:00:51")
public class EventDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /** eventDetailIdプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = true)
    public Long eventDetailId;

    /** scheduleプロパティ */
    @Column(nullable = true, unique = false)
    public Date schedule;

    /** eventIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Long eventId;

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

    /** eventAttendanceList関連プロパティ */
    @OneToMany(mappedBy = "eventDetail")
    public List<EventAttendance> eventAttendanceList;

    /** event関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "event_id", referencedColumnName = "event_id")
    public Event event;
}