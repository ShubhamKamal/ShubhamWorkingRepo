package com.shubham.siteview;

import com.shubham.customerview.CFEInfo;
import com.shubham.customerview.CustomerView;
import com.shubham.customerview.PhaseAndCFEInfo;
import com.shubham.customerview.View;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Driver {

    private static CustomerView getCustomerViewObject(){

        CustomerView customerView = new CustomerView();
        customerView.setId("1");
        customerView.setOfferCaseVersionId("1001");
        customerView.setOfferCaseId("10");
        customerView.setType("");

        View view1 = new View();
        view1.setId("1");
        view1.setName("John1");
        view1.setType("Site-View");
        view1.setProperties(null);
        view1.setDefaultViewColumns(null);

        View view2 = new View();
        view2.setId("2");
        view2.setName("John2");
        view2.setType("Site-View");
        view2.setProperties(null);
        view2.setDefaultViewColumns(null);

        View view3 = new View();
        view3.setId("3");
        view3.setName("John3");
        view3.setType("Site-View");
        view3.setProperties(null);
        view3.setDefaultViewColumns(null);

        List<View> viewList = new ArrayList<>();
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);

        PhaseAndCFEInfo pac1 = new PhaseAndCFEInfo();
        pac1.setPhaseId("100");

        PhaseAndCFEInfo pac2 = new PhaseAndCFEInfo();
        pac2.setPhaseId("101");

        PhaseAndCFEInfo pac3 = new PhaseAndCFEInfo();
        pac3.setPhaseId("102");

        List<PhaseAndCFEInfo> phaseAndCFEInfoList = new ArrayList<>();
        phaseAndCFEInfoList.add(pac1);
        phaseAndCFEInfoList.add(pac2);
        phaseAndCFEInfoList.add(pac3);

        customerView.setViews(viewList);

        view1.setCfes(phaseAndCFEInfoList);
        view2.setCfes(phaseAndCFEInfoList);
        view3.setCfes(phaseAndCFEInfoList);

        CFEInfo cfeInfo1 = new CFEInfo();
        cfeInfo1.setCfeId("111");
        cfeInfo1.setCfeRefId("1111");
        cfeInfo1.setQuantity(00000l);
        cfeInfo1.setSite("Delhi");

        CFEInfo cfeInfo2 = new CFEInfo();
        cfeInfo2.setCfeId("222");
        cfeInfo2.setCfeRefId("2222");
        cfeInfo2.setQuantity(00000l);
        cfeInfo2.setSite("Pune");

        CFEInfo cfeInfo3 = new CFEInfo();
        cfeInfo3.setCfeId("333");
        cfeInfo3.setCfeRefId("3333");
        cfeInfo3.setQuantity(00000l);
        cfeInfo3.setSite("Noida");

        List<CFEInfo> cfeInfoList = new ArrayList<>();
        cfeInfoList.add(cfeInfo1);
        cfeInfoList.add(cfeInfo2);
        cfeInfoList.add(cfeInfo3);
        pac1.setCfe(cfeInfoList);


        CFEInfo cfeInfo4 = new CFEInfo();
        cfeInfo4.setCfeId("444");
        cfeInfo4.setCfeRefId("4444");
        cfeInfo4.setQuantity(00000l);
        cfeInfo4.setSite("Delhi1");

        CFEInfo cfeInfo5 = new CFEInfo();
        cfeInfo5.setCfeId("555");
        cfeInfo5.setCfeRefId("5555");
        cfeInfo5.setQuantity(00000l);
        cfeInfo5.setSite("Pune1");

        CFEInfo cfeInfo6 = new CFEInfo();
        cfeInfo6.setCfeId("666");
        cfeInfo6.setCfeRefId("6666");
        cfeInfo6.setQuantity(00000l);
        cfeInfo6.setSite("Noida1");

        List<CFEInfo> cfeInfoList1 = new ArrayList<>();
        cfeInfoList1.add(cfeInfo4);
        cfeInfoList1.add(cfeInfo5);
        cfeInfoList1.add(cfeInfo6);
        pac2.setCfe(cfeInfoList1);

        CFEInfo cfeInfo7 = new CFEInfo();
        cfeInfo7.setCfeId("777");
        cfeInfo7.setCfeRefId("7777");
        cfeInfo7.setQuantity(00000l);
        cfeInfo7.setSite("Delhi2");

        CFEInfo cfeInfo8 = new CFEInfo();
        cfeInfo8.setCfeId("888");
        cfeInfo8.setCfeRefId("8888");
        cfeInfo8.setQuantity(00000l);
        cfeInfo8.setSite("Pune2");

        CFEInfo cfeInfo9 = new CFEInfo();
        cfeInfo9.setCfeId("999");
        cfeInfo9.setCfeRefId("9999");
        cfeInfo9.setQuantity(00000l);
        cfeInfo9.setSite("Noida2");

        List<CFEInfo> cfeInfoList2 = new ArrayList<>();
        cfeInfoList2.add(cfeInfo7);
        cfeInfoList2.add(cfeInfo8);
        cfeInfoList2.add(cfeInfo9);

        pac3.setCfe(cfeInfoList2);

        return customerView;
    }

    public static void main(String[] args) {

        CustomerView customerView = Driver.getCustomerViewObject();

       // customerView.getViews().stream().flatMap(cfes-> cfes.getCfes().stream().flatMap(cfe->cfe.getCfe().stream()
         //       .forEach(cfeInfo -> cfeInfo.getCfeRefId());
    }
}
