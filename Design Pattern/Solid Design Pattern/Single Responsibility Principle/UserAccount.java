public class UserAccount {
  // Fields for storing user information
  private String username;
  private String password;
  private String email;
  
  // Constructor for initializing user information
  public UserAccount(String username, String password, String email) {
    this.username = username;
    this.password = password;
    this.email = email;
  }
  
  // Method for logging in the user
  public void login(String username, String password) {
    // Check if the username and password match the user's credentials
    if (username.equals(this.username) && password.equals(this.password)) {
      // Login the user
      // ...
    } else {
      // Throw an error
      throw new InvalidCredentialsException();
    }
  }
  
  // Method for logging out the user
  public void logout() {
    // Log out the user
    // ...
  }
}
