package io.zipcoder.polymorphism;

import org.junit.*;


public class MainApplicationTest {
@Test
    public void testMe(){
    // Given
    String name = "Leon";
    String type = "cat";
    Pet lion = new Pet();

// When
    String getNameResult = lion.getName(name);
    String getTypeResult = lion.getType(type);

// Then
    Assert.assertEquals(name, getNameResult);
    Assert.assertEquals(type, getTypeResult);

}
}
