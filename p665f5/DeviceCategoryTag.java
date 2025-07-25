package p665f5;

import com.amazon.device.ads.DTBMetricsConfiguration;

/* renamed from: f5.b */
/* loaded from: classes6.dex */
public enum DeviceCategoryTag implements ITag {
    UNSET("unset"),
    TABLET("tablet"),
    MOBILE(DTBMetricsConfiguration.APSMETRICS_LEVEL2_KEY);
    

    /* renamed from: b */
    private final String f90320b;

    DeviceCategoryTag(String str) {
        this.f90320b = str;
    }

    /* renamed from: b */
    public String m24943b() {
        return this.f90320b;
    }
}
