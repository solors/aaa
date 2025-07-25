package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistryModule;
import com.google.android.datatransport.runtime.dagger.BindsInstance;
import com.google.android.datatransport.runtime.dagger.Component;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule;
import com.google.android.datatransport.runtime.time.TimeModule;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
@Component(modules = {BackendRegistryModule.class, EventStoreModule.class, ExecutionModule.class, SchedulingModule.class, SchedulingConfigModule.class, TimeModule.class})
/* loaded from: classes4.dex */
public abstract class TransportRuntimeComponent implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Component.Builder
    /* loaded from: classes4.dex */
    public interface Builder {
        TransportRuntimeComponent build();

        @BindsInstance
        Builder setApplicationContext(Context context);
    }

    /* renamed from: a */
    abstract EventStore mo76307a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract TransportRuntime mo76306b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        mo76307a().close();
    }
}
