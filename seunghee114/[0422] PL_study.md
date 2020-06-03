Syntax와 Semantics
Syntax (구문) : 프로그래밍 언어의 겉모습. 프로그래밍 언어마다 다르다.

 

Syntax의 표현 방법

BNF(Backus-Naur Form)

- 프로그래밍 언어의 Syntax를 표현하기 위한 표기법

- 규칙의 집합으로 표현.

- 형식 : 새로운 단어 -> 설명  이때 새로운 단어 부분의 Symbol은 non-terminal symbol

                                      설명 부분의 Symbol은 terminal symbol, non-terminal symbol 둘 다 가능

- 다양한 변형이 존재. 

  1) non-terminal symbol을  <>로 묶어 구별하거나 대문자만으로 표시한다.

  2) -> 대신 ::=을 사용하기도 한다.

  3) ->의 왼쪽 non-terminal symbol이 동일한 규칙은 | 기호로 묶어서 나타낼 수 있다.

 

EBNF(Extended BNF)

- Syntax를 표현하기 위한 표기법

- 복잡해지고 표현이 잘 안되는 경우에 사용한다.

- BNF표기법에 다양한 매크로를 추가하여 편리하게 사용할 수 있도록 했다.

- 반복 {} : 0번 이상 반복 (BNF에서 반복은 recursion, EBNF에서 반복은 while, for)

- 옵션 [] : 한 번 나오거나 나오지 않음

- 선택 () : 여러 개에서 하나 선택.

 

Semantics(의미구조) : 프로그래밍 언어의 속뜻.

Static Semantics : 프로그램의 타입구조. 프로그램이 실제 수행될 때 이건 만족할거야! 라고 보장되는 것들                              ex) int a라고 선언했을 때 a는 Integer값만 받을 수 있다. -> 이런거가 Static Semantics

Dynamic Semantics : 프로그램의 실행적, 논리적, 수학적 의미. 실행할 때의 의미.

Compiler와 Interpreter
Compiler : 프로그램 전체를 읽어서 기계어 등으로 번역해놓고 수행한다.

 

Interpreter : 프로그램을 한 문장씩 읽어서 이해할 때마다 하나씩 수행한다. (짧은 주기로 시행)

 

"Compiler는 Interpreter와 달리 프로그램 전체를 이해할 수 있어 최적화가 가능하지만 절차가 더 무겁다"

 

Lexical Analysis와 Parsing
Lexical Analysis 어휘 분석

- 단어를 식별하는 작업. 이때 식별한 단어를 token이라고 한다.

- token은 의미를 유지하는 최소 단위

- ex) 영어 듣기

 

Parsing 파싱

- 어휘 분석 결과로 주어진 token열이 내포하는 문법적 구조를 알아내는 절차

- 결과로 Parsing Tree 생성

- 어휘분석보다 파싱이 더 복잡하다.

 

"어휘 분석과 파싱은 Compiler나 Interpreter가 Syntax를 이해하는 방법.

                                                                                 둘 다에게 필요한 Syntax와 관련된 작업들"

Derivation 유도
- 규칙에 의해 Symbol을 대치해나가는 것.

- 주어진 token열이 Syntax에 맞는지 확인하고 token의 역할을 파악하는 절차.

- Grammar의 최상위 non-terminal symbol로부터

  Grammar의 규칙들을 반복적으로 적용해서 terminal symbo을 만들어낸다.

  * 최상위 non-terminal symbol이란 더 이상 다른데서 안 쓰이는 non-terminal symbol

 

Parsing Tree
- Derivation 과정을 그림으로 표현한 것.

- 주어진 문장들의 Syntax 구조를 나타내는 Tree.

 

Abstract Syntax Tree 추상 구문 트리
- Parsing Tree에서 non-terminal symbol들을 제거하고 terminal symbol과 의미있는 node로만 이루어진 표현으로 간략하게 바꾼 것.

- 거추장스러운 Derivation 과정을 표현하지 않아서 문장 내부 구조를 표현하고 다루기 좋은 자료구조.

 

모호한 Grammar
- 주어진 문장에 대한 두 개 이상의 Parsing Tree가 가능한 경우가 모호한 Grammar

 

모호한 Grammar를 해결하는 방법

1) 우선순위를 추가하는 방법

2) 결합성을 추가하는 방법
