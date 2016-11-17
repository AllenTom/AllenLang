package com.allen.allenlang.Test;

import com.allen.allenlang.Lexer;
import com.allen.allenlang.ParseException;
import com.allen.allenlang.token.Token;

/**
 * Created by Allen on 2016/11/17.
 */
public class MainTest {

    public static void main(String[] args) throws ParseException {
        Lexer l = new Lexer(new CodeDialog());
        for (Token t; (t = l.read()) != Token.EOF; ){
            System.out.println("=> " + t.getText());

        }
    }

}
