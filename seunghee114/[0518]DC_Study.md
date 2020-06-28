"데이터 통신" 3주차 복습
 

모든 analog data는 digital data로 변환이 가능하다.

그래서 digital data를 전송하는 것에 노력한다.

 

Analog Transmission
Digital transmission은 무선 통신에 적합하지 않다. 

Analog transmission은 주로 무선 통신에 사용된다.

Analog transmission으로 digital data를 보내기 위해서 digital data는 analog signal로 변환되어야 한다.

 

5.1 Digital-to-Analog Conversion
Digital data를 Analog signal로 변환

¿하는 이유¿ Analog Transmission으로 data를 전송하기 위해서

 

Components of Periodic Analog Signal
1. Period 주기 (주파수의 역수)

2. Frequency 주파수 (주기의 역수)

: 초당 똑같은 모양이 몇 번 반복하는가. 만약 1/6초 단위로 똑같은 모양이 반복되면 주파수는 6이고 주기는 1/6이다.

3. Amplitude 진폭

4. Phase 위상

 

*진폭, 주기(or 주파수)가 같아도 위상이 다르면 어떤 시점에서의 측정값이 다르다.

따라서 어떤 파형을 정의하기 위해서는 진폭 + 주기 (or 주파수) + 위상이 필요하다.

 

Types Digital-to-Analog conversion
1. Amplitude Shift Keying ASK

- 진폭을 변조하는 방법

- signal element가 2개면 Binary Amplitude Shift Keying. (진폭 있음 = 1, 진폭 없음 = 0)

 

2. Frequency Shift Keying FSK

- 주파수를 변조하는 방법

- signal element가 2개면 Binary Frequency Shift Keying. (주파수 높음 = 1, 주파수 낮음 = 0)

 

3. Phase Shift Keying PSK

- 위상을 변조하는 방법

- 똑같은 주파수, 똑같은 진폭

- signal element가 2개면 Binary Phase Shift Keying. (위로 올라가는 모양 = 1, 아래로 내려가는 모양 = 0)

 

*signal element가 4개면 Quadrature ### Shift Keying

: 1개의 signal element가 2개의 bit를 보낼 수 있다.

 

4. Quadrature Amplitude Modulation

- ASK와 PSK를 잘 합쳐서 signal element  수를 늘려서 전송의 효율을 늘리겠다는 Idea

- QAM 전송을 위한 최소 대역폭은 ASK와 PSK 전송에 필요한 것과 같다.

- QAM은 ASK와 PSK의 같은 이점을 갖는다.

¿왜 FSK는 합치지 않았을까¿

FSK는 대역폭을 많이 잡아먹어서 손해가 있다. 

 

Concept of a constellation diagram
: 다양한 Phase 와 Amplitude를 표현하는 법

 

만약 20bit의 정보를 보내려고 할 때,

signal element의 수가 2개면 하나 당 1bit를 보낼 수 있으니까 20개의 signal element를 보내야 해!!!
signal element의 수가 4개면 하나 당 2bit를 보낼 수 있으니까 10개의 signal element를 보내야 해!!!

signal element의 수가 16개면 하나 당 4bit를 보낼 수 있으니까 5개의 signal element를 보내야 해!!!

-> signal element의 수가 클수록 좋겠다!!!!! 속도가 빨라지잖아!!!!!!

¿속도가 무한히 빨라질까¿

Yes!! 그런데 Noise가 문제야. signal element의 수가 많아지면 Noise로 인해 변형되면 받는 사람이 잘못 해석할 수도 있어

5.2 Analog-to-Analog Conversion
Analog data를 Analog signal로 변환

Analog signal에 의한 analog 정보의 표현

 

Types of Analog-to-Analog modulation
1. Amplitude modulation

Sender는 Modulating signal(보낼 Signal)에 Carrier frequency를 합쳐서 Modulated Signal를 만들어 전송한다.

Receiver는 Carrier frequency에 맞게 튜닝하면 원래 보낸 Modulating signal을 얻을 수 있다.

¿이런 방법에는 문제가 있다!!!¿

: Modulated Signal의 높은 부분들이 잡음이 생겨서 죽을 수 있다 -> 출력이 손상됨

 

2. Frequency modulation

음질이 훨씬 깨끗해

 

3. Phase modulation

많이 사용 안됨 FM과 같은 효과
