package com.kodilla.patterns.strategy.social;

public final class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Posting on Facebook";
    }
}
