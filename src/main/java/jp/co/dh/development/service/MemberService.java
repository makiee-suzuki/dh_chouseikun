package jp.co.dh.development.service;

import static jp.co.dh.development.entity.MemberNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import jp.co.dh.development.entity.Member;

/**
 * {@link Member}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2016/04/18 21:01:34")
public class MemberService extends AbstractService<Member> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param memberId
     *            識別子
     * @return エンティティ
     */
    public Member findById(Long memberId) {
        return select().id(memberId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<Member> findAllOrderById() {
        return select().orderBy(asc(memberId())).getResultList();
    }

    public Member findByEmailAndPassword(String email, String password){
    	return select().where("mail_address = ? and password=?",email,password).getSingleResult();
    }
}