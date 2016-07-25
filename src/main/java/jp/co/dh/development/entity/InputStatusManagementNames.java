package jp.co.dh.development.entity;

import java.sql.Timestamp;

import javax.annotation.Generated;

import jp.co.dh.development.entity.EventNames._EventNames;
import jp.co.dh.development.entity.MemberNames._MemberNames;

import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link InputStatusManagement}のプロパティ名の集合です。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2016/04/18 21:01:14")
public class InputStatusManagementNames {

    /**
     * inputStatusManagementIdのプロパティ名を返します。
     *
     * @return inputStatusManagementIdのプロパティ名
     */
    public static PropertyName<Long> inputStatusManagementId() {
        return new PropertyName<Long>("inputStatusManagementId");
    }

    /**
     * eventIdのプロパティ名を返します。
     *
     * @return eventIdのプロパティ名
     */
    public static PropertyName<Long> eventId() {
        return new PropertyName<Long>("eventId");
    }

    /**
     * memberIdのプロパティ名を返します。
     *
     * @return memberIdのプロパティ名
     */
    public static PropertyName<Long> memberId() {
        return new PropertyName<Long>("memberId");
    }

    /**
     * inputtedFlagのプロパティ名を返します。
     *
     * @return inputtedFlagのプロパティ名
     */
    public static PropertyName<Boolean> inputtedFlag() {
        return new PropertyName<Boolean>("inputtedFlag");
    }

    /**
     * entryDatetimeのプロパティ名を返します。
     *
     * @return entryDatetimeのプロパティ名
     */
    public static PropertyName<Timestamp> entryDatetime() {
        return new PropertyName<Timestamp>("entryDatetime");
    }

    /**
     * updateDatetimeのプロパティ名を返します。
     *
     * @return updateDatetimeのプロパティ名
     */
    public static PropertyName<Timestamp> updateDatetime() {
        return new PropertyName<Timestamp>("updateDatetime");
    }

    /**
     * eventのプロパティ名を返します。
     *
     * @return eventのプロパティ名
     */
    public static _EventNames event() {
        return new _EventNames("event");
    }

    /**
     * memberのプロパティ名を返します。
     *
     * @return memberのプロパティ名
     */
    public static _MemberNames member() {
        return new _MemberNames("member");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _InputStatusManagementNames extends PropertyName<InputStatusManagement> {

        /**
         * インスタンスを構築します。
         */
        public _InputStatusManagementNames() {
        }

        /**
         * インスタンスを構築します。
         *
         * @param name
         *            名前
         */
        public _InputStatusManagementNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         *
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _InputStatusManagementNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * inputStatusManagementIdのプロパティ名を返します。
         *
         * @return inputStatusManagementIdのプロパティ名
         */
        public PropertyName<Long> inputStatusManagementId() {
            return new PropertyName<Long>(this, "inputStatusManagementId");
        }

        /**
         * eventIdのプロパティ名を返します。
         *
         * @return eventIdのプロパティ名
         */
        public PropertyName<Long> eventId() {
            return new PropertyName<Long>(this, "eventId");
        }

        /**
         * memberIdのプロパティ名を返します。
         *
         * @return memberIdのプロパティ名
         */
        public PropertyName<Long> memberId() {
            return new PropertyName<Long>(this, "memberId");
        }

        /**
         * inputtedFlagのプロパティ名を返します。
         *
         * @return inputtedFlagのプロパティ名
         */
        public PropertyName<Boolean> inputtedFlag() {
            return new PropertyName<Boolean>(this, "inputtedFlag");
        }

        /**
         * entryDatetimeのプロパティ名を返します。
         *
         * @return entryDatetimeのプロパティ名
         */
        public PropertyName<Timestamp> entryDatetime() {
            return new PropertyName<Timestamp>(this, "entryDatetime");
        }

        /**
         * updateDatetimeのプロパティ名を返します。
         *
         * @return updateDatetimeのプロパティ名
         */
        public PropertyName<Timestamp> updateDatetime() {
            return new PropertyName<Timestamp>(this, "updateDatetime");
        }

        /**
         * eventのプロパティ名を返します。
         *
         * @return eventのプロパティ名
         */
        public _EventNames event() {
            return new _EventNames(this, "event");
        }

        /**
         * memberのプロパティ名を返します。
         *
         * @return memberのプロパティ名
         */
        public _MemberNames member() {
            return new _MemberNames(this, "member");
        }
    }
}