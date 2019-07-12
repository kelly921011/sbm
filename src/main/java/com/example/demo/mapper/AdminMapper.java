package com.example.demo.mapper;

import com.example.demo.entity.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdminMapper {
    /**
     * 查询客服列表
     * @param permissions
     * @return
     */
    public List<Admin> findList(@Param("permissions") String permissions);
}
