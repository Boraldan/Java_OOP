package Semi5.service;

import Semi5.model.User;

public interface UserService {
     void save(User user);
     boolean credit(User user, int creditSum);
}
