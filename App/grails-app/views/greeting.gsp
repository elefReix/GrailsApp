<!DOCTYPE html>
<html>
	<head>
		<title><g:if env="development">GSP Greeting</g:if></title>
		<meta name="layout" content="main">
		<g:if env="development"><asset:stylesheet src="errors.css"/></g:if>
	</head>
	<body>
		<h1>Hello user</h1>
	</body>
</html>