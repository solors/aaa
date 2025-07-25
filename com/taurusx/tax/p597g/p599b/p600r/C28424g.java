package com.taurusx.tax.p597g.p599b.p600r;

import java.io.File;

/* renamed from: com.taurusx.tax.g.b.r.g */
/* loaded from: classes7.dex */
public class C28424g extends AbstractC28420d {

    /* renamed from: c */
    public final long f73849c;

    public C28424g(long j) {
        if (j > 0) {
            this.f73849c = j;
            return;
        }
        throw new IllegalArgumentException("Max size must be positive number!");
    }

    @Override // com.taurusx.tax.p597g.p599b.p600r.AbstractC28420d
    /* renamed from: a */
    public boolean mo38099a(File file, long j, int i) {
        if (j <= this.f73849c) {
            return true;
        }
        return false;
    }
}
