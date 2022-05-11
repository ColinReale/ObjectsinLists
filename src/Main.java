import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
 SHOW();
 animalMenu();
 booksMenu();


    }

    public static void SHOW() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TV Shows Menu. You will add your shows here. Entering nothing will stop the loop.");

        ArrayList<tvShow> showsList = new ArrayList<>();
        while (true) {
            System.out.println("Please enter the name of a tv show");
            String showName = scanner.nextLine();
            if (showName.equals("")) {
                break;
            }
            System.out.println("How many episodes are there?");
            int showTotEpisodes = Integer.parseInt(scanner.nextLine());

            System.out.println("What genre is the show?");
            String showGenre = scanner.nextLine();


            showsList.add(new tvShow(showName, showTotEpisodes, showGenre));


        }
        for (int i = 0; i < showsList.size(); i++) {
            System.out.println(showsList.get(i).toString());
        }
    }
    public static void animalMenu(){
        System.out.println("Animal Menu. You will create your animals here. Entering nothing will stop the loop.");

        ArrayList<Animal> animals = new ArrayList<>();
        while(true) {
            System.out.println("Please enter a name");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.println("Is it a dog?");
            String isADog = scanner.nextLine();
            boolean isDog;
            isDog=isADog.equalsIgnoreCase("yes");

            animals.add(new Animal(name, isDog));



        }
        for(int i = 0; i<animals.size(); i++){
            System.out.println(animals.get(i).toString());
        }
    }
    public static void booksMenu(){
        System.out.println("Books Menu. You will create your books here. Entering nothing will stop the loop.");

        ArrayList<Book> bookList = new ArrayList<>();
        while(true) {
            System.out.println("Please enter a book title");
            String bookName = scanner.nextLine();
            if(bookName.equals("")){
                break;
            }
            System.out.println("How many pages does it have?");
            int bookPages = Integer.parseInt(scanner.nextLine());

            System.out.println("What year was it published?");
            int bookYear = Integer.parseInt(scanner.nextLine());

            bookList.add(new Book(bookName, bookPages, bookYear));



        }

        System.out.println("Would you like to see all of the books' information or just the names?");
        System.out.println("(please respond 'everything' or 'names'");
        String nextL = scanner.nextLine();
        if (nextL.equals("everything")){
            for(int i = 0; i<bookList.size(); i++){
                System.out.println(bookList.get(i).toString());
        }}else if(nextL.equals("names")){
            for(int i = 0; i<bookList.size(); i++){
                System.out.println(bookList.get(i).getBook());
        }} else {
            System.out.println("sorry that was not an acceptable input.");
        }
    }
}