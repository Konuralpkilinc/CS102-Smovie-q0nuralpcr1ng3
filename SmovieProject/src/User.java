import java.util.ArrayList;


public class User {

    ArrayList<User> friendsArray;
    //add types 
    static final int ADVENTURE = 0;
    static final int COMEDY = 1;
    static final int ROMANCE = 2;
    static int numbersOfMovieTypes = 3;
    final int noOfNumbersCanBeRecommended = 5;

    String name;
    String password;
    ArrayList<Movie> moviesAlreadyEvaluated;
    ArrayList<Movie> moviesLiked;
    ArrayList<SharedUser> blendListsOfUser;
    Movie[] moviesRecommended = new Movie[noOfNumbersCanBeRecommended];

    protected int[] movieTaste;

    public User(String name, String password){
        this.name = name;
        this.password = password;
        moviesAlreadyEvaluated = new ArrayList<>();
        moviesLiked = new ArrayList<>();
        movieTaste = new int[numbersOfMovieTypes];
        this.initializeMovieTasteForBeginning();
    }


    //we will use this default constructor to prevent compile errors at sharedUsers
    public User(){

    }

    //bu basit siktir et bunu

    public void initializeMovieTasteForBeginning(){
        for(int index = 0; index < numbersOfMovieTypes; index++){
            movieTaste[index] = 0;
        }
    }

    //öner film uygunsa değilse koyma ereye

    public void initializeMoviesRecommended(){
        for(int i = 0; i < noOfNumbersCanBeRecommended; i++){
            moviesLiked.add(evaluateTasteToRecommedMovie());
        }
    }

    public Movie evaluateTasteToRecommedMovie(){
        //To do
    }

    public void updateMovieTaste(){
        //sonra elemanın zevklerini yeniliyor
        for (int i = 0; i < moviesLiked.size(); i++){
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
