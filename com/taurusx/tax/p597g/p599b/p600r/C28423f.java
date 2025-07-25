package com.taurusx.tax.p597g.p599b.p600r;

import java.io.File;

/* renamed from: com.taurusx.tax.g.b.r.f */
/* loaded from: classes7.dex */
public class C28423f extends AbstractC28420d {

    /* renamed from: c */
    public final int f73848c;

    public C28423f(int i) {
        if (i > 0) {
            this.f73848c = i;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }

    @Override // com.taurusx.tax.p597g.p599b.p600r.AbstractC28420d
    /* renamed from: a */
    public boolean mo38099a(File file, long j, int i) {
        if (i <= this.f73848c) {
            return true;
        }
        return false;
    }
}
