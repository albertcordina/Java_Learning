import java.util.ArrayList;

public class Array_2D_List {
    public static void main(String[] args) {
        // 2D ArrayList = a dynamic list of lists ;2:11;
        // You can change the size of these lists during runtime;

        ArrayList<String> bakeryList = new ArrayList(); // ArrayList/ container of bakery;
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
        System.out.println(bakeryList.get(1)); // prints out the 'garlic bread';

        ArrayList<String> produceList = new ArrayList(); // ArrayList/ container of produce;
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList(); // ArrayList/ container of drinks;
        drinksList.add("soda");
        drinksList.add("coffee");

//------------------------------ ARRAY LIST OF THE LISTS -----------------------------------------------------------
        ArrayList<ArrayList<String>> groceryList = new ArrayList(); // ArrayList/ container of the Lists;
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(groceryList); // to print out the whole list of the lists;
        System.out.println(groceryList.get(2).get(1)); // to print out the list number '2' and the value '1', i.e. 'coffee';

    }
}
