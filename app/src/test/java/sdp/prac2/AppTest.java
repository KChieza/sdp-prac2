/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    //tests if task2 removes first character from each element in list
    // @Test void task2RemovesFirstCharacter() {
    //     //Arrange
    //     SimpleFunctions testClass = new SimpleFunctions();
    //     List<String> strings = Arrays.asList("hi", "bye", "greetings", "top of the morning");
    //     List<String> expected = Arrays.asList("i", "ye", "reetings", "op of the morning");
    //     //Act
    //     List<String> result = testClass.Task2(strings);
    //     //Assert
    //     assertIterableEquals(expected, result);
    // }


    //tests if task2 removes elements without characters from list
    @Test void task2RemovesEmptyElements() {
        //Arrange
        SimpleFunctions testClass = new SimpleFunctions();
        List<String> strings = Arrays.asList("hi", "", "", "top of the morning");
        List<String> expected = Arrays.asList("i", "op of the morning");
        //Act
        List<String> result = testClass.Task2(strings);
        //Assert
        assertIterableEquals(expected, result);
    }

    //tests if task4 works with equal list lengths 
    @Test void task4EqualLists(){
        //Arrange 
        SimpleFunctions testing = new SimpleFunctions();
        List<int> a = Arrays.asList(1,2,3,4);
        List<int> b = Arrays.asList(2,4,6,8);
        List<int> expected = Arrays.asList(8,12,12,8);
        //Act
        List<int> result = testing.Task4(a,b);
        //Assert
        assertIterableEquals(expected,result);
    }
    //tests if task4 returns null with unequal list lengths 
    @Test void task4UnequalLengths1(){
        //Arrange 
        SimpleFunctions testing = new SimpleFunctions();
        List<int> a = Arrays.asList(1,2,3,4);
        List<int> b = Arrays.asList(2,4,6);
        List<int> expected = null;
        //Act
        List<int> result = testing.Task4(a,b);
        //Assert
        assertIterableEquals(expected,result);
    }
    //tests if task4 returns null with unequal list lengths
    @Test void task4UnequalLengths2(){
        //Arrange 
        SimpleFunctions testing = new SimpleFunctions();
        List<int> a = Arrays.asList(1,2,3,4);
        List<int> b = Arrays.asList(2,4,6);
        List<int> expected = null;
        //Act
        List<int> result = testing.Task4(b,a);
        //Assert
        assertIterableEquals(expected,result);
    }

    // //tests if task2 removes elements without characters from list
    // @Test void task2RemovesEmptyElements() {
    //     //Arrange
    //     SimpleFunctions testClass = new SimpleFunctions();
    //     List<String> strings = Arrays.asList("hi", "", "", "top of the morning");
    //     List<String> expected = Arrays.asList("i", "op of the morning");
    //     //Act
    //     List<String> result = testClass.Task2(strings);
    //     //Assert
    //     assertIterableEquals(expected, result);
    // }

 

        List<Integer> a = Arrays.asList(1,2,3,4,5,6);
        List<Integer> b = Arrays.asList(7,2,0,1);
        List<Integer> expected = Arrays.asList(6);
        //Act
        int result = testClass.Task1(a,b);
        //Assert
        assertEquals(expected, result);
     }
    //Checks that numbers not multiples of 100 are rounded up to the nearest 100
    @Test void task6Rounds_Up() {
        //Arrange
        SimpleFunctions tester = new SimpleFunctions();
        List<Integer> origNums = Arrays.asList(1, 24, 103, 267, 999, 1008);
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> roundedNums = Arrays.asList(100, 100, 200, 300, 1000, 1100);
        //Act
        List<Integer> result = tester.Task6(origNums, emptyList);
        //Assert
        assertEquals(roundedNums, result);
    }

    //Checks that numbers multiples of 100 stay the same
    @Test void task6No_Change() {
        //Arrange
        SimpleFunctions tester = new SimpleFunctions();
        List<Integer> origNums = Arrays.asList(0, 100, 200, 300, 1000, 1100, 10000);
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> roundedNums = Arrays.asList(0, 100, 200, 300, 1000, 1100, 10000);
        //Act
        List<Integer> result = tester.Task6(origNums, emptyList);
        //Assert
        assertEquals(roundedNums, result);
    }
       /**
       Checking if task 3 works for brackets that are nested correctly and they balance
     */
    
    @Test void task3Matching_and_Nested_Correctly() {
        //Arrange
        SimpleFunctions testClass = new SimpleFunctions();

        List<String> strings = Arrays.asList("(())", "((()))", "((((()))))");
       
        //Act
        boolean result = testClass.Task2(strings);

        List<Integer> a = Arrays.asList(1,2,3,4,5,6);
        List<Integer> b = Arrays.asList(4,2,0,1);
        List<Integer> expected = Arrays.asList(11);
        //Act
        int result = testClass.Task1(a,b);

        //Assert
        assertIterableEquals(true, result);
    }

    // Checking if task 3 works for brackets that are not nested correctly and they do not balance
    @Test void task2Matching_and_not_Nested_Correctly() {
        //Arrange
        SimpleFunctions testClass = new SimpleFunctions();

        List<String> strings = Arrays.asList("(()(()))", "((()", "()()(");
       
        //Act
        boolean result = testClass.Task2(strings);
        //Assert
        assertIterableEquals(false, result);
    }


}
