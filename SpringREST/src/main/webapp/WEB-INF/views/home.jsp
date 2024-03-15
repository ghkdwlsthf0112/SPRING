<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/resources/js/home.js" var="homeJS"/>
<c:url value="/resources/js/quiz.js" var="quizJS"/>
<html>
<head>
	<title>Home</title>
</head>
<body>
	
	<h1>Home!</h1>
	
	<h3>
		Quiz 추첨 버튼을 누르면 랜덤으로 10명의 사원을 골라와서 화면에 출력해주는 
		기능을 만들어보세요 (JSON버전과 XML버전으로 한번씩)
	</h3>
	
	<div id="out"></div>
	
	<div id="employees" style="display:grid; grid-template-columns: 1fr 1fr 1fr"></div>
	
	<button id="btn1">버튼1</button>
	<button id="btn2">버튼2(JSON)</button>
	<button id="btn3">버튼3(XML)</button>
	
	<script src="${homeJS}"></script>
	
	<button id="btn1">추첨1(JSON)</button>
	<button id="btn2">추첨2(XML)</button>
	
	<script scr="${quizJS}"></script>
</body>
</html>
