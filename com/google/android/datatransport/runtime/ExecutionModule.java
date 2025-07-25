package com.google.android.datatransport.runtime;

import android.annotation.SuppressLint;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@Module
/* loaded from: classes4.dex */
abstract class ExecutionModule {
    ExecutionModule() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: a */
    public static Executor m76319a() {
        return new SafeLoggingExecutor(Executors.newSingleThreadExecutor());
    }
}
