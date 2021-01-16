package com.ruoyi.project.bdcustomer.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.bdcustomer.domain.BdCustomer;
import com.ruoyi.project.bdcustomer.service.IBdCustomerService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 客户Controller
 *
 * @author ruoyi
 * @date 2021-01-13
 */
@Controller
@RequestMapping("/customer/bdcustomer")
public class BdCustomerController extends BaseController
{
    private String prefix = "customer/bdcustomer";

    @Autowired
    private IBdCustomerService bdCustomerService;

    @RequiresPermissions("customer:bdcustomer:view")
    @GetMapping()
    public String bdcustomer()
    {
        return prefix + "/bdcustomer";
    }

    /**
     * 查询客户列表
     */
    @RequiresPermissions("customer:bdcustomer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(BdCustomer bdCustomer)
    {
        startPage();
        List<BdCustomer> list = bdCustomerService.selectBdCustomerList(bdCustomer);
        return getDataTable(list);
    }

    /**
     * 导出客户列表
     */
    @RequiresPermissions("customer:bdcustomer:export")
    @Log(title = "客户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(BdCustomer bdCustomer)
    {
        List<BdCustomer> list = bdCustomerService.selectBdCustomerList(bdCustomer);
        ExcelUtil<BdCustomer> util = new ExcelUtil<BdCustomer>(BdCustomer.class);
        return util.exportExcel(list, "bdcustomer");
    }

    /**
     * 新增客户
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户
     */
    @RequiresPermissions("customer:bdcustomer:add")
    @Log(title = "客户", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(BdCustomer bdCustomer)
    {
        return toAjax(bdCustomerService.insertBdCustomer(bdCustomer));
    }

    /**
     * 修改客户
     */
    @GetMapping("/edit/{FCUSTID}")
    public String edit(@PathVariable("FCUSTID") String FCUSTID, ModelMap mmap)
    {
        BdCustomer bdCustomer = bdCustomerService.selectBdCustomerById(FCUSTID);
        mmap.put("bdCustomer", bdCustomer);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户
     */
    @RequiresPermissions("customer:bdcustomer:edit")
    @Log(title = "客户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(BdCustomer bdCustomer)
    {
        return toAjax(bdCustomerService.updateBdCustomer(bdCustomer));
    }

    /**
     * 删除客户
     */
    @RequiresPermissions("customer:bdcustomer:remove")
    @Log(title = "客户", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(bdCustomerService.deleteBdCustomerByIds(ids));
    }
}
