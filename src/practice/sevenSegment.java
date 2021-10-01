package practice;

import java.util.Arrays;

public class sevenSegment {
        private int[][] segment = new int[5][4];

        public void setUpSevenSegmentScreen(String userInput){
                for (int i=0; i < userInput.length(); i++){
                        switch (i) {
                                case 0 -> {
                                        int a = Character.getNumericValue(userInput.charAt(i));
                                        if (a == 1) {
                                                {setSevenSegmentScreen1();}
                                        }

                                }
                                case 1 -> {
                                        int b = Character.getNumericValue(userInput.charAt(i));
                                        if (b == 1) {
                                                {setSevenSegmentScreen2();}
                                        }
                                }
                                case 2 -> {
                                        int c = Character.getNumericValue(userInput.charAt(i));
                                        if (c == 1) {
                                                {setSevenSegmentScreen3();}
                                        }
                                }
                                case 3 -> {
                                        int d = Character.getNumericValue(userInput.charAt(i));
                                        if (d == 1) {
                                                {setSevenSegmentScreen4();}
                                        }
                                }
                                case 4 -> {
                                        int e = Character.getNumericValue(userInput.charAt(i));
                                        if (e == 1) {
                                                {setSevenSegmentScreen5();}
                                        }
                                }
                                case 5 -> {
                                        int f = Character.getNumericValue(userInput.charAt(i));
                                        if (f == 1) {
                                                {setSevenSegmentScreen6();}
                                        }
                                }
                                case 6 -> {
                                        int g = Character.getNumericValue(userInput.charAt(i));
                                        if (g == 1) {
                                                {setSevenSegmentScreen7();}
                                        }
                                }
                                case 7 -> {
                                        int h = Character.getNumericValue(userInput.charAt(i));
                                        if (h == 0) {
                                                {clearScreen();}
                                        }
                                }
                        }
                }
        }

        private void setSevenSegmentScreen1(){
        segment[0][0]=1;
        segment[0][1]=1;
        segment[0][2]=1;
        segment[0][3]=1;

        }
        private void setSevenSegmentScreen2(){
        segment[0][3]=1;
        segment[1][3]=1;
        segment[2][3]=1;
        }

        private void setSevenSegmentScreen3(){
        segment[2][3]=1;
        segment[3][3]=1;
        segment[4][3]=1;
        }

        private void setSevenSegmentScreen4(){
        segment[4][0]=1;
        segment[4][1]=1;
        segment[4][2]=1;
        segment[4][3]=1;
        }

        private void setSevenSegmentScreen5(){
        segment[2][0]=1;
        segment[3][0]=1;
        segment[4][0]=1;
        }

        private void setSevenSegmentScreen6(){
        segment[0][0]=1;
        segment[1][0]=1;
        segment[2][0]=1;
        }

        private void setSevenSegmentScreen7(){
        segment[2][0]=1;
        segment[2][1]=1;
        segment[2][2]=1;
        segment[2][3]=1;
        }

        public void clearScreen(){
        int[][] zeroArray = segment;
        for(int i=0; i < zeroArray.length; i++) {
                for (int j=0; j < zeroArray[0].length; j++){
                        zeroArray[i][j] = 0;
                }
        }
        }

        public void displaySevenSegment(){
          int[][] arrayToDisplay = segment;
                 for(int i = 0; i < arrayToDisplay.length; i++){
                         for (int j = 0; j < arrayToDisplay[0].length; j++){
                if(arrayToDisplay[i][j] == 1){
                        System.out.print("# ");
        }
                else{
        System.out.print("  ");
        }
                }
        System.out.println();
        }
        }

        @Override
        public String toString(){
                return Arrays.deepToString(segment);
        }
        }