package aws.apps.usbDeviceEnumerator.ui.usbinfo.fragments;

import androidx.fragment.app.Fragment;
import aws.apps.usbDeviceEnumerator.ui.usbinfo.fragments.android.InfoFragmentAndroid;
import aws.apps.usbDeviceEnumerator.ui.usbinfo.fragments.linux.InfoFragmentLinux;
import uk.co.alt236.usbdeviceenumerator.sysbususb.SysBusUsbDevice;

public final class FragmentFactory {

    public static Fragment getFragment(String usbKey) {
        return InfoFragmentAndroid.create(usbKey);
    }

    public static Fragment getFragment(SysBusUsbDevice usbDevice) {
        return InfoFragmentLinux.create(usbDevice);
    }
}
