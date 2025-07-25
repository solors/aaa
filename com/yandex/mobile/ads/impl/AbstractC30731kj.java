package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* renamed from: com.yandex.mobile.ads.impl.kj */
/* loaded from: classes8.dex */
public abstract class AbstractC30731kj implements InterfaceC30672ju {

    /* renamed from: a */
    private final boolean f81433a;

    /* renamed from: b */
    private final ArrayList<y12> f81434b = new ArrayList<>(1);

    /* renamed from: c */
    private int f81435c;
    @Nullable

    /* renamed from: d */
    private C30976nu f81436d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC30731kj(boolean z) {
        this.f81433a = z;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    /* renamed from: a */
    public final void mo28290a(y12 y12Var) {
        y12Var.getClass();
        if (!this.f81434b.contains(y12Var)) {
            this.f81434b.add(y12Var);
            this.f81435c++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m32537b(C30976nu c30976nu) {
        for (int i = 0; i < this.f81435c; i++) {
            this.f81434b.get(i).getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m32536c(int i) {
        C30976nu c30976nu = this.f81436d;
        int i2 = y32.f88010a;
        for (int i3 = 0; i3 < this.f81435c; i3++) {
            this.f81434b.get(i3).mo27116a(c30976nu, this.f81433a, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final void m32534e() {
        C30976nu c30976nu = this.f81436d;
        int i = y32.f88010a;
        for (int i2 = 0; i2 < this.f81435c; i2++) {
            this.f81434b.get(i2).mo27117a(c30976nu, this.f81433a);
        }
        this.f81436d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m32535c(C30976nu c30976nu) {
        this.f81436d = c30976nu;
        for (int i = 0; i < this.f81435c; i++) {
            this.f81434b.get(i).mo27115b(c30976nu, this.f81433a);
        }
    }
}
