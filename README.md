# commerce_project 🛍️

 [회원가입과 로그인]

- 회원가입
     - 회원가입은 사용자, 판매자 유형으로 나누어 가입이 가능하다. 
    - 회원가입시 이메일, 이름, 생년월일, 비밀번호, 성별 정보가 필요하다 (사용자, 판매자 공통)
    - 회원가입시 이미 회원가입된 이메일과 이름으로 회원가입을 시도하면 에러를 발생한다 (사용자, 판매자 공통)
    - 
- 로그인
    - 로그인시 회원가입한적 없는 이메일을 이용하여 로그인을 시도하면 에러가 발생한다 (사용자, 판매자, 관리자 공통)
    - 로그인시 비밀번호가 일치하지 않는다면 에러가 발생한다. (사용자, 판매자, 관리자 공통)

- 판매자 로그인
    - 판매자 로그인 시 본인의 상점을 등록 (판매자1명당 1개의 상점 등록 가능 )
    - 관리자가 상점 등록을 수락해야 판매자가 판매자의 상점에 상품을 추가 등록, 삭제 할 수 있다

- 관리자 로그인
     - 관리자 로그인 시 판매자들의 상점등록 수락 또는 거절할 수 있습니다.

[상품명 검색 기능]

- 상품 검색
    - 상품 검색은 로그인 여부와 관계없이 진행할 수 있습니다.
- 상품 상세 조회
    - 상품 상세 조회 시 상품명, 가격,  제조사등 상품에 대한 정보를 확인할 수 있습니다.

[상품 장바구니 기능]

- 상품 담기
    로그인 된 회원은 상품을 장바구니에 담을 수 있습니다.
- 장바구니 목록
    로그인 된 회원은 본인 장바구니를 조회할 수 있습니다.
- 장바구니 삭제
    로그인 된 회원은 장바구니 목록을 삭제 할 수 있습니다.


[ERD]

![image](https://github.com/k1mda/project_3/assets/148675403/2d2bf381-1a78-472e-9ce7-ec6854d34093)


[기술스택]

spring boot
maria db




