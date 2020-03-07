package org.grubhart.demoOrphanRule;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestOrphanRules {

    @Mock
    private ExternalObjectWithOrphanRule external;

    @InjectMocks
    private LegacyObject legacyObject;


    /*
    after changes on External object method: when(external.getSomething(4)).thenReturn(4);
    is an orphan rule but since mock rules are "hardcoded" we cannot know this
    rule is invalid
    */

    @Test
    public void testOrphanRule(){

        LegacyObject legacy = new LegacyObject(external);
        when(external.getSomething(4)).thenReturn(4);


        int returnValue = legacy.legacyMethod(4);

        assertEquals(0,returnValue);
    }

}
