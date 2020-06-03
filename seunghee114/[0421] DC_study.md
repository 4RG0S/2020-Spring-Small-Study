지난주 Summary
Error Detection and Correction

data에 bit를 활용해 에러 발생을 감지하고 어디서 에러가 났는지도 알아서 고칠 수 있다.

그럼 고치기까지 해주는 Correction이 좋은 거 아니야?? 왜 Detection을 해??

Correction을 위해 data에 붙여야 하는 bit 수가 너무 많아져서 Detection보다 비효율적이야!

 

Data Link Control

Frame을 전송하고 에러가 발생하더라도 재전송함으로써 완전 무결한 data를 전송하는 역할을 한다.

 

Noiseless Channels
Simplest Protocol

No flow or error control (flow control이랑 error control 없음)

Sender와 Receiver 사이의 속도 차이로 Frame loss가 가능하다.

 

Stop and Wait Protocol

Flow control and no error control (flow control은 하고 error control은 안해)

Sender는 Data frame을 보내고 ACK frame이 올 때까지 멈춰서(stop) 기다린다.(wait)

Receiver는 Data frame을 받고 위로 올려보낸 다음에(Data를 또 받을 수 있는 상태) ACK frame을 전송한다.

 

Noisy Channels
Stop and Wait ARQ Protocol

Sender는 Data frame을 보내고 ACK frame이 올 때까지 멈춰서(stop) 기다린다.(wait) 그리고 어떤 일정 시간동안 ACK frame이 오지 않으면 error라고 판단해서 이전에 보낸 Data frame을 재전송한다.

Receiver는 Data frame을 받고 위로 올려보낸 다음에(Data를 또 받을 수 있는 상태) ACK frame을 전송한다.

 

이 Protocol은 완벽하게 신뢰성 있는 Data를 전송할 수 있으나 Data frame을 하나 보내고 ACK frame이 올 때까지 기다려야하는 문제가 있다. -> 효율성이 떨어진다.

 

Go Back N ARQ Protocol

Sender는 Data frame을 보낼 때 Buffer의 크기만큼 ACK frame을 받지 않고 계속 보낸다. 이때 보낸 Data frame은 Buffer에 쌓아둔다. ACK frame이 오면 Buffer에 있는 해당 Data frame을 없앤다.

Receiver는 해당 Data frame이 잘 도착해서 위로 올리고 해당 ACK frame을 보낸다. 

(Buffer는 1개)

 

이 Protocol은 일정 시간동안 ACK frame을 받지 않기 때문에 에러가 났어도 다음 Data frame을 보낼 수 있다. 따라서 ACK frame이 오지 않은 Data frame부터 재전송한다.

-> 제대로 도착한 Data frame도 버릴 수가 있어! Stop and Wait ARQ Protocol이 더 효율적인거 아니야?

-> 아니야!! 왜냐면 Stop and Wait ARQ Protocol은 error가 난 Data frame부터 하나씩 하나씩 다시 보내야하지만 Go Back N ARQ Protocol은 error가 난 Data frame부터 Buffer의 크기만큼 ACK frame을 받지 않고 다시 보낼 수 있어! 

 

Selective Repeat ARQ Protocol

Go Back N ARQ Protocol과 비슷한데 이건 error가 난 Data frame만 재전송한다. 그래서 Sender와 Receiver의 Buffer의 크기가 같다. Data의 순서를 맞추기 위해서!

 

이 Protocol은 Window Management가 복잡해!! Receiver Buffer에서 어디가 채워졌고 어디가 비워져있는지 알아야되니까! 그래도 전송효율은 짱 좋다!

 

Piggybacking in Go Back N ARQ Protocol

쌍방이 데이터를 보낼 경우! Data frame을 보내고 ACK frame을 보내고 이럴 때

새로 ACK frame을 만들어서 보내면 너무 비효율적이야! 그러니까 Data frame 뒤에 ACK frame field들을 붙여서 보내자! 쌍방이 아니면 뭐 만들어야지!
