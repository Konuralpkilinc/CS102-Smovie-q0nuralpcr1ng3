import java.util.ArrayList;

import javax.swing.ImageIcon;

/**
 * Movie
 */
public class Movie {

    private String name;
    private int genre;
    private ImageIcon poster;
    private String description; 
    
    static ArrayList<Movie> movies = new ArrayList<Movie>();
    
    Movie com1 = new Movie("Dumb and Dumber", User.COMEDY, new ImageIcon("Dumb and Dumber.jpg"), "After a woman leaves a briefcase at the airport terminal, a dumb limo driver and his dumber friend set out on a hilarious cross-country road trip to Aspen to return it");
    Movie com2 = new Movie("Caddyshack", User.COMEDY, new ImageIcon("Caddyshack.jpg"), "An exclusive golf course has to deal with a brash new member and a destructive dancing gopher");
    Movie com3 = new Movie("National Lampoon's Christmas Vacation", User.COMEDY, new ImageIcon("National Lampoon's Christmas Vacation.jpg"), "The Griswold family's plans for a big family Christmas predictably turn into a big disaster.");
    Movie com4 = new Movie("National Lampoon's Animal House", User.COMEDY, new ImageIcon("National Lampoon's Animal House.jpg"), "At a 1962 college, Dean Vernon Wormer is determined to expel the entire Delta Tau Chi Fraternity, but those troublemakers have other plans for him");
    Movie com5 = new Movie("Revenge of the Nerds", User.COMEDY, new ImageIcon("Revenge of the Nerds.jpg"), "At Adams College, a group of bullied outcasts and misfits resolve to fight back for their peace and self-respect");
    Movie com6 = new Movie("Billy Madison", User.COMEDY, new ImageIcon("Billy Madison.jpg"), "In order to inherit his fed up father's hotel empire, an immature and lazy man must repeat grades 1-12 all over again");
    Movie com7 = new Movie("The Naked Gun: From the Files of Police Squad!", User.COMEDY, new ImageIcon("The Naked Gun.jpg"), "Incompetent police Detective Frank Drebin must foil an attempt to assassinate Queen Elizabeth II.");
    Movie com8 = new Movie("Airplane!", User.COMEDY, new ImageIcon("Airplane.jpg"), "A man afraid to fly must ensure that a plane lands safely after the pilots become sick");
    Movie com9 = new Movie("Happy Gilmore", User.COMEDY, new ImageIcon("Happy Gilmore.jpg"), "A rejected hockey player puts his skills to the golf course to save his grandmother's house");
    Movie com10 = new Movie("Ace Ventura: When Nature Calls", User.COMEDY, new ImageIcon("AceV.jpg"), "Ace Ventura, Pet Detective, returns from a spiritual quest to investigate the disappearance of a rare white bat, the sacred animal of a tribe in Africa");
    Movie scifi1 = new Movie("2001: A Space Odyssey", User.SCIFI, new ImageIcon("2001: A space Odyssey.jpg"), "After uncovering a mysterious artifact buried beneath the Lunar surface, a spacecraft is sent to Jupiter to find its origins - a spacecraft manned by two men and the supercomputer H.A.L. 9000.");
    Movie scifi2 = new Movie("The Terminator", User.SCIFI, new ImageIcon("The Terminator.jpg"), "A human soldier is sent from 2029 to 1984 to stop an almost indestructible cyborg killing machine, sent from the same year, which has been programmed to execute a young woman whose unborn son is the key to humanity's future salvation.");
    Movie scifi3 = new Movie("Planet of the Apes", User.SCIFI, new ImageIcon("Planet of the Apes.jpg"), "An astronaut crew crash-lands on a planet in the distant future where intelligent talking apes are the dominant species, and humans are the oppressed and enslaved.");
    Movie scifi4 = new Movie("Alien", User.SCIFI, new ImageIcon("Alien.jpg"), "The crew of a commercial spacecraft encounter a deadly lifeform after investigating an unknown transmission.");
    Movie scifi5 = new Movie("Blade Runner", User.SCIFI,new ImageIcon( "Blade Runner.jpg"), "A blade runner must pursue and terminate four replicants who stole a ship in space, and have returned to Earth to find their creator.");
    Movie scifi6 = new Movie("Terminator 2: Judgment Day", User.SCIFI, new ImageIcon("Terminator2.jpg"),"A cyborg, identical to the one who failed to kill Sarah Connor, must now protect her ten-year-old son John from a more advanced and powerful cyborg.");
    Movie scifi7 = new Movie("The Matrix", User.SCIFI, new ImageIcon("the Matrix.jpg"), "When a beautiful stranger leads computer hacker Neo to a forbidding underworld, he discovers the shocking truth--the life he knows is the elaborate deception of an evil cyber-intelligence");
    Movie drama1 = new Movie("The Lord of the Rings: The Fellowship of the Ring", User.DRAMA,new ImageIcon("The Lord of the Rings.jpg") , "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron");
    Movie drama2 = new Movie("Cube", User.DRAMA, new ImageIcon("Cube.jpg"), "Six complete strangers with widely varying personalities are involuntarily placed in an endless maze containing deadly traps.");
    Movie drama3 = new Movie("The Silence of the Lambs", User.DRAMA, new ImageIcon("Silence of the Lambs.jpg"), "A young F.B.I. cadet must receive the help of an incarcerated and manipulative cannibal killer to help catch another serial killer, a madman who skins his victims");
    Movie drama4 = new Movie("National Velvet", User.DRAMA, new ImageIcon("National Velvet.jpg"), "A jaded former jockey helps a young girl prepare a wild but gifted horse for England's Grand National Sweepstakes.");
    Movie drama5 = new Movie("The Rainmaker", User.DRAMA, new ImageIcon("The Rainmaker.jpg"), "An underdog lawyer takes on a fraudulent insurance company.");
    Movie thriller1 = new Movie("Psycho", User.THRILLER, new ImageIcon("Psycho.jpg"), "A Phoenix secretary embezzles $40,000 from her employer's client, goes on the run, and checks into a remote motel run by a young man under the domination of his mother.");
    Movie thriller2 = new Movie("Chinatown", User.THRILLER, new ImageIcon("Chinatown.jpg"), "A private detective hired to expose an adulterer in 1930s Los Angeles finds himself caught up in a web of deceit, corruption, and murder.");
    Movie thriller3 = new Movie("The Tenant", User.THRILLER, new ImageIcon("The Tenant.jpg"), "A bureaucrat rents a Paris apartment where he finds himself drawn into a rabbit hole of dangerous paranoia.");
    Movie thriller4 = new Movie("The Name of the Rose", User.THRILLER, new ImageIcon("The Name of the Rose.jpg"), "An intellectually nonconformist friar investigates a series of mysterious deaths in an isolated abbey.");
    Movie thriller5 = new Movie("Blue Velvet", User.THRILLER, new ImageIcon("Blue Velvet.jpg"), "The discovery of a severed human ear found in a field leads a young man on an investigation related to a beautiful, mysterious nightclub singer and a group of psychopathic criminals who have kidnapped her child.");
    Movie thriller6 = new Movie("Manhunter", User.THRILLER, new ImageIcon("Manhunter.jpg"), "Former FBI profiler Will Graham returns to service to pursue a deranged serial killer dubbed 'the Tooth Fairy' by the media");
    Movie horror1 = new Movie("The Shining", User.HORROR, new ImageIcon("the Shining.jpg"), "A family heads to an isolated hotel for the winter where a sinister presence influences the father into violence, while his psychic son sees horrific forebodings from both past and future");
    Movie horror2 = new Movie("The Thing", User.HORROR, new ImageIcon("the Thing.jpg"), "A research team in Antarctica is hunted by a shape-shifting alien that assumes the appearance of its victims");
    Movie horror3 = new Movie("the Exorcist", User.HORROR, new ImageIcon("The Exorcist"), "When a 12-year-old girl is possessed by a mysterious entity, her mother seeks the help of two priests to save her.");
    Movie horror4 = new Movie("Halloween", User.HORROR, new ImageIcon("Halloween.jpg"), "Fifteen years after murdering his sister on Halloween night 1963, Michael Myers escapes from a mental hospital and returns to the small town of Haddonfield, Illinois to kill again");
    Movie horror5 = new Movie("An American Werewolf in London", User.HORROR, new ImageIcon("an American Werewolf in London.jpg"), "Two American college students on a walking tour of Britain are attacked by a werewolf that none of the locals will admit exists");
    Movie horror6 = new Movie("Jaws", User.HORROR,new ImageIcon("the Jaws.jpg"), "When a killer shark unleashes chaos on a beach community off Cape Cod, it's up to a local sheriff, a marine biologist, and an old seafarer to hunt the beast down");
    Movie action1 = new Movie("Die Hard", User.ACTION, new ImageIcon("Die Hard.jpg"), "An NYPD officer tries to save his wife and several others taken hostage by German terrorists during a Christmas party at the Nakatomi Plaza in Los Angeles");
    Movie action2 = new Movie("Indiana Jones and the Raiders of the Lost Ark", User.ACTION, new ImageIcon("Indiana Jones.jpg"), "Archaeology professor Indiana Jones ventures to seize a biblical artefact known as the Ark of the Covenant. While doing so, he puts up a fight against Renee and a troop of Nazis");
    Movie action3 = new Movie("Indiana Jones and the Temple of Doom", User.ACTION,new ImageIcon("temple.jpg") , "A skirmish in Shanghai puts archaeologist Indiana Jones, his partner Short Round and singer Willie Scott crossing paths with an Indian village desperate to reclaim a rock stolen by a secret cult beneath the catacombs of an ancient palace");
    Movie action4 = new Movie("Indiana Jones and the Last Crusade", User.ACTION,new ImageIcon("Last.jpg") , "In 1938, after his father Professor Henry Jones, Sr. goes missing while pursuing the Holy Grail, Professor Henry 'Indiana' Jones, Jr. finds himself up against Adolf Hitler's Nazis again to stop them from obtaining its powers");
    Movie action5 = new Movie("Predator", User.ACTION, new ImageIcon("Predator.jpg"), "A team of commandos on a mission in a Central American jungle find themselves hunted by an extraterrestrial warrior.");
    Movie action6 = new Movie("The Road Warrior", User.ACTION,new ImageIcon("The Road Warrior.jpg") , "In the post-apocalyptic Australian wasteland, a cynical drifter agrees to help a small, gasoline-rich community escape a horde of bandits");

