
package com.apartech.form;

public class DailyEntry {
    String sl_num, d_name, d_contact, d_date, purpose, from_loc, flat_num, emp_id;
    
    public DailyEntry(String sl_num, String d_name, String d_contact, String d_date, String purpose, String from_loc, String flat_num, String emp_id){
        this.sl_num = sl_num;
        this.d_name = d_name;
        this.d_contact = d_contact;
        this.d_date = d_date;
        this.purpose = purpose;
        this.from_loc = from_loc;
        this.flat_num = flat_num;
        this.emp_id = emp_id;
    }
    
    public String getSl_num() {
        return sl_num;
    }

    public String getD_name() {
        return d_name;
    }

    public String getD_contact() {
        return d_contact;
    }

    public String getD_date() {
        return d_date;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getFrom_loc() {
        return from_loc;
    }

    public String getFlat_num() {
        return flat_num;
    }

    public String getEmp_id() {
        return emp_id;
    }
}
