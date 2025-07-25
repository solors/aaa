package io.ktor.utils.p731io.internal;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReadWriteBufferState.kt */
@Metadata
/* renamed from: io.ktor.utils.io.internal.h */
/* loaded from: classes9.dex */
public final class C37205h {
    @NotNull

    /* renamed from: a */
    private static final ByteBuffer f98236a;
    @NotNull

    /* renamed from: b */
    private static final RingBufferCapacity f98237b;

    static {
        ByteBuffer allocate = ByteBuffer.allocate(0);
        Intrinsics.checkNotNullExpressionValue(allocate, "allocate(0)");
        f98236a = allocate;
        f98237b = new RingBufferCapacity(0);
    }

    @NotNull
    /* renamed from: a */
    public static final ByteBuffer m18771a() {
        return f98236a;
    }

    @NotNull
    /* renamed from: b */
    public static final RingBufferCapacity m18770b() {
        return f98237b;
    }
}
