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


import com.dao.DiscussyouxixinxiDao;
import com.entity.DiscussyouxixinxiEntity;
import com.service.DiscussyouxixinxiService;
import com.entity.vo.DiscussyouxixinxiVO;
import com.entity.view.DiscussyouxixinxiView;

@Service("discussyouxixinxiService")
public class DiscussyouxixinxiServiceImpl extends ServiceImpl<DiscussyouxixinxiDao, DiscussyouxixinxiEntity> implements DiscussyouxixinxiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyouxixinxiEntity> page = this.selectPage(
                new Query<DiscussyouxixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyouxixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyouxixinxiEntity> wrapper) {
		  Page<DiscussyouxixinxiView> page =new Query<DiscussyouxixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyouxixinxiVO> selectListVO(Wrapper<DiscussyouxixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyouxixinxiVO selectVO(Wrapper<DiscussyouxixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyouxixinxiView> selectListView(Wrapper<DiscussyouxixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyouxixinxiView selectView(Wrapper<DiscussyouxixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
