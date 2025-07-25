package com.five_corp.p372ad.internal.http.connection;

import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.util.C14118f;
import com.five_corp.p372ad.internal.util.C14119g;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.util.zip.GZIPInputStream;

/* renamed from: com.five_corp.ad.internal.http.connection.a */
/* loaded from: classes4.dex */
public final class C13801a {

    /* renamed from: a */
    public HttpURLConnection f25721a;

    /* renamed from: b */
    public InputStream f25722b = null;

    public C13801a(HttpURLConnection httpURLConnection) {
        this.f25721a = httpURLConnection;
    }

    /* renamed from: a */
    public final C14119g m78349a() {
        try {
            this.f25721a.connect();
            return new C14119g(true, null);
        } catch (SocketTimeoutException e) {
            return new C14119g(false, new C14068s(EnumC14106t.f26498X1, null, e, null));
        } catch (IOException e2) {
            return new C14119g(false, new C14068s(EnumC14106t.f26491W1, null, e2, null));
        } catch (Exception e3) {
            return new C14119g(false, new C14068s(EnumC14106t.f26549e2, null, e3, null));
        }
    }

    /* renamed from: b */
    public final C14118f m78346b() {
        try {
            return new C14118f(true, null, Integer.valueOf(this.f25721a.getResponseCode()));
        } catch (IOException e) {
            return new C14118f(false, new C14068s(EnumC14106t.f26505Y1, null, e, null), null);
        }
    }

    /* renamed from: a */
    public final C14118f m78347a(byte[] bArr) {
        if (this.f25722b == null) {
            try {
                this.f25722b = m78348a(this.f25721a);
            } catch (SocketTimeoutException e) {
                return new C14118f(false, new C14068s(EnumC14106t.f26526b2, null, e, null), null);
            } catch (IOException e2) {
                return new C14118f(false, new C14068s(EnumC14106t.f26512Z1, null, e2, null), null);
            } catch (Exception e3) {
                return new C14118f(false, new C14068s(EnumC14106t.f26519a2, null, e3, null), null);
            }
        }
        try {
            return new C14118f(true, null, Integer.valueOf(this.f25722b.read(bArr)));
        } catch (IOException e4) {
            return new C14118f(false, new C14068s(EnumC14106t.f26533c2, null, e4, null), null);
        } catch (Exception e5) {
            return new C14118f(false, new C14068s(EnumC14106t.f26541d2, null, e5, null), null);
        }
    }

    /* renamed from: a */
    public static InputStream m78348a(HttpURLConnection httpURLConnection) {
        String contentEncoding = httpURLConnection.getContentEncoding();
        return (contentEncoding == null || !contentEncoding.contains("gzip")) ? httpURLConnection.getInputStream() : new GZIPInputStream(httpURLConnection.getInputStream());
    }
}
