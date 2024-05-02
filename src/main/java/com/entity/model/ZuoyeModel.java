package com.entity.model;

import com.entity.ZuoyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 作业
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-21
 */
public class ZuoyeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 作业名称
     */
    private String zuoyeName;


    /**
     * 作业类型
     */
    private Integer zuoyeTypes;


    /**
     * 作业文件
     */
    private String zuoyeFile;


    /**
     * 作业截止时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date zuoyeEndTime;


    /**
     * 作业图片
     */
    private String zuoyePhoto;


    /**
     * 作业详情
     */
    private String zuoyeContent;


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
	 * 获取：作业名称
	 */
    public String getZuoyeName() {
        return zuoyeName;
    }


    /**
	 * 设置：作业名称
	 */
    public void setZuoyeName(String zuoyeName) {
        this.zuoyeName = zuoyeName;
    }
    /**
	 * 获取：作业类型
	 */
    public Integer getZuoyeTypes() {
        return zuoyeTypes;
    }


    /**
	 * 设置：作业类型
	 */
    public void setZuoyeTypes(Integer zuoyeTypes) {
        this.zuoyeTypes = zuoyeTypes;
    }
    /**
	 * 获取：作业文件
	 */
    public String getZuoyeFile() {
        return zuoyeFile;
    }


    /**
	 * 设置：作业文件
	 */
    public void setZuoyeFile(String zuoyeFile) {
        this.zuoyeFile = zuoyeFile;
    }
    /**
	 * 获取：作业截止时间
	 */
    public Date getZuoyeEndTime() {
        return zuoyeEndTime;
    }


    /**
	 * 设置：作业截止时间
	 */
    public void setZuoyeEndTime(Date zuoyeEndTime) {
        this.zuoyeEndTime = zuoyeEndTime;
    }
    /**
	 * 获取：作业图片
	 */
    public String getZuoyePhoto() {
        return zuoyePhoto;
    }


    /**
	 * 设置：作业图片
	 */
    public void setZuoyePhoto(String zuoyePhoto) {
        this.zuoyePhoto = zuoyePhoto;
    }
    /**
	 * 获取：作业详情
	 */
    public String getZuoyeContent() {
        return zuoyeContent;
    }


    /**
	 * 设置：作业详情
	 */
    public void setZuoyeContent(String zuoyeContent) {
        this.zuoyeContent = zuoyeContent;
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
