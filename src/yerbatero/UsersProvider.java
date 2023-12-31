/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yerbatero;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro Gutierrez Muñoz; Samuel Betancur Diosa
 * @grade 11C
 */
public class UsersProvider {
    private List<User> users;
    
    public UsersProvider() {
        users = new ArrayList<>();
        users.add(new User.Builder()
            .setUsername("admin")
            .setPassword("admin123")
            .setRole("Administrator")
            .build());
        users.add(new User.Builder()
            .setUsername("user")
            .setPassword("user123")
            .setRole("Student")
            .build());
    }
    
    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
    
    public List<User> getUsers() {
        return users;
    }
    
    public void createUser(String username, String password, String role) {
        users.add(new User.Builder()
            .setUsername(username)
            .setPassword(password)
            .setRole(role)
            .build());
    }
    
    /*public List<User> getAdmins() {
        List<User> admins = new ArrayList<>();
        for (User user : users) {
            if (user.getRole().equals("admin")) {
                admins.add(user);
            }
        }
        return admins;
    }*/
}
