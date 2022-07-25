import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Random;

import javax.swing.Action;
import javax.swing.JPanel;
=======
>>>>>>> b7074324d49c28665f01ff05d84fd9e71f6ca5e7


public class User {

<<<<<<< HEAD

    ArrayList<User> friendsArray;
    static ArrayList<User> users = new ArrayList<>();
    //add types 
    User user1 = new User("Feza", "sifre");
    User user2 = new User("Konur", "sifre");
    User user3 = new User("Atakan" , "sifre");
    User user4 = new User("Bengisu", "sifre");
    
    static final int COMEDY = 0;
    static final int ACTION = 1;
    static final int HORROR = 2;
    static final int THRILLER = 3;
    static final int SCIFI = 4;
    static final int DRAMA = 5;
    static int numbersOfMovieTypes = 6;
    final int noOfNumbersCanBeRecommended = 5;

    protected int[] movieTaste;
    static User currentUser;

=======
    ArrayList<User> friendsArray;
    //add types 
    static final int ADVENTURE = 0;
    static final int COMEDY = 1;
    static final int ROMANCE = 2;
    static int numbersOfMovieTypes = 3;
    final int noOfNumbersCanBeRecommended = 5;

>>>>>>> b7074324d49c28665f01ff05d84fd9e71f6ca5e7
    String name;
    String password;
    ArrayList<Movie> moviesAlreadyEvaluated;
    ArrayList<Movie> moviesLiked;
    ArrayList<SharedUser> blendListsOfUser;
    Movie[] moviesRecommended = new Movie[noOfNumbersCanBeRecommended];

<<<<<<< HEAD
    ArrayList<Movie> allMovies;
=======
    protected int[] movieTaste;
>>>>>>> b7074324d49c28665f01ff05d84fd9e71f6ca5e7

    public User(String name, String password){
        this.name = name;
        this.password = password;
        moviesAlreadyEvaluated = new ArrayList<>();
        moviesLiked = new ArrayList<>();
        movieTaste = new int[numbersOfMovieTypes];
        this.initializeMovieTasteForBeginning();
<<<<<<< HEAD
        this.createUsers();
        currentUser = this;
    }

=======
    }


>>>>>>> b7074324d49c28665f01ff05d84fd9e71f6ca5e7
    //we will use this default constructor to prevent compile errors at sharedUsers
    public User(){

    }

<<<<<<< HEAD
    public void initializeUsersTaste(int comedy, int action, int horror, int thriller, int scifi, int drama){
        this.movieTaste[COMEDY] = comedy;
        this.movieTaste[ACTION] = action;
        this.movieTaste[HORROR] = horror;
        this.movieTaste[THRILLER] = thriller;
        this.movieTaste[SCIFI] = scifi;
        this.movieTaste[DRAMA] = drama;
    }

    public void createUsers(){
        user1.initializeUsersTaste(4, 2, 1, 1, 2, 0);
        user2.initializeUsersTaste(7, 2, 0, 0, 1, 0);
        user3.initializeUsersTaste(6, 2, 0, 0, 2, 0);
        user4.initializeUsersTaste(7, 2, 0, 0, 1, 0);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
    }
=======
    //bu basit siktir et bunu
>>>>>>> b7074324d49c28665f01ff05d84fd9e71f6ca5e7

    public void initializeMovieTasteForBeginning(){
        for(int index = 0; index < numbersOfMovieTypes; index++){
            movieTaste[index] = 0;
        }
    }

