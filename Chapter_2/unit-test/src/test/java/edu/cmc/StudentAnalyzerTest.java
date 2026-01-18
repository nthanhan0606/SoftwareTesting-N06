package edu.cmc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    @Test
    public void testMixedValidAndInvalidScores() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0);

        assertEquals(2, analyzer.countExcellentStudents(scores));
        assertEquals(8.17, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testAllValidScores() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(6.0, 8.0, 9.5, 10.0);

        assertEquals(3, analyzer.countExcellentStudents(scores));
        assertEquals(8.38, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testEmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
        assertEquals(0, analyzer.calculateValidAverage(Collections.emptyList()), 0.01);
    }

    @Test
    public void testBoundaryValuesOnly() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(0.0, 10.0);

        assertEquals(1, analyzer.countExcellentStudents(scores));
        assertEquals(5.0, analyzer.calculateValidAverage(scores), 0.01);
    }

    @Test
    public void testInvalidScoresOnly() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        List<Double> scores = Arrays.asList(-3.0, 12.0, 15.0);

        assertEquals(0, analyzer.countExcellentStudents(scores));
        assertEquals(0, analyzer.calculateValidAverage(scores), 0.01);
    }
}
