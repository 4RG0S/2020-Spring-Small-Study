"데이터통신" 1주차 복습
지금 듣고있는 전공 과목인 "데이터통신" 1주차 소소한 복습!

Data and Signals 데이터와 시그널
Analog and Digital
Data는 전자기의 신호를 통해 전송된다.

 

Data의 종류
1) Analog

자연적인 것, 연속적인 정보                             ex) 음악, 영상, 그림 등

2) Digital

0과 1로 이루어진 정보

 

Signal의 종류
1) Analog                                       2) Digital

무한한 값                                        유한한 값

 

Periodic and Nonperiodic Signal 주기적인 시그널과 주기적이지 않은 시그널
데이터 통신에서 우리는 주로 주기적인 시그널과 비주기적인 시그널을 사용한다.

 

Periodic Analog Signals 주기적인 아날로그 시그널
- simple(1개로 이루어진 것)과 composite(여러 개가 복합된 것)로 분류된다.

- Simple periodic analog signal : sine wave, 더 간단한 signal로 분해 불가.

- Composite periodic analog signal : 다수의 sign wave로 분해 가능.

 

Components of Periodic Analog Signal
주기함수 : 일정한 모양이 반복되는 함수.

              주기와 진폭을 알면 함수를 그릴 수 있다. 정확하게 그리기 위해서는 위상도 알아야한다.

1. Period 주기 : 주파수의 역수

2. Frequency 주파수 : 주기의 역수

3. Amplitude : 진폭

4. Phase 위상
Digital Signals 디지털 시그널
- Analog signal로 표현될 수 있는 정보는 Digital signal로 표현이 가능하다.

- Digital data의 값은 0 아니면 1.

- Digital signal은 Digital data를 encoding하기 위해 많은 별개의 voltage level을 사용한다.

- Digital signal은 2레벨 이상일 수 있다. 이 경우 각 레벨은 1bit 이상을 보낸다.

- Digital signal의 전송속도는 bit rate로 표현될 수 있다.

- bit rate : 1초에 보낼 수 있는 bit의 수 (얼마나 빨리 보낼 수 있는가, 초당 몇 개의 bit를 보낼 수 있는가) 단위는 bps

- baud rate : 1초당 지나간 signal element의 수

 

Transmission Impairment
- Signal은 전송매체를 통해 완벽하지 않게 보내진다. 이런 완벽하지 않음은 Signal Impairment를 야기한다.

- Signal이 전송과정에서 손상되는 3가지 이유. 

1. Attenuation : 에너지의 손실

2. Distortion : Signal의 모양과 형태가 바뀜

3. Noise : 외부의 Impairment

SNR = average signal power / average noise power    큰 게 좋아

-> Noise Power가 클수록 SNR은 작아진다.

 

Data rate limits
- 얼마나 빨리 Data를 보낼 수 있을까??

- Data rate는 

                  1. 대역폭

                  2. 우리가 사용하는 signal의 level

                  3. Noise의 level

                                                                 에 영향을 받는다.
