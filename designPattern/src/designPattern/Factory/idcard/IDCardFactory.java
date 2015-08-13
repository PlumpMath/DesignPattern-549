package designPattern.Factory.idcard;
import designPattern.Factory.framwork.*;
import java.util.*;

public class IDCardFactory extends Factory{
	private List owners = new ArrayList();
	protected Product creatProduct(String owner){
		return new IDCard(owner);
	}
	protected void registerProduct(Product product){
		owners.add(((IDCard)product).getOwner());
	}
	public List getOwner(){
		return owners;
	}
}