    public int getGenre(){
        return genre;
    }

    public void updateMovies(){
        movies.add(com1);
        movies.add(com2);
        movies.add(com3);
        movies.add(com4);
        movies.add(com5);
        movies.add(com6);
        movies.add(com7);
        movies.add(com8);
        movies.add(com9);
        movies.add(com10);
        movies.add(scifi1);
        movies.add(scifi2);
        movies.add(scifi3);
        movies.add(scifi4);
        movies.add(scifi5);
        movies.add(scifi6);
        movies.add(scifi7);
        movies.add(drama1);
        movies.add(drama2);
        movies.add(drama3);
        movies.add(drama4);
        movies.add(drama5);
        movies.add(thriller1);
        movies.add(thriller2);
        movies.add(thriller3);
        movies.add(thriller4);
        movies.add(thriller5);
        movies.add(thriller6);
        movies.add(horror1);
        movies.add(horror2);
        movies.add(horror3);
        movies.add(horror4);
        movies.add(horror5);
        movies.add(horror6);
        movies.add(action1);
        movies.add(action2);
        movies.add(action3);
        movies.add(action4);
        movies.add(action5);
        movies.add(action6);
    }

    public Movie(String name, int genre, ImageIcon poster, String description) {
        this.name = name;
        this.genre = genre;
        this.poster = poster;
        this.description = description;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public void setGenre(int genre) {
        this.genre = genre;
    }



    public ImageIcon getPoster() {
        return poster;
    }



    public void setPoster(ImageIcon poster) {
        this.poster = poster;
    }



    public String getDescription() {
        return description;
    }



    public void setDescription(String description) {
        this.description = description;
    }


    public static ArrayList<Movie> getMovies() {
        return movies;
    }



    public static void setMovies(ArrayList<Movie> movies) {
        Movie.movies = movies;
    }

    public static ArrayList<Movie> moviesInCategory(int cat, ArrayList<Movie> mov  ){
        ArrayList<Movie> result = new ArrayList<Movie>();

        for(Movie em : mov ){
            if(em.getGenre() == cat){
                result.add(em);
            }
        }

        return result;
    }
    
}