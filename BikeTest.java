//OKOROAFOR OZIOMA ASSIGNMENT 18/7/2021

package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    @BeforeEach
    public void startWithThis(){
        bajaj = new Bike();
    }
    private Bike bajaj;

    @Test
    public void testThatBikeCanComeOn(){
        //given
        bajaj.isSwitchedOn(false);
        //when
        bajaj.isSwitchedOn(true);
        //check
        assertTrue(true);
    }

    @Test
    public void testThatBikeCanComeOff(){
        //given
        bajaj.isSwitchedOn(true);
        //when
        bajaj.isSwitchedOn(false);
        //check
        assertTrue(true);
    }

    @Test
    public  void testThatBikeCanBeAccelerated(){
        //given
        bajaj.isSwitchedOn(true);
        bajaj.setAcceleration(5);
        //when
        bajaj.changeAcceleration(+1);
        bajaj.changeAcceleration(+1);
        bajaj.changeAcceleration(+1);
        bajaj.changeAcceleration(+1);
        bajaj.changeAcceleration(+1);
        bajaj.changeAcceleration(+1);
        //check
        assertEquals(11, bajaj.displayAcceleration());
    }

    @Test
    public void testThatBikeCanBeDeccelerated(){
        //given
        bajaj.isSwitchedOn(true);
        bajaj.setAcceleration(12);
        //when
        bajaj.changeAcceleration(-1);
        bajaj.changeAcceleration(-1);
        bajaj.changeAcceleration(-1);
        bajaj.changeAcceleration(-1);
        //check
        assertEquals(8, bajaj.displayAcceleration());
}
    @Test
    public void testThatGearAcceleratesAutomatically(){
        //given
        bajaj.isSwitchedOn(true);
        bajaj.setGearLevel(0);
        //when
        bajaj.setGearLevel(32);
        //check
        assertEquals(3, bajaj.displayNextGear());



    }
    @Test
    public void testThatGearDeceleratesAutomatically(){
        //given
        bajaj.isSwitchedOn(true);
        bajaj.setGearLevel(43);
        //when
        bajaj.setGearLevel(2);
        //check
        assertEquals(1, bajaj.displayNextGear());
    }

}