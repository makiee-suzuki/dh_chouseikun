<jsp:include page="../common/header.jsp" />
<title>調整くん | 新規追加</title>
</head>
<body>

<h1>新規追加</h1>

<s:form>
	<table>
		<tr>
			<th>STEP1　イベント名</th>
			<td><input type="text" name="event_name"></td>
		</tr>
		<tr>
			<th>メモ</th>
			<td><textarea cols="30" rows="5" name="memo"></textarea></td>
		</tr>
		<tr>
			<th>STEP2　候補日程</th>
			<td><textarea cols="30" rows="5" name="candidate_date"></textarea></td>
		</tr>

		<tr>
			<td><input type="button" value="出欠表をつくる"></td>
		</tr>
	</table>
</s:form>

</body>
<jsp:include page="../common/footer.jsp" />