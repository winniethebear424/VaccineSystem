package model.organization;

import java.util.ArrayList;
import model.organization.Organization.Type;



public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    private ClinicOrganization clinicOrganization; 
    private ProviderOrganization providerOrganization;
    
    public OrganizationDirectory(){

        organizationList = new ArrayList<>();
        clinicOrganization = new ClinicOrganization();
        providerOrganization =new ProviderOrganization();
    }

    public ArrayList<Organization> getOrganizationList(){
        return organizationList;
    }

    public Organization createOrganization (Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.CDC.getValue())){
            organization = new CDCOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Clinic.getValue())){
            organization = new ClinicOrganization();
            organizationList.add(organization);
            clinicOrganization = (ClinicOrganization) organization; 
        }
        else if (type.getValue().equals(Type.Distributor.getValue())){
            organization = new DistributionOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HealthDept.getValue())){
            organization = new HealthDeptOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Provider.getValue())){
            organization = new ProviderOrganization();
            organizationList.add(organization);
            providerOrganization = (ProviderOrganization) organization; 
        }
        return organization;
    }
    
    public ClinicOrganization getClinicOrganization(){
        return clinicOrganization;
    }
    
    public ProviderOrganization getProviderOrganization(){
        return providerOrganization;
    }
}
