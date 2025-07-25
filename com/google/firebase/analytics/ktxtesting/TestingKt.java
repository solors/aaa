package com.google.firebase.analytics.ktxtesting;

import androidx.annotation.NonNull;
import com.google.firebase.analytics.AnalyticsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.2 */
@Metadata
/* loaded from: classes4.dex */
public final class TestingKt {
    public static final void withAnalyticsForTest(@NonNull FirebaseAnalytics analytics, @NonNull Functions<Unit> block) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (AnalyticsKt.getLOCK()) {
            FirebaseAnalytics analytics2 = AnalyticsKt.getANALYTICS();
            AnalyticsKt.setANALYTICS(analytics);
            block.invoke();
            AnalyticsKt.setANALYTICS(analytics2);
        }
    }
}
