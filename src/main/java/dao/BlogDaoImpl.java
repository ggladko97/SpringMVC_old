package dao;

import domain.Blog;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * Created by ggladko97 on 12.05.17.
 */
@Repository
public class BlogDaoImpl implements BlogDao {

  private SessionFactory sessionFactory;


  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  public void insert(Blog blog) {
    Session session = this.sessionFactory.getCurrentSession();
    session.persist(blog);
  }

  public void updateBlog(Blog blog) {
    Session session = this.sessionFactory.getCurrentSession();
    session.update(blog);
  }

  public List<Blog> listBlog() {
    Session session = this.sessionFactory.getCurrentSession();
    Query query = session.createQuery("from domain.Blog");
    List<Blog> blogs = query.list();
    return blogs;
  }

  public Blog getBlogById(int id) {
    Session session = this.sessionFactory.getCurrentSession();
    Blog blog = (Blog) session.get(Blog.class,id);
    return blog;
  }

  public void removeBlog(int id) {
    Session session = this.sessionFactory.getCurrentSession();
    Blog blog = (Blog) session.get(Blog.class,id);
    if (blog != null) {
      session.delete(blog);
    }
  }
}
