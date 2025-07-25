package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p821oe.InterfaceC39165j;

/* compiled from: Encoding.kt */
@Metadata
/* renamed from: kotlinx.serialization.encoding.d */
/* loaded from: classes8.dex */
public interface InterfaceC37834d {

    /* compiled from: Encoding.kt */
    @Metadata
    /* renamed from: kotlinx.serialization.encoding.d$a */
    /* loaded from: classes8.dex */
    public static final class C37835a {
        /* renamed from: a */
        public static boolean m16038a(@NotNull InterfaceC37834d interfaceC37834d, @NotNull SerialDescriptor descriptor, int i) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return true;
        }
    }

    /* renamed from: B */
    void mo12463B(@NotNull SerialDescriptor serialDescriptor, int i, float f);

    /* renamed from: C */
    <T> void mo12462C(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull InterfaceC39165j<? super T> interfaceC39165j, T t);

    /* renamed from: F */
    void mo12461F(@NotNull SerialDescriptor serialDescriptor, int i, double d);

    /* renamed from: G */
    <T> void mo6674G(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull InterfaceC39165j<? super T> interfaceC39165j, @Nullable T t);

    /* renamed from: c */
    void mo6810c(@NotNull SerialDescriptor serialDescriptor);

    /* renamed from: h */
    void mo12453h(@NotNull SerialDescriptor serialDescriptor, int i, char c);

    /* renamed from: i */
    void mo12452i(@NotNull SerialDescriptor serialDescriptor, int i, byte b);

    /* renamed from: m */
    void mo12451m(@NotNull SerialDescriptor serialDescriptor, int i, int i2);

    /* renamed from: n */
    void mo12450n(@NotNull SerialDescriptor serialDescriptor, int i, boolean z);

    /* renamed from: o */
    void mo12449o(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull String str);

    /* renamed from: p */
    boolean mo6802p(@NotNull SerialDescriptor serialDescriptor, int i);

    /* renamed from: s */
    void mo12448s(@NotNull SerialDescriptor serialDescriptor, int i, short s);

    /* renamed from: t */
    void mo12447t(@NotNull SerialDescriptor serialDescriptor, int i, long j);

    @NotNull
    /* renamed from: v */
    Encoding mo12446v(@NotNull SerialDescriptor serialDescriptor, int i);
}
