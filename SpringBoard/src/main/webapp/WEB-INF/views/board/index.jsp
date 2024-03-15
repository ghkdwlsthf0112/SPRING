<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 인덱스</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>No</th>
			<th>Title</th>
			<th>Writer</th>
			<th>Timestamp</th>
			<th>View</th>
		</tr>
		
	<c:forEach items="${boards}" var="board">
		<tr>
			<td>${board.board_id}</td>
			<td>${board.board_title}</a></td>
			<td>${board.board_writer}</td>
			<td>${board.write_date}</td>
			<td>${board.view_count}</td>
		</tr>
	
	</c:forEach>
	</table>

</body>
</html>