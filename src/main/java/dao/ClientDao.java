package dao;

import domain.Blog;
import domain.Client;
import java.util.List;

/**
 * Created by ggladko97 on 14.05.17.
 */
public interface ClientDao {

    void insert(Client client);
    void updateClient(Client client);
    List<Client> listClient();
    Client getClientById(int id);
    void removeClient(int id);

}
