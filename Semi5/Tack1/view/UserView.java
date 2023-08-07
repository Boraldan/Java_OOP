package Semi5.Tack1.view;

import Semi5.Tack1.model.User;
import Semi5.Tack1.service.UserService;
import Semi5.Tack1.service.UserServiceImpl;

public class UserView {
    private UserService userService = new UserServiceImpl();
    public void saveUser(String name, int age , float salary){
        userService.save(new User(name));
    }
    public void creditPrint(User user, int creditSum){
        System.out.println(userService.credit(user,creditSum));
    }
}
