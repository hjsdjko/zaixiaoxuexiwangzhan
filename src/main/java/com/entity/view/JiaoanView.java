package com.entity.view;

import com.entity.JiaoanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 教案
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-21
 */
@TableName("jiaoan")
public class JiaoanView extends JiaoanEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 教案类型的值
		*/
		private String jiaoanValue;



	public JiaoanView() {

	}

	public JiaoanView(JiaoanEntity jiaoanEntity) {
		try {
			BeanUtils.copyProperties(this, jiaoanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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














}
