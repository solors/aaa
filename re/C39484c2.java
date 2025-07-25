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
/* renamed from: re.c2 */
/* loaded from: classes8.dex */
public final class C39484c2 implements KSerializer<String> {
    @NotNull

    /* renamed from: a */
    public static final C39484c2 f103815a = new C39484c2();
    @NotNull

    /* renamed from: b */
    private static final SerialDescriptor f103816b = new C39548u1("kotlin.String", AbstractC39392e.C39401i.f103615a);

    private C39484c2() {
    }

    @Override // p821oe.KSerializer
    @NotNull
    /* renamed from: a */
    public String deserialize(@NotNull Decoding decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.mo6828p();
    }

    @Override // p821oe.InterfaceC39165j
    /* renamed from: b */
    public void serialize(@NotNull Encoding encoder, @NotNull String value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.mo6799u(value);
    }

    @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f103816b;
    }
}
