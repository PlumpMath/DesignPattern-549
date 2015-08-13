package designPattern.Factory.Main;
import designPattern.Factory.framwork.*;
import designPattern.Factory.idcard.*;

public class Main {
	public static void main(String[] args){
		Factory factory = new IDCardFactory();
		Product card1 = factory.creat("홍길동");
		Product card2 = factory.creat("이순신");
		Product card3 = factory.creat("강감찬");
		card1.use();
		card2.use();
		card3.use();
	}
}
