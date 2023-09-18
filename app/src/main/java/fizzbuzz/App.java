/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package fizzbuzz;

public class App {
    public static void fizzbuzz() {
        // Your code goes here!

                StringBuilder solution = new StringBuilder();

        for(int i=0; i<=100; i++){
            if(isDiv(i, 3)==false && isDiv(i, 5)==false){
                solution.append(String.format(i+"%n"));
            }
            else{
                if(isDiv(i, 3)==true || isDiv(i, 5)==true){
                    solution.append(String.format("Fizz%n"));
                    continue;
                }
                if(isDiv(i, 3)==true || isDiv(i, 5)==true){
                    solution.append(String.format("Buzz%n"));
                    continue;
                }
                if(isDiv(i, 3)==true || isDiv(i, 5)==true){
                    solution.append(String.format("FizzBuzz"));
                    continue;
                }
            }

        }
        System.out.println(solution);
    }

    public static boolean isDiv(int inNumA, int inNumB){
        return inNumA%inNumB==0;
    }

    public static void main(String[] args) {
        fizzbuzz();
    }
}
