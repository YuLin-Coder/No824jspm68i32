package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxixinxiView;


/**
 * 游戏信息
 *
 * @author 
 * @email 
 * @date 2021-03-17 13:36:32
 */
public interface YouxixinxiService extends IService<YouxixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxixinxiVO> selectListVO(Wrapper<YouxixinxiEntity> wrapper);
   	
   	YouxixinxiVO selectVO(@Param("ew") Wrapper<YouxixinxiEntity> wrapper);
   	
   	List<YouxixinxiView> selectListView(Wrapper<YouxixinxiEntity> wrapper);
   	
   	YouxixinxiView selectView(@Param("ew") Wrapper<YouxixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxixinxiEntity> wrapper);
   	
}

