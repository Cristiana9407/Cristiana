package Lectia10;

import java.util.ArrayList;

public class MainPlayer {
    public static void main(String[] args) {
        ArrayList<Player>players=new ArrayList<>();
        players.add(new Player("Jucator x","stinga",2));
        players.add(new Player("fotbal","dreapta",3));
        String searchPosition="dreapta";
       for (Player player:players){
           if(player.position.equals(searchPosition)){
               System.out.println(player.name);
           }
       }
       Player minNumberPlayer=players.get(0);
       for (Player player:players){
           if (player.number<minNumberPlayer.number){
               minNumberPlayer=player;
           }
       }
        System.out.println("cel mai mic numar"+minNumberPlayer.number);
    }
}
