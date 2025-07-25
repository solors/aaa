package p1061yc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ByteBufferPools.kt */
@Metadata
/* renamed from: yc.d */
/* loaded from: classes9.dex */
public final class C45100d extends DefaultPool<ByteBuffer> {

    /* renamed from: j */
    private final int f118622j;

    public C45100d(int i, int i2) {
        super(i);
        this.f118622j = i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p1061yc.DefaultPool
    @NotNull
    /* renamed from: r */
    public ByteBuffer mo922e(@NotNull ByteBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        instance.clear();
        instance.order(ByteOrder.BIG_ENDIAN);
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p1061yc.DefaultPool
    @NotNull
    /* renamed from: s */
    public ByteBuffer mo921i() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f118622j);
        Intrinsics.m17074g(allocateDirect);
        return allocateDirect;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p1061yc.DefaultPool
    /* renamed from: t */
    public void mo920n(@NotNull ByteBuffer instance) {
        boolean z;
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (instance.capacity() == this.f118622j) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (instance.isDirect()) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
