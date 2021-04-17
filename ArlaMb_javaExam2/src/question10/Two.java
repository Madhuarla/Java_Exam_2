/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author Madhu Babu Arla <your.name at your.org>
 */
public class Two extends One {

    public Two() {
        super(11);
    }

    public int guess(int x) {
        System.out.println("Two guess " + x);
        return super.guess(x) + 10;
    }

}
