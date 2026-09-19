package br.dev.s2w.jsensors.device.management.domain.repository;

import br.dev.s2w.jsensors.device.management.domain.model.Sensor;
import br.dev.s2w.jsensors.device.management.domain.model.SensorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, SensorId> {
}
