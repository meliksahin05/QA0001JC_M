package d7IfStatement_Switch;

public class Switch01 {

    public static void main(String[] args) {

         //Switch Statement : based on different conditions we can do tasks with a simplier sytanx

        //Example; Create code to print day numbers based on the day names


        //1.WAY IF- ELSE IF -ELSE STATEMENTS

        String dayName = "wedNesDAY";

        if(dayName.equalsIgnoreCase("Sunday")){
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Monday")){
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("Thuesday")){
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("Wednesday")){
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("Thursday")){
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("Friday")){
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("Saturday")){
            System.out.println(7);
        } else {
            System.out.println("Invalid day name.....");
        }


        // Switch Statement

        /*
        The structure of switch statement
//          String dayName = "wedNesDAY";
          switch(variableName) {
                    case data1 : ==> codes(System.out.println(1)) to execute
                    break;      ===> optional keyword
                    case data2   ==> codes(System.out.println(1)) to execute
                    break;
                    case data3 : ==> codes(System.out.println(1)) to execute
                    break;      ===> optional keyword
                    case data4   ==> codes(System.out.println(1)) to execute
                    break;
                    case data5 : ==> codes(System.out.println(1)) to execute
                    break;      ===> optional keyword
                    case data6   ==> codes(System.out.println(1)) to execute
                    break;
                    case data7 : ==> codes(System.out.println(1)) to execute
                    break;      ===> optional keyword
                    default:    ===> codes execute, to see the invalid data

         */

        System.out.println("================SWITCH STATEMENTS=====================================");

                  String dayName1 = "wedNesDAY";

                  switch (dayName1.toLowerCase()){
                      case "sunday" :
                          System.out.println(1);
                          break ;
                      case "monday" :
                          System.out.println(2);
                          break ;
                      case "tuesday" :
                          System.out.println(3);
                          break ;
                      case "wednesday" :
                          System.out.println(4);
                          break ;
                      case "thursday" :
                          System.out.println(5);
                        break ;
                      case "friday" :
                          System.out.println(6);
                          break ;
                      case "saturday" :
                          System.out.println(7);
                          break ;
                      default :
                          System.out.println("Enter a valid day name");

                  }

                  //break: keyword is optional to stop execution  when find true statement

                  // default is used to execute code when cases dont match with data

        //NOTES: We converted the all data lowercase then check cases in switch
        // used break keyword to stop printing after finding match/true

        // We can not use ignoreLowerCase because ignorelowercase return true/false



    }
}
