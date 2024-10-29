package com.dao;

import com.entity.YouxixiazaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouxixiazaiVO;
import com.entity.view.YouxixiazaiView;


/**
 * 游戏下载
 * 
 * @author 
 * @email 
 * @date 2021-03-17 13:36:32
 */
public interface YouxixiazaiDao extends BaseMapper<YouxixiazaiEntity> {
	
	List<YouxixiazaiVO> selectListVO(@Param("ew") Wrapper<YouxixiazaiEntity> wrapper);
	
	YouxixiazaiVO selectVO(@Param("ew") Wrapper<YouxixiazaiEntity> wrapper);
	
	List<YouxixiazaiView> selectListView(@Param("ew") Wrapper<YouxixiazaiEntity> wrapper);

	List<YouxixiazaiView> selectListView(Pagination page,@Param("ew") Wrapper<YouxixiazaiEntity> wrapper);
	
	YouxixiazaiView selectView(@Param("ew") Wrapper<YouxixiazaiEntity> wrapper);
	
}
