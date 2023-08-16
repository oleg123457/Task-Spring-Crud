package spring.Service;

import spring.Model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public User getUserById(int id);

    public void save(User user);

    public void update(int id, User updateUser);

    public void delete(int id);
}
