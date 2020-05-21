public class MultiplicationTable{
	//Atributes
	int num;
	int min;
	int max;
	
	public MultiplicationTable(int k, int l, int m){
		num = k;
		min = l;
		max = m;
	}

	public int getNum(){
		return num;
	}
	public int getMin(){
		return min;
	}
	public int getMax(){
		return max;
	}
	
	public void setNum(int newNum){
		this.num = newNum;
	}
	public void setMin(int newMin){
		this.min = newMin;
	}
	public void setMax(int newMax){
		this.max = newMax;
	}
	
	public String printTable(){
		for(int n=min; n<=max; n++){
			System.out.println(num+"x"+j+"="+num*j); 
		}
		String x = "======================================================";
		return x;
	}

	
}