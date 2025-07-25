package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.tracker.network.C22909h;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: HttpResponse.java */
/* renamed from: com.mbridge.msdk.tracker.network.toolbox.g */
/* loaded from: classes6.dex */
public final class C22922g {

    /* renamed from: a */
    private final int f59829a;

    /* renamed from: b */
    private final List<C22909h> f59830b;

    /* renamed from: c */
    private final int f59831c;

    /* renamed from: d */
    private final InputStream f59832d;

    /* renamed from: e */
    private final byte[] f59833e;

    public C22922g(int i, List<C22909h> list) {
        this(i, list, -1, null);
    }

    /* renamed from: a */
    public final int m49439a() {
        return this.f59829a;
    }

    /* renamed from: b */
    public final List<C22909h> m49438b() {
        return Collections.unmodifiableList(this.f59830b);
    }

    /* renamed from: c */
    public final int m49437c() {
        return this.f59831c;
    }

    /* renamed from: d */
    public final InputStream m49436d() {
        InputStream inputStream = this.f59832d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f59833e != null) {
            return new ByteArrayInputStream(this.f59833e);
        }
        return null;
    }

    public C22922g(int i, List<C22909h> list, int i2, InputStream inputStream) {
        this.f59829a = i;
        this.f59830b = list;
        this.f59831c = i2;
        this.f59832d = inputStream;
        this.f59833e = null;
    }
}
