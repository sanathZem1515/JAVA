public class Student {
    private final int id;
    private final String name;
    private final int age;
    private final String gender;
    private final String engDepartment;
    private final int yearOfEnrollment;
    private final double perTillDate;


    public Student(int id,String name,int age,String gender,String engDepartment,int yearOfEnrollment,double perTillDate){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.yearOfEnrollment=yearOfEnrollment;
        this.perTillDate=perTillDate;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getDept(){
        return engDepartment;
    }
    public int getYearOfEnrollment(){
        return yearOfEnrollment;
    }
    public double getPerTillDate(){
        return perTillDate;
    }
}