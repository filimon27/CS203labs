package MidtermProjectCS203_GroupTwo;

import java.util.Comparator;

public class JavaTube {
    public static void main(String[] args) {


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
        class local implements Comparator<CookingVideos>{
            @Override
            public int compare(CookingVideos o1, CookingVideos o2) {
                return o1.getIngridentsList().length-o2.getIngridentsList().length;
            }
        }
    }
    static void sortCookingVideoByServingSizeDescending(CookingVideo,new Comparator<CookingVideo>(){
        @Override
        public int compare(CookingVideo o1, CookingVideo o2) {
            return (o1.getCookingRecipe().getServings()-o2.getCookingRecipe().getServings())*-1;
        }
    }



    })*/
}







