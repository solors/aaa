package com.fyber.inneractive.sdk.network;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.l */
/* loaded from: classes4.dex */
public class C14714l {

    /* renamed from: a */
    public int f27882a;

    /* renamed from: b */
    public final String f27883b;

    /* renamed from: c */
    public InputStream f27884c;

    /* renamed from: d */
    public Map f27885d;

    /* renamed from: e */
    public String f27886e;

    /* renamed from: f */
    public final ArrayList f27887f = new ArrayList();

    public C14714l() {
    }

    /* renamed from: a */
    public void mo77681a() {
        InputStream inputStream = this.f27884c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public C14714l(FilterInputStream filterInputStream, int i, String str, Map map, String str2) {
        this.f27884c = filterInputStream;
        this.f27882a = i;
        this.f27883b = str;
        this.f27885d = map;
        this.f27886e = str2;
    }
}
