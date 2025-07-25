package vc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1029wc.ChunkBuffer;
import p1061yc.DefaultPool;
import tc.MemoryFactory;
import tc.MemoryFactoryJvm;

/* compiled from: BufferFactory.kt */
@Metadata
/* renamed from: vc.l */
/* loaded from: classes9.dex */
public final class C44562l extends DefaultPool<ChunkBuffer> {

    /* renamed from: j */
    private final int f116956j;
    @NotNull

    /* renamed from: k */
    private final MemoryFactory f116957k;

    public /* synthetic */ C44562l(int i, int i2, MemoryFactory memoryFactory, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 4096 : i, (i3 & 2) != 0 ? 1000 : i2, (i3 & 4) != 0 ? MemoryFactoryJvm.f116541a : memoryFactory);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p1061yc.DefaultPool
    @NotNull
    /* renamed from: r */
    public ChunkBuffer mo922e(@NotNull ChunkBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        ChunkBuffer chunkBuffer = (ChunkBuffer) super.mo922e(instance);
        chunkBuffer.m2157E();
        chunkBuffer.mo2156q();
        return chunkBuffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p1061yc.DefaultPool
    /* renamed from: s */
    public void mo927f(@NotNull ChunkBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f116957k.mo3124a(instance.m2510g());
        super.mo927f(instance);
        instance.m2158D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p1061yc.DefaultPool
    @NotNull
    /* renamed from: t */
    public ChunkBuffer mo921i() {
        return new ChunkBuffer(this.f116957k.mo3123b(this.f116956j), null, this, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p1061yc.DefaultPool
    /* renamed from: u */
    public void mo920n(@NotNull ChunkBuffer instance) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Intrinsics.checkNotNullParameter(instance, "instance");
        super.mo920n(instance);
        boolean z6 = true;
        if (instance.m2510g().limit() == this.f116956j) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (instance != ChunkBuffer.f117160j.m2142a()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (instance != C44557a.f116944g.m2498a()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (instance.m2149z() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (instance.m2151x() == null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            if (instance.m2150y() != null) {
                                z6 = false;
                            }
                            if (z6) {
                                return;
                            }
                            throw new IllegalStateException("Recycled instance shouldn't be a view or another buffer.".toString());
                        }
                        throw new IllegalStateException("Recycled instance shouldn't be a part of a chain.".toString());
                    }
                    throw new IllegalStateException("Unable to clear buffer: it is still in use.".toString());
                }
                throw new IllegalStateException("Empty instance couldn't be recycled".toString());
            }
            throw new IllegalStateException("ChunkBuffer.Empty couldn't be recycled".toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Buffer size mismatch. Expected: ");
        sb2.append(this.f116956j);
        sb2.append(", actual: ");
        sb2.append(instance.m2510g().limit());
        throw new IllegalStateException(sb2.toString().toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44562l(int i, int i2, @NotNull MemoryFactory allocator) {
        super(i2);
        Intrinsics.checkNotNullParameter(allocator, "allocator");
        this.f116956j = i;
        this.f116957k = allocator;
    }
}
