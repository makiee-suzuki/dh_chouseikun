<jsp:include page="common/header.jsp" />
<html>
<head>
<title>DH調整ちゃんのメンバーになる♪</title>
</head>
<body>
<h1>DH調整ちゃんのメンバーになる♪</h1>
	<f:view>
		<table>
			<tr>
				<th>ニックネーム</th>
			</tr>
			<tr>
				<th><span>2文字～12文字以内</span></th>
				<td><input maxlength="12" value="" size="12" type="text" name="nickname" id="user_nickname" /></td>
			</tr>
			<tr>
				<th><label>性別</label></th>
				<td><html:radio property="sex" value="01"/>男 &nbsp; <html:radio property="sex" value="02"/>女</td>
			</tr>
			<tr>
				<th>生年月日</th>
				<td><input value="" type="text" name="birthDate" id="birthDate" /></td>
			</tr>
			<tr>
				<th>メールアドレス</th>
				<td><input value="" type="text" name="mailAddress" id="mailAddress" /></td>
			</tr>
			<tr>
				<th>パスワード<br /><span>8文字以上</span></th>
				<td><input type="password" name="password" id="password" /></td>
			</tr>
			<tr>
				<th>パスワード（確認）</th>
				<td><input type="password" name="passwordConfirm" id="password" /></td>
			</tr>
		</table>
			<input type="submit" name="commit" value="同意して確認画面へ進む" title="同意して確認画面へ進む"/>
			</f:view>
</body>
</html>
<jsp:include page="common/footer.jsp" />
