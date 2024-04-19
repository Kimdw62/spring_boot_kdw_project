<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Insert title here</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script> 
</head>
<body>

<!-- Begin Page Content -->
	<div class="container">
		<!-- Page Heading -->
		<h1 class="h3 mb-2 text-gray-800">리스트</h1>
		<!-- DataTales Example -->
		<div class="card shadow mb-4 text-center">
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>
			</div>
			<div class="card-body">
				<div class="table-responsive">
                     <table class="table table-bordered " id="dataTable" width="100%" cellspacing="0">
                        <thead>
                             <tr>
                                 <th>후보번호</th>
                                 <th>성명</th>
                                 <th>소속정당</th>
                                 <th>학력</th>
                                 <th>주민번호</th>
                                 <th>지역구</th>
                                 <th>대표전화</th>
                                 <th>삭제</th>
                             </tr>
                        </thead>

						<tbody>
		                     <c:forEach var="member" items="${member}">
		                         <tr>
		                            <td>${member.m_no}</td>
<%-- 		                            <td>${member.m_name}</td> --%>
		                            <td>
	                                  <a href="${pageContext.request.contextPath}/member/member_view.do?m_no=${member.m_no}" method="POST">${member.m_name}</a>
		                            </td>
 		                            <td>${member.p_name}</td>
		                            <td>${member.t_school}</td>
		                            <td>${member.m_jumin}</td>
		                            <td>${member.m_city}</td>
		                            <td>${member.p_tel}</td>
		                            <td>
		                            	<button class="btn btn-success"><a class="nav-link active" href="${pageContext.request.contextPath}/member/member_delete.do?m_no=${member.m_no}" method="POST">삭제</a></button>
		                            </td>
		                         </tr>
		                      </c:forEach>
						</tbody>
                     </table>

				</div>
			</div>
		</div>
	</div>



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
<%-- 		<td align="center"><fmt:formatDate pattern="yyyy-MM-dd" value="${board.bdate}" /></td> --%>
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




<%--
	<c:if test="${pageMaker.prev}">
		<a href="list2${pageMaker.makeQuery(pageMaker.startPage - 1)}"> << </a>
	</c:if>
	<c:forEach var="idx" begin="${pageMaker.startPage}" end="${pageMaker.endPage}" >
		<a href="list2${pageMaker.makeQuery(idx)}">${idx}</a>
	</c:forEach>
	<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
		<a href="list2${pageMaker.makeQuery(pageMaker.endPage + 1)}"> >> </a>
	</c:if>
 --%>
	<nav class="mt-3" aria-label="Page navigation example">
		<ul class="pagination">
			<li class="page-item">
				<c:if test="${pageMaker.prev}">
					<a class="page-link" href="list2${pageMaker.makeQuery(pageMaker.startPage - 1)}">Prev</a>
				</c:if>
			</li>
			<c:forEach var="idx" begin="${pageMaker.startPage}" end="${pageMaker.endPage}" >
				<li class="page-item">
					<a class="page-link" href="list2${pageMaker.makeQuery(idx)}">${idx}</a>
				</li>
			</c:forEach>
			<li class="page-item">
				<c:if test="${pageMaker.next && pageMaker.endPage > 0}">
					<a class="page-link" href="list2${pageMaker.makeQuery(pageMaker.endPage + 1)}">Next</a>
				</c:if>
			</li>
		</ul>
	</nav>
   
</body>
</html>