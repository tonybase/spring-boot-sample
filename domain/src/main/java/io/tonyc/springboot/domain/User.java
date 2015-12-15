package io.tonyc.springboot.domain;

import io.tonyc.web.common.entity.AbstractAuditingEntity;
import io.tonyc.web.common.entity.AbstractIdentifiableEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Tony on 2015/12/13.
 */
@Entity
@Table(name = "t_users")
public class User extends AbstractIdentifiableEntity {

    private String username;

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
