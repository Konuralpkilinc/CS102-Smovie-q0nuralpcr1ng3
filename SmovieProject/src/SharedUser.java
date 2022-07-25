import java.util.ArrayList;
import java.util.Collections;

public class SharedUser extends User{

    private ArrayList<User> usersOfThisSharedUser;
    
    public SharedUser(ArrayList<User> usersJoined){
        super();
        this.usersOfThisSharedUser = usersJoined;
        usersOfThisSharedUser = new ArrayList<User>();
        this.name = createNameOfTheBlendList();
    }

    //code to create and initialize the movie taste of the blend list user that we created
    //this code initializes the users taste by taking and taking the smallest number of points that earned through evaluation 
    //and initializing to an array of taste to prevent a user dominate a list by using the "Make My Reccomendation" option too much

    public void initializeMovieTasteAtTheBegining(){
        for(int index = 0; index<numbersOfMovieTypes; index++){
            movieTaste[index] = getTheLeastEvaluatedTasteOfSpesificCategory(index);
        }
    }

    //this method is a helper method for initializeMovieTasteAtTheBeginning which return the smallest value for the spesific
    //taste
    public int getTheLeastEvaluatedTasteOfSpesificCategory(int category){
        ArrayList<Integer> arrayToSort = new ArrayList<Integer>();
        for(int index = 0; index<this.usersOfThisSharedUser.size(); index++){
            arrayToSort.add(this.usersOfThisSharedUser.get(index).getMovieTaste()[category]);
        }
        Collections.sort(arrayToSort);
        return arrayToSort.get(0);
    }

    //code to create a basic name for the blend list 

    public String createNameOfTheBlendList(){
        String blendName = "Blend of ";
        for(int index = 0; index<this.usersOfThisSharedUser.size(); index++){
            if(index==this.usersOfThisSharedUser.size()-1){
                blendName = blendName + this.usersOfThisSharedUser.get(index).getName();
            }
            else{
                blendName = blendName + this.usersOfThisSharedUser.get(index).getName() + ",";
            }
        }
        return blendName;
    }


    //putting all movies watched by users into an array of moviesAlreadyEvaluated to prevent some of the users seeing the same 
    //movie that they got recommended before
    public void evaluateThisBlendsAlreadyWatchedMovies(){
        //creating for loop to go through users
        for(int indexOfUsers = 0; indexOfUsers<usersOfThisSharedUser.size(); indexOfUsers++){
            ArrayList<Movie> usersAlreadyEvaluatedMovies = this.usersOfThisSharedUser.get(indexOfUsers).moviesAlreadyEvaluated;
            //using that users already evaluated movies to fill the moviesalreadyevaluated
            for(int indexOfMovies = 0; indexOfMovies<usersAlreadyEvaluatedMovies.size(); indexOfMovies++){
                //if that movie already exist do nothing
                if(this.getMoviesAlreadyEvaluated().contains(usersAlreadyEvaluatedMovies.get(indexOfMovies))){
                    //do nothing
                }
                //else then add the movie to the sharedUser's alreadyEvaluated arraylist
                else{
                    this.getMoviesAlreadyEvaluated().add(usersAlreadyEvaluatedMovies.get(indexOfMovies));
                }
            }
        }
    }

}
