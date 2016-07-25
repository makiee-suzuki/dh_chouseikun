package jp.co.dh.development.service;


import static jp.co.dh.development.entity.EventAttendanceNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import jp.co.dh.development.entity.EventAttendance;

/**
 * {@link EventAttendance}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2016/04/18 21:01:34")
public class EventAttendanceService extends AbstractService<EventAttendance> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param eventAttendanceId
     *            識別子
     * @return エンティティ
     */
    public EventAttendance findById(Long eventAttendanceId) {
        return select().id(eventAttendanceId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<EventAttendance> findAllOrderById() {
        return select().orderBy(asc(eventAttendanceId())).getResultList();
    }
}