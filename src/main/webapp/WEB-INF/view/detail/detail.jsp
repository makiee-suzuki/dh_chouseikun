<jsp:include page="../common/header.jsp" />
<title>イベント名 | 詳細</title>
</head>
<body>

<h1>${f:h(eventName)}</h1>

<table>
	<tr>
		<td>日程</td>
		<td>◯</td>
		<td>△</td>
		<td>×️</td>
		<td>${f:h(nickName)}</td>
	</tr>
	<tr>
		<td>${f:h(schedule)}</td>
		<td>3人</td>
		<td>0人</td>
		<td>1人</td>
		<td>${f:h(attendance_division)}</td>
	</tr>
</table>


<s:form><input type="button" value="出欠を入力する">
</s:form>

</body>
<jsp:include page="../common/footer.jsp" />