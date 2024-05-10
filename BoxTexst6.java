package chapter11;
class Box5 {
	int width;  // 속성 정의 , 객체변수 생성.
	int height;
	int depth;
	
	// 생성자 오버로딩.  여러개 중첩하여 사용 가능.  
	// 매개변수의 형과 개수가 달라야 한다.
	public Box5() {  // 매개변수가 없는 생성자
		width = 1;
		height = 1;
		depth = 1;
	}

	public Box5(int w) {  // 매개변수가 1개인 생성자
		width = w;
		height = 1;
		depth = 1;
	}
	
	public Box5(int w, int h) {  // 매개변수가 2개인 생성자
		width = w;
		height = h;
		depth = 1;
	}
	
	public Box5(int w, int h, int d) {  // 매개변수가 3개인 생성자
		width = w;
		height = h;
		depth = d;
	}
}

public class BoxTexst6 {
	public static void main(String[] args) {
		// 매개변수가 없는 생성자 호출.
		Box5 mybox1 = new Box5();
	    int vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("박스의 부피(매개 변수 없음) : " + vol);

	    // 매개변수가 1개인 생성자 호출.
	    mybox1 = new Box5(10);
	    vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("박스의 부피(매개 변수 1개) : " + vol);
	    
	    // 매개변수가 2개인 생성자 호출.
	    mybox1 = new Box5(10,20);
	    vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("박스의 부피(매개 변수 2개) : " + vol);
	    
	    // 매개변수가 3개인 생성자 호출.
	    mybox1 = new Box5(10,20,30);
	    vol = mybox1.width * mybox1.height * mybox1.depth;
	    System.out.println("박스의 부피(매개 변수 3개) : " + vol);	
	}

}
