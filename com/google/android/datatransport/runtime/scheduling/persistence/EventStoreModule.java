package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;

@Module
/* loaded from: classes4.dex */
public abstract class EventStoreModule {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    /* renamed from: a */
    public static String m76227a() {
        return "com.google.android.datatransport.events";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    /* renamed from: b */
    public static String m76226b(Context context) {
        return context.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    /* renamed from: c */
    public static int m76225c() {
        return SchemaManager.f31276f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    /* renamed from: d */
    public static EventStoreConfig m76224d() {
        return EventStoreConfig.f31257a;
    }
}
