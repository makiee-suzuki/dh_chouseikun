<jsp:include page="../common/header.jsp" />
<title>イベントリスト</title>
</head>
<body>
<h1>調整くん</h1>
	<s:form>
		<h2>${f:h(nickName)}のイベント一覧</h2>
			<h3>■入力済み一覧</h3>
				<table class="table5" border=1>
 					<tr><th>イベント名</th><th>日程</th><th>候補日</th></tr>
					<tr><td><a href="">${f:h(eventName)}</a></td><td>12/01〜12/10</td><td>${f:h(schedule)}</td></tr>		
				</table>

		<h3>■未入力一覧</h3>
			<table class="table5" border=1>
 				<tr><th>イベント名</th><th>日程</th><th>候補日</th></tr>
				<tr><td><a href="">${f:h(eventName)}</a></td><td>12/01〜12/10</td><td>${f:h(schedule)}</td></tr>
			</table>
		</s:form>
</body>
<jsp:include page="../common/footer.jsp" />