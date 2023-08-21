/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Role.AdminRole;
import model.Role.CDCRole;
import model.Role.ClinicRole;
import model.Role.DeptOfPHealth;
import model.Role.DistributorRole;
import model.Role.ProviderRole;
import model.UserAccount.UserAccount;
import model.WorkQueue.RequirementMsgs;
import model.WorkQueue.VaccinOrder;
import model.WorkQueue.WorkRequest;
import model.organization.AdminOrganization;
import model.organization.CDCOrganization;
import model.organization.ClinicOrganization;
import model.organization.DistributionOrganization;
import model.organization.HealthDeptOrganization;
import model.organization.Organization;
import model.organization.ProviderOrganization;
import model.personel.Personel;

/**
 *
 * @author wenwen
 */
public class ConfigureABussiness {
    
    public static Business configuration(){
        
        //get the only one business instance
        Business bus = Business.theInstance();
        
        //creating organizations
        AdminOrganization adminOrg = new AdminOrganization();
        CDCOrganization cdcOrg = new CDCOrganization();
        ClinicOrganization clinicOrg = new ClinicOrganization();
        DistributionOrganization distributionOrg = new DistributionOrganization();
        HealthDeptOrganization healthOrg = new HealthDeptOrganization();
        ProviderOrganization providerOrg = new ProviderOrganization();
        
        //add organizations created into business instance according to their Org Type.
        bus.getOrganizationDirectory().getOrganizationList().add(adminOrg);
        bus.getOrganizationDirectory().getOrganizationList().add(cdcOrg);
        bus.getOrganizationDirectory().getOrganizationList().add(clinicOrg);
        bus.getOrganizationDirectory().getOrganizationList().add(distributionOrg);
        bus.getOrganizationDirectory().getOrganizationList().add(healthOrg);
        bus.getOrganizationDirectory().getOrganizationList().add(providerOrg);
        
        //setup userAccount, person info and add then back to specific userAccountList in their organization accordingly
        Personel adminPerson = new Personel("adminName");
        Personel cdcPerson = new Personel("cdcName");
        Personel clinicPerson = new Personel("clinicName");
        Personel healthPerson = new Personel("healthName");
        Personel distributorPerson = new Personel("distributorName");
        Personel providerPerson = new Personel("providerName");
        
        UserAccount ua1 =  new UserAccount();
        ua1.setUsername("admin");
        ua1.setPassword("admin");
        ua1.setRole(new AdminRole());
        ua1.setPerson(adminPerson);
        adminOrg.getPersonDirectory().getPersonList().add(adminPerson);
        adminOrg.getUserAccountDirectory().getUserAccountList().add(ua1);
        
        UserAccount ua2 =  new UserAccount();
        ua2.setUsername("cdc");
        ua2.setPassword("cdc");
        ua2.setRole(new CDCRole());
        ua2.setPerson(cdcPerson);
        cdcOrg.getPersonDirectory().getPersonList().add(cdcPerson);
        cdcOrg.getUserAccountDirectory().getUserAccountList().add(ua2);
                
        UserAccount ua3 =  new UserAccount();
        ua3.setUsername("clinic");
        ua3.setPassword("clinic");
        ua3.setRole(new ClinicRole());
        ua3.setPerson(clinicPerson);
        clinicOrg.getPersonDirectory().getPersonList().add(clinicPerson);
        clinicOrg.getUserAccountDirectory().getUserAccountList().add(ua3);
        
        UserAccount ua4 =  new UserAccount();
        ua4.setUsername("health");
        ua4.setPassword("health");
        ua4.setRole(new DeptOfPHealth());
        ua4.setPerson(healthPerson);
        healthOrg.getPersonDirectory().getPersonList().add(healthPerson);
        healthOrg.getUserAccountDirectory().getUserAccountList().add(ua4);
        
        UserAccount ua5 =  new UserAccount();
        ua5.setUsername("distributor");
        ua5.setPassword("distributor");
        ua5.setRole(new DistributorRole());
        ua5.setPerson(distributorPerson);
        distributionOrg.getPersonDirectory().getPersonList().add(distributorPerson);
        distributionOrg.getUserAccountDirectory().getUserAccountList().add(ua5);
        
        UserAccount ua6 =  new UserAccount();
        ua6.setUsername("provider");
        ua6.setPassword("provider");
        ua6.setRole(new ProviderRole());
        ua6.setPerson(providerPerson);
        providerOrg.getPersonDirectory().getPersonList().add(providerPerson);
        providerOrg.getUserAccountDirectory().getUserAccountList().add(ua6);
        
        
        
        //existing Vaccine Creation
        bus.getVaccineDirectory().newVaccine("Hepatitis B vaccine", "B Manufacturer", 600, 40, "2023-10-21", 20021);
        bus.getVaccineDirectory().newVaccine("Meningococcal vaccine", "A Manufacturer", 500, 60, "2023-01-29", 10021);
        bus.getVaccineDirectory().newVaccine("Hepatitis A", "B Manufacturer", 200, 90, "2023-02-21", 20022);
        bus.getVaccineDirectory().newVaccine("Hepatitis A", "A Manufacturer", 260, 90, "2022-02-21", 10021);
        bus.getVaccineDirectory().newVaccine("MMR vaccine", "A Manufacturer", 360, 140, "2022-12-08", 10022);
        bus.getVaccineDirectory().newVaccine("Hib vaccine", "B Manufacturer", 280, 800, "2023-07-17", 20023);
        
        
        //create work msgs in clinic org
        RequirementMsgs createMsgsRequest = clinicOrg.getMsgsDirectory().createMsgsRequest("Hepatitis A", 100, "not in a rush, need it in 3 weeks", "confirmed");
        RequirementMsgs createMsgsRequest1 = clinicOrg.getMsgsDirectory().createMsgsRequest("MMR vaccine", 200, "need it in 2 weeks", "confirmed");
        
        
        //Existing WorkQueue
        VaccinOrder vo1 = new VaccinOrder();
        VaccinOrder vo2 = new VaccinOrder();

        vo1.setStatus("pending");
        vo1.setReceiver(ua4);
        vo1.setMessage("asap");
        vo1.setTestResult("pass");
        vo2.setStatus("pending");
        vo2.setReceiver(ua3);
        vo2.setMessage("need in one month");
        vo2.setTestResult("pass");        
        

        bus.getWorkQueue().getVaccRequestList().add(vo2);

        bus.getWorkQueue().getVaccRequestList().add(vo1);


        return bus;
    }
    
}
