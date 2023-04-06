package lesson6.task3;

public class Programmer extends Person {
    private String companyName;

    public void  code(){
        System.out.println("coding");
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void learn() {
        super.learn();
    }
}
