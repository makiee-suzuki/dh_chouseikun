<jsp:include page="../common/header.jsp" />
<title>調整くん | マイページ</title>
</head>
<body>

<h1>マイページ</h1>
<s:form>
	<table>
		<tr>
			<th>ニックネーム</th>
			<td>${f:h(nickName)}</td>
		</tr>
		<tr>
			<th>性別</th>
			<td><html:radio property="sex" value="01"/>男 &nbsp; <html:radio property="sex" value="02"/>女</td>
		</tr>
		<tr>
			<th>生年月日</th>
			<td><input type="date" value="${f:h(birthDate)}"></td>
		</tr>
		<tr>
			<th>メールアドレス</th>
			<td><html:text property="mailAddress" value="${f:h(mailAddress)}"/></td>
		</tr>
		<tr>
			<th>新しいパスワード</th>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<th>新しいパスワード(確認用)</th>
			<td><input type="password" name="passwordConfirm"></td>
		</tr>
	</table>
</s:form>

</body>
<jsp:include page="../common/footer.jsp" />