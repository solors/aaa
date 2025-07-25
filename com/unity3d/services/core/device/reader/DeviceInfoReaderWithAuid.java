package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.Device;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DeviceInfoReaderWithAuid.kt */
@Metadata
/* loaded from: classes7.dex */
public final class DeviceInfoReaderWithAuid implements IDeviceInfoReader {
    @NotNull
    private final IDeviceInfoReader _deviceInfoReader;

    public DeviceInfoReaderWithAuid(@NotNull IDeviceInfoReader _deviceInfoReader) {
        Intrinsics.checkNotNullParameter(_deviceInfoReader, "_deviceInfoReader");
        this._deviceInfoReader = _deviceInfoReader;
    }

    @Override // com.unity3d.services.core.device.reader.IDeviceInfoReader
    @NotNull
    public Map<String, Object> getDeviceInfoData() {
        Map<String, Object> deviceInfoData = this._deviceInfoReader.getDeviceInfoData();
        Intrinsics.checkNotNullExpressionValue(deviceInfoData, "_deviceInfoReader.deviceInfoData");
        String auid = Device.getAuid();
        if (auid != null) {
            deviceInfoData.put("auid", auid);
        }
        return deviceInfoData;
    }
}
