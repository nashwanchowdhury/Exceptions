
public class Calculator {

    public int factorial(int num) {
        if (num <= -1) {
            throw new IllegalArgumentException("Number has to be a positive number");
        }

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }

        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {
        if (setSize <= -1 || subsetSize <= -1 || subsetSize > setSize) {
            throw new IllegalArgumentException("Number has to be a positive number");
        }

        int numerator = factorial(setSize);
        int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

        return numerator / denominator;
    }
}
