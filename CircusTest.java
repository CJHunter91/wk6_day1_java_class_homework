import static org.junit.Assert.assertEquals;
import org.junit.*;

class CircusTest{
  Circus circus;
  Person person;
  CircusQueue queue;

  @Before
  public void before(){
    circus = new Circus();
    person = new Person("Chris");
    queue = new CircusQueue();
  }

  @Test
  public void testGetName(){
    assertEquals("Chris", person.getName());
  }
}