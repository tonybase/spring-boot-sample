package io.tonyc.springboot.service;

import io.tonyc.springboot.domain.User;

import java.util.List;

/**
 * Created by Tony on 2015/12/13.
 */
public interface UserService {

    List<User> findAll();

    User findById(Long id);

}
