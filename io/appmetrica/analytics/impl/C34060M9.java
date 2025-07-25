package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.M9 */
/* loaded from: classes9.dex */
public final class C34060M9 extends AbstractC34108O9 {
    @Override // io.appmetrica.analytics.impl.AbstractC34108O9
    @TargetApi(24)
    /* renamed from: b */
    public final C34132P9 mo22379b(@NonNull FeatureInfo featureInfo) {
        String str = featureInfo.name;
        int i = featureInfo.version;
        boolean z = true;
        if ((featureInfo.flags & 1) == 0) {
            z = false;
        }
        return new C34132P9(str, i, z);
    }
}
