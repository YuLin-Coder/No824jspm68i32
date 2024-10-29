package com.entity.vo;

import com.entity.YouxixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 游戏信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-17 13:36:32
 */
public class YouxixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 游戏分类
	 */
	
	private String youxifenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 开发商
	 */
	
	private String kaifashang;
		
	/**
	 * 价格
	 */
	
	private String jiage;
		
	/**
	 * 游戏简介
	 */
	
	private String youxijianjie;
		
	/**
	 * 上市日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shangshiriqi;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
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
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
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
	 * 设置：价格
	 */
	 
	public void setJiage(String jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public String getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：游戏简介
	 */
	 
	public void setYouxijianjie(String youxijianjie) {
		this.youxijianjie = youxijianjie;
	}
	
	/**
	 * 获取：游戏简介
	 */
	public String getYouxijianjie() {
		return youxijianjie;
	}
				
	
	/**
	 * 设置：上市日期
	 */
	 
	public void setShangshiriqi(Date shangshiriqi) {
		this.shangshiriqi = shangshiriqi;
	}
	
	/**
	 * 获取：上市日期
	 */
	public Date getShangshiriqi() {
		return shangshiriqi;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
