package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("David");
        User user2 = new ZGeneration("Daniel");
        User user3 = new YGeneration("Diana");
        //When
        String davidShare = user1.sharePost();
        String danielShare = user2.sharePost();
        String dianaShare = user3.sharePost();
        //Then
        assertEquals("Posting on Facebook", davidShare);
        assertEquals("Posting on Snapchat", danielShare);
        assertEquals("Posting on Twitter", dianaShare);
    }

    @Test
    void testIndividualStrategy() {
        //Given
        User user1 = new Millenials("Daniel");
        //When
        String danielSharing = user1.sharePost();
        System.out.println("Daniel is: " + danielSharing);
        user1.setSocialPublisher(new SnapchatPublisher());
        danielSharing = user1.sharePost();
        System.out.println("Daniel is: " + danielSharing);
        //Then
        assertEquals("Posting on Snapchat", danielSharing);
    }
}
