class Badge {
    public String print(Integer id, String name, String department) {
        String BadgeID = "";
        String ReturningStr = "";
        String NewDep = "";
        
        if (id != null && department != null){
         BadgeID = "[" + Integer.toString(id) + "]";
         NewDep = department.toUpperCase();
                            
         ReturningStr = BadgeID + " - " + name + " - " + NewDep;
        }
        else if (id == null && department != null) {
            NewDep = department.toUpperCase();
            
            ReturningStr = name + " - " + NewDep;
        }
        else {
            if (id != null){
                BadgeID = "[" + Integer.toString(id) + "]";
                                
                ReturningStr = BadgeID + " - " + name + " - OWNER";
            }
            else {
                ReturningStr = name + " - OWNER";
            }
        }

        return ReturningStr;
    }
}
