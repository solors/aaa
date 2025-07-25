package com.pubmatic.sdk.common.session;

import com.pubmatic.sdk.common.session.POBAppSessionHandler;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: POBAppSessionHandling.kt */
@Metadata
/* loaded from: classes7.dex */
public interface POBAppSessionHandling {
    void addAppSessionListener(@NotNull POBAppSessionHandler.POBAppSessionListener pOBAppSessionListener);

    int getSessionDuration();

    void initiateSession();

    void removeAppSessionListener(@NotNull POBAppSessionHandler.POBAppSessionListener pOBAppSessionListener);
}
