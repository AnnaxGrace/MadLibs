public class MadLibs {
  /*
  This program generates a mad libbed story.
Author: Anna
Date: 09/21/2020
  */

  


  	public static void main(String[] args){
      
      //These will be dynamic based on front-end forms
        String name1 = "Anna";
        String name2 = "Will";
        String adjective1 = "pretty";
        String adjective2 = "ugly"; 
        String adjective3 = "bad";
        String noun1 = "people";
        String noun2 = "squirells";
        String noun3 = "robot";
        String noun4 = "alien";
        String noun5 = "baby";
        String noun6 = "shark baby";
        String verb1 = "danced";
        int number = 2;
        String place1 = "San Antonio";
      
      
        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }       
}