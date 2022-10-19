//Created by 21343077_Glody Syah Rabbynawa

public class satu {
    public static void main(String[] args){
        int white_space,i;
        int total_num = 9;
        int current_num = 4;
        int total_num2 = 9;
        int current_num2 = 9;

        //Bagian Bawah
        while(current_num<9){
            white_space = (total_num - current_num) / 4;
            for(i=0;i<white_space;i++){
                System.out.print(" ");
            }
            for(i=white_space+1;i<current_num/2+white_space+1;i++){
                System.out.print(i);
            }
            for(i=0;i<white_space;i++){
                System.out.print(" ");
            }
            System.out.print(" ");
            for(i=0;i<white_space;i++){
                System.out.print(" ");
            }
            for(i=white_space+1+current_num/2;i<current_num/2+white_space+1+current_num/2;i++){
                System.out.print(i);
            }
            System.out.println(" ");
            current_num = current_num * 2;
        }

        //Bagian Atas
        while(current_num2>0){
            white_space = (total_num2-current_num2) / 2;
            for(i=0;i<white_space;i++){
                System.out.print(" ");
            }
            for(i=1;i<current_num2+1;i++){
                System.out.print(i);
            }
            for(i=0;i<white_space;i++){
                System.out.print(" ");
            }
            System.out.println(" ");
            current_num2 = current_num2-2;
        }
    }
}