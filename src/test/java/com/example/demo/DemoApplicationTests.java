package com.example.demo;

import java.util.*;

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

        employeeDTO.setEMP_CODE("000003");
        employeeDTO.setEMP_NAME("GRAHEM");
        employeeDTO.setEMP_AGE(30);
        employeeDTO.setEMP_GENDER("M");
        employeeDTO.setEMP_PHONE_NO("01042823207");
        employeeDTO.setEMP_MAIL_NO("65387");
        employeeDTO.setEMP_ACCOUNT_NO("54356784");
        employeeDTO.setPART("N");
        employeeDTO.setSALARY(0);

        employeeMapper.employeeInsert(employeeDTO);
    }

    @Test
    public void employeeSelect(){
        List<EmployeeDTO> employeeDTOList = employeeMapper.employeeSelect();
        System.out.println(employeeDTOList.size());
        for(EmployeeDTO employeeDTO : employeeDTOList){
            System.out.println(employeeDTO);
        }
    }

    @Test
    public void employeeCodeSelect(){
        EmployeeDTO employeeDTO = employeeMapper.employeeCodeSelect("000001");
        System.out.println(employeeDTO);
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
        chargeDTO.setEMP_CODE("000001");
        chargeMapper.chargeInsert(chargeDTO);
    }

    @Test
    public void chargeSelect(){
        List<ChargeDTO> chargeDTOList = chargeMapper.chargeSelect();
        System.out.println(chargeDTOList.size());
        for(ChargeDTO chargeDTO : chargeDTOList){
            System.out.println(chargeDTO);
        }
    }

    @Test
    public void chargeDateSelect(){
        List<ChargeDTO> chargeDTOList = chargeMapper.chargeDateSelect("20240607");
        System.out.println(chargeDTOList.size());
        for(ChargeDTO chargeDTO : chargeDTOList){
            System.out.println(chargeDTO);
        }
    }

    @Test
    public void chargeDateCodeSelect() {
        ChargeDTO chargeDTO = new ChargeDTO();

        chargeDTO.setCHARGE_CODE("200001");
        chargeDTO.setPAY_DATE("20240607");

        System.out.println(chargeMapper.chargeDateCodeSelect(chargeDTO));
    }

    @Test
    public void chargePayerSelect(){
        List<ChargeDTO> chargeDTOList = chargeMapper.chargePayerSelect("김동욱");
        System.out.println(chargeDTOList.size());
        for(ChargeDTO chargeDTO : chargeDTOList){
            System.out.println(chargeDTO);
        }
    }

    @Test
    public void ATMInsert(){
        ATMDTO atmDTO = new ATMDTO();

        atmDTO.setATM_USE_DATE("20240607");
        atmDTO.setATM_CODE("210001");
        atmDTO.setDNW_TYPE_CODE("D");
        atmDTO.setATM_ACCOUNT_NO("466402-01-520624");
        atmDTO.setDNW_AMOUNT(30000);
        atmDTO.setEMP_CODE("000001");
        atmMapper.ATMInsert(atmDTO);
    }

    @Test
    public void ATMSelect(){
        List<ATMDTO> ATMDTOList = atmMapper.ATMSelect();
        System.out.println(ATMDTOList.size());
        for(ATMDTO atmDTO : ATMDTOList){
            System.out.println(atmDTO);
        }
    }

    @Test
    public void ATMDateSelect(){
        List<ATMDTO> ATMDTOList = atmMapper.ATMDateSelect("20240607");
        System.out.println(ATMDTOList.size());
        for(ATMDTO atmDTO : ATMDTOList){
            System.out.println(atmDTO);
        }
    }

    @Test
    public void ATMDateCodeSelect(){
        ATMDTO atmSelectDTO = new ATMDTO();

        atmSelectDTO.setATM_CODE("210001");
        atmSelectDTO.setATM_USE_DATE("20240607");

        System.out.println(atmMapper.ATMDateCodeSelect(atmSelectDTO));
    }

    @Test
    public void incomeInsert(){
        IncomeDTO income = new IncomeDTO();

        income.setINCOME_DATE("20240607");
        income.setINCOME_CODE("120001");
        income.setINCOME_AMOUNT(1800);
        incomeMapper.incomeInsert(income);
    }

    @Test
    public void incomeSelect(){
        List<IncomeDTO> incomeDTOList = incomeMapper.incomeSelect();
        System.out.println(incomeDTOList.size());
        for(IncomeDTO incomeDTO : incomeDTOList){
            System.out.println(incomeDTO);
        }
    }

    @Test
    public void incomeDateSelect() {
        List<IncomeDTO> incomeDTOList = incomeMapper.incomeDateSelect("20240607");
        System.out.println(incomeDTOList.size());
        for(IncomeDTO incomeDTO : incomeDTOList){
            System.out.println(incomeDTO);
        }
    }

    @Test
    public void incomeDateCodeSelect(){
        IncomeDTO incomeSelectDTO = new IncomeDTO();
        incomeSelectDTO.setINCOME_DATE("20240607");
        incomeSelectDTO.setINCOME_CODE("120001");

        System.out.println(incomeMapper.incomeDateCodeSelect(incomeSelectDTO));
    }

    @Test
    public void lotteryInsert(){
        LotteryDTO lotteryDTO = new LotteryDTO();

        lotteryDTO.setLOTTERY_CODE("110001");
        lotteryDTO.setLOTTERY_SALE_DATE("20240607");
        lotteryDTO.setLOTTERY_NO("1, 4, 10, 26, 32, 44");
        lotteryDTO.setEMP_CODE("000002");
        lotteryMapper.lotteryInsert(lotteryDTO);
    }

    @Test
    public void lotterySelect(){
        List<LotteryDTO> lotteryDTOList = lotteryMapper.lotterySelect();
        System.out.println(lotteryDTOList.size());
        for(LotteryDTO lotteryDTO : lotteryDTOList){
            System.out.println(lotteryDTO);
        }
    }

    @Test
    public void lotteryDateSelect(){
        List<LotteryDTO> lotteryDTOList = lotteryMapper.lotteryDateSelect("20240607");
        System.out.println(lotteryDTOList.size());
        for(LotteryDTO lotteryDTO : lotteryDTOList){
            System.out.println(lotteryDTO);
        }
    }

    @Test
    public void lotteryDateCodeSelect(){
        LotteryDTO lotterySelectDTO = new LotteryDTO();

        lotterySelectDTO.setLOTTERY_CODE("110001");
        lotterySelectDTO.setLOTTERY_SALE_DATE("20240607");

        System.out.println(lotteryMapper.lotteryDateCodeSelect(lotterySelectDTO));
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
        deliveryDTO.setEMP_CODE("000001");

        deliveryMapper.deliveryInsert(deliveryDTO);
    }

    @Test
    public void deliverySelect(){
        List<DeliveryDTO> deliveryDTOList = deliveryMapper.deliverySelect();
        System.out.println(deliveryDTOList.size());
        for(DeliveryDTO deliveryDTO : deliveryDTOList) {
            System.out.println(deliveryDTO);
        }
    }

    @Test
    public void deliveryDateCodeSelect(){
        DeliveryDTO deliverySelectDTO = new DeliveryDTO();

        deliverySelectDTO.setDELIVERY_DATE("20240607");
        deliverySelectDTO.setDELIVERY_CODE("100001");

        List<DeliveryDTO> deliveryDTOList = deliveryMapper.deliveryDateCodeSelect(deliverySelectDTO);
        System.out.println(deliveryDTOList.size());
        for(DeliveryDTO deliveryDTO : deliveryDTOList) {
            System.out.println(deliveryDTO);
        }
    }

    @Test
    public void deliverySenderSelect(){
        List<DeliveryDTO> deliveryDTOList = deliveryMapper.deliverySenderSelect("서웅진");
        System.out.println(deliveryDTOList.size());
        for(DeliveryDTO deliveryDTO : deliveryDTOList) {
            System.out.println(deliveryDTO);
        }
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
    public void productSelect(){
        List<ProductDTO> productDTOList = productMapper.productSelect();
        System.out.println(productDTOList.size());
        for(ProductDTO productDTO : productDTOList) {
            System.out.println(productDTO);
        }
    }

    @Test
    public void productCodeSelect(){
        System.out.println(productMapper.productCodeSelect("0001"));
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
    public void companySelect(){
        List<CompanyDTO> companyDTOList = companyMapper.companySelect();
        System.out.println(companyDTOList.size());
        for(CompanyDTO companyDTO : companyDTOList) {
            System.out.println(companyDTO);
        }
    }

    @Test
    public void companyCodeSelect(){
        List<CompanyDTO> companyDTOList = companyMapper.companyCodeSelect("0001");
        System.out.println(companyDTOList.size());
        for(CompanyDTO companyDTO : companyDTOList) {
            System.out.println(companyDTO);
        }
    }

    @Test
    public void companyNameSelect(){
        List<CompanyDTO> companyDTOList = companyMapper.companyNameSelect("농심전농점");
        System.out.println(companyDTOList.size());
        for(CompanyDTO companyDTO : companyDTOList) {
            System.out.println(companyDTO);
        }
    }

    @Test
    public void outcomeInsert(){
        OutcomeDTO outcomeDTO = new OutcomeDTO();

        outcomeDTO.setOUTCOME_DATE("20240607");
        outcomeDTO.setOUTCOME_CODE("010002");
        outcomeDTO.setOUTCOME_AMOUNT(1000000);

        outcomeMapper.outcomeInsert(outcomeDTO);
    }

    @Test
    public void outcomeSelect(){
        List<OutcomeDTO> outcomeDTOList = outcomeMapper.outcomeSelect();
        System.out.println(outcomeDTOList.size());
        for(OutcomeDTO outcomeDTO : outcomeDTOList) {
            System.out.println(outcomeDTO);
        }
    }

    @Test
    public void outcomeDateSelect(){
        List<OutcomeDTO> outcomeDTOList = outcomeMapper.outcomeDateSelect("20240607");
        System.out.println(outcomeDTOList.size());
        for(OutcomeDTO outcomeDTO : outcomeDTOList) {
            System.out.println(outcomeDTO);
        }
    }

    @Test
    public void outcomeDateCodeSelect(){
        OutcomeDTO outcomeSelectDTO = new OutcomeDTO();

        outcomeSelectDTO.setOUTCOME_DATE("20240607");
        outcomeSelectDTO.setOUTCOME_CODE("010002");

        System.out.println(outcomeMapper.outcomeDateCodeSelect(outcomeSelectDTO));
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
    public void order_Select(){
        List<Order_DTO> order_dtoList = order_Mapper.order_Select();
        System.out.println(order_dtoList.size());
        for(Order_DTO order_dto : order_dtoList) {
            System.out.println(order_dto);
        }
    }

    @Test
    public void order_DateSelect(){
        List<Order_DTO> order_dtoList = order_Mapper.order_DateSelect("20240607");
        System.out.println(order_dtoList.size());
        for(Order_DTO order_dto : order_dtoList) {
            System.out.println(order_dto);
        }
    }

    @Test
    public void order_DateCodeSelect(){
        Order_DTO order_dto = new Order_DTO();

        order_dto.setORDER_CODE("020001");
        order_dto.setORDER_DATE("20240607");

        System.out.println(order_Mapper.order_DateCodeSelect(order_dto));
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
    public void orderlistSelect(){
        List<OrderlistDTO> orderlistDTOList = orderlistMapper.orderlistSelect();
        System.out.println(orderlistDTOList.size());
        for(OrderlistDTO orderlistDTO : orderlistDTOList) {
            System.out.println(orderlistDTO);
        }
    }

    @Test
    public void orderlistDateSelect(){
        List<OrderlistDTO> orderlistDTOList = orderlistMapper.orderlistDateSelect("20240607");
        System.out.println(orderlistDTOList.size());
        for(OrderlistDTO orderlistDTO : orderlistDTOList) {
            System.out.println(orderlistDTO);
        }
    }

    @Test
    public void orderlistDateCodeSelect(){
        OrderlistDTO orderlistSelectDTO = new OrderlistDTO();

        orderlistSelectDTO.setORDER_DATE("20240607");
        orderlistSelectDTO.setORDER_CODE("020001");

        List<OrderlistDTO> orderlistDTOList = orderlistMapper.orderlistDateCodeSelect(orderlistSelectDTO);
        System.out.println(orderlistDTOList.size());
        for(OrderlistDTO orderlistDTO : orderlistDTOList) {
            System.out.println(orderlistDTO);
        }
    }

    @Test
    public void orderlistDateCodePcodeSelect(){
        OrderlistDTO orderlistSelectDTO = new OrderlistDTO();

        orderlistSelectDTO.setORDER_DATE("20240607");
        orderlistSelectDTO.setORDER_CODE("020001");
        orderlistSelectDTO.setPRODUCT_CODE("0001");

        System.out.println(orderlistMapper.orderlistDateCodePcodeSelect(orderlistSelectDTO));
    }

    @Test
    public void maintainInsert(){
        MaintainDTO maintainDTO = new MaintainDTO();

        maintainDTO.setMAINTAIN_DATE("20240607");
        maintainDTO.setMAINTAIN_CODE("010002");
        maintainDTO.setMAINTAIN_AMOUNT(1000000);
        maintainDTO.setEMP_CODE("000001");

        maintainMapper.maintainInsert(maintainDTO);
    }

    @Test
    public void maintainSelect(){
        List<MaintainDTO> maintainDTOList = maintainMapper.maintainSelect();
        System.out.println(maintainDTOList.size());
        for(MaintainDTO maintainDTO : maintainDTOList) {
            System.out.println(maintainDTO);
        }
    }

    @Test
    public void maintainDateSelect(){
        List<MaintainDTO> maintainDTOList = maintainMapper.maintainDateSelect("20240607");
        System.out.println(maintainDTOList.size());
        for(MaintainDTO maintainDTO : maintainDTOList) {
            System.out.println(maintainDTO);
        }
    }

    @Test
    public void maintainDateCodeSelect(){
        MaintainDTO maintainSelectDTO = new MaintainDTO();

        maintainSelectDTO.setMAINTAIN_DATE("20240607");
        maintainSelectDTO.setMAINTAIN_CODE("010002");

        System.out.println(maintainMapper.maintainDateCodeSelect(maintainSelectDTO));
    }

    @Test
    public void maintainEmpcodeSelect(){
        List<MaintainDTO> maintainDTOList = maintainMapper.maintainEmpcodeSelect("000001");
        System.out.println(maintainDTOList.size());
        for(MaintainDTO maintainDTO : maintainDTOList) {
            System.out.println(maintainDTO);
        }
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
    public void membershipSelect(){
        List<MembershipDTO> membershipDTOList = membershipMapper.membershipSelect();
        System.out.println(membershipDTOList.size());
        for(MembershipDTO membershipDTO : membershipDTOList) {
            System.out.println(membershipDTO);
        }
    }

    @Test
    public void membershipCodeSelect(){
        System.out.println(membershipMapper.membershipCodeSelect("0001"));
    }

    @Test
    public void membershipNameSelect() {
        List<MembershipDTO> membershipDTOList = membershipMapper.membershipNameSelect("서웅진");
        System.out.println(membershipDTOList.size());
        for(MembershipDTO membershipDTO : membershipDTOList) {
            System.out.println(membershipDTO);
        }
    }

    @Test
    public void membershipPhoneSelect() {
        List<MembershipDTO> membershipDTOList = membershipMapper.membershipPhoneSelect("01054368632");
        System.out.println(membershipDTOList.size());
        for(MembershipDTO membershipDTO : membershipDTOList) {
            System.out.println(membershipDTO);
        }
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
    public void displaySelect(){
        List<DisplayDTO> displayDTOList = displayMapper.displaySelect();
        System.out.println(displayDTOList.size());
        for(DisplayDTO displayDTO : displayDTOList) {
            System.out.println(displayDTO);
        }
    }

    @Test
    public void displayCodeSelect(){
        DisplayDTO displayDTO = displayMapper.displayCodeSelect("0001");
        System.out.println(displayDTO);
    }

    @Test
    public void displayNameSelect(){
        DisplayDTO displayDTO = displayMapper.displayNameSelect("먹태깡");
        System.out.println(displayDTO);
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
    public void storageSelect(){
        List<StorageDTO> storageDTOList = storageMapper.storageSelect();
        System.out.println(storageDTOList.size());
        for(StorageDTO storageDTO : storageDTOList) {
            System.out.println(storageDTO);
        }
    }

    @Test
    public void storageCodeSelect(){
        StorageDTO storageDTO = storageMapper.storageCodeSelect("0001");
        System.out.println(storageDTO);
    }

    @Test
    public void storageNameSelect(){
        StorageDTO storageDTO = storageMapper.storageNameSelect("먹태깡");
        System.out.println(storageDTO);
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
    public void discardlistSelect(){
        List<DiscardlistDTO> discardlistDTOList = discardlistMapper.discardlistSelect();
        System.out.println(discardlistDTOList.size());
        for(DiscardlistDTO discardlistDTO : discardlistDTOList) {
            System.out.println(discardlistDTO);
        }
    }

    @Test
    public void discardlistDateCodeSelect(){
        DiscardlistDTO discardlistSelectDTO = new DiscardlistDTO();

        discardlistSelectDTO.setDISCARD_DATE("20240607");
        discardlistSelectDTO.setDISCARD_TYPE_CODE("S");

        List<DiscardlistDTO> discardlistDTOList = discardlistMapper.discardlistDateCodeSelect(discardlistSelectDTO);
        System.out.println(discardlistDTOList.size());
        for(DiscardlistDTO discardlistDTO : discardlistDTOList) {
            System.out.println(discardlistDTO);
        }
    }

    @Test
    public void discardlistDateCodePcodeSelect(){
        DiscardlistDTO discardlistSelectDTO = new DiscardlistDTO();

        discardlistSelectDTO.setDISCARD_DATE("20240607");
        discardlistSelectDTO.setDISCARD_TYPE_CODE("S");
        discardlistSelectDTO.setPRODUCT_CODE("0001");

        System.out.println(discardlistMapper.discardlistDateCodePcodeSelect(discardlistSelectDTO));
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
    public void prodmanageSelect(){
        List<ProdmanageDTO> prodmanageDTOList = prodmanageMapper.prodmanageSelect();
        System.out.println(prodmanageDTOList.size());
        for(ProdmanageDTO prodmanageDTO : prodmanageDTOList) {
            System.out.println(prodmanageDTO);
        }
    }

    @Test
    public void prodmanageDateCodeSelect(){
        ProdmanageDTO prodmanageSelectDTO = new ProdmanageDTO();

        prodmanageSelectDTO.setMANAGE_DATE("20240607");
        prodmanageSelectDTO.setMANAGE_TYPE_CODE("D");

        List<ProdmanageDTO> prodmanageDTOList = prodmanageMapper.prodmanageDateCodeSelect(prodmanageSelectDTO);
        System.out.println(prodmanageDTOList.size());
        for(ProdmanageDTO prodmanageDTO : prodmanageDTOList) {
            System.out.println(prodmanageDTO);
        }
    }

    @Test
    public void prodmanageDateCodePcodeSelect(){
        ProdmanageDTO prodmanageSelectDTO = new ProdmanageDTO();

        prodmanageSelectDTO.setMANAGE_DATE("20240607");
        prodmanageSelectDTO.setMANAGE_TYPE_CODE("D");
        prodmanageSelectDTO.setPRODUCT_CODE("0001");

        System.out.println(prodmanageMapper.prodmanageDateCodePcodeSelect(prodmanageSelectDTO));
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
    public void purchaseSelect(){
        List<PurchaseDTO> purchaseDTOList = purchaseMapper.purchaseSelect();
        System.out.println(purchaseDTOList.size());
        for(PurchaseDTO purchaseDTO : purchaseDTOList) {
            System.out.println(purchaseDTO);
        }
    }

    @Test
    public void purchaseDateSelect(){
        List<PurchaseDTO> purchaseDTOList = purchaseMapper.purchaseDateSelect("20240607");
        System.out.println(purchaseDTOList.size());
        for(PurchaseDTO purchaseDTO : purchaseDTOList) {
            System.out.println(purchaseDTO);
        }
    }

    @Test
    public void purchaseDateCodeSelect(){
        PurchaseDTO purchaseSelectDTO = new PurchaseDTO();

        purchaseSelectDTO.setPURCHASE_DATE("20240607");
        purchaseSelectDTO.setPURCHASE_CODE("120001");

        System.out.println(purchaseMapper.purchaseDateCodeSelect(purchaseSelectDTO));
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
    public void purlistSelect(){
        List<PurlistDTO> purlistDTOList = purlistMapper.purlistSelect();
        System.out.println(purlistDTOList.size());
        for(PurlistDTO purlistDTO : purlistDTOList) {
            System.out.println(purlistDTO);
        }
    }

    @Test
    public void purlistDateCodeSelect(){
        PurlistDTO purlistSelectDTO = new PurlistDTO();
        purlistSelectDTO.setPURCHASE_DATE("20240607");
        purlistSelectDTO.setPURCHASE_CODE("120001");

        List<PurlistDTO> purlistDTOList = purlistMapper.purlistDateCodeSelect(purlistSelectDTO);
        System.out.println(purlistDTOList.size());
        for(PurlistDTO purlistDTO : purlistDTOList) {
            System.out.println(purlistDTO);
        }
    }

    @Test
    public void purlistDateCodePcodeSelect(){
        PurlistDTO purlistSelectDTO = new PurlistDTO();
        purlistSelectDTO.setPURCHASE_DATE("20240607");
        purlistSelectDTO.setPURCHASE_CODE("120001");
        purlistSelectDTO.setPRODUCT_CODE("0001");

        System.out.println(purlistMapper.purlistDateCodePcodeSelect(purlistSelectDTO));
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

    @Test
    public void returnlistSelect(){
        List<ReturnlistDTO> returnlistDTOList = returnlistMapper.returnlistSelect();
        System.out.println(returnlistDTOList.size());
        for(ReturnlistDTO returnlistDTO : returnlistDTOList) {
            System.out.println(returnlistDTO);
        }
    }


    @Test
    public void returnlistPurdatePurCodePcodeSelect(){
        ReturnlistDTO returnlistSelectDTO = new ReturnlistDTO();

        returnlistSelectDTO.setPURCHASE_DATE("20240607");
        returnlistSelectDTO.setPURCHASE_CODE("120001");
        returnlistSelectDTO.setPRODUCT_CODE("0001");

        System.out.println(returnlistMapper.returnlistPurdatePurcodePcodeSelect(returnlistSelectDTO));
    }

    @Test
    public void returnlistDateSelect(){
        List<ReturnlistDTO> returnlistDTOList = returnlistMapper.returnlistDateSelect("20240607");
        System.out.println(returnlistDTOList.size());
        for(ReturnlistDTO returnlistDTO : returnlistDTOList) {
            System.out.println(returnlistDTO);
        }
    }

}
