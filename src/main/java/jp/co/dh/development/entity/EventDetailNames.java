package jp.co.dh.development.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jp.co.dh.development.entity.EventAttendanceNames._EventAttendanceNames;
import jp.co.dh.development.entity.EventNames._EventNames;

import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link EventDetail}のプロパティ名の集合です。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2016/04/18 21:01:14")
public class EventDetailNames {

    /**
     * eventDetailIdのプロパティ名を返します。
     *
     * @return eventDetailIdのプロパティ名
     */
    public static PropertyName<Long> eventDetailId() {
        return new PropertyName<Long>("eventDetailId");
    }

    /**
     * scheduleのプロパティ名を返します。
     *
     * @return scheduleのプロパティ名
     */
    public static PropertyName<Date> schedule() {
        return new PropertyName<Date>("schedule");
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
     * eventAttendanceListのプロパティ名を返します。
     *
     * @return eventAttendanceListのプロパティ名
     */
    public static _EventAttendanceNames eventAttendanceList() {
        return new _EventAttendanceNames("eventAttendanceList");
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
     * @author S2JDBC-Gen
     */
    public static class _EventDetailNames extends PropertyName<EventDetail> {

        /**
         * インスタンスを構築します。
         */
        public _EventDetailNames() {
        }

        /**
         * インスタンスを構築します。
         *
         * @param name
         *            名前
         */
        public _EventDetailNames(final String name) {
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
        public _EventDetailNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * eventDetailIdのプロパティ名を返します。
         *
         * @return eventDetailIdのプロパティ名
         */
        public PropertyName<Long> eventDetailId() {
            return new PropertyName<Long>(this, "eventDetailId");
        }

        /**
         * scheduleのプロパティ名を返します。
         *
         * @return scheduleのプロパティ名
         */
        public PropertyName<Date> schedule() {
            return new PropertyName<Date>(this, "schedule");
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
         * eventAttendanceListのプロパティ名を返します。
         *
         * @return eventAttendanceListのプロパティ名
         */
        public _EventAttendanceNames eventAttendanceList() {
            return new _EventAttendanceNames(this, "eventAttendanceList");
        }

        /**
         * eventのプロパティ名を返します。
         *
         * @return eventのプロパティ名
         */
        public _EventNames event() {
            return new _EventNames(this, "event");
        }
    }
}