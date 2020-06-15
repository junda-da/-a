package com.xms.gmall.user.mapper;

import com.xms.gmall.user.bean.UmsMenber;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMenber> {
    List<UmsMenber> selectAllUser();
}
