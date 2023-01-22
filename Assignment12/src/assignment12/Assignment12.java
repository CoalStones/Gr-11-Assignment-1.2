package assignment12;
import java.util.Scanner;
public class Assignment12 {

    private static void winner(int[] holder){
        int highest=holder[0],win=999;
        if(holder[0]>holder[1]&&holder[0]>holder[2])System.out.println("Contestant 1 won with "+holder[0]+" votes");
        else if (holder[1]>holder[0]&&holder[1]>holder[2])System.out.println("Contestant 2 won with "+holder[1]+" votes");
        else if(holder[2]>holder[1]&&holder[2]>holder[0])System.out.println("Contestant 3 won with "+holder[2]+" votes");
        else if(holder[0]==holder[1]&&holder[1]==holder[2])System.out.println("All three contestants won with "+holder[0]+" votes");
        else if(holder[0]==holder[1])System.out.println("Contestant 1 and 2 tied with "+holder[0]+" votes");
        else if(holder[0]==holder[2])System.out.println("Contestant 1 and 3 tied with "+holder[0]+" votes");
        else if(holder[1]==holder[2])System.out.println("Contestant 2 and 3 tied with "+holder[1]+" votes");
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] holder=new int[3];
        char charHolder;
        String votes;
        System.out.println("Enter the votes");
            votes=input.nextLine();
            votes=votes.replace(" ","");
            votes=votes.toUpperCase();
            
            for(int i=0; i<votes.length(); i++){
                charHolder=votes.charAt(i);
                switch(charHolder){
                    case 'A':
                        holder[0]++;
                        break;
                    case 'B':
                        holder[1]++;
                        break;
                    case 'C':
                        holder[2]++;
                        break;
                }
            }
            winner(holder);
    }
    
}
