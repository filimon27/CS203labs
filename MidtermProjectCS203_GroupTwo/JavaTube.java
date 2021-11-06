package MidtermProjectCS203_GroupTwo;

import jdk.dynalink.beans.StaticClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public   class JavaTube {
    public static void main(String[] args) {
        Recipe recipes = new Recipe("Banana Chocolate", "bread, egg, milk, cocoa powder, Water,banana, chocolate chip",
                "add egg, milk, and cocoa powder, and mix. Microwave for 1½ minutes or until egg is fully cooked.", 3, 10, 2);
        CookingVideo cv = new CookingVideo("Chief's table", 45, 356, 245, 1000, recipes);
        Recipe recipe2 = new Recipe("Omelette", " egg, bell pepper, ham, spinach,salt, pepper",
                "add egg, milk, and cocoa powder, and mix. Microwave for 1½ minutes or until egg is fully cooked.", 3, 10, 5);
        CookingVideo cv2 = new CookingVideo("TopChief", 56, 456, 356, 1200, recipe2);
        Recipe recipe3 = new Recipe("Dabo", "flour,water", "just mix them together ", 45, 30, 4);
        CookingVideo cv3 = new CookingVideo("Habesha Cook", 10, 67, 125, 450, recipe3);

        GamingVideo gv = new GamingVideo("packMan", "Fight", 50, 45, 40, 100);
        GamingVideo gv2 = new GamingVideo("grand auto teft", "robbbery", 56, 90, 45, 109);
        GamingVideo gv3 = new GamingVideo("call of duty", "shooting", 50, 45, 35, 150);

        Video[] allvideos = {cv, cv2, cv3, gv, gv2, gv3};
        CookingVideo[] cookingVideos = {cv, cv2, cv3};
        GamingVideo[] gamingVideos = {gv, gv2, gv3};

        VideoList videoList = new VideoList();
        videoList.add(cv);
        videoList.add(cv2);
        videoList.add(cv3);
        videoList.add(gv);
        videoList.add(gv2);
        videoList.add(gv3);
        // System.out.println(videoList);


        // print the videos using printVideos method
        // videoPrinter(allvideos);

        // prints all cooking videos recipes
        //printAllCookingRecipes(cookingVideos);
        //Printing all cooking videos
        //printAllCookingVideos(cookingVideos);
//        //printing videos sorted by title
//                JavaTube jb= new JavaTube();
//               JavaTube.sortVideoByTitle videoByTitle = jb.new sortVideoByTitle();
//
//               Arrays.sort( allvideos,videoByTitle);
//                 for (Video video: allvideos)
//                     System.out.println(video);
//
//        //printing videos sorted by view
//        JavaTube jb2 = new JavaTube();
//        JavaTube.sortVideoByView videoByView = jb2.new sortVideoByView();
//        Arrays.sort(allvideos, videoByView);
//        for (Video video : allvideos)
//
//            // anonyms inner class
//            Arrays.sort(cookingVideos, new Comparator<CookingVideo>() {
//                @Override
//                public int compare(CookingVideo o1, CookingVideo o2) {
//                    return (o1.getCookingRecipe().getServings() - o2.getRecipe().getServings());
//                }
//            });

        //other way of anonyms inner class
//        Comparator<CookingVideo>sortCookingVideoByServingSizeDescending = new Comparator<CookingVideo>(){
//            @Override
//            public int compare(CookingVideo o1, CookingVideo o2) {
//                return (o1.getCookingRecipe().getServings()-o2.getCookingRecipe().getServings())*-1;
//            }
//        };
        // printing anonyms class cooking  videos sorted by serving size descending
//        // Arrays.sort(cookingVideos,sortCookingVideoByServingSizeDescending);
//        for (CookingVideo cookingVideo : cookingVideos)
//            System.out.println(cookingVideo.printRecipe());
//
        // local inner class sorting cooking videos by ingridients list
        class Local implements Comparator<CookingVideo> {
            @Override
            public int compare(CookingVideo o1, CookingVideo o2) {
                return o1.getIngridentsList().length - o2.getIngridentsList().length;
            }
        }
//        Local local= new Local();
//        Arrays.sort(cookingVideos,local);
//        JavaTube.sortCookingVideosByIngridientsList(cookingVideos);


        //Arrays.sort(allvideos);
//        for (Video vs:allvideos)
//            System.out.println(v.toString());

        Arrays.sort(gamingVideos,((o1, o2) -> o1.getName().compareTo(o2.getName())));
        printGamingVideos(gamingVideos);

    }
    //--------//---------------//--------------//-------------//-------------------------------//------------//------------//-------

    //Local inner class sorting method
      static void sortCookingVideosByIngridientsList(CookingVideo[] cookingVideos) {
         for(CookingVideo cookingVideo: cookingVideos)
             System.out.println(cookingVideo);

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

  static void printAllCookingVideos(CookingVideo[] cookingVideos){
    for (CookingVideo cookingVideo: cookingVideos)
        System.out.println(cookingVideo);
  }

    static void printGamingVideos(GamingVideo[] gamingVideos){
        for (GamingVideo gamingVideo : gamingVideos)
            System.out.println(gamingVideo);
    }
}







