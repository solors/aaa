package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private final CrashListener f42386a;

    /* renamed from: b */
    private final SettingsProvider f42387b;

    /* renamed from: c */
    private final Thread.UncaughtExceptionHandler f42388c;

    /* renamed from: d */
    private final CrashlyticsNativeComponent f42389d;

    /* renamed from: e */
    private final AtomicBoolean f42390e = new AtomicBoolean(false);

    /* loaded from: classes4.dex */
    interface CrashListener {
        void onUncaughtException(SettingsProvider settingsProvider, Thread thread, Throwable th);
    }

    public CrashlyticsUncaughtExceptionHandler(CrashListener crashListener, SettingsProvider settingsProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.f42386a = crashListener;
        this.f42387b = settingsProvider;
        this.f42388c = uncaughtExceptionHandler;
        this.f42389d = crashlyticsNativeComponent;
    }

    /* renamed from: b */
    private boolean m67093b(Thread thread, Throwable th) {
        if (thread == null) {
            Logger.getLogger().m67214e("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            Logger.getLogger().m67214e("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (this.f42389d.hasCrashDataForCurrentSession()) {
            Logger.getLogger().m67216d("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m67094a() {
        return this.f42390e.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Thread$UncaughtExceptionHandler] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.firebase.crashlytics.internal.Logger] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.firebase.crashlytics.internal.Logger] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.concurrent.atomic.AtomicBoolean] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        ?? r0 = "Completed exception processing. Invoking default exception handler.";
        this.f42390e.set(true);
        try {
            try {
                if (m67093b(thread, th)) {
                    this.f42386a.onUncaughtException(this.f42387b, thread, th);
                } else {
                    Logger.getLogger().m67216d("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e) {
                Logger.getLogger().m67213e("An error occurred in the uncaught exception handler", e);
            }
        } finally {
            Logger.getLogger().m67216d(r0);
            this.f42388c.uncaughtException(thread, th);
            this.f42390e.set(false);
        }
    }
}
