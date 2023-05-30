package domain;

import org.junit.platform.suite.api.*;
@Suite
@SuiteDisplayName("JUnit 5 Platform Suite")
@SelectPackages("domain")
@IncludeClassNamePatterns(".*Test")
//@SelectClasses({CircleTest.class, RectangleTest.class})
public class AllUnitTests
{
// the class remains completely empty,
// being used only as a holder for the above annotations
    
}