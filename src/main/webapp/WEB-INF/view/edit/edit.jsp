<jsp:include page="../common/header.jsp" />
<title>調整くん | 変更</title>
</head>
<body>

<h1>変更</h1>

<s:form>
	<table>
		<tr>
			<th>STEP1　イベント名</th>
			<td>${f:h(eventName)}</td>
		</tr>
		<tr>
			<th>メモ</th>
			<td>${f:h(content)}</td>
		</tr>
		<tr>
			<th>STEP2　候補日程</th>
			<td>${f:h(schedule)}</td>
		</tr>

		<tr>
			<td><input type="button" value="変更する"></td>
		</tr>
	</table>
</s:form>

</body>
<jsp:include page="../common/footer.jsp" />