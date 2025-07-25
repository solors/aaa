package com.chartboost.sdk.impl;

import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import p804nd.C38508r;
import p804nd.Result;

/* renamed from: com.chartboost.sdk.impl.ab */
/* loaded from: classes3.dex */
public final class C9677ab {

    /* renamed from: a */
    public final Function1 f21571a;

    /* renamed from: b */
    public final SSLSocketFactory f21572b;

    /* renamed from: com.chartboost.sdk.impl.ab$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9678a extends FunctionReferenceImpl implements Function1 {

        /* renamed from: b */
        public static final C9678a f21573b = new C9678a();

        public C9678a() {
            super(1, URL.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final URL invoke(String str) {
            return new URL(str);
        }
    }

    /* renamed from: com.chartboost.sdk.impl.ab$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC9679b extends Exception {

        /* renamed from: com.chartboost.sdk.impl.ab$b$a */
        /* loaded from: classes3.dex */
        public static final class C9680a extends AbstractC9679b {

            /* renamed from: b */
            public static final C9680a f21574b = new C9680a();

            public C9680a() {
                super("Empty or null URL", null, 2, null);
            }
        }

        /* renamed from: com.chartboost.sdk.impl.ab$b$b */
        /* loaded from: classes3.dex */
        public static final class C9681b extends AbstractC9679b {

            /* renamed from: b */
            public final int f21575b;

            public C9681b(int i) {
                super("Failed with HTTP code " + i, null, 2, null);
                this.f21575b = i;
            }
        }

        /* renamed from: com.chartboost.sdk.impl.ab$b$c */
        /* loaded from: classes3.dex */
        public static final class C9682c extends AbstractC9679b {

            /* renamed from: b */
            public static final C9682c f21576b = new C9682c();

            public C9682c() {
                super("Returned connection is null", null, 2, null);
            }
        }

        /* renamed from: com.chartboost.sdk.impl.ab$b$d */
        /* loaded from: classes3.dex */
        public static final class C9683d extends AbstractC9679b {

            /* renamed from: b */
            public static final C9683d f21577b = new C9683d();

            public C9683d() {
                super("Too many redirects", null, 2, null);
            }
        }

        /* renamed from: com.chartboost.sdk.impl.ab$b$e */
        /* loaded from: classes3.dex */
        public static final class C9684e extends AbstractC9679b {

            /* renamed from: b */
            public final String f21578b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9684e(String url, Throwable cause) {
                super("Uncontrolled error", cause, null);
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.f21578b = url;
            }

            /* renamed from: a */
            public final String m82093a() {
                return this.f21578b;
            }

            @Override // com.chartboost.sdk.impl.C9677ab.AbstractC9679b, java.lang.Throwable
            public String toString() {
                String th;
                Throwable cause = getCause();
                if (cause == null || (th = cause.toString()) == null) {
                    return "No cause";
                }
                return th;
            }
        }

        public AbstractC9679b(String str, Throwable th) {
            super(str, th);
        }

        @Override // java.lang.Throwable
        public String toString() {
            String message = getMessage();
            if (message == null) {
                return "No message";
            }
            return message;
        }

        public /* synthetic */ AbstractC9679b(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th, null);
        }

