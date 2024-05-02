package com.entity.view;

import com.entity.YonghuzuoyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 回答作业
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-21
 */
@TableName("yonghuzuoye")
public class YonghuzuoyeView extends YonghuzuoyeEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 yonghu
			/**
			* 姓名
			*/
			private String yonghuName;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;

		//级联表 zuoye
			/**
			* 作业名称
			*/
			private String zuoyeName;
			/**
			* 作业类型
			*/
			private Integer zuoyeTypes;
				/**
				* 作业类型的值
				*/
				private String zuoyeValue;
			/**
			* 作业文件
			*/
			private String zuoyeFile;
			@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
			@DateTimeFormat
			/**
			* 作业截止时间
			*/
			private Date zuoyeEndTime;
			/**
			* 作业图片
			*/
			private String zuoyePhoto;
			/**
			* 作业详情
			*/
			private String zuoyeContent;

	public YonghuzuoyeView() {

	}

	public YonghuzuoyeView(YonghuzuoyeEntity yonghuzuoyeEntity) {
		try {
			BeanUtils.copyProperties(this, yonghuzuoyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}























				//级联表的get和set yonghu
					/**
					* 获取： 姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}





				//级联表的get和set zuoye
					/**
					* 获取： 作业名称
					*/
					public String getZuoyeName() {
						return zuoyeName;
					}
					/**
					* 设置： 作业名称
					*/
					public void setZuoyeName(String zuoyeName) {
						this.zuoyeName = zuoyeName;
					}
					/**
					* 获取： 作业类型
					*/
					public Integer getZuoyeTypes() {
						return zuoyeTypes;
					}
					/**
					* 设置： 作业类型
					*/
					public void setZuoyeTypes(Integer zuoyeTypes) {
						this.zuoyeTypes = zuoyeTypes;
					}


						/**
						* 获取： 作业类型的值
						*/
						public String getZuoyeValue() {
							return zuoyeValue;
						}
						/**
						* 设置： 作业类型的值
						*/
						public void setZuoyeValue(String zuoyeValue) {
							this.zuoyeValue = zuoyeValue;
						}
					/**
					* 获取： 作业文件
					*/
					public String getZuoyeFile() {
						return zuoyeFile;
					}
					/**
					* 设置： 作业文件
					*/
					public void setZuoyeFile(String zuoyeFile) {
						this.zuoyeFile = zuoyeFile;
					}
					/**
					* 获取： 作业截止时间
					*/
					public Date getZuoyeEndTime() {
						return zuoyeEndTime;
					}
					/**
					* 设置： 作业截止时间
					*/
					public void setZuoyeEndTime(Date zuoyeEndTime) {
						this.zuoyeEndTime = zuoyeEndTime;
					}
					/**
					* 获取： 作业图片
					*/
					public String getZuoyePhoto() {
						return zuoyePhoto;
					}
					/**
					* 设置： 作业图片
					*/
					public void setZuoyePhoto(String zuoyePhoto) {
						this.zuoyePhoto = zuoyePhoto;
					}
					/**
					* 获取： 作业详情
					*/
					public String getZuoyeContent() {
						return zuoyeContent;
					}
					/**
					* 设置： 作业详情
					*/
					public void setZuoyeContent(String zuoyeContent) {
						this.zuoyeContent = zuoyeContent;
					}













}
