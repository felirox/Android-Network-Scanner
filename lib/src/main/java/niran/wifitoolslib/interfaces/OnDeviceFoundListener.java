package niran.wifitoolslib.interfaces;

import java.util.List;

import niran.wifitoolslib.DeviceFinder;
import niran.wifitoolslib.models.DeviceItem;

public interface OnDeviceFoundListener {
    void onStart(DeviceFinder deviceFinder);
    void onFinished(DeviceFinder deviceFinder, List<DeviceItem> deviceItems);
    void onFailed(DeviceFinder deviceFinder, int errorCode);
}
