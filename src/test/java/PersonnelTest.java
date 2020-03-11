import com.elgo.CompositePersonnel;
import com.elgo.Personnel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonnelTest {
    Personnel perso1;
    Personnel perso2;
    Personnel perso3;
    Personnel perso4;

    CompositePersonnel grp1;
    CompositePersonnel grp2;
    CompositePersonnel grp3;

    @Before
    public void setup() {

        perso1= new Personnel
                .Builder("Derra", "Abdoul", 1).build();

        perso3= new Personnel
                .Builder("David", "Tiers", 4).build();

        perso4= new Personnel
                .Builder("Tom", "Billyeu", 6).build();

        perso2= new Personnel
                .Builder("Cerise", "Pom", 7).build();



        grp1 = new CompositePersonnel(3);
        grp2 = new CompositePersonnel(1);
        grp3 = new CompositePersonnel(2);


    }

    @Test
    public void test() {

        grp1.add(perso1);
        grp1.add(grp2);

        grp2.add(grp3);
        grp2.add(perso3);

        grp3.add(perso4);
        grp3.add(perso2);

        grp1.print();
    }

}