
package com.apartech.form;

class Purchase {
            String flat_num, floor_num, area_sqft, ap_contact, block_name, ap_bhk, ap_name, ap_status, price, purchase_date;
            
            public Purchase(String flat_num, String block_name, String floor_num, String area_sqft, String ap_bhk, String ap_name, String ap_contact,String price, String purchase_date, String ap_status){
                this.flat_num = flat_num;
                this.block_name = block_name;
                this.floor_num = floor_num;
                this.area_sqft = area_sqft;
                this.ap_bhk = ap_bhk;
                this.ap_name = ap_name;
                this.ap_contact = ap_contact;
                this.price = price;
                this.purchase_date = purchase_date;
                this.ap_status = ap_status;
            }


    public String getFlat_num() {
        return flat_num;
    }

    public String getFloor_num() {
        return floor_num;
    }

    public String getArea_sqft() {
        return area_sqft;
    }

    public String getAp_contact() {
        return ap_contact;
    }

    public String getBlock_name() {
        return block_name;
    }

    public String getAp_bhk() {
        return ap_bhk;
    }

    public String getAp_name() {
        return ap_name;
    }
    
    public String getPrice() {
        return price;
    }

    public String getPurchase_date() {
        return purchase_date;
    }
    
    public String getAp_status() {
        return ap_status;
    }
}
