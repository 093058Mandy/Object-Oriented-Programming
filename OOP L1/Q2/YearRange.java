public class YearRange{

    int firstDivisor;
    int secondDivisor;
    int firstYear;
    int secondYear;
    int rangeType;

	public YearRange( int min, int max){
       	firstYear = min;
       	secondYear = max;
    }
	

    public int getFirstDivisor(){
        return firstDivisor;
    }
    public int getSecondDivisor(){
        return secondDivisor;
    }
    public int getFirstYear(){
        return firstYear;
    }
    public int getSecondYear(){
        return secondYear;
    }
    public int getRangeType(){
        return rangeType;
    }


    public void setFirstDivisor(int newFirstDivisor){
        this.firstDivisor = newFirstDivisor;
    }
    public void setSecondDivisor(int newSecondDivisor){
        this.secondDivisor = newSecondDivisor;
    }
    public void setFirstYear(int newFirstYear){
        this.firstYear = newFirstYear;
    }
    public void setSecondYear(int newSecondYear){
        this.secondYear = newSecondYear;
    }
    public void setRangeType(int newRangeType){
        this.rangeType = newRangeType;
    }

	public int printYears(){
		if(rangeType == 1){
			for(int m = firstYear; m <= secondYear; m++){
				if(m % 14 == 0 && m % 20 == 0){
					System.out.println(m);
				}

			}	
		}
		if(rangeType == 2){
			for(int m = firstYear; m <= secondYear; m++){
				if(m % 4 == 0){
					System.out.println(m);
				}
			}
		}
		if(rangeType == 3){
			for(int k = firstYear; k <= secondYear; k++){
				if(k % 4 == 0 && k % 3 == 0){
					System.out.println(k);
				}
			}
		}
		return 0;
	}

}