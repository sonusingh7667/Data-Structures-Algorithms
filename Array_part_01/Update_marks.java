package DSA__Arrays;

public class Update_marks {

    public static void Update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i]+1;
        }
    }

    public  static  void main(String[] args){
        int marks[] = {95,97,99};

        Update(marks);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] +" ");
        }
        System.out.println();
    }
}
