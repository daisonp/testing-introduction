package org.daisonp.testingexamples;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	AnnotationsTest.class,
	AssertionTests.class
})
public class TestSuite {}
