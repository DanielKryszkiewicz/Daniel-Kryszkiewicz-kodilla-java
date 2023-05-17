package com.kodilla.stream.forumuser;
import com.kodilla.stream.forumuser.Forum;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public final class ForumUser {

    private final int UserId;
    private final String name;
    private final char gender;
    private final LocalDate birthDate;
    private final int postCount;

    public ForumUser(int userId, String name, char gender, LocalDate birthDate, int postCount) {
        this.UserId = userId;
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.postCount = postCount;
    }

    public int getUserId() {
        return UserId;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (UserId != forumUser.UserId) return false;
        if (gender != forumUser.gender) return false;
        if (postCount != forumUser.postCount) return false;
        if (!Objects.equals(name, forumUser.name)) return false;
        return Objects.equals(birthDate, forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        int result = UserId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) gender;
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + postCount;
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "UserId=" + UserId +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", postCount=" + postCount +
                '}';
    }
}
