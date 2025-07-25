package re;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Encoding;
import org.jetbrains.annotations.NotNull;
import p851qe.AbstractC39392e;

/* compiled from: Primitives.kt */
@Metadata
/* renamed from: re.n0 */
/* loaded from: classes8.dex */
public final class C39524n0 implements KSerializer<Integer> {
    @NotNull

    /* renamed from: a */
    public static final C39524n0 f103886a = new C39524n0();
    @NotNull

    /* renamed from: b */
    private static final SerialDescriptor f103887b = new C39548u1("kotlin.Int", AbstractC39392e.C39398f.f103612a);

    private C39524n0() {
    }

    @Override // p821oe.KSerializer
    @NotNull
    /* renamed from: a */
    public Integer deserialize(@NotNull Decoding decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Integer.valueOf(decoder.mo6817t());
    }

    /* renamed from: b */
    public void m12363b(@NotNull Encoding encoder, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.mo6800r(i);
    }

    @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f103887b;
    }

    @Override // p821oe.InterfaceC39165j
    public /* bridge */ /* synthetic */ void serialize(Encoding encoding, Object obj) {
        m12363b(encoding, ((Number) obj).intValue());
    }
}
