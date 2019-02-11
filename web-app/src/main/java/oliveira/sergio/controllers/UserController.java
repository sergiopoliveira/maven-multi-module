package oliveira.sergio.controllers;

import entities.User;
import guru.springframework.domain.UserCommand;

public class UserController {

    User saveUser(UserCommand command){

        //fake impl
        return new User();
    }
}
