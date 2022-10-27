<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="layout/header.jsp"%>
<div class="container">
	<form action="/product/add" method="post">
		<div class="mb-3 mt-3">
			상품명 : <input id="name" name="productName" type="text" placeholder="상품명을 적어주세요">
		</div>
		<div class="mb-3 mt-3">
			상품가격 : <input id="price" name="productPrice" type="text" placeholder="상품 가격을 적어주세요">
		</div>
		<div class="mb-3 mt-3">
			상품수량 : <input id="qty"name="productQty"  type="text" placeholder="상품 수량을 적어주세요">
		</div>
		<button type="submit" class="btn btn-primary">상품등록완료</button>
		
	</form>
</div>

<%@ include file="layout/footer.jsp"%>