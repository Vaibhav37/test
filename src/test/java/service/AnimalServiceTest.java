package service;

import domain.Animal;
import domain.Cat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnimalServiceTest {
    private AnimalService service;
    Animal catMock;

    @Before
    public void setUp() throws Exception {
        catMock = mock(Cat.class);
        service = new AnimalService(catMock);
    }

    @Test
    public void TestBla() {
        String expected = "Running";
        when(catMock.move()).thenReturn("Running");
        String actual = service.moveAnimal();
        Assert.assertEquals(expected, actual);
    }
}
