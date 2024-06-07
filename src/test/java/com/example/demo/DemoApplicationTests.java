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

    @Autowired
    private DeliveryMapper deliveryMapper;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private OutcomeMapper outcomeMapper;

    @Autowired
    private Order_Mapper order_Mapper;

    @Autowired
    private MaintainMapper maintainMapper;

    @Autowired
    private CompanyMapper companyMapper;

    @Autowired
    private OrderlistMapper orderlistMapper;

    @Autowired
    private MembershipMapper membershipMapper;

    @Autowired
    private DisplayMapper displayMapper;

    @Autowired
    private StorageMapper storageMapper;

    @Autowired
    private DiscardlistMapper discardlistMapper;

    @Autowired
    private ProdmanageMapper prodmanageMapper;

    @Autowired
    private PurchaseMapper purchaseMapper;

    @Autowired
    private PurlistMapper purlistMapper;

    @Autowired
    private ReturnlistMapper returnlistMapper;

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

    @Test
    public void deliveryInsert(){
        DeliveryDTO deliveryDTO = new DeliveryDTO();

        deliveryDTO.setDELIVERY_DATE("20240607");
        deliveryDTO.setDELIVERY_CODE("100001");
        deliveryDTO.setDELIVERY_AMOUNT(3000);
        deliveryDTO.setRECEIVER("송승우");
        deliveryDTO.setSENDER("서웅진");
        deliveryDTO.setSOURCE("서울시립대정문점");
        deliveryDTO.setDEST("서울시립대후문점");
        deliveryDTO.setDELIVERY_CONTENT("책");
        deliveryDTO.setCURRENT_STATUS("이동중");
        deliveryDTO.setEMP_CODE("ABCDE");

        deliveryMapper.deliveryInsert(deliveryDTO);
    }

    @Test
    public void productInsert(){
        ProductDTO productDTO = new ProductDTO();

        productDTO.setPRODUCT_CODE("0001");
        productDTO.setPRODUCT_NAME("먹태깡");
        productDTO.setPRODUCT_PRICE(1800);
        productDTO.setPB_PRODUCT("N");

        productMapper.productInsert(productDTO);
    }

    @Test
    public void companyInsert(){
        CompanyDTO companyDTO = new CompanyDTO();

        companyDTO.setCOMPANY_CODE("0001");
        companyDTO.setCOMPANY_NAME("농심전농점");
        companyDTO.setCOMPANY_PHONE_NO("021234567");
        companyDTO.setCOMPANY_MAIL_NO("75738");

        companyMapper.companyInsert(companyDTO);
    }

    @Test
    public void outcomeInsert(){
        OutcomeDTO outcomeDTO = new OutcomeDTO();

        outcomeDTO.setOUTCOME_DATE("20240607");
        outcomeDTO.setOUTCOME_CODE("010001");
        outcomeDTO.setOUTCOME_AMOUNT(50000);

        outcomeMapper.outcomeInsert(outcomeDTO);
    }

    @Test
    public void order_Insert(){
        Order_DTO order_dto = new Order_DTO();

        order_dto.setORDER_DATE("20240607");
        order_dto.setORDER_CODE("020001");
        order_dto.setORDER_AMOUNT(4500);

        order_Mapper.order_Insert(order_dto);
    }

    @Test
    public void orderlistInsert(){
        OrderlistDTO orderlistDTO = new OrderlistDTO();

        orderlistDTO.setORDER_DATE("20240607");
        orderlistDTO.setORDER_CODE("020001");
        orderlistDTO.setPRODUCT_CODE("0001");
        orderlistDTO.setORDER_PRODUCT_QUANTITY(3);
        orderlistDTO.setORDER_PRODUCT_PRICE(4500);
        orderlistDTO.setCOMPANY_CODE("0001");

        orderlistMapper.orderlistInsert(orderlistDTO);
    }

    @Test
    public void maintainInsert(){
        MaintainDTO maintainDTO = new MaintainDTO();

        maintainDTO.setMAINTAIN_DATE("20240607");
        maintainDTO.setMAINTAIN_CODE("010001");
        maintainDTO.setMAINTAIN_AMOUNT(50000);
        maintainDTO.setEMP_CODE("");

        maintainMapper.maintainInsert(maintainDTO);
    }

    @Test
    public void membershipInsert(){
        MembershipDTO membershipDTO = new MembershipDTO();

        membershipDTO.setMEMBERSHIP_CODE("0001");
        membershipDTO.setMEMBERSHIP_NAME("서웅진");
        membershipDTO.setMEMBERSHIP_AGE(25);
        membershipDTO.setMEMBERSHIP_GENDER("M");
        membershipDTO.setMEMBERSHIP_MAIL_NO("63678");
        membershipDTO.setMEMBERSHIP_PHONE_NO("01054368632");
        membershipDTO.setMEMBERSHIP_MILEAGE(0);

        membershipMapper.membershipInsert(membershipDTO);
    }

    @Test
    public void displayInsert(){
        DisplayDTO displayDTO = new DisplayDTO();

        displayDTO.setPRODUCT_CODE("0001");
        displayDTO.setPRODUCT_NAME("먹태깡");
        displayDTO.setPRODUCT_PRICE(1800);
        displayDTO.setPB_PRODUCT("N");
        displayDTO.setDISPLAY_QUANTITY(2);
        displayDTO.setPRODUCT_DC(0);

        displayMapper.displayInsert(displayDTO);
    }

    @Test
    public void storageInsert(){
        StorageDTO storageDTO = new StorageDTO();

        storageDTO.setPRODUCT_CODE("0001");
        storageDTO.setPRODUCT_NAME("먹태깡");
        storageDTO.setSTORAGE_QUANTITY(4);
        storageDTO.setPRODUCT_PRICE(1800);
        storageDTO.setPRODUCT_DC(0);
        storageDTO.setPB_PRODUCT("N");

        storageMapper.storageInsert(storageDTO);
    }

    @Test
    public void discardlistInsert(){
        DiscardlistDTO discardlistDTO = new DiscardlistDTO();

        discardlistDTO.setDISCARD_DATE("20240607");
        discardlistDTO.setDISCARD_TYPE_CODE("S");
        discardlistDTO.setPRODUCT_CODE("0001");
        discardlistDTO.setDISCARD_QUANTITY(1);
        discardlistDTO.setEMP_CODE("FGHIJ");

        discardlistMapper.discardlistInsert(discardlistDTO);
    }

    @Test
    public void prodmanageInsert(){
        ProdmanageDTO prodmanageDTO = new ProdmanageDTO();

        prodmanageDTO.setPRODUCT_CODE("0001");
        prodmanageDTO.setMANAGE_DATE("20240607");
        prodmanageDTO.setMANAGE_TYPE_CODE("D");
        prodmanageDTO.setERROR_QUANTITY(1);
        prodmanageDTO.setERROR_REASON("도난");
        prodmanageDTO.setEMP_CODE("FGHIJ");

        prodmanageMapper.prodmanageInsert(prodmanageDTO);
    }

    @Test
    public void purchaseInsert(){
        PurchaseDTO purchaseDTO = new PurchaseDTO();

        purchaseDTO.setPURCHASE_DATE("20240607");
        purchaseDTO.setPURCHASE_CODE("120001");
        purchaseDTO.setPURCHASE_AMOUNT(1800);
        purchaseDTO.setCARD_ACCOUNT_NO("3445685354");
        purchaseDTO.setCARD_PURCHASE_AMOUNT(1000);
        purchaseDTO.setCASH_PURCHASE_AMOUNT(800);
        purchaseDTO.setEMP_CODE("KLMNO");

        purchaseMapper.purchaseInsert(purchaseDTO);
    }

    @Test
    public void purlistInsert(){
        PurlistDTO purlistDTO = new PurlistDTO();

        purlistDTO.setPURCHASE_DATE("20240607");
        purlistDTO.setPURCHASE_CODE("120001");
        purlistDTO.setPRODUCT_CODE("0001");
        purlistDTO.setPURCHASE_PRODUCT_QUANTITY(1);
        purlistDTO.setPURCHASE_PRODUCT_PRICE(1800);
        purlistDTO.setACC_MILEAGE(0);

        purlistMapper.purlistInsert(purlistDTO);
    }

    @Test
    public void returnlistInsert(){
        ReturnlistDTO returnlistDTO = new ReturnlistDTO();

        returnlistDTO.setPURCHASE_CODE("120001");
        returnlistDTO.setPURCHASE_DATE("20240607");
        returnlistDTO.setPRODUCT_CODE("0001");
        returnlistDTO.setRETURN_DATE("20240607");
        returnlistDTO.setRETURN_QUANTITY(2);
        returnlistDTO.setRETURN_PRICE(3600);

        returnlistMapper.returnlistInsert(returnlistDTO);
    }
}
