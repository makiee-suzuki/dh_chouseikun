package jp.co.dh.development.service;

import static jp.co.dh.development.entity.EventNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import jp.co.dh.development.entity.Event;

/**
 * {@link Event}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2016/04/18 21:01:34")
public class EventService extends AbstractService<Event> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param eventId
     *            識別子
     * @return エンティティ
     */
    public Event findById(Long eventId) {
        return select().id(eventId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<Event> findAllOrderById() {
        return select().orderBy(asc(eventId())).getResultList();
    }
}