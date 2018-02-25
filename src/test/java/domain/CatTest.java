package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CatTest {
    private Cat sleepingCat;
    private Cat hungryCat;
    private Cat stateLessCat;
    private String SLEEPING_STATE = "sleeping";
    private String HUNGRY_STATE = "hungry";

    @Before
    public void setUp() throws Exception {
        sleepingCat = new Cat(SLEEPING_STATE);
        hungryCat = new Cat(HUNGRY_STATE);
        stateLessCat = new Cat();
    }

    @Test
    public void TestEatWhenCatIsSleepingRetunrsSleepingResponse() {
        String expectedResponse = "I can't eat, I'm sleeping";
        String actualResponse = sleepingCat.eat();
        Assert.assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void TestEatWhenCatIsHungryReturnsEatingStatus() {
        String expectedResponse = "Yayyy!, I got food";
        String actualResponse = hungryCat.eat();
        Assert.assertEquals(expectedResponse, actualResponse);
    }

    @Test
    public void TestEatWhenCatIsStateLessReturnsEmptyString() {
        String expectedResponse = "";
        String actualResponse = stateLessCat.eat();
        Assert.assertEquals(expectedResponse, actualResponse);
    }
}
