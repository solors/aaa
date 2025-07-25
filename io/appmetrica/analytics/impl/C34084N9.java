package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.N9 */
/* loaded from: classes9.dex */
public final class C34084N9 extends AbstractC34108O9 {
    @Override // io.appmetrica.analytics.impl.AbstractC34108O9
    /* renamed from: b */
    public final C34132P9 mo22379b(@NonNull FeatureInfo featureInfo) {
        String str = featureInfo.name;
        boolean z = true;
        if ((featureInfo.flags & 1) == 0) {
            z = false;
        }
        return new C34132P9(str, -1, z);
    }
}
