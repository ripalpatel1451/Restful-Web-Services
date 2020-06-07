package org.learn.java;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.IsNot.not;
public class StringModifierTest
{
    @Test
    public void replaceAllA()
    {
        String testString = "all is well";
        String returnedString = new StringModifier().replaceAllA(testString);
        assertThat(returnedString, not(containsString("a")));
    }
}
