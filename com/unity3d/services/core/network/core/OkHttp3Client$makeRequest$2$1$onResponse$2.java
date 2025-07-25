package com.unity3d.services.core.network.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: OkHttp3Client.kt */
@Metadata
/* loaded from: classes7.dex */
final class OkHttp3Client$makeRequest$2$1$onResponse$2 extends Lambda implements Function1<Long, Boolean> {
    public static final OkHttp3Client$makeRequest$2$1$onResponse$2 INSTANCE = new OkHttp3Client$makeRequest$2$1$onResponse$2();

    OkHttp3Client$makeRequest$2$1$onResponse$2() {
        super(1);
    }

    @NotNull
    public final Boolean invoke(long j) {
        return Boolean.valueOf(j != -1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Long l) {
        return invoke(l.longValue());
    }
}
