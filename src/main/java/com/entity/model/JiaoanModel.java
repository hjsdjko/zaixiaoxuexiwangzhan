package com.entity.model;

import com.entity.JiaoanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 教案
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-21
 */
public class JiaoanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 教案名称
     */
    private String jiaoanName;


    /**
     * 教案类型
     */
    private Integer jiaoanTypes;


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


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：教案名称
	 */
    public String getJiaoanName() {
        return jiaoanName;
    }


    /**
	 * 设置：教案名称
	 */
    public void setJiaoanName(String jiaoanName) {
        this.jiaoanName = jiaoanName;
    }
    /**
	 * 获取：教案类型
	 */
    public Integer getJiaoanTypes() {
        return jiaoanTypes;
    }


    /**
	 * 设置：教案类型
	 */
    public void setJiaoanTypes(Integer jiaoanTypes) {
        this.jiaoanTypes = jiaoanTypes;
    }
    /**
	 * 获取：教案文件
	 */
    public String getJiaoanFile() {
        return jiaoanFile;
    }


    /**
	 * 设置：教案文件
	 */
    public void setJiaoanFile(String jiaoanFile) {
        this.jiaoanFile = jiaoanFile;
    }
    /**
	 * 获取：教案图片
	 */
    public String getJiaoanPhoto() {
        return jiaoanPhoto;
    }


    /**
	 * 设置：教案图片
	 */
    public void setJiaoanPhoto(String jiaoanPhoto) {
        this.jiaoanPhoto = jiaoanPhoto;
    }
    /**
	 * 获取：教案详情
	 */
    public String getJiaoanContent() {
        return jiaoanContent;
    }


    /**
	 * 设置：教案详情
	 */
    public void setJiaoanContent(String jiaoanContent) {
        this.jiaoanContent = jiaoanContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
