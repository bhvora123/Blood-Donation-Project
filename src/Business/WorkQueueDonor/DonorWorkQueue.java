/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueueDonor;

import Business.WorkQueue.LabTestWorkRequest;

/**
 *
 * @author ayushi
 */
public class DonorWorkQueue extends LabTestWorkRequest {
    
    private String bloodType;
    private String barCode;

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
    
    
}
