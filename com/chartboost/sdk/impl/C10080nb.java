package com.chartboost.sdk.impl;

import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import td.C44401b;
import td.EnumEntries;

/* renamed from: com.chartboost.sdk.impl.nb */
/* loaded from: classes3.dex */
public final class C10080nb {

    /* renamed from: i */
    public static final C10081a f22745i = new C10081a(null);

    /* renamed from: a */
    public final long f22746a;

    /* renamed from: b */
    public final int f22747b;

    /* renamed from: c */
    public final int f22748c;

    /* renamed from: d */
    public final long f22749d;

    /* renamed from: e */
    public final long f22750e;

    /* renamed from: f */
    public final long f22751f;

    /* renamed from: g */
    public final int f22752g;

    /* renamed from: h */
    public final EnumC10082b f22753h;

    /* renamed from: com.chartboost.sdk.impl.nb$a */
    /* loaded from: classes3.dex */
    public static final class C10081a {
        public C10081a() {
        }

        /* renamed from: a */
        public final C10080nb m80993a(JSONObject config) {
            String str;
            Intrinsics.checkNotNullParameter(config, "config");
            long optLong = config.optLong("maxBytes", 52428800L);
            int optInt = config.optInt("maxUnitsPerTimeWindow", 10);
            int optInt2 = config.optInt("maxUnitsPerTimeWindowCellular", 10);
            long optLong2 = config.optLong("timeWindow", 18000L);
            long optLong3 = config.optLong("timeWindowCellular", 18000L);
            long optLong4 = config.optLong("ttl", TelemetryConfig.DEFAULT_EVENT_TTL_SEC);
            int optInt3 = config.optInt("bufferSize", 3);
            str = AbstractC10103ob.f22868a;
            String optString = config.optString("videoPlayer", str);
            EnumC10082b.C10083a c10083a = EnumC10082b.f22754c;
            Intrinsics.m17074g(optString);
            return new C10080nb(optLong, optInt, optInt2, optLong2, optLong3, optLong4, optInt3, c10083a.m80989a(optString));
        }

        public /* synthetic */ C10081a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.chartboost.sdk.impl.nb$b */
    /* loaded from: classes3.dex */
    public static final class EnumC10082b {

        /* renamed from: c */
        public static final C10083a f22754c;

        /* renamed from: d */
        public static final EnumC10082b f22755d = new EnumC10082b("EXO_PLAYER", 0, "exoplayer");

        /* renamed from: e */
        public static final EnumC10082b f22756e = new EnumC10082b("MEDIA_PLAYER", 1, "mediaplayer");

        /* renamed from: f */
        public static final /* synthetic */ EnumC10082b[] f22757f;

        /* renamed from: g */
        public static final /* synthetic */ EnumEntries f22758g;

        /* renamed from: b */
        public final String f22759b;

        /* renamed from: com.chartboost.sdk.impl.nb$b$a */
        /* loaded from: classes3.dex */
        public static final class C10083a {
            public C10083a() {
            }

            /* renamed from: a */
            public final EnumC10082b m80989a(String value) {
                Object obj;
                Intrinsics.checkNotNullParameter(value, "value");
                Iterator<E> it = EnumC10082b.m80991b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.m17075f(((EnumC10082b) obj).m80990c(), value)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                EnumC10082b enumC10082b = (EnumC10082b) obj;
                if (enumC10082b == null) {
                    return EnumC10082b.f22755d;
                }
                return enumC10082b;
            }

            public /* synthetic */ C10083a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            EnumC10082b[] m80992a = m80992a();
            f22757f = m80992a;
            f22758g = C44401b.m3113a(m80992a);
            f22754c = new C10083a(null);
        }

        public EnumC10082b(String str, int i, String str2) {
            this.f22759b = str2;
        }

        /* renamed from: a */
        public static final /* synthetic */ EnumC10082b[] m80992a() {
            return new EnumC10082b[]{f22755d, f22756e};
        }

