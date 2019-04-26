package service.implService;

import models.User;

import java.util.List;

public interface ImplUserService {
    User findUser(int id);

    void saveUser(User user);

    void deleteUser(User user);

    void updateUser(User user);

    List<User> findAllUser();

    List<User> findUderLogin(String login);
}
