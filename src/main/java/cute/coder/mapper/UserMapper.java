package cute.coder.mapper;

import cute.coder.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by little Stone
 * Date 2019/5/15 Time 10:05
 */
public interface UserMapper {

	User queryUserByUsernameAndPassword(@Param("username") String username,
                                        @Param("password") String password);
}
