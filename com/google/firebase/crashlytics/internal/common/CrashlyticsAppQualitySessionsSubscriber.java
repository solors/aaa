package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.sessions.api.SessionSubscriber;

/* loaded from: classes4.dex */
public class CrashlyticsAppQualitySessionsSubscriber implements SessionSubscriber {

    /* renamed from: a */
    private final DataCollectionArbiter f42310a;

    /* renamed from: b */
    private final CrashlyticsAppQualitySessionsStore f42311b;

    public CrashlyticsAppQualitySessionsSubscriber(DataCollectionArbiter dataCollectionArbiter, FileStore fileStore) {
        this.f42310a = dataCollectionArbiter;
        this.f42311b = new CrashlyticsAppQualitySessionsStore(fileStore);
    }

    @Nullable
    public String getAppQualitySessionId(@NonNull String str) {
        return this.f42311b.getAppQualitySessionId(str);
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    @NonNull
    public SessionSubscriber.Name getSessionSubscriberName() {
        return SessionSubscriber.Name.CRASHLYTICS;
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public boolean isDataCollectionEnabled() {
        return this.f42310a.isAutomaticDataCollectionEnabled();
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public void onSessionChanged(@NonNull SessionSubscriber.SessionDetails sessionDetails) {
        Logger logger = Logger.getLogger();
        logger.m67216d("App Quality Sessions session changed: " + sessionDetails);
        this.f42311b.rotateAppQualitySessionId(sessionDetails.getSessionId());
    }

    public void setSessionId(@Nullable String str) {
        this.f42311b.rotateSessionId(str);
    }
}
