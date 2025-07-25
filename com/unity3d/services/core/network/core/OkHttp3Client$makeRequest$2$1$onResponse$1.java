package com.unity3d.services.core.network.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import okio.BufferedSource;
import okio.C39200e;
import org.jetbrains.annotations.Nullable;

/* compiled from: OkHttp3Client.kt */
@Metadata
/* loaded from: classes7.dex */
final class OkHttp3Client$makeRequest$2$1$onResponse$1 extends Lambda implements Functions<Long> {
    final /* synthetic */ C39200e $buffer;
    final /* synthetic */ BufferedSource $source;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkHttp3Client$makeRequest$2$1$onResponse$1(BufferedSource bufferedSource, C39200e c39200e) {
        super(0);
        this.$source = bufferedSource;
        this.$buffer = c39200e;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @Nullable
    public final Long invoke() {
        return Long.valueOf(this.$source.read(this.$buffer, 8192L));
    }
}
