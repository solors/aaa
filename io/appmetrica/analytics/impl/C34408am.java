package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.am */
/* loaded from: classes9.dex */
public final class C34408am extends AbstractC34268V2 {
    public C34408am(int i, @NonNull String str) {
        this(i, str, PublicLogger.getAnonymousInstance());
    }

    @VisibleForTesting(otherwise = 3)
    /* renamed from: b */
    public final int m21961b() {
        return this.f93593a;
    }

    public C34408am(int i, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34025Km
    @Nullable
    /* renamed from: a */
    public final String mo21063a(@Nullable String str) {
        if (str != null) {
            int length = str.length();
            int i = this.f93593a;
            if (length > i) {
                String substring = str.substring(0, i);
                this.f93595c.warning("\"%s\" %s size exceeded limit of %d characters", this.f93594b, str, Integer.valueOf(this.f93593a));
                return substring;
            }
        }
        return str;
    }

    @NonNull
    @VisibleForTesting(otherwise = 3)
    /* renamed from: a */
    public final String m21963a() {
        return this.f93594b;
    }
}
