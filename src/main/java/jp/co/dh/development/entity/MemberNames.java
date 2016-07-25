package jp.co.dh.development.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jp.co.dh.development.entity.EventAttendanceNames._EventAttendanceNames;
import jp.co.dh.development.entity.InputStatusManagementNames._InputStatusManagementNames;

import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Member}のプロパティ名の集合です。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2016/04/18 21:01:14")
public class MemberNames {

    /**
     * memberIdのプロパティ名を返します。
     *
     * @return memberIdのプロパティ名
     */
    public static PropertyName<Long> memberId() {
        return new PropertyName<Long>("memberId");
    }

    /**
     * nickNameのプロパティ名を返します。
     *
     * @return nickNameのプロパティ名
     */
    public static PropertyName<String> nickName() {
        return new PropertyName<String>("nickName");
    }

    /**
     * sexのプロパティ名を返します。
     *
     * @return sexのプロパティ名
     */
    public static PropertyName<String> sex() {
        return new PropertyName<String>("sex");
    }

    /**
     * birthDateのプロパティ名を返します。
     *
     * @return birthDateのプロパティ名
     */
    public static PropertyName<Date> birthDate() {
        return new PropertyName<Date>("birthDate");
    }

    /**
     * mailAddressのプロパティ名を返します。
     *
     * @return mailAddressのプロパティ名
     */
    public static PropertyName<String> mailAddress() {
        return new PropertyName<String>("mailAddress");
    }

    /**
     * passwordのプロパティ名を返します。
     *
     * @return passwordのプロパティ名
     */
    public static PropertyName<String> password() {
        return new PropertyName<String>("password");
    }

    /**
     * entryDateのプロパティ名を返します。
     *
     * @return entryDateのプロパティ名
     */
    public static PropertyName<Timestamp> entryDate() {
        return new PropertyName<Timestamp>("entryDate");
    }

    /**
     * updateDateのプロパティ名を返します。
     *
     * @return updateDateのプロパティ名
     */
    public static PropertyName<Timestamp> updateDate() {
        return new PropertyName<Timestamp>("updateDate");
    }

    /**
     * lastLoginDateのプロパティ名を返します。
     *
     * @return lastLoginDateのプロパティ名
     */
    public static PropertyName<Timestamp> lastLoginDate() {
        return new PropertyName<Timestamp>("lastLoginDate");
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
    public static class _MemberNames extends PropertyName<Member> {

        /**
         * インスタンスを構築します。
         */
        public _MemberNames() {
        }

        /**
         * インスタンスを構築します。
         *
         * @param name
         *            名前
         */
        public _MemberNames(final String name) {
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
        public _MemberNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * nickNameのプロパティ名を返します。
         *
         * @return nickNameのプロパティ名
         */
        public PropertyName<String> nickName() {
            return new PropertyName<String>(this, "nickName");
        }

        /**
         * sexのプロパティ名を返します。
         *
         * @return sexのプロパティ名
         */
        public PropertyName<String> sex() {
            return new PropertyName<String>(this, "sex");
        }

        /**
         * birthDateのプロパティ名を返します。
         *
         * @return birthDateのプロパティ名
         */
        public PropertyName<Date> birthDate() {
            return new PropertyName<Date>(this, "birthDate");
        }

        /**
         * mailAddressのプロパティ名を返します。
         *
         * @return mailAddressのプロパティ名
         */
        public PropertyName<String> mailAddress() {
            return new PropertyName<String>(this, "mailAddress");
        }

        /**
         * passwordのプロパティ名を返します。
         *
         * @return passwordのプロパティ名
         */
        public PropertyName<String> password() {
            return new PropertyName<String>(this, "password");
        }

        /**
         * entryDateのプロパティ名を返します。
         *
         * @return entryDateのプロパティ名
         */
        public PropertyName<Timestamp> entryDate() {
            return new PropertyName<Timestamp>(this, "entryDate");
        }

        /**
         * updateDateのプロパティ名を返します。
         *
         * @return updateDateのプロパティ名
         */
        public PropertyName<Timestamp> updateDate() {
            return new PropertyName<Timestamp>(this, "updateDate");
        }

        /**
         * lastLoginDateのプロパティ名を返します。
         *
         * @return lastLoginDateのプロパティ名
         */
        public PropertyName<Timestamp> lastLoginDate() {
            return new PropertyName<Timestamp>(this, "lastLoginDate");
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
         * inputStatusManagementListのプロパティ名を返します。
         *
         * @return inputStatusManagementListのプロパティ名
         */
        public _InputStatusManagementNames inputStatusManagementList() {
            return new _InputStatusManagementNames(this, "inputStatusManagementList");
        }
    }
}