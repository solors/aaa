package p989u0;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* renamed from: u0.d */
/* loaded from: classes3.dex */
public enum EnumC44419d {
    ENCRYPTION_EXCEPTION(IronSourceConstants.RV_API_SHOW_CALLED),
    RAW_ONE_DT_ERROR(IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE),
    ONE_DT_PARSE_ERROR(IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE),
    ONE_DT_AUTHENTICATION_ERROR(1103),
    ONE_DT_BROADCAST_ERROR(1104),
    ONE_DT_REQUEST_ERROR(1105),
    ONE_DT_GENERAL_ERROR(1106);
    

    /* renamed from: b */
    int f116585b;

    EnumC44419d(int i) {
        this.f116585b = i;
    }

    /* renamed from: b */
    public final int m3080b() {
        return this.f116585b;
    }
}
