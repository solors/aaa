package p1061yc;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ByteArrayPool.kt */
@Metadata
/* renamed from: yc.a */
/* loaded from: classes9.dex */
public final class C45096a {
    @NotNull

    /* renamed from: a */
    private static final InterfaceC45101f<byte[]> f118612a = new C45097a();

    /* compiled from: ByteArrayPool.kt */
    @Metadata
    /* renamed from: yc.a$a */
    /* loaded from: classes9.dex */
    public static final class C45097a extends DefaultPool<byte[]> {
        C45097a() {
            super(128);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p1061yc.DefaultPool
        @NotNull
        /* renamed from: r */
        public byte[] mo921i() {
            return new byte[4096];
        }
    }

    @NotNull
    /* renamed from: a */
    public static final InterfaceC45101f<byte[]> m934a() {
        return f118612a;
    }
}
