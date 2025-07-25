package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class pz1 implements InterfaceC30672ju {

    /* renamed from: a */
    private final InterfaceC30672ju f84130a;

    /* renamed from: b */
    private final InterfaceC30580iu f84131b;

    /* renamed from: c */
    private boolean f84132c;

    /* renamed from: d */
    private long f84133d;

    public pz1(InterfaceC30672ju interfaceC30672ju, C31592ul c31592ul) {
        this.f84130a = (InterfaceC30672ju) C30937nf.m31570a(interfaceC30672ju);
        this.f84131b = (InterfaceC30580iu) C30937nf.m31570a(c31592ul);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    /* renamed from: a */
    public final void mo28290a(y12 y12Var) {
        y12Var.getClass();
        this.f84130a.mo28290a(y12Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    public final void close() throws IOException {
        try {
            this.f84130a.close();
        } finally {
            if (this.f84132c) {
                this.f84132c = false;
                this.f84131b.close();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f84130a.getResponseHeaders();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    @Nullable
    public final Uri getUri() {
        return this.f84130a.getUri();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30417gu
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f84133d == 0) {
            return -1;
        }
        int read = this.f84130a.read(bArr, i, i2);
        if (read > 0) {
            this.f84131b.write(bArr, i, read);
            long j = this.f84133d;
            if (j != -1) {
                this.f84133d = j - read;
            }
        }
        return read;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    /* renamed from: a */
    public final long mo27541a(C30976nu c30976nu) throws IOException {
        long mo27541a = this.f84130a.mo27541a(c30976nu);
        this.f84133d = mo27541a;
        if (mo27541a == 0) {
            return 0L;
        }
        if (c30976nu.f83117g == -1 && mo27541a != -1) {
            c30976nu = c30976nu.m31292a(mo27541a);
        }
        this.f84132c = true;
        this.f84131b.mo28738a(c30976nu);
        return this.f84133d;
    }
}
