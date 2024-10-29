package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YouxixiazaiDao;
import com.entity.YouxixiazaiEntity;
import com.service.YouxixiazaiService;
import com.entity.vo.YouxixiazaiVO;
import com.entity.view.YouxixiazaiView;

@Service("youxixiazaiService")
public class YouxixiazaiServiceImpl extends ServiceImpl<YouxixiazaiDao, YouxixiazaiEntity> implements YouxixiazaiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxixiazaiEntity> page = this.selectPage(
                new Query<YouxixiazaiEntity>(params).getPage(),
                new EntityWrapper<YouxixiazaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxixiazaiEntity> wrapper) {
		  Page<YouxixiazaiView> page =new Query<YouxixiazaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxixiazaiVO> selectListVO(Wrapper<YouxixiazaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxixiazaiVO selectVO(Wrapper<YouxixiazaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxixiazaiView> selectListView(Wrapper<YouxixiazaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxixiazaiView selectView(Wrapper<YouxixiazaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
