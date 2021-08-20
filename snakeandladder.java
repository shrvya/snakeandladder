package snakeandladder;


public class snakeandladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This is use case1
		int position=0,count=0;
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
        
        System.out.println("current postion is  "+position);
		}
		System.out.println("count of dice role is  "+count);
	}
	
	

}
