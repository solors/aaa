package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.o3 */
/* loaded from: classes9.dex */
public final class C34767o3 extends AbstractC34259Uh {
    public C34767o3(@NonNull Context context, @NonNull String str) {
        super(context, str, "bool");
    }

    @Override // io.appmetrica.analytics.impl.AbstractC34259Uh
    @Nullable
    /* renamed from: a */
    public final Object mo21240a(int i) {
        return Boolean.valueOf(this.f93580a.getResources().getBoolean(i));
    }

    @Nullable
    /* renamed from: b */
    public final Boolean m21239b(int i) {
        return Boolean.valueOf(this.f93580a.getResources().getBoolean(i));
    }
}
