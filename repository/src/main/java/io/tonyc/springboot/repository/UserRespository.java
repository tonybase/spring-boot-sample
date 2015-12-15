package io.tonyc.springboot.repository;

import io.tonyc.springboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tony on 2015/12/13.
 */
@Repository
public interface UserRespository extends JpaRepository<User, Long> {

}
