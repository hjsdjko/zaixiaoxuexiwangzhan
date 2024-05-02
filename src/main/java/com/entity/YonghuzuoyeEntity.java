package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 回答作业
 *
 * @author 
 * @email
 * @date 2021-04-21
 */
@TableName("yonghuzuoye")
public class YonghuzuoyeEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YonghuzuoyeEntity() {

	}

	public YonghuzuoyeEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 作业
     */
    @TableField(value = "zuoye_id")

    private Integer zuoyeId;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 回答作业
     */
    @TableField(value = "yonghuzuoye_file")

    private String yonghuzuoyeFile;


    /**
     * 回答作业时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 分数
     */
    @TableField(value = "yonghuzuoye_fenshu")

    private Integer yonghuzuoyeFenshu;


    /**
     * 批改详情
     */
    @TableField(value = "yonghuzuoye_content")

    private String yonghuzuoyeContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：作业
	 */
    public Integer getZuoyeId() {
        return zuoyeId;
    }


    /**
	 * 获取：作业
	 */

    public void setZuoyeId(Integer zuoyeId) {
        this.zuoyeId = zuoyeId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：回答作业
	 */
    public String getYonghuzuoyeFile() {
        return yonghuzuoyeFile;
    }


    /**
	 * 获取：回答作业
	 */

    public void setYonghuzuoyeFile(String yonghuzuoyeFile) {
        this.yonghuzuoyeFile = yonghuzuoyeFile;
    }
    /**
	 * 设置：回答作业时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：回答作业时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：分数
	 */
    public Integer getYonghuzuoyeFenshu() {
        return yonghuzuoyeFenshu;
    }


    /**
	 * 获取：分数
	 */

    public void setYonghuzuoyeFenshu(Integer yonghuzuoyeFenshu) {
        this.yonghuzuoyeFenshu = yonghuzuoyeFenshu;
    }
    /**
	 * 设置：批改详情
	 */
    public String getYonghuzuoyeContent() {
        return yonghuzuoyeContent;
    }


    /**
	 * 获取：批改详情
	 */

    public void setYonghuzuoyeContent(String yonghuzuoyeContent) {
        this.yonghuzuoyeContent = yonghuzuoyeContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yonghuzuoye{" +
            "id=" + id +
            ", zuoyeId=" + zuoyeId +
            ", yonghuId=" + yonghuId +
            ", yonghuzuoyeFile=" + yonghuzuoyeFile +
            ", insertTime=" + insertTime +
            ", yonghuzuoyeFenshu=" + yonghuzuoyeFenshu +
            ", yonghuzuoyeContent=" + yonghuzuoyeContent +
            ", createTime=" + createTime +
        "}";
    }
}
