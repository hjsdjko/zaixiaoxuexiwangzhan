package com.entity.model;

import com.entity.YonghuzuoyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 回答作业
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-21
 */
public class YonghuzuoyeModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 作业
     */
    private Integer zuoyeId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 回答作业
     */
    private String yonghuzuoyeFile;


    /**
     * 回答作业时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 分数
     */
    private Integer yonghuzuoyeFenshu;


    /**
     * 批改详情
     */
    private String yonghuzuoyeContent;


    /**
     * 创建时间
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
	 * 获取：作业
	 */
    public Integer getZuoyeId() {
        return zuoyeId;
    }


    /**
	 * 设置：作业
	 */
    public void setZuoyeId(Integer zuoyeId) {
        this.zuoyeId = zuoyeId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：回答作业
	 */
    public String getYonghuzuoyeFile() {
        return yonghuzuoyeFile;
    }


    /**
	 * 设置：回答作业
	 */
    public void setYonghuzuoyeFile(String yonghuzuoyeFile) {
        this.yonghuzuoyeFile = yonghuzuoyeFile;
    }
    /**
	 * 获取：回答作业时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：回答作业时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：分数
	 */
    public Integer getYonghuzuoyeFenshu() {
        return yonghuzuoyeFenshu;
    }


    /**
	 * 设置：分数
	 */
    public void setYonghuzuoyeFenshu(Integer yonghuzuoyeFenshu) {
        this.yonghuzuoyeFenshu = yonghuzuoyeFenshu;
    }
    /**
	 * 获取：批改详情
	 */
    public String getYonghuzuoyeContent() {
        return yonghuzuoyeContent;
    }


    /**
	 * 设置：批改详情
	 */
    public void setYonghuzuoyeContent(String yonghuzuoyeContent) {
        this.yonghuzuoyeContent = yonghuzuoyeContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
