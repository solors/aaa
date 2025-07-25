package com.taurusx.tax.p597g.p599b;

import com.taurusx.tax.p578b.C28207b;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.taurusx.tax.g.b.i */
/* loaded from: classes7.dex */
public class C28405i extends ProxySelector {

    /* renamed from: d */
    public static final List<Proxy> f73816d = Arrays.asList(Proxy.NO_PROXY);

    /* renamed from: a */
    public final ProxySelector f73817a;

    /* renamed from: b */
    public final String f73818b;

    /* renamed from: c */
    public final int f73819c;

    public C28405i(ProxySelector proxySelector, String str, int i) {
        this.f73817a = (ProxySelector) C28207b.m38455a(proxySelector);
        this.f73818b = (String) C28207b.m38455a(str);
        this.f73819c = i;
    }

    /* renamed from: a */
    public static void m38126a(String str, int i) {
        ProxySelector.setDefault(new C28405i(ProxySelector.getDefault(), str, i));
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f73817a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        boolean z;
        if (this.f73818b.equals(uri.getHost()) && this.f73819c == uri.getPort()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return f73816d;
        }
        return this.f73817a.select(uri);
    }
}
