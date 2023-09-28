
package com.apartech.form;

public class Residential {
    String flat_num,  block_name,  r_name,  r_contact,  park_num,  status;
    
    public Residential(String flat_num, String block_name, String r_name, String r_contact, String park_num, String status){
        this.flat_num = flat_num;
        this.block_name = block_name;
        this.r_name = r_name;
        this.r_contact = r_contact;
        this.park_num = park_num;
        this.status = status;
    }
    
    public String getFlat_num() {
        return flat_num;
    }

    public String getBlock_name() {
        return block_name;
    }

    public String getR_name() {
        return r_name;
    }

    public String getR_contact() {
        return r_contact;
    }

    public String getPark_num() {
        return park_num;
    }

    public String getStatus() {
        return status;
    }
}
