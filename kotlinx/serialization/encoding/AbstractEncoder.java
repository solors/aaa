package kotlinx.serialization.encoding;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding;
import kotlinx.serialization.encoding.InterfaceC37834d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p821oe.C39164i;
import p821oe.InterfaceC39165j;
import re.NoOpEncoder;

@Metadata
/* renamed from: kotlinx.serialization.encoding.b */
/* loaded from: classes8.dex */
public abstract class AbstractEncoder implements Encoding, InterfaceC37834d {
    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: A */
    public void mo6816A() {
        throw new C39164i("'null' is not supported by default");
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: B */
    public final void mo12463B(@NotNull SerialDescriptor descriptor, int i, float f) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo6814H(descriptor, i)) {
            mo6803l(f);
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: C */
    public <T> void mo12462C(@NotNull SerialDescriptor descriptor, int i, @NotNull InterfaceC39165j<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (mo6814H(descriptor, i)) {
            mo6797x(serializer, t);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: D */
    public void mo6815D(char c) {
        mo12464J(Character.valueOf(c));
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: E */
    public void mo6881E() {
        Encoding.C37831a.m16047b(this);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: F */
    public final void mo12461F(@NotNull SerialDescriptor descriptor, int i, double d) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo6814H(descriptor, i)) {
            mo6798w(d);
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: G */
    public <T> void mo6674G(@NotNull SerialDescriptor descriptor, int i, @NotNull InterfaceC39165j<? super T> serializer, @Nullable T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (mo6814H(descriptor, i)) {
            m16042I(serializer, t);
        }
    }

    /* renamed from: H */
    public boolean mo6814H(@NotNull SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    /* renamed from: I */
    public <T> void m16042I(@NotNull InterfaceC39165j<? super T> interfaceC39165j, @Nullable T t) {
        Encoding.C37831a.m16046c(this, interfaceC39165j, t);
    }

    /* renamed from: J */
    public void mo12464J(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new C39164i("Non-serializable " + Reflection.m17042b(value.getClass()) + " is not supported by " + Reflection.m17042b(getClass()) + " encoder");
    }

    @Override // kotlinx.serialization.encoding.Encoding
    @NotNull
    /* renamed from: b */
    public InterfaceC37834d mo6811b(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: c */
    public void mo6810c(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: e */
    public void mo6808e(byte b) {
        mo12464J(Byte.valueOf(b));
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: f */
    public void mo6807f(@NotNull SerialDescriptor enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        mo12464J(Integer.valueOf(i));
    }

    @Override // kotlinx.serialization.encoding.Encoding
    @NotNull
    /* renamed from: g */
    public Encoding mo6806g(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: h */
    public final void mo12453h(@NotNull SerialDescriptor descriptor, int i, char c) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo6814H(descriptor, i)) {
            mo6815D(c);
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: i */
    public final void mo12452i(@NotNull SerialDescriptor descriptor, int i, byte b) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo6814H(descriptor, i)) {
            mo6808e(b);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: j */
    public void mo6805j(short s) {
        mo12464J(Short.valueOf(s));
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: k */
    public void mo6804k(boolean z) {
        mo12464J(Boolean.valueOf(z));
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: l */
    public void mo6803l(float f) {
        mo12464J(Float.valueOf(f));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: m */
    public final void mo12451m(@NotNull SerialDescriptor descriptor, int i, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo6814H(descriptor, i)) {
            mo6800r(i2);
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: n */
    public final void mo12450n(@NotNull SerialDescriptor descriptor, int i, boolean z) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo6814H(descriptor, i)) {
            mo6804k(z);
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: o */
    public final void mo12449o(@NotNull SerialDescriptor descriptor, int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        if (mo6814H(descriptor, i)) {
            mo6799u(value);
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: p */
    public boolean mo6802p(@NotNull SerialDescriptor serialDescriptor, int i) {
        return InterfaceC37834d.C37835a.m16038a(this, serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: r */
    public void mo6800r(int i) {
        mo12464J(Integer.valueOf(i));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: s */
    public final void mo12448s(@NotNull SerialDescriptor descriptor, int i, short s) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo6814H(descriptor, i)) {
            mo6805j(s);
        }
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: t */
    public final void mo12447t(@NotNull SerialDescriptor descriptor, int i, long j) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo6814H(descriptor, i)) {
            mo6796z(j);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: u */
    public void mo6799u(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        mo12464J(value);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    @NotNull
    /* renamed from: v */
    public final Encoding mo12446v(@NotNull SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (mo6814H(descriptor, i)) {
            return mo6806g(descriptor.mo12263d(i));
        }
        return NoOpEncoder.f103829a;
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: w */
    public void mo6798w(double d) {
        mo12464J(Double.valueOf(d));
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: x */
    public <T> void mo6797x(@NotNull InterfaceC39165j<? super T> interfaceC39165j, T t) {
        Encoding.C37831a.m16045d(this, interfaceC39165j, t);
    }

    @Override // kotlinx.serialization.encoding.Encoding
    @NotNull
    /* renamed from: y */
    public InterfaceC37834d mo12445y(@NotNull SerialDescriptor serialDescriptor, int i) {
        return Encoding.C37831a.m16048a(this, serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: z */
    public void mo6796z(long j) {
        mo12464J(Long.valueOf(j));
    }
}