<<<<<<< HEAD
    public void initializeMoviesRecommended(){
        moviesRecommended = evaluateTasteToRecommendedMovie();
    }

    public Movie[] getMoviesRecommended(){
        return moviesRecommended;
    }
    
    public Movie[] evaluateTasteToRecommendedMovie(){

        Random rand = new Random();
        int firstMaxIndex = findMaxInt(movieTaste);
        int secondMaxIndex = findSecondMax(movieTaste);
        
        Movie[] result = new Movie[noOfNumbersCanBeRecommended];
        ArrayList<Movie> resultArr = new ArrayList<Movie>();

        ArrayList<Movie> moviesInBestCategory = Movie.moviesInCategory(firstMaxIndex, allMovies);
        ArrayList<Movie> moviesInSecondBestCategory = Movie.moviesInCategory(secondMaxIndex, allMovies);

        int first = 0;
        int index = 0;
        while( first < 3){
            index = rand.nextInt(moviesInBestCategory.size());
            if(!moviesLiked.contains(moviesInBestCategory.get(index))){
                resultArr.add(moviesInBestCategory.get(index));
                first++;
            }
        }

        int second = 0;
        int index2 = 0;
        while( second < 2){
            index2 = rand.nextInt(moviesInSecondBestCategory.size());
            if(!moviesLiked.contains(moviesInSecondBestCategory.get(index2))){
                resultArr.add(moviesInSecondBestCategory.get(index2));
                second++;
            }
            
        }

        for(int i = 0; i < resultArr.size(); i++ ){
            result[i] = resultArr.get(i);
        }
        return result;
    }

    public static int findMaxInt(int[] nums ){
        int max = -1;
        int result = 0;
        for(int i = 0; i < nums.length; i++ ){
            if(nums[i] > max){
                max = nums[i];
                result = i;
            }
        }
        return result;
    }

    public static int findSecondMax(int[] nums){
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i : nums ){
            arr.add(i);
        }

        int firstmax = findMaxInt(nums);
        arr.remove(firstmax );

        int[] temp = new int[arr.size() ];

        for(int k = 0; k < arr.size(); k++){
            temp[k] = arr.get(k);
        }

        int secondmax = findMaxInt(temp);
        if(secondmax >= firstmax  ) return secondmax+1;

        else return secondmax;      

=======
    //öner film uygunsa değilse koyma ereye

    public void initializeMoviesRecommended(){
        for(int i = 0; i < noOfNumbersCanBeRecommended; i++){
            moviesLiked.add(evaluateTasteToRecommedMovie());
        }
    }

    public Movie evaluateTasteToRecommedMovie(){
        //To do
>>>>>>> b7074324d49c28665f01ff05d84fd9e71f6ca5e7
    }

    public void updateMovieTaste(){
        //sonra elemanın zevklerini yeniliyor
        for (int i = 0; i < moviesLiked.size(); i++){
<<<<<<< HEAD
             /*bu loop önce filmin ilk genresini sonra ikinci genresine bakıyor */
                if (moviesLiked.get(i).getGenre() == (ACTION)){
                    movieTaste[ACTION]++;
                }
                if (moviesLiked.get(i).getGenre() == (COMEDY)){
                    movieTaste[COMEDY]++;
                }
                if (moviesLiked.get(i).getGenre() == (HORROR)){
                    movieTaste[HORROR]++;
                }
                if (moviesLiked.get(i).getGenre() == (THRILLER)){
                    movieTaste[THRILLER]++;
                }
                if (moviesLiked.get(i).getGenre() == (SCIFI)){
                    movieTaste[SCIFI]++;
                }
                if (moviesLiked.get(i).getGenre() == (DRAMA)){
                    movieTaste[DRAMA]++;
                }
            
=======
            for (int j = 0; j < moviesLiked.get(j).getGenre().length; j++){ /*bu loop önce filmin ilk genresini sonra ikinci genresine bakıyor */
                if (moviesLiked.get(i).getGenre()[j].equalsIgnoreCase("ADVENTURE")){
                    movieTaste[ADVENTURE]++;
                }
                if (moviesLiked.get(i).getGenre()[j].equalsIgnoreCase("COMEDY")){
                    movieTaste[COMEDY]++;
                }
                if (moviesLiked.get(i).getGenre()[j].equalsIgnoreCase("ROMANCE")){
                    movieTaste[ROMANCE]++;
                }
            }
>>>>>>> b7074324d49c28665f01ff05d84fd9e71f6ca5e7
        }
    }

    public void updateUsersBlendList(SharedUser sharedUser){
        //To do
    }

    public void updateMoviesLiked(Movie newLikedMovie){ 
        moviesLiked.add(newLikedMovie);
    }

    public void updateMoviesWatched(Movie newMovie){
        moviesAlreadyEvaluated.add(newMovie);
    }

    public void updateFriends(User newFriend){
        friendsArray.add(newFriend);
    }

    public String getName(){
        return this.name;
    }

    public int[] getMovieTaste(){
        return this.movieTaste;
    }

    public ArrayList<Movie> getMoviesAlreadyEvaluated(){
        return moviesAlreadyEvaluated;
    }

}
