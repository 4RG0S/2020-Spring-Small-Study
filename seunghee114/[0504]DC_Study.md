"데이터통신" 2주차 복습
지금 듣고있는 전공 과목인 "데이터통신" 2주차 소소한 복습!

 

Physical Layer
- Data Link Layer를 위한 서비스를 제공하는 일을 한다.

- 처음엔 0과 1로 이루어진 stream을 다른 entity로 변환해야 한다.

   -> 다른 entity : signal

Digital Transmission
Digital Signal을 이용해 Digital Data를 보낸다.

 

Digital to Digital Conversion
Digital Data를 Digital Signal로 변환

Digital Data를 어떻게 Digital Signal로 고치는가!!

Line coding and decoding

- Sender가 Digital Data 0 1 0을 보낸다.

문제점!!!  Synchronization

- 보내는 신호랑 받는 신호는 같다.

- 그런데 Sender가 보낸 data와 Receiver가 받은 data가 달라!!

왜 그럴까?   Sender와 Receiver의 시간 간격이 달라서 그렇다.

              -> Effect of lack of synchronization 동기화 부족
              
              Block coding

- 원래 우리가 보내려는 m bit의 data를 signal element로 고치지 않고 n bit의 data로 고치고 이 data를 digital signal로 보내는 것.

- 이때 고친 bit인 n bit는 전송과정에서 매우 유리하고 시간을 잘 지킬 수 있는 data

 

AMI used with Scrambling

- 신호를 빨리 보내면서 signal element당 더 효율적으로 data를 보낼 수 있게 고안한 방법

 

Analog to Digital Conversation
analog data를 digital data로 변환

digital data를 전송할 수 있으면 analog data를 전송할 수 있다. 왜냐하면 analog data를 digital data로 변환할 수 있으니까
