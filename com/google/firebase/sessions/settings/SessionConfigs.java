package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SettingsCache.kt */
@Metadata
/* loaded from: classes4.dex */
public final class SessionConfigs {
    @Nullable

    /* renamed from: a */
    private final Boolean f43850a;
    @Nullable

    /* renamed from: b */
    private final Double f43851b;
    @Nullable

    /* renamed from: c */
    private final Integer f43852c;
    @Nullable

    /* renamed from: d */
    private final Integer f43853d;
    @Nullable

    /* renamed from: e */
    private final Long f43854e;

    public SessionConfigs(@Nullable Boolean bool, @Nullable Double d, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l) {
        this.f43850a = bool;
        this.f43851b = d;
        this.f43852c = num;
        this.f43853d = num2;
        this.f43854e = l;
    }

    public static /* synthetic */ SessionConfigs copy$default(SessionConfigs sessionConfigs, Boolean bool, Double d, Integer num, Integer num2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = sessionConfigs.f43850a;
        }
        if ((i & 2) != 0) {
            d = sessionConfigs.f43851b;
        }
        Double d2 = d;
        if ((i & 4) != 0) {
            num = sessionConfigs.f43852c;
        }
        Integer num3 = num;
        if ((i & 8) != 0) {
            num2 = sessionConfigs.f43853d;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            l = sessionConfigs.f43854e;
        }
        return sessionConfigs.copy(bool, d2, num3, num4, l);
    }

    @Nullable
    public final Boolean component1() {
        return this.f43850a;
    }

    @Nullable
    public final Double component2() {
        return this.f43851b;
    }

    @Nullable
    public final Integer component3() {
        return this.f43852c;
    }

    @Nullable
    public final Integer component4() {
        return this.f43853d;
    }

    @Nullable
    public final Long component5() {
        return this.f43854e;
    }

    @NotNull
    public final SessionConfigs copy(@Nullable Boolean bool, @Nullable Double d, @Nullable Integer num, @Nullable Integer num2, @Nullable Long l) {
        return new SessionConfigs(bool, d, num, num2, l);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) obj;
        if (Intrinsics.m17075f(this.f43850a, sessionConfigs.f43850a) && Intrinsics.m17075f(this.f43851b, sessionConfigs.f43851b) && Intrinsics.m17075f(this.f43852c, sessionConfigs.f43852c) && Intrinsics.m17075f(this.f43853d, sessionConfigs.f43853d) && Intrinsics.m17075f(this.f43854e, sessionConfigs.f43854e)) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Integer getCacheDuration() {
        return this.f43853d;
    }

    @Nullable
    public final Long getCacheUpdatedTime() {
        return this.f43854e;
    }

    @Nullable
    public final Boolean getSessionEnabled() {
        return this.f43850a;
    }

    @Nullable
    public final Integer getSessionRestartTimeout() {
        return this.f43852c;
    }

    @Nullable
    public final Double getSessionSamplingRate() {
        return this.f43851b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Boolean bool = this.f43850a;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        Double d = this.f43851b;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num = this.f43852c;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Integer num2 = this.f43853d;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Long l = this.f43854e;
        if (l != null) {
            i = l.hashCode();
        }
        return i5 + i;
    }

    @NotNull
    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f43850a + ", sessionSamplingRate=" + this.f43851b + ", sessionRestartTimeout=" + this.f43852c + ", cacheDuration=" + this.f43853d + ", cacheUpdatedTime=" + this.f43854e + ')';
    }
}
