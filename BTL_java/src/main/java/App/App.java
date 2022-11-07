package App;

import Database.BacSidDao;

public class App {
	public static void main(String[] args) throws Exception {
		BacSidDao b = new BacSidDao();
		b.finAll().forEach(e->System.out.println(e));
	}
}
