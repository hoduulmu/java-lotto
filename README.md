# 로또

## 진행 방법

* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH 한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정

* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 문자열 사칙 연산 계산기 구현 미션

### 기능 요구사항

- [X] 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
- [X] 입력 문자열의 숫자와 사칙 연산 사이에는 반드시 빈 공백 문자열이 있다고 가정한다.
- [X] 나눗셈의 경우 결과 값을 정수로 떨어지는 값으로 한정한다.
- [X] 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
- [X] 예를 들어 2 + 3 * 4 / 2와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.

### 프로그래밍 요구사항

- [X] 모든 기능을 TDD 로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
- [X] java enum 을 적용해 프로그래밍을 구현한다.
- [X] 규칙 8: 일급 콜렉션을 쓴다.
- [X] indent(인덴트, 들여쓰기) depth 를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
- [X] 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
- [X] 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- [X] else 예약어를 쓰지 않는다.

## 로또 (자동) 구현 미션

### 기능 요구사항

- [X] 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- [X] 로또 1장의 가격은 1000원이다.

### 프로그래밍 요구사항

- [X] 모든 기능을 TDD 로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
    - [X] 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
    - [X] UI 로직을 InputView, ResultView 와 같은 클래스를 추가해 분리한다.
- [X] indent(인덴트, 들여쓰기) depth 를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
    - [X] 예를 들어 while 문 안에 if 문이 있으면 들여쓰기는 2이다.
    - [X] 힌트: indent(인덴트, 들여쓰기) depth 를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- [X] 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
    - [X] 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.
- [X] 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
    - [X] 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
    - [X] UI 로직을 InputView, ResultView 와 같은 클래스를 추가해 분리한다.
- [X] 자바 코드 컨벤션을 지키면서 프로그래밍한다.
    - [X] 참고문서: https://google.github.io/styleguide/javaguide.html 또는 https://myeonguni.tistory.com/1596
- [X] else 예약어를 쓰지 않는다.
    - [X] 힌트: if 조건절에서 값을 return 하는 방식으로 구현하면 else 를 사용하지 않아도 된다.
    - [X] else 를 쓰지 말라고 하니 switch/case 로 구현하는 경우가 있는데 switch/case 도 허용하지 않는다.

### 기능 목록 및 Commit 로그 요구사항

- [X] 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- [X] git 의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.