package bsu.rfe.java.group8.lab1.Yanuchok.varA6;

public class Apple extends Food {
	public boolean equals(Object obj) {
        if (!(obj instanceof Apple)) {
            return false;
        } else if (size == null || ((Apple) obj).size == null) {
            return false;
        }
        else if (!(size.equals(((Apple) obj).size))) {
            return false;
        }
        return super.equals(obj);
    }

    private String size;

    public String getSize(){
        return size;
    }

    public Apple(String size){
        super ("Яблоко");
        this.size = size;
    }

    public void consume(){
        System.out.println(this + " съедено");
    }

    @Override
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}
