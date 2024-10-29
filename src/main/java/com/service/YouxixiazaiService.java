package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YouxixiazaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YouxixiazaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YouxixiazaiView;


/**
 * 游戏下载
 *
 * @author 
 * @email 
 * @date 2021-03-17 13:36:32
 */
public interface YouxixiazaiService extends IService<YouxixiazaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YouxixiazaiVO> selectListVO(Wrapper<YouxixiazaiEntity> wrapper);
   	
   	YouxixiazaiVO selectVO(@Param("ew") Wrapper<YouxixiazaiEntity> wrapper);
   	
   	List<YouxixiazaiView> selectListView(Wrapper<YouxixiazaiEntity> wrapper);
   	
   	YouxixiazaiView selectView(@Param("ew") Wrapper<YouxixiazaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YouxixiazaiEntity> wrapper);
   	
}

