package MidtermProjectCS203_GroupTwo;

import java.util.Arrays;
import java.util.Comparator;

public   class JavaTube {
    public static void main(String[] args) {
        Recipe recipes= new Recipe("Banana Chocolate","bread, egg, milk, cocoa powder, Water,banana, chocolate chip",
                "add egg, milk, and cocoa powder, and mix. Microwave for 1½ minutes or until egg is fully cooked.",3,10,2);
        CookingVideo cv = new CookingVideo("Chief's table",45,356,245,1000,recipes);
      Recipe recipe2= new Recipe( "Omelette"," egg, bell pepper, ham, spinach,salt, pepper",
              "add egg, milk, and cocoa powder, and mix. Microwave for 1½ minutes or until egg is fully cooked.",3,10,2);
      CookingVideo cv2= new CookingVideo("TopChief",56,456,356,1200,recipe2);
       Recipe recipe3= new Recipe("Dabo","flour,water","just mix them together ",45,30,4);
       CookingVideo cv3= new CookingVideo("Habesha Cook",10,67,125,450,recipe3);

       GamingVideo gv= new GamingVideo("packMan","Fight",50,45,40,100);
       GamingVideo gv2= new GamingVideo("grand auto teft","robbbery",56,90,45,100);
       GamingVideo gv3= new GamingVideo("call of duty","shooting",50,45,35,150);

       Video[] allvideos={cv,cv2,cv3,gv,gv2,gv3};
       CookingVideo [] cookingVideos={cv,cv2,cv3};
       GamingVideo[] gamingVideos={gv,gv2,gv3};
        // print the videos using printVideos method

//     JavaTube jb= new JavaTube();
//               JavaTube.sortVideoByTitle v = jb.new sortVideoByTitle();
//
//               Arrays.sort( allvideos,jb.new sortVideoByTitle() );
//                for( Video p: allvideos)
//                    System.out.println(p);


             JavaTube.sortCookingVideosByIngridientsList();




        Arrays.sort(allvideos);
//        for (Video vs:allvideos)
//            System.out.println(v.toString());

         videoPrinter(allvideos);
  // printAllCookingvideos(cookingVideos);



    }

        // inner class Video sorting by title
        class sortVideoByTitle implements Comparator<Video> {

              @Override
              public int compare(Video o1, Video o2) {
                  return o1.getTitle().compareTo(o2.getTitle());
              }


          }
          // inner class Video sorting using views
          class sortVideoByView implements Comparator<Video>{

              @Override
              public int compare(Video o1, Video o2) {
                  return o1.getViews()- o2.getViews();
              }
          }
          // local inner class sorting cooking videos by ingridients list

    static void  sortCookingVideosByIngridientsList(){
        class local implements Comparator<CookingVideo>{
            @Override
            public int compare(CookingVideo o1, CookingVideo o2) {
                return o1.getIngridentsList().length-o2.getIngridentsList().length;
            }
        }
    }

   /* void sortCookingVideoByServingSizeDescending implements CookingVideos(){
        @Override
        public int compare(CookingVideo o1, CookingVideo o2) {
            return (o1.getCookingRecipe().getServings()-o2.getCookingRecipe().getServings())*-1;
        }
    })*/


    static void printAllCookingRecipes( CookingVideo[] cookingVideos){
        for (int i = 0; i < cookingVideos.length; i++) {
            System.out.println(cookingVideos[i].printRecipe());
        }

    }
  static void videoPrinter(Video[]videos){
      for(int i=0; i<videos.length;i++){
          System.out.println(videos[i].toString());
      }

  }
}







