package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class ExecutionModule_ExecutorFactory implements Factory<Executor> {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {

        /* renamed from: a */
        private static final ExecutionModule_ExecutorFactory f31052a = new ExecutionModule_ExecutorFactory();

        private InstanceHolder() {
        }
    }

    public static ExecutionModule_ExecutorFactory create() {
        return InstanceHolder.f31052a;
    }

    public static Executor executor() {
        return (Executor) Preconditions.checkNotNull(ExecutionModule.m76319a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public Executor get() {
        return executor();
    }
}
