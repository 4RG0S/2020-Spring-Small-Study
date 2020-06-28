"프로그래밍언어개론" 3주차 복습
지금 듣고있는 전공 과목인 "프로그래밍언어개론" 3주차 소소한 복습!

 

Binding
개체에 속성을 맺어주는 것.

 

1. 변수 Binding : 변수에 변수와 관련된 속성을 맺어주는 것.

2. 연산자 Binding : 기호에 연산의 의미를 맺어주는 것.

 

Binding Time
Binding이 이루어지는 시점은 Binding되는 속성에 따라 다르다.

Static Binding

1. 프로그래밍 언어를 설계할 때

- 연산자 Binding 기호 - 연산 = '+' - 더하기

2. 프로그래밍 언어를 구현할 때

- 정수형 값의 범위 16bit/32bit

3. 프로그램을 Compile할 때

- C의 경우 변수의 Type.

4. 프로그램을 메모리에 load할 때

- C의 경우 Static 변수, 전역변수의 주소

 

Dynamic Binding

5. 프로그램을 실행할 때

- C의 경우 Static이 아닌 지역변수의 주소

- 부 프로그램의 Parameter 주소

- 동적으로 할당된 기억장소의 주소

 

Static Binding	Dynamic Binding
- 최초의 Binding이 프로그램 실행하기 전에 이루어진다.

- 한번 Binding이 이루어진 속성은 프로그램이 종료될 때까지 변하지 않는다.

- 최초의 Binding이 프로그램 실행하는 동안 이루어진다.

- 한번 Binding이 이루어진 속성이 프로그램 실행 과정에서 다시 발생하는 Binding에 의해 다른 속성으로 변할 수 있다.

 
변수의 Type Binding
Type이 지정되는 방법

- 명시적 선언 : 변수의 Type을 지정하는 선언문에 의해 Type이 지정된다.

- 묵시적 선언 : 언어 설계시 정의된 규칙에 의해 변수의 Type이 지정된다.

                    프로그램에서 변수가 처음 나타나는 지점에서 Type이 지정된다.

                    Writability 향상, Reliability 하락.

- 값의 배정 : 값의 Type에 따라 변수의 Type이 지정된다.

- Type Inference : 변수가 사용된 환경을 보고 추측. 주로 함수형 언어에서 적용된다.

 

Static Binding 

- Compiler 언어에서 Compile할 때 명시적 or 묵시적 선언 방법에 의해 Type이 지정된다.

 

Dynamic Binding

- Interpreter 언어에서 실행할 때 값의 배정방법에 의해 Type이 지정된다.

- 장점 : 유연성 향상, Generic subprogram 작성 가능

- 단점 : 프로그램 실행 비용 증가, Type 오류 발견 어려움.

 

기억장소 Binding
변수에 기억장소를 할당하는 것.

기억장소 할당	기억장소 반환
유휴 기억장소 집합으로부터 기

억장소를 할당받음

할당받아 사용하던 기억장소를

유휴 기억장소 집합에 반환함

*유휴 기억장소 : 아무도 사용하지 않는 기억장소

* 변수의 존속기간 life time : 변수에 기억장소가 할당되는 시점부터 반환되는 시점까지의 시간

 

 

변수의 존속기간에 따른 scalar변수의 category
1. Static 변수

- 프로그램 실행 전에 static area에 기억장소가 binding된다.

- binding된 기억장소는 프로그램이 종료될 때까지 유지된다.

- life time이 가장 긴 변수

- 장점

프로그램 실행 효율성이 높다. (변수에 직접 접근 가능. 기억장소 할당 및 반환 시간 필요 X)
Subprogram에서 history-sensitive 변수 지원(subprogram을 호출해서 실행을 시작할 때 이전 호출에서 마지막으로 배정된 값을 갖는다.)
- 단점

유연성 부족
재귀 프로그램 작성 불가
지역변수들 사이에 기억장소를 공용 불가
2. Static Dynamic 변수

- 프로그램이 실행되는 과정에서 변수 선언문이 활성화될 때 stack area에 기억장소가 binding된다.

- Scalar 변수의 경우, 다른 속성(이름, type, scope)은 static binding되기도 한다.

- 장점

재귀 프로그램 작성 가능
지역변수들 사이에 기억장소를 공용 가능
- 단점

프로그램 실행 시간 증가. (변수에 간접 접근. 기억장소 할당 및 반환 시간 필요)
Subprogram에서 history-sensitive 변수 이용 불가
3. Explicit heap-dynamic 변수

- 기억장소를 할당하는 문장을 실행할 때 heap area에 기억장소가 binding되고 반환하는 문장을 실행할 때 반환한다.

- 프로그램 실행 중 크기가 커지거나 줄어드는 경우에 사용 (Linked List, Tree)

- 장점

필요에 따라 기억공간을 효율적으로 관리하며 사용 가능
- 단점

Pointer나 참조 변수를 올바르게 사용하기 어려움 -> Reliability 저하
기억장소의 dynamic 할당 및 반환에 필요한 실행시간 증가
4. Implicit heap-dynamic 변수

- 배정문을 실행할 때 기억장소가 Binding된다.

- 쓸모없어진 기억장소는 Garbage Collection을 통해 알아서 반환된다.

- 장점

유연성 향상
- 단점

기억장소의 dynamic 할당 및 반환에 필요한 실행시간 증가
Compile할 때 오류 검출 불가 -> Reliability 저하
Named Constant 이름상수
- 변수 이름에 기억장소가 Binding이 이루어질 때 value binding이 동시에 이루어진다.

- 한번 binding된 값은 변경 불가.

- 장점 : Readability, Writability, Reliability 향상, Cost 절감

 
