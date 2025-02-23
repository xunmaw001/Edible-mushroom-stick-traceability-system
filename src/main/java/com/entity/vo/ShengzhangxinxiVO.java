package com.entity.vo;

import com.entity.ShengzhangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 生长信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-25 10:56:18
 */
public class ShengzhangxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 食用菌
	 */
	
	private String shiyongjun;
		
	/**
	 * 当前温度
	 */
	
	private Float dangqianwendu;
		
	/**
	 * 当前湿度
	 */
	
	private Float dangqianshidu;
		
	/**
	 * 生长情况
	 */
	
	private String shengzhangqingkuang;
		
	/**
	 * 更新时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gengxinshijian;
				
	
	/**
	 * 设置：食用菌
	 */
	 
	public void setShiyongjun(String shiyongjun) {
		this.shiyongjun = shiyongjun;
	}
	
	/**
	 * 获取：食用菌
	 */
	public String getShiyongjun() {
		return shiyongjun;
	}
				
	
	/**
	 * 设置：当前温度
	 */
	 
	public void setDangqianwendu(Float dangqianwendu) {
		this.dangqianwendu = dangqianwendu;
	}
	
	/**
	 * 获取：当前温度
	 */
	public Float getDangqianwendu() {
		return dangqianwendu;
	}
				
	
	/**
	 * 设置：当前湿度
	 */
	 
	public void setDangqianshidu(Float dangqianshidu) {
		this.dangqianshidu = dangqianshidu;
	}
	
	/**
	 * 获取：当前湿度
	 */
	public Float getDangqianshidu() {
		return dangqianshidu;
	}
				
	
	/**
	 * 设置：生长情况
	 */
	 
	public void setShengzhangqingkuang(String shengzhangqingkuang) {
		this.shengzhangqingkuang = shengzhangqingkuang;
	}
	
	/**
	 * 获取：生长情况
	 */
	public String getShengzhangqingkuang() {
		return shengzhangqingkuang;
	}
				
	
	/**
	 * 设置：更新时间
	 */
	 
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}
			
}
