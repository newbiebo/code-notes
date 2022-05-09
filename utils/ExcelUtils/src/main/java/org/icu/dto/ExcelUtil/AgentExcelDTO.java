package org.icu.dto.ExcelUtil;

import lombok.Data;

import java.util.Date;

@Data
public class AgentExcelDTO {

    private String manageCom;
    private String name;
    private String sex;
    private String idNoType;
    private String idNo;
    private Date birthday;
    private String phone;
    private String licenceNo;
    private Date licenceStartDate;
    private Date licenceEndDate;
    private Date employdate;
    private String agentState;
    private String polspecLicenceName;
    private String polspecLicencenNo;
    private String laborRelations;
    private String virtualFlag;
    private String saleFlag;
    private String upSalesManNo;
    private String degree;
    private String branch;
    private String agentkind;
    private String branchType;

}
