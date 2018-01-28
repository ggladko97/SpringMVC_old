package domain;

/**
 * Created by ggladko97 on 14.05.17.
 */
public class Client {
  private int id;
  private String firstName;
  private String email;
  private String phone;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Client client = (Client) o;

    if (id != client.id) return false;
    if (firstName != null ? !firstName.equals(client.firstName) : client.firstName != null) {
      return false;
    }
    if (email != null ? !email.equals(client.email) : client.email != null) return false;
    if (phone != null ? !phone.equals(client.phone) : client.phone != null) return false;

    return true;
  }

  @Override public int hashCode() {
    int result = id;
    result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
    result = 31 * result + (email != null ? email.hashCode() : 0);
    result = 31 * result + (phone != null ? phone.hashCode() : 0);
    return result;
  }
}
