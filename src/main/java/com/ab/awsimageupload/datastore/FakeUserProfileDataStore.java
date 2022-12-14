package com.ab.awsimageupload.datastore;

import com.ab.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("2b217325-6474-44a4-a212-4fc41e04158a"), "Beyonce Knowles", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("0b6cdcd9-3694-4b98-8ec4-0f0bf62b080c"), "Janet Jackson", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }

}
