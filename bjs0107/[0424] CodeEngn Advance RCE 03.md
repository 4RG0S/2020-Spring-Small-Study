이어서 CodeEngn Advance RCE 03번 문제입니다.

![image](https://user-images.githubusercontent.com/65721409/85939713-c3b38380-b952-11ea-8cd7-b45098092b0e.png)

문제 내용은 'Name이 CodeEngn 일때 Serial은 무엇인가?' 입니다.



- 풀이 -

우선 이름을 CodeEngn, Serial은 1234로 넣었습니다.

![image](https://user-images.githubusercontent.com/65721409/85939753-f9586c80-b952-11ea-8109-ba1046009e42.png)

곧바로 입력을 받고 메시지를 출력하는 문장과, 비교하는 부분과 연결된 것이 보입니다.
그대로 쭉 분석해 주면,

![image](https://user-images.githubusercontent.com/65721409/85939785-2dcc2880-b953-11ea-973c-383552be459b.png)

3265754874라는 Serial을 가지고 있고, 이를 입력값과 비교해 성공여부를 판단함을 알 수 있습니다.
다시 구한 값을 대신 넣어주면,

![image](https://user-images.githubusercontent.com/65721409/85939832-784da500-b953-11ea-9f54-35be2c45eb10.png)

성공입니다.
