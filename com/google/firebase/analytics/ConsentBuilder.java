package com.google.firebase.analytics;

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
    private FirebaseAnalytics.ConsentStatus f42044a;
    @Nullable

    /* renamed from: b */
    private FirebaseAnalytics.ConsentStatus f42045b;
    @Nullable

    /* renamed from: c */
    private FirebaseAnalytics.ConsentStatus f42046c;
    @Nullable

    /* renamed from: d */
    private FirebaseAnalytics.ConsentStatus f42047d;

    @NotNull
    public final Map<FirebaseAnalytics.ConsentType, FirebaseAnalytics.ConsentStatus> asMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        FirebaseAnalytics.ConsentStatus consentStatus = this.f42044a;
        if (consentStatus != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_STORAGE, consentStatus);
        }
        FirebaseAnalytics.ConsentStatus consentStatus2 = this.f42045b;
        if (consentStatus2 != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE, consentStatus2);
        }
        FirebaseAnalytics.ConsentStatus consentStatus3 = this.f42046c;
        if (consentStatus3 != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_USER_DATA, consentStatus3);
        }
        FirebaseAnalytics.ConsentStatus consentStatus4 = this.f42047d;
        if (consentStatus4 != null) {
            linkedHashMap.put(FirebaseAnalytics.ConsentType.AD_PERSONALIZATION, consentStatus4);
        }
        return linkedHashMap;
    }

    @androidx.annotation.Nullable
    public final FirebaseAnalytics.ConsentStatus getAdPersonalization() {
        return this.f42047d;
    }

    @androidx.annotation.Nullable
    public final FirebaseAnalytics.ConsentStatus getAdStorage() {
        return this.f42044a;
    }

    @androidx.annotation.Nullable
    public final FirebaseAnalytics.ConsentStatus getAdUserData() {
        return this.f42046c;
    }

    @androidx.annotation.Nullable
    public final FirebaseAnalytics.ConsentStatus getAnalyticsStorage() {
        return this.f42045b;
    }

    public final void setAdPersonalization(@Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.f42047d = consentStatus;
    }

    public final void setAdStorage(@Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.f42044a = consentStatus;
    }

    public final void setAdUserData(@Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.f42046c = consentStatus;
    }

    public final void setAnalyticsStorage(@Nullable FirebaseAnalytics.ConsentStatus consentStatus) {
        this.f42045b = consentStatus;
    }
}
