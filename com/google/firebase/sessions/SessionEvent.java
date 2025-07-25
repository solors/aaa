package com.google.firebase.sessions;

import com.google.firebase.encoders.annotations.Encodable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SessionEvent.kt */
@Metadata
@Encodable
/* loaded from: classes4.dex */
public final class SessionEvent {
    @NotNull

    /* renamed from: a */
    private final EventType f43745a;
    @NotNull

    /* renamed from: b */
    private final SessionInfo f43746b;
    @NotNull

    /* renamed from: c */
    private final ApplicationInfo f43747c;

    public SessionEvent(@NotNull EventType eventType, @NotNull SessionInfo sessionData, @NotNull ApplicationInfo applicationInfo) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.f43745a = eventType;
        this.f43746b = sessionData;
        this.f43747c = applicationInfo;
    }

    public static /* synthetic */ SessionEvent copy$default(SessionEvent sessionEvent, EventType eventType, SessionInfo sessionInfo, ApplicationInfo applicationInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            eventType = sessionEvent.f43745a;
        }
        if ((i & 2) != 0) {
            sessionInfo = sessionEvent.f43746b;
        }
        if ((i & 4) != 0) {
            applicationInfo = sessionEvent.f43747c;
        }
        return sessionEvent.copy(eventType, sessionInfo, applicationInfo);
    }

    @NotNull
    public final EventType component1() {
        return this.f43745a;
    }

    @NotNull
    public final SessionInfo component2() {
        return this.f43746b;
    }

    @NotNull
    public final ApplicationInfo component3() {
        return this.f43747c;
    }

    @NotNull
    public final SessionEvent copy(@NotNull EventType eventType, @NotNull SessionInfo sessionData, @NotNull ApplicationInfo applicationInfo) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        return new SessionEvent(eventType, sessionData, applicationInfo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionEvent)) {
            return false;
        }
        SessionEvent sessionEvent = (SessionEvent) obj;
        if (this.f43745a == sessionEvent.f43745a && Intrinsics.m17075f(this.f43746b, sessionEvent.f43746b) && Intrinsics.m17075f(this.f43747c, sessionEvent.f43747c)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final ApplicationInfo getApplicationInfo() {
        return this.f43747c;
    }

    @NotNull
    public final EventType getEventType() {
        return this.f43745a;
    }

    @NotNull
    public final SessionInfo getSessionData() {
        return this.f43746b;
    }

    public int hashCode() {
        return (((this.f43745a.hashCode() * 31) + this.f43746b.hashCode()) * 31) + this.f43747c.hashCode();
    }

    @NotNull
    public String toString() {
        return "SessionEvent(eventType=" + this.f43745a + ", sessionData=" + this.f43746b + ", applicationInfo=" + this.f43747c + ')';
    }
}
