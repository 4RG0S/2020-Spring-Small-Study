Deadlock 교착상태
- 두 개 이상의 프로세스가 서로 상대방의 작업이 끝나기만을 기다리고 있어 다음 단계로 진행하지 못하는 상태. 교착상태는 영구적이다.
- 컴퓨터 시스템의 다중 프로그래밍 환경에서는 여러 프로세스들이 한정된 자원을 사용하기 위해 경쟁하고 있으며, 
한 프로세스가 자원을 요청했을 때, 해당 자원이 사용할 수 없는 상태일 경우 교착 상태가 발생한다.
- 한 프로세스가 요청한 자원을 다른 프로세스가 점유하고 있고 
그것을 점유하고 있는 프로세스도 다른 자원에 의해 대기 상태에 빠져 있어 두 프로세스가 모두 대기 상태에서 벗어날 수 없는 상황.
- 경쟁구도에 놓인 프로세스들이 자원을 요청하는 시점에 해당 자원이 다른 프로세스에 의해 점유되어 있으면 대기 상태에 놓이게 되고, 
각 프로세스와 자원들이 서로 꼬리에 꼬리를 물며 자원을 대기하게 되는 경우를 교착 상태에 놓여있다고 할 수 있다.
- 시스템 관점에서 들여다보면, 시스템은 경쟁하는 프로세스들 사이에 분배되어야 할 유한한 자원들로 구성되며, 
여러 프로세스들이 해당 자원을 점유하기 위해 서로 경쟁 구도에 놓여 있다. 
프로세스가 자원을 사용하기 위해서는 반드시 사용하기 전에 요청을 해야 하고, 사용 후에는 반드시 돌려놓아야한다.
- 요청 -> 사용 -> 돌려놓기 와 같은 주기를 갖게 되며, 자원 요청이 즉시 허용되지 않는 경우에는 자원을 얻을 때까지 대기 상태에 놓이게 된다.
- 동시 프로세스 관리의 다른 문제와 달리, 이러한 교착 상태에 대하여 일반적인 경우에는 해결 방법이 없다.
- 하지만 교착 상태는 항상 발생하는 것은 아니고, 두 프로세스의 공동 진행으로 인해 치명적인 영역으로 들어가는 경우에만 발생한다.

Deadlock의 발생 조건
1. 상호 배제 (Mutual Exclusion)
한 번에 한 프로세스만 자원을 사용할 수 있다. 다른 프로세스는 그 자원의 점유가 해제될 때까지 기다려야함을 의미한다.

2. 보유 대기 (Hold and Wait)
한 프로세스가 최소한 하나의 자원을 점유한 채,  현재 다른 프로세스에 의해 점유된 특정 자원을 추가적으로 얻기위해서 대기 하고 있는 상태. 보유 중인 프로세스에 의해 사용이 끝날 때까지 빼앗을 수 없다는 것을 의미한다.
프로세스는 할당된 자원을 보유하고 있으면서 또 다른 자원의 할당을 기다릴 수 있다. 

3. 비선점 (No Pre-emption)
이미 보유하고 있는 프로세스에서 자원을 강제로 제거할 수 없다.
자원들은 선점할 수 없어야한다. 즉 자원이 강제적으로 방출될 수 없고, 점유하고 있는 프로세스가 사용을 마친 후 그 프로세스에 의해서 자발적으로 방출되어야 한다는 의미.

4. 순환 대기 (Circular Wait)
각 프로세스가 서로 꼬리를 물며 연쇄적으로 서로 필요한 자원을 점유하고 있어야 한다는 의미.
