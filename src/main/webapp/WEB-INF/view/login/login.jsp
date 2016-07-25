<jsp:include page="../common/header.jsp" />
<title>調整くん | ログイン</title>
</head>
<body>


<h1>ログイン画面</h1>

<html:errors />

<s:form method="POST">

email: <html:text property="email" /> <br/>
password: <html:password property="password" /> <br/>
<s:submit property="login" value="ログイン" />

</s:form>

</body>
<jsp:include page="../common/footer.jsp" />