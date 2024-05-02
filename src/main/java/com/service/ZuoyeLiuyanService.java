package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoyeLiuyanEntity;
import java.util.Map;

/**
 * 作业留言 服务类
 * @author 
 * @since 2021-04-21
 */
public interface ZuoyeLiuyanService extends IService<ZuoyeLiuyanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}