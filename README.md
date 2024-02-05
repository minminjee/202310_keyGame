자바를 이용한 타자 연습 게임
======
### 사용법

* 엔터를 누르면 랜덤으로 영단어가 출력된다.
* 키보드로 해당단어르 작성한다.
* 문제 하나당10점 100점시 탈출 및 게임 종료
* 단, 중복된 단어는 맞추면 0점 틀리면 -10점

### 시연 영상
<img src ="https://github.com/minminjee/2023_java_keyboard/assets/157664207/ff4dea8d-5529-4883-a3f4-05f92cd3843d">  

### 기술 스택
자바의 내장 함수를 사용하여 기본적인 동작을 구현함   

배열로 유효성 체크를 구현하였다.

자바의 내장함수 Rrandom, Scanner사용하여 키보드게임 진행

추가 기능으로는 이미나왔던 단어에 대해서 저장하고 다른 점수를 줘야함

 스트링 배열 인덱스의 인덱스를 활용하여 체크 배열에 유효성을 만듬
 ```
	Random r = new Random();
		Scanner in = new Scanner(System.in);
		String[] word = { "string", "next", "line","for","else","if","continue","break", "new", "int", "scanner", "java", "random", "float", "char" };

		//int wordIndex[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		int check[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
```

