 import java.util.*;
 import java.util.Scanner;
public class Farm_animals {
    static Scanner input = new Scanner(System.in);
    static ArrayList <cowclass> cows = new ArrayList <>();
    static ArrayList <sheapclass> sheaps = new ArrayList <>();
    static ArrayList <donkeyclass>  donkeys =new ArrayList<>();

    public static void main(String args) {
        int select = input.nextInt();
        do {
            System.out.println(" please select one these situation: 1- add 2- display 3- edit 4-remove 5- search 6- exit");

            if (select == 1) {
                Add_animal();
            } else if (select ==2) {
                Display_animal();
            }else if (select ==3) {
                edit_animal();
            }else if (select ==4){
                remove_animal();
            }else if (select == 5){
             Search_animal();
            }
        }
        while (select  == 6 );

    }

          public static  void Display_animal() {
        if( cows.size()==0 && sheaps.size()==0 && donkeys.size()==0) {
          System.out.println (" you do not have any animal in your list");
         } else {
            for ( int i =0 ; i < cows.size() ; i++){
                System.out.println (" your cow list "+ (i+1) + cows.get(i).getWeight() +cows.get(i).getAge()+cows.get(i).getColor());
            } for (int i=0 ; i< sheaps.size(); i++){
                System.out.println (" your sheap list is"+ (i+1)+ sheaps.get(i).getWeight()+sheaps.get(i).getWeightwool()+ sheaps.get(i).getAge());
            } for (int i=0; i< donkeys.size(); i++){
                System.out.println(" your donkey list is" + (i+1)+ donkeys.get(i).getWeight()+ donkeys.get(i).getAge() + donkeys.get(i).getLength());
            }
        }

        }
        public static void edit_animal (){
        System.out.println(" what kind do animal do you intend to edit 1-cow 2-sheap 3-donke");
        int select;
        select = input.nextInt();
        switch ( select){

            case 1:
                System.out.println(" please enter your cow's id ");
                int id = input.nextInt();
                for ( int i=0 ;i<cows.size(); i++ ){
                    if ( cows.get(i).getId_cow()==id){
                        System.out.println(" please opt your items in this id 1- weight 2- age 3- color for edit");
                        int opt= input.nextInt();
                        switch (opt){

                            case 1:
                                System.out.println (" please enter your weight");
                                cows.get(i).setWeight(input.nextInt());
                                break;

                            case 2:
                                System.out.println (" please enter your age");
                                cows.get(i).setAge(input.nextInt());
                                break;

                            case 3:
                                System.out.println (" please enter your color");
                                cows.get(i).setColor(input.next());
                                break;

                                default :
                                System.out.println (" your element is not in your list");
                        }
                    }
                }
            case 2:
                System.out.println (" please enter your sheap's id");
                 id = input.nextInt();
                for (int i =0; i<sheaps.size();i++ ){
                    if (sheaps.get(i).getId_sheap() == id){
                        System.out.println (" please enter your item that you intend to edit 1- weight 2- weightwool 3- age  ");
                        int opt = input.nextInt();
                        switch (opt){
                            case 1:
                                System.out.println (" please enter your weight ");
                                sheaps.get(i).setWeight(input.nextInt());
                                break;

                            case 2:
                                System.out.println (" please enter your weightwool ");
                                sheaps.get(i).setWeight(input.nextInt());
                                break;

                            case 3:
                                System.out.println (" please enter your age  ");
                                sheaps.get(i).setAge(input.nextInt());
                                break;

                            default :
                                System.out.println (" your element is not in your list");
                        }
                    }
                }
            case 3:
                System.out.println (" please enter your id");
                id = input.nextInt();
                for (int i=0; i<donkeys.size(); i++){
                    if (donkeys.get(i).getId_donkey() == id){
                        System.out.println (" please opt what element do you intend to edit 1- weight 2- age 3- length");
                        int opt = input.nextInt();
                        switch (opt){
                            case 1:
                                System.out.println (" please enter your weight");
                                donkeys.get(i).setWeight(input.nextInt());
                             break;

                             case 2:
                                System.out.println (" please enter your age ");
                                donkeys.get(i).setAge(input.nextInt());
                                break;

                            case 3:
                                System.out.println (" please enter your length");
                                donkeys.get(i).setLength(input.nextInt());
                                break;

                            default :
                                System.out.println (" your element is not in your list");
                        }
                    }
                }
            default :
                System.out.println (" your item is not in your list");
          }
        }
        public static void remove_animal(){
            int id = input.nextInt();
        System.out.println (" please select your animals 1-cow  2-sheap 3- donkey");
        int select = input.nextInt();
        switch ( select){
            case 1:
            System.out.println(" please enter cow's id");

            for (int i=0; i<cows.size();i++){
                if (cows.get(i).getId_cow() == id){
                    cows.remove(i);
                    System.out.println (" your element is deleted");
                }
            }
            break;
            case 2:
                System.out.println (" please enter sheap's id");
                for ( int i=0 ; i<sheaps.size() ; i++){
                    if (sheaps.get(i).getId_sheap() == id){
                        sheaps.remove(i);
                        System.out.println ("your element is deleted");
                    }
                }
                break;
            case 3:
                System.out.println (" please enter donkey's id");
                for (int i=0 ; i< donkeys.size();i++){
                    if (donkeys.get(i).getId_donkey() == id){
                        donkeys.remove(i);
                        System.out.println (" your element is deleted");
                    }
                }
            default :
                System.out.println (" your id is not in your list");
             }
    }

