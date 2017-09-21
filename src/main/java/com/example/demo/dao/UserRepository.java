package com.example.demo.dao;

import com.example.demo.entiy.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 操作对应实体类的接口
 * 继承JpaRepository
 */
public interface UserRepository extends JpaRepository<UserInfo,Integer>{

    //记住，永远不要给我在这里写方法，除非我交给你写
}
