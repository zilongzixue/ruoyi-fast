package com.ruoyi.project.wx.controller;

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
import com.ruoyi.project.wx.domain.CUser;
import com.ruoyi.project.wx.service.ICUserService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 微信用户Controller
 * 
 * @author ruoyi
 * @date 2021-01-14
 */
@Controller
@RequestMapping("/customer/wx")
public class CUserController extends BaseController
{
    private String prefix = "customer/wx";

    @Autowired
    private ICUserService cUserService;

    @RequiresPermissions("customer:wx:view")
    @GetMapping()
    public String wx()
    {
        return prefix + "/wx";
    }

    /**
     * 查询微信用户列表
     */
    @RequiresPermissions("customer:wx:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CUser cUser)
    {
        startPage();
        List<CUser> list = cUserService.selectCUserList(cUser);
        return getDataTable(list);
    }

    /**
     * 导出微信用户列表
     */
    @RequiresPermissions("customer:wx:export")
    @Log(title = "微信用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CUser cUser)
    {
        List<CUser> list = cUserService.selectCUserList(cUser);
        ExcelUtil<CUser> util = new ExcelUtil<CUser>(CUser.class);
        return util.exportExcel(list, "wx");
    }

    /**
     * 新增微信用户
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存微信用户
     */
    @RequiresPermissions("customer:wx:add")
    @Log(title = "微信用户", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CUser cUser)
    {
        return toAjax(cUserService.insertCUser(cUser));
    }

    /**
     * 修改微信用户
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        CUser cUser = cUserService.selectCUserById(id);
        mmap.put("cUser", cUser);
        return prefix + "/edit";
    }

    /**
     * 修改保存微信用户
     */
    @RequiresPermissions("customer:wx:edit")
    @Log(title = "微信用户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CUser cUser)
    {
        return toAjax(cUserService.updateCUser(cUser));
    }

    /**
     * 删除微信用户
     */
    @RequiresPermissions("customer:wx:remove")
    @Log(title = "微信用户", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cUserService.deleteCUserByIds(ids));
    }
}
