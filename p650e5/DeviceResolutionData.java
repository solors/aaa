package p650e5;

import android.content.Context;
import p665f5.DeviceResolutionTag;
import p738j5.C37294f;

/* renamed from: e5.d */
/* loaded from: classes6.dex */
public class DeviceResolutionData extends BaseTagData<DeviceResolutionTag, Integer> {
    public DeviceResolutionData(DeviceResolutionTag deviceResolutionTag) {
        super(deviceResolutionTag, 0);
    }

    /* renamed from: c */
    public static DeviceResolutionData m25496c(Context context) {
        int m18531e = C37294f.m18531e(context);
        if (m18531e < 0) {
            return new DeviceResolutionData(DeviceResolutionTag.UNSET);
        }
        if (m18531e <= 320) {
            return new DeviceResolutionData(DeviceResolutionTag.LOW, Integer.valueOf(m18531e));
        }
        if (m18531e <= 720) {
            return new DeviceResolutionData(DeviceResolutionTag.MEDIUM, Integer.valueOf(m18531e));
        }
        if (m18531e <= 1080) {
            return new DeviceResolutionData(DeviceResolutionTag.HIGH, Integer.valueOf(m18531e));
        }
        return new DeviceResolutionData(DeviceResolutionTag.ULTRA_HIGH, Integer.valueOf(m18531e));
    }

    public DeviceResolutionData(DeviceResolutionTag deviceResolutionTag, Integer num) {
        super(deviceResolutionTag, num);
    }
}
