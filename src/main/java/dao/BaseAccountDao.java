package dao;

import bean.EtAdmin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseAccountDao {
    /*通过账号和密码查询账户的方法*/
    EtAdmin searchNameAndPassword(@Param("name") String name, @Param("password") String password);
}
