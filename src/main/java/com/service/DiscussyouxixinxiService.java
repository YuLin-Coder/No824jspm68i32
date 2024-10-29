package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyouxixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyouxixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyouxixinxiView;


/**
 * 游戏信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-17 13:36:32
 */
public interface DiscussyouxixinxiService extends IService<DiscussyouxixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyouxixinxiVO> selectListVO(Wrapper<DiscussyouxixinxiEntity> wrapper);
   	
   	DiscussyouxixinxiVO selectVO(@Param("ew") Wrapper<DiscussyouxixinxiEntity> wrapper);
   	
   	List<DiscussyouxixinxiView> selectListView(Wrapper<DiscussyouxixinxiEntity> wrapper);
   	
   	DiscussyouxixinxiView selectView(@Param("ew") Wrapper<DiscussyouxixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyouxixinxiEntity> wrapper);
   	
}

