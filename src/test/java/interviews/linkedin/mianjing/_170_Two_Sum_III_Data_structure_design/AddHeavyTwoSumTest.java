package interviews.linkedin.mianjing._170_Two_Sum_III_Data_structure_design;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AddHeavyTwoSumTest {

  private TwoSum twoSum;

  @BeforeEach
  void setUp() throws Exception {
    twoSum = new AddHeavyTwoSum();
  }

  @Test
  void test1Element() throws Exception {
    twoSum.add(0);
    assertFalse(twoSum.find(0));
  }

  @Test
  void testDuplicatedElements() throws Exception {
    twoSum.add(0);
    twoSum.add(0);
    assertTrue(twoSum.find(0));
  }

  @Test
  void testTwoDistinctElements() throws Exception {
    twoSum.add(0);
    twoSum.add(1);
    assertTrue(twoSum.find(1));
  }

}