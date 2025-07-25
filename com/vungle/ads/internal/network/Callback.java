package com.vungle.ads.internal.network;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.network.b */
/* loaded from: classes7.dex */
public interface Callback<T> {
    void onFailure(@Nullable InterfaceC29353a<T> interfaceC29353a, @Nullable Throwable th);

    void onResponse(@Nullable InterfaceC29353a<T> interfaceC29353a, @Nullable C29361d<T> c29361d);
}
