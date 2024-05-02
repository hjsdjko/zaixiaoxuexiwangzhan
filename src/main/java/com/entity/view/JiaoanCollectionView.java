package com.entity.view;

import com.entity.JiaoanCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 教案收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-21
 */
@TableName("jiaoan_collection")
public class JiaoanCollectionView extends JiaoanCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 jiaoan
			/**
			* 教案名称
			*/
			private String jiaoanName;
			/**
			* 教案类型
			*/
			private Integer jiaoanTypes;
				/**
				* 教案类型的值
				*/
				private String jiaoanValue;
			/**
			* 教案文件
			*/
			private String jiaoanFile;
			/**
			* 教案图片
			*/
			private String jiaoanPhoto;
			/**
			* 教案详情
			*/
			private String jiaoanContent;

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

	public JiaoanCollectionView() {

	}

	public JiaoanCollectionView(JiaoanCollectionEntity jiaoanCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, jiaoanCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set jiaoan
					/**
					* 获取： 教案名称
					*/
					public String getJiaoanName() {
						return jiaoanName;
					}
					/**
					* 设置： 教案名称
					*/
					public void setJiaoanName(String jiaoanName) {
						this.jiaoanName = jiaoanName;
					}
					/**
					* 获取： 教案类型
					*/
					public Integer getJiaoanTypes() {
						return jiaoanTypes;
					}
					/**
					* 设置： 教案类型
					*/
					public void setJiaoanTypes(Integer jiaoanTypes) {
						this.jiaoanTypes = jiaoanTypes;
					}


						/**
						* 获取： 教案类型的值
						*/
						public String getJiaoanValue() {
							return jiaoanValue;
						}
						/**
						* 设置： 教案类型的值
						*/
						public void setJiaoanValue(String jiaoanValue) {
							this.jiaoanValue = jiaoanValue;
						}
					/**
					* 获取： 教案文件
					*/
					public String getJiaoanFile() {
						return jiaoanFile;
					}
					/**
					* 设置： 教案文件
					*/
					public void setJiaoanFile(String jiaoanFile) {
						this.jiaoanFile = jiaoanFile;
					}
					/**
					* 获取： 教案图片
					*/
					public String getJiaoanPhoto() {
						return jiaoanPhoto;
					}
					/**
					* 设置： 教案图片
					*/
					public void setJiaoanPhoto(String jiaoanPhoto) {
						this.jiaoanPhoto = jiaoanPhoto;
					}
					/**
					* 获取： 教案详情
					*/
					public String getJiaoanContent() {
						return jiaoanContent;
					}
					/**
					* 设置： 教案详情
					*/
					public void setJiaoanContent(String jiaoanContent) {
						this.jiaoanContent = jiaoanContent;
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


















}
