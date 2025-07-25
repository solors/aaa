package com.ironsource;

import com.ironsource.mediationsdk.C20410l;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.m6 */
/* loaded from: classes6.dex */
public final class C20322m6 {
    @NotNull

    /* renamed from: a */
    private final C20324b f51130a;
    @NotNull

    /* renamed from: b */
    private final Map<String, C20324b> f51131b;

    @Metadata
    /* renamed from: com.ironsource.m6$a */
    /* loaded from: classes6.dex */
    static final class C20323a extends Lambda implements Function1<JSONObject, C20324b> {

        /* renamed from: a */
        public static final C20323a f51132a = new C20323a();

        C20323a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a */
        public final C20324b invoke(@NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new C20324b(it);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.m6$b */
    /* loaded from: classes6.dex */
    public static final class C20324b {
        @Nullable

        /* renamed from: a */
        private final Integer f51133a;
        @Nullable

        /* renamed from: b */
        private final Boolean f51134b;
        @Nullable

        /* renamed from: c */
        private final Boolean f51135c;

        /* renamed from: d */
        private final float f51136d;
        @NotNull

        /* renamed from: e */
        private final List<String> f51137e;

        public C20324b(@NotNull JSONObject features) {
            Integer num;
            Boolean bool;
            float f;
            List<String> m17163p;
            Intrinsics.checkNotNullParameter(features, "features");
            if (features.has(C20570o6.f52287a)) {
                num = Integer.valueOf(features.optInt(C20570o6.f52287a));
            } else {
                num = null;
            }
            this.f51133a = num;
            if (features.has(C20570o6.f52288b)) {
                bool = Boolean.valueOf(features.optBoolean(C20570o6.f52288b));
            } else {
                bool = null;
            }
            this.f51134b = bool;
            this.f51135c = features.has("isLoadWhileShow") ? Boolean.valueOf(features.optBoolean("isLoadWhileShow")) : null;
            if (features.has(C20570o6.f52290d)) {
                f = features.optInt(C20570o6.f52290d) / 100.0f;
            } else {
                f = 0.15f;
            }
            this.f51136d = f;
            if (!features.has(C20570o6.f52291e)) {
                m17163p = C37563v.m17163p(C20410l.f51629a, C20410l.f51632d);
            } else {
                m17163p = C20053hj.m58121b(features.getJSONArray(C20570o6.f52291e));
            }
            Intrinsics.checkNotNullExpressionValue(m17163p, "BANNER_CONFIGURATIONS_AD…ZE_LEADERBOARD)\n        }");
            this.f51137e = m17163p;
        }

        @NotNull
        /* renamed from: a */
        public final List<String> m57294a() {
            return this.f51137e;
        }

        @Nullable
        /* renamed from: b */
        public final Integer m57293b() {
            return this.f51133a;
        }

        /* renamed from: c */
        public final float m57292c() {
            return this.f51136d;
        }

        @Nullable
        /* renamed from: d */
        public final Boolean m57291d() {
            return this.f51134b;
        }

        @Nullable
        /* renamed from: e */
        public final Boolean m57290e() {
            return this.f51135c;
        }
    }

    public C20322m6(@NotNull JSONObject bannerConfigurations) {
        Intrinsics.checkNotNullParameter(bannerConfigurations, "bannerConfigurations");
        this.f51130a = new C20324b(bannerConfigurations);
        this.f51131b = new C20736r2(bannerConfigurations).m55567a(C20323a.f51132a);
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, C20324b> m57297a() {
        return this.f51131b;
    }

    @NotNull
    /* renamed from: b */
    public final C20324b m57296b() {
        return this.f51130a;
    }
}
