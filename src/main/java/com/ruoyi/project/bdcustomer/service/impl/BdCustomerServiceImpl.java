package com.ruoyi.project.bdcustomer.service.impl;

import java.util.List;
import java.util.UUID;

import com.ruoyi.common.utils.uuid.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.bdcustomer.mapper.BdCustomerMapper;
import com.ruoyi.project.bdcustomer.domain.BdCustomer;
import com.ruoyi.project.bdcustomer.service.IBdCustomerService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 客户Service业务层处理
 *
 * @author ruoyi
 * @date 2021-01-13
 */
@Service
public class BdCustomerServiceImpl implements IBdCustomerService
{
    @Autowired
    private BdCustomerMapper bdCustomerMapper;

    /**
     * 查询客户
     *
     * @param FCUSTID 客户ID
     * @return 客户
     */
    @Override
    public BdCustomer selectBdCustomerById(String FCUSTID)
    {
        return bdCustomerMapper.selectBdCustomerById(FCUSTID);
    }

    /**
     * 查询客户列表
     *
     * @param bdCustomer 客户
     * @return 客户
     */
    @Override
    public List<BdCustomer> selectBdCustomerList(BdCustomer bdCustomer)
    {
        return bdCustomerMapper.selectBdCustomerList(bdCustomer);
    }

    /**
     * 新增客户
     *
     * @param bdCustomer 客户
     * @return 结果
     */
    @Override
    public int insertBdCustomer(BdCustomer bdCustomer)
    {
        bdCustomer.setFCUSTID(IdUtils.randomUUID());
        return bdCustomerMapper.insertBdCustomer(bdCustomer);
    }

    /**
     * 修改客户
     *
     * @param bdCustomer 客户
     * @return 结果
     */
    @Override
    public int updateBdCustomer(BdCustomer bdCustomer)
    {
        return bdCustomerMapper.updateBdCustomer(bdCustomer);
    }

    /**
     * 删除客户对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteBdCustomerByIds(String ids)
    {
        return bdCustomerMapper.deleteBdCustomerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户信息
     *
     * @param FCUSTID 客户ID
     * @return 结果
     */
    @Override
    public int deleteBdCustomerById(String FCUSTID)
    {
        return bdCustomerMapper.deleteBdCustomerById(FCUSTID);
    }
}
