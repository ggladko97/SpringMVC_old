package dao;

import domain.Client;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * Created by ggladko97 on 14.05.17.
 */
@Repository
public class ClientDaoImpl implements ClientDao {



  private SessionFactory sessionFactory;


  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  public void insert(Client client) {
    Session session = this.sessionFactory.getCurrentSession();
    session.persist(client);
  }

  public void updateClient(Client client) {
    Session session = this.sessionFactory.getCurrentSession();
    session.update(client);
  }

  public List<Client> listClient() {
    Session session = this.sessionFactory.getCurrentSession();
    Query query = session.createQuery("from domain.Client");
    List<Client> clients = query.list();
    return clients;
  }

  public Client getClientById(int id) {
    Session session = this.sessionFactory.getCurrentSession();
    return (Client) session.get(Client.class,id);
  }

  public void removeClient(int id) {
    Session session = this.sessionFactory.getCurrentSession();
    Client client = (Client) session.get(Client.class,id);
    if (client != null) {
      session.delete(client);
    }
  }
}
