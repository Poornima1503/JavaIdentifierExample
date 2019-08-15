package academy.learnProgramming;

public class IdentifierTest {
    public static void main(String[] args) {
        int x;

        int 1a;         // won't compile since it starts with number
        int _1a;        // valid and compiles
        int aaa;        // valid and compiles
        int main;       // valid and compiles as this it is
        int static;     // Invalid as it is a Java keyword 
        int void;       //Invalid as it is a Java keyword
        int String;      //valid and complies
        int 123456a;    // won't compile since it starts with number
        int $1234567;  // valid and compiles
        int _1234567;   // valid and compiles
        int 1234567a;    // won't compile since it starts with number

        int do;  //Invalid as it is a Java keyword
        int Do; // valid and compiles
        int dO; //// valid and compiles

    }
}
