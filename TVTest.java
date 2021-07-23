//OKOROAFOR OZIOMA ASSIGNMENT 18/7/2021

package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVTest {
    @BeforeEach
    public void startWithThis(){
        lg = new TV();
    }
    private TV lg;

    @Test
    public void testOn(){
        //given
        lg.on(false);
        // when
    lg.on(true);
        //check
        assertTrue(true);
    }

    @Test
   public void testOff(){
        lg.on(true);
        assertTrue(true);
        lg.on(false);
        assertFalse(lg.returnOnOff());
    }

    @Test
    public void testThatChannelCanBeChanged() {
        //given
        lg.on(true);
        //when
        lg.changeChannelIncrementally(+1);
        //check
        assertEquals(2, lg.displayChannel());
    }

    @Test
    public void testThatChannelCanBeSet(){
            //given
            lg.on(true);
            //when
            lg.setCurrentChannel(99);
            //check
            assertTrue(true);
    }

    @Test
    public void testThatNinetyNineIsMaximum(){
        //given
        lg.on(true);
        lg.setCurrentChannel(99);
        //when
        lg.changeChannelIncrementally(+1);
        //check
        assertEquals(1, lg.displayChannel());
    }

    @Test
    public void testThatOneIsMinimum(){
        //given
        lg.on(true);
        lg.setCurrentChannel(1);
        //when
        lg.changeChannelDecrementally(-1);
        //check
        assertEquals(1, lg.displayChannel());
    }

    @Test
    public  void testThatVolumeCanBeIncreased(){
        //given
        lg.on(true);
        lg.setCurrentChannel(12);
        //when
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        //check
        assertEquals(17,lg.displayVolume());
    }

    @Test
    public  void testThatVolumeCanBeDecreased(){
        //given
        lg.on(true);
        lg.setCurrentChannel(15);
        //when
        lg.decreaseVolume();
        //check
        assertEquals(9,lg.displayVolume());
    }

    @Test
    public void testThatTwentyFiveIsMaxVolume(){
        //given
        lg.on(true);
        lg.setCurrentChannel(30);
        //when
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        lg.increaseVolume();
        //check
        assertEquals(25, lg.displayVolume());
    }

    @Test
    public  void  testThatOneIsMinVolume(){
        //given
        lg.on(true);
        lg.setCurrentChannel(42);
        //when
        lg.decreaseVolume();
        lg.decreaseVolume();
        lg.decreaseVolume();
        lg.decreaseVolume();
        lg.decreaseVolume();
        lg.decreaseVolume();
        lg.decreaseVolume();
        lg.decreaseVolume();
        lg.decreaseVolume();
        lg.decreaseVolume();
        //check
        assertEquals(0, lg.displayVolume());
    }
}