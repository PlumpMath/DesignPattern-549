package designPattern.Factory.Main;
import designPattern.Factory.framwork.*;
import designPattern.Factory.idcard.*;

public class Main {
	public static void main(String[] args){
		Factory factory = new IDCardFactory();
		Product card1 = factory.creat("ȫ�浿");
		Product card2 = factory.creat("�̼���");
		Product card3 = factory.creat("������");
		card1.use();
		card2.use();
		card3.use();
	}
}
