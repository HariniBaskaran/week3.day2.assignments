package week3.day2.assignments;

public class Automation extends MultipleLangauge implements Language,TestTool{

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("---------------SELENIUM----------------");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("---------------JAVA-------------------");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("---------------RUBY-------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation auto = new Automation();
		auto.selenium();
		auto.java();
		auto.ruby();
		auto.python();
	}
	
}
