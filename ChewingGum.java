package bsu.rfe.java.group8.lab1.Yanuchok.varA6;

public class ChewingGum extends Food{
	public boolean equals(Object obj) {
        if (!(obj instanceof ChewingGum)){
           return false;
        }
        if (flavour == null || ((ChewingGum)obj).flavour == null){
            return false;
        }
        if(!(flavour.equals(((ChewingGum) obj).flavour))){
            return false;
        }

        return super.equals(obj);
    }

    private String flavour;

    public String getFilling(){
        return flavour;
    }

    public void setFilling(String flavour){
        this.flavour = flavour;
    }

    public ChewingGum(String flavour){
        super ("Жевательная Резинка");
        this.flavour = flavour;
    }

    public void consume(){
        System.out.println(this + " съедена");
    }

    @Override
    public String toString() {
        return super.toString() + " c привкусом '" + flavour.toUpperCase() + "'";
    }
}
