import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class TestWrittenWork {
	public static void main (String[] args) {

		Novel s=new Novel("Google","me",2001,33333,"action",2);
		Novel s1=new Novel("Ge","ypu",200331,11,"action",4);
		Novel s2=new Novel("bad","me",2001,221,"action",2);
		ShortStory c5= new ShortStory("maybeGood","me",2001,21,2222,true);
		ShortStory c6= new ShortStory("facebook","me",2301,21,121,false);



		//.out.println(s.toString());

		ArrayList<WrittenWork> arr=new ArrayList<WrittenWork>();
		arr.add(s);
		arr.add(s1);
		arr.add(s2);
		arr.add(c5);
		arr.add(c6);
		for (WrittenWork writtenWork : arr) {
			System.out.println(writtenWork);
		}
System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
Collections.sort(arr,new CompareByPageSize());
for (WrittenWork writtenWork : arr) {
	System.out.println(writtenWork);
}











	}








}
