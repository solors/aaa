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
/* renamed from: re.e0 */
/* loaded from: classes8.dex */
public final class C39491e0 implements KSerializer<Float> {
    @NotNull

    /* renamed from: a */
    public static final C39491e0 f103827a = new C39491e0();
    @NotNull

    /* renamed from: b */
    private static final SerialDescriptor f103828b = new C39548u1("kotlin.Float", AbstractC39392e.C39397e.f103611a);

    private C39491e0() {
    }

    @Override // p821oe.KSerializer
    @NotNull
    /* renamed from: a */
    public Float deserialize(@NotNull Decoding decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Float.valueOf(decoder.mo6824x());
    }

    /* renamed from: b */
    public void m12465b(@NotNull Encoding encoder, float f) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.mo6803l(f);
    }

    @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f103828b;
    }

    @Override // p821oe.InterfaceC39165j
    public /* bridge */ /* synthetic */ void serialize(Encoding encoding, Object obj) {
        m12465b(encoding, ((Number) obj).floatValue());
    }
}
