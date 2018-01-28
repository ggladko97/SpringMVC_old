package controllers;

import domain.Line;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.LineService;

/**
 * Created by ggladko97 on 13.05.17.
 */

@Controller
@RequestMapping(value = "/trips")
public class LineController {

  @Autowired
  private LineService service;

  /**
   * Initializing available approved trips
   *
   * @param model throwing list of lines to view
   * @return itselvs
   */
  @RequestMapping("/")
  public String initHome(ModelMap model) {
    List<Line> trips = service.listLine();
    model.addAttribute("trips", trips);
    return "trips";
  }

  /**
   * Redirects to the page for trip proposal
   *
   * @return -redirection
   */
  @RequestMapping(value = "/addTrip", method = RequestMethod.GET)
  public String redirectToAddTrip() {
    return "addTrip";
  }

  /**
   * Decrease number of tickets for particular Line, redirect to Buy page for client info
   *
   * @param id - trip's Id
   * @param modelMap - for transfer
   * @return - redirection to the buy info page about the client or goes back
   */
  @RequestMapping(value = "/buy-ticket-{id}")
  public String redirectToAddTrip(@PathVariable int id, ModelMap modelMap) {
    if (service.reserveTicket(id)) {
      modelMap.addAttribute("tripId", id);
      return "buyPage";
    }
    return "trips";
  }
}
