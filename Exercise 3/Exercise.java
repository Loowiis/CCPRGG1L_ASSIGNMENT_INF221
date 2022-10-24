public class Exercise {
    public static void main(String[] args) throws Exception {
//PATTERN 1 
       // char [][] cArray = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};
        //for (int rows= 0; rows <cArray.length; rows++){
            //System.out.println("");
            //for (int column = 0; column <3; column++){
                //if (rows  %2 !=0){
                    //System.out.print(cArray[rows][column]);



                //}

            //}

        //}


    //}

    //}
       

        // PATTERN 2
        //System.out.println("2. PATTERN 2");
        //char [][] cArray = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};
        //for (int rows = 0; rows < cArray.length; rows++) {

            //System.out.println("");
            //for (int column = 0; column < 3; column++) {
                //if (rows %2 == 0){
                //System.out.print(cArray[rows][column]);
                //}    
                    //else if(rows %2 != 0){
                       // System.out.print("a");

                //}

            //}

        //}


    //}

    //}
       
    

    

    
        // PATTERN 3
        //System.out.println("3. PATTERN 3");
        //char [][] cArray = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};
        //for (int rows= 0; rows <cArray.length; rows++){
            //System.out.println("");
            //for (int column = 0; column <3; column++){
                //if (rows == 0 || rows == 3){
                    //System.out.print(cArray[rows][column]);
                //}
                   //if (rows == 1 || rows == 2){
                        //if (column == 0 || column == 2){
                            //System.out.print(" ");
                        //} else {
                          //System.out.print(cArray[rows][column]);
                        //}
                    //}
           //}

        //}

    //}

//}





        // PATTERN 4
        //System.out.println("4. PATTERN 4");
//         char [][] cArray = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};
//         for (int row = 0; row < cArray.length; row++) {
//             System.out.println(" ");
//             System.out.print("row " + row + ": ");
//         for (int column = 0; column < 3; column++) {
//             if(row == 0 || row == 2)
//               if (column == 0 || column == 2)
//               {
//                System.out.print("  ");
//               }
//               else
//               {
//                 System.out.print(cArray[row][column] + " ");
//               }
//             if (row == 1 || row ==3)
//             System.out.print(cArray[row][column] + " ");
    
//             }
    
//         }
//     }
// }





        // Get the SUM
        //System.out.println("5. SUM");
        int i, j, row = 0, column;  

        int[][] SumOfRowCols_arr = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        for(i = 0; i < SumOfRowCols_arr.length; i++)

        {

            column = 0;

            for(j = 0; j < SumOfRowCols_arr[0].length; j++)

            {

                row = row + SumOfRowCols_arr[i][j];

            }

        }

         System.out.println ("Total of " + row);
    }
}

        
