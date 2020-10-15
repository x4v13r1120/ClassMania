package edu.example;

import java.io.FileNotFoundException;

public class ClassMania {
     public static void main(String[] args) throws FileNotFoundException {
//          Book book = new Book("Terry Pratchett", "A Hat full of Sky",10.99);
//          System.out.println(book.getAuthor());
//          System.out.println(book.getTitle());
//          System.out.println(book.getPrice());
//
//          System.out.println(book.toString());


//         Stock s = new Stock("abc", "Alphabet", 10, 100);
//         s.setAdjustPrice(-5);
//         System.out.println(s.toString());
//

//          Employee employee = new Employee();
//
//          List<Employee> employees = new ArrayList<>();

//          Map<String, Employee> employees = new HashMap<>();
//          employees.put("i12345", new Employee());
//          employees.get("i12345").username = "GreenWell";
//          employees.get("i12345").password = "BowTiesAreCool";
//          employees.get("i12345").salary = 12574861;
//
//          System.out.println(employees.get("i12345"));


//          List<Integer> startingList = new ArrayList<Integer>();
//          startingList.add(-3);
//          startingList.add(5);
//          startingList.add(-8);
//          startingList.add(4);
//          startingList.add(7);
//          startingList.add(2);
//          startingList.add(-1);
//
//          System.out.println(appendSumAvg(startingList));

//          Pokemon newPoke = new Pokemon("Squirtle","Water");
//          System.out.println(newPoke.getName());
//
//          ElectricPokemon ePoke = new ElectricPokemon("Pikachu", 90,20);
//          System.out.println(ePoke.getName());
//          System.out.println(ePoke.getHp());
//
//          String[] spark = ePoke.spark();
//          System.out.println("Attacks with spark for " + spark[0] + " damage.");
//
//          //order a pizza
//          //order a pizza
//          List<Pizza> pizza = new ArrayList<>();
//
//          //set toppings
//          Scanner keyboard = new Scanner(System.in);
//
//          while (true){
//               //add new pizza
//               pizza.add(new Pizza());
//
//               String sauce;
//               String cheese;
//               List<String> meats = new ArrayList<>();
//               List<String> veggies = new ArrayList<>();
//
//
//               System.out.println("What type of sauce do you want?");
//               sauce = keyboard.nextLine();
//               System.out.println("What type of cheese do you want?");
//               cheese = keyboard.nextLine();
//
//
//          boolean userSelecting = true;
//          while (userSelecting) {
//               String meat = "";
//               String veg = "";
//
//               System.out.println("What type of Meat do you want?");
//               meat = keyboard.nextLine();
//               System.out.println("What type of veggies do you want? (Enter 'none' for no veg)");
//               veg = keyboard.nextLine();
//
//               if (!meat.equalsIgnoreCase("none") || !meat.isBlank()) { //should add same to meat
//                    meats.add(meat);
//               }
//               if (!veg.equalsIgnoreCase("none") || !veg.isBlank()) { //should add same to meat
//                    veggies.add(veg);
//               }
//
//               //see if user is done
//               System.out.println("Are you done with your toppings? (Y/N)");
//               if (keyboard.nextLine().toLowerCase().startsWith("y")) {
//                    userSelecting = false;
//
//               }
//               //now we just have to add all the items
//               pizza.get(pizza.size()-1).toppings.cheese =  cheese;
//               pizza.get(pizza.size()-1).toppings.sauce = sauce;
//               pizza.get(pizza.size()-1).toppings.meats.addAll(meats);
//               pizza.get(pizza.size()-1).toppings.veggies.addAll(veggies);
//               //change because now we have to access the instance
//
//
//               //see if user is done
//               System.out.println("Are you done with all pizzas? (Y/N)");
//               if (keyboard.nextLine().toLowerCase().startsWith("y")) {
//                    break;
//               }
//          }
//
//          //now we should add a toString
//          for (int i = 0; i< pizza.size(); i++){
//               System.out.println("Pizza "+ (i+1) + " is a:"
//               + pizza.get(i).toppings.toString()
//               +". \nWith a status of "
//               + pizza.get(i).getStatus() + ".");
//          }
//      }
//          pizza.toppings.cheese = "Regular";
//          pizza.toppings.sauce = "BBQ";
//          pizza.toppings.meats.addAll(Arrays.asList("Chicken","Bacon"));
//          pizza.toppings.veggies.add("Green Peppers");
//
//          System.out.println("Your pizza is a Medium " + pizza.toppings);


//          System.out.println("What are statuses and times During delivery?");
//          for(Pizza.PizzaStatus ps : Pizza.PizzaStatus.values()){
//               System.out.print("It can be: " + ps + "\n\twith a time left of " + ps.getTimeLeft() + " minutes.\n");
//          }

//          pizza.status = Pizza.PizzaStatus.ENROUTE;
//          System.out.println(pizza.status.isOrdered());
//          System.out.println(pizza.status.isCooking());
//          System.out.println(pizza.status.isDeliverable());
//          System.out.println(pizza.status.isEnroute());
//          System.out.println(pizza.status.isDelivered());
//          System.out.println(pizza.status +" "+ pizza.status.getTimeLeft()+" mins.");


          // Can also use "Rank.class.getEnumConstants()" but .values() is faster
          // This is just to demonstrate FaceValue:
          // It shouldn't be used by Main itself so delete this before submitting

//          Rank rank = Rank.SEVEN;
//          System.out.println(rank.getCardValue());
//
//          // OR (another example - with no defined value)
//          // Notice how calling the "RANK" returns a string
//
//          Rank rank2 = null;
//          System.out.println("Card is " +
//                  rank2.KING + " with value of " +
//                  rank2.KING.getCardValue() + ".\n");
//
//          // OR....for the third example (print them all out)
//          for (Rank r : Rank.values()) {
//               System.out.printf("Card %s with value %d%n",
//                       r, r.getCardValue());
//          }
//          Deck deck = new Deck();
//          deck.shuffleDeck();
//          System.out.println(deck.drawCard());
          // Can also use "Rank.class.getEnumConstants()" but .values() is faster
          // See "tests" (also you need to throw something here)

          // you can open sporting_event.csv with just the name (it's in the same directory) - so "sporting_event.csv"
//     BookCSV books = new BookCSV("./data/books.csv");
//     books.readCSV();
//     System.out.println(books.books.get(0).title);
//
//     books.printCSV();
//     books.writeCSV();
//     SportCSVParser sport = new SportCSVParser("./data/sporting_events.csv");
//     sport.loadCSV();
//     sport.printCSV();
//

     }
//     public static List appendSumAvg(List<Integer> startingList){
//          List<Integer> positiveList = new ArrayList<Integer>();
//          List<Integer> finalList = new ArrayList<Integer>();
//          int sum = 0;
//          int average= 0;
//          for(int i = 0;i < startingList.size() ; i++) {
//               int number = startingList.get(i);
//               if (number > 0){
//                    sum += number;
//                    positiveList.add(number);
//                    average = (sum / positiveList.size());
//               }
//               else{
//                    sum += 0;
//                    average += 0;
//               }
//          }
//
//          finalList.add(sum);
//          finalList.add(average);
//
//          return finalLi
}

