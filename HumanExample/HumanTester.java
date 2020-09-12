
/* Author: Dr. Walker
   Version 2
   The Human Tester class contains all of the instance variables and methods for a human
  */
  
public class HumanTester
{

   public static void main(String [] args)
   {
      //Variable declarations
      String pronoun = "";
      double change = 0;
      
      //Friend objects
      Human friend1 = new Human("Charles", "Pollock", "male", "blonde", "brown", "5 feet 6 inches",  25, 230.50);
      Human friend2 = new Human("Ava", "Pasnon", "female", "black", "brown", "5 feet 4 inches", 23, 325.98);
      Human friend3 = new Human("Sam", "Jones", "male", "brown", "green", "6 feet 3 inches", 20, 125.32);
      
      
      //Friend ArrayList
      ArrayList<HumanSol> friends = new ArrayList<HumanSol>();
           friends.add(new HumanSol("Charles", "Pollock", "male", "blonde", "brown", "5 feet 6 inches",  25, 230.50));
           friends.add(new HumanSol("Ava", "Pasnon", "female", "black", "brown", "5 feet 4 inches", 23, 325.98));
           friends.add(new HumanSol("Sam", "Jones", "male", "brown", "green", "6 feet 3 inches", 20, 125.32));
           
           
           //updated output code
           
           for(HumanSol friend: friends)
           {
           
              if(friend.getGender().equalsIgnoreCase("male"))
              {
                 pronoun = "He";
              }
              else
              {
                 pronoun = "She";
              }
              
                    
              System.out.println("My friend is named: " + friend.getFullName() + ". " + pronoun +" is " + friend.getAge() 
                                + " years old with " + friend.getHair() + " hair and " + friend.getEye() + " eyes. " + pronoun
                                + " is " + friend.getHeight() + " tall."); 
           }
      
      //Print out friend information
      
      //Friend 1
      if(friend1.getGender().equalsIgnoreCase("male"))
      {
         pronoun = "He";
      }
      else
      {
         pronoun = "She";
      }
      
            
      System.out.println("My friend is named: " + friend1.getFullName() + ". " + pronoun +" is " + friend1.getAge() 
                        + " years old with " + friend1.getHair() + " hair and " + friend1.getEye() + " eyes. " + pronoun
                        + " is " + friend1.getHeight() + " tall."); 
                        
      //Friend 2
       if(friend2.getGender().equalsIgnoreCase("male"))
      {
         pronoun = "He";
      }
      else
      {
         pronoun = "She";
      }

      System.out.println("My friend is named: " + friend2.getFullName() + ". " + pronoun +" is " + friend2.getAge() 
                        + " years old with " + friend2.getHair() + " hair and " + friend2.getEye() + " eyes. " + pronoun
                        + " is " + friend2.getHeight() + " tall."); 
                        
     
      //Friend 3
       if(friend3.getGender().equalsIgnoreCase("male"))
      {
         pronoun = "He";
      }
      else
      {
         pronoun = "She";
      }

      System.out.println("My friend is named: " + friend3.getFullName() + ". " + pronoun +" is " + friend3.getAge() 
                        + " years old with " + friend3.getHair() + " hair and " + friend3.getEye() + " eyes. " + pronoun
                        + " is " + friend3.getHeight() + " tall."); 
                        
      System.out.println();

      //Updating ag
      if(friend1.getGender().equalsIgnoreCase("male"))
      {
         pronoun = "He";
      }
      else
      {
         pronoun = "She";
      }
      
      friend1.haveBirthday();
      
      System.out.println(friend1.getFirstName() + " just celebrated a birthday! " + pronoun + " is now " + friend1.getAge()
                         + " years old.");
      
      System.out.println();
      
      //Getting a raise
      if(friend2.getGender().equalsIgnoreCase("male"))      {
         pronoun = "He";
      }
      else
      {
         pronoun = "She";
      }
      
      change = 50.25;
      
      friend2.payChange(change);
      
      System.out.println(friend2.getFirstName() + " received a raise in pay! " + pronoun + " was making " 
                         + (friend2.getPay() - change) + " per week. "
                         + pronoun + " is now making "
                         + friend2.getPay() + " per week.");
      
      System.out.println();
      
      //Reduction in pay
      if(friend3.getGender().equalsIgnoreCase("male"))
      {
         pronoun = "He";
      }
      else
      {
         pronoun = "She";
      }
      
      change = -25.66;
      
      friend3.payChange(change);
      
      System.out.println(friend3.getFirstName() + " is working fewer hours per week. " + pronoun + " was making "
                         + (friend3.getPay() - change) + " per week. " + pronoun + " is now making "
                         + friend3.getPay() + " per week.");
                                    
   }

}