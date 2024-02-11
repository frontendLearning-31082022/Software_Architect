package e.dependency_inversion;

public class DependencyInversion {

    interface SalaryCalculator{}

    interface SalaryCalculatorType2 extends SalaryCalculator{}

    class SalaryCalculatorDepartment7 implements SalaryCalculator{}

}

