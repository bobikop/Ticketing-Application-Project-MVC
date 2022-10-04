package com.cydeo.service;

import com.cydeo.dto.UserDTO;

import java.util.List;

public interface UserService extends CrudService<UserDTO,String>{

    //<UserDTO, String> object and string since will looking for it by String

    List<UserDTO> findManagers();
}
