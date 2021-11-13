public class Smallestnumber {
    public static void main(String args[]){
        int a=5,b=8,c=2,d=3;
        if(a<=b){
            if(a<=c){
                if(a<=d){
                    //prints a if above two conditions are true
                    System.out.println("Smallest number is " + a);

                }

            }
        }
        if(b<=a){
            if(b<=c){
                if(b<=d){
                    System.out.println("Smallest number is:" + b);
                }

            }
        }
        if(c<=a){
            if(c<=a){
                if(c<=d){
                    System.out.println("Smallest number is:" + c);

                }
            }
        }
        if(d<=a){
            if(d<=b){
                if(d<=c){
                    System.out.println("Smallest number is:" + d);
                }
            }
        }
    }


}
