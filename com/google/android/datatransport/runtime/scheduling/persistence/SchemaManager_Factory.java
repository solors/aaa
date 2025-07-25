package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import md.Provider;

/* loaded from: classes4.dex */
public final class SchemaManager_Factory implements Factory<SchemaManager> {

    /* renamed from: a */
    private final Provider<Context> f31285a;

    /* renamed from: b */
    private final Provider<String> f31286b;

    /* renamed from: c */
    private final Provider<Integer> f31287c;

    public SchemaManager_Factory(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        this.f31285a = provider;
        this.f31286b = provider2;
        this.f31287c = provider3;
    }

    public static SchemaManager_Factory create(Provider<Context> provider, Provider<String> provider2, Provider<Integer> provider3) {
        return new SchemaManager_Factory(provider, provider2, provider3);
    }

    public static SchemaManager newInstance(Context context, String str, int i) {
        return new SchemaManager(context, str, i);
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public SchemaManager get() {
        return newInstance(this.f31285a.get(), this.f31286b.get(), this.f31287c.get().intValue());
    }
}
