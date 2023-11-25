public class MMStory
{
  //instance variables
  private int numOfPointsTotal;
  private String color;

  //By default, initializes numOfPointsTotal to 0.
  public MMStory() {
    numOfPointsTotal = 0;
  }

//When points go to zero this message prints
  private void gameover() {
    System.out.println("You've run out of chances (no points left)! Your husband has decided that you are not fit to be seen with him. You're kicked out!\n");
    System.out.println("Run again to start over.\n\n");  
  }
  private void endStory(){
    System.out.println("Hopefully you had fun with this game! If you want to try again for a different ending. You can start over by clicking \"Run\" \n\n");
    wait(2000);
  }

//----------------------------------------------------------------------------
//Start of Story
    public void start() {
      System.out.println("Cue: \"Money, Money, Money\" by Abba");
      System.out.println("You're the trophy wife of a billionaire. The marriage was arranged, but you didn’t mind so long as you had access to his bank account (dw you also liked him a tad bit). It is your duty to maintain a good status and not embarrass your husband. Remember that actions have consequences so be careful what you do. You will earn points based on how good your decisions are. REMEMBER - the code is sensitive so please type correctly.");
      System.out.println("\nIt's the start of a new day!");
      System.out.println("\nWhat time would you like to wake up?:\n5:00 am \n6:30 am \n7:00 am \n10:00 am\n");

      // Question #1
      String input = UserInput.getValidInput("5:00 am","5:00", "6:30 am", "6:30", "7:00 am", "7:00", "10:00 am", "10:00");


      if(input.equals("5:00 am") || input.equals("5:00")) {
        numOfPointsTotal--;
        System.out.println("No! Just no! Your husband is furious that you didn’t get your beauty rest.\n");
        wait(5000);
        if(numOfPointsTotal < 0){
          gameover();
        }
      } else if(input.equals("6:30 am") || input.equals("6:30")){
        numOfPointsTotal++;
        System.out.println("Okay, but not great. You got enough rest, but your husband doesn’t like that you saw him in his Batman pajamas. (How embarrassing!)\n");
        wait(5000);
        set1b();
      } else if(input.equals("7:00 am") || input.equals("7:00")){
        numOfPointsTotal+=2;
        System.out.println("Perfect You're just in time for breakfast! Your husband made you chocolate chip pancakes with whipped cream.\n");

        wait(5000);
        set1c();
      } else if(input.equals("10:00 am") || input.equals("10:00")) {
          numOfPointsTotal--;
          System.out.println("Horrific! You missed breakfast and your husband had to dine without you! He went to his office and doesn't want to speak to you!\n");
          wait(5000);
        if(numOfPointsTotal < 0){
          gameover();
           }
        } 
}

//First Sets (set1b and set1c)------------------------------------------------
  private void set1b(){
    System.out.println("Breakfast was awkward, since you had to wait for him to make it. You still feel bad about the whole pajama situation, and you could tell how humiliated he felt. When he finishes cooking he serves you a waffle and some bacon since he didn't have time to prepare. What would you like to do next?\n");
    System.out.println("garden \nlibrary \nyoga\n");

    String input = UserInput.getValidInput("garden","Garden", "library", "Library", "yoga", "Yoga");

    //Question 1
    if(input.equals("garden") || input.equals("Garden")){
      System.out.println("Ew, you got dirty and your husband was displeased. This was not a job fit for your status.\n");
      numOfPointsTotal-- ;
      wait(5000);
      set2a();
      if(numOfPointsTotal < 0){
        gameover();
      } else {
        set2a();
      }
    }

    //Q2
    else if(input.equals("library") || input.equals("Library")) {
      System.out.println("So chic! You went to the 1800’s style library and read to expand your knowledge! You are relaxed, and in a good mindset. Your husband appreciates that you are smart and beautiful at the same time.\n");
      numOfPointsTotal+= 2;
      wait(5000);
      if(numOfPointsTotal < 0) {
        gameover();
      } else {
        set2b();
      }
    }

    //Q3
    else if(input.equals("yoga") || input.equals("Yoga")){
      System.out.println("You feel so relaxed, and are less stressed as a result. You did get sweaty so you’ll have to take a shower before your husband notices.\n");
      numOfPointsTotal++ ;
      wait(5000);
      if(numOfPointsTotal < 0) {
        gameover();
      } else {
        set2c();
      }
    }
    }

  private void set1c(){
    System.out.println("\nHe was happy to dine with you. You guys had a terrific time, and you even made him laugh! What an amazing breakfast! But now it’s time to figure out what you want to do for the day. What do you want to do?\n");

    System.out.println("garden \nlibrary \nyoga\n");

    String input = UserInput.getValidInput("garden","Garden", "library", "Library", "yoga", "Yoga");

    //Question 1
    if(input.equals("garden") || input.equals("Garden")) {
      System.out.println("Ew, you got dirty and your husband was displeased. This was not a job fit for your status.\n");
      numOfPointsTotal-- ;
      wait(5000);
      if(numOfPointsTotal < 0) {
        gameover();
      } else {
        set2a();
      }
    }

    //Q2
    else if(input.equals("library") || input.equals("Library")) {
      System.out.println("So chic! You went to the 1800’s style library and read to expand your knowledge! You are relaxed, and in a good mindset. Your husband appreciates that you are smart and beautiful at the same time.\n");
      numOfPointsTotal+= 2;
      wait(5000);
      if(numOfPointsTotal < 0) {
        gameover();
      } else {
        set2b();
      }
    }

    //Q3
    else if(input.equals("yoga") || input.equals("Yoga")) {
      System.out.println("You feel so relaxed, and are less stressed as a result. You did get sweaty so you’ll have to take a shower before your husband notices.\n");
      numOfPointsTotal++ ;
      wait(5000);
      if(numOfPointsTotal < 0) {
        gameover();
      } else {
        set2c();
      }
    }
  }

//Second sets(set2a and set2b and set2c)--------------------------------------
  private void set2a() {
    System.out.println("Your husband was very close to divorcing you because the dirt underneath your fingernails disgusted him.\n");
    System.out.println("He forgives you nonetheless and asks you if you want to watch a movie. What do you watch?\n");
    System.out.println("Your choices are: \n\nThe Lorax \nEmma\nHalloween\n");
    String input = UserInput.getValidInput("The Lorax", "the lorax", "emma", "Emma", "halloween", "Halloween");

  //lorax
    if(input.equals("The Lorax") || input.equals("the lorax")) {
      System.out.println("He judges your choice of movie but watches it through with you. He would’ve preferred \"My Girl\" or \"Emma\".\n");
      wait(5000);
      numOfPointsTotal++;
      set3a();
    }

    //emma
    else if(input.equals("Emma") || input.equals("emma")) {
      System.out.println("You decided to watch \"Emma\"! You also find out that you both love Jane Austen. At the end of the movie you both have the same opionion about Emma. She was annoying.\n");
      wait(5000);
      numOfPointsTotal+=2;
      set3b();
    } 

    //halloween
    else if(input.equals("Halloween") || input.equals("halloween")) {
      System.out.println("Your husband is skeptical about your movie choice but turns it on anyway. He thinks that the gore is too much for you and turns it off. Why would you even suggest that?\n");
      wait(5000);
      numOfPointsTotal-- ;
      if(numOfPointsTotal < 0){
        gameover();
      } else {
        set3c();
      }
    }
  }
  // set 2b -> if you chose to read
  private void set2b() {
    System.out.println("Your husband walks into the library to see you reading his favorite book \"Pride and Prejudice\"! You guys sit down to discuss it. You both find out that your husband's favorite character was Elizabeth Bennet because of how strong willed she was, and how she loves to read books and learn things for herself.  You also find out that he loved Lizzie and Mr. Darcy’s relationship because he felt moved by the chemistry that they had.\n");
    System.out.println("You guys decide to go and watch a movie together! What movie do you choose: \n\nThe Lorax\nEmma\nHalloween\n");
    String input = UserInput.getValidInput("The Lorax", "the lorax", "emma", "Emma", "halloween", "Halloween");

    //lorax
      if(input.equals("The Lorax") || input.equals("the lorax")) {
        System.out.println("He judges your choice of movie but watches it through with you. He would’ve preferred \"My Girl\" or \"Emma\".\n");
        wait(5000);
        set3a();
      }

      //emma
      else if(input.equals("Emma") || input.equals("emma")) {
        System.out.println("Because you both love Jane Austen you decided to watch \"Emma\"! You both found out that you had the same opinion on her. She was annoying.\n");
        wait(5000);
        set3b();
      } 

      //halloween
      else if(input.equals("Halloween") || input.equals("halloween")) {
        System.out.println("Your husband is skeptical about your movie choice but turns it on anyway. He thinks that the gore is too much for you and turns it off. Why would you even suggest that?\n");
        wait(5000);
        numOfPointsTotal-- ;
        if(numOfPointsTotal < 0){
          gameover();
        } else {
          set3c();
        }
      }
  }

  private void set2c(){
     System.out.println("You get out of the shower and your husband doesn’t notice  anything different about you. He asks you what movie you guys should watch together in his home cinema. What do you want to watch?: \n\nThe Lorax\nEmma\nHalloween\n");
    String input = UserInput.getValidInput("The Lorax", "the lorax", "emma", "Emma", "halloween", "Halloween");

    //lorax
      if(input.equals("The Lorax") || input.equals("the lorax")){
        System.out.println("He judges your choice of movie but watches it through with you. He would’ve preferred \"My Girl\" or \"Emma\".\n");
        wait(5000);
        set3a();
      }

      //emma
      else if(input.equals("Emma") || input.equals("emma")) {
        System.out.println("You decided to watch \"Emma\"! You also find out that you both love Jane Austen. At the end of the movie you both have the same opionion about Emma. She was annoying.\n");
        wait(5000);
        set3b();
      } 

      //halloween
      else if(input.equals("Halloween") || input.equals("halloween")) {
        System.out.println("Your husband is skeptical about your movie choice but turns it on anyway. He thinks that the gore is too much for you and turns it off. Why would you even suggest that?\n");
        wait(5000);
        numOfPointsTotal-- ;
        if(numOfPointsTotal < 0){
          gameover();
        } else {
          set3c();
        }
       }
  }

//Third sets (set3a and set3b and set3c)--------------------------------------
  private void set3a() {
    System.out.println("After \"Let it Grow\" ends, your husband turns the TV off. He wants to learn more about you and starts asking you questions. He learns more about your family and you as a person. You realize he may not be so bad. He asks your favorite color. What is it?:\n");
    System.out.println("Blue\nGreen\nPink\nYellow\nGray\nGold\n");
    String input = UserInput.getValidInput("Blue", "blue", "Green", "green", "Pink", "pink", "Yellow", "yellow", "Gray", "gray", "Gold", "gold");

    if(input.equals("Blue") || input.equals("blue")) {
      System.out.println("He nods and smiles. He also likes blue.\n");
      color = "blue";
      wait(5000);
      numOfPointsTotal++;
      set4();
    } else if(input.equals("Green") || input.equals("green")) {
      System.out.println("He nods and smiles. He says green is very dreamy.\n");
      color = "green";
      wait(5000);
      numOfPointsTotal++;
      set4();
    } else if(input.equals("Pink") || input.equals("pink")) {
      System.out.println("He nods and smiles. He says pink is very princess-like.\n");
      color = "pink";
      wait(5000);
      numOfPointsTotal++;
      set4();
    } else if(input.equals("yellow") || input.equals("Yellow")) {
      System.out.println("He nods and smiles. He says yellow is like the sun.\n");
      color = "yellow";
      wait(5000);
      numOfPointsTotal++;
      set4();
    } else if(input.equals("gray") || input.equals("Gray")) {
      System.out.println("He nods and smiles. He says gray reminds him of the rain. He loves the rain.\n");
      color = "gray";
      wait(5000);
      numOfPointsTotal+= 2;
      set4();
    } else if(input.equals("gold") || input.equals("Gold")) {
      System.out.println("That’s so obnoxious of you. Maybe think less arrogant next time.\n");
      color = "gold";
      wait(5000);
      numOfPointsTotal--;
     if(numOfPointsTotal < 0) {
      gameover();
    } else {
      set4();
    }
    }
  }

  private void set3b(){
    System.out.println("You both have so much in common! He decides to ask for your favorite color. What is it?:");
    System.out.println("Blue\nGreen\nPink\nYellow\nGray\nGold\n");
    String input = UserInput.getValidInput("Blue", "blue", "Green", "green", "Pink", "pink", "Yellow", "yellow", "Gray", "gray", "Gold", "gold");

    if(input.equals("Blue") || input.equals("blue")) {
      System.out.println("He nods and smiles. He also likes blue.\n");
      color = "blue";
      wait(5000);
      numOfPointsTotal++;
      set4();
    } else if(input.equals("Green") || input.equals("green")) {
      System.out.println("He nods and smiles. He says green is very dreamy.\n");
      color = "green";
      wait(5000);
      numOfPointsTotal++;
      set4();
    } else if(input.equals("Pink") || input.equals("pink")) {
      System.out.println("He nods and smiles. He says pink is very princess-like.\n");
      color = "pink";
      wait(5000);
      numOfPointsTotal++;
      set4();
    } else if(input.equals("yellow") || input.equals("Yellow")) {
      System.out.println("He nods and smiles. He says yellow is like the sun.\n");
      color = "yellow";
      wait(5000);
      numOfPointsTotal++;
      set4();
    } else if(input.equals("gray") || input.equals("Gray")) {
      System.out.println("He nods and smiles. He says gray reminds him of the rain. He loves the rain.\n");
      color = "gray";
      wait(5000);
      numOfPointsTotal+= 2;
      set4();
    } else if(input.equals("gold") || input.equals("Gold")) {
      System.out.println("That’s so obnoxious of you. Maybe think less arrogant next time.\n");
      color = "gold";
      wait(5000);
      numOfPointsTotal--;
     if(numOfPointsTotal < 0) {
      gameover();
    } else {
      set4();
    }
    }
  }

  private void set3c() {
    System.out.println("After your husband turns off the TV, he cleans up the popcorn and candy mess that you made. He asks your favorite color. What is it?:\n");
    System.out.println("Blue\nGreen\nPink\nYellow\nGray\nGold\n");
    String input = UserInput.getValidInput("Blue", "blue", "Green", "green", "Pink", "pink", "Yellow", "yellow", "Gray", "gray", "Gold", "gold");

    if(input.equals("Blue") || input.equals("blue")) {
      System.out.println("He nods and smiles. He also likes blue.\n");
      color = "blue";
      wait(5000);
      numOfPointsTotal+= 2;
      set4();
    } else if(input.equals("Green") || input.equals("green")) {
      System.out.println("He nods and smiles. He says green is very dreamy.\n");
      color = "green";
      wait(5000);
      numOfPointsTotal++;
      set4();
    } else if(input.equals("Pink") || input.equals("pink")) {
      System.out.println("He nods and smiles. He says pink is very princess-like.\n");
      color = "pink";
      wait(5000);
      numOfPointsTotal++;
      set4();
    } else if(input.equals("yellow") || input.equals("Yellow")) {
      System.out.println("He nods and smiles. He says yellow is like the sun.\n");
      color = "yellow";
      wait(5000);
      numOfPointsTotal++;
      set4();
    } else if(input.equals("gray") || input.equals("Gray")) {
      System.out.println("He nods and smiles. He says gray reminds him of the rain. He loves the rain.\n");
      color = "gray";
      wait(5000);
      numOfPointsTotal+= 2;
      set4();
    } else if(input.equals("gold") || input.equals("Gold")) {
      System.out.println("That’s so obnoxious of you. Maybe think less arrogant next time.\n");
      color = "gold";
      wait(5000);
      numOfPointsTotal--;
      if(numOfPointsTotal < 0) {
      gameover();
    } else {
      set4();
    }
    }
  }

//Fourth set-------------------------------------------------------------
//set 4 (same for all options)
  private void set4() {
    System.out.println("Your husband looks away towards the chandelier. Thinks for a second then looks back at you and asks \"If you had to pick a car what would you choose?\"\n");
    System.out.println("Tesla\nMotorW\nLucid Air\nRolls Royce\n");
    String input = UserInput.getValidInput("Tesla", "tesla", "MotorW", "motorw", "Lucid Air", "lucid air", "Rolls Royce", "rolls royce");

    if(input.equals("Tesla") || input.equals("tesla")) {
      System.out.println("Your husband likes that car.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set5a();
    } else if(input.equals("MotorW") || input.equals("motorw")){
      System.out.println("Translates to motor wagon. Doesn’t even exist anymore. Absolutely appalling. You’ll be lucky if you even get dinner tonight.\n");
      wait(5000);
      numOfPointsTotal--;
        if(numOfPointsTotal < 0) {
        gameover();
        }else{
          set5b();
        }
    } else if(input.equals("Lucid Air") || input.equals("lucid air")){
      System.out.println("Your husband likes that car. Good choice.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set5c();
    } else if(input.equals("Rolls Royce") || input.equals("rolls royce")){
      System.out.println("You’ve got expensive but good taste. If you do well today don’t be surprised to find this parked in your driveway.\n");
      wait(5000);
      numOfPointsTotal ++;
      set5d();
    }
  }

//Fifth sets (set5a and set5b and set5c and set5d)-----------------------
  // set 5a
  private void set5a() {
    System.out.println("Nice. He has met Elon, and finds it sweet that you like his car. Anyway, it’s time for lunch so your husband says \n\"Hey it's sunny outside, would you like to have a picnic, go out to a cafe, have our servants make something for us, or do you want to skip lunch.\"\n");

    System.out.println("Picnic\ncafe\nservants make something\nskip lunch\n");
    String input = UserInput.getValidInput("Have picnic", "have a picnic", "picnic", "Picnic", "Go to a cafe", "go to a cafe", "cafe", "Cafe", "servants make something", "Servants make something", "have our servants make something", "Have our servants make something", "skip lunch", "Skip lunch");

    if(input.equals("Have a picnic") || input.equals("have a picnic") || input.equals("picnic") || input.equals("Picnic")) {
      System.out.println("Amazing choice. You and your husband pack up some things and head out to his luxurious garden. You guys breathe in the fresh air, and bond while staring at the lake in front of you.\n");
          wait(5000);
          numOfPointsTotal += 2;
          set6a();
        } else if(input.equals("Cafe") || input.equals("cafe") || input.equals("Go to a cafe") || input.equals("go to a cafe")) {
          System.out.println("An ok choice. You and your  husband go out to the car and make your way to a very expensive cafe. It was a nice day. He was trying to hint at having a picnic with you.\n");
          wait(5000);
          numOfPointsTotal++;
          set6b();
        } else if(input.equals("servants make something") || input.equals("Servants make something") || input.equals("Have our servants make something") || input.equals("have our servants make something")) {
          System.out.println("This was a test to see what you were like. Just so you know, you failed. Your husband doesn’t say anything, but you shouldn't expect others to do stuff for you all the time. You guys go inside, and miss the amazing day out.\n");
          wait(5000);
          numOfPointsTotal--;
          if(numOfPointsTotal < 0) {
            gameover();
          } else {
            set6c();
        }
      } else if(input.equals("skip lunch") || input.equals("Skip lunch")){
         System.out.println("That was so embarrassing. How dare you skip something your husband offers. Especially if it affects your wellbeing. Your stomach growls all the way to dinner.\n");
      wait(5000);
          numOfPointsTotal--;
       if(numOfPointsTotal < 0) {
        gameover();
      } else {
        set6d();
      }
    }
  }


// set5b
  private void set5b() {
    System.out.println("After your disappointing taste in style and cars, your husband stands up and starts walking away. You follow after him as he asks you another question:\n \"The weather is nice today, do you think we should have a picnic for lunch, go to a cafe, have the servants make something, or skip lunch?\"\n");
    System.out.println("Picnic\ncafe\nservants make something\nskip lunch\n");
    String input = UserInput.getValidInput("Have picnic", "have a picnic", "picnic", "Picnic", "Go to a cafe", "go to a cafe", "cafe", "Cafe", "servants make something", "Servants make something", "have our servants make something", "Have our servants make something", "skip lunch", "Skip lunch");

if(input.equals("Have a picnic") || input.equals("have a picnic") || input.equals("picnic") || input.equals("Picnic")) {
  System.out.println("Amazing choice. You and your husband pack up some things and head out to his luxurious garden. You guys breathe in the fresh air, and bond while staring at the lake in front of you.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set6a();
    } else if(input.equals("Cafe") || input.equals("cafe") || input.equals("Go to a cafe") || input.equals("go to a cafe")) {
      System.out.println("An ok choice. You and your  husband go out to the car and make your way to a very expensive cafe. It was a nice day. He was trying to hint at having a picnic with you.\n");
      wait(5000);
      numOfPointsTotal++;
      set6b();
    } else if(input.equals("servants make something") || input.equals("Servants make something") || input.equals("Have our servants make something") || input.equals("have our servants make something")) {
      System.out.println("This was a test to see what you were like. Just so you know, you failed. Your husband doesn’t say anything, but you shouldn't expect others to do stuff for you all the time. You guys go inside, and miss the amazing day out.\n");
      wait(5000);
      numOfPointsTotal--;
      if(numOfPointsTotal < 0) {
        gameover();
      } else {
        set6c();
    }
  } else if(input.equals("skip lunch") || input.equals("Skip lunch")){
     System.out.println("That was so embarrassing. How dare you skip something your husband offers. Especially if it affects your wellbeing. Your stomach growls all the way to dinner.\n");
  wait(5000);
      numOfPointsTotal--;
   if(numOfPointsTotal < 0) {
    gameover();
  } else {
    set6d();
  }
}
}


  // set5c
  private void set5c(){
    System.out.println("Great! Your husband, admires your taste in cars. He wistfully looks out the window at the clear sky. He asks you what you would like for lunch.\nDo you want to have a picnic, go out to a cafe, have the servants make something, or just skip lunch?\n");
    System.out.println("Picnic\ncafe\nservants make something\nskip lunch\n");
    String input = UserInput.getValidInput("Have picnic", "have a picnic", "picnic", "Picnic", "Go to a cafe", "go to a cafe", "cafe", "Cafe", "servants make something", "Servants make something", "have our servants make something", "Have our servants make something", "skip lunch", "Skip lunch");

if(input.equals("Have a picnic") || input.equals("have a picnic") || input.equals("picnic") || input.equals("Picnic")) {
  System.out.println("Amazing choice. You and your husband pack up some things and head out to his luxurious garden. You guys breathe in the fresh air, and bond while staring at the lake in front of you.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set6a();
    } else if(input.equals("Cafe") || input.equals("cafe") || input.equals("Go to a cafe") || input.equals("go to a cafe")) {
      System.out.println("An ok choice. You and your  husband go out to the car and make your way to a very expensive cafe. It was a nice day. He was trying to hint at having a picnic with you.\n");
      wait(5000);
      numOfPointsTotal++;
      set6b();
    } else if(input.equals("servants make something") || input.equals("Servants make something") || input.equals("Have our servants make something") || input.equals("have our servants make something")) {
      System.out.println("This was a test to see what you were like. Just so you know, you failed. Your husband doesn’t say anything, but you shouldn't expect others to do stuff for you all the time. You guys go inside, and miss the amazing day out.\n");
      wait(5000);
      numOfPointsTotal--;
      if(numOfPointsTotal < 0) {
        gameover();
      } else {
        set6c();
    }
  } else if(input.equals("skip lunch") || input.equals("Skip lunch")){
     System.out.println("That was so embarrassing. How dare you skip something your husband offers. Especially if it affects your wellbeing. Your stomach growls all the way to dinner.\n");
  wait(5000);
      numOfPointsTotal--;
   if(numOfPointsTotal < 0) {
    gameover();
  } else {
    set6d();
  }
  }
}

// set 5d
  private void set5d(){
    System.out.println("Your husband believes that you could have chosen a much better choice. Although you have good taste, it's nothing compared to great. Your husband looks out the window and says, \"Nice weather today, isn’t it. Anyway, what would you like to do for lunch? Go outside to have a picnic, go out to a cafe, have our servants make something for us, or do you just want to skip? \"\n ");
    System.out.println("Picnic\ncafe\nservants make something\nskip lunch\n");
    String input = UserInput.getValidInput("Have picnic", "have a picnic", "picnic", "Picnic", "Go to a cafe", "go to a cafe", "cafe", "Cafe", "servants make something", "Servants make something", "have our servants make something", "Have our servants make something", "skip lunch", "Skip lunch");

    if(input.equals("Have a picnic") || input.equals("have a picnic") || input.equals("picnic") || input.equals("Picnic")) {
        System.out.println("Amazing choice. You and your husband pack up some things and head out to his luxurious garden. You guys breathe in the fresh air, and bond while staring at the lake in front of you.\n");
        wait(5000);
        numOfPointsTotal += 2;
        set6a();
      } else if(input.equals("Cafe") || input.equals("cafe") || input.equals("Go to a cafe") || input.equals("go to a cafe")) {
        System.out.println("An ok choice. You and your  husband go out to the car and make your way to a very expensive cafe. It was a nice day. He was trying to hint at having a picnic with you.\n");
        wait(5000);
        numOfPointsTotal++;
        set6b();
      } else if(input.equals("servants make something") || input.equals("Servants make something") || input.equals("Have our servants make something") || input.equals("have our servants make something")) {
        System.out.println("This was a test to see what you were like. Just so you know, you failed. Your husband doesn’t say anything, but you shouldn't expect others to do stuff for you all the time. You guys go inside, and miss the amazing day out.\n");
        wait(5000);
        numOfPointsTotal--;
        if(numOfPointsTotal < 0) {
          gameover();
        } else {
          set6c();
      }
    } else if(input.equals("skip lunch") || input.equals("Skip lunch")){
       System.out.println("That was so embarrassing. How dare you skip something your husband offers. Especially if it affects your wellbeing. Your stomach growls all the way to dinner.\n");
    wait(5000);
        numOfPointsTotal--;
     if(numOfPointsTotal < 0) {
      gameover();
    } else {
      set6d();
    }
    } 
}


//Sixth sets (set6a and set6b and set6c and set6d)-----------------------------------
//Set 6a
  private void set6a(){
    System.out.println("You guys have finished your lunch and now it's time to discuss your one month anniversary.\nSince your husband's life is under the eyes of the public, he has to do something for the occasion. He wants to fly you to an exquisite country.\nWhere would you like to go? Fiji, the Bahamas, or Aruba.\n");
    System.out.println("Fiji\nBahamas\nAruba\n");
    String input = UserInput.getValidInput("Fiji", "fiji", "Bahamas", "bahamas", "Aruba", "aruba");

    if(input.equals("Fiji") || input.equals("fiji")) {
      System.out.println("What a nice secluded island. Perfect for a private vacation, yet public enough so you guys can gain publicity.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set7a();
    } else if(input.equals("Bahamas") || input.equals("bahamas")) {
      System.out.println("This place is a little too popular. It's uncertain how people will you guys if they see you in such a public place. They’ll think that you're too cocky for wanting to be seen.\n");
          wait(5000);
          numOfPointsTotal--;
          if(numOfPointsTotal < 0) {
          gameover();
        }else {
          set7b();
        }

      } else if(input.equals("Aruba") || input.equals("aruba")) {
          System.out.println("An okay choice. It's nice but not as private as Fiji nonetheless its a pretty good vacation spot.\n");
          wait(5000);
          numOfPointsTotal++;
          set7c();
      }
  }

//Set 6b
  private void set6b(){
    System.out.println("Lunch is over now, and on the way home he asks you where you want to fly for your one month anniversary (which is today). In order to get more publicity for your husband's lavish life you’ve got to do something. Do you want to go to Fiji, the Bahamas, or Aruba?\n");
    System.out.println("Fiji\nBahamas\nAruba\n");
    String input = UserInput.getValidInput("Fiji", "fiji", "Bahamas", "bahamas", "Aruba", "aruba");

    if(input.equals("Fiji") || input.equals("fiji")) {
      System.out.println("What a nice secluded island. Perfect for a private vacation, yet public enough so you guys can gain publicity.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set7a();
    } else if(input.equals("Bahamas") || input.equals("bahamas")) {
      System.out.println("This place is a little too popular. It's uncertain how people will you guys if they see you in such a public place. They’ll think that you're too cocky for wanting to be seen.\n");
          wait(5000);
          numOfPointsTotal--;
          if(numOfPointsTotal < 0) {
          gameover();
        }else {
          set7b();
        }

      } else if(input.equals("Aruba") || input.equals("aruba")) {
          System.out.println("An okay choice. It's nice but not as private as Fiji nonetheless its a pretty good vacation spot.\n");
          wait(5000);
          numOfPointsTotal++;
          set7c();
      }    
  }

//set 6c
  private void set6c(){
    System.out.println("Your servants are cleaning up, and a question popped up into his mind. Since your one month anniversary is today you’ve got to do something to attract some publicity for your husband's life. He wants to take you on a vacation. Where do you wanna go? Fiji, the Bahamas, or Aruba?\n");
    System.out.println("Fiji\nBahamas\nAruba\n");
    String input = UserInput.getValidInput("Fiji", "fiji", "Bahamas", "bahamas", "Aruba", "aruba");

    if(input.equals("Fiji") || input.equals("fiji")) {
      System.out.println("What a nice secluded island. Perfect for a private vacation, yet public enough so you guys can gain publicity.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set7a();
    } else if(input.equals("Bahamas") || input.equals("bahamas")) {
      System.out.println("This place is a little too popular. It's uncertain how people will you guys if they see you in such a public place. They’ll think that you're too cocky for wanting to be seen.\n");
          wait(5000);
          numOfPointsTotal--;
          if(numOfPointsTotal < 0) {
          gameover();
        }else {
          set7b();
        }

      } else if(input.equals("Aruba") || input.equals("aruba")) {
          System.out.println("An okay choice. It's nice but not as private as Fiji nonetheless its a pretty good vacation spot.\n");
          wait(5000);
          numOfPointsTotal++;
          set7c();
      }

  }

//set6d:
  private void set6d(){
    System.out.println("Your stomach is embarrassingly grumbling. He can’t even look you in the eye! Still, he asks about your one month anniversary (which just so happens to be today!). In order to get some good publicity do you want to go to Fiji, Aruba, or the Bahamas? Please don’t choose a bad option again.\n");
    System.out.println("Fiji\nBahamas\nAruba\n");
    String input = UserInput.getValidInput("Fiji", "fiji", "Bahamas", "bahamas", "Aruba", "aruba");

    if(input.equals("Fiji") || input.equals("fiji")) {
      System.out.println("What a nice secluded island. Perfect for a private vacation, yet public enough so you guys can gain publicity.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set7a();
    } else if(input.equals("Bahamas") || input.equals("bahamas")) {
      System.out.println("This place is a little too popular. It's uncertain how people will you guys if they see you in such a public place. They’ll think that you're too cocky for wanting to be seen.\n");
          wait(5000);
          numOfPointsTotal--;
          if(numOfPointsTotal < 0) {
          gameover();
        }else {
          set7b();
        }

      } else if(input.equals("Aruba") || input.equals("aruba")) {
          System.out.println("An okay choice. It's nice but not as private as Fiji nonetheless its a pretty good vacation spot.\n");
          wait(5000);
          numOfPointsTotal++;
          set7c();
      }
  }



//Seventh sets (set7a and set7b and set7c)---------------------------------
//set 7a
  private void set7a(){
    System.out.println("On your way to the airport you find out that your husband's private jet has been impaired! Instead of postponing you have to take a public airline (THE HORROR!) because your husband nonchalantly informed the press that you would be going to Fiji. What airline should you fly? Delta, Spirit, Southwest American Airlines?\n");
    System.out.println("Delta\nSpirit\nSouthwest\nAmerican Airlines\n");
    String input = UserInput.getValidInput("Delta", "delta", "Spirit", "spirit", "Southwest", "southwest", "American Airlines", "american airlines");

    if(input.equals("Delta") || input.equals("delta")) {
      System.out.println("Honestly probably the best out of all of them. You are a Delta stan. You and your husband were happy together.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set8a();
    } else if(input.equals("Spirit") || input.equals("spirit")) {
      System.out.println("Do you want to die? As the plane lifts off, you look out the window and see the landing wheels fall off. You feel uneasy the entire flight over.\n");
        wait(5000);
        numOfPointsTotal--;
      if(numOfPointsTotal < 0) {
        gameover();
      }else {
        set8b();
      }
    } else if(input.equals("Southwest") || input.equals("southwest")) {
        System.out.println("You had to pick your own seats and got stuck to a musty, crusty old man while your husband got \"stuck\" next to an elegant young woman. They flirt the entire flight over.\n");
        wait(5000);
        numOfPointsTotal--;
      if(numOfPointsTotal < 0) {
        gameover();
      }else {
        set8c();
      }
    }  else if(input.equals("American Airlines") || input.equals("american airlines")) {
        System.out.println("Pretty good. Better than Spirit or Southwest. You get to sit next to your husband.\n");
        wait(5000);
        numOfPointsTotal++;
      set8d();
    }
  }

// set 7b
  private void set7b(){
    System.out.println("On your way to the airport you find out that your husband's private jet has been impaired! Instead of postponing you have to take a public airline (THE HORROR!) because your husband nonchalantly informed the press that you would be going to the Bahamas. What airline should you fly?\n");
    System.out.println("Delta\nSpirit\nSouthwest\nAmerican Airlines\n");
    String input = UserInput.getValidInput("Delta", "delta", "Spirit", "spirit", "Southwest", "southwest", "American Airlines", "american airlines");

    if(input.equals("Delta") || input.equals("delta")) {
      System.out.println("Honestly probably the best out of all of them. You are a Delta stan. You and your husband were happy together.");
      wait(5000);
      numOfPointsTotal += 2;
      set8a();
    } else if(input.equals("Spirit") || input.equals("spirit")) {
      System.out.println("Do you want to die? As the plane lifts off, you look out the window and see the landing wheels fall off. You feel uneasy the entire flight over.\n");
      wait(5000);
      numOfPointsTotal--;
      if(numOfPointsTotal < 0) {
        gameover();
      }else {
        set8b();
      }
    } else if(input.equals("Southwest") || input.equals("southwest")) {
      System.out.println("You had to pick your own seats and got stuck to a musty, crusty old man while your husband got \"stuck\" next to an elegant young woman. They flirt the entire flight over.\n");
      wait(5000);
      numOfPointsTotal--;
      if(numOfPointsTotal < 0) {
        gameover();
      }else {
        set8c();
      }
    }  else if(input.equals("American Airlines") || input.equals("american airlines")) {
      System.out.println("Pretty good. Better than Spirit or Southwest. You get to sit next to your husband.\n");
      wait(5000);
      numOfPointsTotal++;
      set8d();
    }
  }

  private void set7c(){
    System.out.println("On your way to the airport you find out that your husband's private jet has been impaired! Instead of postponing you have to take a public airline (THE HORROR!) because your husband nonchalantly informed the press that you would be going to Aruba. What airline should you fly?\n");
    System.out.println("Delta\nSpirit\nSouthwest\nAmerican Airlines\n");
    String input = UserInput.getValidInput("Delta", "delta", "Spirit", "spirit", "Southwest", "southwest", "American Airlines", "american airlines");

    if(input.equals("Delta") || input.equals("delta")) {
      System.out.println("Honestly probably the best out of all of them. You are a Delta stan. You and your husband were happy together.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set8a();
    } else if(input.equals("Spirit") || input.equals("spirit")) {
      System.out.println("Do you want to die? As the plane lifts off, you look out the window and see the landing wheels fall off. You feel uneasy the entire flight over.\n");
      wait(5000);
      numOfPointsTotal--;
      if(numOfPointsTotal < 0) {
        gameover();
      }else {
        set8b();
      }
    } else if(input.equals("Southwest") || input.equals("southwest")) {
      System.out.println("You had to pick your own seats and got stuck to a musty, crusty old man while your husband got \"stuck\" next to an elegant young woman. They flirt the entire flight over.\n");
      wait(5000);
      numOfPointsTotal--;
      if(numOfPointsTotal < 0) {
        gameover();
      }else {
        set8c();
      }
    }  else if(input.equals("American Airlines") || input.equals("american airlines")) {
      System.out.println("Pretty good. Better than Spirit or Southwest. You get to sit next to your husband.\n");
      wait(5000);
      numOfPointsTotal++;
      set8d();
    }
  }

  //Eighth sets (set8a and set8b and set8c)---------------------------------
  //set 8a
  private void set8a(){
    System.out.println("You get off your flight and it's dark. Your husband grabs your hand as you can see the paparazzi out of the corner of your eye. You're both hungry since you didn't eat any of the food on the plane. He gives you some dinner options. Do you want to eat at your vacation home, at a beachside restaurant, or a restaurant in town?\n");
    System.out.println("Vacation home\nBeachside restaurant\nRestaurant in town\n");
    String input = UserInput.getValidInput("Vacation home", "vacation home", "beachside restaurant", "Beachside Restaurant", "Restaurant in town", "restaurant in town");

    if(input.equals("vacation home") || input.equals("Vacation home")) {
      System.out.println("That’s a bit too mysterious. You don't gain any publicity, which means his plan was a failure.\n");
      wait(5000);
      numOfPointsTotal--;
      if(numOfPointsTotal < 0) {
        gameover();
      }else {
        set9a();
      }
    } else if(input.equals("beachside restaurant") || input.equals("Beachside restaurant")) {
      System.out.println("It was a good choice, it was sooo pretty when the moonlight reflected off the water. But, it was a bit too cold. You asked for his jacket and he gave it to you. The publicity you guys got was ok.\n");
      wait(5000);
      numOfPointsTotal++;
      set9b();
    } else if(input.equals("Restaurant in town") || input.equals("restaurant in town")) {
      System.out.println("Perfect. The restaurant was beautiful and the city was also extraordinary. He holds your hand as you walk down to the restaurant. The food was brilliant as well. The publicity is wonderful as the pictures came out amazing. People wish they could be you. His plan executed wonderfully.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set9c();
    } 
  }


//set 8b
  private void set8b(){
    System.out.println("You’re both traumatized. One of the engines stopped working and you thought that you were going to die. When you get off the plane you both look awful. What a horrible look! You guys rush to a taxi and try to forget about what just happened. Your husband says that you guys must pick a good restaurant to top the airplane fiasco. Where would you like to go?\n");
    System.out.println("Vacation home\nBeachside restaurant\nRestaurant in town\n");
    String input = UserInput.getValidInput("Vacation home", "vacation home", "beachside restaurant", "Beachside Restaurant", "Restaurant in town", "restaurant in town");

    if(input.equals("vacation home") || input.equals("Vacation home")) {
      System.out.println("That’s a bit too mysterious. You don't gain any publicity, which means his plan was a failure.\n");
      wait(5000);
      numOfPointsTotal--;
      if(numOfPointsTotal < 0) {
        gameover();
      }else {
        set9a();
      }
    } else if(input.equals("beachside restaurant") || input.equals("Beachside restaurant")) {
      System.out.println("It was a good choice, it was sooo pretty when the moonlight reflected off the water. But, it was a bit too cold. You asked for his jacket and he gave it to you. The publicity you guys got was ok.\n");
      wait(5000);
      numOfPointsTotal++;
      set9b();
    } else if(input.equals("Restaurant in town") || input.equals("restaurant in town")) {
      System.out.println("Perfect. The restaurant was beautiful and the city was also extraordinary. He holds your hand as you walk down to the restaurant. The food was brilliant as well. The publicity is wonderful as the pictures came out amazing. People wish they could be you. His plan executed wonderfully.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set9c();
    } 
  }

  // set 8c
  private void set8c(){
    System.out.println("You had this bad feeling in the pit of your stomach as the whole flight you felt as if you had been cast aside, while the other woman felt on top of the world. You feel as if he never felt that way towards you.\nWhen you got off the flight it was really awkward. Your husband got the number of the other woman and you guys got in a taxi. It's time for dinner so he asked you where you would like to dine. Do you want to dine at your vacation home, at a beachside restaurant, or a restaurant in town?\n");
    System.out.println("Vacation home\nBeachside restaurant\nRestaurant in town\n");
    String input = UserInput.getValidInput("Vacation home", "vacation home", "beachside restaurant", "Beachside Restaurant", "Restaurant in town", "restaurant in town");

    if(input.equals("vacation home") || input.equals("Vacation home")) {
      System.out.println("That’s a bit too mysterious. You don't gain any publicity, which means his plan was a failure.\n");
      wait(5000);
      numOfPointsTotal--;
      if(numOfPointsTotal < 0) {
        gameover();
      }else {
        set9a();
      }
    } else if(input.equals("beachside restaurant") || input.equals("Beachside restaurant")) {
      System.out.println("It was a good choice, it was sooo pretty when the moonlight reflected off the water. But, it was a bit too cold. You asked for his jacket and he gave it to you. The publicity you guys got was ok.\n");
      wait(5000);
      numOfPointsTotal++;
      set9b();
    } else if(input.equals("Restaurant in town") || input.equals("restaurant in town")) {
      System.out.println("Perfect. The restaurant was beautiful and the city was also extraordinary. He holds your hand as you walk down to the restaurant. The food was brilliant as well. The publicity is wonderful as the pictures came out amazing. People wish they could be you. His plan executed wonderfully.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set9c();
    }  
  }

  private void set8d(){
    System.out.println("The whole flight was kind of boring: you fell asleep, watched a movie, and ate the mediocre plane food. When the plane landed, you guys got off and your husband held your hand! The paparazzi was there when you got off, and let me tell you the pictures were nice. You guys got in the car and he asked you for the next order of business. Dinner. Do you want to dine at your vacation home, at the beachside restaurant, or a restaurant in town.\n");
    System.out.println("Vacation home\nBeachside restaurant\nRestaurant in town\n");
    String input = UserInput.getValidInput("Vacation home", "vacation home", "beachside restaurant", "Beachside Restaurant", "Restaurant in town", "restaurant in town");

    if(input.equals("vacation home") || input.equals("Vacation home")) {
      System.out.println("That’s a bit too mysterious. You don't gain any publicity, which means his plan was a failure.\n");
      wait(5000);
      numOfPointsTotal--;
      if(numOfPointsTotal < 0) {
        gameover();
      }else {
        set9a();
      }
    } else if(input.equals("beachside restaurant") || input.equals("Beachside restaurant")) {
      System.out.println("It was a good choice, it was sooo pretty when the moonlight reflected off the water. But, it was a bit too cold. You asked for his jacket and he gave it to you. The publicity you guys got was ok.\n");
      wait(5000);
      numOfPointsTotal++;
      set9b();
    } else if(input.equals("Restaurant in town") || input.equals("restaurant in town")) {
      System.out.println("Perfect. The restaurant was beautiful and the city was also extraordinary. He holds your hand as you walk down to the restaurant. The food was brilliant as well. The publicity is wonderful as the pictures came out amazing. People wish they could be you. His plan executed wonderfully.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set9c();
    } 
  }

  //Ninth sets (set9a and set9b and set9c)---------------------------------
  // set 9a
  private void set9a(){
    System.out.println("After a boring night in, you decide to participate in a nighttime activity. What would you like to do? Walk on the beach, watch a movie, go to a club, or go to sleep?\n");
    System.out.println("Walk on the beach\nWatch a movie\nGo to a club\nGo to sleep\n");
    String input = UserInput.getValidInput("walk on the beach", "Walk on a beach", "Watch a movie", "watch a movie", "go to a club", "Go to a club", "Go to sleep", "go to sleep");

    if(input.equals("walk on the beach") || input.equals("Walk on the beach")) {
      System.out.println("It was cold and guys had to retreat back to the vacation home early.\n");
      wait(5000);
      numOfPointsTotal++;
      set10();
    } else if(input.equals("Watch a movie") || input.equals("watch a movie")) {
      System.out.println("How cute! You guys are so much closer and this was the most perfect end to your day.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set10();
    } else if(input.equals("Go to a club") || input.equals("go to a club")) {
      System.out.println("You guys had such a fun time. Dancing around, and singing to music in the club. However, you are very tired and leave when the night is still young.\n");
      wait(5000);
      numOfPointsTotal++;
      set10();
    } else if(input.equals("Go to sleep") || input.equals("go to sleep")) {
      System.out.println("HOW BORING OF YOU. You are very uninteresting. You should have gone to the club or watched a movie.\n");
      wait(5000);
      numOfPointsTotal--;
      if(numOfPointsTotal < 0) {
        gameover();
      }else {
        set10();
      }
    }
  }

//set 9b
  private void set9b(){
    System.out.println("After the cool night dinner in the beach restaurant, you guys decide to do a nice nighttime activity. What do you want to do?\n");

    System.out.println("Walk on the beach\nWatch a movie\nGo to a club\nGo to sleep\n");
    String input = UserInput.getValidInput("walk on the beach", "Walk on a beach", "Watch a movie", "watch a movie", "go to a club", "Go to a club", "Go to sleep", "go to sleep");

    if(input.equals("walk on the beach") || input.equals("Walk on the beach")) {
      System.out.println("It was cold and guys had to retreat back to the vacation home early.\n");
      wait(5000);
      numOfPointsTotal++;
      set10();
    } else if(input.equals("Watch a movie") || input.equals("watch a movie")) {
      System.out.println("How cute! You guys are so much closer and this was the most perfect end to your day.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set10();
    } else if(input.equals("Go to a club") || input.equals("go to a club")) {
      System.out.println("You guys had such a fun time. Dancing around, and singing to music in the club. However, you are very tired and leave when the night is still young.\n");
      wait(5000);
      numOfPointsTotal++;
      set10();
    } else if(input.equals("Go to sleep") || input.equals("go to sleep")) {
      System.out.println("HOW BORING OF YOU. You are very uninteresting. You should have gone to the club or watched a movie.\n");
      wait(5000);
      numOfPointsTotal--;
      if(numOfPointsTotal < 0) {
        gameover();
      }else {
        set10();
      }
    }
  }

//set 9c
  private void set9c(){
    System.out.println("After an amazing dinner in the city it's time to end your day with a cool nighttime activity. What do you want to do?\n");
    System.out.println("Walk on the beach\nWatch a movie\nGo to a club\nGo to sleep\n");
    String input = UserInput.getValidInput("walk on the beach", "Walk on a beach", "Watch a movie", "watch a movie", "go to a club", "Go to a club", "Go to sleep", "go to sleep");
    if(input.equals("walk on the beach") || input.equals("Walk on the beach")) {
      System.out.println("It was cold and guys had to retreat back to the vacation home early.\n");
      wait(5000);
      numOfPointsTotal++;
      set10();
    } else if(input.equals("Watch a movie") || input.equals("watch a movie")) {
      System.out.println("How cute! You guys are so much closer and this was the most perfect end to your day.\n");
      wait(5000);
      numOfPointsTotal += 2;
      set10();
    } else if(input.equals("Go to a club") || input.equals("go to a club")) {
      System.out.println("You guys had such a fun time. Dancing around, and singing to music in the club.\n However, you are very tired and leave when the night is still young.\n");
      wait(5000);
      numOfPointsTotal++;
      set10();
    } else if(input.equals("Go to sleep") || input.equals("go to sleep")) {
      System.out.println("HOW BORING OF YOU. You are very uninteresting. You should have gone to the club or watched a movie.\n");
      wait(5000);
      numOfPointsTotal--;
      if(numOfPointsTotal < 0) {
        gameover();
      }else {
        set10();
      }
    }
  }


//Set 10-------------------------------------------------------------------
  private void set10(){ 
    System.out.println("Congratulations!!! You survived a whole day as a trophy wife! Now it's time to see what your future will be like based on the points you have earned:\n");
    wait(2000);
    if(numOfPointsTotal>=0 && numOfPointsTotal<5){
      ending1();
    } else if(numOfPointsTotal>=5 && numOfPointsTotal<10){
      ending2();
    } else if(numOfPointsTotal>=10 && numOfPointsTotal<15){
      ending3();
    } else if(numOfPointsTotal>=15 && numOfPointsTotal<=18){
      ending4();
    } else if(numOfPointsTotal>=19 && numOfPointsTotal<=20) {
      ending5();
    }
  }


//ENDINGS(FINALLY)---------------------------------------------------------
  //ending1
  private void ending1(){
  System.out.println("Failure: You failed! Your husband divorced you and ruined your entire reputation! The jerk! You are now a hobo living in a cave because of how embarrassing your life is. You’ll die alone in a puddle surrounded by your twenty-two cats. \n ");
    wait(2000);
    System.out.println("The end.\n");
    wait(5000);
    endStory();
  }

  //ending2
  private void ending2(){
  System.out.println("Adequate: You stay married, but your husband decides to not acknowledge you exist. You suspect that he likes someone else. You’ll die a sad lonely death because he divorced you after you turned 25 and decided to marry a twenty-two year old. Ok Leonardo DiCaprio. \n");
    wait(2000);
    System.out.println("The end.\n");
    wait(5000);
    endStory();
  }

  //ending3
  private void ending3(){
  System.out.println("Normal: Your husband was pleased with your choices. He has now gifted you a new Porsche in " + color + ". His love for you seems to be growing because he gives you his credit card and half his life savings. You’re set for life in that aspect! You still have a lot to learn. But for now you are safe. \n");
    wait(2000);
    System.out.println("The end.\n");
    wait(5000);
    endStory();
  }

  //ending4
  private void ending4(){
  System.out.println("Stunning: Your husband was extremely pleased with your doings. You both fell in love with one another! He asks you to marry him again with real feelings now! He proposes in ITALY!!! He also wrote you into his will so you’ll have access to his money after he dies. You’ll live a prosperous and wealthy life. Well chosen! \n");
    wait(2000);
    System.out.println("The end.\n");
    wait(5000);
    endStory();
  }
  private void ending5(){
    System.out.println("Excellent: You’re a mastermind, your plan executed perfectly. \n You did so well, your husband hosted a party for you. In order to fulfill your life long dream, you slip cyanide into his drink. Not minutes later he drops dead. \n The other guests all gasp. You get away with it, no one ever suspects it could have been you. \n You get all of his money, and live a lavish life with your doberman and irish wolfhound. What a baddie. \n");
    wait(2000);
    System.out.println("The end.\n");
    wait(5000);
    endStory();
  }

  /**
  * Will delay output for the number of milliseconds provided as an argument
  */
  private void wait(int milliseconds) {
    try {
      Thread.sleep(milliseconds);
    } catch(Exception e) {
      e.printStackTrace();
    } 
  }

}