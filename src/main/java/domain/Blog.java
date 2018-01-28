package domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import java.io.Serializable;
import java.sql.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Created by ggladko97 on 12.05.17.
 */
public class Blog {

  private int id;

  @NotNull(message = "Required field")
  @Size(min = 6, max = 25, message = "User name must contain from 6 to 25 chars")
  private String userName;

  @NotNull(message = "Required field")
  @Past(message = "Only past experience is valid")
  private Date date;

  @NotNull(message = "Required field")
  @Size(min = 10, max = 200, message = "Message must be at list 10 chars but not more then 200")
  private String content;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Blog blog = (Blog) o;

    if (id != blog.id) return false;
    if (userName != null ? !userName.equals(blog.userName) : blog.userName != null) return false;
    if (date != null ? !date.equals(blog.date) : blog.date != null) return false;
    if (content != null ? !content.equals(blog.content) : blog.content != null) return false;

    return true;
  }

  @Override public int hashCode() {
    int result = id;
    result = 31 * result + (userName != null ? userName.hashCode() : 0);
    result = 31 * result + (date != null ? date.hashCode() : 0);
    result = 31 * result + (content != null ? content.hashCode() : 0);
    return result;
  }
}
