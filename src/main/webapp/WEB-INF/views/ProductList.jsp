<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp"%>

<div class="container">
	<table class="table table-striped">
		<thead>
			<tr>
				<th>상품명</th>
				<th>상품가격</th>
				<th>상품수량</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="findAll" items="${findAll}">
				<tr>
					<td>${findAll.productName}</td>
					<td>${findAll.productPrice}</a></td>
					<td>${findAll.productQty}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
</div>

<%@ include file="layout/footer.jsp"%>
