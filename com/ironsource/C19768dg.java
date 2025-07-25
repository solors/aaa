package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.C21114v8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* renamed from: com.ironsource.dg */
/* loaded from: classes6.dex */
public final class C19768dg {
    @Nullable

    /* renamed from: a */
    private final String f49775a;
    @Nullable

    /* renamed from: b */
    private final String f49776b;
    @Nullable

    /* renamed from: c */
    private final String f49777c;
    @Nullable

    /* renamed from: d */
    private final String f49778d;
    @Nullable

    /* renamed from: e */
    private final Drawable f49779e;
    @Nullable

    /* renamed from: f */
    private final WebView f49780f;
    @NotNull

    /* renamed from: g */
    private final View f49781g;

    @Metadata
    /* renamed from: com.ironsource.dg$a */
    /* loaded from: classes6.dex */
    public static final class C19769a {
        @NotNull

        /* renamed from: a */
        private final InterfaceC20969sg f49782a;
        @NotNull

        /* renamed from: b */
        private final InterfaceC21058u2 f49783b;

        public C19769a(@NotNull InterfaceC20969sg imageLoader, @NotNull InterfaceC21058u2 adViewManagement) {
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(adViewManagement, "adViewManagement");
            this.f49782a = imageLoader;
            this.f49783b = adViewManagement;
        }

        /* renamed from: b */
        private final Result<Drawable> m58925b(String str) {
            if (str == null) {
                return null;
            }
            return Result.m14550a(this.f49782a.mo54958a(str));
        }

        @NotNull
        /* renamed from: a */
        public final C19770b m58927a(@NotNull Context activityContext, @NotNull JSONObject json) {
            String str;
            String str2;
            String str3;
            String str4;
            String m58809b;
            String m58809b2;
            String m58809b3;
            String m58809b4;
            Intrinsics.checkNotNullParameter(activityContext, "activityContext");
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject optJSONObject = json.optJSONObject("title");
            if (optJSONObject != null) {
                m58809b4 = C19816eg.m58809b(optJSONObject, "text");
                str = m58809b4;
            } else {
                str = null;
            }
            JSONObject optJSONObject2 = json.optJSONObject(C21114v8.C21122h.f54027F0);
            if (optJSONObject2 != null) {
                m58809b3 = C19816eg.m58809b(optJSONObject2, "text");
                str2 = m58809b3;
            } else {
                str2 = null;
            }
            JSONObject optJSONObject3 = json.optJSONObject("body");
            if (optJSONObject3 != null) {
                m58809b2 = C19816eg.m58809b(optJSONObject3, "text");
                str3 = m58809b2;
            } else {
                str3 = null;
            }
            JSONObject optJSONObject4 = json.optJSONObject("cta");
            if (optJSONObject4 != null) {
                m58809b = C19816eg.m58809b(optJSONObject4, "text");
                str4 = m58809b;
            } else {
                str4 = null;
            }
            JSONObject optJSONObject5 = json.optJSONObject("icon");
            String m58809b5 = optJSONObject5 != null ? C19816eg.m58809b(optJSONObject5, "url") : null;
            JSONObject optJSONObject6 = json.optJSONObject("media");
            String m58809b6 = optJSONObject6 != null ? C19816eg.m58809b(optJSONObject6, "adViewId") : null;
            JSONObject optJSONObject7 = json.optJSONObject(C21114v8.C21122h.f54035J0);
            return new C19770b(new C19770b.C19771a(str, str2, str3, str4, m58925b(m58809b5), m58926a(m58809b6), C20283lo.f51035a.m57370a(activityContext, optJSONObject7 != null ? C19816eg.m58809b(optJSONObject7, "url") : null, this.f49782a)));
        }

