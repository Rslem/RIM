
import java.io.PrintStream;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.WindowConstants;




   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumne
 */
public class Game {
    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
    String playerName;
    int choice;
    public static void main(String[] args){
       Game game;
       game = new Game();
       game.PlayerSetup();   
       game.mysteriousTown();
       game.oldWoman();
       game.theTown();
       game.homeCountry();
       
}
    
    public void PlayerSetup(){
     System.out.println("Welcome traveller! Please enter your name:");
     playerName = myScanner.nextLine();
    
      
     System.out.println("Hello," + playerName + ". Let's begin your exciting adventure!");
     
     int PlayerHP;
        PlayerHP = 15;
        
        String PlayerWeapon;
        PlayerWeapon = "Nothing";
    
     System.out.println("Your current HP: " + PlayerHP);
     System.out.println("You are currently equipped with: " + PlayerWeapon);
     System.out.println("");
     System.out.println("Please press 'enter' to progress.");
     enterScanner.nextLine(); 
     
     
    }
    public void mysteriousTown(){
        System.out.println("");
        System.out.println(".....................................................");
        System.out.println("");
        System.out.println("You wake up in on an uncomfortable mat.");
        System.out.println("You don't know where you are and all you remember is that you came from a faraway land after you were offered work in a foreign country");
        System.out.println("You get up and look around you, you seem to be inside a small cottage.");
        System.out.println("Should you explore around ?");
        System.out.println("");
        System.out.println("1. You look around the cottage");
        System.out.println("2. You sit still and wait for someone to come");
        System.out.println("3. You leave the cottage");
        System.out.println("");
        System.out.println(".....................................................");
        System.out.println("");
        choice = myScanner.nextInt();
        
        
        if (choice==1){
            System.out.println("");
            System.out.println("The cottage looks old. Really old. Some surfaces are covered with layers of dust. \nYou see many books scattered around the room and some bottles filled with strangely covered liquid. \nThere are no clues to hint at who the owner of the place might be.");
            System.out.println("You pick up one of the books. It is about medicine");
            System.out.println("As you are start to read, you hear a noise coming from the outside. \nThe door of the cottage unlocks");
            System.out.println("An old woman enters the room.");
            enterScanner.nextLine();
            oldWoman();
        }
        if (choice==2){
            System.out.println("");
            System.out.println("You wait for a while. You try not to look around you too much to repect the owner's privacy.\nAfter what feels like a long wait, you hear a noise coming from the outside. \nThe door of the cottage unlocks");
            System.out.println("An old woman enters the room");
            oldWoman();
            
            
        }
        if (choice==3){
            System.out.println("You try to open the door to leave, but the door is locked with a key.");
            enterScanner.nextLine(); 
            System.out.println("As there is no window you could climb out of, you decide to just wait for the owner to come.");
            mysteriousTown();
        }
       
        
    }
    
