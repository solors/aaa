package io.ktor.utils.p731io.internal;

import io.ktor.utils.p731io.internal.ReadWriteBufferState;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1061yc.C45100d;
import p1061yc.DefaultPool;
import p1061yc.InterfaceC45101f;
import p1061yc.Pool;

@Metadata
/* renamed from: io.ktor.utils.io.internal.e */
/* loaded from: classes9.dex */
public final class ObjectPool {

    /* renamed from: a */
    private static final int f98214a;

    /* renamed from: b */
    private static final int f98215b;

    /* renamed from: c */
    private static final int f98216c;
    @NotNull

    /* renamed from: d */
    private static final InterfaceC45101f<ByteBuffer> f98217d;
    @NotNull

    /* renamed from: e */
    private static final InterfaceC45101f<ReadWriteBufferState.C37200c> f98218e;
    @NotNull

    /* renamed from: f */
    private static final InterfaceC45101f<ReadWriteBufferState.C37200c> f98219f;

    /* compiled from: ObjectPool.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.internal.e$a */
    /* loaded from: classes9.dex */
    public static final class C37196a extends Pool<ReadWriteBufferState.C37200c> {
        C37196a() {
        }

        @Override // p1061yc.InterfaceC45101f
        @NotNull
        /* renamed from: a */
        public ReadWriteBufferState.C37200c mo916L() {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(ObjectPool.m18799a());
            Intrinsics.checkNotNullExpressionValue(allocateDirect, "allocateDirect(BUFFER_SIZE)");
            return new ReadWriteBufferState.C37200c(allocateDirect, 0, 2, null);
        }
    }

    /* compiled from: ObjectPool.kt */
    @Metadata
    /* renamed from: io.ktor.utils.io.internal.e$b */
    /* loaded from: classes9.dex */
    public static final class C37197b extends DefaultPool<ReadWriteBufferState.C37200c> {
        C37197b(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p1061yc.DefaultPool
        /* renamed from: r */
        public void mo927f(@NotNull ReadWriteBufferState.C37200c instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            ObjectPool.m18796d().mo915p(instance.f98222a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p1061yc.DefaultPool
        @NotNull
        /* renamed from: s */
        public ReadWriteBufferState.C37200c mo921i() {
            return new ReadWriteBufferState.C37200c(ObjectPool.m18796d().mo916L(), 0, 2, null);
        }
    }

    static {
        int m18752a = C37208k.m18752a("BufferSize", 4096);
        f98214a = m18752a;
        int m18752a2 = C37208k.m18752a("BufferPoolSize", 2048);
        f98215b = m18752a2;
        int m18752a3 = C37208k.m18752a("BufferObjectPoolSize", 1024);
        f98216c = m18752a3;
        f98217d = new C45100d(m18752a2, m18752a);
        f98218e = new C37197b(m18752a3);
        f98219f = new C37196a();
    }

    /* renamed from: a */
    public static final int m18799a() {
        return f98214a;
    }

    @NotNull
    /* renamed from: b */
    public static final InterfaceC45101f<ReadWriteBufferState.C37200c> m18798b() {
        return f98219f;
    }

    @NotNull
    /* renamed from: c */
    public static final InterfaceC45101f<ReadWriteBufferState.C37200c> m18797c() {
        return f98218e;
    }

    @NotNull
    /* renamed from: d */
    public static final InterfaceC45101f<ByteBuffer> m18796d() {
        return f98217d;
    }
}
