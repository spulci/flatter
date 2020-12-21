package org.spulci.ppa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AppTest 
{   
    static App testApp;
    static List<List<Integer>> listToBeFlattened;
    static Integer [] [] arrayToBeFlattened;

    @BeforeAll
    static void init(){
        testApp = new App();
        listToBeFlattened = List.of(List.of(1,2,4), List.of(1));
        arrayToBeFlattened = new Integer[][]{{1,2,4},{2}};
    }

    @Test
    @DisplayName("flat a List of <T>")
    void whenNestedListOfIntegerIsFlattened(){
        List<?> flattedList = testApp.flattenListOfListsStream(listToBeFlattened);
        assertEquals(flattedList.size(), 4);
    }

    @Test
    @DisplayName("flat an Array of Integer")
    void whenNestedArrayOfIntegerIsFlattened(){
        Integer[] flattedList = testApp.flattenArrayOfArrayStream(arrayToBeFlattened);
        assertEquals(flattedList.length, 4);
    }
}
