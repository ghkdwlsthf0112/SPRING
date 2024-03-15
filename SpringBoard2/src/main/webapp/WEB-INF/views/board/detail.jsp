<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>${board.board_id}번 글 내용</h3>
	
	<table border="3">
		<tr>
			<th>글 번호</th>
			<td>${board.board_id}</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${board.view_count}</td>
		</tr>
		<tr>
			<th>글 제목</th>
			<td>${board.board_title}</td>
		</tr>
		<tr>
			<th>글쓴이</th>
			<td>${board.board_writer}</td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><input type="password"></td>
		</tr>
		<tr>
			<th>글 내용</th>
			<td><textarea>${board.board_content}</textarea></td>
		</tr>
		<tr>
			<th>작성일</th>
			<td>${board.write_date}</td>
		</tr>
		<tr>
			<th>최근 수정일</th>
			<td>??</td>
		</tr>
		<tr>
			<th>첨부파일</th>
			<td><input type="file"></td>
		</tr>
		
	</table>

</body>
</html>