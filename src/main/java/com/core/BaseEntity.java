package com.core;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by chenjunjun on 16/1/18 20:53
 */
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 3109638624839082026L;

    private Integer start;// 当前页开始的索引号 例如：(limit 0,10),就是开始这个0
    private Integer length;// 每页的行数
    private Integer draw;//请求次数
    private Integer page;// 当前页面
    private Integer totalPages;// 总页数
    private Long createId;// 创建人
    private Date createTime;// 创建日期
    private Long lastUpdateId;// 最后修改人
    private Date lastUpdateTime;// 最后修改日期
    private Integer isDeleted;// 是否删除
    private String sortProperty;// 排序字段
    private Boolean doPage = true; // 是否分页,true分页，false不分页

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getLastUpdateId() {
        return lastUpdateId;
    }

    public void setLastUpdateId(Long lastUpdateId) {
        this.lastUpdateId = lastUpdateId;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getSortProperty() {
        return sortProperty;
    }

    public void setSortProperty(String sortProperty) {
        this.sortProperty = sortProperty;
    }

    public Boolean getDoPage() {
        return doPage;
    }

    public void setDoPage(Boolean doPage) {
        this.doPage = doPage;
    }
}
