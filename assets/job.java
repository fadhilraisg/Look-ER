package assets;

public class job{
    public String Cname;
    public String position;
    public String salary;
    public String location;

    public job (String Cname, String position, String salary, String location){
        this.Cname = Cname;
        this.position = position;
        this.salary = salary;
        this.location = location;

    }

    public String getCname(){
        return Cname;
    }

    public String getPosition(){
    return position;
    }
    public String getSalary(){
    return salary;
    }

    public String getlocation(){
    return location;
    }

}

            