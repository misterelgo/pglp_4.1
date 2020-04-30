package com.elgo;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AffichageParGroupeTest {

    @Test
    public void testIterator() {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(1);
        a1.add(2);
        Personnel p1 = new PersonnelBuilder("DIEYE", "Gora", 1).setDateDeNaissance(2020,9,19).getPersonnel();
        Personnel p2 = new PersonnelBuilder("BOB", "Ibo", 2).setDateDeNaissance(1920,7,12).setNumTel(a1).getPersonnel();
        Personnel p3 = new PersonnelBuilder("SILVER", "Bril", 3).setDateDeNaissance(1998,8,3).setNumTel(a1).getPersonnel();
        Personnel p4 = new PersonnelBuilder("DAVID", "Henry", 4).setDateDeNaissance(2000,7,4).setNumTel(a1).getPersonnel();

        PersonnelComposite composite1 = new PersonnelComposite(1);
        PersonnelComposite composite2 = new PersonnelComposite(2);

        composite1.addPersonnel(p1);
        composite1.addPersonnel(composite2);
        composite2.addPersonnel(p2);
        composite2.addPersonnel(p3);

        AffichageParGroupe personnelsAnnuaire = new AffichageParGroupe(composite1);
        Iterator grouptIter = personnelsAnnuaire.getIterator();
        while (grouptIter.hasNext()) {
            //System.out.println(grouptIter);
            InterfacePersonnel nextelement;
            nextelement = (InterfacePersonnel) grouptIter.Next();
            System.out.println("Next element: " + nextelement.toString());
    }
}
}