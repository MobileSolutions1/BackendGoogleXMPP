/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ulife.googlexmpp;

import java.io.IOException;
import java.util.Set;

/**
 *
 * @author marcelo
 */
public class GCMNotification {

    // Put your Google API Server Key here
    private static final String GOOGLE_SERVER_KEY = "AIzaSyC3mluaIT8sbdXpJCgf-s_SUkRKTEmpCgg";

    // Put your Google Project number here
    private static final String GOOGLE_USERNAME = "779755635636" + "@gcm.googleapis.com";

    public static void main(String[] args) {
        try {
            String userMessage = "TESTE";
            //String toDeviceRegId = "APA91bHBWyDwavSRJY64SlPHd18pgS-C16Kj6hy1rEKyWFGyO3-ZvZBCichtpevNrxsVA3GvS3qOIe0l83FdKo5yVsXqPye8Hz8c_wtnnLESEUOFjzYJCqwU5e4XzEoqOdrOYx3BWIKl";
            String toDeviceRegId = "APA91bEO6VXRVVckexwLZLOMdb_XSX19UDJ45DCkMpTm2Ilh_CnwAOXOOIjlqj0VTm9FtRSXW6d1swBB0D9XTfxKNCL0jyNyLIdLkZKmOG3QeByblJ9bDLsEQ07mXCugRGTi9web1z8J";
            
            SmackCcsClient.sendMessage(GOOGLE_USERNAME, GOOGLE_SERVER_KEY,
                    toDeviceRegId, userMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
