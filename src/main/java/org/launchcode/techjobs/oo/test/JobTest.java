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

  assertFalse(1==1);
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
   String expectedJobDetails ="\nid:5\n" +
           "name: Ice cream tester\n" +
           "employer: XYZ Company\n" +
           "location: Home\n" +
           "positionType: UX\n" +
           "coreCompetency: Tasting ability\n";

  assertEquals(expectedJobDetails, job.toString());

 }
 @Test
  public void testToStringHandlesEmptyField(){
     Job job1 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
     assertEquals("", job1.getEmployer().toString());
     Job job2 = new Job("Ice cream tester", new Employer("XYZ Company"), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
     String jobItems = job2.toString();
     assertEquals(jobItems, job2.toString());
 }
}
