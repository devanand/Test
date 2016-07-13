
enum Status {
	NEW(1),
	OPEN(2),
	CLOSED(3);
	
	private int status;
	
	Status(int status) {
		this.status = status;
	}
	
	public int getStatus() {
		return this.status;
	}
	
	public static Status fromString(String status) {
		if(status == null || status.isEmpty()) return null;
		for(Status s:Status.values()) {
			if(status.equalsIgnoreCase(s.toString())) {
				return s;
			}
		}
		return null;
 	}
	
}

public class EnumTest {
	public static void main(String[] args) {
		System.out.println(Status.fromString("OPEN").ordinal());
	}
}
