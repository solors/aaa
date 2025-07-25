package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.AbstractC24405t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n */
/* loaded from: classes7.dex */
public abstract class AbstractC24735n {
    @NotNull

    /* renamed from: b */
    public static final C24737b f63864b = new C24737b(null);
    @NotNull

    /* renamed from: a */
    public final String f63865a;

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n$a */
    /* loaded from: classes7.dex */
    public static final class C24736a extends AbstractC24735n {
        @NotNull

        /* renamed from: c */
        public static final C24736a f63866c = new C24736a();

        public C24736a() {
            super("close", null);
        }
    }

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n$b */
    /* loaded from: classes7.dex */
    public static final class C24737b {

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n$b$a */
        /* loaded from: classes7.dex */
        public static final class C24738a {

            /* renamed from: a */
            public final boolean f63867a;
            @NotNull

            /* renamed from: b */
            public final String f63868b;

            public C24738a(boolean z, @NotNull String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                this.f63867a = z;
                this.f63868b = description;
            }

            /* renamed from: a */
            public final boolean m45795a() {
                return this.f63867a;
            }
        }

        public /* synthetic */ C24737b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final AbstractC24405t<AbstractC24735n, C24738a> m45801a(@Nullable String str) {
            Object m14549b;
            try {
                Result.C38506a c38506a = Result.f101870c;
                m14549b = Result.m14549b(Uri.parse(str));
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                m14549b = Result.m14549b(C38508r.m14540a(th));
            }
            Object obj = null;
            if (Result.m14544g(m14549b)) {
                m14549b = null;
            }
            Uri uri = (Uri) m14549b;
            if (uri == null) {
                return new AbstractC24405t.C24406a(new C24738a(false, "Invalid url: " + str));
            } else if (!Intrinsics.m17075f(uri.getScheme(), "mraid")) {
                return new AbstractC24405t.C24406a(new C24738a(false, "Non-mraid url scheme: " + str));
            } else {
                Map<String, String> m45798d = m45798d(uri);
                String host = uri.getHost();
                if (host != null) {
                    switch (host.hashCode()) {
                        case -1289167206:
                            if (host.equals("expand")) {
                                obj = m45800b(m45798d);
                                break;
                            }
                            break;
                        case -934437708:
                            if (host.equals("resize")) {
                                m45799c();
                                break;
                            }
                            break;
                        case 3417674:
                            if (host.equals("open")) {
                                obj = m45797e(m45798d);
                                break;
                            }
                            break;
                        case 94756344:
                            if (host.equals("close")) {
                                obj = C24736a.f63866c;
                                break;
                            }
                            break;
                        case 133423073:
                            if (host.equals("setOrientationProperties")) {
                                obj = m45796f(m45798d);
                                break;
                            }
                            break;
                    }
                }
                if (obj != null) {
                    return new AbstractC24405t.C24407b(obj);
                }
                return new AbstractC24405t.C24406a(new C24738a(true, "Unknown/unsupported mraid command " + uri.getHost()));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public final C24739c m45800b(Map<String, String> map) {
            Uri uri;
            String str = map.get("url");
            Uri uri2 = null;
            if (str != null) {
                try {
                    Result.C38506a c38506a = Result.f101870c;
                    uri = Result.m14549b(Uri.parse(str));
                } catch (Throwable th) {
                    Result.C38506a c38506a2 = Result.f101870c;
                    uri = Result.m14549b(C38508r.m14540a(th));
                }
                if (!Result.m14544g(uri)) {
                    uri2 = uri;
                }
                uri2 = uri2;
            }
            return new C24739c(uri2);
        }

        /* renamed from: c */
        public final C24741e m45799c() {
            return null;
        }

        /* renamed from: d */
        public final Map<String, String> m45798d(Uri uri) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String queryParam : uri.getQueryParameterNames()) {
                Intrinsics.checkNotNullExpressionValue(queryParam, "queryParam");
                String join = TextUtils.join(",", uri.getQueryParameters(queryParam));
                Intrinsics.checkNotNullExpressionValue(join, "join(\",\", getQueryParameters(queryParam))");
                linkedHashMap.put(queryParam, join);
            }
            return linkedHashMap;
        }

        /* renamed from: e */
        public final C24740d m45797e(Map<String, String> map) {
            Object m14549b;
            String str = map.get("url");
            C24740d c24740d = null;
            if (str == null) {
                return null;
            }
            try {
                Result.C38506a c38506a = Result.f101870c;
                Uri parse = Uri.parse(str);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(rawOpenUrl)");
                m14549b = Result.m14549b(new C24740d(parse));
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                m14549b = Result.m14549b(C38508r.m14540a(th));
            }
            if (!Result.m14544g(m14549b)) {
                c24740d = m14549b;
            }
            return c24740d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
            r0 = kotlin.text.C37690r.m16573a1(r0);
         */
        /* renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.AbstractC24735n.C24742f m45796f(java.util.Map<java.lang.String, java.lang.String> r5) {
            /*
                r4 = this;
                java.lang.String r0 = "allowOrientationChange"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r1 = 0
                if (r0 == 0) goto L2b
                java.lang.Boolean r0 = kotlin.text.C37686h.m16695a1(r0)
                if (r0 == 0) goto L2b
                boolean r0 = r0.booleanValue()
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p$a r2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.EnumC24744p.f63873b
                java.lang.String r3 = "forceOrientation"
                java.lang.Object r5 = r5.get(r3)
                java.lang.String r5 = (java.lang.String) r5
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p r5 = r2.m45789a(r5)
                if (r5 != 0) goto L26
                return r1
            L26:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n$f r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n$f
                r1.<init>(r0, r5)
            L2b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.AbstractC24735n.C24737b.m45796f(java.util.Map):com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n$f");
        }

        public C24737b() {
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n$c */
    /* loaded from: classes7.dex */
    public static final class C24739c extends AbstractC24735n {
        @Nullable

        /* renamed from: c */
        public final Uri f63869c;

        public C24739c(@Nullable Uri uri) {
            super("expand", null);
            this.f63869c = uri;
        }

        @Nullable
        /* renamed from: b */
        public final Uri m45794b() {
            return this.f63869c;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n$d */
    /* loaded from: classes7.dex */
    public static final class C24740d extends AbstractC24735n {
        @NotNull

        /* renamed from: c */
        public final Uri f63870c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24740d(@NotNull Uri uri) {
            super("open", null);
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f63870c = uri;
        }

        @NotNull
        /* renamed from: b */
        public final Uri m45793b() {
            return this.f63870c;
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n$e */
    /* loaded from: classes7.dex */
    public static final class C24741e extends AbstractC24735n {
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.n$f */
    /* loaded from: classes7.dex */
    public static final class C24742f extends AbstractC24735n {

        /* renamed from: c */
        public final boolean f63871c;
        @NotNull

        /* renamed from: d */
        public final EnumC24744p f63872d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24742f(boolean z, @NotNull EnumC24744p forceOrientation) {
            super("setOrientationProperties", null);
            Intrinsics.checkNotNullParameter(forceOrientation, "forceOrientation");
            this.f63871c = z;
            this.f63872d = forceOrientation;
        }

        @NotNull
        /* renamed from: b */
        public final EnumC24744p m45792b() {
            return this.f63872d;
        }
    }

    public /* synthetic */ AbstractC24735n(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    /* renamed from: a */
    public final String m45802a() {
        return this.f63865a;
    }

    public AbstractC24735n(String str) {
        this.f63865a = str;
    }
}
