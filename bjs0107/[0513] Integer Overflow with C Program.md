동아리 C언어 교육에서 준 과제의 풀이입니다.

![image](https://user-images.githubusercontent.com/65721409/85943274-046ac700-b96a-11ea-9300-de7e2c10ce71.png)


해당 프로그램에서 integer overflow를 활용해 Boss에게서 이기면 됩니다.


- 풀이 -

처음 salary가 100$이하임을 음수로 해서 통과시키고,

(unsigned int)로 저장되는걸 활용해 다시 양수로 money에 salary를 저장시켰습니다.

![image](https://user-images.githubusercontent.com/65721409/85943367-94a90c00-b96a-11ea-8119-50d832a0760c.png)

따라서 입력값에 int형 + 1 한 값을 넣으면 당연히 overflow 발생, 통장금액 2,147,483,648로 승리합니다.



- 다른 풀이 -

unsigned int는 음수를 표현하지 못하므로, 음수값을 넣으면 당연히 overflow가 발생합니다.
그래서 간단하게 작은 음수만 넣어도,

![image](https://user-images.githubusercontent.com/65721409/85943438-10a35400-b96b-11ea-8bfb-2ec1e2c4622a.png)

승리할 수 있습니다.
