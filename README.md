# 연습문제 MyBatis

### 1. View 생성
- 상품등록 페이지
- 상품목록 페이지 (html table 사용)
- 상품상세보기 페이지 (삭제, 수정)
- 상품수정 페이지

### 2. 기능 (ajax 필요 없음) (서비스 만들 필요 없음)
- 상품 등록(post - form태그)  주소 : /product/add
- 상품 목록보기(get) 주소 : /product
- 상품 상세보기(get) 주소 : /product/{id}
- 상품 삭제하기(post - form태그) : /product/{id}/delete
- 상품 수정하기(post - form태그) : /product/{id}/edit

## 3. 고급 기능
- 상품 등록시 동일한 상품명 못들어가게 하기

### 4. 테이블 생성
```sql
create table product(
    product_id int primary KEY auto_increment,
    product_name varchar(20) NOT null UNIQUE,
    product_price INT NOT null,
    product_qty INT NOT null,
    created_at TIMESTAMP NOT null
);
```

### 5. 더미데이터
```sql
INSERT INTO product(product_name, product_price, product_qty, created_at) VALUES('바나나', 3000, 98, NOW());
INSERT INTO product(product_name, product_price, product_qty, created_at) VALUES('딸기', 2000, 100, NOW());
```

### 6. 페이지
상품 목록보기 페이지


<img src="https://user-images.githubusercontent.com/106166409/198586568-1b62571c-8a2d-4965-aaf8-9410159da57d.png"  width="1000"/>


상품 상세보기 페이지



<img src="https://user-images.githubusercontent.com/106166409/198585831-0e5d34dd-82a0-4aa2-b00a-be8fb11c76b5.png"  width="1000"/>

상품 등록하기 페이지


<img src="https://user-images.githubusercontent.com/106166409/198586891-2e1bea4b-d698-4b3e-becd-5e5e95a8f422.png"  width="1000"/>

상품 수정하기 페이지



<img src="https://user-images.githubusercontent.com/106166409/198585977-6595bfe6-5e6b-4e08-b949-d5ca496a3ff8.png"  width="1000"/>


상품등록 유효성 검사


<img src="https://user-images.githubusercontent.com/106166409/198591059-7627beb8-4392-49ff-b786-c238841c031d.gif"  width="1000"/>







