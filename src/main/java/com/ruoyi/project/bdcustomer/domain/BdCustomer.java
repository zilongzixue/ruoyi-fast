package com.ruoyi.project.bdcustomer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 客户对象 t_bd_customer
 *
 * @author ruoyi
 * @date 2021-01-13
 */
public class BdCustomer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 客户ID */
    @JsonProperty("FCUSTID")
    private String FCUSTID;

    /** 唯一ID */
    @Excel(name = "唯一ID")
    @JsonProperty("FMASTERID")
    private String FMASTERID;

    /** 客户编码 */
    @Excel(name = "客户编码")
    @JsonProperty("FNUMBER")
    private String FNUMBER;

    /** 状态 */
    @Excel(name = "状态")
    @JsonProperty("FDOCUMENTSTATUS")
    private String FDOCUMENTSTATUS;

    /** 国家 */
    @Excel(name = "国家")
    @JsonProperty("FCOUNTRY")
    private String FCOUNTRY;

    /** 地区 */
    @Excel(name = "地区")
    @JsonProperty("FPROVINCIAL")
    private String FPROVINCIAL;

    /** 通讯地址 */
    @Excel(name = "通讯地址")
    @JsonProperty("FADDRESS")
    private String FADDRESS;

    /** 邮政编码 */
    @Excel(name = "邮政编码")
    @JsonProperty("FZIP")
    private String FZIP;

    /** 公司网址 */
    @Excel(name = "公司网址")
    @JsonProperty("FWEBSITE")
    private String FWEBSITE;

    /** 联系电话 */
    @Excel(name = "联系电话")
    @JsonProperty("FTEL")
    private String FTEL;

    /** 传真 */
    @Excel(name = "传真")
    @JsonProperty("FFAX")
    private String FFAX;

    /** 纳税登记号 */
    @Excel(name = "纳税登记号")
    @JsonProperty("FTAXREGISTERCODE")
    private String FTAXREGISTERCODE;

    /** 集团客户 */
    @Excel(name = "集团客户")
    @JsonProperty("FGROUPCUSTID")
    private String FGROUPCUSTID;

    /** 对应供应商 */
    @Excel(name = "对应供应商")
    @JsonProperty("FSUPPLIERID")
    private String FSUPPLIERID;

    /** 交易币种 */
    @Excel(name = "交易币种")
    @JsonProperty("FTRADINGCURRID")
    private String FTRADINGCURRID;

    /** 销售部门 */
    @Excel(name = "销售部门")
    @JsonProperty("FSALDEPTID")
    private String FSALDEPTID;

    /** 销售组 */
    @Excel(name = "销售组")
    @JsonProperty("FSALGROUPID")
    private String FSALGROUPID;

    /** 销售员 */
    @Excel(name = "销售员")
    @JsonProperty("FSELLER")
    private String FSELLER;

    /** 运输提前期 */
    @Excel(name = "运输提前期")
    @JsonProperty("FTRANSLEADTIME")
    private String FTRANSLEADTIME;

    /** 价目表 */
    @Excel(name = "价目表")
    @JsonProperty("FPRICELISTID")
    private String FPRICELISTID;

    /** 折扣表 */
    @Excel(name = "折扣表")
    @JsonProperty("FDISCOUNTLISTID")
    private String FDISCOUNTLISTID;

    /** 结算方式 */
    @Excel(name = "结算方式")
    @JsonProperty("FSETTLETYPEID")
    private String FSETTLETYPEID;

    /** 收款币别 */
    @Excel(name = "收款币别")
    @JsonProperty("FRECEIVECURRID")
    private String FRECEIVECURRID;

    /** 收款条件 */
    @Excel(name = "收款条件")
    @JsonProperty("FRECCONDITIONID")
    private String FRECCONDITIONID;

    /**  */
    @Excel(name = "")
    @JsonProperty("FISCREDITCHECK")
    private String FISCREDITCHECK;

    /**  */
    @Excel(name = "")
    @JsonProperty("FTAXRATE")
    private String FTAXRATE;

    /**  */
    @Excel(name = "")
    @JsonProperty("FFORBIDSTATUS")
    private String FFORBIDSTATUS;

    /** 创建组织 */
    @Excel(name = "创建组织")
    @JsonProperty("FCREATEORGID")
    private String FCREATEORGID;

    /**  */
    @Excel(name = "")
    @JsonProperty("FUSEORGID")
    private String FUSEORGID;

    /** 创建人 */
    @Excel(name = "创建人")
    @JsonProperty("FCREATORID")
    private String FCREATORID;

    /** 创建日期 */
    @Excel(name = "创建日期")
    @JsonProperty("FCREATEDATE")
    private String FCREATEDATE;

    /** 修改人 */
    @Excel(name = "修改人")
    @JsonProperty("FMODIFIERID")
    private String FMODIFIERID;

    /** 修改日期 */
    @Excel(name = "修改日期")
    @JsonProperty("FMODIFYDATE")
    private String FMODIFYDATE;

    /** 审核人 */
    @Excel(name = "审核人")
    @JsonProperty("FAPPROVERID")
    private String FAPPROVERID;

    /** 审核日期 */
    @Excel(name = "审核日期")
    @JsonProperty("FAPPROVEDATE")
    private String FAPPROVEDATE;

    /** 禁用人 */
    @Excel(name = "禁用人")
    @JsonProperty("FFORBIDDERID")
    private String FFORBIDDERID;

    /** 禁用日期 */
    @Excel(name = "禁用日期")
    @JsonProperty("FFORBIDDATE")
    private String FFORBIDDATE;

    /** 税分类 */
    @Excel(name = "税分类")
    @JsonProperty("FTAXTYPE")
    private String FTAXTYPE;

    /** 客户分类 */
    @Excel(name = "客户分类")
    @JsonProperty("FCUSTTYPEID")
    private String FCUSTTYPEID;

    /** 客户分组 */
    @Excel(name = "客户分组")
    @JsonProperty("FPRIMARYGROUP")
    private String FPRIMARYGROUP;

    /** 公司规模 */
    @Excel(name = "公司规模")
    @JsonProperty("FCOMPANYSCALE")
    private String FCOMPANYSCALE;

    /** 公司性质 */
    @Excel(name = "公司性质")
    @JsonProperty("FCOMPANYNATURE")
    private String FCOMPANYNATURE;

    /** 公司类别 */
    @Excel(name = "公司类别")
    @JsonProperty("FCOMPANYCLASSIFY")
    private String FCOMPANYCLASSIFY;

    /** 对应组织 */
    @Excel(name = "对应组织")
    @JsonProperty("FCorrespondOrgID")
    private String FCorrespondOrgID;

    /** 优先级 */
    @Excel(name = "优先级")
    @JsonProperty("FPRIORITY")
    private String FPRIORITY;

    /** 增值税发票类型 */
    @Excel(name = "增值税发票类型")
    @JsonProperty("FINVOICETYPE")
    private String FINVOICETYPE;

    /** 默认付款方 */
    @Excel(name = "默认付款方")
    @JsonProperty("FISDEFPAYER")
    private String FISDEFPAYER;

    /** 门户管理员编码 */
    @Excel(name = "门户管理员编码")
    @JsonProperty("FCPADMINCODE")
    private String FCPADMINCODE;

    /** 是否集团客户 */
    @Excel(name = "是否集团客户")
    @JsonProperty("FISGROUP")
    private String FISGROUP;

    /** 是否交易客户 */
    @Excel(name = "是否交易客户")
    @JsonProperty("FISTRADE")
    private String FISTRADE;

    /**  */
    @Excel(name = "")
    @JsonProperty("FNAME")
    private String FNAME;

    public void setFCUSTID(String FCUSTID)
    {
        this.FCUSTID = FCUSTID;
    }

    public String getFCUSTID()
    {
        return FCUSTID;
    }
    public void setFMASTERID(String FMASTERID)
    {
        this.FMASTERID = FMASTERID;
    }

    public String getFMASTERID()
    {
        return FMASTERID;
    }
    public void setFNUMBER(String FNUMBER)
    {
        this.FNUMBER = FNUMBER;
    }

    public String getFNUMBER()
    {
        return FNUMBER;
    }
    public void setFDOCUMENTSTATUS(String FDOCUMENTSTATUS)
    {
        this.FDOCUMENTSTATUS = FDOCUMENTSTATUS;
    }

    public String getFDOCUMENTSTATUS()
    {
        return FDOCUMENTSTATUS;
    }
    public void setFCOUNTRY(String FCOUNTRY)
    {
        this.FCOUNTRY = FCOUNTRY;
    }

    public String getFCOUNTRY()
    {
        return FCOUNTRY;
    }
    public void setFPROVINCIAL(String FPROVINCIAL)
    {
        this.FPROVINCIAL = FPROVINCIAL;
    }

    public String getFPROVINCIAL()
    {
        return FPROVINCIAL;
    }
    public void setFADDRESS(String FADDRESS)
    {
        this.FADDRESS = FADDRESS;
    }

    public String getFADDRESS()
    {
        return FADDRESS;
    }
    public void setFZIP(String FZIP)
    {
        this.FZIP = FZIP;
    }

    public String getFZIP()
    {
        return FZIP;
    }
    public void setFWEBSITE(String FWEBSITE)
    {
        this.FWEBSITE = FWEBSITE;
    }

    public String getFWEBSITE()
    {
        return FWEBSITE;
    }
    public void setFTEL(String FTEL)
    {
        this.FTEL = FTEL;
    }

    public String getFTEL()
    {
        return FTEL;
    }
    public void setFFAX(String FFAX)
    {
        this.FFAX = FFAX;
    }

    public String getFFAX()
    {
        return FFAX;
    }
    public void setFTAXREGISTERCODE(String FTAXREGISTERCODE)
    {
        this.FTAXREGISTERCODE = FTAXREGISTERCODE;
    }

    public String getFTAXREGISTERCODE()
    {
        return FTAXREGISTERCODE;
    }
    public void setFGROUPCUSTID(String FGROUPCUSTID)
    {
        this.FGROUPCUSTID = FGROUPCUSTID;
    }

    public String getFGROUPCUSTID()
    {
        return FGROUPCUSTID;
    }
    public void setFSUPPLIERID(String FSUPPLIERID)
    {
        this.FSUPPLIERID = FSUPPLIERID;
    }

    public String getFSUPPLIERID()
    {
        return FSUPPLIERID;
    }
    public void setFTRADINGCURRID(String FTRADINGCURRID)
    {
        this.FTRADINGCURRID = FTRADINGCURRID;
    }

    public String getFTRADINGCURRID()
    {
        return FTRADINGCURRID;
    }
    public void setFSALDEPTID(String FSALDEPTID)
    {
        this.FSALDEPTID = FSALDEPTID;
    }

    public String getFSALDEPTID()
    {
        return FSALDEPTID;
    }
    public void setFSALGROUPID(String FSALGROUPID)
    {
        this.FSALGROUPID = FSALGROUPID;
    }

    public String getFSALGROUPID()
    {
        return FSALGROUPID;
    }
    public void setFSELLER(String FSELLER)
    {
        this.FSELLER = FSELLER;
    }

    public String getFSELLER()
    {
        return FSELLER;
    }
    public void setFTRANSLEADTIME(String FTRANSLEADTIME)
    {
        this.FTRANSLEADTIME = FTRANSLEADTIME;
    }

    public String getFTRANSLEADTIME()
    {
        return FTRANSLEADTIME;
    }
    public void setFPRICELISTID(String FPRICELISTID)
    {
        this.FPRICELISTID = FPRICELISTID;
    }

    public String getFPRICELISTID()
    {
        return FPRICELISTID;
    }
    public void setFDISCOUNTLISTID(String FDISCOUNTLISTID)
    {
        this.FDISCOUNTLISTID = FDISCOUNTLISTID;
    }

    public String getFDISCOUNTLISTID()
    {
        return FDISCOUNTLISTID;
    }
    public void setFSETTLETYPEID(String FSETTLETYPEID)
    {
        this.FSETTLETYPEID = FSETTLETYPEID;
    }

    public String getFSETTLETYPEID()
    {
        return FSETTLETYPEID;
    }
    public void setFRECEIVECURRID(String FRECEIVECURRID)
    {
        this.FRECEIVECURRID = FRECEIVECURRID;
    }

    public String getFRECEIVECURRID()
    {
        return FRECEIVECURRID;
    }
    public void setFRECCONDITIONID(String FRECCONDITIONID)
    {
        this.FRECCONDITIONID = FRECCONDITIONID;
    }

    public String getFRECCONDITIONID()
    {
        return FRECCONDITIONID;
    }
    public void setFISCREDITCHECK(String FISCREDITCHECK)
    {
        this.FISCREDITCHECK = FISCREDITCHECK;
    }

    public String getFISCREDITCHECK()
    {
        return FISCREDITCHECK;
    }
    public void setFTAXRATE(String FTAXRATE)
    {
        this.FTAXRATE = FTAXRATE;
    }

    public String getFTAXRATE()
    {
        return FTAXRATE;
    }
    public void setFFORBIDSTATUS(String FFORBIDSTATUS)
    {
        this.FFORBIDSTATUS = FFORBIDSTATUS;
    }

    public String getFFORBIDSTATUS()
    {
        return FFORBIDSTATUS;
    }
    public void setFCREATEORGID(String FCREATEORGID)
    {
        this.FCREATEORGID = FCREATEORGID;
    }

    public String getFCREATEORGID()
    {
        return FCREATEORGID;
    }
    public void setFUSEORGID(String FUSEORGID)
    {
        this.FUSEORGID = FUSEORGID;
    }

    public String getFUSEORGID()
    {
        return FUSEORGID;
    }
    public void setFCREATORID(String FCREATORID)
    {
        this.FCREATORID = FCREATORID;
    }

    public String getFCREATORID()
    {
        return FCREATORID;
    }
    public void setFCREATEDATE(String FCREATEDATE)
    {
        this.FCREATEDATE = FCREATEDATE;
    }

    public String getFCREATEDATE()
    {
        return FCREATEDATE;
    }
    public void setFMODIFIERID(String FMODIFIERID)
    {
        this.FMODIFIERID = FMODIFIERID;
    }

    public String getFMODIFIERID()
    {
        return FMODIFIERID;
    }
    public void setFMODIFYDATE(String FMODIFYDATE)
    {
        this.FMODIFYDATE = FMODIFYDATE;
    }

    public String getFMODIFYDATE()
    {
        return FMODIFYDATE;
    }
    public void setFAPPROVERID(String FAPPROVERID)
    {
        this.FAPPROVERID = FAPPROVERID;
    }

    public String getFAPPROVERID()
    {
        return FAPPROVERID;
    }
    public void setFAPPROVEDATE(String FAPPROVEDATE)
    {
        this.FAPPROVEDATE = FAPPROVEDATE;
    }

    public String getFAPPROVEDATE()
    {
        return FAPPROVEDATE;
    }
    public void setFFORBIDDERID(String FFORBIDDERID)
    {
        this.FFORBIDDERID = FFORBIDDERID;
    }

    public String getFFORBIDDERID()
    {
        return FFORBIDDERID;
    }
    public void setFFORBIDDATE(String FFORBIDDATE)
    {
        this.FFORBIDDATE = FFORBIDDATE;
    }

    public String getFFORBIDDATE()
    {
        return FFORBIDDATE;
    }
    public void setFTAXTYPE(String FTAXTYPE)
    {
        this.FTAXTYPE = FTAXTYPE;
    }

    public String getFTAXTYPE()
    {
        return FTAXTYPE;
    }
    public void setFCUSTTYPEID(String FCUSTTYPEID)
    {
        this.FCUSTTYPEID = FCUSTTYPEID;
    }

    public String getFCUSTTYPEID()
    {
        return FCUSTTYPEID;
    }
    public void setFPRIMARYGROUP(String FPRIMARYGROUP)
    {
        this.FPRIMARYGROUP = FPRIMARYGROUP;
    }

    public String getFPRIMARYGROUP()
    {
        return FPRIMARYGROUP;
    }
    public void setFCOMPANYSCALE(String FCOMPANYSCALE)
    {
        this.FCOMPANYSCALE = FCOMPANYSCALE;
    }

    public String getFCOMPANYSCALE()
    {
        return FCOMPANYSCALE;
    }
    public void setFCOMPANYNATURE(String FCOMPANYNATURE)
    {
        this.FCOMPANYNATURE = FCOMPANYNATURE;
    }

    public String getFCOMPANYNATURE()
    {
        return FCOMPANYNATURE;
    }
    public void setFCOMPANYCLASSIFY(String FCOMPANYCLASSIFY)
    {
        this.FCOMPANYCLASSIFY = FCOMPANYCLASSIFY;
    }

    public String getFCOMPANYCLASSIFY()
    {
        return FCOMPANYCLASSIFY;
    }
    public void setFCorrespondOrgID(String FCorrespondOrgID)
    {
        this.FCorrespondOrgID = FCorrespondOrgID;
    }

    public String getFCorrespondOrgID()
    {
        return FCorrespondOrgID;
    }
    public void setFPRIORITY(String FPRIORITY)
    {
        this.FPRIORITY = FPRIORITY;
    }

    public String getFPRIORITY()
    {
        return FPRIORITY;
    }
    public void setFINVOICETYPE(String FINVOICETYPE)
    {
        this.FINVOICETYPE = FINVOICETYPE;
    }

    public String getFINVOICETYPE()
    {
        return FINVOICETYPE;
    }
    public void setFISDEFPAYER(String FISDEFPAYER)
    {
        this.FISDEFPAYER = FISDEFPAYER;
    }

    public String getFISDEFPAYER()
    {
        return FISDEFPAYER;
    }
    public void setFCPADMINCODE(String FCPADMINCODE)
    {
        this.FCPADMINCODE = FCPADMINCODE;
    }

    public String getFCPADMINCODE()
    {
        return FCPADMINCODE;
    }
    public void setFISGROUP(String FISGROUP)
    {
        this.FISGROUP = FISGROUP;
    }

    public String getFISGROUP()
    {
        return FISGROUP;
    }
    public void setFISTRADE(String FISTRADE)
    {
        this.FISTRADE = FISTRADE;
    }

    public String getFISTRADE()
    {
        return FISTRADE;
    }
    public void setFNAME(String FNAME)
    {
        this.FNAME = FNAME;
    }

    public String getFNAME()
    {
        return FNAME;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("FCUSTID", getFCUSTID())
                .append("FMASTERID", getFMASTERID())
                .append("FNUMBER", getFNUMBER())
                .append("FDOCUMENTSTATUS", getFDOCUMENTSTATUS())
                .append("FCOUNTRY", getFCOUNTRY())
                .append("FPROVINCIAL", getFPROVINCIAL())
                .append("FADDRESS", getFADDRESS())
                .append("FZIP", getFZIP())
                .append("FWEBSITE", getFWEBSITE())
                .append("FTEL", getFTEL())
                .append("FFAX", getFFAX())
                .append("FTAXREGISTERCODE", getFTAXREGISTERCODE())
                .append("FGROUPCUSTID", getFGROUPCUSTID())
                .append("FSUPPLIERID", getFSUPPLIERID())
                .append("FTRADINGCURRID", getFTRADINGCURRID())
                .append("FSALDEPTID", getFSALDEPTID())
                .append("FSALGROUPID", getFSALGROUPID())
                .append("FSELLER", getFSELLER())
                .append("FTRANSLEADTIME", getFTRANSLEADTIME())
                .append("FPRICELISTID", getFPRICELISTID())
                .append("FDISCOUNTLISTID", getFDISCOUNTLISTID())
                .append("FSETTLETYPEID", getFSETTLETYPEID())
                .append("FRECEIVECURRID", getFRECEIVECURRID())
                .append("FRECCONDITIONID", getFRECCONDITIONID())
                .append("FISCREDITCHECK", getFISCREDITCHECK())
                .append("FTAXRATE", getFTAXRATE())
                .append("FFORBIDSTATUS", getFFORBIDSTATUS())
                .append("FCREATEORGID", getFCREATEORGID())
                .append("FUSEORGID", getFUSEORGID())
                .append("FCREATORID", getFCREATORID())
                .append("FCREATEDATE", getFCREATEDATE())
                .append("FMODIFIERID", getFMODIFIERID())
                .append("FMODIFYDATE", getFMODIFYDATE())
                .append("FAPPROVERID", getFAPPROVERID())
                .append("FAPPROVEDATE", getFAPPROVEDATE())
                .append("FFORBIDDERID", getFFORBIDDERID())
                .append("FFORBIDDATE", getFFORBIDDATE())
                .append("FTAXTYPE", getFTAXTYPE())
                .append("FCUSTTYPEID", getFCUSTTYPEID())
                .append("FPRIMARYGROUP", getFPRIMARYGROUP())
                .append("FCOMPANYSCALE", getFCOMPANYSCALE())
                .append("FCOMPANYNATURE", getFCOMPANYNATURE())
                .append("FCOMPANYCLASSIFY", getFCOMPANYCLASSIFY())
                .append("FCorrespondOrgID", getFCorrespondOrgID())
                .append("FPRIORITY", getFPRIORITY())
                .append("FINVOICETYPE", getFINVOICETYPE())
                .append("FISDEFPAYER", getFISDEFPAYER())
                .append("FCPADMINCODE", getFCPADMINCODE())
                .append("FISGROUP", getFISGROUP())
                .append("FISTRADE", getFISTRADE())
                .append("FNAME", getFNAME())
                .toString();
    }
}
