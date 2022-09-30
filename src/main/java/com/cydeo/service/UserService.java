package com.cydeo.service;

import com.cydeo.dto.UserDTO;

public interface UserService extends CrudService <UserDTO, String>{

    //<UserDTO, String> object and string since will looking for it by String

}
