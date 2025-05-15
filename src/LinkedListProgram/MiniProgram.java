package LinkedListProgram;
import java.util.LinkedList;
import java.util.Scanner;

public class MiniProgram {
    public static void main(String[] args) throws ErrorSongException {
        Scanner sc = new Scanner(System.in);
        LinkedList <String> music = new LinkedList<>();

        music.add("Song 1 (now playing)");
        music.add("Song 2 (will be plated soon)");

        String current = music.get(0);
        String next = music.get(1);

        System.out.print("Do you wanna go to the next song? ");
        String PersonIn = sc.nextLine();

        if(PersonIn.equals("yes")){
            System.out.println(next);
        }
        else if (PersonIn.equals("no")){
            System.out.println(current);
        }
        else throw new ErrorSongException("Something is going wrong");
    }
}
