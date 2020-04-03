/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author fabit
 */
@Stateless
public class calc implements calcLocal {

    @Override
    public Integer addition(int a, int b) {
        return (a+b);
    }

    @Override
    public Integer subtraction(int a, int b) {
        return (a-b);
    }

    @Override
    public Integer multiplication(int a, int b) {
        return (a*b);
    }

    @Override
    public Integer split(int a, int b) {
        return (a/b);
    } 
}
