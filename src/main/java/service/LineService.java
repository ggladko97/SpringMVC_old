package service;

import dao.LineDao;

/**
 * Created by ggladko97 on 14.05.17.
 */
public interface LineService extends LineDao {

  boolean reserveTicket(int lineId);
}
