public class Tile extends AbstractBlock {
  AbstractBlock top;
  AbstractBlock bottom;
  AbstractBlock right;
  AbstractBlock left;

  public Tile(AbstractBlock top, AbstractBlock bottom, AbstractBlock right, AbstractBlock left) {
    this.left = left;
    this.right = right;
    this.top = top;
    this.bottom = bottom;
  }
  public Tile() {
    this.left = new Edge();
    this.right = new Edge();
    this.top = new Edge();
    this.bottom = new Edge();
  }

  public AbstractBlock generateNextRoom() {
    Tile output = new Tile();
    switch ((int)Math.round(Math.random() * 3) + 1) {
      case 1:
        System.out.println(1);
        this.top = new Tile();
        break;
      case 2:
        System.out.println(2);
        this.bottom = new Tile();

        break;
      case 3:
        System.out.println(3);
        this.right = new Tile();
        break;
      case 4:
        System.out.println(4);
        this.left = new Tile();
        break;
    }
    return output;
  }



}
