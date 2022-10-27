<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp"%>
<div class="container">
	<form action="/product/add" method="post">
		<div class="mb-3 mt-3">상품명 : ${detail.productName}</div>
		<div class="mb-3 mt-3">상품가격 :</div>
		<div class="mb-3 mt-3">상품수량 :</div>

	</form>
</div>
<%@ include file="layout/footer.jsp"%>
