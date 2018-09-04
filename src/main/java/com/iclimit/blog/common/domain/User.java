package com.iclimit.blog.common.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by limit on 2018/08/29.
 * @author limit
 */
@Data
@Table(name="userinfo")
public class User implements Serializable{

    private static final long serialVersionUID = 4645265640845314288L;

    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "id")
    private String id= UUID.randomUUID().toString();

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Transient
    private int sex;

    @Transient
    private float height;

    @Transient
    private double weight;

    @Transient
    private String email;

    @Transient
    private String phone;

    @Transient
    private String status;

    @Transient
    private Date createTime;

    @Transient
    private Date modifyTime;

    @Transient
    private Date lastLoginTime;

    @Transient
    private String description;

    @Transient
    private List<String> role;

}
