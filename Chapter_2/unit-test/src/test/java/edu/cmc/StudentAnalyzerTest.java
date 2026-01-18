package edu.cmc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    @Test
    public void testCountExcellentStudents_NormalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);

        int result = analyzer.countExcellentStudents(scores);

        assertEquals(2, result);
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        int result = analyzer.countExcellentStudents(Collections.emptyList());

        assertEquals(0, result);
    }

    @Test
    public void testCalculateValidAverage_NormalCase() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);

        double average = analyzer.calculateValidAverage(scores);

        assertEquals(8.17, average, 0.01);
    }

    @Test
    public void testCalculateValidAverage_AllInvalid() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        List<Double> scores = Arrays.asList(-2.0, 12.0);

        double average = analyzer.calculateValidAverage(scores);

        assertEquals(0, average, 0.01);
    }
}
