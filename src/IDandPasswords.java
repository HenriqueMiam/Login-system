import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("user","abc123");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}
