package com.ruoyi.project.wx.service;

import java.util.List;
import com.ruoyi.project.wx.domain.CUser;

/**
 * 微信用户Service接口
 * 
 * @author ruoyi
 * @date 2021-01-14
 */
public interface ICUserService 
{
    /**
     * 查询微信用户
     * 
     * @param id 微信用户ID
     * @return 微信用户
     */
    public CUser selectCUserById(Long id);

    /**
     * 查询微信用户列表
     * 
     * @param cUser 微信用户
     * @return 微信用户集合
     */
    public List<CUser> selectCUserList(CUser cUser);

    /**
     * 新增微信用户
     * 
     * @param cUser 微信用户
     * @return 结果
     */
    public int insertCUser(CUser cUser);

    /**
     * 修改微信用户
     * 
     * @param cUser 微信用户
     * @return 结果
     */
    public int updateCUser(CUser cUser);

    /**
     * 批量删除微信用户
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCUserByIds(String ids);

    /**
     * 删除微信用户信息
     * 
     * @param id 微信用户ID
     * @return 结果
     */
    public int deleteCUserById(Long id);
}
