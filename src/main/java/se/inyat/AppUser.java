package se.inyat;

import java.util.Objects;

public class AppUser {
    private String username;
    private String password;
    private AppRole role;

    //Constrotor

    public AppUser(String username, String password, AppRole role) {
        setUsername(username);
        setPassword(password);
        setRole(role);
    }

    //Getter and Setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (role == null) {
            throw new IllegalArgumentException(("Role cannot be null"));
        }
        this.role = role;
    }

    //Methods
    //override toString() to exclude password
    @Override
    public String toString(){
        return "AppUser{" + "username='" + username+ '\'' + ", role=" + role + '}';

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AppUser)) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(getUsername(), appUser.getUsername()) && Objects.equals(getPassword(), appUser.getPassword()) && getRole() == appUser.getRole();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getPassword(), getRole());
    }
}
