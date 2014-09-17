/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mi.core;

/**
 *
 * @author WKing0606 <WKing0606@gmail.com>
 */
public class MiAccount {
    private boolean isLogin;
    private String name;
    private String pw;
    
    public boolean login(){
        if (isLogin)
            return isLogin;
        
        isLogin = _login();
        return isLogin;
    }
    
    
    private boolean _login(){
        return false;
    }
    
    
    public static void main(String[] args){
 
    }
}
