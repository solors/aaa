package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SessionEvent.kt */
@Metadata
/* loaded from: classes4.dex */
public final class SessionInfo {
    @NotNull

    /* renamed from: a */
    private final String f43774a;
    @NotNull

    /* renamed from: b */
    private final String f43775b;

    /* renamed from: c */
    private final int f43776c;

    /* renamed from: d */
    private final long f43777d;
    @NotNull

    /* renamed from: e */
    private final DataCollectionStatus f43778e;
    @NotNull

    /* renamed from: f */
    private final String f43779f;
    @NotNull

    /* renamed from: g */
    private final String f43780g;

    public SessionInfo(@NotNull String sessionId, @NotNull String firstSessionId, int i, long j, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String firebaseInstallationId, @NotNull String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f43774a = sessionId;
        this.f43775b = firstSessionId;
        this.f43776c = i;
        this.f43777d = j;
        this.f43778e = dataCollectionStatus;
        this.f43779f = firebaseInstallationId;
        this.f43780g = firebaseAuthenticationToken;
    }

    public static /* synthetic */ SessionInfo copy$default(SessionInfo sessionInfo, String str, String str2, int i, long j, DataCollectionStatus dataCollectionStatus, String str3, String str4, int i2, Object obj) {
        String str5;
        String str6;
        int i3;
        long j2;
        DataCollectionStatus dataCollectionStatus2;
        String str7;
        String str8;
        if ((i2 & 1) != 0) {
            str5 = sessionInfo.f43774a;
        } else {
            str5 = str;
        }
        if ((i2 & 2) != 0) {
            str6 = sessionInfo.f43775b;
        } else {
            str6 = str2;
        }
        if ((i2 & 4) != 0) {
            i3 = sessionInfo.f43776c;
        } else {
            i3 = i;
        }
        if ((i2 & 8) != 0) {
            j2 = sessionInfo.f43777d;
        } else {
            j2 = j;
        }
        if ((i2 & 16) != 0) {
            dataCollectionStatus2 = sessionInfo.f43778e;
        } else {
            dataCollectionStatus2 = dataCollectionStatus;
        }
        if ((i2 & 32) != 0) {
            str7 = sessionInfo.f43779f;
        } else {
            str7 = str3;
        }
        if ((i2 & 64) != 0) {
            str8 = sessionInfo.f43780g;
        } else {
            str8 = str4;
        }
        return sessionInfo.copy(str5, str6, i3, j2, dataCollectionStatus2, str7, str8);
    }

    @NotNull
    public final String component1() {
        return this.f43774a;
    }

    @NotNull
    public final String component2() {
        return this.f43775b;
    }

    public final int component3() {
        return this.f43776c;
    }

    public final long component4() {
        return this.f43777d;
    }

    @NotNull
    public final DataCollectionStatus component5() {
        return this.f43778e;
    }

    @NotNull
    public final String component6() {
        return this.f43779f;
    }

    @NotNull
    public final String component7() {
        return this.f43780g;
    }

    @NotNull
    public final SessionInfo copy(@NotNull String sessionId, @NotNull String firstSessionId, int i, long j, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String firebaseInstallationId, @NotNull String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new SessionInfo(sessionId, firstSessionId, i, j, dataCollectionStatus, firebaseInstallationId, firebaseAuthenticationToken);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        if (Intrinsics.m17075f(this.f43774a, sessionInfo.f43774a) && Intrinsics.m17075f(this.f43775b, sessionInfo.f43775b) && this.f43776c == sessionInfo.f43776c && this.f43777d == sessionInfo.f43777d && Intrinsics.m17075f(this.f43778e, sessionInfo.f43778e) && Intrinsics.m17075f(this.f43779f, sessionInfo.f43779f) && Intrinsics.m17075f(this.f43780g, sessionInfo.f43780g)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final DataCollectionStatus getDataCollectionStatus() {
        return this.f43778e;
    }

    public final long getEventTimestampUs() {
        return this.f43777d;
    }

    @NotNull
    public final String getFirebaseAuthenticationToken() {
        return this.f43780g;
    }

    @NotNull
    public final String getFirebaseInstallationId() {
        return this.f43779f;
    }

    @NotNull
    public final String getFirstSessionId() {
        return this.f43775b;
    }

    @NotNull
    public final String getSessionId() {
        return this.f43774a;
    }

    public final int getSessionIndex() {
        return this.f43776c;
    }

    public int hashCode() {
        return (((((((((((this.f43774a.hashCode() * 31) + this.f43775b.hashCode()) * 31) + Integer.hashCode(this.f43776c)) * 31) + Long.hashCode(this.f43777d)) * 31) + this.f43778e.hashCode()) * 31) + this.f43779f.hashCode()) * 31) + this.f43780g.hashCode();
    }

    @NotNull
    public String toString() {
        return "SessionInfo(sessionId=" + this.f43774a + ", firstSessionId=" + this.f43775b + ", sessionIndex=" + this.f43776c + ", eventTimestampUs=" + this.f43777d + ", dataCollectionStatus=" + this.f43778e + ", firebaseInstallationId=" + this.f43779f + ", firebaseAuthenticationToken=" + this.f43780g + ')';
    }
}
