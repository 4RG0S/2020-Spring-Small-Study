코드엔진 Advance 02를 풀었습니다.
다만 제 환경에서는 문제 프로그램이 잘 안돌아가서, 

![image](https://user-images.githubusercontent.com/65721409/85939492-fceaf400-b950-11ea-9ae9-daa9a6c032fb.png)
vm으로 새로 윈도우 환경을 구축하고 디버거를 설치해서 분석했습니다.



![image](https://user-images.githubusercontent.com/65721409/85939519-2f94ec80-b951-11ea-8d86-3d7fd9f3091f.png)
문제 내용은 Password를 찾으면 됩니다.


- 풀이 -

![image](https://user-images.githubusercontent.com/65721409/85939547-6ec33d80-b951-11ea-8644-3a1fe17bd4bd.png)

문자열 검색으로 출력되는 부분과 입력값을 받는 부분을 찾고, 실행step을 밟으며 실행해 본 결과...

![image](https://user-images.githubusercontent.com/65721409/85939603-e7c29500-b951-11ea-8524-ea43feb25a0c.png)

문자열을 한 글자씩 비교를 하는 함수를 찾았습니다. 전부 맞으면 성공, 아니면 실패를 출력하게끔 말이죠.
그래서 각 글자 비교를 전부 조합해서 찾아보니,

![image](https://user-images.githubusercontent.com/65721409/85939606-f315c080-b951-11ea-93f6-aebeed3fd8aa.png)

이렇게 조합됨을 알 수 있었습니다.
그대로 입력칸에 입력해서 넣어보면,

![image](https://user-images.githubusercontent.com/65721409/85939619-0b85db00-b952-11ea-81de-80207b8fbbd4.png)

문제풀이 성공입니다.
