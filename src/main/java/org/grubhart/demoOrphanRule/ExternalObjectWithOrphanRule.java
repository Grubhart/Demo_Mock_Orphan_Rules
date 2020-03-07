package org.grubhart.demoOrphanRule;

public class ExternalObjectWithOrphanRule {


    /* OLD version
    public int getSomething(int i) {
        return i;
    }
    */


    //new version only return odd numbers
    public int getSomething(int i) {

        return i%2==1? i: i-1;

    }

}
