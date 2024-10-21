package com.dao;

import com.entity.ZhaopinYuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaopinYuyueView;

/**
 * 面试申请 Dao 接口
 *
 * @author 
 */
public interface ZhaopinYuyueDao extends BaseMapper<ZhaopinYuyueEntity> {

   List<ZhaopinYuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
