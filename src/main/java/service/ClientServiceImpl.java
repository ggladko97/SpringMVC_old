package service;

import dao.ClientDao;
import domain.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ggladko97 on 14.05.17.
 */
@Service
public class ClientServiceImpl implements ClientService {

  @Autowired
  private ClientDao clientDao;

  @Transactional
  public void insert(Client client) {
    clientDao.insert(client);
  }
  @Transactional
  public void updateClient(Client client) {
    clientDao.updateClient(client);
  }
  @Transactional
  public List<Client> listClient() {
    return clientDao.listClient();
  }
  @Transactional
  public Client getClientById(int id) {
    return clientDao.getClientById(id);
  }
  @Transactional
  public void removeClient(int id) {
    clientDao.removeClient(id);
  }
}
