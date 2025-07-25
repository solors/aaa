package com.vungle.ads.internal.network;

import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Call.kt */
@Metadata
/* renamed from: com.vungle.ads.internal.network.a */
/* loaded from: classes7.dex */
public interface InterfaceC29353a<T> {
    void cancel();

    void enqueue(@NotNull Callback<T> callback);

    @Nullable
    C29361d<T> execute() throws IOException;

    boolean isCanceled();
}
