package com.entity.vo;

import com.entity.JunfangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 菌房信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-25 10:56:18
 */
public class JunfangxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 菌房名称
	 */
	
	private String junfangmingcheng;
		
	/**
	 * 所在位置
	 */
	
	private String suozaiweizhi;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 图片展示
	 */
	
	private String tupianzhanshi;
				
	
	/**
	 * 设置：菌房名称
	 */
	 
	public void setJunfangmingcheng(String junfangmingcheng) {
		this.junfangmingcheng = junfangmingcheng;
	}
	
	/**
	 * 获取：菌房名称
	 */
	public String getJunfangmingcheng() {
		return junfangmingcheng;
	}
				
	
	/**
	 * 设置：所在位置
	 */
	 
	public void setSuozaiweizhi(String suozaiweizhi) {
		this.suozaiweizhi = suozaiweizhi;
	}
	
	/**
	 * 获取：所在位置
	 */
	public String getSuozaiweizhi() {
		return suozaiweizhi;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：图片展示
	 */
	 
	public void setTupianzhanshi(String tupianzhanshi) {
		this.tupianzhanshi = tupianzhanshi;
	}
	
	/**
	 * 获取：图片展示
	 */
	public String getTupianzhanshi() {
		return tupianzhanshi;
	}
			
}
