/* スキーマ作成 */
CREATE DATABASE chouseikun DEFAULT CHARACTER SET utf8;

/* アプリ用ユーザー作成 */
CREATE USER 'dh_user'@'localhost' identified by 'dhdesuWA';

/* アプリ用ユーザーに権限付与 */
GRANT ALL ON chouseikun.* TO 'dh_user'@'localhost';