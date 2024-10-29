package com.entity.view;

import com.entity.YouxixiazaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 游戏下载
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-17 13:36:32
 */
@TableName("youxixiazai")
public class YouxixiazaiView  extends YouxixiazaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouxixiazaiView(){
	}
 
 	public YouxixiazaiView(YouxixiazaiEntity youxixiazaiEntity){
 	try {
			BeanUtils.copyProperties(this, youxixiazaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
