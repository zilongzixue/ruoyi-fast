package com.ruoyi.project.wx.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.project.wx.domain.Goods;
import com.ruoyi.project.wx.mapper.CUserMapper;
import com.ruoyi.project.wx.domain.CUser;
import com.ruoyi.project.wx.service.ICUserService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 微信用户Service业务层处理
 *
 * @author ruoyi
 * @date 2021-01-14
 */
@Service
public class CUserServiceImpl implements ICUserService
{
    @Autowired
    private CUserMapper cUserMapper;

    /**
     * 查询微信用户
     *
     * @param id 微信用户ID
     * @return 微信用户
     */
    @Override
    public CUser selectCUserById(Long id)
    {
        return cUserMapper.selectCUserById(id);
    }

    /**
     * 查询微信用户列表
     *
     * @param cUser 微信用户
     * @return 微信用户
     */
    @Override
    public List<CUser> selectCUserList(CUser cUser)
    {
        return cUserMapper.selectCUserList(cUser);
    }

    /**
     * 新增微信用户
     *
     * @param cUser 微信用户
     * @return 结果
     */
    @Transactional
    @Override
    public int insertCUser(CUser cUser)
    {
        cUser.setCreateTime(DateUtils.getNowDate());
        int rows = cUserMapper.insertCUser(cUser);
        insertGoods(cUser);
        return rows;
    }

    /**
     * 修改微信用户
     *
     * @param cUser 微信用户
     * @return 结果
     */
    @Transactional
    @Override
    public int updateCUser(CUser cUser)
    {
        cUserMapper.deleteGoodsByUserId(cUser.getId());
        insertGoods(cUser);
        return cUserMapper.updateCUser(cUser);
    }

    /**
     * 删除微信用户对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCUserByIds(String ids)
    {
        cUserMapper.deleteGoodsByUserIds(Convert.toStrArray(ids));
        return cUserMapper.deleteCUserByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除微信用户信息
     *
     * @param id 微信用户ID
     * @return 结果
     */
    @Override
    public int deleteCUserById(Long id)
    {
        cUserMapper.deleteGoodsByUserId(id);
        return cUserMapper.deleteCUserById(id);
    }

    /**
     * 新增商品信息
     *
     * @param cUser 微信用户对象
     */
    public void insertGoods(CUser cUser)
    {
        List<Goods> goodsList = cUser.getGoodsList();
        Long id = cUser.getId();
        if (StringUtils.isNotNull(goodsList))
        {
            List<Goods> list = new ArrayList<Goods>();
            for (Goods goods : goodsList)
            {
                goods.setUserId(id);
                goods.setCreateTime(DateUtils.getNowDate());
                list.add(goods);
            }
            if (list.size() > 0)
            {
                cUserMapper.batchGoods(list);
            }
        }
    }
}
