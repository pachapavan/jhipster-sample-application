package com.mycompany.myapp.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.myapp.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class BadgeTypeTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(BadgeType.class);
        BadgeType badgeType1 = new BadgeType();
        badgeType1.setId(1L);
        BadgeType badgeType2 = new BadgeType();
        badgeType2.setId(badgeType1.getId());
        assertThat(badgeType1).isEqualTo(badgeType2);
        badgeType2.setId(2L);
        assertThat(badgeType1).isNotEqualTo(badgeType2);
        badgeType1.setId(null);
        assertThat(badgeType1).isNotEqualTo(badgeType2);
    }
}