        /* renamed from: a */
        private final Result<WebView> m58926a(String str) {
            Object m14549b;
            if (str == null) {
                return null;
            }
            InterfaceC20048hg mo54697a = this.f49783b.mo54697a(str);
            WebView presentingView = mo54697a != null ? mo54697a.getPresentingView() : null;
            if (presentingView == null) {
                Result.C38506a c38506a = Result.f101870c;
                m14549b = Result.m14549b(C38508r.m14540a(new Exception("missing adview for id: '" + str + '\'')));
            } else {
                m14549b = Result.m14549b(presentingView);
            }
            return Result.m14550a(m14549b);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.dg$b */
    /* loaded from: classes6.dex */
    public static final class C19770b {
        @NotNull

        /* renamed from: a */
        private final C19771a f49784a;

        @Metadata
        /* renamed from: com.ironsource.dg$b$a */
        /* loaded from: classes6.dex */
        public static final class C19771a {
            @Nullable

            /* renamed from: a */
            private final String f49785a;
            @Nullable

            /* renamed from: b */
            private final String f49786b;
            @Nullable

            /* renamed from: c */
            private final String f49787c;
            @Nullable

            /* renamed from: d */
            private final String f49788d;
            @Nullable

            /* renamed from: e */
            private final Result<Drawable> f49789e;
            @Nullable

            /* renamed from: f */
            private final Result<WebView> f49790f;
            @NotNull

            /* renamed from: g */
            private final View f49791g;

            /* JADX WARN: Multi-variable type inference failed */
            public C19771a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Result<? extends Drawable> result, @Nullable Result<? extends WebView> result2, @NotNull View privacyIcon) {
                Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                this.f49785a = str;
                this.f49786b = str2;
                this.f49787c = str3;
                this.f49788d = str4;
                this.f49789e = result;
                this.f49790f = result2;
                this.f49791g = privacyIcon;
            }

            /* renamed from: a */
            public static /* synthetic */ C19771a m58919a(C19771a c19771a, String str, String str2, String str3, String str4, Result result, Result result2, View view, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c19771a.f49785a;
                }
                if ((i & 2) != 0) {
                    str2 = c19771a.f49786b;
                }
                String str5 = str2;
                if ((i & 4) != 0) {
                    str3 = c19771a.f49787c;
                }
                String str6 = str3;
                if ((i & 8) != 0) {
                    str4 = c19771a.f49788d;
                }
                String str7 = str4;
                Result<Drawable> result3 = result;
                if ((i & 16) != 0) {
                    result3 = c19771a.f49789e;
                }
                Result result4 = result3;
                Result<WebView> result5 = result2;
                if ((i & 32) != 0) {
                    result5 = c19771a.f49790f;
                }
                Result result6 = result5;
                if ((i & 64) != 0) {
                    view = c19771a.f49791g;
                }
                return c19771a.m58918a(str, str5, str6, str7, result4, result6, view);
            }

            @Nullable
            /* renamed from: b */
            public final String m58917b() {
                return this.f49786b;
            }

            @Nullable
            /* renamed from: c */
            public final String m58916c() {
                return this.f49787c;
            }

            @Nullable
            /* renamed from: d */
            public final String m58915d() {
                return this.f49788d;
            }

            @Nullable
            /* renamed from: e */
            public final Result<Drawable> m58914e() {
                return this.f49789e;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C19771a)) {
                    return false;
                }
                C19771a c19771a = (C19771a) obj;
                if (Intrinsics.m17075f(this.f49785a, c19771a.f49785a) && Intrinsics.m17075f(this.f49786b, c19771a.f49786b) && Intrinsics.m17075f(this.f49787c, c19771a.f49787c) && Intrinsics.m17075f(this.f49788d, c19771a.f49788d) && Intrinsics.m17075f(this.f49789e, c19771a.f49789e) && Intrinsics.m17075f(this.f49790f, c19771a.f49790f) && Intrinsics.m17075f(this.f49791g, c19771a.f49791g)) {
                    return true;
                }
                return false;
            }

            @Nullable
            /* renamed from: f */
            public final Result<WebView> m58913f() {
                return this.f49790f;
            }