    public static void Search_animal(){
  System.out.println (" please enter your animal 1-cow 2-sheap 3- donkey");
int animalType= input.nextInt();
switch (animalType){

    case 1:
        System.out.println(" please enter your number of animal");
        int number = input.nextInt();
        if ( number ==1){
            System.out.println(" please enter your id");
            int id= input.nextInt();
            for ( int i=0;i<cows.size();i++){
                if ( cows.get(i).getId_cow()== id){
                    System.out.println(" your cow is "+ cows.get(i).getId_cow()+ cows.get(i).cowDetails());
                }
            }
        } else if ( number >=2){
            System.out.println(" please enter your cow's elements 1- weight 2- age 3- color");
            int element= input.nextInt();
            System.out.println(" please enter your weight");
            int weight = input.nextInt();
            for (int i=0; i<cows.size();i++){
                if (cows.get(i).getWeight()== weight){
                    System.out.println(" your cow is "+ cows.get(i).getWeight()+cows.get(i).cowDetails());
                }
            }
            System.out.println(" please enter your age ");
            int age= input.nextInt();
            for (int i=0;i<cows.size();i++) {
                if (cows.get(i).getAge()== age){
                    System.out.println(" your cow age is "+ cows.get(i).getAge()+cows.get(i).cowDetails());
                }
            }
            System.out.println(" please enter color");
            String color= input.next();
            for (int i=0;i<cows.size();i++){
                if (cows.get(i).getColor()==color){
                    System.out.println(" your cow's color is "+cows.get(i).getColor()+cows.get(i).cowDetails());
                }
            }
            break;
                    }

    case 2:
        System.out.println(" please enter your number of animal");
         number = input.nextInt();
         if ( number ==1){
             System.out.println(" please enter your id");
             int id =input.nextInt();
             for ( int i=0;i<sheaps.size();i++){
                 if ( sheaps.get(i).getId_sheap()== id){
                     System.out.println(" your sheap's id is "+ sheaps.get(i).getId_sheap()+sheaps.get(i).sheapDetails());
                 }
             }
         } else if ( number>2){
             System.out.println(" please enter your elements 1- weight 2-age 3-weightwool");
             int element=input.nextInt();
             System.out.println(" please enter your weight");
             int weight= input.nextInt();
             for (int i=0; i<sheaps.size(); i++){
                 if (sheaps.get(i).getWeight()== weight){
                     System.out.println(" your sheap's weight is "+sheaps.get(i).getWeight()+sheaps.get(i).sheapDetails());
                 }
             }
             System.out.println(" please enter your age");
             int age = input.nextInt();
             for(int i=0; i<sheaps.size(); i++){
                 if (sheaps.get(i).getAge()== age){
                     System.out.println(" your sheap's age is "+ sheaps.get(i).getAge()+sheaps.get(i).sheapDetails());
                 }
             }
             System.out.println(" please enter your weightwool");
                     int weightwool = input.nextInt();
                     for (int i=0; i<sheaps.size(); i++){
                         if( sheaps.get(i).getWeightwool() == weightwool ){
                             System.out.println(" your weightwool is "+sheaps.get(i).getWeightwool()+sheaps.get(i).sheapDetails());
                         }
                     }
                     break;
         }
    case 3:
        System.out.println(" please enter your number of animal");
         number = input.nextInt();
        if (number ==1 ){
            System.out.println (" please enter your id ");
            int id = input.nextInt();
            for (int i=0; i<donkeys.size(); i++){
                if(donkeys.get(i).getId_donkey()==id){
                    System.out.println (" your id is "+ donkeys.get(i).getId_donkey()+donkeys.get(i).donkeyDetails());
                }
            }
        }else if (number >2){
            System.out.println(" please enter your elements 1- weight 2-age 3-lenght");
            int element = input.nextInt();
            System.out.println (" please enter weight");
            int weight =input.nextInt();
            for(int i=0; i<donkeys.size(); i++){
                if (donkeys.get(i).getWeight() == weight){
                    System.out.println ("donkey's weight is" + donkeys.get(i).getWeight()+ donkeys.get(i).donkeyDetails());
                }
            }
         System.out.println (" please enter your age  ");
        int age = input.nextInt();
        for (int i=0; i<donkeys.size(); i++){
            if ( donkeys.get(i).getAge() == age){
                System.out.println (" donkey's age is "+ donkeys.get(i).getAge()+ donkeys.get(i).donkeyDetails());
            }
        } System.out.println (" please enter your lenght ");
           int length = input.nextInt();
        for (int i=0; i<donkeys.size(); i++){
            if ( donkeys.get(i).getLength() == length ){
                System.out.println (" donkey's lenght is "+ donkeys.get(i).getLength()+ donkeys.get(i).donkeyDetails());
            }
        }

       break;
        }
    default :
        System.out.println (" your element is not is your list");
}


    }


