package MidtermProjectCS203_GroupTwo;

public abstract class CookingVideo extends Video implements CookingVideos{
    private Recipe recipe;

    public CookingVideo() {
        recipe = new Recipe("bread", new String[]{"flour","water","bakingSoda"},"mix them in one bowl and put it in the oven",60,40,4);
    }

    public CookingVideo(String title, double durationInMinutes, int views, int likes, double watchTime, Recipe recipe) {
        super(title, durationInMinutes, views, likes, watchTime);
        this.recipe = recipe;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public String[] getIngridentsList() {
        String [] arr =recipe.getIngredients();
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
      return arr;

    }

    @Override
    public Recipe getCookingRecipe() {
        return getRecipe();
    }

    @Override
    public String printRecipe() {
        return "Dish :" +recipe.getRecipeName() + "\n ingredients : " + getIngridentsList() + "\n Directions" + recipe.getInstructions() + "\n Prep Time: " + recipe.getPrepTime() + "\n Cooking Time :" + recipe.getCookTime() + "Serving Size :" +recipe.getServings();
    }


}
