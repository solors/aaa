package com.pubmatic.sdk.common.session;

import com.pubmatic.sdk.common.session.POBAppStateMonitor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: POBAppSessionHandler.kt */
@Metadata
/* loaded from: classes7.dex */
public final class POBAppSessionHandler implements POBAppSessionHandling {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull

    /* renamed from: a */
    private final POBAppStateMonitoring f70249a;

    /* renamed from: b */
    private long f70250b;

    /* renamed from: c */
    private long f70251c;
    @NotNull

    /* renamed from: d */
    private List<POBAppSessionListener> f70252d;

    /* compiled from: POBAppSessionHandler.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: POBAppSessionHandler.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public interface POBAppSessionListener {
        void onAppSessionReset();

        void onAppSessionStarted();
    }

    public POBAppSessionHandler(@NotNull POBAppStateMonitoring appStateMonitor) {
        Intrinsics.checkNotNullParameter(appStateMonitor, "appStateMonitor");
        this.f70249a = appStateMonitor;
        this.f70252d = new ArrayList();
    }

    public static final /* synthetic */ long access$getAppBackgroundStartTimer$p(POBAppSessionHandler pOBAppSessionHandler) {
        return pOBAppSessionHandler.f70251c;
    }

    public static final /* synthetic */ void access$setAppBackgroundStartTimer$p(POBAppSessionHandler pOBAppSessionHandler, long j) {
        pOBAppSessionHandler.f70251c = j;
    }

    @Override // com.pubmatic.sdk.common.session.POBAppSessionHandling
    public void addAppSessionListener(@NotNull POBAppSessionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f70252d.add(listener);
    }

    @Override // com.pubmatic.sdk.common.session.POBAppSessionHandling
    public int getSessionDuration() {
        if (this.f70250b == 0) {
            return 0;
        }
        return (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - this.f70250b);
    }

    @Override // com.pubmatic.sdk.common.session.POBAppSessionHandling
    public void initiateSession() {
        this.f70250b = System.currentTimeMillis();
        this.f70249a.addAppLifecycleListener(new POBAppStateMonitor.POBAppLifecycleListener() { // from class: com.pubmatic.sdk.common.session.POBAppSessionHandler$initiateSession$1
            @Override // com.pubmatic.sdk.common.session.POBAppStateMonitor.POBAppLifecycleListener
            public void onAppMovedToBackground() {
                POBAppSessionHandler.access$setAppBackgroundStartTimer$p(POBAppSessionHandler.this, System.currentTimeMillis());
            }

            @Override // com.pubmatic.sdk.common.session.POBAppStateMonitor.POBAppLifecycleListener
            public void onAppMovedToForeground() {
                long currentTimeMillis = System.currentTimeMillis() - POBAppSessionHandler.access$getAppBackgroundStartTimer$p(POBAppSessionHandler.this);
                if (currentTimeMillis < 0 || currentTimeMillis > 180000) {
                    POBAppSessionHandler.this.resetSession();
                }
            }
        });
        for (POBAppSessionListener pOBAppSessionListener : this.f70252d) {
            pOBAppSessionListener.onAppSessionStarted();
        }
    }

    @Override // com.pubmatic.sdk.common.session.POBAppSessionHandling
    public void removeAppSessionListener(@NotNull POBAppSessionListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f70252d.remove(listener);
    }

    public final void resetSession() {
        this.f70250b = System.currentTimeMillis();
        this.f70251c = 0L;
        for (POBAppSessionListener pOBAppSessionListener : this.f70252d) {
            pOBAppSessionListener.onAppSessionReset();
        }
    }
}
