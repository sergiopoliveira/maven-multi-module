package oliveira.sergio.controllers;

import entities.User;
import guru.springframework.domain.UserCommand;
import oliveira.sergio.converters.UserMapper;

public class UserController {

    User saveUser(UserCommand command){

        //fake impl
        return UserMapper.INSTANCE.userCommandToUser(command);
    }
}
