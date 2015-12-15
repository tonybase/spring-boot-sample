package io.tonyc.springboot.service.impl;

import io.tonyc.springboot.domain.User;
import io.tonyc.springboot.repository.UserRespository;
import io.tonyc.springboot.service.UserService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Tony on 2015/12/13.
 */
@Service
public class UserServiceImpl implements UserService {

    @Inject
    private UserRespository userRespository;

    @Override
    public List<User> findAll() {
        return userRespository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRespository.findOne(id);
    }

}
