package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SessionGenerator.kt */
@Metadata
/* loaded from: classes4.dex */
public final class SessionDetails {
    @NotNull

    /* renamed from: a */
    private final String f43741a;
    @NotNull

    /* renamed from: b */
    private final String f43742b;

    /* renamed from: c */
    private final int f43743c;

    /* renamed from: d */
    private final long f43744d;

    public SessionDetails(@NotNull String sessionId, @NotNull String firstSessionId, int i, long j) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        this.f43741a = sessionId;
        this.f43742b = firstSessionId;
        this.f43743c = i;
        this.f43744d = j;
    }

    public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, String str2, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sessionDetails.f43741a;
        }
        if ((i2 & 2) != 0) {
            str2 = sessionDetails.f43742b;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = sessionDetails.f43743c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = sessionDetails.f43744d;
        }
        return sessionDetails.copy(str, str3, i3, j);
    }

    @NotNull
    public final String component1() {
        return this.f43741a;
    }

    @NotNull
    public final String component2() {
        return this.f43742b;
    }

    public final int component3() {
        return this.f43743c;
    }

    public final long component4() {
        return this.f43744d;
    }

    @NotNull
    public final SessionDetails copy(@NotNull String sessionId, @NotNull String firstSessionId, int i, long j) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        return new SessionDetails(sessionId, firstSessionId, i, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionDetails)) {
            return false;
        }
        SessionDetails sessionDetails = (SessionDetails) obj;
        if (Intrinsics.m17075f(this.f43741a, sessionDetails.f43741a) && Intrinsics.m17075f(this.f43742b, sessionDetails.f43742b) && this.f43743c == sessionDetails.f43743c && this.f43744d == sessionDetails.f43744d) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getFirstSessionId() {
        return this.f43742b;
    }

    @NotNull
    public final String getSessionId() {
        return this.f43741a;
    }

    public final int getSessionIndex() {
        return this.f43743c;
    }

    public final long getSessionStartTimestampUs() {
        return this.f43744d;
    }

    public int hashCode() {
        return (((((this.f43741a.hashCode() * 31) + this.f43742b.hashCode()) * 31) + Integer.hashCode(this.f43743c)) * 31) + Long.hashCode(this.f43744d);
    }

    @NotNull
    public String toString() {
        return "SessionDetails(sessionId=" + this.f43741a + ", firstSessionId=" + this.f43742b + ", sessionIndex=" + this.f43743c + ", sessionStartTimestampUs=" + this.f43744d + ')';
    }
}
