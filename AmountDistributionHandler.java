public class AmountDistributionHandler {

    

    public static void amountDist(list<Appointment__c> listApp){

        list<Service_records_c> serList = new list <Service_records_c>();

        

        for(Appointment__c app : listApp){

            if(app.Maintenance_service_c == true && app.Repairsc == true && app.Replacement_Parts_c == true){

                app.Service_Amount__c = 10000;

            }

            else if(app.Maintenance_service_c == true && app.Repairs_c == true){

                app.Service_Amount__c = 5000;    

            }

            else if(app.Maintenance_service_c == true && app.Replacement_Parts_c == true){

                app.Service_Amount__c = 8000;    

            }

            else if(app.Repairs_c == true && app.Replacement_Parts_c == true){

                app.Service_Amount__c = 7000;

            }

            else if(app.Maintenance_service__c == true){

                app.Service_Amount__c = 2000;

            }

            else if(app.Repairs__c == true){

                app.Service_Amount__c = 3000;

            }

            else if(app.Replacement_Parts__c == true){

                app.Service_Amount__c = 5000;

            }

            

    }

    }

}