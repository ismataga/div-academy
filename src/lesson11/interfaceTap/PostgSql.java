package lesson11.interfaceTap;

public class PostgSql implements BazaIleElaqedarIsler {

  @Override
  public void add(Data data) {
    System.out.println("postgre add etdi");
  }

  @Override
  public void remove(int id) {

  }

  @Override
  public Data getById(int id) {
    return null;
  }

  @Override
  public Data[] getAll() {
    return new Data[0];
  }
}
