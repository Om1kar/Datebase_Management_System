public class EmployeePayroll {
    private int id, salary, phone, basicpay, deductions, taxablepay, netpay;
    private String name, start, gender, department, address;

    public int getId() {
        return id;
    }

    public int getDeductions() {
        return deductions;
    }

    public void setDeductions(int deductions) {
        this.deductions = deductions;
    }

    public int getTaxablepay() {
        return taxablepay;
    }

    public void setTaxablepay(int taxablepay) {
        this.taxablepay = taxablepay;
    }

    public int getNetpay() {
        return netpay;
    }

    public void setNetpay(int netpay) {
        this.netpay = netpay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getBasicpay() {
        return basicpay;
    }

    public void setBasicpay(int basicpay) {
        this.basicpay = basicpay;
    }
}