             public static void Add_animal () {

                 int select = input.nextInt();
                 int choice= input.nextInt();
                 do {
                     int i = 0;
                     System.out.println(" please select your animals 1-cow 2-sheap 3-donkey ");
                     int animalTyoe = input.nextInt();
                     System.out.println(" please enter the number of each  animal");
                     int number = input.nextInt();

                     switch (animalTyoe) {
                         case 1:
                             do {
                                 System.out.println(" please enter your weight, age , color of your animal");
                                 cowclass cow = new cowclass(input.nextInt(), input.nextInt(), input.next());
                                 cows.add(cow);
                                 System.out.println(" your id's cow is "+ cows.get(cows.indexOf(cow)).getId_cow());
                                 i++;
                             }
                             while (i < number);
                             break;

                         case 2:
                             do {
                                 System.out.println(" please enter your weight, age , weightwool of your animal");
                                 sheapclass sheap = new sheapclass(input.nextInt(), input.nextInt(), input.nextInt());
                                 sheaps.add(sheap);
                                 System.out.println(" your id's sheap is " + sheaps.get(sheaps.indexOf(sheap)).getId_sheap());

                                 i++;
                             }
                             while (i < number);
                             break;
                         case 3:
                             do {
                                 System.out.println(" please enter your weight, age , color of your animal");
                                 donkeyclass donkey = new donkeyclass(input.nextInt(), input.nextInt(), input.nextInt());
                                 donkeys.add(donkey);
                                 System.out.println(" your id's donkey is" + donkeys.get(donkeys.indexOf(donkey)).getId_donkey());
                                 i++;
                                 break;
                             }
                             while (i < number);
                         default:
                             System.out.println(" your animal is not in our list ");
                     }
                     System.out.println(" if you want to continue this process 1-yes 2- no ");

                      input.nextInt();
                 }
                while (choice == 1);
              }

          }


class cowclass {
   private int weight;
    private int age;
   private String color;
   private int id_cow;
    cowclass (int weight ,int age, String color) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.id_cow = Farm_animals.cows.size()+1;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId_cow(int id_cow) {
        this.id_cow = id_cow;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getId_cow() {
        return id_cow;
    }

    public String cowDetails(){
        return " cow's weight is "+ weight + " cow's age is "+ age + " cow's color is "+ color + "cow's id is "+ id_cow ;

    }
}
    class sheapclass{
       private int weight;
        private int age;
        private int weightwool;
        private int id_sheap;
        sheapclass (int weight, int age, int weightwool){

            this.weight =weight;
            this.age= age;
            this. weightwool= weightwool;
            this.id_sheap = Farm_animals.sheaps.size()+1;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setWeightwool(int weightwool) {
            this.weightwool = weightwool;
        }

        public void setId_sheap(int id_sheap) {
            this.id_sheap = id_sheap;
        }

        public int getWeight() {
            return weight;
        }

        public int getAge() {
            return age;
        }

        public int getWeightwool() {
            return weightwool;
        }

        public int getId_sheap() {
            return id_sheap;
        }

        public String sheapDetails(){
            return " sheap's weight is "+weight + "sheap's age is "+ age + "sheap's weightwool is "+ weightwool + "sheap's id is "+ id_sheap;

        }
    }

     class donkeyclass {
    private int weight;
    private int age;
    private int length;
    private int id_donkey;
    donkeyclass (int weight, int age, int length){
        this.weight = weight;
        this.age=age;
        this.length= length;
        this.id_donkey = Farm_animals.donkeys.size()+1;
            }

         public void setWeight(int weight) {
             this.weight = weight;
         }

         public void setAge(int age) {
             this.age = age;
         }

         public void setLength(int length) {
             this.length = length;
         }

         public void setId_donkey(int id_donkey) {
             this.id_donkey = id_donkey;
         }

         public int getWeight() {
             return weight;
         }

         public int getAge() {
             return age;
         }

         public int getLength() {
             return length;
         }

         public int getId_donkey() {
             return id_donkey;
         }

         public String donkeyDetails(){
        return "donkey's weight is"+ weight + " donkey's age is "+ age + " donkey's length is "+ length + " donkey's id is "+ id_donkey;
         }
     }



