package Lambda_Expressions;


import java.util.function.Predicate;

class Cricketer {

    String name;
    String designation;
    int salary;
    String team;

    Cricketer(String name,String designation,int salary,String team)
    {
        this.name=name;
        this.designation=designation;
        this.salary=salary;
        this.team=team;
    }

    @Override
    public String toString() {
        return name+" "+designation+" "+salary+" "+team;
    }

}


public class MainCricket
    {static int i=1;
        public static void disp(Cricketer[] cricketers,Predicate<Cricketer> t){
        for (Cricketer cric:cricketers)
        {
            if (t.test(cric))
            {
                System.out.println(i++ +" "+ cric.toString());
            }
        }
        i=1;
        }

        public static void main(String[] args) {
            Cricketer[] cricketers={
                    new Cricketer("Dhoni","Captain",500000,"CSK"),
                    new Cricketer("Vijay","Batsman",430000,"CSK"),
                    new Cricketer("Rohit","Captain",200000,"MUMBAI INDIANS"),
                    new Cricketer("Hardik","Allrounder",300000,"MUMBAI INDIANS"),
                    new Cricketer("Virat","Captain",400000,"RCB"),
                    new Cricketer("Warner","Batsman",180000,"Sunrisers Hyderabad"),
                    new Cricketer("Raina","Allrounder",120000,"CSK"),
                    new Cricketer("Dinesh Kartik","BatsMan",360000,"Kolkatta Knight Riders"),
                    new Cricketer("Chahal","Bowler",260000,"RCB"),
                    new Cricketer("AB-Devilliers","Batsman",160000,"RCB"),
                    new Cricketer("Parthiv Patel","Batsman",210000,"RCB"),
                    new Cricketer("Shane Watson","Batsman",245000,"CSK"),
                    new Cricketer("Chris Woakes","Bowler",290000,"RCB"),
                    new Cricketer("DJ-Bravo","Bowler",170000,"CSK")
            };


            //---------Cricketers who are all Captains--------------------
            Predicate<Cricketer> Captain=captain->captain.designation.equalsIgnoreCase("Captain");
            System.out.println("----------------Cricketers who're Captains in the list are:-------------------");
            disp(cricketers,Captain);
            System.out.println();

            //---------Cricketers who are all Captains and Salary is greater than 200000--------------------
            Predicate<Cricketer> Captain_Salarygreater=capsal->capsal.designation.equalsIgnoreCase("Captain")&&capsal.salary>200000;
            System.out.println("----------------Cricketers who're Captains as well Salary>200000 are:-------------------");
            disp(cricketers,Captain_Salarygreater);
            System.out.println();

            //--------Cricketers Who are all Batsmans from different team---------------------------
            Predicate<Cricketer> Batsmans=batsman->batsman.designation.equalsIgnoreCase("batsman");
            System.out.println("----------------Cricketers who're all Batsmans from different team are:-------------------");
            disp(cricketers,Batsmans);
            System.out.println();

            //--------All the information of players who are all not captains---------------------------
            System.out.println("----------------Players information who are not captains of team:-------------------");
            disp(cricketers,Captain.negate());
            System.out.println();

            //--------Player who are batsman and only plays for RCB---------------------------
            Predicate<Cricketer> batsmanplaysRCB=batsRCB->batsRCB.designation.equalsIgnoreCase("Batsman")&&batsRCB.team.equalsIgnoreCase("rcb");
            System.out.println("----------------Cricketers who're Batsmans and plays only for RCB team are:-------------------");
            disp(cricketers,batsmanplaysRCB);
            System.out.println();

            //--------All Players who played for RCB---------------------------
            Predicate<Cricketer> AllPlayersfromRCB=AllRCB->AllRCB.team.equalsIgnoreCase("rcb");
            System.out.println("----------------Cricketers who're Batsmans and plays only for RCB team are:-------------------");
            disp(cricketers,AllPlayersfromRCB);
            System.out.println();

            //--------Captain or Bowler---------------------------
            Predicate<Cricketer> Bowler=Bowl->Bowl.designation.equalsIgnoreCase("bowler");
            System.out.println("----------------Cricketers who're Batsmans and plays only for RCB team are:-------------------");
            disp(cricketers,Captain.or(Bowler));
            System.out.println();

        }
    }