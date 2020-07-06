/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author tung.pham
 */
public class LoginAction extends ActionSupport {

    String userid, pass;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

   
    
    
  

    @Override
    public String execute() {        
        if (userid.equals(pass)) {
            return "SUCCESS";
        } else {
            this.addFieldError("loginresponse", "invalid userid or password!");
            return "ERROR";
        }
    }
    
     @Override
    public void validate() {
        if (userid.length() < 1) {
            this.addFieldError("userid", "userid cannot be empty!");
        }
        if (pass.length() < 3) {
            this.addFieldError("pass", "password length should be over 3");
        }
    }

}
