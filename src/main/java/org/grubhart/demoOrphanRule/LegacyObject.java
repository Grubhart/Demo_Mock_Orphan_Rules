package org.grubhart.demoOrphanRule;

public class LegacyObject {

    ExternalObjectWithOrphanRule external;

    public LegacyObject(ExternalObjectWithOrphanRule external) {
        this.external = external;
    }

    public int legacyMethod(int i) {

        //do something

        int inportantVar = external.getSomething(i);

        // do more important things with spaghetti code

        return 0;

    }
}
