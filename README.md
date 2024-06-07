각 엔티티별로 DTO가 com.example.demo.dto에 정의되어 있다.

메소드의 사용은 Test 파일에서 볼 수 있다.
각 메소드는 Mapper 인터페이스에 정의되어 있고
구현은 Mapper.xml에 되어 맵핑된다.

{테이블명}Insert는 테이블에 레코드를 삽입한다.
매개 변수로 각 테이블에 해당하는 DTO를 받으며 이를 기반으로 레코드가 생성된다.

{테이블명}Select는 테이블의 모든 레코드를 검색한다.
내부의 sql문은 select * from {테이블명} 형태이다.
반환형은 List<DTO>이다.
DTO List로 반환받기 위해 Mapper.xml 파일마다 resultMap을 작성하여 DTO의 각 필드와 DB의 컬럼을 맵핑시켜 놓았다.
여기에 오류가 없는지는 인스펙션이 필요하다.
이름이 같다고 하더라도 Camel Case와 snake_case가 다르게 적용되어 그냥 넣어서는 맵핑되지 않는다.

또한 ERWin을 이용하여 그렸을 때와 실제 구현에서 달라진 점은
 - 마일리지의 도메인을 VARCHAR2로 잘못 썼다. 이를 NUMBER로 수정하였다.
 - MEMBERSHIP 테이블의 전화번호 컬럼의 이름이 MEMBERTHIP... 이었다. 이를 교체했다.
 - 진열상품의 자기참조 컬럼인 증정품 컬럼이 logical diagram 상에서는 존재하지만 physical diagram 상에서는 따로 이를 설정해주지 않아 소실되었다. 이를 추가해주었다.
