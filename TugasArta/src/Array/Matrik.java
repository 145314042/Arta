package Array;
public class Matrik {
    static double nilaiDeterminan;
    public boolean nilaiDeterminan (double[] angkaInput){
        nilaiDeterminan = (angkaInput[0] * angkaInput[3]) - (angkaInput[1] * angkaInput[2]);
        if (nilaiDeterminan == 0) return false;
        else return true;
    }
    
    public void printOutAngkaMatrik(double[] angkaInput){
        for (int i = 0; i < angkaInput.length; i++) {
            if (i == 1) System.out.println(angkaInput[i] + "\t");
            else System.out.print(angkaInput[i] + "\t");
        }
        System.out.println("\n");
    }
    
    public void printOutAngkaMatrikInvers(double[] angkaInput){
        for (int i = 0; i < angkaInput.length; i++) {
            if (i == 1) System.out.println(angkaInput[i] / nilaiDeterminan + "\t");
            else System.out.print(angkaInput[i] / nilaiDeterminan + "\t");
        }
        System.out.println("\n");
    }
}
