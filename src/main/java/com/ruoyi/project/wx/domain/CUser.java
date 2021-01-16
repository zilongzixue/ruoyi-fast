package com.ruoyi.project.wx.domain;

import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 微信用户对象 c_user
 *
 * @author ruoyi
 * @date 2021-01-14
 */
public class CUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @JsonProperty("id")
    private Long id;

    /** 用户名称 */
    @Excel(name = "用户名称")
    @JsonProperty("username")
    private String username;

    /** openid */
    @Excel(name = "openid")
    @JsonProperty("openId")
    private String openId;

    /** 商品信息 */
    private List<Goods> goodsList;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getUsername()
    {
        return username;
    }
    public void setOpenId(String openId)
    {
        this.openId = openId;
    }

    public String getOpenId()
    {
        return openId;
    }

    public List<Goods> getGoodsList()
    {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList)
    {
        this.goodsList = goodsList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("username", getUsername())
            .append("openId", getOpenId())
            .append("createTime", getCreateTime())
            .append("goodsList", getGoodsList())
            .toString();
    }
}