            @NotNull
            /* renamed from: g */
            public final View m58912g() {
                return this.f49791g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @NotNull
            /* renamed from: h */
            public final C19768dg m58911h() {
                Drawable drawable;
                String str = this.f49785a;
                String str2 = this.f49786b;
                String str3 = this.f49787c;
                String str4 = this.f49788d;
                Result<Drawable> result = this.f49789e;
                WebView webView = null;
                if (result != null) {
                    Object m14541j = result.m14541j();
                    if (Result.m14544g(m14541j)) {
                        m14541j = null;
                    }
                    drawable = (Drawable) m14541j;
                } else {
                    drawable = null;
                }
                Result<WebView> result2 = this.f49790f;
                if (result2 != null) {
                    Object m14541j2 = result2.m14541j();
                    if (!Result.m14544g(m14541j2)) {
                        webView = m14541j2;
                    }
                    webView = webView;
                }
                return new C19768dg(str, str2, str3, str4, drawable, webView, this.f49791g);
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3;
                int hashCode4;
                int m14545f;
                String str = this.f49785a;
                int i = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i2 = hashCode * 31;
                String str2 = this.f49786b;
                if (str2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str2.hashCode();
                }
                int i3 = (i2 + hashCode2) * 31;
                String str3 = this.f49787c;
                if (str3 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = str3.hashCode();
                }
                int i4 = (i3 + hashCode3) * 31;
                String str4 = this.f49788d;
                if (str4 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = str4.hashCode();
                }
                int i5 = (i4 + hashCode4) * 31;
                Result<Drawable> result = this.f49789e;
                if (result == null) {
                    m14545f = 0;
                } else {
                    m14545f = Result.m14545f(result.m14541j());
                }
                int i6 = (i5 + m14545f) * 31;
                Result<WebView> result2 = this.f49790f;
                if (result2 != null) {
                    i = Result.m14545f(result2.m14541j());
                }
                return ((i6 + i) * 31) + this.f49791g.hashCode();
            }

            @Nullable
            /* renamed from: i */
            public final String m58910i() {
                return this.f49786b;
            }

            @Nullable
            /* renamed from: j */
            public final String m58909j() {
                return this.f49787c;
            }

            @Nullable
            /* renamed from: k */
            public final String m58908k() {
                return this.f49788d;
            }

            @Nullable
            /* renamed from: l */
            public final Result<Drawable> m58907l() {
                return this.f49789e;
            }

            @Nullable
            /* renamed from: m */
            public final Result<WebView> m58906m() {
                return this.f49790f;
            }

            @NotNull
            /* renamed from: n */
            public final View m58905n() {
                return this.f49791g;
            }

            @Nullable
            /* renamed from: o */
            public final String m58904o() {
                return this.f49785a;
            }

            @NotNull
            public String toString() {
                return "Data(title=" + this.f49785a + ", advertiser=" + this.f49786b + ", body=" + this.f49787c + ", cta=" + this.f49788d + ", icon=" + this.f49789e + ", media=" + this.f49790f + ", privacyIcon=" + this.f49791g + ')';
            }

            @NotNull
            /* renamed from: a */
            public final C19771a m58918a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Result<? extends Drawable> result, @Nullable Result<? extends WebView> result2, @NotNull View privacyIcon) {
                Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
                return new C19771a(str, str2, str3, str4, result, result2, privacyIcon);
            }

