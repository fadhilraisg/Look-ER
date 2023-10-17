package user;
public abstract class user {

    String nama;
    String email; 
    String pass;
    String pass2;
    String type;
    

     user (String nama, String email, String pass, String pass2){
        this.nama = nama;
        this.email = email;
        this.pass = pass;
        this.pass2 = pass2;
    }

    public boolean validationPass(String pass, String pass2){
        if(pass.equals(pass2)){
            return true;
        }else{
            return false;
        }
        
    }

    public String getPass(){
        return pass;
    }

    public String getPass2(){
        return pass2;
    }


}



