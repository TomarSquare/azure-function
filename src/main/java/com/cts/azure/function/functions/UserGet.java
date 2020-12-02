package com.cts.azure.function.functions;


import com.cts.azure.function.domains.User;
import com.cts.azure.function.service.UserService;
import com.cts.azure.function.util.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class UserGet implements Function<Integer, ResponseDTO> {

    @Autowired
    private UserService userService;

    @Override
    public ResponseDTO apply(Integer id) {
        ResponseDTO responseDTO=new ResponseDTO();
        User user= userService.getUserById(id);
        responseDTO.setData(user);
        return responseDTO;
    }


}
