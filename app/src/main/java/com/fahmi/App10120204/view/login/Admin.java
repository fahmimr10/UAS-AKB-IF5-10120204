/**
 * Nim : 10120204
 * Nama : Fahmi Muhamad Romdoni
 * Kelas : IF 5
 */
package com.fahmi.App10120204.view.login;

public class Admin {
    public String username;
    public String email;

    public Admin() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Admin(String username, String email) {
        this.username = username;
        this.email = email;
    }

}