            @Nullable
            /* renamed from: a */
            public final String m58920a() {
                return this.f49785a;
            }
        }

        public C19770b(@NotNull C19771a data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f49784a = data;
        }

        @NotNull
        /* renamed from: a */
        public final C19771a m58924a() {
            return this.f49784a;
        }

        @NotNull
        /* renamed from: b */
        public final JSONObject m58921b() {
            JSONObject jSONObject = new JSONObject();
            if (this.f49784a.m58904o() != null) {
                m58923a(jSONObject, "title");
            }
            if (this.f49784a.m58910i() != null) {
                m58923a(jSONObject, C21114v8.C21122h.f54027F0);
            }
            if (this.f49784a.m58909j() != null) {
                m58923a(jSONObject, "body");
            }
            if (this.f49784a.m58908k() != null) {
                m58923a(jSONObject, "cta");
            }
            Result<Drawable> m58907l = this.f49784a.m58907l();
            if (m58907l != null) {
                m58922a(jSONObject, "icon", m58907l.m14541j());
            }
            Result<WebView> m58906m = this.f49784a.m58906m();
            if (m58906m != null) {
                m58922a(jSONObject, "media", m58906m.m14541j());
            }
            return jSONObject;
        }

        /* renamed from: a */
        private static final void m58923a(JSONObject jSONObject, String str) {
            jSONObject.put(str, new JSONObject().put("success", true));
        }

        /* renamed from: a */
        private static final <T> void m58922a(JSONObject jSONObject, String str, Object obj) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", Result.m14543h(obj));
            Throwable m14546e = Result.m14546e(obj);
            if (m14546e != null) {
                String message = m14546e.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObject2.put("reason", message);
            }
            Unit unit = Unit.f99208a;
            jSONObject.put(str, jSONObject2);
        }
    }

    public C19768dg(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Drawable drawable, @Nullable WebView webView, @NotNull View privacyIcon) {
        Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        this.f49775a = str;
        this.f49776b = str2;
        this.f49777c = str3;
        this.f49778d = str4;
        this.f49779e = drawable;
        this.f49780f = webView;
        this.f49781g = privacyIcon;
    }

    /* renamed from: a */
    public static /* synthetic */ C19768dg m58942a(C19768dg c19768dg, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c19768dg.f49775a;
        }
        if ((i & 2) != 0) {
            str2 = c19768dg.f49776b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = c19768dg.f49777c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = c19768dg.f49778d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            drawable = c19768dg.f49779e;
        }
        Drawable drawable2 = drawable;
        if ((i & 32) != 0) {
            webView = c19768dg.f49780f;
        }
        WebView webView2 = webView;
        if ((i & 64) != 0) {
            view = c19768dg.f49781g;
        }
        return c19768dg.m58941a(str, str5, str6, str7, drawable2, webView2, view);
    }

    @Nullable
    /* renamed from: b */
    public final String m58940b() {
        return this.f49776b;
    }

    @Nullable
    /* renamed from: c */
    public final String m58939c() {
        return this.f49777c;
    }

    @Nullable
    /* renamed from: d */
    public final String m58938d() {
        return this.f49778d;
    }

    @Nullable
    /* renamed from: e */
    public final Drawable m58937e() {
        return this.f49779e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19768dg)) {
            return false;
        }
        C19768dg c19768dg = (C19768dg) obj;
        if (Intrinsics.m17075f(this.f49775a, c19768dg.f49775a) && Intrinsics.m17075f(this.f49776b, c19768dg.f49776b) && Intrinsics.m17075f(this.f49777c, c19768dg.f49777c) && Intrinsics.m17075f(this.f49778d, c19768dg.f49778d) && Intrinsics.m17075f(this.f49779e, c19768dg.f49779e) && Intrinsics.m17075f(this.f49780f, c19768dg.f49780f) && Intrinsics.m17075f(this.f49781g, c19768dg.f49781g)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final WebView m58936f() {
        return this.f49780f;
    }

    @NotNull
    /* renamed from: g */
    public final View m58935g() {
        return this.f49781g;
    }

    @Nullable
    /* renamed from: h */
    public final String m58934h() {
        return this.f49776b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.f49775a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.f49776b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f49777c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.f49778d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Drawable drawable = this.f49779e;
        if (drawable == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = drawable.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        WebView webView = this.f49780f;
        if (webView != null) {
            i = webView.hashCode();
        }
        return ((i6 + i) * 31) + this.f49781g.hashCode();
    }

    @Nullable
    /* renamed from: i */
    public final String m58933i() {
        return this.f49777c;
    }

    @Nullable
    /* renamed from: j */
    public final String m58932j() {
        return this.f49778d;
    }

    @Nullable
    /* renamed from: k */
    public final Drawable m58931k() {
        return this.f49779e;
    }

    @Nullable
    /* renamed from: l */
    public final WebView m58930l() {
        return this.f49780f;
    }

    @NotNull
    /* renamed from: m */
    public final View m58929m() {
        return this.f49781g;
    }

    @Nullable
    /* renamed from: n */
    public final String m58928n() {
        return this.f49775a;
    }

    @NotNull
    public String toString() {
        return "ISNNativeAdData(title=" + this.f49775a + ", advertiser=" + this.f49776b + ", body=" + this.f49777c + ", cta=" + this.f49778d + ", icon=" + this.f49779e + ", mediaView=" + this.f49780f + ", privacyIcon=" + this.f49781g + ')';
    }

    @NotNull
    /* renamed from: a */
    public final C19768dg m58941a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Drawable drawable, @Nullable WebView webView, @NotNull View privacyIcon) {
        Intrinsics.checkNotNullParameter(privacyIcon, "privacyIcon");
        return new C19768dg(str, str2, str3, str4, drawable, webView, privacyIcon);
    }

    @Nullable
    /* renamed from: a */
    public final String m58943a() {
        return this.f49775a;
    }
}
