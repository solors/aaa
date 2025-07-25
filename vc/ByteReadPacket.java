package vc;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1029wc.ChunkBuffer;
import p1061yc.InterfaceC45101f;

@Metadata
/* renamed from: vc.j */
/* loaded from: classes9.dex */
public final class ByteReadPacket extends Input {
    @NotNull

    /* renamed from: k */
    public static final C44560a f116952k = new C44560a(null);
    @NotNull

    /* renamed from: l */
    private static final ByteReadPacket f116953l;

    /* compiled from: ByteReadPacket.kt */
    @Metadata
    /* renamed from: vc.j$a */
    /* loaded from: classes9.dex */
    public static final class C44560a {
        private C44560a() {
        }

        public /* synthetic */ C44560a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final ByteReadPacket m2468a() {
            return ByteReadPacket.f116953l;
        }
    }

    static {
        ChunkBuffer.C44651d c44651d = ChunkBuffer.f117160j;
        f116953l = new ByteReadPacket(c44651d.m2142a(), 0L, c44651d.m2141b());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ByteReadPacket(@NotNull ChunkBuffer head, long j, @NotNull InterfaceC45101f<ChunkBuffer> pool) {
        super(head, j, pool);
        Intrinsics.checkNotNullParameter(head, "head");
        Intrinsics.checkNotNullParameter(pool, "pool");
        m2453R();
    }

    @NotNull
    public String toString() {
        return "ByteReadPacket[" + hashCode() + ']';
    }

    @Override // vc.Input
    @Nullable
    /* renamed from: u */
    protected final ChunkBuffer mo2422u() {
        return null;
    }

    @Override // vc.Input
    /* renamed from: v */
    protected final int mo2421v(@NotNull ByteBuffer destination, int i, int i2) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return 0;
    }

    @Override // vc.Input
    /* renamed from: i */
    protected final void mo2431i() {
    }
}
