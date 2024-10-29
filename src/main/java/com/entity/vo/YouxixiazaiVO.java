package com.entity.vo;

import com.entity.YouxixiazaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 游戏下载
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-17 13:36:32
 */
public class YouxixiazaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 游戏分类
	 */
	
	private String youxifenlei;
		
	/**
	 * 游戏名称
	 */
	
	private String youximingcheng;
		
	/**
	 * 开发商
	 */
	
	private String kaifashang;
		
	/**
	 * 游戏软件
	 */
	
	private String youxiruanjian;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
				
	
	/**
	 * 设置：游戏分类
	 */
	 
	public void setYouxifenlei(String youxifenlei) {
		this.youxifenlei = youxifenlei;
	}
	
	/**
	 * 获取：游戏分类
	 */
	public String getYouxifenlei() {
		return youxifenlei;
	}
				
	
	/**
	 * 设置：游戏名称
	 */
	 
	public void setYouximingcheng(String youximingcheng) {
		this.youximingcheng = youximingcheng;
	}
	
	/**
	 * 获取：游戏名称
	 */
	public String getYouximingcheng() {
		return youximingcheng;
	}
				
	
	/**
	 * 设置：开发商
	 */
	 
	public void setKaifashang(String kaifashang) {
		this.kaifashang = kaifashang;
	}
	
	/**
	 * 获取：开发商
	 */
	public String getKaifashang() {
		return kaifashang;
	}
				
	
	/**
	 * 设置：游戏软件
	 */
	 
	public void setYouxiruanjian(String youxiruanjian) {
		this.youxiruanjian = youxiruanjian;
	}
	
	/**
	 * 获取：游戏软件
	 */
	public String getYouxiruanjian() {
		return youxiruanjian;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
			
}
