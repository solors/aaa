package io.ktor.utils.p731io;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ByteChannelCtor.kt */
@Metadata
/* renamed from: io.ktor.utils.io.d */
/* loaded from: classes9.dex */
public final class C37173d {
    @NotNull
    /* renamed from: a */
    public static final ByteReadChannelJVM m18872a(@NotNull byte[] content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return ByteChannel.m18867e(content, 0, content.length);
    }
}
