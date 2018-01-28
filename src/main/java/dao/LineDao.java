package dao;

import domain.Line;
import java.util.List;

/**
 * Created by ggladko97 on 13.05.17.
 */
public interface LineDao {
  void insert(Line line);
  void updateLine(Line line);
  List<Line> listLine();
  Line getLineById(int id);
  void removeLine(int id);
}
