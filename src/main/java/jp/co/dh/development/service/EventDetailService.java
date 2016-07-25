package jp.co.dh.development.service;

import static jp.co.dh.development.entity.EventDetailNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import jp.co.dh.development.entity.EventDetail;

/**
 * {@link EventDetail}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2016/04/18 21:01:34")
public class EventDetailService extends AbstractService<EventDetail> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param eventDetailId
     *            識別子
     * @return エンティティ
     */
    public EventDetail findById(Long eventDetailId) {
        return select().id(eventDetailId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<EventDetail> findAllOrderById() {
        return select().orderBy(asc(eventDetailId())).getResultList();
    }
}