package com.allen.allenlang;

import com.allen.allenlang.token.Token;

import java.io.IOException;

/**
 * Created by Allen on 2016/11/17.
 */
public class ParseException extends Exception {
    public ParseException(Token t) {
        this("",t);
    }


    public ParseException(String msg ,Token t) {
        super("syntax error around");
    }

    private static String location(Token t){
        if(t == Token.EOF)
            return "The Last Line";
        else
            return "\"" + t.getText() + "\" at lint " + t.getLineNumber();
    }
    public ParseException(IOException e) {
        super(e);
    }
    public ParseException(String msg) {
        super(msg);
    }
}
