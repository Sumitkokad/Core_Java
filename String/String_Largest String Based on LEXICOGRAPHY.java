//THE CALCULATION OF LARGEST STRING BASED ON ARRANGEMENT OF ALPHABATES KNOWN AS LEXICOGRAPHY

public class main{
    public static void main(String args[]){
        String fruits[]={"appale","banana","pineapple"};
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];  //The largest is small then the value of fruits[i] i assign to largest
            }
        }
        System.out.println(largest);
    }
}
