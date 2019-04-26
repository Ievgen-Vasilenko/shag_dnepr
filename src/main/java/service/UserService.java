package service;

import dao.UserDao;
import models.User;
import org.springframework.stereotype.Service;
import service.implService.ImplUserService;

import java.util.List;

@Service("ImplUserService")
public class UserService implements ImplUserService {

    private UserDao userDao = new UserDao();
    private User user = new User();

    @Override
    public User findUser(int id) {
        return userDao.findById(id,user);
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.delete(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.update(user);
    }

    @Override
    public List<User> findAllUser() {
        return userDao.findAll(user);
    }

    @Override
    public List<User> findUderLogin(String login) {
        return userDao.findUserLogin(login);
    }
}
