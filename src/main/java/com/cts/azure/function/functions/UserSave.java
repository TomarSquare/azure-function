package com.cts.azure.function.functions;

import com.cts.azure.function.domains.User;
import com.cts.azure.function.service.UserService;
import com.cts.azure.function.util.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class UserSave implements Function<User, ResponseDTO> {

    @Autowired
    private UserService userService;


    @Override
    public ResponseDTO apply(User user) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setData(user);
        userService.saveUser(user);
        return responseDTO;
    }
}
