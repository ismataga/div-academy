package lesson11.programigAndTecnno;

public class Language implements ServiceLanguage{
  private int id;
  private String name;

  Language[] languages;



  public Language(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void remove(long id) {

  }

  @Override
  public Language getById(long id) {

    return language;

  }

  @Override
  public Language[] getAll() {
    return languages;
  }

  @Override
  public String toString() {
    return "Language{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
