# Calculator (JUnit4) - calc-junit4

간단한 정수 사칙연산 컴포넌트를 구현하고 JUnit4로 컴포넌트 테스트를 작성했습니다.

## 환경
- JDK 17.0.16
- Maven
- JUnit 4.13.2
- VSCode (Extension Pack for Java, Test Runner for Java)

## 프로젝트 구조
- `src/main/java/com/example/calc/Calculator.java`
- `src/test/java/com/example/calc/CalculatorComponentTest.java`

## 빌드 & 테스트 방법

### 1) Maven 명령어
```bash
mvn -v                # Maven 설치 확인
mvn clean test        # 전체 테스트 실행
mvn -Dtest=CalculatorComponentTest test # 특정 테스트만 실행

