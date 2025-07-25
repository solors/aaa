package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37756k;
import kotlinx.coroutines.C37785p0;
import org.jetbrains.annotations.NotNull;

/* compiled from: SessionFirelogPublisher.kt */
@Metadata
/* loaded from: classes4.dex */
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    private static final double f43750f = Math.random();
    @NotNull

    /* renamed from: a */
    private final FirebaseApp f43751a;
    @NotNull

    /* renamed from: b */
    private final FirebaseInstallationsApi f43752b;
    @NotNull

    /* renamed from: c */
    private final SessionsSettings f43753c;
    @NotNull

    /* renamed from: d */
    private final EventGDTLoggerInterface f43754d;
    @NotNull

    /* renamed from: e */
    private final CoroutineContext f43755e;

    /* compiled from: SessionFirelogPublisher.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SessionFirelogPublisherImpl(@NotNull FirebaseApp firebaseApp, @NotNull FirebaseInstallationsApi firebaseInstallations, @NotNull SessionsSettings sessionSettings, @NotNull EventGDTLoggerInterface eventGDTLogger, @NotNull CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(sessionSettings, "sessionSettings");
        Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f43751a = firebaseApp;
        this.f43752b = firebaseInstallations;
        this.f43753c = sessionSettings;
        this.f43754d = eventGDTLogger;
        this.f43755e = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m66284a(SessionEvent sessionEvent) {
        try {
            this.f43754d.log(sessionEvent);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: " + sessionEvent.getSessionData().getSessionId());
        } catch (RuntimeException e) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e);
        }
    }

    /* renamed from: b */
    private final boolean m66283b() {
        if (f43750f <= this.f43753c.getSamplingRate()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m66282c(kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1) r0
            int r1 = r0.f43768o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43768o = r1
            goto L18
        L13:
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = new com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f43766m
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.f43768o
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f43765l
            com.google.firebase.sessions.SessionFirelogPublisherImpl r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r0
            p804nd.C38508r.m14539b(r6)
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            p804nd.C38508r.m14539b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            com.google.firebase.sessions.settings.SessionsSettings r6 = r5.f43753c
            r0.f43765l = r5
            r0.f43768o = r4
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            com.google.firebase.sessions.settings.SessionsSettings r6 = r0.f43753c
            boolean r6 = r6.getSessionsEnabled()
            r1 = 0
            if (r6 != 0) goto L60
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.boxing.m17100a(r1)
            return r6
        L60:
            boolean r6 = r0.m66283b()
            if (r6 != 0) goto L70
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.boxing.m17100a(r1)
            return r6
        L70:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.boxing.m17100a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.m66282c(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public void logSession(@NotNull SessionDetails sessionDetails) {
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        C37756k.m16221d(C37785p0.m16131a(this.f43755e), null, null, new SessionFirelogPublisherImpl$logSession$1(this, sessionDetails, null), 3, null);
    }
}
