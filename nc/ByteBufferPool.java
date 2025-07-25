package nc;

import androidx.core.view.InputDeviceCompat;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p1061yc.ByteBufferPools;
import p1061yc.InterfaceC45101f;

@Metadata
/* renamed from: nc.a */
/* loaded from: classes9.dex */
public final class ByteBufferPool {
    @NotNull

    /* renamed from: a */
    private static final InterfaceC45101f<ByteBuffer> f101839a = new ByteBufferPools(2048, InputDeviceCompat.SOURCE_TOUCHSCREEN);

    @NotNull
    /* renamed from: a */
    public static final InterfaceC45101f<ByteBuffer> m14623a() {
        return f101839a;
    }
}
