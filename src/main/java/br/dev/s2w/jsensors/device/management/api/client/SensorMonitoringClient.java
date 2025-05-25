package br.dev.s2w.jsensors.device.management.api.client;

import br.dev.s2w.jsensors.device.management.api.model.SensorMonitoringOutput;
import io.hypersistence.tsid.TSID;

public interface SensorMonitoringClient {

    void enableMonitoring(TSID sensorId);

    void disableMonitoring(TSID sensorId);

    SensorMonitoringOutput getDetail(TSID sensorId);

}
