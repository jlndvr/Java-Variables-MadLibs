public class MadLibs {
  /*
This program generates a mad libbed story.
Author: Laura
Date: 2/19/2049
  */
  	public static void main(String[] args){
      String name1 = "Knave";
      String adjective1 = "Big";
      String adjective2 = "Round";
      String adjective3 = "Sharp";

      String verb1 = "tire";

      String noun1 = "rock";
      String noun2 = "dirt";
      String noun3 = "chair";
      String noun4 = "desk";
      String noun5 = "can";
      String noun6 = "book";

      String name2 = "Knight";

      int number = 8;

      String place1 = "The Bridge";

      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
