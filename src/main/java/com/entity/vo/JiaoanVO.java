package com.entity.vo;

import com.entity.JiaoanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 教案
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-21
 */
@TableName("jiaoan")
public class JiaoanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
