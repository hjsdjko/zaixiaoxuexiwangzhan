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
 * 教案
 *
 * @author 
 * @email
 * @date 2021-04-21
 */
@TableName("jiaoan")
public class JiaoanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiaoanEntity() {

	}

	public JiaoanEntity(T t) {
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
     * 教案名称
     */
    @TableField(value = "jiaoan_name")

    private String jiaoanName;


    /**
     * 教案类型
     */
    @TableField(value = "jiaoan_types")

    private Integer jiaoanTypes;


    /**
     * 教案文件
     */
    @TableField(value = "jiaoan_file")

    private String jiaoanFile;


    /**
     * 教案图片
     */
    @TableField(value = "jiaoan_photo")

    private String jiaoanPhoto;


    /**
     * 教案详情
     */
    @TableField(value = "jiaoan_content")

    private String jiaoanContent;


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
	 * 设置：教案名称
	 */
    public String getJiaoanName() {
        return jiaoanName;
    }


    /**
	 * 获取：教案名称
	 */

    public void setJiaoanName(String jiaoanName) {
        this.jiaoanName = jiaoanName;
    }
    /**
	 * 设置：教案类型
	 */
    public Integer getJiaoanTypes() {
        return jiaoanTypes;
    }


    /**
	 * 获取：教案类型
	 */

    public void setJiaoanTypes(Integer jiaoanTypes) {
        this.jiaoanTypes = jiaoanTypes;
    }
    /**
	 * 设置：教案文件
	 */
    public String getJiaoanFile() {
        return jiaoanFile;
    }


    /**
	 * 获取：教案文件
	 */

    public void setJiaoanFile(String jiaoanFile) {
        this.jiaoanFile = jiaoanFile;
    }
    /**
	 * 设置：教案图片
	 */
    public String getJiaoanPhoto() {
        return jiaoanPhoto;
    }


    /**
	 * 获取：教案图片
	 */

    public void setJiaoanPhoto(String jiaoanPhoto) {
        this.jiaoanPhoto = jiaoanPhoto;
    }
    /**
	 * 设置：教案详情
	 */
    public String getJiaoanContent() {
        return jiaoanContent;
    }


    /**
	 * 获取：教案详情
	 */

    public void setJiaoanContent(String jiaoanContent) {
        this.jiaoanContent = jiaoanContent;
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
        return "Jiaoan{" +
            "id=" + id +
            ", jiaoanName=" + jiaoanName +
            ", jiaoanTypes=" + jiaoanTypes +
            ", jiaoanFile=" + jiaoanFile +
            ", jiaoanPhoto=" + jiaoanPhoto +
            ", jiaoanContent=" + jiaoanContent +
            ", createTime=" + createTime +
        "}";
    }
}
