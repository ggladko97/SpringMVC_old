package dao;

import domain.Blog;
import java.util.List;

/**
 * Created by ggladko97 on 12.05.17.
 */
public interface BlogDao {
  void insert(Blog blog);
  void updateBlog(Blog blog);
  List<Blog> listBlog();
  Blog getBlogById(int id);
  void removeBlog(int id);
}
