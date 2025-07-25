package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;

/* renamed from: io.appmetrica.analytics.impl.Yl */
/* loaded from: classes9.dex */
public final class C34359Yl extends AbstractC34268V2 {
    public C34359Yl(int i, @NonNull String str) {
        this(i, str, PublicLogger.getAnonymousInstance());
    }

    @VisibleForTesting(otherwise = 3)
    /* renamed from: b */
    public final int m22061b() {
        return this.f93593a;
    }

    public C34359Yl(int i, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i, str, publicLogger);
    }

    @NonNull
    @VisibleForTesting(otherwise = 3)
    /* renamed from: a */
    public final String m22063a() {
        return this.f93594b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34025Km
    @Nullable
    /* renamed from: a */
    public final String mo21063a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            int i = this.f93593a;
            if (length > i) {
                String str2 = new String(bytes, 0, i, "UTF-8");
                try {
                    this.f93595c.warning("\"%s\" %s exceeded limit of %d bytes", this.f93594b, str, Integer.valueOf(this.f93593a));
                } catch (UnsupportedEncodingException unused) {
                }
                return str2;
            }
            return str;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
