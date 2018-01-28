package controllers;

import domain.Blog;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import service.BlogService;
import utils.TxtUtils;

/**
 * Created by ggladko97 on 13.05.17.
 */
@Controller
@RequestMapping("/")
public class BlogController {
  //
  //private static final Logger logger = Logger.getLogger(BlogController.class);
  private int consTant = 10000;
  @Autowired
  private BlogService service;

  /**
   * Method for loading main page
   *
   * @param model - for tranfering list of blogs to view in order to show them
   * @return - main page
   */
  @RequestMapping("/")
  public String initHome(ModelMap model) {
    List<Blog> blogs = service.listBlog();
    model.addAttribute("blogs", blogs);
    return "index";
  }

  @RequestMapping(value = "/get-by-id/{id}", method = RequestMethod.GET)
  public String getBlogById(ModelMap model, @PathVariable int id) {
    Blog blogById = service.getBlogById(id);
    model.addAttribute("blog", blogById);
    return "index";
  }

  /**
   * Redirection to the page for adding new blog
   *
   * @return redirection
   */
  @RequestMapping(value = "/reg", method = RequestMethod.GET)
  public String goRegister() {
    return "reg";
  }

  /**
   * Add blog to the database
   *
   * @param bloger - thrown to us from model as model attribute
   * @param result - validation result (doesn't work properly)
   * @return - redirection to the home page (with updated blogs)
   */
  @RequestMapping(value = "/add-blog", method = RequestMethod.POST)
  public ModelAndView addBlog(@ModelAttribute("bloger") /*@Valid*/ Blog bloger,
      BindingResult result) {
    //just to test logger
    //if(logger.isDebugEnabled()){
    //  logger.debug("Debug mode is enabled");
    //}

    //if (result.hasErrors()) {
    //  logger.error("add blog throws error in bindeng result:" + result.getFieldErrors());
    //  //return new ModelAndView("redirect:/reg");
    //} else {
    //Blog blogNew = new Blog();
    //blogNew.setUserName(blog.getUserName());
    //blogNew.setDate(blog.getDate());
    //blogNew.setContent(blog.getContent());
    service.insert(bloger);

    return new ModelAndView("redirect:/");
    //}
  }

  /**
   * Removes particular blog
   *
   * @param id - blog's Id
   * @return - redirection to main page
   */
  @RequestMapping(value = "/delete-{id}", method = RequestMethod.GET)
  public ModelAndView removeBlog(@PathVariable int id) {
    System.out.println("I'm removing:");
    service.removeBlog(id);
    return new ModelAndView("redirect:/");
  }

  @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
  public ModelAndView uploadFile(@RequestParam("file") MultipartFile file, ModelMap modelMap) {
    if (!file.isEmpty()) {

      try {
        InputStream inputStream = file.getInputStream();
        String content = TxtUtils.stringFromInputStream(inputStream);
        Blog anonimusBlog = new Blog();

        anonimusBlog.setId(consTant);
        anonimusBlog.setUserName("Anonimus");
        anonimusBlog.setDate(new Date(2017, 1, 1));
        if (content.length() < 201) {
          anonimusBlog.setContent(content);
        }
        service.insert(anonimusBlog);
        consTant += 1;
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    return new ModelAndView("redirect:/");
  }
}
