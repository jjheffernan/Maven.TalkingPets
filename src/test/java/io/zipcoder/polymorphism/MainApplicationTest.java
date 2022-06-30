package io.zipcoder.polymorphism;

import org.junit.Test;

public class MainApplicationTest {
@Test
    public void testMe(){
    // Given
    String name = "Leon";
    Integer age = 25;
    Person leon = new Person(name, age);

// When
    String getNameResult = leon.getName();
    Integer getAgeResult = leon.getAge();

// Then
    Assert.assertEquals(name, getNameResult);
    Assert.assertEquals(age, getAgeResult);

}
}
