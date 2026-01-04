package org.example;

public class PlayerBoard {
    protected int player1;
    protected int player2;
    protected int player3;
    protected int player4;

    PlayerBoard(){
        this.player1 = 10;
        this.player2 = 10;
        this.player3 = 10;
        this.player4 = 10;
    }

    PlayerBoard(int p1Start, int p2Start, int p3Start, int p4Start){
        this.player1 = p1Start;
        this.player2 = p2Start;
        this.player3 = p3Start;
        this.player4 = p4Start;
    }

    public int getPlayer(int index){

        if(index ==1){
            return player1;
        } else if (index == 2){
            return player2;
        } else if (index == 3){
            return player3;
        } else {
            return player4;
        }
    }

    public void applyWinner(int index, int amount){
        switch (index){
            case 1:
                player1 += amount;
                if(player1 < 0){
                    player1 = 0;
                }
                break;
            case 2:
                player2 += amount;
                if(player2 < 0){
                    player2 = 0;
                }
                break;
            case 3:
                player3 += amount;
                if(player3 < 0){
                    player3 = 0;
                }
                break;
            case 4:
                player4 += amount;
                if(player4 < 0){
                    player4 = 0;
                }
                break;

        }
    }
}
