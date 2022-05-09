package org.icu.dto.ExcelUtil;

import lombok.Data;

import java.util.Date;

@Data
public class ComExcelDTO {

    private String name;
    private String managecom;
    private String address;
    private String agentcomtype;
    private String licenseno;
    private Date licensestartdate;
    private Date licenseenddate;
    private Date protocolsigndate;
    private Date protocolenddate;
    private String ulqulifdflag;
    private String licensename;
    private String agtcomunifiedcde;
    private String isagentcom;
    private String agentidtype;
    private String agentidcode;

}
