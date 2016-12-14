/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeladder;

/**
 *
 * @author prasu
 */
public class Game {
    static piece board[]=new piece[101];
    int snakeHead[]=new int[10];
    int snakeTail[]=new int[10];
    int ladderHead[]=new int[10];
    int ladderTail[]=new int[10];
    
    Game()
    {
            snake s1h=new snake('h',1);
            snake s1t=new snake('t',1);
            snake s2h=new snake('h',2);
            snake s2t=new snake('t',2);
            snake s3h=new snake('h',3);
            snake s3t=new snake('t',3);
            snake s4h=new snake('h',4);
            snake s4t=new snake('t',4);
            snake s5h=new snake('h',5);
            snake s5t=new snake('t',5);
           
            ladder l1h=new ladder('h',1);
            ladder l1t=new ladder('t',1);
            ladder l2h=new ladder('h',2);
            ladder l2t=new ladder('t',2);
            ladder l3h=new ladder('h',3);
            ladder l3t=new ladder('t',3);
            ladder l4h=new ladder('h',4);
            ladder l4t=new ladder('t',4);
            ladder l5h=new ladder('h',5);
            ladder l5t=new ladder('t',5);
           
           
             
        snakeHead[1]=39;
        snakeTail[1]=3;
        snakeHead[2]=35;
        snakeTail[2]=5;
        snakeHead[3]=27;
        snakeTail[3]=7;
        snakeHead[4]=50;
        snakeTail[4]=34;
        snakeHead[5]=59;
        snakeTail[5]=46;
        
       board[39]=s1h;       
       board[3]=s1t;        
       board[35]=s2h;
       board[5]=s2t;
       board[27]=s3h;
       board[7]=s3t;
       board[50]=s4h;
       board[34]=s4t;
       board[59]=s5h;
       board[46]=s5h;

                          
        ladderHead[1]=23;
        ladderTail[1]=2;
        ladderHead[2]=29;
        ladderTail[2]=7;
        ladderHead[3]=32;
        ladderTail[3]=30;
        ladderHead[4]=77;
        ladderTail[4]=28;
        ladderHead[5]=41;
        ladderTail[5]=22;
        
            board[23]=l1h;
            board[2]=l1t;
            board[29]=l2h;
            board[7]=l2t;
            board[32]=l3h;
            board[30]=l3t;
            board[77]=l4h;
            board[28]=l4t;
            board[41]=l5h;
            board[22]=l5t;
    }
    
    public piece getPiece(int x){
        return board[x];
 }
   
}