package dao;

import domain.Line;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * Created by ggladko97 on 13.05.17.
 */
@Repository
public class LineDaoImpl implements LineDao {

  private SessionFactory sessionFactory;

  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  public void insert(Line line) {
    Session session = this.sessionFactory.getCurrentSession();
    session.persist(line);
  }

  public void updateLine(Line line) {
    Session session = this.sessionFactory.getCurrentSession();
    session.update(line);
  }

  public List<Line> listLine() {
    Session session = this.sessionFactory.getCurrentSession();
    Query query = session.createQuery("from domain.Line");
    List<Line> lines = query.list();
    return lines;
  }

  public Line getLineById(int id) {
    Session session = this.sessionFactory.getCurrentSession();
    return (Line) session.get(Line.class,id);
  }

  public void removeLine(int id) {
    Session session = this.sessionFactory.getCurrentSession();
    Line line = (Line) session.get(Line.class,id);
    if (line != null) {
      session.delete(line);
    }
  }
}
