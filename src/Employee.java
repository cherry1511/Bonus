
public abstract class Employee {
	BonusCalculator bonusCalculator;
	void setCr(int c) {
		System.out.println(" salary "+c+" Bonus "+(bonusCalculator.computeBonus(c)));
	}
	
}
