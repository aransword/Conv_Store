package com.example.demo;

import com.example.demo.mapper.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.*;



@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private ChargeMapper chargeMapper;

    @Autowired
    private ATMMapper atmMapper;

    @Autowired
    private IncomeMapper incomeMapper;

    @Autowired
    private LotteryMapper lotteryMapper;



    @Test
    public void employeeInsert(){
        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setEMP_CODE("KLMNO");
        employeeDTO.setEMP_NAME("GRAHEM");
        employeeDTO.setEMP_AGE(22);
        employeeDTO.setEMP_GENDER("M");
        employeeDTO.setEMP_PHONE_NO("01042823207");
        employeeDTO.setEMP_MAIL_NO("35748");
        employeeDTO.setEMP_ACCOUNT_NO("36854934");
        employeeDTO.setPART("D");
        employeeDTO.setSALARY(0);

        employeeMapper.employeeInsert(employeeDTO);
    }

    @Test
    public void chargeInsert(){
        ChargeDTO chargeDTO = new ChargeDTO();

        chargeDTO.setPAY_DATE("20240607");
        chargeDTO.setCHARGE_CODE("200001");
        chargeDTO.setINST_NAME("한국수력원자력");
        chargeDTO.setCHARGE_NAME("수도요금");
        chargeDTO.setPAYER("김동욱");
        chargeDTO.setPAY_AMOUNT(32000);
        chargeDTO.setEMP_CODE("ABCDE");
        chargeMapper.chargeInsert(chargeDTO);
    }

    @Test
    public void ATMInsert(){
        ATMDTO atmDTO = new ATMDTO();

        atmDTO.setATM_USE_DATE("20240607");
        atmDTO.setATM_CODE("210001");
        atmDTO.setDNW_TYPE_CODE("D");
        atmDTO.setATM_ACCOUNT_NO("466402-01-520624");
        atmDTO.setDNW_AMOUNT(30000);
        atmDTO.setEMP_CODE("ABCDE");
        atmMapper.ATMInsert(atmDTO);
    }

    @Test
    public void incomeInsert(){
        IncomeDTO income = new IncomeDTO();

        income.setINCOME_DATE("20240607");
        income.setINCOME_CODE("100001");
        income.setINCOME_AMOUNT(3000);
        incomeMapper.incomeInsert(income);
    }

    @Test
    public void lotteryInsert(){
        LotteryDTO lotteryDTO = new LotteryDTO();

        lotteryDTO.setLOTTERY_CODE("110001");
        lotteryDTO.setLOTTERY_SALE_DATE("20240607");
        lotteryDTO.setLOTTERY_NO("1, 4, 10, 26, 32, 44");
        lotteryDTO.setLOTTERY_CODE("FGHIJ");
        lotteryMapper.lotteryInsert(lotteryDTO);
    }


}
