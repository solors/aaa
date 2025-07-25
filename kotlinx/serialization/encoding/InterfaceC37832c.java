package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p821oe.KSerializer;
import p987te.AbstractC44407c;

/* compiled from: Decoding.kt */
@Metadata
/* renamed from: kotlinx.serialization.encoding.c */
/* loaded from: classes8.dex */
public interface InterfaceC37832c {

    /* compiled from: Decoding.kt */
    @Metadata
    /* renamed from: kotlinx.serialization.encoding.c$a */
    /* loaded from: classes8.dex */
    public static final class C37833a {
        /* renamed from: a */
        public static int m16041a(@NotNull InterfaceC37832c interfaceC37832c, @NotNull SerialDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return -1;
        }

        /* renamed from: b */
        public static boolean m16040b(@NotNull InterfaceC37832c interfaceC37832c) {
            return false;
        }

        /* renamed from: c */
        public static /* synthetic */ Object m16039c(InterfaceC37832c interfaceC37832c, SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj, int i2, Object obj2) {
            if (obj2 == null) {
                if ((i2 & 8) != 0) {
                    obj = null;
                }
                return interfaceC37832c.mo6843B(serialDescriptor, i, kSerializer, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
    }

    /* renamed from: A */
    byte mo12485A(@NotNull SerialDescriptor serialDescriptor, int i);

    /* renamed from: B */
    <T> T mo6843B(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull KSerializer<? extends T> kSerializer, @Nullable T t);

    /* renamed from: C */
    boolean mo12484C(@NotNull SerialDescriptor serialDescriptor, int i);

    /* renamed from: E */
    short mo12483E(@NotNull SerialDescriptor serialDescriptor, int i);

    /* renamed from: F */
    double mo12482F(@NotNull SerialDescriptor serialDescriptor, int i);

    @Nullable
    /* renamed from: H */
    <T> T mo12481H(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull KSerializer<? extends T> kSerializer, @Nullable T t);

    @NotNull
    /* renamed from: a */
    AbstractC44407c mo6820a();

    /* renamed from: c */
    void mo6666c(@NotNull SerialDescriptor serialDescriptor);

    /* renamed from: e */
    long mo12474e(@NotNull SerialDescriptor serialDescriptor, int i);

    /* renamed from: f */
    int mo12473f(@NotNull SerialDescriptor serialDescriptor, int i);

    @NotNull
    /* renamed from: i */
    String mo12472i(@NotNull SerialDescriptor serialDescriptor, int i);

    /* renamed from: j */
    boolean mo12471j();

    @NotNull
    /* renamed from: k */
    Decoding mo12470k(@NotNull SerialDescriptor serialDescriptor, int i);

    /* renamed from: q */
    char mo12469q(@NotNull SerialDescriptor serialDescriptor, int i);

    /* renamed from: u */
    int mo12468u(@NotNull SerialDescriptor serialDescriptor);

    /* renamed from: v */
    int mo6663v(@NotNull SerialDescriptor serialDescriptor);

    /* renamed from: y */
    float mo12467y(@NotNull SerialDescriptor serialDescriptor, int i);
}
