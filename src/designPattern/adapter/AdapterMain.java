package designPattern.adapter;

/*
 * Adpater Pattern
 * 	기존에 존재하는 라이브러리,메서드,알고리즘을 활용해야 할 때 
 * 	원본을 건드리지 않고, 내 입맛에 맞게 변환해서 사용하는 디자인 패턴
 *  장점: 메서드의 교체가 쉽고, 원본을 건드리지 않고 내 입맛대로 조절할 수 있다.
 * 
 */
public class AdapterMain {
public static void main(String[] args) {
	Adapter adapter = new AdapterImpl();
	System.out.println(adapter.twiceOf(200f));
	System.out.println(adapter.halfOf(100f));
	
}
}
