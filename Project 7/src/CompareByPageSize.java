import java.util.Comparator;

public class CompareByPageSize implements Comparator<WrittenWork> {

	
	
	@Override
	public int compare(WrittenWork w1, WrittenWork w2) {
		if(w1.getPageSize()>w2.getPageSize()) {
			return 1;
		}
		else {
			return -1;
		}
	
	}
	
	
	
}
