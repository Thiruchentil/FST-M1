package activity5;

public class MyBook extends Book{
	@Override
	public void setTitle(String s) {
		// TODO Auto-generated method stub
		super.setTitle(s);
	}
	
	public static void main(String[] args) {
		MyBook newNovel = new MyBook();
		newNovel.setTitle("Perfect Days");
		System.out.println("The title is:"+ newNovel.getTitle());
	}
}
