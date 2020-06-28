코드엔진 어드벤스 4번 문제입니다.

![image](https://user-images.githubusercontent.com/65721409/85940526-e4320c80-b957-11ea-892f-4a6c4fc8ae3c.png)

문제 내용은 저번과 다를바 없습니다.


- 풀이 -

![image](https://user-images.githubusercontent.com/65721409/85941530-8654f300-b95e-11ea-9932-245cfc0dea0d.png)

똑같이 바로 olldbg로 분석했습니다.

![image](https://user-images.githubusercontent.com/65721409/85941581-bf8d6300-b95e-11ea-8ac1-0953679466a1.png)

곧바로 문자열 비교 API가 보여서, 그부분을 열어봤더니...

![image](https://user-images.githubusercontent.com/65721409/85941605-db910480-b95e-11ea-9bda-bcfbd01216e3.png)

바로 진짜 Serial과 비교함을 알 수 있었습니다.
그대로 넣으면,

![image](https://user-images.githubusercontent.com/65721409/85941648-07ac8580-b95f-11ea-946a-ed0545933b1f.png)

성공입니다.
