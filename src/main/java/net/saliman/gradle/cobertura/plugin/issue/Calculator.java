package net.saliman.gradle.cobertura.plugin.issue;

public class Calculator {

    private RandomNumberGenerator randomGenerator;
    
    public double multiplyByRandomNumber(int number) {
        return number * randomGenerator.randomNumber();
    }

    protected void setRandomGenerator(RandomNumberGenerator randomGenerator) {
        this.randomGenerator = randomGenerator;
    }
}
