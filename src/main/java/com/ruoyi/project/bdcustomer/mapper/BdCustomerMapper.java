package com.ruoyi.project.bdcustomer.mapper;

import java.util.List;
import com.ruoyi.project.bdcustomer.domain.BdCustomer;

/**
 * 客户Mapper接口
 * 
 * @author ruoyi
 * @date 2021-01-13
 */
public interface BdCustomerMapper 
{
    /**
     * 查询客户
     * 
     * @param FCUSTID 客户ID
     * @return 客户
     */
    public BdCustomer selectBdCustomerById(String FCUSTID);

    /**
     * 查询客户列表
     * 
     * @param bdCustomer 客户
     * @return 客户集合
     */
    public List<BdCustomer> selectBdCustomerList(BdCustomer bdCustomer);

    /**
     * 新增客户
     * 
     * @param bdCustomer 客户
     * @return 结果
     */
    public int insertBdCustomer(BdCustomer bdCustomer);

    /**
     * 修改客户
     * 
     * @param bdCustomer 客户
     * @return 结果
     */
    public int updateBdCustomer(BdCustomer bdCustomer);

    /**
     * 删除客户
     * 
     * @param FCUSTID 客户ID
     * @return 结果
     */
    public int deleteBdCustomerById(String FCUSTID);

    /**
     * 批量删除客户
     * 
     * @param FCUSTIDs 需要删除的数据ID
     * @return 结果
     */
    public int deleteBdCustomerByIds(String[] FCUSTIDs);
}
