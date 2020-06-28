자바 과제입니다.

삼각형, 사각형, 원의 넓이를 구하는데,
추상클래스 상속과 인터페이스 구현 및 추상메소드 구현이 좀 꼬여있습니다.

![image](https://user-images.githubusercontent.com/65721409/85946033-9c71ac00-b97c-11ea-90c9-fb8555c83306.png)

총 객체는 6개로, 각각


test를 하는 main 클래스,

추상메소드를 정해주는 Shape 인터페이스,

추상 클래스로, 도형의 좌표를 저장하는 Figure 클래스,


그리고 Figure를 상속받고, Shape의 추상메소드를 구현해 주는 Triangle, Rectangle, Circle 클래스이 있습니다.

- main
![image](https://user-images.githubusercontent.com/65721409/85946061-c925c380-b97c-11ea-9065-138f184557f8.png)

- shape
![image](https://user-images.githubusercontent.com/65721409/85946071-d80c7600-b97c-11ea-8314-f74123313092.png)

- triangle, rectangle, circle
![image](https://user-images.githubusercontent.com/65721409/85946085-e5296500-b97c-11ea-86fa-9a5c85ea654b.png)

다른 도형들 역시 넓이를 구하는 식만 다를 뿐 동일하게 작성했습니다.

Figure도 좌표저장만 하면 되니까 간단하게 구현해 뒀어요.

실행하면,

![image](https://user-images.githubusercontent.com/65721409/85946145-320d3b80-b97d-11ea-8cf0-9924f68ed0b8.png)

잘 출력됬습니다.





