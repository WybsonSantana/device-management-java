package br.dev.s2w.jsensors.device.management.common;

import io.hypersistence.tsid.TSID;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

class IdGeneratorTest {

    @Test
    @DisplayName("should generate TSID")
    void shouldGenerateTSID() {
        TSID tsid = IdGenerator.generateTSID();

        Assertions.assertThat(tsid.getInstant())
                .isCloseTo(Instant.now(), Assertions.within(1, ChronoUnit.MINUTES));
    }


}