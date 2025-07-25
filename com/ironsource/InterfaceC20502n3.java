package com.ironsource;

import com.ironsource.C20688qf;
import com.ironsource.C21114v8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.n3 */
/* loaded from: classes6.dex */
public interface InterfaceC20502n3 {
    @NotNull

    /* renamed from: a */
    public static final C20507b f52109a = C20507b.f52125a;

    @Metadata
    /* renamed from: com.ironsource.n3$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC20503a extends InterfaceC20502n3 {

        @Metadata
        /* renamed from: com.ironsource.n3$a$a */
        /* loaded from: classes6.dex */
        public static final class C20504a implements InterfaceC20503a {
            @NotNull

            /* renamed from: b */
            private final String f52110b;
            @NotNull

            /* renamed from: c */
            private final String f52111c;
            @NotNull

            /* renamed from: d */
            private final C20688qf.EnumC20693e f52112d;
            @NotNull

            /* renamed from: e */
            private final String f52113e;
            @NotNull

            /* renamed from: f */
            private final String f52114f;
            @NotNull

            /* renamed from: g */
            private final C20505a f52115g;

            /* renamed from: h */
            private final int f52116h;

            /* renamed from: i */
            private final int f52117i;

            @Metadata
            /* renamed from: com.ironsource.n3$a$a$a */
            /* loaded from: classes6.dex */
            public static final class C20505a {

                /* renamed from: a */
                private final int f52118a;

                /* renamed from: b */
                private final int f52119b;

                public C20505a(int i, int i2) {
                    this.f52118a = i;
                    this.f52119b = i2;
                }

                /* renamed from: a */
                public final int m56216a() {
                    return this.f52118a;
                }

                /* renamed from: b */
                public final int m56213b() {
                    return this.f52119b;
                }

                /* renamed from: c */
                public final int m56212c() {
                    return this.f52118a;
                }

                /* renamed from: d */
                public final int m56211d() {
                    return this.f52119b;
                }

