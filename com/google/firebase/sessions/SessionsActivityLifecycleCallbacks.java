package com.google.firebase.sessions;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SessionsActivityLifecycleCallbacks.kt */
@Metadata
/* loaded from: classes4.dex */
public final class SessionsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    @NotNull
    public static final SessionsActivityLifecycleCallbacks INSTANCE = new SessionsActivityLifecycleCallbacks();

    /* renamed from: b */
    private static boolean f43801b;
    @Nullable

    /* renamed from: c */
    private static SessionLifecycleClient f43802c;

    private SessionsActivityLifecycleCallbacks() {
    }

    public final boolean getHasPendingForeground$com_google_firebase_firebase_sessions() {
        return f43801b;
    }

    @Nullable
    public final SessionLifecycleClient getLifecycleClient() {
        return f43802c;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        SessionLifecycleClient sessionLifecycleClient = f43802c;
        if (sessionLifecycleClient != null) {
            sessionLifecycleClient.backgrounded();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        Unit unit;
        Intrinsics.checkNotNullParameter(activity, "activity");
        SessionLifecycleClient sessionLifecycleClient = f43802c;
        if (sessionLifecycleClient != null) {
            sessionLifecycleClient.foregrounded();
            unit = Unit.f99208a;
        } else {
            unit = null;
        }
        if (unit == null) {
            f43801b = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    public final void setHasPendingForeground$com_google_firebase_firebase_sessions(boolean z) {
        f43801b = z;
    }

    public final void setLifecycleClient(@Nullable SessionLifecycleClient sessionLifecycleClient) {
        f43802c = sessionLifecycleClient;
        if (sessionLifecycleClient != null && f43801b) {
            f43801b = false;
            sessionLifecycleClient.foregrounded();
        }
    }

    @VisibleForTesting
    /* renamed from: getHasPendingForeground$com_google_firebase_firebase_sessions$annotations */
    public static /* synthetic */ void m66263x5f611537() {
    }
}
