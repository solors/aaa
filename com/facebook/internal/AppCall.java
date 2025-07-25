package com.facebook.internal;

import android.content.Intent;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppCall.kt */
@Metadata
/* loaded from: classes4.dex */
public final class AppCall {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private static AppCall currentPendingCall;
    @NotNull
    private final UUID callId;
    private int requestCode;
    @Nullable
    private Intent requestIntent;

    /* compiled from: AppCall.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized boolean setCurrentPendingCall(AppCall appCall) {
            boolean z;
            AppCall currentPendingCall = getCurrentPendingCall();
            AppCall.access$setCurrentPendingCall$cp(appCall);
            if (currentPendingCall != null) {
                z = true;
            } else {
                z = false;
            }
            return z;
        }

        @Nullable
        public final synchronized AppCall finishPendingCall(@NotNull UUID callId, int i) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            AppCall currentPendingCall = getCurrentPendingCall();
            if (currentPendingCall != null && Intrinsics.m17075f(currentPendingCall.getCallId(), callId) && currentPendingCall.getRequestCode() == i) {
                setCurrentPendingCall(null);
                return currentPendingCall;
            }
            return null;
        }

        @Nullable
        public final AppCall getCurrentPendingCall() {
            return AppCall.access$getCurrentPendingCall$cp();
        }
    }

    public AppCall(int i) {
        this(i, null, 2, null);
    }

    public static final /* synthetic */ AppCall access$getCurrentPendingCall$cp() {
        if (CrashShieldHandler.isObjectCrashing(AppCall.class)) {
            return null;
        }
        try {
            return currentPendingCall;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppCall.class);
            return null;
        }
    }

    public static final /* synthetic */ void access$setCurrentPendingCall$cp(AppCall appCall) {
        if (CrashShieldHandler.isObjectCrashing(AppCall.class)) {
            return;
        }
        try {
            currentPendingCall = appCall;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppCall.class);
        }
    }

    @Nullable
    public static final synchronized AppCall finishPendingCall(@NotNull UUID uuid, int i) {
        synchronized (AppCall.class) {
            if (CrashShieldHandler.isObjectCrashing(AppCall.class)) {
                return null;
            }
            return Companion.finishPendingCall(uuid, i);
        }
    }

    @NotNull
    public final UUID getCallId() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.callId;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final int getRequestCode() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return 0;
        }
        try {
            return this.requestCode;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return 0;
        }
    }

    @Nullable
    public final Intent getRequestIntent() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.requestIntent;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final boolean setPending() {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                return Companion.setCurrentPendingCall(this);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return false;
            }
        }
        return false;
    }

    public final void setRequestCode(int i) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.requestCode = i;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setRequestIntent(@Nullable Intent intent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.requestIntent = intent;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public AppCall(int i, @NotNull UUID callId) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        this.requestCode = i;
        this.callId = callId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ AppCall(int r1, java.util.UUID r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r3 = "randomUUID()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.AppCall.<init>(int, java.util.UUID, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
