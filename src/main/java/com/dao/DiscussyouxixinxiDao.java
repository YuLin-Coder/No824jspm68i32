package com.dao;

import com.entity.DiscussyouxixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyouxixinxiVO;
import com.entity.view.DiscussyouxixinxiView;


/**
 * 游戏信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-17 13:36:32
 */
public interface DiscussyouxixinxiDao extends BaseMapper<DiscussyouxixinxiEntity> {
	
	List<DiscussyouxixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyouxixinxiEntity> wrapper);
	
	DiscussyouxixinxiVO selectVO(@Param("ew") Wrapper<DiscussyouxixinxiEntity> wrapper);
	
	List<DiscussyouxixinxiView> selectListView(@Param("ew") Wrapper<DiscussyouxixinxiEntity> wrapper);

	List<DiscussyouxixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyouxixinxiEntity> wrapper);
	
	DiscussyouxixinxiView selectView(@Param("ew") Wrapper<DiscussyouxixinxiEntity> wrapper);
	
}
