package com.mycompany.myapp.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.mycompany.myapp.web.rest.TestUtil;

public class StaffSalaryTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(StaffSalary.class);
        StaffSalary staffSalary1 = new StaffSalary();
        staffSalary1.setId(1L);
        StaffSalary staffSalary2 = new StaffSalary();
        staffSalary2.setId(staffSalary1.getId());
        assertThat(staffSalary1).isEqualTo(staffSalary2);
        staffSalary2.setId(2L);
        assertThat(staffSalary1).isNotEqualTo(staffSalary2);
        staffSalary1.setId(null);
        assertThat(staffSalary1).isNotEqualTo(staffSalary2);
    }
}
