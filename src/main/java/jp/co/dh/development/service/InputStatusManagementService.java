package jp.co.dh.development.service;

import static jp.co.dh.development.entity.InputStatusManagementNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import jp.co.dh.development.entity.InputStatusManagement;

/**
 * {@link InputStatusManagement}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2016/04/18 21:01:34")
public class InputStatusManagementService extends AbstractService<InputStatusManagement> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param inputStatusManagementId
     *            識別子
     * @return エンティティ
     */
    public InputStatusManagement findById(Long inputStatusManagementId) {
        return select().id(inputStatusManagementId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<InputStatusManagement> findAllOrderById() {
        return select().orderBy(asc(inputStatusManagementId())).getResultList();
    }
}