
package com.apartech.form;

public class Maintenance {
    String flat_num, emp_id, amount, quarter_1, quarter_2, quarter_3, quarter_4, expense;
    
    public Maintenance(String flat_num, String emp_id,String amount, String quarter_1, String quarter_2, String quarter_3, String quarter_4, String expense){
        this.flat_num = flat_num;
        this.emp_id = emp_id;
        this.amount = amount;
        this.quarter_1 = quarter_1;
        this.quarter_2 = quarter_2;
        this.quarter_3 = quarter_3;
        this.quarter_4 = quarter_4;
        this.expense = expense;
    }
    
    public String getFlat_num() {
        return flat_num;
    }

    public String getEmp_id() {
        return emp_id;
    }
    
    public String getAmount() {
        return amount;
    }

    public String getQuarter_1() {
        return quarter_1;
    }

    public String getQuarter_2() {
        return quarter_2;
    }

    public String getQuarter_3() {
        return quarter_3;
    }

    public String getQuarter_4() {
        return quarter_4;
    }

    public String getExpense() {
        return expense;
    }
}
