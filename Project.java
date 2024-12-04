package Comp1111;


import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String space1 = "[   ]";
        String space2 = "[   ]";
        String space3 = "[   ]";
        String space4 = "[   ]";
        String space5 = "[   ]";
        String space6 = "[   ]";
        String space7 = "[   ]";
        String space8 = "[   ]";
        String space9 = "[   ]";
        String space10 = "[   ]";
        String space11 = "[   ]";
        String space12 = "[   ]";
        String space13 = "[   ]";
        int counter = 0;
        int counterperson1 = 0;
        int counterperson2 = 0;
        int counterperson3 = 0;
        int counterperson4 = 0;
        int counterperson5 = 0;
        int s1 = -1;
        while (s1 != 1) {
            System.out.println("Select the application you want to enter");
            System.out.println("1- Clock and Time" + "\n" + "2- Stopwatch" + "\n"
                    + "3- Contact Management and Functions" + "\n" + "4- Game" + "\n" + "5- Close the watch");
            String selection = scan.next();

            switch (selection) {
                case "1":
                case "1-":
                case "1- Clock and Time":
                    long elapsedtime = System.currentTimeMillis();
                    long second = (((elapsedtime / 1000) - 1699387620) % 60);
                    //The number of seconds here is the second value I got from the current time millis while writing the code.
                    long minute = (((elapsedtime / 60000) - 28320960) % 60);
                    //The number of minutes here is the minute value I got from the current time millis while writing the code.
                    long hour = (((elapsedtime / 3600000) - 472005) % 24);
                    //The number of hours here is the hour value I got from the current time millis while writing the code.
                    if (hour < 10) {
                        System.out.print("0" + hour + ":");
                    } else {
                        System.out.print(hour + ":");
                    }
                    if (minute < 10) {
                        System.out.print("0" + minute + ":");
                    } else {
                        System.out.print(minute + ":");
                    }

                    if (second < 10) {
                        System.out.print("0" + second + " ");
                    } else {
                        System.out.print(second);
                    }
                    System.out.println("  ");
                    break;

                case "2":
                case "2-":
                case "2- Stopwatch":

                    long start = (System.currentTimeMillis() / 1000);
                    System.out.println("[1]Start  [2]Back to menu");
                    int answerstartorback = scan.nextInt();

                    switch (answerstartorback) {
                        case 1:
                            System.out.println("[1]Stop  [2]Back to menu");
                            int answerstoporback = scan.nextInt();
                            switch (answerstoporback) {
                                case 1:
                                    long stop = (System.currentTimeMillis() / 1000);
                                    long stopwatch = (stop - start);

                                    if (stopwatch > 59) {
                                        long stopwatch2 = (stopwatch - 60);
                                        long minutes = (int) (stopwatch / 60);
                                        if (stopwatch2 < 10) {
                                            System.out.println("0" + minutes + ":" + "0" + stopwatch2);
                                        } else{
                                            System.out.println("0" + minutes + ":" + stopwatch2);
                                        }
                                    } else if (stopwatch < 10) {
                                        System.out.println("00" + ":" + "0" + stopwatch);
                                    } else {
                                        System.out.println("00" + ":" + stopwatch);
                                    }

                                    switch (answerstoporback) {
                                        case 1:
                                            System.out.println("[1]Reset  [2]Back to menu");
                                            int answerresetorback = scan.nextInt();

                                            switch (answerresetorback) {
                                                case 1:
                                                    long newstart = (System.currentTimeMillis() / 1000);
                                                    //I get a new current time millis here to get the difference with the previous one
                                                    System.out.println("[1]Start  [2]Back to menu");
                                                    int newanswerstartorback = scan.nextInt();

                                                    switch (newanswerstartorback) {
                                                        case 1:
                                                            System.out.println("[1]Stop  [2]Back to menu");
                                                            int newanswerstoporback = scan.nextInt();
                                                            switch (newanswerstoporback) {
                                                                case 1:
                                                                    long newstop = (System.currentTimeMillis() / 1000);
                                                                    long newstopwatch = (newstop - newstart);

                                                                    if (newstopwatch > 59) {
                                                                        long newstopwatch2 = (newstopwatch - 60);
                                                                        long minutes = (int) (newstopwatch / 60);
                                                                        if (newstopwatch2 < 10) {
                                                                            System.out.println("0" + minutes + ":" + "0" + newstopwatch2);
                                                                        } else {
                                                                            System.out.println("0" + minutes + ":" + newstopwatch2);
                                                                        }

                                                                    } else if (newstopwatch < 10) {
                                                                        System.out.println("00" + ":" + "0" + newstopwatch);
                                                                    } else {
                                                                        System.out.println("00" + ":" + newstopwatch);
                                                                    }
                                                            }//end of switch(newanswerstoporback)
                                                            break;

                                                        case 2:
                                                            break;
                                                    }//end of switch(newanswerstartorback)
                                                    break;
                                            }//end of switch(answerresetorback)
                                            break;
                                    }//end of switch(answer1)
                                default:
                                    System.out.println("Enter the invalid value");

                                    break;

                                case 2:
                                    break;
                            }//end of switch(answerstoporback)
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Enter the invalid value");
                    }//end of switch(answerstartorback)
                    break;

                case "3":
                case "3-":
                case "3- Contact Management and Functions":
                    System.out.println("Your contact management");
                    System.out.println("There can be a maximum of 5 people in the guide");
                    System.out.println("1- Mom: 0534 392 5653");
                    System.out.println("2- Sister: 0534 484 8334");
                    System.out.println("3- Father: 0537 401 8569");
                    System.out.println("4- " + space1 + ": " + space2);
                    System.out.println("5- " + space3 + ": " + space4);
                    System.out.println("[1]Call someone" + "\n" + "[2]Send a message" + "\n" + "[3]Add contacts"
                            + "\n" + "[4]Delete contacts" + "\n" + "[5]Edit" + "\n" + "[6]Back to menu?");
                    int optionfunctions1 = scan.nextInt();
                    switch (optionfunctions1) {
                        case 1:
                            System.out.println("[1]Call  [2]Call log  [3]Back to menu");
                            int optionfunctions2 = scan.nextInt();
                            switch (optionfunctions2) {
                                case 1:
                                    System.out.println("Your contact management");
                                    System.out.println("1- Mom: 0534 392 5653");
                                    System.out.println("2- Sister: 0534 484 8334");
                                    System.out.println("3- Father: 0537 401 8569");
                                    System.out.println("4- " + space1 + ": " + space2);
                                    System.out.println("5- " + space3 + ": " + space4);
                                    System.out.println("Who do you want to call?");
                                    String optionfunctions3 = scan.next();
                                    switch (optionfunctions3) {
                                        case "Mom":
                                        case "mom":
                                        case "1":
                                        case "1-":
                                            System.out.println("Enter the name of the person to call to confirm");
                                            space9 = scan.next();
                                            switch (space9) {
                                                case "mom":
                                                case "Mom":
                                                    System.out.println("Calling mom");
                                                    counterperson1++;
                                                    break;
                                                default:
                                                    System.out.println("The search was not made because you "
                                                            + "entered the person's name incorrectly");
                                                    break;

                                            }//end of switch(space9)
                                            break;
                                        case "Sister":
                                        case "sister":
                                        case "2":
                                        case "2-":
                                            System.out.println("Enter the name of the person to call to confirm");
                                            space8 = scan.next();
                                            switch (space8) {
                                                case "sister":
                                                case "Sister":
                                                    System.out.println("Calling sister");
                                                    counterperson2++;
                                                    break;
                                                default:
                                                    System.out.println("The call was not made because you "
                                                            + "entered the person's name incorrectly");
                                                    break;
                                            }//end of switch(space8)
                                            break;
                                        case "Father":
                                        case "father":
                                        case "3":
                                        case "3-":
                                            System.out.println("Enter the name of the person to call to confirm");
                                            space7 = scan.next();
                                            switch (space7) {
                                                case "father":
                                                case "Father":
                                                    System.out.println("Calling father");
                                                    counterperson3++;
                                                    break;
                                                default:
                                                    System.out.println("The call was not made because you "
                                                            + "entered the person's name incorrectly");
                                                    break;
                                            }//end of switch(space7)
                                            break;
                                        case "4":
                                        case "4-":
                                            System.out.println("Enter the name of the person to call to confirm");
                                            space6 = scan.next();
                                            System.out.println("Calling " + space1);
                                            counterperson4++;
                                            break;

                                        case "5":
                                        case "5-":
                                            System.out.println("Enter the name of the person to call to confirm");
                                            space5 = scan.next();
                                            System.out.println("Calling " + space3);
                                            counterperson5++;
                                            break;
                                    }//end of switch(optionfunctions3)
                                    break;
                                case 2:
                                    System.out.println(space9 + " " + "called " + counterperson1 + " times"
                                            + "\n" + space8 + " " + "called " + counterperson2 + " times" + "\n"
                                            + space7 + " " + "called " + counterperson3 + " times" + "\n" + space6 + " "
                                            + "called " + counterperson4 + " times" + "\n" + space5 + " " + "called " + counterperson5 + " times");

                                    System.out.println("Showing the last 5 people called ");
                                    break;
                                case 3:
                                    break;
                            }//end of switch(optionfunctions2)
                            break;

                        case 2:
                            System.out.println("1- Mom: 0534 392 5653");
                            System.out.println("2- Sister: 0534 484 8334");
                            System.out.println("3- Father: 0537 401 8569");
                            System.out.println("4- " + space1 + ": " + space2);
                            System.out.println("5- " + space3 + ": " + space4);
                            System.out.println("Who do you want to send a message");
                            System.out.println("[1][2][3][4][5]  [6]Back to menu");
                            int personselection2 = scan.nextInt();
                            scan.nextLine();
                            //I used nextline to get the whole message
                            switch (personselection2) {
                                case 1:
                                    System.out.println("What do you want to write please write");
                                    String message1 = scan.nextLine();
                                    System.out.println(message1 + " message sent to mom");
                                    break;
                                case 2:
                                    System.out.println("What do you want to write please write");
                                    String message2 = scan.nextLine();
                                    System.out.println(message2 + " message sent to sister");
                                    break;
                                case 3:
                                    System.out.println("What do you want to write please write");
                                    String message3 = scan.nextLine();
                                    System.out.println(message3 + " message sent to father");
                                    break;
                                case 4:
                                    System.out.println("What do you want to write please write");
                                    String message4 = scan.nextLine();
                                    System.out.println(message4 + " message sent to " + space1);
                                    break;
                                case 5:
                                    System.out.println("What do you want to write please write");
                                    String message5 = scan.nextLine();
                                    System.out.println(message5 + " message sent to " + space3);
                                    break;
                                case 6:
                                    break;
                            }//end of switch(personselection2)
                            break;
                        case 3:
                            System.out.println("Contact guide can have a maximum of 5 people");
                            System.out.println("Your contact management");
                            System.out.println("1- Mom: 0534 392 5653");
                            System.out.println("2- Sister: 0534 484 8334");
                            System.out.println("3- Father: 0537 401 8569");
                            System.out.println("4- " + space1 + ": " + space2);
                            System.out.println("5- " + space3 + ": " + space4);
                            System.out.println("[1]Add person  [2]Back to menu");
                            int answeraddperson1 = scan.nextInt();
                            switch (answeraddperson1) {
                                case 1:
                                    System.out.println("The name of the person you will add?");
                                    space1 = scan.next();
                                    System.out.println("What is the phone number please write");
                                    space2 = scan.next();
                                    System.out.println("Contact successfully added to contacts");
                                    System.out.println("[1]Add another person   [2]Back to menu");
                                    int answeraddperson2 = scan.nextInt();
                                    switch (answeraddperson2) {
                                        case 1:
                                            System.out.println("The name of the person you will add?");
                                            space3 = scan.next();
                                            System.out.println("What is the phone number please write");
                                            space4 = scan.next();
                                            System.out.println("Contact successfully added to contacts");
                                            System.out.println("[1]Add another person   [2]Back to menu");
                                            int answeraddperson3 = scan.nextInt();
                                            switch (answeraddperson3) {
                                                case 1:
                                                    System.out.println("You have reached the maximum number of people");
                                                    break;
                                            }//end of switch(answeraddperson3)
                                            break;

                                    }//end of switch(answeraddperson2)
                                case 2:
                                    break;
                            }//end of switch(answeraddperson1)
                            break;

                        case 4:
                            System.out.println("Your contact management");
                            System.out.println("1- Mom: 0534 392 5653");
                            System.out.println("2- Sister: 0534 484 8334");
                            System.out.println("3- Father: 0537 401 8569");
                            System.out.println("4- " + space1 + ": " + space2);
                            System.out.println("5- " + space3 + ": " + space4);
                            System.out.println("Please select the number you want to delete");
                            System.out.println("[1][2][3][4][5]  [6]Back to menu");
                            int answerdelete = scan.nextInt();
                            switch (answerdelete) {
                                case 1:
                                case 2:
                                case 3:
                                    System.out.println("Parents cannot be deleted "
                                            + "without family permission");
                                    break;

                                case 4:
                                    System.out.println("Your new contact management");
                                    System.out.println("1- Mom: 0534 392 5653");
                                    System.out.println("2- Sister: 0534 484 8334");
                                    System.out.println("3- Father: 0537 401 8569");
                                    System.out.println("4- " + space11 + ": " + space12);
                                    System.out.println("5- " + space3 + ": " + space4);
                                    System.out.println("Deletion was successful");
                                    space1 = "[  ]";
                                    space2 = "[  ]";
                                    break;
                                case 5:
                                    System.out.println("Your new contact management");
                                    System.out.println("1- Mom: 0534 392 5653");
                                    System.out.println("2- Sister: 0534 484 8334");
                                    System.out.println("3- Father: 0537 401 8569");
                                    System.out.println("4- " + space1 + ": " + space2);
                                    System.out.println("5- " + space13 + ": " + space10);
                                    System.out.println("Deletion was successful");
                                    space3 = "[  ]";
                                    space4 = "[  ]";
                                    break;
                                case 6:
                                    break;
                            }//end of switch(answerdelete)

                            break;

                        case 5:
                            System.out.println("Your contact management");
                            System.out.println("1- Mom: 0534 392 5653");
                            System.out.println("2- Sister: 0534 484 8334");
                            System.out.println("3- Father: 0537 401 8569");
                            System.out.println("4- " + space1 + ": " + space2);
                            System.out.println("5- " + space3 + ": " + space4);
                            System.out.println("Choose which number you want to edit");
                            System.out.println("[1][2][3][4][5]  [6]Back to menu");
                            int answeredit = scan.nextInt();
                            switch (answeredit) {
                                case 1:
                                case 2:
                                case 3:
                                    System.out.println("Parents cannot be deleted "
                                            + "without family permission");
                                    break;
                                case 4:
                                    System.out.println("Enter new name");
                                    space1 = scan.next();
                                    System.out.println("Enter new number");
                                    space2 = scan.next();
                                    System.out.println("Editing successful");
                                    break;
                                case 5:
                                    System.out.println("Enter new name");
                                    space3 = scan.next();
                                    System.out.println("Enter new number");
                                    space4 = scan.next();
                                    System.out.println("Editing successful");

                            }//end of switch(answeredit)
                            break;
                        case 6:
                            break;
                    }//end of switch(optionfunctions1)
                    break;
                case "4":
                case "4-":
                case "4- Game":
                    int num1 = (int) (Math.random() * 10 + 1);
                    System.out.println("Guess numbers from 1 to 10 or [0]Back to menu");
                    int guessanswer = scan.nextInt();
                    switch (guessanswer) {
                        case 0:
                            break;

                        default:
                            if (num1 == guessanswer) {
                                System.out.println("Congratulations your guess is correct");
                                System.out.println("Answer is : " + num1);
                            } else {
                                System.out.println("Your guess is not correct");
                                System.out.println("Answer is : " + num1);
                            }
                            counter++;
                            System.out.println("Was played " + counter + " times");
                    }//end of switch(guessanswer)
                    break;
                case "5":
                case "5-":
                case "5- Close the watch":
                    System.out.println("System is shutting down");
                    System.exit(0);
            }//end of switch(selection)

        }//end of loop

    }//end of main
}//end of class
