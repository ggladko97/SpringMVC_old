package controllers;

import domain.Blog;
import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import service.BlogService;

/**
 * Created by ggladko97 on 12.05.17.
 */

/*
*
* Does not work
* 406 error still
*
*
* */
@RestController
@RequestMapping(value = "/blog")
public class BlogRestController {

  @Autowired
  private BlogService service;

  @RequestMapping(value = "simple", headers = {
      "ACCEPT=*/*"}, method = RequestMethod.GET, produces = {"application/json"})
  public @ResponseBody Map<String, Integer> simple() {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("dsa", 1);
    return map;
  }

  @RequestMapping(value = "/loadall", method = RequestMethod.GET, headers = "Accept=application/json")
  public Blog loadBlog() {
    return service.getBlogById(0);
  }

  @RequestMapping(value = "/load", method = RequestMethod.GET, produces = "application/json")
  @ResponseBody
  public List<Blog> getBlog() {
    List<Blog> l = service.listBlog();
    for (Blog b : l) {
      System.out.println(b.toString());
    }
    return l;
  }
}
