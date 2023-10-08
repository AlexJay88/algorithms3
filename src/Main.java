
public class Main {

    public static void main(String[] args) {
        //Arraylist arraylist = new Arraylist();

        //for(int i = 0; i < 25; i++) {
        // arraylist.add("count" + i);

        //System.out.println(arraylist.toString());
    }
    public static void printNumWithRecursion(){
        printNumWithRecursion(0);
    }



    public static void printNumWithRecursion(int i){
            Arraylist arraylist = new Arraylist();
            if (i < 25) {
                printNumWithRecursion(i ++);

                    arraylist.add("count" + i);{
                    System.out.println(arraylist.toString());

                }
            }
        }}