package lesson11.programigAndTecnno;

public class Technology implements ServiceTecnology{
  private int id1;
  private String name2;


  public Technology(int id, String name) {
    super();
  }

  public Technology(int id, String name, int id1, String name2) {
    super();
    this.id1 = id1;
    this.name2 = name2;
  }

  public int getId1() {
    return id1;
  }

  public void setId1(int id1) {
    this.id1 = id1;
  }

  public String getName2() {
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }

  @Override
  public String toString() {
    return "Technology{" +
        "id1=" + id1 +
        ", name2='" + name2 + '\'' +
        '}';
  }


  @Override
  public void remove(long id) {

  }

  @Override
  public Language getById(long id) {
    return null;
  }

  @Override
  public Language[] getAll() {
    return new Language[0];
  }
}
