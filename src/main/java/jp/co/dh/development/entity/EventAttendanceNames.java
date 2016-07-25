package jp.co.dh.development.entity;

import java.sql.Timestamp;

import javax.annotation.Generated;

import jp.co.dh.development.entity.EventDetailNames._EventDetailNames;
import jp.co.dh.development.entity.MemberNames._MemberNames;

import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link EventAttendance}のプロパティ名の集合です。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2016/04/18 21:01:14")
public class EventAttendanceNames {

    /**
     * eventAttendanceIdのプロパティ名を返します。
     *
     * @return eventAttendanceIdのプロパティ名
     */
    public static PropertyName<Long> eventAttendanceId() {
        return new PropertyName<Long>("eventAttendanceId");
    }

    /**
     * eventDetailIdのプロパティ名を返します。
     *
     * @return eventDetailIdのプロパティ名
     */
    public static PropertyName<Long> eventDetailId() {
        return new PropertyName<Long>("eventDetailId");
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
     * attendanceDivisionのプロパティ名を返します。
     *
     * @return attendanceDivisionのプロパティ名
     */
    public static PropertyName<String> attendanceDivision() {
        return new PropertyName<String>("attendanceDivision");
    }

    /**
     * commentのプロパティ名を返します。
     *
     * @return commentのプロパティ名
     */
    public static PropertyName<String> comment() {
        return new PropertyName<String>("comment");
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
     * eventDetailのプロパティ名を返します。
     *
     * @return eventDetailのプロパティ名
     */
    public static _EventDetailNames eventDetail() {
        return new _EventDetailNames("eventDetail");
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
    public static class _EventAttendanceNames extends PropertyName<EventAttendance> {

        /**
         * インスタンスを構築します。
         */
        public _EventAttendanceNames() {
        }

        /**
         * インスタンスを構築します。
         *
         * @param name
         *            名前
         */
        public _EventAttendanceNames(final String name) {
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
        public _EventAttendanceNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * eventAttendanceIdのプロパティ名を返します。
         *
         * @return eventAttendanceIdのプロパティ名
         */
        public PropertyName<Long> eventAttendanceId() {
            return new PropertyName<Long>(this, "eventAttendanceId");
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
         * memberIdのプロパティ名を返します。
         *
         * @return memberIdのプロパティ名
         */
        public PropertyName<Long> memberId() {
            return new PropertyName<Long>(this, "memberId");
        }

        /**
         * attendanceDivisionのプロパティ名を返します。
         *
         * @return attendanceDivisionのプロパティ名
         */
        public PropertyName<String> attendanceDivision() {
            return new PropertyName<String>(this, "attendanceDivision");
        }

        /**
         * commentのプロパティ名を返します。
         *
         * @return commentのプロパティ名
         */
        public PropertyName<String> comment() {
            return new PropertyName<String>(this, "comment");
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
         * eventDetailのプロパティ名を返します。
         *
         * @return eventDetailのプロパティ名
         */
        public _EventDetailNames eventDetail() {
            return new _EventDetailNames(this, "eventDetail");
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