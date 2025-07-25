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
/* renamed from: re.o */
/* loaded from: classes8.dex */
public final class C39527o implements KSerializer<Character> {
    @NotNull

    /* renamed from: a */
    public static final C39527o f103891a = new C39527o();
    @NotNull

    /* renamed from: b */
    private static final SerialDescriptor f103892b = new C39548u1("kotlin.Char", AbstractC39392e.C39395c.f103609a);

    private C39527o() {
    }

    @Override // p821oe.KSerializer
    @NotNull
    /* renamed from: a */
    public Character deserialize(@NotNull Decoding decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Character.valueOf(decoder.mo6829o());
    }

    /* renamed from: b */
    public void m12353b(@NotNull Encoding encoder, char c) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.mo6815D(c);
    }

    @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f103892b;
    }

    @Override // p821oe.InterfaceC39165j
    public /* bridge */ /* synthetic */ void serialize(Encoding encoding, Object obj) {
        m12353b(encoding, ((Character) obj).charValue());
    }
}
