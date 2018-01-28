package service;

import dao.BlogDao;
import domain.Blog;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ggladko97 on 12.05.17.
 */
@Service
public class BlogServiceImpl implements BlogService {

  @Autowired
  private BlogDao blogDao;

  @Transactional
  public void insert(Blog blog) {
    blogDao.insert(blog);
  }
  @Transactional
  public void updateBlog(Blog blog) {
    blogDao.updateBlog(blog);
  }
  @Transactional
  public List<Blog> listBlog() {
    return blogDao.listBlog();
  }
  @Transactional
  public Blog getBlogById(int id) {
    return blogDao.getBlogById(id);
  }
  @Transactional
  public void removeBlog(int id) {
    blogDao.removeBlog(id);
  }
}
