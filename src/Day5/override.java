package Day5;
class students{
	String name;
	int length;
	void name() {
		System.out.println(" food habits");
	}

	void length() {
		System.out.println("angry");
	}
	String he()
	{
		return "name";
	}
}


class staff extends students
{
	@Override
	void name() {
		System.out.println("differnt in name:");
	}
}
public class override {
	public static void main(String[] args) {
	staff s = new staff();
	s.name();
	}

}
