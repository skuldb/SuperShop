import org.example.db.MockDb;
import org.example.db.dao.*;


public class Main {

	public static void main(String[] args) {
		
		MockDb db = new MockDb();
		ClientDao dao = new MockClientDaoImpl(db);
		
		CountService service = new CountService(dao);
		
		service.countClients();

	}

}
