import java.util.Scanner;
class Input 
{
    int num1, num2;  
    void getInput() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
    }
}

class Multiply extends Input 
{
    void multiply() 
    {
        int result = num1 * num2;
        System.out.println("Multiplication result: " + result);
    }
}

class Add extends Input 
{
    void add() 
    {
        int result = num1 + num2;
        System.out.println("Addition result: " + result);
    }
}

class CalculatorApp 
{
    public static void main(String[] args) 
    { 
        Input input = new Input();
        input.getInput();
        
        Multiply multiplyObj = new Multiply();
        multiplyObj.num1 = input.num1;  
        multiplyObj.num2 = input.num2;
        multiplyObj.multiply(); 
        
        Add addObj = new Add();
        addObj.num1 = input.num1;  
        addObj.num2 = input.num2;
        addObj.add(); 
    }
}
