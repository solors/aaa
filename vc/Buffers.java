package vc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1029wc.ChunkBuffer;
import p1061yc.InterfaceC45101f;

@Metadata
/* renamed from: vc.h */
/* loaded from: classes9.dex */
public final class Buffers {
    @NotNull
    /* renamed from: a */
    public static final ChunkBuffer m2479a(@NotNull ChunkBuffer chunkBuffer) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        while (true) {
            ChunkBuffer m2151x = chunkBuffer.m2151x();
            if (m2151x == null) {
                return chunkBuffer;
            }
            chunkBuffer = m2151x;
        }
    }

    /* renamed from: b */
    public static final void m2478b(@Nullable ChunkBuffer chunkBuffer, @NotNull InterfaceC45101f<ChunkBuffer> pool) {
        Intrinsics.checkNotNullParameter(pool, "pool");
        while (chunkBuffer != null) {
            ChunkBuffer m2152w = chunkBuffer.m2152w();
            chunkBuffer.m2161A(pool);
            chunkBuffer = m2152w;
        }
    }

    /* renamed from: c */
    public static final long m2477c(@NotNull ChunkBuffer chunkBuffer) {
        Intrinsics.checkNotNullParameter(chunkBuffer, "<this>");
        return m2476d(chunkBuffer, 0L);
    }

    /* renamed from: d */
    private static final long m2476d(ChunkBuffer chunkBuffer, long j) {
        do {
            j += chunkBuffer.m2507j() - chunkBuffer.m2509h();
            chunkBuffer = chunkBuffer.m2151x();
        } while (chunkBuffer != null);
        return j;
    }
}
