package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p821oe.KSerializer;
import p987te.AbstractC44407c;

@Metadata
/* renamed from: kotlinx.serialization.encoding.Decoder */
/* loaded from: classes8.dex */
public interface Decoding {

    /* compiled from: Decoding.kt */
    @Metadata
    /* renamed from: kotlinx.serialization.encoding.Decoder$a */
    /* loaded from: classes8.dex */
    public static final class C37830a {
        /* renamed from: a */
        public static <T> T m16049a(@NotNull Decoding decoding, @NotNull KSerializer<? extends T> deserializer) {
            Intrinsics.checkNotNullParameter(deserializer, "deserializer");
            return deserializer.deserialize(decoding);
        }
    }

    /* renamed from: D */
    boolean mo6679D();

    /* renamed from: G */
    byte mo6821G();

    @NotNull
    /* renamed from: a */
    AbstractC44407c mo6820a();

    @NotNull
    /* renamed from: b */
    InterfaceC37832c mo6678b(@NotNull SerialDescriptor serialDescriptor);

    @Nullable
    /* renamed from: g */
    Void mo6832g();

    /* renamed from: h */
    long mo6819h();

    /* renamed from: l */
    short mo6818l();

    /* renamed from: m */
    double mo6831m();

    /* renamed from: n */
    <T> T mo6830n(@NotNull KSerializer<? extends T> kSerializer);

    /* renamed from: o */
    char mo6829o();

    @NotNull
    /* renamed from: p */
    String mo6828p();

    /* renamed from: r */
    int mo6827r(@NotNull SerialDescriptor serialDescriptor);

    /* renamed from: t */
    int mo6817t();

    @NotNull
    /* renamed from: w */
    Decoding mo6825w(@NotNull SerialDescriptor serialDescriptor);

    /* renamed from: x */
    float mo6824x();

    /* renamed from: z */
    boolean mo6823z();
}
