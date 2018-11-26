/*
Row Counter for Knitting
26 November 2018
Kelly Ryan
 */

import java.util.Scanner;

public class RowCounter {

    static int currentRowsCompleted = 0;
    static int totalRowsToBeCompleted = 0;


    public static void main(String[] args) {

        System.out.println("Enter total number of rows to be completed:");

        Scanner sc1 = new Scanner(System.in);
        totalRowsToBeCompleted = sc1.nextInt();

        while (currentRowsCompleted < totalRowsToBeCompleted) {        //Check whether the total number of rows knitted is less than total number of rows to be knitted. If so, add new rows.

            addRows();

            //Check if too many rows have been added. If so, call method to display message indicating this.
            if (currentRowsCompleted > totalRowsToBeCompleted) {

                tooManyRows();

            } else if (currentRowsCompleted == totalRowsToBeCompleted) {

                    stopKnitting(); //If the number of rows knitted is equal to the total number of rows to be knitted then stop knitting.

                } else{

                    keepKnitting(); //Therefore, if the number of rows knitted is neither greater than nor equal to the total number of rows to be knitted then keep knitting.
                }
            }
        }

        //Takes input for the number of rows completed and updates the current number of rows completed.
        public static void addRows () {

            System.out.println("Number of new rows completed?");

            Scanner sc2 = new Scanner(System.in);
            int counter = sc2.nextInt();
            currentRowsCompleted = currentRowsCompleted + counter;
        }

        //If the number of completed rows exceeds the total number to be completed a message is displayed stating too many rows have been knit.
        public static void tooManyRows () {

            System.out.println("You have knit " + (currentRowsCompleted - totalRowsToBeCompleted) + " too many rows.");

        }

        //Displays a message stating how many row have been completed and how many remain.
        public static void keepKnitting () {

            System.out.println(currentRowsCompleted + " of " + totalRowsToBeCompleted + " rows completed.");
            System.out.println((totalRowsToBeCompleted - currentRowsCompleted) + " rows remaining.");

        }

        //Once the number of rows that have been completed is equal to the total number of rows to be completed an instruction to stop knitting is displayed.
        public static void stopKnitting () {

            System.out.println(totalRowsToBeCompleted + " of " + totalRowsToBeCompleted + " rows completed. Stop knitting.");
        }

    }
