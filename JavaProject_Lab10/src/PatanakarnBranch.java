
public class PatanakarnBranch extends Product{
	private int payUnit(){
		return super.getunit()/2;
	}
	private int freeUnit(){
		return super.getunit()- this.payUnit();
	}
	
	public int getTotalprice() {
		return this.payUnit()*100;
	}
	
	public String toString() {
		return "You buy "+this.payUnit()+" unit, get free "+
				this.freeUnit()+" Unit"+"("+this.getTotalprice()+")";
	}

}
