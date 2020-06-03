오늘은 페이지에서 어떠한 컴포넌트를 눌렀을 때에 대한 동작을 어떻게 구현하는지 이벤트 처리에 대해 공부해보았다. 저번에 만든 App.js 파일과 컴포넌트들을 이용해서 실습을 진행했다.

 

1. 조건에 따른 mode 설정해주기
 

페이지에서 컴포넌트를 클릭했을 때, 각각 다른 내용이 나오게 하려면 그 눌린 것이 무엇인지 식별할 수 있어야 한다. 그래서 각각 mode라는 것을 세팅해주는데, 페이지의 기본 mode는 welcome으로 설정해주기로 하여 아래와 같이 state안에 mode를 추가하고, mode가 기본인 welcome일때 나오는 welcome의 title과 desc를 정의해주었다.

 


 

그 다음, render는 페이지를 로드할 때 불러오는 사항들이 있는 함수로, 이 함수에서 불러오기 전에 조건을 설정해주면 mode의 세팅도 할 수 있으므로 각각의 내용을 뜻하는 _title변수와 _desc 변수를 선언해주고 if 문으로 조건을 작성해준다. mode가 welcome일 때에는 이전에 state에 작성한 welcome의 title과 desc의 내용을 세팅해주고, 그 이외에는 임의로 contents 배열에 있는 html에 해당하는 부분이 나오도록 하였다. 

 

이 조건을 만족 시킬 경우, 화면에 표시되어야 하므로 Content의 title과 desc 부분의 받는 부분을 수정해주었다. 코드를 아래와 같이 수정해준 뒤에 페이지를 리로드 했을 때 아래와 같이 welcome의 내용이 잘 뜨는 것을 볼 수 있었다.

 


 


2. onClick 이벤트 설치
 

다음 이러한 mode 조건을 세팅해주었다면, 이 mode를 바꿔줄 이벤트 처리가 필요하다. 

web이라는 글씨를 클릭했을 때, 이벤트 처리가 일어나도록 하기 위해서 Subject의 h1 태그에 onClick 함수를 만들어서 이곳에 클릭했을 때에 대한 처리를 하도록 만들었다.

 

alert()를 간단하게 실행시켜, onClick이 실행이 되는지 시험을 해보았다. 잘 작동하는 모습을 보였다.


단, 여기서 주의할 점은 alert를 호출한 뒤에 페이지가 리로드 된다는 점이다. 굳이 페이지 리로드를 하는 것은 불편한 일이므로 이러한 기본 동작인 것을 없애기 위해서 이벤트 객체를 뜻하는 e에 preventDefault() 함수를 사용하여 기본 동작을 하지 않도록 설정해준다. 이렇게 설정해주면 더이상 페이지가 리로드 되지 않는 모습을 볼 수 있다.

 

3. setState와 bind()
마지막으로, 이전에 기본으로 welcome을 설정했던 것을 바꾸려면 State를 바꿔야 한다. 

그러나 state는 this... 이러한 평범한 방법으로 바로 생각했던 것처럼 바뀌지 않는다. 바꾸기 위해서는 onClick 함수 뒤에 .bind(this)를 사용하고 나서, setState()를 사용해서 바꾸어야 정상적으로 바뀌는 것을 확인할 수 있다.

 


 

이전에는 바뀌지 않던 state가 아래의 화면과 같이 바뀌는 것을 콘솔로 확인할 수 있었다.


 

여기까지 onClick을 설치하고, state를 바꾸는 setState와 bind 함수를 사용하는 방법을 알게 되었다.

다음에는 여기서부터 다시 이어서 정리해 볼 예정이다.