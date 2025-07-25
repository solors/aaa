package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* renamed from: io.appmetrica.analytics.impl.O9 */
/* loaded from: classes9.dex */
public abstract class AbstractC34108O9 {
    /* renamed from: a */
    public final C34132P9 m22380a(@NonNull FeatureInfo featureInfo) {
        if (featureInfo.name == null) {
            int i = featureInfo.reqGlEsVersion;
            if (i == 0) {
                return mo22379b(featureInfo);
            }
            boolean z = true;
            if ((featureInfo.flags & 1) == 0) {
                z = false;
            }
            return new C34132P9("openGlFeature", i, z);
        }
        return mo22379b(featureInfo);
    }

    /* renamed from: b */
    public abstract C34132P9 mo22379b(FeatureInfo featureInfo);
}
