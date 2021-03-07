package com.sharnoxz.allegrocare.ui.home;

import com.sharnoxz.allegrocare.R;

import java.util.ArrayList;

public class DataSources{
    public ArrayList<VerticalData> loadVerticalData(){
        ArrayList<VerticalData> data = new ArrayList<VerticalData>();
        VerticalData
                verticalData = new VerticalData(loadHorizontalData1(),"Facilities","Allegrocare is an artificially intelligent mobile app that analyses skin allergies and recommends remedies for the same. Our skin lesion detection algorithm provides accurate and fast results and is packed with vital resources to fight against different allergies.", R.drawable.allegrocare_yellow,true);
        data.add(verticalData);
        verticalData = new VerticalData(loadHorizontalData2(),"Basic Needs","sajjhh",R.drawable.applogo,false);
        data.add(verticalData);
        verticalData = new VerticalData(loadHorizontalData3(),"Help & Care","sajjhh",R.drawable.applogo,false);
        data.add(verticalData);
        return data;
    }

    private ArrayList<HorizontalData> loadHorizontalData1() {
        ArrayList<HorizontalData> data = new ArrayList<HorizontalData>();
        HorizontalData
                horizontalData = new HorizontalData(R.drawable.appointment,R.drawable.doc_appointment,"Appointment");
        data.add(horizontalData);
        horizontalData = new HorizontalData(R.drawable.care2,R.drawable.care_card,"Care");
        data.add(horizontalData);
        horizontalData = new HorizontalData(R.drawable.medicine,R.drawable.pill_drug_cal,"Medicines");
        data.add(horizontalData);
        horizontalData = new HorizontalData(R.drawable.ambulance,R.drawable.ambulance_book,"Ambulance");
        data.add(horizontalData);
        horizontalData = new HorizontalData(R.drawable.diagnosis,R.drawable.splashscreen,"Diagnosis");
        data.add(horizontalData);
        horizontalData = new HorizontalData(R.drawable.bloodbank,R.drawable.splashscreen,"Blood Bank");
        data.add(horizontalData);
        horizontalData = new HorizontalData(R.drawable.test_report,R.drawable.splashscreen,"Test Reports");
        data.add(horizontalData);
        return data;
    }

    private ArrayList<HorizontalData> loadHorizontalData2() {
        ArrayList<HorizontalData> data = new ArrayList<HorizontalData>();
        HorizontalData
                horizontalData = new com.sharnoxz.allegrocare.ui.home.HorizontalData(R.drawable.alcohol_sanitizer,R.drawable.splashscreen,"Sanitizer");
        data.add(horizontalData);
        horizontalData = new HorizontalData(R.drawable.gloves,R.drawable.splashscreen,"Gloves");
        data.add(horizontalData);
        horizontalData = new HorizontalData(R.drawable.mask,R.drawable.splashscreen,"Mask");
        data.add(horizontalData);
        horizontalData = new HorizontalData(R.drawable.soap,R.drawable.splashscreen,"Soap");
        data.add(horizontalData);
        return data;
    }

    private ArrayList<HorizontalData> loadHorizontalData3() {
        ArrayList<HorizontalData> data = new ArrayList<HorizontalData>();
        HorizontalData
                horizontalData = new com.sharnoxz.allegrocare.ui.home.HorizontalData(R.drawable.helpline,R.drawable.splashscreen,"Helpline");
        data.add(horizontalData);
        horizontalData = new com.sharnoxz.allegrocare.ui.home.HorizontalData(R.drawable.care1,R.drawable.care_card,"Help & Care");
        data.add(horizontalData);
        horizontalData = new HorizontalData(R.drawable.appointment,R.drawable.doc_appointment,"Appointment");
        data.add(horizontalData);
        horizontalData = new HorizontalData(R.drawable.blog,R.drawable.splashscreen,"Blog");
        data.add(horizontalData);
        return data;
    }

}
