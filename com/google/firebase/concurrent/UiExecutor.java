package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public enum UiExecutor implements Executor {
    INSTANCE;
    
    @SuppressLint({"ThreadPoolCreation"})

    /* renamed from: b */
    private static final Handler f42193b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f42193b.post(runnable);
    }
}
