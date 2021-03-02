package junit.tutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * テストクラスに辻褄を合わせるために作られた。
 * まるでTDD。。
 */
public class ItemStock {
	List<String> stock = new ArrayList<String>();
	
	public int size(String str) {
		return (int)stock.stream().filter(x -> x.equals(str)).count();
	}
	
	public boolean contains(String str) {
		return stock.contains(str);
	}
	
	public void add(String str) {
		stock.add(str);
	}
}
