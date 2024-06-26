package com.dao;

import com.entity.JiaoanCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoanCollectionView;

/**
 * 教案收藏 Dao 接口
 *
 * @author 
 * @since 2021-04-21
 */
public interface JiaoanCollectionDao extends BaseMapper<JiaoanCollectionEntity> {

   List<JiaoanCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
