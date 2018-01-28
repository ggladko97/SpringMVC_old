package domain;

import java.sql.Date;
import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

/**
 * Created by ggladko97 on 14.05.17.
 */
public class Line {
  private int id;

  @Future(message = "we are planning future trips")
  @NotNull(message = "Required field")
  private Date date;

  @NotNull(message = "Required field")
  private String fromC;
  @NotNull(message = "Required field")
  private String toC;

  private String bus;
  private String driver;
  @NotNull(message = "Required field")
  private int tickets;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getFromC() {
    return fromC;
  }

  public void setFromC(String fromC) {
    this.fromC = fromC;
  }

  public String getToC() {
    return toC;
  }

  public void setToC(String toC) {
    this.toC = toC;
  }

  public String getBus() {
    return bus;
  }

  public void setBus(String bus) {
    this.bus = bus;
  }

  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public int getTickets() {
    return tickets;
  }

  public void setTickets(int tickets) {
    this.tickets = tickets;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Line line = (Line) o;

    if (id != line.id) return false;
    if (tickets != line.tickets) return false;
    if (date != null ? !date.equals(line.date) : line.date != null) return false;
    if (fromC != null ? !fromC.equals(line.fromC) : line.fromC != null) return false;
    if (toC != null ? !toC.equals(line.toC) : line.toC != null) return false;
    if (bus != null ? !bus.equals(line.bus) : line.bus != null) return false;
    if (driver != null ? !driver.equals(line.driver) : line.driver != null) return false;

    return true;
  }

  @Override public int hashCode() {
    int result = id;
    result = 31 * result + (date != null ? date.hashCode() : 0);
    result = 31 * result + (fromC != null ? fromC.hashCode() : 0);
    result = 31 * result + (toC != null ? toC.hashCode() : 0);
    result = 31 * result + (bus != null ? bus.hashCode() : 0);
    result = 31 * result + (driver != null ? driver.hashCode() : 0);
    result = 31 * result + tickets;
    return result;
  }
}
