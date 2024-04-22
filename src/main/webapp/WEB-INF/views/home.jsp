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
		<h1 class="h3 m-3 text-gray-800 text-center">메인페이지</h1>
		<!-- DataTales Example -->
		<div class="card shadow mb-4 text-center">
<!-- 
			<div class="card-header py-3">
				<h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>
			</div>
 -->
			<div class="card-body">
				<div class="table-responsive">
					<table class="table table-bordered " id="dataTable" width="100%" cellspacing="0">
						<thead>
							<tr>
								<th>No</th>
								<th>사원번호</th>
								<th>사원명</th>
								<th>급여</th>
								<th>부서번호</th>
								<th>부서명</th>
								<th>삭제</th>
							</tr>
						</thead>

						<tbody>
							<c:forEach var="dept" items="${deptEmps}">
								<c:forEach var="emp" items="${dept.empList}">
									<c:set var="no" value="${no + 1}"></c:set>
									<tr>
										<td align="center">${no}</td>
										<td align="center">${emp.empno}</td>
										<td>
											<a href="${pageContext.request.contextPath}/emp/emp_view?empno=${emp.empno}">${emp.ename}</a>
										</td>
										<td align="right">
											<fmt:setLocale value="en_us" />
											<fmt:formatNumber value="${emp.sal}" type="currency" />
										</td>
										<td align="center">${dept.deptno}</td>
										<td>${dept.dname}</td>
			                            <td>
			                            	<button class="btn btn-secondary btn-sm"><a class="nav-link active" href="${pageContext.request.contextPath}/emp/delete?empno=${emp.empno}" method="POST">삭제</a></button>
			                            </td>
									</tr>
								</c:forEach>
							</c:forEach>
						</tbody>
					</table>
					<td>
						<button class="btn btn-outline-primary" style="--bs-btn-font-size: .70rem;"><a class="nav-link active" href="${pageContext.request.contextPath}/emp/write_view">사원등록</a></button>
					</td>
				</div>
			</div>
		</div>
	</div>

<!-- 페이징  -->
<%-- 
	<nav class="mt-3" aria-label="Page navigation example">
		<ul class="pagination justify-content-center">
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
 --%>
</body>
</html>