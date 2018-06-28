package sample;

import receptionist.VarReceptionist;

public class FindTable {
    public static String findStdTable(){
        String table;
        if(VarReceptionist.degreeType.equals("Bachelor")){
            if(VarReceptionist.schoolType.equals("School of Business")){
                if(VarReceptionist.year.equals("1")){
                    table="bachelor_business_firstyear";
                }
                else if(VarReceptionist.year.equals("2")){
                    table="bachelor_business_secondyear";
                }
                else if(VarReceptionist.year.equals("3")){
                    table="bachelor_business_thirdyear";
                }
                else{
                    table="bachelor_business_fourthyear";
                }
            }
            else if(VarReceptionist.schoolType.equals("School of Computing")){
                if(VarReceptionist.year.equals("1")){
                    table="bachelor_computing_firstyear";
                }
                else if(VarReceptionist.year.equals("2")){
                    table="bachelor_computing_secondyear";
                }
                else if(VarReceptionist.year.equals("3")){
                    table="bachelor_computing_thirdyear";
                }
                else {
                    table="bachelor_computing_fourthyear";
                }
            }
            else{
                if(VarReceptionist.year.equals("1")){
                    table="bachelor_engineering_firstyear";
                }
                else if(VarReceptionist.year.equals("2")){
                    table="bachelor_engineering_secondyear";
                }
                else if(VarReceptionist.year.equals("3")){
                    table="bachelor_engineering_thirdyear";
                }
                else{
                    table="bachelor_engineering_fourthyear";
                }
            }
        }

        else{
            if(VarReceptionist.schoolType.equals("School of Business")){
                if(VarReceptionist.year.equals("1")){
                    table="master_business_firstyear";
                }
                else{
                    table="master_business_secondyear";
                }
            }
            else if(VarReceptionist.schoolType.equals("School of Computing")){
                if(VarReceptionist.year.equals("1")){
                    table="master_computing_firstyear";
                }
                else{
                    table="master_computing_secondyear";
                }
            }
            else{
                if(VarReceptionist.year.equals("1")){
                    table="master_engineering_firstyear";
                }
                else{
                    table="master_engineering_secondyear";
                }
            }
        }
        return table;

    }
}

