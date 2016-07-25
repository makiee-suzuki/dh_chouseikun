/* 会員テーブル */
CREATE TABLE chouseikun.member (
	`member_id`			INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
	`nick_name`			VARCHAR(20),
	`sex` 				VARCHAR(2),
	`birth_date`		DATE,
	`mail_address`		VARCHAR(100) NOT NULL,
	`password`			VARCHAR(100) NOT NULL,
	`entry_date`		DATETIME,
	`update_date`		DATETIME,
	`last_login_date`	DATETIME,
	PRIMARY KEY (member_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/* イベントテーブル */
CREATE TABLE chouseikun.event (
	`event_id`			INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
	`event_name`		VARCHAR(100),
	`content` 			TEXT,
	`entry_member_id`	INT(10),
	`entry_datetime`	DATETIME,
	`update_member_id`	INT(10),
	`update_datetime`	DATETIME,
	PRIMARY KEY (event_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/* 入力状況管理テーブル */
CREATE TABLE chouseikun.input_status_management (
	`input_status_management_id`	INT(10) UNSIGNED NOT NULL,
	`event_id`						INT(10) UNSIGNED NOT NULL,
	`member_id`						INT(10) UNSIGNED NOT NULL,
	`inputted_flag`					BOOLEAN DEFAULT false,
	`entry_datetime`				DATETIME,
	`update_datetime`				DATETIME,
	PRIMARY KEY (input_status_management_id),
	FOREIGN KEY FK_status_mg_event_id (event_id) REFERENCES chouseikun.event(event_id),
	FOREIGN KEY FK_status_mg_member_id (member_id) REFERENCES chouseikun.member(member_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/* イベント詳細テーブル */
CREATE TABLE chouseikun.event_detail (
	`event_detail_id`	INT(10) UNSIGNED NOT NULL,
	`schedule`			DATE,
	`event_id`			INT(10) UNSIGNED NOT NULL,
	`entry_member_id`	INT(10),
	`entry_datetime`	DATETIME,
	`update_member_id`	INT(10),
	`update_datetime`	DATETIME,
	PRIMARY KEY (event_detail_id),
	FOREIGN KEY FK_detail_event_id (event_id) REFERENCES chouseikun.event(event_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/* イベント出欠テーブル */
CREATE TABLE chouseikun.event_attendance (
	`event_attendance_id`	INT(10) UNSIGNED NOT NULL,
	`event_detail_id`		INT(10) UNSIGNED NOT NULL,
	`member_id`				INT(10) UNSIGNED NOT NULL,
	`attendance_division`	VARCHAR(2),
	`comment`				VARCHAR(100),
	`entry_datetime`		DATETIME,
	`update_datetime`		DATETIME,
	PRIMARY KEY (event_attendance_id),
	FOREIGN KEY FK_attendance_detail_id (event_detail_id) REFERENCES chouseikun.event_detail(event_detail_id),
	FOREIGN KEY FK_attendance_member_id (member_id) REFERENCES chouseikun.member(member_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
