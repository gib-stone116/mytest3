package cn.itcast.mapper;

import cn.itcast.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * describe:
 *
 * @author stone
 * @date 2019/01/16
 */
@Repository
public interface UserMapper {

//    @Select("select * from user")
    List<User> findAll();
}
