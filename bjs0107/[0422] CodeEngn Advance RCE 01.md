코드엔진에 있는 프로그램 분석 문제인 Advance RCE 01를 풀어보았습니다.
문제 내용은 아래와 같습니다.

![image](https://user-images.githubusercontent.com/65721409/85927775-3a189d00-b8e3-11ea-89d9-7d8fb3e6990f.png)



-풀이과정-

먼저 바로 Olldbg로 분석을 시도했습니다.
![image](https://user-images.githubusercontent.com/65721409/85927832-a398ab80-b8e3-11ea-8bef-ae87547ec20c.png)

살짝 보니 PUSHAD인걸 확인하고 패킹됨을 알았습니다.
곧바로 PEiD로 프로그램을 분석해 본 결과, UPX패킹임을 쉽게 알았습니다.

![image](https://user-images.githubusercontent.com/65721409/85927881-e3f82980-b8e3-11ea-9ece-9825410dd819.png)


그래서 패킹 후, 다시 분석에 들어갔습니다.

![image](https://user-images.githubusercontent.com/65721409/85927941-481aed80-b8e4-11ea-9405-d2b92a81225d.png)

종료 시간을 알아내면 되는 문제이니까, 시간에 관련된 API들을 찾아봤습니다.
그 중 750초동안 타이머를 재고, 종료루틴으로 가는 부분이 존재하기에 분명 750인 줄 았았더니 아니더군요.

![image](https://user-images.githubusercontent.com/65721409/85927974-9a5c0e80-b8e4-11ea-8e59-5b4e7c0c1b0e.png)

이 API에서 EDI값을 불러와 현재시간과 비교하고, 그에 따라서 종료시간이 나왔습니다. 위의 750은 현재시간과 비교하는 용도로,
실제 프로그램 종료 시간과는 조금 차이가 나는 것이였죠.

그래서 정확한 값은 337B. 즉, 10진수로 750인 12초와는 다른, 13.179초가 정답이 됩니다.
