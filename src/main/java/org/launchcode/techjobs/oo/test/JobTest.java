package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)

public class JobTest {
@Test

public void testSettingJobId(){
  Job job1 = new Job();
  Job job2 = new Job();
  assertNotEquals(job1.getId(),job2.getId());
}
@Test
public void testJobConstructorSetsAllFields(){

  Job job = new Job("Ice cream tester", new Employer("XYZ Company"), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));

  assertTrue(job.getName() != "");
  assertTrue(job.getEmployer().toString() != "");
  assertTrue(job.getLocation().toString() != "");
  assertTrue(job.getPositionType().toString() != "");
  assertTrue(job.getCoreCompetency().toString() != "");

  assertEquals("Ice cream tester", job.getName());
  assertEquals("XYZ Company", job.getEmployer().toString());
  assertEquals("Home", job.getLocation().toString());
  assertEquals("UX", job.getPositionType().toString());
  assertEquals("Tasting ability", job.getCoreCompetency().toString());
}

@Test
public void testJobsForEquality(){
    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));

    assertFalse(job1 == job2);
}
  @Test
public void testToStringStartsAndEndsWithNewLine(){
  Job job = new Job("Ice cream tester", new Employer("XYZ Company"), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
  char firstChar = job.toString().charAt(0);
  char lastChar = job.toString().charAt(job.toString().length()-1);
  assertEquals('\n',firstChar);
  assertEquals('\n',lastChar)
  ;
}
@Test
 public void testToStringContainsCorrectLabelsAndData(){
   Job job = new Job("Ice cream tester", new Employer("XYZ Company"), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
   String jobDetails = job.toString();
   String expectedJobDetails ="\nID: " + job.getId()+"\n" +
           "Name: Ice cream tester\n" +
           "Employer: XYZ Company\n" +
           "Location: Home\n" +
           "Position Type: UX\n" +
           "Core Competency: Tasting ability\n";

  assertEquals(expectedJobDetails, job.toString());

 }
 @Test
  public void testToStringHandlesEmptyField(){
     Job jobWithEmptyField = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));

     String expectedJobDetails ="\nID: " + jobWithEmptyField.getId()+"\n" +
             "Name: Ice cream tester\n" +
             "Employer: Data not available\n" +
             "Location: Home\n" +
             "Position Type: UX\n" +
             "Core Competency: Tasting ability\n";

     assertEquals(expectedJobDetails, jobWithEmptyField.toString());

 }
}
