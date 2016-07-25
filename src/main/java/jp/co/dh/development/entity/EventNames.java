package jp.co.dh.development.entity;

import java.sql.Timestamp;

import javax.annotation.Generated;

import jp.co.dh.development.entity.EventDetailNames._EventDetailNames;
import jp.co.dh.development.entity.InputStatusManagementNames._InputStatusManagementNames;

import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Event}のプロパティ名の集合です。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2016/04/18 21:01:14")
public class EventNames {

    /**
     * eventIdのプロパティ名を返します。
     *
     * @return eventIdのプロパティ名
     */
    public static PropertyName<Long> eventId() {
        return new PropertyName<Long>("eventId");
    }

    /**
     * eventNameのプロパティ名を返します。
     *
     * @return eventNameのプロパティ名
     */
    public static PropertyName<String> eventName() {
        return new PropertyName<String>("eventName");
    }

    /**
     * contentのプロパティ名を返します。
     *
     * @return contentのプロパティ名
     */
    public static PropertyName<String> content() {
        return new PropertyName<String>("content");
    }

    /**
     * entryMemberIdのプロパティ名を返します。
     *
     * @return entryMemberIdのプロパティ名
     */
    public static PropertyName<Integer> entryMemberId() {
        return new PropertyName<Integer>("entryMemberId");
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
     * updateMemberIdのプロパティ名を返します。
     *
     * @return updateMemberIdのプロパティ名
     */
    public static PropertyName<Integer> updateMemberId() {
        return new PropertyName<Integer>("updateMemberId");
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
     * eventDetailListのプロパティ名を返します。
     *
     * @return eventDetailListのプロパティ名
     */
    public static _EventDetailNames eventDetailList() {
        return new _EventDetailNames("eventDetailList");
    }

    /**
     * inputStatusManagementListのプロパティ名を返します。
     *
     * @return inputStatusManagementListのプロパティ名
     */
    public static _InputStatusManagementNames inputStatusManagementList() {
        return new _InputStatusManagementNames("inputStatusManagementList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _EventNames extends PropertyName<Event> {

        /**
         * インスタンスを構築します。
         */
        public _EventNames() {
        }

        /**
         * インスタンスを構築します。
         *
         * @param name
         *            名前
         */
        public _EventNames(final String name) {
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
        public _EventNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * eventNameのプロパティ名を返します。
         *
         * @return eventNameのプロパティ名
         */
        public PropertyName<String> eventName() {
            return new PropertyName<String>(this, "eventName");
        }

        /**
         * contentのプロパティ名を返します。
         *
         * @return contentのプロパティ名
         */
        public PropertyName<String> content() {
            return new PropertyName<String>(this, "content");
        }

        /**
         * entryMemberIdのプロパティ名を返します。
         *
         * @return entryMemberIdのプロパティ名
         */
        public PropertyName<Integer> entryMemberId() {
            return new PropertyName<Integer>(this, "entryMemberId");
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
         * updateMemberIdのプロパティ名を返します。
         *
         * @return updateMemberIdのプロパティ名
         */
        public PropertyName<Integer> updateMemberId() {
            return new PropertyName<Integer>(this, "updateMemberId");
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
         * eventDetailListのプロパティ名を返します。
         *
         * @return eventDetailListのプロパティ名
         */
        public _EventDetailNames eventDetailList() {
            return new _EventDetailNames(this, "eventDetailList");
        }

        /**
         * inputStatusManagementListのプロパティ名を返します。
         *
         * @return inputStatusManagementListのプロパティ名
         */
        public _InputStatusManagementNames inputStatusManagementList() {
            return new _InputStatusManagementNames(this, "inputStatusManagementList");
        }
    }
}