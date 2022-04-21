package com.usian.mapper;

import com.usian.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper {

    @Select("select * from user,xinxi where user.xid=xinxi.id")
    List<User> fiandpage();

    @Insert("INSERT INTO `p9db`.`user`(`id`, `zhanghao`, `password`, `xid`) VALUES (null, #{zhanghao}, '1234', 1)")
    void add(User user);

    void dupdate(User user);

    void del(Integer id);
}
