# kotlin-blackjack

## 1단계 - 코틀린 DSL
```
introduce {
  name("박재성")
  company("우아한형제들")
  skills {
    soft("A passion for problem solving")
    soft("Good communication skills")
    hard("Kotlin")
  }
  languages {
    "Korean" level 5
    "English" level 3
  }
}
```

## 2단계 - 블랙잭

### 기능 요구사항

블랙잭 게임을 변형한 프로그램을 구현한다. 블랙잭 게임은 딜러와 플레이어 중 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 이기는 게임이다.

- 카드의 숫자 계산은 카드 숫자를 기본으로 하며, 예외로 Ace는 1 또는 11로 계산할 수 있으며, King, Queen, Jack은 각각 10으로 계산한다.
- 게임을 시작하면 플레이어는 두 장의 카드를 지급 받으며, 두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서 21에 가깝게 만들면 이긴다. 21을 넘지 않을 경우 원한다면 얼마든지 카드를 계속 뽑을 수 있다.

### 기능 목록

- [x] 카드는 총 52 (A - K, 13장 x 4)장으로 구성된다.
  - [x] 카드는 모양과 숫자를 가진다.
  - [x] 모양은 스페이드, 다이아몬드, 하트 클로버로 구성된다.
  - [x] 숫자는 2 부터 9까지 존재한다
  - [x] King, Queen, Jack은 각각 10으로 계산한다
  - [x] Ace는 1 로 계산한다
  - [x] Ace는 11로 계산할 수 있다
- [x] 블랙잭 게임 시작시 플레이어들은 두장의 카드를 가진다.`
  - [x] 플레이어는 이름을 가진다.
  - [x] 플레이어는 핸드를 가진다.
  - [x] 플레이어는 카드를 뽑을 수 있다.
- [x] 게임 시작 후 플레이어와 딜러는 추가적으로 카드를 뽑을 수 있다
  - [x] 21이 넘지 않을 경우 계속 뽑을 수 있다

## 3단계 - 블랙잭(딜러)

### 기능 요구사항

블랙잭 게임을 변형한 프로그램을 구현한다. 블랙잭 게임은 딜러와 플레이어 중 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 이기는 게임이다.

- 카드의 숫자 계산은 카드 숫자를 기본으로 하며, 예외로 Ace는 1 또는 11로 계산할 수 있으며, King, Queen, Jack은 각각 10으로 계산한다.
- 게임을 시작하면 플레이어는 두 장의 카드를 지급 받으며, 두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서 21에 가깝게 만들면 이긴다. 21을 넘지 않을 경우 원한다면 얼마든지 카드를 계속 뽑을 수 있다.
- **딜러는 처음에 받은 2장의 합계가 16이하이면 반드시 1장의 카드를 추가로 받아야 하고, 17점 이상이면 추가로 받을 수 없다.**
- **딜러가 21을 초과하면 그 시점까지 남아 있던 플레이어들은 가지고 있는 패에 상관 없이 승리한다.**
- **게임을 완료한 후 각 플레이어별로 승패를 출력한다.**

### 프로그래밍 요구 사항

- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
- **모든 엔티티를 작게 유지한다.**
- **3개 이상의 인스턴스 변수를 가진 클래스를 쓰지 않는다.**
- **딜러와 플레이어에서 발생하는 중복 코드를 제거해야 한다.**
- 함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현한다.
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.\

### 힌트

- 상속을 활용해 중복을 제거해 본다.

### 기능 목록

- [x] 딜러를 추가한다.
  - [x] 딜러 또한 플레이어와 같이 블랙잭 게임 시작시 두장의 카드를 가진다.
  - [x] 딜러는 처음에 받은 두장의 합계가 16 이하면 1장의 카드를 추가로 받아야 한다.
  - [x] 딜러는 초기 카드 공개시 제일 처음 뽑은 한장만 공개한다.
- [x] 블랙잭 게임에서 전부 카드를 뽑은 뒤에는 승패를 출력한다.
  - [x] 두 장의 카드 합계가 21을 넘으면 패배한다.
  - [x] 딜러는 플레이어보다 카드 합계가 같거나 낮으면 패배한다.
  - [x] 플레이어는 딜러와의 승패를 출력한다.
  - [x] 딜러는 플레이어와 승패 통계를 출력한다.

## 4단계 - 블랙잭(베팅)

### 기능 요구사항

블랙잭 게임을 변형한 프로그램을 구현한다. 블랙잭 게임은 딜러와 플레이어 중 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 이기는 게임이다.

- **플레이어는 게임을 시작할 때 베팅 금액을 정해야 한다.**
- 카드의 숫자 계산은 카드 숫자를 기본으로 하며, 예외로 Ace는 1 또는 11로 계산할 수 있으며, King, Queen, Jack은 각각 10으로 계산한다.
- 게임을 시작하면 플레이어는 두 장의 카드를 지급 받으며, 두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서 21에 가깝게 만들면 이긴다. 21을 넘지 않을 경우 원한다면 얼마든지 카드를 계속 뽑을 수 있다.
  단, 카드를 추가로 뽑아 21을 초과할 경우 베팅 금액을 모두 잃게 된다.
- **처음 두 장의 카드 합이 21일 경우 블랙잭이 되면 베팅 금액의 1.5 배를 딜러에게 받는다. 딜러와 플레이어가 모두 동시에 블랙잭인 경우 플레이어는 베팅한 금액을 돌려받는다.**
- 딜러는 처음에 받은 2장의 합계가 16이하이면 반드시 1장의 카드를 추가로 받아야 하고, 17점 이상이면 추가로 받을 수 없다.
- 딜러가 21을 초과하면 그 시점까지 남아 있던 플레이어들은 가지고 있는 패에 상관 없이 승리해 **베팅 금액을 받는다.**

### 구현사항

- [ ] 베팅 금액을 함께 받는다.
  - [ ] 블랙잭이면 베팅금액의 1.5배를 딜러에게 받는다.
  - [ ] 딜러와 플레이어 동시에 블랙잭이면 베팅금액을 돌려받는다.
  - [ ] 딜러가 21을 초과하면 플레이어는 패에 상관없이 베팅 금액을 받는다.
