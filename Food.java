package bsu.rfe.java.group8.lab1.Yanuchok.varA6;

	public class Food implements Consumable{
		public void consume() 
		{
			
		}
		
	    private String name;

	    public String getName(){
	        return name;
	    }

	    public Food(String name){
	        this.name = name;
	    }

	    public String toString(){
	        return name;
	    }

	    public boolean equals(Object obj){
	        if(!(obj instanceof Food)){
	            return false;
	        }
	        else if (name == null || ((Food)obj).name == null){
	            return false;
	        }
	        return name.equals(((Food)obj).name);
	    }
	}
