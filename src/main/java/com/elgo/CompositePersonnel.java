package com.elgo;

import java.util.ArrayList;

public class CompositePersonnel implements PersonnelInterface {

    private int IDgrp;
    private ArrayList<PersonnelInterface> grpPerso=new ArrayList<PersonnelInterface>();

    public CompositePersonnel(int IDgrp) {
        this.IDgrp=IDgrp;
    }

    public void add(PersonnelInterface perso) {
        this.grpPerso.add(perso);
    }

    public void remove(Personnel perso) {
        this.grpPerso.remove(perso);
    }



    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("le Id du groupe est : "+this.IDgrp);
        for(PersonnelInterface perso : grpPerso) {
            perso.print();
        }
    }
}
