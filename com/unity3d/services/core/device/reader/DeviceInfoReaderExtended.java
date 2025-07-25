package com.unity3d.services.core.device.reader;

import android.webkit.WebSettings;
import com.amazon.device.ads.DtbDeviceData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C21114v8;
import com.maticoo.sdk.utils.log.p406bi.Constants;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.core.configuration.InitRequestType;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes7.dex */
public class DeviceInfoReaderExtended implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;

    public DeviceInfoReaderExtended(IDeviceInfoReader iDeviceInfoReader) {
        this._deviceInfoReader = iDeviceInfoReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        deviceInfoData.put("bundleId", ClientProperties.getAppName());
        deviceInfoData.put("encrypted", Boolean.valueOf(ClientProperties.isAppDebuggable()));
        deviceInfoData.put("rooted", Boolean.valueOf(Device.isRooted()));
        deviceInfoData.put("osVersion", Device.getOsVersion());
        deviceInfoData.put(C21114v8.C21123i.f54153l, Device.getModel());
        deviceInfoData.put("language", Locale.getDefault().toString());
        deviceInfoData.put(C21114v8.C21123i.f54168t, Device.getConnectionType());
        deviceInfoData.put("screenHeight", Integer.valueOf(Device.getScreenHeight()));
        deviceInfoData.put("screenWidth", Integer.valueOf(Device.getScreenWidth()));
        deviceInfoData.put("deviceMake", Device.getManufacturer());
        deviceInfoData.put("screenDensity", Integer.valueOf(Device.getScreenDensity()));
        deviceInfoData.put(DtbDeviceData.DEVICE_DATA_SCREEN_SIZE_KEY, Integer.valueOf(Device.getScreenLayout()));
        deviceInfoData.put("limitAdTracking", Boolean.valueOf(Device.isLimitAdTrackingEnabled()));
        deviceInfoData.put("networkOperator", Device.getNetworkOperator());
        deviceInfoData.put("volume", Integer.valueOf(Device.getStreamVolume(1)));
        deviceInfoData.put("deviceFreeSpace", Long.valueOf(Device.getFreeSpace(ClientProperties.getApplicationContext().getCacheDir())));
        deviceInfoData.put("apiLevel", String.valueOf(Device.getApiLevel()));
        deviceInfoData.put("networkType", Integer.valueOf(Device.getNetworkType()));
        deviceInfoData.put("bundleVersion", ClientProperties.getAppVersion());
        try {
            deviceInfoData.put(RemoteConfigConstants.RequestFieldKey.TIME_ZONE, TimeZone.getDefault().getDisplayName(false, 0, Locale.US));
        } catch (AssertionError e) {
            DeviceLog.error("Could not read timeZone information: %s", e.getMessage());
        }
        deviceInfoData.put("timeZoneOffset", Integer.valueOf(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000));
        try {
            deviceInfoData.put("webviewUa", WebSettings.getDefaultUserAgent(ClientProperties.getApplicationContext()));
        } catch (Exception e2) {
            DeviceLog.exception("Error getting webview user agent", e2);
        }
        deviceInfoData.put("networkOperatorName", Device.getNetworkOperatorName());
        deviceInfoData.put("wiredHeadset", Boolean.valueOf(Device.isWiredHeadsetOn()));
        deviceInfoData.put("versionCode", Integer.valueOf(SdkProperties.getVersionCode()));
        deviceInfoData.put("stores", AndroidStaticDeviceInfoDataSource.STORE_GOOGLE);
        deviceInfoData.put("appStartTime", Long.valueOf(SdkProperties.getInitializationTimeEpoch() / 1000));
        deviceInfoData.put("sdkVersionName", SdkProperties.getVersionName());
        deviceInfoData.put("eventTimeStamp", Long.valueOf(System.currentTimeMillis() / 1000));
        deviceInfoData.put("cpuCount", Long.valueOf(Device.getCPUCount()));
        deviceInfoData.put("usbConnected", Boolean.valueOf(Device.isUSBConnected()));
        deviceInfoData.put("apkDeveloperSigningCertificateHash", Device.getCertificateFingerprint());
        deviceInfoData.put("deviceUpTime", Long.valueOf(Device.getUptime()));
        deviceInfoData.put("deviceElapsedRealtime", Long.valueOf(Device.getElapsedRealtime()));
        deviceInfoData.put("adbEnabled", Device.isAdbEnabled());
        deviceInfoData.put("androidFingerprint", Device.getFingerprint());
        deviceInfoData.put("batteryStatus", Integer.valueOf(Device.getBatteryStatus()));
        deviceInfoData.put(C21114v8.C21123i.f54130Y, Float.valueOf(Device.getBatteryLevel()));
        deviceInfoData.put("networkMetered", Boolean.valueOf(Device.getNetworkMetered()));
        deviceInfoData.put(Constants.KEY_TEST, Boolean.valueOf(SdkProperties.isTestMode()));
        deviceInfoData.put("callType", InitRequestType.TOKEN.getCallType());
        return deviceInfoData;
    }
}
