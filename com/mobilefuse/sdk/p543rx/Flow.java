package com.mobilefuse.sdk.p543rx;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Flow.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.rx.Flow */
/* loaded from: classes7.dex */
public interface Flow<T> {
    void collect(@NotNull FlowCollector<? super T> flowCollector);
}
