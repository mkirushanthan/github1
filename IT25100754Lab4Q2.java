import java.util.Scanner;

public class IT25100754Lab4Q2{
    public static void main(String[] args){
        double examMarks,labMarks;
        double percentageExam,percentageLab;
        
        Scanner value=new Scanner(System.in);
        
        System.out.print("Please enter exam marks (out of 100):");
        examMarks =value.nextDouble();
        
        if (examMarks<=100 && examMarks>=0 ){
            
            System.out.print("Please enter lab submission marks (out of 100):");
            labMarks =value.nextDouble();
            
            if(labMarks<=100 && labMarks>=0){
                System.out.print("Please enter the percentage given for the exam:");
                percentageExam =value.nextDouble();
                
                System.out.print("Please enter the percentage given for the lab submission :");
                percentageLab=value.nextDouble();
                
                double totalPercentage=percentageExam+percentageLab;
                
                if(totalPercentage<=100 && totalPercentage>=0){
                    double totalExam_Marks=percentageExam/100*examMarks;
                    double totalLab_Marks=percentageLab/100*labMarks;
        
                    double totalMarks=totalExam_Marks+totalLab_Marks;
        
                    System.out.print("Final Exam mark is:"+totalMarks);
                    
                    
                }else{
                    System.out.print("The percentages must add up to 100. Terminating program.");
                }
                
                
                
                
            }else{
                System.out.print("Invalid input for lab marks. Terminating program.");
            }
        }else{
            System.out.print("Invalid input for exam marks. Terminating program.");
        }
        
        //System.out.print("Please enter lab submission marks (out of 100):");
        //labMarks =value.nextDouble();
        
        //System.out.print("Please enter the percentage given for the exam:");
        //percentageExam =value.nextDouble();
        
        //System.out.print("Please enter the percentage given for the laab :");
        //percentageLab=value.nextDouble();
        
        
        //double totalExam_Marks=percentageExam/100*examMarks;
        //double totalLab_Marks=percentageLab/100*labMarks;
        
        //double totalMarks=totalExam_Marks+totalLab_Marks;
        
        //System.out.print("Final Exam mark is:"+totalMarks);
        
        
        
    }
}