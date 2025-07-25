package com.google.firebase.sessions.api;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SessionSubscriber.kt */
@Metadata
/* loaded from: classes4.dex */
public interface SessionSubscriber {

    /* compiled from: SessionSubscriber.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public enum Name {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* compiled from: SessionSubscriber.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class SessionDetails {
        @NotNull

        /* renamed from: a */
        private final String f43817a;

        public SessionDetails(@NotNull String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.f43817a = sessionId;
        }

        public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionDetails.f43817a;
            }
            return sessionDetails.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.f43817a;
        }

        @NotNull
        public final SessionDetails copy(@NotNull String sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            return new SessionDetails(sessionId);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof SessionDetails) && Intrinsics.m17075f(this.f43817a, ((SessionDetails) obj).f43817a)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final String getSessionId() {
            return this.f43817a;
        }

        public int hashCode() {
            return this.f43817a.hashCode();
        }

        @NotNull
        public String toString() {
            return "SessionDetails(sessionId=" + this.f43817a + ')';
        }
    }

    @NotNull
    Name getSessionSubscriberName();

    boolean isDataCollectionEnabled();

    void onSessionChanged(@NotNull SessionDetails sessionDetails);
}
