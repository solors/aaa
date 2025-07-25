package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Uh */
/* loaded from: classes9.dex */
public abstract class AbstractC34259Uh {
    @NonNull

    /* renamed from: a */
    protected final Context f93580a;

    /* renamed from: b */
    public final String f93581b;

    /* renamed from: c */
    public final String f93582c;

    public AbstractC34259Uh(Context context, String str, String str2) {
        this.f93580a = context;
        this.f93581b = str;
        this.f93582c = str2;
    }

    @Nullable
    /* renamed from: a */
    public final Object m22168a() {
        int identifier = this.f93580a.getResources().getIdentifier(this.f93581b, this.f93582c, this.f93580a.getPackageName());
        if (identifier != 0) {
            try {
                return mo21240a(identifier);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public abstract Object mo21240a(int i);
}
