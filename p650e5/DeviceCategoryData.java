package p650e5;

import android.content.Context;
import android.text.TextUtils;
import p665f5.DeviceCategoryTag;
import p738j5.C37294f;

/* renamed from: e5.c */
/* loaded from: classes6.dex */
public class DeviceCategoryData extends BaseTagData<DeviceCategoryTag, String> {
    public DeviceCategoryData(DeviceCategoryTag deviceCategoryTag) {
        super(deviceCategoryTag, "");
    }

    /* renamed from: c */
    public static DeviceCategoryData m25497c(Context context) {
        String m18530f = C37294f.m18530f(context);
        if (TextUtils.isEmpty(m18530f)) {
            return new DeviceCategoryData(DeviceCategoryTag.UNSET);
        }
        if (C37294f.m18527i(context)) {
            return new DeviceCategoryData(DeviceCategoryTag.TABLET, m18530f);
        }
        return new DeviceCategoryData(DeviceCategoryTag.MOBILE, m18530f);
    }

    public DeviceCategoryData(DeviceCategoryTag deviceCategoryTag, String str) {
        super(deviceCategoryTag, str);
    }
}
