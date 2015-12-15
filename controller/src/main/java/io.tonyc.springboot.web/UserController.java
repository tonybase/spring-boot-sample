package io.tonyc.springboot.endpoint;

import io.tonyc.springboot.domain.User;
import io.tonyc.springboot.service.UserService;
import io.tonyc.web.common.bean.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Tony on 2015/12/13.
 */
@RestController
@RequestMapping(value = Constants.URI_API + "/users")
public class UserController {

    @Inject
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> users() {
        List<User> entities = userService.findAll();
        return new ResponseEntity(entities, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> get(@Valid @PathVariable Long id) {
        User user = userService.findById(id);
        return new ResponseEntity(user, HttpStatus.OK);
    }

}
