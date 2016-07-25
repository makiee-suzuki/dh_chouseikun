package jp.co.dh.development.entity;

import javax.annotation.Generated;

import jp.co.dh.development.entity.EventAttendanceNames._EventAttendanceNames;
import jp.co.dh.development.entity.EventDetailNames._EventDetailNames;
import jp.co.dh.development.entity.EventNames._EventNames;
import jp.co.dh.development.entity.InputStatusManagementNames._InputStatusManagementNames;
import jp.co.dh.development.entity.MemberNames._MemberNames;

/**
 * 名前クラスの集約です。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2016/04/18 21:01:14")
public class Names {

    /**
     * {@link Event}の名前クラスを返します。
     *
     * @return Eventの名前クラス
     */
    public static _EventNames event() {
        return new _EventNames();
    }

    /**
     * {@link EventAttendance}の名前クラスを返します。
     *
     * @return EventAttendanceの名前クラス
     */
    public static _EventAttendanceNames eventAttendance() {
        return new _EventAttendanceNames();
    }

    /**
     * {@link EventDetail}の名前クラスを返します。
     *
     * @return EventDetailの名前クラス
     */
    public static _EventDetailNames eventDetail() {
        return new _EventDetailNames();
    }

    /**
     * {@link InputStatusManagement}の名前クラスを返します。
     *
     * @return InputStatusManagementの名前クラス
     */
    public static _InputStatusManagementNames inputStatusManagement() {
        return new _InputStatusManagementNames();
    }

    /**
     * {@link Member}の名前クラスを返します。
     *
     * @return Memberの名前クラス
     */
    public static _MemberNames member() {
        return new _MemberNames();
    }
}