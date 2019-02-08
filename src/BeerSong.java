public class BeerSong {

    public static void main(String[] args) {

    System.out.println("***************** Program OutPut *****************");   //beginnning of the output
    Ninety_Nine_Bottles_of_Beer();                                              //call to the function to begin the song
    System.out.println("*****************  End of OutPut *****************");   //end of the output
    }

    public static void Ninety_Nine_Bottles_of_Beer(){

        int x = 99;
        while( x > 0){
            if(x == 1)                                                  //checks to see if we are on the last bottle
            {
                System.out.println(x + " bottle  of beer on the wall, "
                        + x + " bottle of beer");
            }
            else {
                System.out.println(x + " bottles of beer on the wall, "
                        + x + " bottles of beer,");
            }
            x--;                                                        //subtracts one from the counter to remove a bottle
            System.out.print("take one down, pass it around, ");
            if(x == 1)                                                  //checks to see if we are down to the last bottle
               System.out.println(x + " bottle of beer on the wall.");
            else if(x == 0)                                             //checks to see if we have run out of beer
               System.out.println("no more bottles of beer on the wall.");
            else
                System.out.println(x + " bottles of beer on the wall.");
        }

    }
}
