package com.elgo;

import java.util.ArrayList;

public class AffichParGroupe {
    protected ArrayList<PersonnelInterface> grp= new ArrayList<PersonnelInterface>();

    public AffichParGroupe (PersonnelInterface grp) {
        this.grp.add(grp);
    }

    /**
     *
     * @author root
     *
     */
    private class groupIterator implements Iterator {
        int index;


        public groupIterator() {
            int verifier=0;
            while(verifier<grp.size()) {
                if(grp.get(verifier) instanceof CompositePersonnel) {
                    CompositePersonnel test=(CompositePersonnel)grp.get(verifier);
                    int i=0;
                    while(i<test.grpPerso.size()) {
                        grp.add(test.grpPerso.get(i));
                        i++;
                    }
                    verifier++;
                }
            }
        }

        /**
         * verifirie s'il y'a des elements dans l'arr
         */
        @Override
        public boolean hasNext() {
            if(index<grp.size())
                return true;
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public Object Next() {
            if(this.hasNext())
                return grp.get(index);
            return null;
        }



    }

    public Iterator getIterator() {
        return new groupIterator();

    }
}
