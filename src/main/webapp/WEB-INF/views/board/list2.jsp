<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body">
	<h3>리스트</h3>
   <table cellpadding="0" cellspacing="0" border="1">
      <tr align="center">
         <td width="50">번호</td>
         <td width="60">이름</td>
         <td width="150">제목</td>
         <td width="180">날짜</td>
         <td width="50">히트</td>
         <td>삭제</td>            
      </tr>
      <c:forEach var="board" items="${boards}">
         <tr>
            <td align="center">${board.bid}</td>
            <td align="center">${board.bname}</td>
            <td>
            	<c:forEach begin="1" end="${board.bindent}">[re]</c:forEach>
	            <a href="${pageContext.request.contextPath}/board/content_view?bid=${board.bid}">${board.btitle}</a>
            </td>
            <td align="center">${board.bdate}</td>
<%-- 			<td align="center"><fmt:formatDate pattern="yyyy-MM-dd" value="${board.bdate}" /></td> --%>
            <td align="center">${board.bhit}</td>
            <td>
               <a href="${pageContext.request.contextPath}/board/delete?bid=${board.bid}"><button type="button">삭제</button></a>
            </td>
         </tr>
      </c:forEach>
      <tr>
         <td colspan="5">&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/board/write_view">글작성</a></td>
      </tr>  
   </table>
   
	<c:if test="${pageMaker.prev}">
		<a href="list2${pageMaker.makeQuery(pageMaker.startPage - 1)}"> << </a>
	</c:if>

	<c:forEach var="idx" begin="${pageMaker.startPage}" end="${pageMaker.endPage}" >
		<a href="list2${pageMaker.makeQuery(idx)}">${idx}</a>
	</c:forEach>
	
	<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
		<a href="list2${pageMaker.makeQuery(pageMaker.endPage + 1)}"> >> </a>
	</c:if>
   
</body>
</html>