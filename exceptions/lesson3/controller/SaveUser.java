package lesson3.controller;

import lesson3.moduls.NoFolder;
import lesson3.moduls.User;

public interface SaveUser {
    String saveUser(User user) throws NoFolder;
}