        public /* synthetic */ AbstractC9679b(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th);
        }
    }

    public C9677ab(Function1 urlFactory, SSLSocketFactory sslSocket) {
        Intrinsics.checkNotNullParameter(urlFactory, "urlFactory");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        this.f21571a = urlFactory;
        this.f21572b = sslSocket;
    }

    /* renamed from: a */
    public final Object m82099a(AbstractC9679b abstractC9679b) {
        Result.C38506a c38506a = Result.f101870c;
        return Result.m14549b(C38508r.m14540a(abstractC9679b));
    }

    /* renamed from: b */
    public final boolean m82095b(int i) {
        int m80762b = EnumC10145q5.f22976c.m80762b();
        if (i <= EnumC10145q5.f22977d.m80762b() && m80762b <= i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m82100a(int i) {
        return i <= EnumC10145q5.f22979f.m80762b() && EnumC10145q5.f22978e.m80762b() <= i;
    }

    /* renamed from: a */
    public final HttpsURLConnection m82096a(URL url) {
        URLConnection openConnection = url.openConnection();
        HttpsURLConnection httpsURLConnection = openConnection instanceof HttpsURLConnection ? (HttpsURLConnection) openConnection : null;
        if (httpsURLConnection != null) {
            httpsURLConnection.setSSLSocketFactory(this.f21572b);
            httpsURLConnection.setInstanceFollowRedirects(false);
            httpsURLConnection.setConnectTimeout(10000);
            httpsURLConnection.setReadTimeout(10000);
            return httpsURLConnection;
        }
        return null;
    }

    public /* synthetic */ C9677ab(Function1 function1, SSLSocketFactory sSLSocketFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C9678a.f21573b : function1, (i & 2) != 0 ? AbstractC9994k2.f22465a.m81230a() : sSLSocketFactory);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
        if (r2 != null) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.String] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m82097a(java.lang.String r8, int r9) {
        /*
            r7 = this;
            if (r8 == 0) goto Lbe
            int r0 = r8.length()
            if (r0 != 0) goto La
            goto Lbe
        La:
            if (r9 >= 0) goto L13
            com.chartboost.sdk.impl.ab$b$d r8 = com.chartboost.sdk.impl.C9677ab.AbstractC9679b.C9683d.f21577b
            java.lang.Object r8 = r7.m82099a(r8)
            return r8
        L13:
            r0 = 0
            kotlin.jvm.functions.Function1 r1 = r7.f21571a     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            java.lang.Object r1 = r1.invoke(r8)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            java.net.URL r1 = (java.net.URL) r1     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            javax.net.ssl.HttpsURLConnection r2 = r7.m82096a(r1)     // Catch: java.lang.Throwable -> L91 java.lang.Exception -> L93
            if (r2 == 0) goto L82
            int r3 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            boolean r3 = r7.m82095b(r3)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            if (r3 == 0) goto L31
            java.lang.Object r8 = p804nd.Result.m14549b(r8)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            goto L88
        L31:
            int r3 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            boolean r3 = r7.m82100a(r3)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            if (r3 == 0) goto L74
            java.lang.String r3 = "Location"
            java.lang.String r3 = r2.getHeaderField(r3)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            kotlin.jvm.internal.Intrinsics.m17074g(r3)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r4 = "/"
            r5 = 0
            r6 = 2
            boolean r0 = kotlin.text.C37686h.m16713M(r3, r4, r5, r6, r0)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            if (r0 == 0) goto L6d
            java.lang.String r0 = r1.getProtocol()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r1 = r1.getHost()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            r4.<init>()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            r4.append(r0)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r0 = "://"
            r4.append(r0)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            r4.append(r1)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            r4.append(r3)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
        L6d:
            int r9 = r9 + (-1)
            java.lang.Object r8 = r7.m82097a(r3, r9)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            goto L88
        L74:
            com.chartboost.sdk.impl.ab$b$b r9 = new com.chartboost.sdk.impl.ab$b$b     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            int r0 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.Object r8 = r7.m82099a(r9)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            goto L88
        L82:
            com.chartboost.sdk.impl.ab$b$c r9 = com.chartboost.sdk.impl.C9677ab.AbstractC9679b.C9682c.f21576b     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
            java.lang.Object r8 = r7.m82099a(r9)     // Catch: java.lang.Throwable -> L8b java.lang.Exception -> L8e
        L88:
            if (r2 == 0) goto Lb7
            goto Lb4
        L8b:
            r8 = move-exception
            r0 = r2
            goto Lb8
        L8e:
            r9 = move-exception
            r0 = r2
            goto L94
        L91:
            r8 = move-exception
            goto Lb8
        L93:
            r9 = move-exception
        L94:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L91
            r1.<init>()     // Catch: java.lang.Throwable -> L91
            java.lang.String r2 = "Cannot redirect "
            r1.append(r2)     // Catch: java.lang.Throwable -> L91
            r1.append(r8)     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L91
            com.chartboost.sdk.impl.C9763c7.m81920b(r1, r9)     // Catch: java.lang.Throwable -> L91
            com.chartboost.sdk.impl.ab$b$e r1 = new com.chartboost.sdk.impl.ab$b$e     // Catch: java.lang.Throwable -> L91
            r1.<init>(r8, r9)     // Catch: java.lang.Throwable -> L91
            java.lang.Object r8 = r7.m82099a(r1)     // Catch: java.lang.Throwable -> L91
            if (r0 == 0) goto Lb7
            r2 = r0
        Lb4:
            r2.disconnect()
        Lb7:
            return r8
        Lb8:
            if (r0 == 0) goto Lbd
            r0.disconnect()
        Lbd:
            throw r8
        Lbe:
            com.chartboost.sdk.impl.ab$b$a r8 = com.chartboost.sdk.impl.C9677ab.AbstractC9679b.C9680a.f21574b
            java.lang.Object r8 = r7.m82099a(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.C9677ab.m82097a(java.lang.String, int):java.lang.Object");
    }

    /* renamed from: a */
    public static /* synthetic */ Object m82098a(C9677ab c9677ab, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 10;
        }
        return c9677ab.m82097a(str, i);
    }
}
