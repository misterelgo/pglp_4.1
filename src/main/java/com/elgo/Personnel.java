package com.elgo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Personnel implements InterfacePersonnel{
    //Necessary params for personnel
    private  String nom;
    private  String prenom;
    private  int id;//new

    //optional params for personnel
    private  LocalDate dateDeNaissance;
    private  ArrayList<Integer> numTel;

    public Personnel(String nom, String prenom, int id, LocalDate dateDeNaissance, ArrayList<Integer> numTel) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
        this.dateDeNaissance = dateDeNaissance;
        this.numTel = numTel;
    }

    @Override
    public String toString() {
        return "Personnel: " +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", id=" + id +
                ", dateDeNaissance=" + dateDeNaissance +
                ", numTel=" + numTel;
    }

    @Override
    public void print() {
        System.out.println(
                "Personnel: " +
                        "nom='" + nom + '\'' +
                        ", prenom='" + prenom + '\'' +
                        ", id=" + id +
                        ", dateDeNaissance=" + dateDeNaissance +
                        ", numTel=" + numTel
        );
    }
}
