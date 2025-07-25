package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.EnumC14280a;
import com.fyber.inneractive.sdk.cache.session.enums.EnumC14282c;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import java.io.UnsupportedEncodingException;

/* renamed from: com.fyber.inneractive.sdk.cache.session.d */
/* loaded from: classes4.dex */
public final class RunnableC14278d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ EnumC14280a f26984a;

    /* renamed from: b */
    public final /* synthetic */ EnumC14282c f26985b;

    /* renamed from: c */
    public final /* synthetic */ C14279e f26986c;

    public RunnableC14278d(C14279e c14279e, EnumC14280a enumC14280a, EnumC14282c enumC14282c) {
        this.f26986c = c14279e;
        this.f26984a = enumC14280a;
        this.f26985b = enumC14282c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f26986c.f26989c) {
            EnumC14280a enumC14280a = this.f26984a;
            if (enumC14280a != EnumC14280a.NEW_SESSION) {
                C14284g c14284g = (C14284g) this.f26986c.f26987a.f26997a.get(this.f26985b);
                if (c14284g != null) {
                    int i = AbstractC14283f.f26992a[enumC14280a.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                c14284g.f26993a++;
                            }
                        } else {
                            c14284g.f26995c++;
                        }
                    } else {
                        c14284g.f26994b++;
                    }
                }
            } else {
                this.f26986c.f26987a = new C14286i();
            }
            try {
                AbstractC15459m.m76489a(AbstractC15459m.f30607a, C14279e.m78015a(this.f26986c).toString().getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
            this.f26986c.getClass();
        }
    }
}
