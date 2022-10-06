package interfaces;

public class SqlDal implements CustomerDal,Repository{
	public void add() {
		System.out.println("sql added");
	}
}
