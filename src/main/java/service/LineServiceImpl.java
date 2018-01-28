package service;

import dao.LineDao;
import domain.Line;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ggladko97 on 14.05.17.
 */
@Service
public class LineServiceImpl implements LineService {

  @Autowired
  private LineDao lineDao;

  @Transactional
  public void insert(Line line) {
    lineDao.insert(line);
  }
  @Transactional
  public void updateLine(Line line) {
    lineDao.updateLine(line);
  }
  @Transactional
  public List<Line> listLine() {
    return lineDao.listLine();
  }
  @Transactional
  public Line getLineById(int id) {
    return lineDao.getLineById(id);
  }
  @Transactional
  public void removeLine(int id) {
    lineDao.removeLine(id);
  }

  /**
   * Decrease number of available tickets
   * @param lineId - particular trip we want to reserve place
   * @return - true - if there are available places
   */
  @Transactional
  public boolean reserveTicket(int lineId) {
    Line line = getLineById(lineId);
    System.out.println("Im hereee");
    if (line.getTickets() == 0) {
      return false;
    } else {
      System.out.println("Im hereee");
      int tickets = line.getTickets();
      line.setTickets(tickets - 1);
      lineDao.updateLine(line);

      return true;
    }
  }
}
