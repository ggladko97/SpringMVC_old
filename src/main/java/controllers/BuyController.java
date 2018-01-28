package controllers;

import domain.Client;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import service.ClientService;

/**
 * Created by ggladko97 on 14.05.17.
 */
@Controller
@RequestMapping("/trips")
public class BuyController {

  @Autowired
  private ClientService service;

  /**
   * Updating data about client
   * @param ticket - object with data about client
   * @param modelMap - for transfer
   * @return redirection to the main page
   */
  @RequestMapping(value = "/buy-page", method = RequestMethod.POST)
  public ModelAndView buy(@ModelAttribute(value = "ticket") /*@Valid*/ Client ticket, ModelMap modelMap) {
    if (!ticket.getFirstName().equals(null)){
      //throw error something goes wrong

    }

    service.insert(ticket);
    return new ModelAndView("redirect:/");
  }
}
