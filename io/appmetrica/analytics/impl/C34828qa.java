package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.qa */
/* loaded from: classes9.dex */
public final class C34828qa extends AbstractC34005K2 {
    public C34828qa(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34005K2, io.appmetrica.analytics.impl.InterfaceC34854ra
    @NonNull
    /* renamed from: a */
    public final C34049Lm mo20948a(@Nullable String str) {
        int i = 0;
        if (str != null) {
            int length = str.length();
            int i2 = this.f93097a;
            if (length > i2) {
                String substring = str.substring(0, i2);
                i = str.getBytes().length - substring.getBytes().length;
                str = substring;
            }
        }
        return new C34049Lm(str, new C34873s3(i));
    }
}
