
package SteppingStones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cgray
 */
public class SteppingStone6_RecipeBox {
    
private ArrayList<SteppingStone5_Recipe> listOfRecipes; // Declare the instance variable

    // Accessor method for listOfRecipes
    public ArrayList<SteppingStone5_Recipe> getListOfRecipes() {
        return listOfRecipes;
    }

    // Mutator method for listOfRecipes
    public void setListOfRecipes(ArrayList<SteppingStone5_Recipe> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }

    // Default constructor
    public SteppingStone6_RecipeBox() {
        listOfRecipes = new ArrayList<>();
    }

    // Constructor with parameter
    public SteppingStone6_RecipeBox(ArrayList<SteppingStone5_Recipe> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }

    // Custom method to print details of a recipe
    public void printAllRecipeDetails(String selectedRecipeName) {
        for (SteppingStone5_Recipe recipe : listOfRecipes) {
            if (recipe.getRecipeName().equals(selectedRecipeName)) {
                recipe.printRecipe(); // Assuming printRecipe() method exists in SteppingStone5_Recipe
                return;
            }
        }
        System.out.println("Recipe not found.");
    }

    // Custom method to print all recipe names
    public void printAllRecipeNames() {
        for (int j = 0; j < listOfRecipes.size(); j++) {
            System.out.println((j + 1) + ": " + listOfRecipes.get(j).getRecipeName());
        }
    }

    // Custom method to add a new recipe
    public void addNewRecipe() {
        // Given that there is a method to generate and populate a new recipe.
        // SteppingStone5_Recipe newRecipe = createNewRecipe();
        // listOfRecipes.add(newRecipe);
    }

    // Main method for user interaction
    public static void main(String[] args) {
        SteppingStone6_RecipeBox myRecipeBox = new SteppingStone6_RecipeBox();
        Scanner menuScnr = new Scanner(System.in);

        System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
        
        while (menuScnr.hasNextInt()) {
            int input = menuScnr.nextInt();
            
            switch (input) {
                case 1:
                    myRecipeBox.addNewRecipe();
                    break;
                case 2:
                    System.out.println("Which recipe?\n");
                    String selectedRecipeName = menuScnr.next();
                    myRecipeBox.printAllRecipeDetails(selectedRecipeName);
                    break;
                case 3:
                    myRecipeBox.printAllRecipeNames();
                    break;
                default:
                    System.out.println("\nInvalid menu item.");
                    break;
            }
            
            System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
        }
    }
}
