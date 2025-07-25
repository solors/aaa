package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata
/* renamed from: com.ironsource.mb */
/* loaded from: classes6.dex */
public final class HandlerThreadC20336mb extends HandlerThread {
    @Nullable

    /* renamed from: a */
    private Handler f51234a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerThreadC20336mb(@NotNull String name) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
    }

    /* renamed from: a */
    public final void m57106a() {
        this.f51234a = new Handler(getLooper());
    }

    /* renamed from: a */
    public final void m57105a(@NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        Handler handler = this.f51234a;
        if (handler != null) {
            handler.post(task);
        }
    }
}
