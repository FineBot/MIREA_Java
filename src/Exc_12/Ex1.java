package Exc_12;

public class Ex1 {
    private String Name;
    private String Surname;
    private String Midname;
    public Ex1(String Name, String Surname,String Midname){
        if(Name!=""){
        this.Name=Name;
        } else{
            this.Name="Empty";
        }
        if(Surname!=""){
        this.Surname=Surname;
        }else{ this.Surname="Empty";}
        if(Midname!=""){
            this.Midname=Midname;
        } else{
            this.Midname="Empty";
        }

    }
    public String GetName(){
        return Surname+" "+Name.split("")[0]+". "+Midname.split("")[0]+".";
    }
}
