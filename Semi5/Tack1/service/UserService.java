package Semi5.Tack1.service;

import Semi5.Tack1.model.User;

public interface UserService {
     void save(User user);
     boolean credit(User user, int creditSum);
}
