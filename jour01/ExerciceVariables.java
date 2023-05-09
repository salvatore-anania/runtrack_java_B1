public class ExerciceVariables {
    
    public static void main(String[] args) {
        int num1=10,num2=20;
        System.out.println("la valeur de num1 est "+num1+" la valeur de num2 est "+num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("la valeur de num1 est "+num1+" la valeur de num2 est "+num2);
    }
}
