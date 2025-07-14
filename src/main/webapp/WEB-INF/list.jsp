<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>주소록</h1>
		
		<h2>전화번호 리스트</h2>
		<p>전화번호 리스트 입니다.</p>

		
		<c:forEach items="${requestScope.pList.phonebookList}" var="phonebookvo">
			<table border="1">
				<tbody>
					<tr>
						<td>이름(name)</td>
						<td>
							${phonebookvo.name}
						</td>
					<tr>
					<tr>
						<td>핸드폰(hp)</td>
						<td>${phonebookvo.hp}</td>
					<tr>
					<tr>
						<td>회사(company)</td>
						<td>${phonebookvo.company}</td>
					<tr>		
				</tbody>
			</table>  
			<br>
		
		</c:forEach>
	
	</body>
</html>