
package com.apartech.form;

public class Complaint {
    String complaint_num, flat_num, complaint, house_help, compliant, complaint_date, status;
    
    public Complaint( String complaint_num, String flat_num, String complaint, String house_help, String compliant, String complaint_date, String status){
        this.complaint_num = complaint_num;
        this.flat_num = flat_num;
        this.complaint = complaint;
        this.house_help = house_help;
        this.compliant = compliant;
        this.complaint_date = complaint_date;
        this.status = status;
            
    }

    public String getComplaint_num() {
        return complaint_num;
    }

    public String getFlat_num() {
        return flat_num;
    }

    public String getComplaint() {
        return complaint;
    }

    public String getHouse_help() {
        return house_help;
    }

    public String getCompliant() {
        return compliant;
    }

    public String getCp_date() {
        return complaint_date;
    }
    
    public String getStatus() {
        return status;
    }
}
