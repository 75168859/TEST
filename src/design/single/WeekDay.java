package design.single;


public abstract class WeekDay {
	private WeekDay(){}
	
	public static final WeekDay MON = new WeekDay(){

		@Override
		public WeekDay nextDay() {
			return TUE;
		}
		
	};
		
	public static final WeekDay TUE = new WeekDay(){

		@Override
		public WeekDay nextDay() {
			return null;
		}
		
	};
			
	
			
	public abstract WeekDay nextDay();
	
}
