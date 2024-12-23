package bsu.rfe.java.group8.lab1.Yanuchok.varA6;

	public class Main {

	    public static void main(String[] args) throws Exception {
	        Food[] breakfast = new Food[args.length];
	        for (int i = 0; i < args.length; i++) {
	            String[] parts = args[i].split("/");
	            if (parts[0].equals("Cheese")) {
	                breakfast[i] = new Cheese();
	            } else if (parts[0].equals("Apple")) {
	                breakfast[i] = new Apple(parts[1]);
	            } else if (parts[0].equals("ChewingGum")) {
	                breakfast[i] = new ChewingGum(parts[1]);
	            }
	        }
	        for (Food item : breakfast) {
	            item.consume();
	        }

	        Food food = new Apple("большое") ;
	        System.out.println(food + ": " + countFoods(breakfast, food));
	        printFoods(breakfast);
	        System.out.println("Всего хорошего!");
	    }

	    static Integer countFoods(Food[] breakfast, Food food) {
	        Integer count = 0;
	        for(int i = 0; i < breakfast.length; i++) {
	            if(food.equals(breakfast[i]))
	            {
	                count++;
	            }
	        }
	        return count;
	    }

	    static void printFoods(Food[] breakfast){
	        int c = 0;
	        int a = 0;
	        int p = 0;
	        for(int i = 0; i < breakfast.length; i++) {

	            if(breakfast[i] instanceof Cheese){
	                c++;
	            }
	            else if (breakfast[i] instanceof Apple){
	                a++;
	            }
	            else if (breakfast[i] instanceof ChewingGum){
	                p++;
	            }
	        }
	        System.out.println("CЫР - " + c);
	        System.out.println("ЯБЛОКО - " + a);
	        System.out.println("ЖЕВАТЕЛЬНАЯ РЕЗИНКА - " + p);
	    }
	}
 
