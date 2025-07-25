package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.r3 */
/* loaded from: classes9.dex */
public final class C34847r3 extends AbstractC34268V2 {
    public C34847r3(int i, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    @VisibleForTesting(otherwise = 3)
    /* renamed from: b */
    public final int m21061b() {
        return this.f93593a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34025Km
    @Nullable
    /* renamed from: a */
    public final byte[] mo21063a(@Nullable byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            int i = this.f93593a;
            if (length > i) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                this.f93595c.warning("\"%s\" %s exceeded limit of %d bytes", this.f93594b, bArr, Integer.valueOf(this.f93593a));
                return bArr2;
            }
            return bArr;
        }
        return bArr;
    }

    @NonNull
    @VisibleForTesting(otherwise = 3)
    /* renamed from: a */
    public final String m21064a() {
        return this.f93594b;
    }
}
