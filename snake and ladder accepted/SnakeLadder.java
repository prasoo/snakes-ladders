/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeladder;
import java.util.*;
import java.lang.*;
/**
 *
 * @author prasu
 */
public class SnakeLadder {
    static Game g=new Game();
    /**
     * @param args the command line arguments
     */
    static int currentPosition[]=new int[10];
    static int dice;
    
    public static void printIfPlayer(int boardPosition,int players){
        for(int u=1;u<=players;u++){
            if(currentPosition[u]==boardPosition)
                System.out.print("p"+u+"--");
        }
    }
    
    public static void upgrade(int player){
        
        if(g.getPiece(currentPosition[player]).type=='s' && g.getPiece(currentPosition[player]).refer=='h'){
            currentPosition[player]=g.snakeTail[g.getPiece(currentPosition[player]).number];
        }
        
        if(g.getPiece(currentPosition[player]).type=='l' && g.getPiece(currentPosition[player]).refer=='t'){
            currentPosition[player]=g.ladderHead[g.getPiece(currentPosition[player]).number];
        }
    }
    public static boolean checkIfEnd(int n){
        for(int i=0;i<n;i++){
            if(currentPosition[i]==100)
                return true; 
        }
        return false;
    }
    
   // public static boolean checkForChance(int c){
      //  return dice==6||g.getPiece(currentPosition[c]).type=='l';
    //}
    
    public static void rollDice(){
       dice=(int)(Math.random()*6+1);  
    }
    
    public static void updatePosition(int player,int move){
        
        currentPosition[player]+=move;
        if(currentPosition[player]>100){
            System.out.println("Sorry! your move had exceeded the board.Try it next time");
        }
        
    }
    
    public static boolean checkForSnakeLadder(int pos){
        if(g.getPiece(pos)!=null){
            if(g.getPiece(pos).type=='s'&&g.getPiece(pos).refer=='h')
                return true;
            else if(g.getPiece(pos).refer=='t'&&g.getPiece(pos).type=='l')
                return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner scan=new Scanner(System.in);
        int i,j,k,r,t;
        System.out.println("enter the number of players:");
        int np=scan.nextInt();
        
        for(int d=1;d<np;d++){
            currentPosition[d]=0;
        }
        
        while(checkIfEnd(np)!=true){          
            for(i=1;i<=np;i++){
                 System.out.println("It's the chance of player"+i);
                   System.out.println("press '1' to roll the dice");
                   int check=scan.nextInt();
                   if(check==1)
                     rollDice();
                   System.out.println("number on the top face of dice is "+dice);
                     if(checkForSnakeLadder(currentPosition[i])!=true)
                         updatePosition(i,dice);
                     else
                         upgrade(i);
                     
                     k=101;
                     for(t=1;t<=10;t++){
                                                
                         if(t%2!=0){
                             for(r=1;r<=10;r++){
                                System.out.print(k-r+"--");
                                j=k-r;
                              
                        if(g.getPiece(j)!=null){
                            if(g.getPiece(j).type=='s' && g.getPiece(j).refer=='h')
                                System.out.print("SH--");
                            else if(g.getPiece(j).type=='s' && g.getPiece(j).refer=='t')                            
                                     System.out.print("ST--");
                            else if(g.getPiece(j).type=='l' && g.getPiece(j).refer=='h')
                                System.out.print("LH--");
                            else if(g.getPiece(j).type=='l' && g.getPiece(j).refer=='t')
                                System.out.print("LT--");
                        }
                        if(g.getPiece(j)==null){
                            System.out.print("----");
                        }
                        printIfPlayer(j,np);
                      }
                          System.out.println();                       
                   }           
                     if(t%2==0){
                         for(r=10;r>0;r--){
                            System.out.print(k-r+"--");
                                j=k-r;
                               
                        if(g.getPiece(j)!=null){
                            if(g.getPiece(j).type=='s' && g.getPiece(j).refer=='h')
                                System.out.print("SH--");
                            else if(g.getPiece(j).type=='s' && g.getPiece(j).refer=='t')
                                System.out.print("ST--");
                            else if(g.getPiece(j).type=='l' && g.getPiece(j).refer=='h')
                                System.out.print("LH--");
                            else if(g.getPiece(j).type=='l' && g.getPiece(j).refer=='t')
                                System.out.print("LT--");
                             }
                        else{
                            System.out.print("----");
                        }
                           
                          printIfPlayer(j,np);
                           }
                         System.out.println();
                         }
                     k=k-10;
                     }  
                                                                                      
               // }  while(checkForChance(i)==true);
                  
            }               
        }
    }   
}
