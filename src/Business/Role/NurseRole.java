/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.NurseRole.NurseWorkAreaJPanel;
import javax.swing.JPanel;



/**
 *
 * @author ayushi
 */
public class NurseRole extends Role {

   

    @Override
    public JPanel createWorkArea(JPanel pnl, UserAccount ua, Organization o, Enterprise e, EcoSystem es) {
       return new NurseWorkAreaJPanel(pnl,ua,(NurseOrganization)o, e);
    }
    
}
