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
/* renamed from: re.h */
/* loaded from: classes8.dex */
public final class C39500h implements KSerializer<Boolean> {
    @NotNull

    /* renamed from: a */
    public static final C39500h f103846a = new C39500h();
    @NotNull

    /* renamed from: b */
    private static final SerialDescriptor f103847b = new C39548u1("kotlin.Boolean", AbstractC39392e.C39393a.f103607a);

    private C39500h() {
    }

    @Override // p821oe.KSerializer
    @NotNull
    /* renamed from: a */
    public Boolean deserialize(@NotNull Decoding decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Boolean.valueOf(decoder.mo6823z());
    }

    /* renamed from: b */
    public void m12422b(@NotNull Encoding encoder, boolean z) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.mo6804k(z);
    }

    @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f103847b;
    }

    @Override // p821oe.InterfaceC39165j
    public /* bridge */ /* synthetic */ void serialize(Encoding encoding, Object obj) {
        m12422b(encoding, ((Boolean) obj).booleanValue());
    }
}
