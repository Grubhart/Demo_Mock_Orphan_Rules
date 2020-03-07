package org.grubhart.demoOrphanRule;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExternalObjectWithOrphanRuleTest {


    @Test
    public void testEvenNumber(){

        ExternalObjectWithOrphanRule tested = new ExternalObjectWithOrphanRule();

        assertEquals(3,tested.getSomething(4));

    }

    @Test
    public void testOddNumber(){

        ExternalObjectWithOrphanRule tested = new ExternalObjectWithOrphanRule();

        assertEquals(5,tested.getSomething(5));

    }

}
