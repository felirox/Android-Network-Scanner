# Network Scanning Application
## _Bseline App developed for showing the implentation of network scanning in Android_

## Download
##### The Application APK file can be [downloaded from here](https://github.com/felirox/Android-Network-Scanner/releases/tag/v1.0)

## Development:

- Kotlin along with Android Studio was utilized for developing. 
- Additional help from multiple websites and repos were taken for developing the same.
### Packages used:

```sh
androidx.appcompat.app.AppCompatActivity;
android.os.Bundle;
android.widget.ArrayAdapter;
android.widget.ListView;
android.widget.Toast;
java.util.ArrayList;
java.util.List;
niran.wifitoolslib.DeviceFinder;
niran.wifitoolslib.interfaces.OnDeviceFoundListener;
niran.wifitoolslib.models.DeviceItem;
```
> A simple XML template with ListView was used to display the Scanned Devices
## Features

- Second Counter for detecting the total time taken to scan
- An exception Handler if any error occurs
- We try to scan the following for each detected Device
-- Device Name
-- IP Address
-- MAC Address
-- Vendor Name
- If no details are found, it is returned with "UnKnown"

> This is a base application, so additional features can be added to the same app for improved functionality

## Dependencies

You need Android Studio installed to run the same. You can install it from [here](https://developer.android.com/studio)

Follow the basic installation guideline. 
Once the setup is completed, do not go for creating a new app. Instead, clone this repo and locate it using "Open Project"

The Gradle Build will start executing once you open the project. 
Connect your device Wirelessly or uaing a USB cable, with USB debugging mode enabled. 
You can run the app to view the preview on your Physical or Virtual phone.

### References
Todo

### Acknowledgements
Todo
