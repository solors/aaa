package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.da */
/* loaded from: classes8.dex */
public final class C30155da {
    /* renamed from: a */
    public static final boolean m34982a(@Nullable Context context) {
        return (context == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    @ChecksSdkIntAtLeast(parameter = 0)
    /* renamed from: a */
    public static final boolean m34983a(int i) {
        return Build.VERSION.SDK_INT >= i;
    }
}
