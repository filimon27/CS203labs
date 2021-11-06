package MidtermProjectCS203_GroupTwo;

 public class Recipe implements Cloneable {
    private  String recipeName;
    private String ingredients;
    private   String instructions;
    private  int prepTime;
    private  int cookTime;
    private  int servings;

    public Recipe() {
        recipeName="shiro";
        ingredients="berbere,chickPea,cookingOil,onions,salt,water,kibe";
        instructions="just mix it together";
        prepTime=30;
        cookTime=20;
        servings=4;
    }

    public Recipe(String recipeName, String ingredients, String instructions, int prepTime, int cookTime, int servings) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.prepTime = prepTime;
        this.cookTime = cookTime;
        this.servings = servings;
    }

     public String getRecipeName() {
         return recipeName;
     }

     public void setRecipeName(String recipeName) {
         this.recipeName = recipeName;
     }

     public String getIngredients() {
         return ingredients;
     }

     public void setIngredients(String ingredients) {
         this.ingredients = ingredients;
     }
     public String getInstructions() {
         return instructions;
     }

     public void setInstructions(String instructions) {
         this.instructions = instructions;
     }
     public int getPrepTime() {
         return prepTime;
     }

     public void setPrepTime(int prepTime) {
         this.prepTime = prepTime;
     }
     public int getCookTime() {
         return cookTime;
     }

     public void setCookTime(int cookTime) {
         this.cookTime = cookTime;
     }
     public int getServings() {
         return servings;
     }

     public void setServings(int servings) {
         this.servings = servings;
     }





     @Override
    protected Object clone() throws CloneNotSupportedException {

             Recipe cloned = (Recipe) super.clone();

             return cloned;

    }

     @Override
     public String toString() {
         return "Recipe{" +
                 "recipeName='" + recipeName + '\'' +
                 ", ingredients='" + ingredients + '\'' +
                 ", instructions='" + instructions + '\'' +
                 ", prepTime=" + prepTime +
                 ", cookTime=" + cookTime +
                 ", servings=" + servings +
                 '}';
     }
 }
