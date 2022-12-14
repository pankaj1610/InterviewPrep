// This is the abstract class or interface that defines the methods
// that the high-level module needs to access data from the database.
public interface DatabaseAccess {
  public List<Object> fetchData(String query);
}

// This is the low-level module that provides a specific implementation
// of the database access methods.
public class MySQLDatabaseAccess implements DatabaseAccess {
  public List<Object> fetchData(String query) {
    // Fetch data from MySQL database using the given query
  }
}

// This is the high-level module that uses the database access methods
// provided by the abstract class or interface.
public class UserInterface {
  private DatabaseAccess database;
  public UserInterface(DatabaseAccess database) {
    this.database = database;
  }
  public void displayData() {
    List<Object> data = database.fetchData("SELECT * FROM users");
    // Display the data in the user interface
  }
}
