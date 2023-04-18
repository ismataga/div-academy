package lesson11.interfaceTap;

public class Data {
  private int id;
  private String data;
  private int size;

  public Data(int id, String data, int size) {
    this.id = id;
    this.data = data;
    this.size = size;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return "Data{" +
        "id=" + id +
        ", data='" + data + '\'' +
        ", size=" + size +
        '}';
  }
}
