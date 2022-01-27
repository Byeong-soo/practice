public class test5 {

    public static int[][] solution(int rows, int columns) {
        int[][] answer = {};
        int[][] table = new int[rows][columns];
        int zeroCount =0;
        int inputValue = 1;
        int row = 0;
        int column = 0;


        for(int i=0; i<table.length; i++){
            for(int j=0; j<table[0].length; j++){
                table[i][j] = 0;
                zeroCount++;
            }
        }
        System.out.println(zeroCount);
        table[0][0] = 1;
        zeroCount -= 1;


        while(zeroCount>0){
            if(inputValue%2==0){
                if(row == rows-1){
                    row=0;
                }else{
                    row = row+1;
                }
            }else{
                if(column == columns-1){
                    column=0;
                }else{
                    column = column+1;
                }
            }
            inputValue++;
            if(table[row][column] ==0){
                zeroCount--;
            }
            if(row==0 && column ==0 && inputValue%2 !=0){
                break;
            }
            table[row][column]= inputValue;
        }
        answer = table;

        return answer;
    }


}