                public boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C20505a)) {
                        return false;
                    }
                    C20505a c20505a = (C20505a) obj;
                    if (this.f52118a == c20505a.f52118a && this.f52119b == c20505a.f52119b) {
                        return true;
                    }
                    return false;
                }

                public int hashCode() {
                    return (Integer.hashCode(this.f52118a) * 31) + Integer.hashCode(this.f52119b);
                }

                @NotNull
                public String toString() {
                    return "Coordinates(x=" + this.f52118a + ", y=" + this.f52119b + ')';
                }

                @NotNull
                /* renamed from: a */
                public final C20505a m56215a(int i, int i2) {
                    return new C20505a(i, i2);
                }

                /* renamed from: a */
                public static /* synthetic */ C20505a m56214a(C20505a c20505a, int i, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        i = c20505a.f52118a;
                    }
                    if ((i3 & 2) != 0) {
                        i2 = c20505a.f52119b;
                    }
                    return c20505a.m56215a(i, i2);
                }
            }

            public C20504a(@NotNull String successCallback, @NotNull String failCallback, @NotNull C20688qf.EnumC20693e productType, @NotNull String demandSourceName, @NotNull String url, @NotNull C20505a coordinates, int i, int i2) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                this.f52110b = successCallback;
                this.f52111c = failCallback;
                this.f52112d = productType;
                this.f52113e = demandSourceName;
                this.f52114f = url;
                this.f52115g = coordinates;
                this.f52116h = i;
                this.f52117i = i2;
            }

            @Override // com.ironsource.InterfaceC20502n3
            @NotNull
            /* renamed from: b */
            public C20688qf.EnumC20693e mo56207b() {
                return this.f52112d;
            }

            @Override // com.ironsource.InterfaceC20502n3
            @NotNull
            /* renamed from: c */
            public String mo56206c() {
                return this.f52110b;
            }

            @Override // com.ironsource.InterfaceC20502n3
            @NotNull
            /* renamed from: d */
            public String mo56205d() {
                return this.f52113e;
            }

            @NotNull
            /* renamed from: e */
            public final String m56227e() {
                return mo56206c();
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C20504a)) {
                    return false;
                }
                C20504a c20504a = (C20504a) obj;
                if (Intrinsics.m17075f(mo56206c(), c20504a.mo56206c()) && Intrinsics.m17075f(mo56210a(), c20504a.mo56210a()) && mo56207b() == c20504a.mo56207b() && Intrinsics.m17075f(mo56205d(), c20504a.mo56205d()) && Intrinsics.m17075f(getUrl(), c20504a.getUrl()) && Intrinsics.m17075f(this.f52115g, c20504a.f52115g) && this.f52116h == c20504a.f52116h && this.f52117i == c20504a.f52117i) {
                    return true;
                }
                return false;
            }

            @NotNull
            /* renamed from: f */
            public final String m56226f() {
                return mo56210a();
            }

            @NotNull
            /* renamed from: g */
            public final C20688qf.EnumC20693e m56225g() {
                return mo56207b();
            }

            @Override // com.ironsource.InterfaceC20502n3.InterfaceC20503a
            @NotNull
            public String getUrl() {
                return this.f52114f;
            }

            @NotNull
            /* renamed from: h */
            public final String m56224h() {
                return mo56205d();
            }

            public int hashCode() {
                return (((((((((((((mo56206c().hashCode() * 31) + mo56210a().hashCode()) * 31) + mo56207b().hashCode()) * 31) + mo56205d().hashCode()) * 31) + getUrl().hashCode()) * 31) + this.f52115g.hashCode()) * 31) + Integer.hashCode(this.f52116h)) * 31) + Integer.hashCode(this.f52117i);
            }

            @NotNull
            /* renamed from: i */
            public final String m56223i() {
                return getUrl();
            }

            @NotNull
            /* renamed from: j */
            public final C20505a m56222j() {
                return this.f52115g;
            }

            /* renamed from: k */
            public final int m56221k() {
                return this.f52116h;
            }

            /* renamed from: l */
            public final int m56220l() {
                return this.f52117i;
            }

            /* renamed from: m */
            public final int m56219m() {
                return this.f52116h;
            }

            @NotNull
            /* renamed from: n */
            public final C20505a m56218n() {
                return this.f52115g;
            }

            /* renamed from: o */
            public final int m56217o() {
                return this.f52117i;
            }

            @NotNull
            public String toString() {
                return "Click(successCallback=" + mo56206c() + ", failCallback=" + mo56210a() + ", productType=" + mo56207b() + ", demandSourceName=" + mo56205d() + ", url=" + getUrl() + ", coordinates=" + this.f52115g + ", action=" + this.f52116h + ", metaState=" + this.f52117i + ')';
            }

            @NotNull
            /* renamed from: a */
            public final C20504a m56228a(@NotNull String successCallback, @NotNull String failCallback, @NotNull C20688qf.EnumC20693e productType, @NotNull String demandSourceName, @NotNull String url, @NotNull C20505a coordinates, int i, int i2) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                return new C20504a(successCallback, failCallback, productType, demandSourceName, url, coordinates, i, i2);
            }

            @Override // com.ironsource.InterfaceC20502n3
            @NotNull
            /* renamed from: a */
            public String mo56210a() {
                return this.f52111c;
            }
        }

        @Metadata
        /* renamed from: com.ironsource.n3$a$b */
        /* loaded from: classes6.dex */
        public static final class C20506b implements InterfaceC20503a {
            @NotNull

            /* renamed from: b */
            private final String f52120b;
            @NotNull

            /* renamed from: c */
            private final String f52121c;
            @NotNull

            /* renamed from: d */
            private final C20688qf.EnumC20693e f52122d;
            @NotNull

            /* renamed from: e */
            private final String f52123e;
            @NotNull

            /* renamed from: f */
            private final String f52124f;

            public C20506b(@NotNull String successCallback, @NotNull String failCallback, @NotNull C20688qf.EnumC20693e productType, @NotNull String demandSourceName, @NotNull String url) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                this.f52120b = successCallback;
                this.f52121c = failCallback;
                this.f52122d = productType;
                this.f52123e = demandSourceName;
                this.f52124f = url;
            }

            /* renamed from: a */
            public static /* synthetic */ C20506b m56209a(C20506b c20506b, String str, String str2, C20688qf.EnumC20693e enumC20693e, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c20506b.mo56206c();
                }
                if ((i & 2) != 0) {
                    str2 = c20506b.mo56210a();
                }
                String str5 = str2;
                if ((i & 4) != 0) {
                    enumC20693e = c20506b.mo56207b();
                }
                C20688qf.EnumC20693e enumC20693e2 = enumC20693e;
                if ((i & 8) != 0) {
                    str3 = c20506b.mo56205d();
                }
                String str6 = str3;
                if ((i & 16) != 0) {
                    str4 = c20506b.getUrl();
                }
                return c20506b.m56208a(str, str5, enumC20693e2, str6, str4);
            }

            @Override // com.ironsource.InterfaceC20502n3
            @NotNull
            /* renamed from: b */
            public C20688qf.EnumC20693e mo56207b() {
                return this.f52122d;
            }

            @Override // com.ironsource.InterfaceC20502n3
            @NotNull
            /* renamed from: c */
            public String mo56206c() {
                return this.f52120b;
            }

            @Override // com.ironsource.InterfaceC20502n3
            @NotNull
            /* renamed from: d */
            public String mo56205d() {
                return this.f52123e;
            }

            @NotNull
            /* renamed from: e */
            public final String m56204e() {
                return mo56206c();
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C20506b)) {
                    return false;
                }
                C20506b c20506b = (C20506b) obj;
                if (Intrinsics.m17075f(mo56206c(), c20506b.mo56206c()) && Intrinsics.m17075f(mo56210a(), c20506b.mo56210a()) && mo56207b() == c20506b.mo56207b() && Intrinsics.m17075f(mo56205d(), c20506b.mo56205d()) && Intrinsics.m17075f(getUrl(), c20506b.getUrl())) {
                    return true;
                }
                return false;
            }

            @NotNull
            /* renamed from: f */
            public final String m56203f() {
                return mo56210a();
            }

            @NotNull
            /* renamed from: g */
            public final C20688qf.EnumC20693e m56202g() {
                return mo56207b();
            }

            @Override // com.ironsource.InterfaceC20502n3.InterfaceC20503a
            @NotNull
            public String getUrl() {
                return this.f52124f;
            }

            @NotNull
            /* renamed from: h */
            public final String m56201h() {
                return mo56205d();
            }

            public int hashCode() {
                return (((((((mo56206c().hashCode() * 31) + mo56210a().hashCode()) * 31) + mo56207b().hashCode()) * 31) + mo56205d().hashCode()) * 31) + getUrl().hashCode();
            }

            @NotNull
            /* renamed from: i */
            public final String m56200i() {
                return getUrl();
            }

            @NotNull
            public String toString() {
                return "Impression(successCallback=" + mo56206c() + ", failCallback=" + mo56210a() + ", productType=" + mo56207b() + ", demandSourceName=" + mo56205d() + ", url=" + getUrl() + ')';
            }

            @NotNull
            /* renamed from: a */
            public final C20506b m56208a(@NotNull String successCallback, @NotNull String failCallback, @NotNull C20688qf.EnumC20693e productType, @NotNull String demandSourceName, @NotNull String url) {
                Intrinsics.checkNotNullParameter(successCallback, "successCallback");
                Intrinsics.checkNotNullParameter(failCallback, "failCallback");
                Intrinsics.checkNotNullParameter(productType, "productType");
                Intrinsics.checkNotNullParameter(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullParameter(url, "url");
                return new C20506b(successCallback, failCallback, productType, demandSourceName, url);
            }

            @Override // com.ironsource.InterfaceC20502n3
            @NotNull
            /* renamed from: a */
            public String mo56210a() {
                return this.f52121c;
            }
        }

        @NotNull
        String getUrl();
    }

    @Metadata
    /* renamed from: com.ironsource.n3$b */
    /* loaded from: classes6.dex */
    public static final class C20507b {

        /* renamed from: a */
        static final /* synthetic */ C20507b f52125a = new C20507b();

        private C20507b() {
        }

        /* renamed from: a */
        private final InterfaceC20503a m56198a(JSONObject jSONObject) {
            String successCallback = jSONObject.getString("success");
            String failCallback = jSONObject.getString(C21114v8.C21120f.f53958e);
            String demandSourceName = jSONObject.getString("demandSourceName");
            String string = jSONObject.getString(C21114v8.C21122h.f54077m);
            Intrinsics.checkNotNullExpressionValue(string, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            C20688qf.EnumC20693e valueOf = C20688qf.EnumC20693e.valueOf(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String url = jSONObject2.getString("url");
            String optString = jSONObject2.optString("type");
            if (Intrinsics.m17075f(optString, "click")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(C21170w8.f54325f);
                int i = jSONObject3.getInt(C21170w8.f54326g);
                int i2 = jSONObject3.getInt(C21170w8.f54327h);
                int optInt = jSONObject2.optInt("action", 0);
                int optInt2 = jSONObject2.optInt(C21170w8.f54329j, 0);
                Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                return new InterfaceC20503a.C20504a(successCallback, failCallback, valueOf, demandSourceName, url, new InterfaceC20503a.C20504a.C20505a(i, i2), optInt, optInt2);
            } else if (!Intrinsics.m17075f(optString, "impression")) {
                throw new IllegalArgumentException("JSON does not contain valid type: " + jSONObject2.optString("type"));
            } else {
                Intrinsics.checkNotNullExpressionValue(successCallback, "successCallback");
                Intrinsics.checkNotNullExpressionValue(failCallback, "failCallback");
                Intrinsics.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                Intrinsics.checkNotNullExpressionValue(url, "url");
                return new InterfaceC20503a.C20506b(successCallback, failCallback, valueOf, demandSourceName, url);
            }
        }

        @NotNull
        /* renamed from: a */
        public final InterfaceC20502n3 m56199a(@NotNull String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            JSONObject jSONObject = new JSONObject(jsonString);
            String optString = jSONObject.optString("type", "none");
            if (Intrinsics.m17075f(optString, C21170w8.f54322c)) {
                return m56198a(jSONObject);
            }
            throw new IllegalArgumentException("unsupported message type: " + optString);
        }
    }

    @NotNull
    /* renamed from: a */
    static InterfaceC20502n3 m56230a(@NotNull String str) {
        return f52109a.m56199a(str);
    }

    @NotNull
    /* renamed from: a */
    String mo56210a();

    @NotNull
    /* renamed from: b */
    C20688qf.EnumC20693e mo56207b();

    @NotNull
    /* renamed from: c */
    String mo56206c();

    @NotNull
    /* renamed from: d */
    String mo56205d();
}