        /* renamed from: b */
        public static EnumEntries m80991b() {
            return f22758g;
        }

        public static EnumC10082b valueOf(String str) {
            return (EnumC10082b) Enum.valueOf(EnumC10082b.class, str);
        }

        public static EnumC10082b[] values() {
            return (EnumC10082b[]) f22757f.clone();
        }

        /* renamed from: c */
        public final String m80990c() {
            return this.f22759b;
        }
    }

    public C10080nb(long j, int i, int i2, long j2, long j3, long j4, int i3, EnumC10082b videoPlayer) {
        Intrinsics.checkNotNullParameter(videoPlayer, "videoPlayer");
        this.f22746a = j;
        this.f22747b = i;
        this.f22748c = i2;
        this.f22749d = j2;
        this.f22750e = j3;
        this.f22751f = j4;
        this.f22752g = i3;
        this.f22753h = videoPlayer;
    }

    /* renamed from: a */
    public final int m81002a() {
        return this.f22752g;
    }

    /* renamed from: b */
    public final long m81000b() {
        return this.f22746a;
    }

    /* renamed from: c */
    public final int m80999c() {
        return this.f22747b;
    }

    /* renamed from: d */
    public final int m80998d() {
        return this.f22748c;
    }

    /* renamed from: e */
    public final long m80997e() {
        return this.f22749d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10080nb)) {
            return false;
        }
        C10080nb c10080nb = (C10080nb) obj;
        if (this.f22746a == c10080nb.f22746a && this.f22747b == c10080nb.f22747b && this.f22748c == c10080nb.f22748c && this.f22749d == c10080nb.f22749d && this.f22750e == c10080nb.f22750e && this.f22751f == c10080nb.f22751f && this.f22752g == c10080nb.f22752g && this.f22753h == c10080nb.f22753h) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final long m80996f() {
        return this.f22750e;
    }

    /* renamed from: g */
    public final long m80995g() {
        return this.f22751f;
    }

    /* renamed from: h */
    public final EnumC10082b m80994h() {
        return this.f22753h;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.f22746a) * 31) + Integer.hashCode(this.f22747b)) * 31) + Integer.hashCode(this.f22748c)) * 31) + Long.hashCode(this.f22749d)) * 31) + Long.hashCode(this.f22750e)) * 31) + Long.hashCode(this.f22751f)) * 31) + Integer.hashCode(this.f22752g)) * 31) + this.f22753h.hashCode();
    }

    public String toString() {
        long j = this.f22746a;
        int i = this.f22747b;
        int i2 = this.f22748c;
        long j2 = this.f22749d;
        long j3 = this.f22750e;
        long j4 = this.f22751f;
        int i3 = this.f22752g;
        EnumC10082b enumC10082b = this.f22753h;
        return "VideoPreCachingModel(maxBytes=" + j + ", maxUnitsPerTimeWindow=" + i + ", maxUnitsPerTimeWindowCellular=" + i2 + ", timeWindow=" + j2 + ", timeWindowCellular=" + j3 + ", ttl=" + j4 + ", bufferSize=" + i3 + ", videoPlayer=" + enumC10082b + ")";
    }

    /* renamed from: a */
    public static final C10080nb m81001a(JSONObject jSONObject) {
        return f22745i.m80993a(jSONObject);
    }

    public /* synthetic */ C10080nb(long j, int i, int i2, long j2, long j3, long j4, int i3, EnumC10082b enumC10082b, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 52428800L : j, (i4 & 2) != 0 ? 10 : i, (i4 & 4) == 0 ? i2 : 10, (i4 & 8) != 0 ? 18000L : j2, (i4 & 16) == 0 ? j3 : 18000L, (i4 & 32) != 0 ? TelemetryConfig.DEFAULT_EVENT_TTL_SEC : j4, (i4 & 64) != 0 ? 3 : i3, (i4 & 128) != 0 ? EnumC10082b.f22755d : enumC10082b);
    }
}
