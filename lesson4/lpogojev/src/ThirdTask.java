public class ThirdTask {
	public static void main(String[] args) {
		int year = 2001;
		while (year > 2000 && year < 2018) {
			leapyear(year);
			year++;
		}
	}

	public static void leapyear(int year) {
		if ((year%4 == 0) && (year%100 != 0) || (year%400 == 0)) 
{
			System.out.println(year + " - leap year.");
		} else {
			System.out.println(year + " - not a leap year.");

		}
	}
}
