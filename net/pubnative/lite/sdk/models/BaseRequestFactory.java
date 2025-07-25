package net.pubnative.lite.sdk.models;

import java.util.List;
import java.util.TimeZone;
import net.pubnative.lite.sdk.DeviceInfo;
import net.pubnative.lite.sdk.models.bidstream.DeviceExtension;
import net.pubnative.lite.sdk.models.bidstream.Extension;
import net.pubnative.lite.sdk.models.bidstream.Signal;

/* loaded from: classes10.dex */
public class BaseRequestFactory {
    /* JADX INFO: Access modifiers changed from: protected */
    public DeviceExtension fillBidStreamExtensionsObject(DeviceInfo deviceInfo) {
        Integer num = null;
        if (deviceInfo == null) {
            return null;
        }
        List<String> inputLanguages = deviceInfo.getInputLanguages();
        Integer isBatteryCharging = deviceInfo.isBatteryCharging();
        Integer batteryLevel = deviceInfo.getBatteryLevel();
        Integer isPowerSaveMode = deviceInfo.isPowerSaveMode();
        Integer freeMemoryMb = deviceInfo.getFreeMemoryMb();
        Integer totalMemoryMb = deviceInfo.getTotalMemoryMb();
        Integer isDarkMode = deviceInfo.isDarkMode();
        Integer isHeadsetOn = deviceInfo.isHeadsetOn();
        if (deviceInfo.getSoundSetting() != null) {
            try {
                num = Integer.valueOf(Integer.parseInt(deviceInfo.getSoundSetting()));
            } catch (Exception unused) {
            }
        }
        return new DeviceExtension(inputLanguages, isBatteryCharging, batteryLevel, isPowerSaveMode, freeMemoryMb, totalMemoryMb, isDarkMode, deviceInfo.isDndEnabled(), deviceInfo.isAirplaneModeEnabled(), isHeadsetOn, num);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Signal fillExtensionsObject(DeviceInfo deviceInfo) {
        Integer num = null;
        if (deviceInfo == null) {
            return null;
        }
        List<String> inputLanguages = deviceInfo.getInputLanguages();
        Integer isBatteryCharging = deviceInfo.isBatteryCharging();
        Integer batteryLevel = deviceInfo.getBatteryLevel();
        Integer isPowerSaveMode = deviceInfo.isPowerSaveMode();
        Integer freeMemoryMb = deviceInfo.getFreeMemoryMb();
        Integer totalMemoryMb = deviceInfo.getTotalMemoryMb();
        Integer isDarkMode = deviceInfo.isDarkMode();
        Integer isHeadsetOn = deviceInfo.isHeadsetOn();
        if (deviceInfo.getSoundSetting() != null) {
            try {
                num = Integer.valueOf(Integer.parseInt(deviceInfo.getSoundSetting()));
            } catch (Exception unused) {
            }
        }
        return new Extension(inputLanguages, isBatteryCharging, batteryLevel, isPowerSaveMode, freeMemoryMb, totalMemoryMb, isDarkMode, deviceInfo.isDndEnabled(), deviceInfo.isAirplaneModeEnabled(), isHeadsetOn, num);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Integer formatUTCTime() {
        return Integer.valueOf(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 60000);
    }
}
