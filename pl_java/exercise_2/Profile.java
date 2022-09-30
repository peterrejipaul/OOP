package pl_java.exercise_2;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;

public class Profile {

/*
 * Attributes
 */
    String name;
    String countryCode;
    String phoneNo;
    URI profilePhotoUrl;
    String about;
    LocalDateTime lastSeen;


/*
 * Constructors
 */


/*
 * Getters
 */



/*
 * Setters
 */
    public void setName(String name){
            this.name = name;
    }

    public void setPhoneNo(String countryCode, String phoneNo){
            this.countryCode = countryCode;
            this.phoneNo = phoneNo;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) throws URISyntaxException{
        this.profilePhotoUrl = new URI(profilePhotoUrl);
    }

    public void setAbout(String about){
            this.about = about;
    }


/*
 * Methods
 */
    public void updateLastSeen(LocalDateTime lastSeen){
            this.lastSeen = lastSeen;
    }
}