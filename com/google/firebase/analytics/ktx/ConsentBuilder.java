package com.google.firebase.analytics.ktx;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-api@@22.0.2 */
@Metadata
/* loaded from: classes4.dex */
public final class ConsentBuilder {
    @Nullable

    /* renamed from: a */
    private FirebaseAnalytics.ConsentStatus f42071a;
    @Nullable

    /* renamed from: b */
    private FirebaseAnalytics.ConsentStatus f42072b;

    @NotNull
    public final Map<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus> asMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FirebaseAnalytics.ConsentStatus consentStatus = this.f42071a;
        if (consentStatus != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_STORAGE, consentStatus);
        }
        FirebaseAnalytics.ConsentStatus consentStatus2 = this.f42072b;
        if (consentStatus2 != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, consentStatus2);
        }
        return linkedHashMap;
    }

    @androidx.annotation.Nullable
    public final FirebaseAnalytics.ConsentStatus getAdStorage() {
        return this.f42071a;
    }

    @androidx.annotation.Nullable
    public final FirebaseAnalytics.ConsentStatus getAnalyticsStorage() {
        return this.f42072b;
    }

    public final void setAdStorage(@Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.f42071a = consentStatus;
    }

    public final void setAnalyticsStorage(@Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.f42072b = consentStatus;
    }
}
