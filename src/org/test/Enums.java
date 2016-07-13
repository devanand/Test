package org.test;

public enum Enums {

	EAST(1,0) {
		@Override
		public void turnLeft() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void turnRight() {
			// TODO Auto-generated method stub
			
		}
	}, 
	WEST(-1, 0) {
		@Override
		public void turnLeft() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void turnRight() {
			// TODO Auto-generated method stub
			
		}
	}, 
	NORTH(0, 1) {
		@Override
		public void turnLeft() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void turnRight() {
			// TODO Auto-generated method stub
			
		}
	}, 
	SOUTH(0, -1) {
		@Override
		void turnLeft() {
			// TODO Auto-generated method stub
			
		}

		@Override
		void turnRight() {
			// TODO Auto-generated method stub
			
		}
	};
	
	int x, y;
	private Enums(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	abstract void turnLeft();
	abstract void turnRight();
	
	public static void main(String[] args) {
		Enums e = Enums.EAST;
		
	}
}
