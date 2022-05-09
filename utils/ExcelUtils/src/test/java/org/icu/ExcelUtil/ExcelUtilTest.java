package org.icu.ExcelUtil;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.listener.PageReadListener;
import com.alibaba.fastjson.JSON;
import org.icu.dto.ExcelUtil.AgentExcelDTO;
import org.icu.dto.ExcelUtil.ComExcelDTO;
import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExcelUtilTest {

    @Test
    public void importEXcelByExcelUtil() throws FileNotFoundException {

        File file = new File("/Users/newbiebo/Desktop/file.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);

        ExcelLogs excelLogs = new ExcelLogs();
        Collection<AgentExcelDTO> agentExcelDTOS = ExcelUtil.importExcel(AgentExcelDTO.class, fileInputStream, "", excelLogs, "代理人", 0);

        List<AgentExcelDTO> listAgentExcelDTOs = (List<AgentExcelDTO>) agentExcelDTOS;
        String manageCom = listAgentExcelDTOs.get(0).getManageCom();
        System.out.println(excelLogs);
        System.out.println(manageCom);


    }
    @Test
    public void importEXcelByEasyExcel() throws FileNotFoundException {

        File file = new File("/Users/newbiebo/Desktop/file.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        ArrayList<String> arrayList = new ArrayList<>();
        EasyExcel.read(fileInputStream, AgentExcelDTO.class, new PageReadListener<AgentExcelDTO>(dataList -> {
            for (AgentExcelDTO demoData : dataList) {
                String s = JSON.toJSONString(demoData);
                arrayList.add(s);
                System.out.println(s);
            }
        })).sheet("代理人").doRead();

//        EasyExcel.read(fileInputStream, ComExcelDTO.class, new PageReadListener<ComExcelDTO>(dataList -> {
//            for (ComExcelDTO demoData : dataList) {
//                System.out.println(demoData.getAddress());
//            }
//        })).sheet("机构").doRead();
    }
}
