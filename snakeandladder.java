package snakeandladder;


public class snakeandladder {
     
	
	public static int play(int position) {
	
		// TODO Auto-generated method stub
		//This is use case1
		
		int count=0;
		System.out.println("Welcome to snake and Ladder!!!");
		while(position!=100) {
		//usecase2
       
			int dicevalue=(int)( Math.random() * (6)) + 1; 
        count++;
        System.out.println("dice value is "+dicevalue);
       
        //usecas3
        int option=(int)( Math.random() * (3)) + 1; 
        if(option==1)
        {
        	System.out.println("No Play!!");
        }
        else if(option==2)
        {
        	
        	position+=dicevalue;
        	System.out.println("Ladder!!");
        	
    		   
        }
        else {
        	position-=dicevalue;
        	if(position<0)
        	{
        		position=0;
        	}
        	System.out.println("snake!!");
        }
        //usecase5
        if(position>100)
        {
        	position-=dicevalue;
        	System.out.println("stays in same position "+position);
        }
        
        
		}
		System.out.println("count of dice role is  "+count);
		return position;
	}
     public static void main(String[] args) {
    	 int player1=0,player2=0;
    	 while(player1!=100 && player2!=100)
    	 {
    		 System.out.println("player1 is playinggggggggggg ");
    		 player1=play(player1);
    		 System.out.println("current postion of player1 is  "+player1);
    		 System.out.println("player2 is playingyyyyyyyyyyy ");
    		 player2=play(player2);
    		 System.out.println("current postion of player2 is  "+player2);
    	 }
    	 if(player1==100)
    	 {
    		 System.out.println("player 1 is the winner");
    	 }
    	 else {
    		 System.out.println("player 2 is the winner");	 
    	 }
    	 
    	 
    	 
     }
	

}
