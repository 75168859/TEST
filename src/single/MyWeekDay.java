package single;


public enum MyWeekDay {
	MON(){

		@Override
		public MyWeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		
	},
	TUE(){

		@Override
		public MyWeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		
	},WED(){

		@Override
		public MyWeekDay nextDay() {
			// TODO Auto-generated method stub
			return null;
		}
		
	};
	
	private MyWeekDay(){}
	private MyWeekDay(int n){}
	public abstract MyWeekDay nextDay();
}

enum X {
	a{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
		public void aaat(){
			System.out.println("ddddddddddddd");
		}
	};

	
	public abstract void aaat();
}

