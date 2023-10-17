package assets;
public class loginUser {

    String email;
    String pass;
    String type;

    public loginUser (String email, String pass, String type){
        this.email = email;
        this.pass = pass;
        this.type = type;
    }

    public String getEmail(){
        return email;
    }

    public String getPass(){
        return pass;
    }

    public String getType(){
        return type;
    }
    
}
