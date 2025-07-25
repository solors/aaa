package com.ironsource;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.gi */
/* loaded from: classes6.dex */
public final class C19992gi {
    @NotNull

    /* renamed from: e */
    public static final C19995c f50260e = new C19995c(null);
    @NotNull

    /* renamed from: f */
    public static final String f50261f = "capping";
    @NotNull

    /* renamed from: g */
    public static final String f50262g = "pacing";
    @NotNull

    /* renamed from: h */
    public static final String f50263h = "delivery";
    @NotNull

    /* renamed from: i */
    public static final String f50264i = "expiredDurationInMinutes";

    /* renamed from: j */
    public static final long f50265j = 60;
    @NotNull

    /* renamed from: a */
    private final JSONObject f50266a;
    @NotNull

    /* renamed from: b */
    private final Map<String, C19996d> f50267b;
    @NotNull

    /* renamed from: c */
    private final C19996d f50268c;
    @NotNull

    /* renamed from: d */
    private final Map<String, C19996d> f50269d;

    @Metadata
    /* renamed from: com.ironsource.gi$a */
    /* loaded from: classes6.dex */
    static final class C19993a extends Lambda implements Function1<JSONObject, C19996d> {

        /* renamed from: a */
        public static final C19993a f50270a = new C19993a();

        C19993a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final C19996d invoke(@NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new C19996d(it);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.gi$b */
    /* loaded from: classes6.dex */
    static final class C19994b extends Lambda implements Function1<JSONObject, C19996d> {

        /* renamed from: a */
        public static final C19994b f50271a = new C19994b();

        C19994b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final C19996d invoke(@NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new C19996d(it);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.gi$c */
    /* loaded from: classes6.dex */
    public static final class C19995c {
        private C19995c() {
        }

        public /* synthetic */ C19995c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata
    /* renamed from: com.ironsource.gi$d */
    /* loaded from: classes6.dex */
    public static final class C19996d {
        @Nullable

        /* renamed from: a */
        private final C19620b8 f50272a;
        @Nullable

        /* renamed from: b */
        private final C21022tn f50273b;
        @Nullable

        /* renamed from: c */
        private final C19574aa f50274c;

        /* renamed from: d */
        private final long f50275d;

        public C19996d(@NotNull JSONObject features) {
            C19620b8 c19620b8;
            C21022tn c21022tn;
            long j;
            Intrinsics.checkNotNullParameter(features, "features");
            if (features.has(C19992gi.f50261f)) {
                JSONObject jSONObject = features.getJSONObject(C19992gi.f50261f);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "features.getJSONObject(key)");
                c19620b8 = new C19620b8(jSONObject);
            } else {
                c19620b8 = null;
            }
            this.f50272a = c19620b8;
            if (features.has(C19992gi.f50262g)) {
                JSONObject jSONObject2 = features.getJSONObject(C19992gi.f50262g);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "features.getJSONObject(key)");
                c21022tn = new C21022tn(jSONObject2);
            } else {
                c21022tn = null;
            }
            this.f50273b = c21022tn;
            this.f50274c = features.has("delivery") ? new C19574aa(features.getBoolean("delivery")) : null;
            if (features.has(C19992gi.f50264i)) {
                j = features.getLong(C19992gi.f50264i);
            } else {
                j = 60;
            }
            this.f50275d = j;
        }

        @Nullable
        /* renamed from: a */
        public final C19620b8 m58349a() {
            return this.f50272a;
        }

        @Nullable
        /* renamed from: b */
        public final C19574aa m58348b() {
            return this.f50274c;
        }

        /* renamed from: c */
        public final long m58347c() {
            return this.f50275d;
        }

        @Nullable
        /* renamed from: d */
        public final C21022tn m58346d() {
            return this.f50273b;
        }
    }

    public C19992gi(@NotNull JSONObject configurations) {
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.f50266a = configurations;
        this.f50267b = new C20161jo(configurations).m57798a(C19994b.f50271a);
        this.f50268c = new C19996d(configurations);
        this.f50269d = new C20736r2(configurations).m55567a(C19993a.f50270a);
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, C19996d> m58355a() {
        return this.f50269d;
    }

    @NotNull
    /* renamed from: b */
    public final JSONObject m58354b() {
        return this.f50266a;
    }

    @NotNull
    /* renamed from: c */
    public final C19996d m58353c() {
        return this.f50268c;
    }

    @NotNull
    /* renamed from: d */
    public final Map<String, C19996d> m58352d() {
        return this.f50267b;
    }
}
