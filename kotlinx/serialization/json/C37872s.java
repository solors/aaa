package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Encoding;
import org.jetbrains.annotations.NotNull;
import p851qe.AbstractC39408h;
import p851qe.C39406g;
import se.JsonExceptions;

/* compiled from: JsonElementSerializers.kt */
@Metadata
/* renamed from: kotlinx.serialization.json.s */
/* loaded from: classes8.dex */
public final class C37872s implements KSerializer<JsonNull> {
    @NotNull

    /* renamed from: a */
    public static final C37872s f99758a = new C37872s();
    @NotNull

    /* renamed from: b */
    private static final SerialDescriptor f99759b = C39406g.m12751d("kotlinx.serialization.json.JsonNull", AbstractC39408h.C39410b.f103624a, new SerialDescriptor[0], null, 8, null);

    private C37872s() {
    }

    @Override // p821oe.KSerializer
    @NotNull
    /* renamed from: a */
    public JsonNull deserialize(@NotNull Decoding decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        C37865k.m15887g(decoder);
        if (!decoder.mo6679D()) {
            decoder.mo6832g();
            return JsonNull.INSTANCE;
        }
        throw new JsonExceptions("Expected 'null' literal");
    }

    @Override // p821oe.InterfaceC39165j
    /* renamed from: b */
    public void serialize(@NotNull Encoding encoder, @NotNull JsonNull value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        C37865k.m15886h(encoder);
        encoder.mo6816A();
    }

    @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f99759b;
    }
}
