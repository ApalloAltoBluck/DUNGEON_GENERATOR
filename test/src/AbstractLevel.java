import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import org.junit.Assert;
import org.junit.Test;

public class AbstractLevel {
  Tile exampleTileOne = new Tile();

  @Test
  public void firstTest() {
    exampleTileOne.generateNextRoom();

    assertSame(exampleTileOne, new Tile());
  }
}