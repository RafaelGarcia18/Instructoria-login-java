/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Users;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafael
 */
public class Credentials {

    private final List<Users> ejemploLista;

    public Credentials() {
        this.ejemploLista = new ArrayList<>();
        this.ejemploLista.add(new Users("ge17001@ues.edu.sv", "1234"));
        this.ejemploLista.add(new Users("ge18002@ues.edu.sv", "5498"));
        this.ejemploLista.add(new Users("ge18003@ues.edu.sv", "9012"));
        this.ejemploLista.add(new Users("ge18004@ues.edu.sv", "progra2"));
        this.ejemploLista.add(new Users("ge18005@ues.edu.sv", "Holamundo"));
    }

    public boolean verify(String user, String password) {

        for (Users users : ejemploLista) {
            if (users.getUser().equals(user) && users.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public List<Users> getUsers() {
        return this.ejemploLista;
    }
}
