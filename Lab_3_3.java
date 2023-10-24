import java.util.Scanner;

public class Lab_3_3 {
    public static void main(String[] args)
    {
        System.out.print("Enter the size for the matrix: ");
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[input.nextInt()][];

        int len = matrix.length;
        for(int i = 0; i < len; i++)
        {
            matrix[i] = new int[len];
            input = new Scanner(System.in);
            for(int j = 0; j < len; j++){matrix[i][j] = input.nextInt();}
        }
        input.close();

        boolean checkRow = true;
        boolean checkUseRow = false;
        for(int i = 0; i < len; i++)
        {
            checkRow = true;
            for(int j = 0; j < len-1; j++)
            {
                if(matrix[i][j] != matrix[i][j+1])
                {
                    checkRow = false;
                }
            }
            if(checkRow){System.out.printf("All %ds on row %d\n",matrix[i][0], i+1); checkUseRow = true;}
        }

        boolean checkCol = true;
        boolean checkUseCol = false;
        for(int i = 0; i < len; i++)
        {
            checkCol = true;
            for(int j = 0; j < len-1; j++)
            {
                if(matrix[j][i] != matrix[j+1][i]){checkCol = false;}
            }
            if(checkCol){System.out.printf("All %ds on column %d\n",matrix[0][i], i+1); checkUseCol = true;}
        }

        boolean checkUseDi = false;
        boolean checkdiR = true;
        boolean checkdiL = true;
        for(int i = 0; i < len-1; i++)
        {
            if(matrix[i][i] != matrix[i+1][i+1]){checkdiL = false;}
        }
        if(checkdiL){System.out.printf("All %ds on diagonal \n",matrix[0][0]); checkUseDi = true;}

        for(int i = 0; i < len-1; i++)
        {
            if(matrix[i][len-1-i] != matrix[i+1][len-2-i]){checkdiR = false;}
        }
        if(checkdiR){System.out.printf("All %ds on diagonal \n",matrix[0][len-1]); checkUseDi = true;}

        boolean checkUseSuper = false;
        boolean checkSuper = true;
        boolean checkUseSub = false;
        boolean checkSub = true;
        for(int i = 0; i < len-2 ;i++)
        {
            if(matrix[i][i+1] != matrix[i+1][i+2]){checkSuper = false;}
            if(matrix[i+1][i] != matrix[i+2][i+1]){checkSub = false;}
        }
        if(checkSuper){System.out.printf("All %ds on superdiagonal \n",matrix[0][len-1]); checkUseSuper = true;}
        if(checkSub){System.out.printf("All %ds on subdiagonal \n",matrix[len-1][0]); checkUseSub = true;}
        
        if(!checkUseRow){System.out.println("No same numbers on a row");}
        if(!checkUseCol){System.out.println("No same numbers on a column");}
        if(!checkUseSuper){System.out.println("No same numbers on the superdiagonal");}
        if(!checkUseDi){System.out.println("No same numbers on the diagonal");}
        if(!checkUseSub){System.out.println("No same numbers on the subdiagonal");}
    }
}