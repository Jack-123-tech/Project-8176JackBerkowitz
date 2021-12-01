
public class ShortStory extends WrittenWork {

	int paraNum;
	boolean pics;



	public ShortStory(String title,String author,int year,int paraNum,int pageSize,boolean pics) {
		super(title,author,year,pageSize);
		this.paraNum=paraNum;
		this.pics=pics;
	}



	public boolean equals(ShortStory s1) {
		if(s1 instanceof ShortStory) {
			if(s1.getTitle()==super.getTitle()&& s1.getAuthor()==super.getAuthor()&&s1.getyear()==super.getyear()&&
					s1.getParaNum()==paraNum&&s1.isPics()==pics) {
				return true;
			}
			else {
				return false;
			}
		}




		return false;


	}






	public int getParaNum() {
		return paraNum;
	}
	public void setParaNum(int paraNum) {
		this.paraNum = paraNum;
	}
	public boolean isPics() {
		return pics;
	}
	public void setPics(boolean pics) {
		this.pics = pics;
	}
	public String toString() {
		String s= super.toString();
		return s+ ","+pics+","+paraNum ;
	}






}