    public void oldWoman(){
        System.out.println("The old woman sees you and gives you a look of utter joy.\nOld Woman: Hello, child! You are finally awake. How are you feeling?");
        enterScanner.nextLine();
        System.out.println("You nod at the woman and tell her that apart from a slight headache, you were alright.");
        enterScanner.nextLine();
        System.out.println("Old woman: Alright. I was so shocked when you just ate and passed alseep!\nYou just looked so pitiful and tired! Poor thing!\n What is your name? ");
        enterScanner.nextLine();
        System.out.println("You smile at her. She seems very sweet. You tell her your name and the reason you came to the country\nYou: I guess I passed out from exhaution. Thank you for the food and shelter. How can I repay you?");
        enterScanner.nextLine();
        System.out.println("Old woman: Oh, you don't need to, dear. But I heard something while I was out just now.\nThe old blacksmith has passed away. Oh, my heart feels so heavy.");
        enterScanner.nextLine();
        System.out.println("A blacksmith? You came here for a blacksmith apprenticeship! It can't be the same man, can it?");
        enterScanner.nextLine();
        System.out.println("You ask the old woman about the name of said blacksmith, and sure enough it was him");
        System.out.println("Now you are out of money and have nowhere to go.");
        enterScanner.nextLine();
        System.out.println("1. Vent to old woman\n2.Say goodbye to the old woman and leave.");
        choice = myScanner.nextInt();
        if (choice==1){
            System.out.println("You tell the old woman of your apprenticeship and vent your frustration");
            enterScanner.nextLine();
            System.out.println("She informs you of a way to get money");
            enterScanner.nextLine();
            System.out.println("Did you hear about our missing Prince?");
            enterScanner.nextLine();
            System.out.println("Of course you have never heard of such things. Although you could guess where this was going.");
            enterScanner.nextLine();
            System.out.println("Old woman: Our precious prince has been gone for a week! A whole week! No one knows where he went!\nWell, at least the general public hasn't a clue.");
            enterScanner.nextLine();
            System.out.println("");
            enterScanner.nextLine();
            System.out.println("The general public? Is this lady not a part of it?\nYou give her a questioning look");
            enterScanner.nextLine();
            System.out.println("");
            System.out.println("She gave you a mysterious smile.\nOld woman: I think I have a clue about what our prince has been up to.");
            enterScanner.nextLine();
            System.out.println("You wanna know more? About the prize set to whomever finds and returns him alive?");
            enterScanner.nextLine();
            System.out.println("1.You say yes. You want to help find the prince and get the prize.\n2.You are not interested you decide to leave the country");
            choice = myScanner.nextInt();
            if (choice==1){
                System.out.println("She leans in with a sparkle in her eyes and hands you a clear glass bottle, one that was sitting on a table");
                enterScanner.nextLine();
                System.out.println("Old woman: This here is very powerful. You take this, you feel imense power, you can almost do anything!");
                enterScanner.nextLine();
                System.out.println("Old woman: One problem is that it can only work once. I will give it to you, use it wisely.");
                enterScanner.nextLine();
                System.out.println("You store the potion in your brown bag.");
                enterScanner.nextLine();
                System.out.println("Old woman: Now, as for the prince, I reckon he was taken by Valvore and his people. He has been talking about our dear prince for ages. It has to be him. ");
                enterScanner.nextLine();
                System.out.println("As she talking she seemed to get angrier and angrier.\nOld woman: You have to save him. Not just for the prize. You wanted to repay me didn't you. Now I ask this of you");
                enterScanner.nextLine();
                System.out.println("You guessed the old woman must've personally known the prince.");
                enterScanner.nextLine();
                System.out.println("You: Well, alright. But who is Valvore and who are his people?");
                enterScanner.nextLine();
                System.out.println("Her eyes got dark.\nOld woman: Valvore is a fairy. He-");
                enterScanner.nextLine();
                System.out.println("You tried to supress your laugh. A fairy? Really? An evil FAIRY?");
                enterScanner.nextLine();
                System.out.println("The old woman gave you a look, but continued talking.");
                enterScanner.nextLine();
                System.out.println("Old woman: He didn't used to be much danger until he switched one day. He became obsessed with our young prince.\nBut almost no one knew.");
                enterScanner.nextLine();
                System.out.println("Then he started building a following. Now, you can say that he has a whole army.");
                enterScanner.nextLine();
                System.out.println("As she talked, her anger seemed to convert to sadness.");
                enterScanner.nextLine();
                System.out.println("Word on the street is he has a castle in the Forest of Sparce Thrones, it's to the north of the town.");
                enterScanner.nextLine();
                System.out.println("Again, you almost laughed. The name sounds rediculous.");
                enterScanner.nextLine();
                System.out.println("You: So I have to go to this castle and get the prince out? And I get the prize?");
                enterScanner.nextLine();
                System.out.println("Old Woman: Well, yes. But don't make it look so easy...");
                enterScanner.nextLine();
                System.out.println("You thanked the old Woman and left the cottage.");
                enterScanner.nextLine();
                theTown ();
                
                
                
                
                
                
            }
            if (choice==2){
                System.out.println("You tell her you are not interested.\nThe old woman gives you a sad look and gives you a small talk about how you are ignoring your fate.");
                homeCountry();
           
            }
            
        if (choice==2){
            theTown();
        }    
        }
        
        
        
        
        
        
        
        
    }
    public void theTown(){
        System.out.println("You leave the cottage and look around the outside. The town is full of people. There seems to be some sort of festival happening.");
        enterScanner.nextLine();
        System.out.println("You walking along the road distracted by all the people and run into a tree.");
        enterScanner.nextLine();
        System.out.println("You rub your forhead in pain and look at the tree in anger when you notice the poster hanged on the tree.");
        enterScanner.nextLine();
        System.out.println("It was a poster about the princes disappearance! You look at the prize amount and almost choke. That's a huge amount of gold! The king and queen must be so worried.");
        enterScanner.nextLine();
        System.out.println("You hear someone behind you and look back. \nIt is a tall girl. She looked about your age. By the way she looked, you guessed she must be considered beautiful by any standard.");
        enterScanner.nextLine();
        System.out.println("Girl: Are you a foreigner? I don't think I've ever seen you around.");
        enterScanner.nextLine();
        System.out.println("You nod. \nSilence. \nYou look back at the poster and the girl gasps.");
        enterScanner.nextLine();
        System.out.println("Girl: Are you possibly thinking of trying to save the prince?");
        enterScanner.nextLine();
        System.out.println("You nod once more and her eyes widen");
        enterScanner.nextLine();
        System.out.println("Girl: Me too! I think I know where he is. You look pretty strong, how about we team up and go together? My name is Anabel");
        enterScanner.nextLine();
        System.out.println("You're hesitant.");
        enterScanner.nextLine();
        System.out.println("You: Uhh, hi, Anabel. My name is " + playerName + ". Where is it that you think the prince is?");
        enterScanner.nextLine();
        System.out.println("The Forest of Sparce Thrones. In fact, I KNOW he's there. I can't tell you why yet, but if you agree to join me, I might change my mind.");
        enterScanner.nextLine();
        System.out.println("The fact that she seemed to have the same place as the old woman made you trust her a little more.");
        enterScanner.nextLine();
        System.out.println("You hold up your hand to Anabel and she shakes it. You both smile at each other. You're partners now.");
        enterScanner.nextLine();
    }
   

    public void homeCountry(){
        
    }
            
            
    
    
}
