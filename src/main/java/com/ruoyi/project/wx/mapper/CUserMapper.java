package com.ruoyi.project.wx.mapper;

import java.util.List;
import com.ruoyi.project.wx.domain.CUser;
import com.ruoyi.project.wx.domain.Goods;

/**
 * 微信用户Mapper接口
 * 
 * @author ruoyi
 * @date 2021-01-14
 */
public interface CUserMapper 
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
     * 删除微信用户
     * 
     * @param id 微信用户ID
     * @return 结果
     */
    public int deleteCUserById(Long id);

    /**
     * 批量删除微信用户
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCUserByIds(String[] ids);

    /**
     * 批量删除商品
     * 
     * @param customerIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteGoodsByUserIds(String[] ids);
    
    /**
     * 批量新增商品
     * 
     * @param goodsList 商品列表
     * @return 结果
     */
    public int batchGoods(List<Goods> goodsList);
    

    /**
     * 通过微信用户ID删除商品信息
     * 
     * @param roleId 角色ID
     * @return 结果
     */
    public int deleteGoodsByUserId(Long id);
}
