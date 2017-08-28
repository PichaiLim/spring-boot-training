package com.training.annotation;

import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//TODO mark bean component
@Component
public class EmployeeBean {

    private String firstName = "Pichai";
    private String lastName = "Limpanitivat";

    //TODO injection with setter
    @Autowired
    private AddressBean addressBean;

    private CompanyBean companyBean;

    //TODO injection with constructor
    @Autowired
    public EmployeeBean(CompanyBean companyBean) {
        this.companyBean = companyBean;
    }

    public AddressBean getAddressBean() {
        return addressBean;
    }

    public void setAddressBean(AddressBean addressBean) {
        this.addressBean = addressBean;
    }

    public CompanyBean getCompanyBean() {
        return companyBean;
    }

    public void setCompanyBean(CompanyBean companyBean) {
        this.companyBean = companyBean;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
