package com.entity.vo;

import com.entity.YonghuzuoyeEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 回答作业
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-21
 */
@TableName("yonghuzuoye")
public class YonghuzuoyeVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
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

    @TableField(value = "create_time")
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

}
