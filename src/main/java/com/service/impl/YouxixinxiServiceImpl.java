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


import com.dao.YouxixinxiDao;
import com.entity.YouxixinxiEntity;
import com.service.YouxixinxiService;
import com.entity.vo.YouxixinxiVO;
import com.entity.view.YouxixinxiView;

@Service("youxixinxiService")
public class YouxixinxiServiceImpl extends ServiceImpl<YouxixinxiDao, YouxixinxiEntity> implements YouxixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YouxixinxiEntity> page = this.selectPage(
                new Query<YouxixinxiEntity>(params).getPage(),
                new EntityWrapper<YouxixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YouxixinxiEntity> wrapper) {
		  Page<YouxixinxiView> page =new Query<YouxixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YouxixinxiVO> selectListVO(Wrapper<YouxixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YouxixinxiVO selectVO(Wrapper<YouxixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YouxixinxiView> selectListView(Wrapper<YouxixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YouxixinxiView selectView(Wrapper<YouxixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
