package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import android.os.Build;

/* renamed from: com.fyber.inneractive.sdk.config.cellular.e */
/* loaded from: classes4.dex */
public abstract class AbstractC14340e {
    /* renamed from: a */
    public static AbstractC14339d m77980a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return new C14338c(context);
        }
        return new C14342g(context);
    }
}
