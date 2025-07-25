package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p821oe.InterfaceC39165j;
import p987te.AbstractC44407c;

@Metadata
/* renamed from: kotlinx.serialization.encoding.Encoder */
/* loaded from: classes8.dex */
public interface Encoding {
    /* renamed from: A */
    void mo6816A();

    /* renamed from: D */
    void mo6815D(char c);

    /* renamed from: E */
    void mo6881E();

    @NotNull
    /* renamed from: a */
    AbstractC44407c mo6812a();

    @NotNull
    /* renamed from: b */
    InterfaceC37834d mo6811b(@NotNull SerialDescriptor serialDescriptor);

    /* renamed from: e */
    void mo6808e(byte b);

    /* renamed from: f */
    void mo6807f(@NotNull SerialDescriptor serialDescriptor, int i);

    @NotNull
    /* renamed from: g */
    Encoding mo6806g(@NotNull SerialDescriptor serialDescriptor);

    /* renamed from: j */
    void mo6805j(short s);

    /* renamed from: k */
    void mo6804k(boolean z);

    /* renamed from: l */
    void mo6803l(float f);

    /* renamed from: r */
    void mo6800r(int i);

    /* renamed from: u */
    void mo6799u(@NotNull String str);

    /* renamed from: w */
    void mo6798w(double d);

    /* renamed from: x */
    <T> void mo6797x(@NotNull InterfaceC39165j<? super T> interfaceC39165j, T t);

    @NotNull
    /* renamed from: y */
    InterfaceC37834d mo12445y(@NotNull SerialDescriptor serialDescriptor, int i);

    /* renamed from: z */
    void mo6796z(long j);

    /* compiled from: Encoding.kt */
    @Metadata
    /* renamed from: kotlinx.serialization.encoding.Encoder$a */
    /* loaded from: classes8.dex */
    public static final class C37831a {
        @NotNull
        /* renamed from: a */
        public static InterfaceC37834d m16048a(@NotNull Encoding encoding, @NotNull SerialDescriptor descriptor, int i) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return encoding.mo6811b(descriptor);
        }

        /* renamed from: c */
        public static <T> void m16046c(@NotNull Encoding encoding, @NotNull InterfaceC39165j<? super T> serializer, @Nullable T t) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            if (serializer.getDescriptor().mo12265b()) {
                encoding.mo6797x(serializer, t);
            } else if (t == null) {
                encoding.mo6816A();
            } else {
                encoding.mo6881E();
                encoding.mo6797x(serializer, t);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        public static <T> void m16045d(@NotNull Encoding encoding, @NotNull InterfaceC39165j<? super T> serializer, T t) {
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            serializer.serialize(encoding, t);
        }

        /* renamed from: b */
        public static void m16047b(@NotNull Encoding encoding) {
        }
    }
}
