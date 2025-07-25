package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC30476hn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class bx1 {

    /* renamed from: a */
    private final AbstractC30476hn f77430a;

    /* renamed from: b */
    private final InterfaceC30057b f77431b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.bx1$a */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC30056a extends AbstractC30760l<String> {

        /* renamed from: d */
        final CharSequence f77432d;

        /* renamed from: e */
        final AbstractC30476hn f77433e;

        /* renamed from: g */
        int f77435g = 0;

        /* renamed from: f */
        final boolean f77434f = false;

        /* renamed from: h */
        int f77436h = Integer.MAX_VALUE;

        /* JADX INFO: Access modifiers changed from: protected */
        public AbstractC30056a(bx1 bx1Var, CharSequence charSequence) {
            this.f77433e = bx1Var.f77430a;
            this.f77432d = charSequence;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.bx1$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC30057b {
    }

    private bx1(ax1 ax1Var, AbstractC30476hn abstractC30476hn) {
        this.f77431b = ax1Var;
        this.f77430a = abstractC30476hn;
    }

    /* renamed from: a */
    public final List<String> m35420a(CharSequence charSequence) {
        charSequence.getClass();
        ax1 ax1Var = (ax1) this.f77431b;
        ax1Var.getClass();
        zw1 zw1Var = new zw1(ax1Var, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zw1Var.hasNext()) {
            arrayList.add(zw1Var.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static bx1 m35422a(char c) {
        return new bx1(new ax1(new AbstractC30476hn.C30478b(c)), AbstractC30476hn.C30480d.f80124c);
    }
}
