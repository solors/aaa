package re;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoding;
import kotlinx.serialization.encoding.InterfaceC37834d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p821oe.C39164i;
import p821oe.InterfaceC39165j;

/* compiled from: Tagged.kt */
@Metadata
/* renamed from: re.e2 */
/* loaded from: classes8.dex */
public abstract class AbstractC39492e2<Tag> implements Encoding, InterfaceC37834d {
    @NotNull

    /* renamed from: a */
    private final ArrayList<Tag> f103831a = new ArrayList<>();

    /* renamed from: H */
    private final boolean m12460H(SerialDescriptor serialDescriptor, int i) {
        m12454Z(mo12456X(serialDescriptor, i));
        return true;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: B */
    public final void mo12463B(@NotNull SerialDescriptor descriptor, int i, float f) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo6875O(mo12456X(descriptor, i), f);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: C */
    public <T> void mo12462C(@NotNull SerialDescriptor descriptor, int i, @NotNull InterfaceC39165j<? super T> serializer, T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (m12460H(descriptor, i)) {
            mo6797x(serializer, t);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: D */
    public final void mo6815D(char c) {
        mo6878L(m12455Y(), c);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: F */
    public final void mo12461F(@NotNull SerialDescriptor descriptor, int i, double d) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo6877M(mo12456X(descriptor, i), d);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: G */
    public <T> void mo6674G(@NotNull SerialDescriptor descriptor, int i, @NotNull InterfaceC39165j<? super T> serializer, @Nullable T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (m12460H(descriptor, i)) {
            m12459I(serializer, t);
        }
    }

    /* renamed from: I */
    public <T> void m12459I(@NotNull InterfaceC39165j<? super T> interfaceC39165j, @Nullable T t) {
        Encoding.C37831a.m16046c(this, interfaceC39165j, t);
    }

    /* renamed from: J */
    protected abstract void mo6880J(Tag tag, boolean z);

    /* renamed from: K */
    protected abstract void mo6879K(Tag tag, byte b);

    /* renamed from: L */
    protected abstract void mo6878L(Tag tag, char c);

    /* renamed from: M */
    protected abstract void mo6877M(Tag tag, double d);

    /* renamed from: N */
    protected abstract void mo6876N(Tag tag, @NotNull SerialDescriptor serialDescriptor, int i);

    /* renamed from: O */
    protected abstract void mo6875O(Tag tag, float f);

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: P */
    public Encoding mo6874P(Tag tag, @NotNull SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        m12454Z(tag);
        return this;
    }

    /* renamed from: Q */
    protected abstract void mo6873Q(Tag tag, int i);

    /* renamed from: R */
    protected abstract void mo6872R(Tag tag, long j);

    /* renamed from: S */
    protected abstract void mo6871S(Tag tag, short s);

    /* renamed from: T */
    protected abstract void mo6870T(Tag tag, @NotNull String str);

    /* renamed from: U */
    protected abstract void mo6869U(@NotNull SerialDescriptor serialDescriptor);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V */
    public final Tag m12458V() {
        Object m17577B0;
        m17577B0 = _Collections.m17577B0(this.f103831a);
        return (Tag) m17577B0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    /* renamed from: W */
    public final Tag m12457W() {
        Object m17576C0;
        m17576C0 = _Collections.m17576C0(this.f103831a);
        return (Tag) m17576C0;
    }

    /* renamed from: X */
    protected abstract Tag mo12456X(@NotNull SerialDescriptor serialDescriptor, int i);

    /* renamed from: Y */
    protected final Tag m12455Y() {
        int m17164o;
        if (!this.f103831a.isEmpty()) {
            ArrayList<Tag> arrayList = this.f103831a;
            m17164o = C37563v.m17164o(arrayList);
            return arrayList.remove(m17164o);
        }
        throw new C39164i("No tag in stack for requested element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Z */
    public final void m12454Z(Tag tag) {
        this.f103831a.add(tag);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: c */
    public final void mo6810c(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!this.f103831a.isEmpty()) {
            m12455Y();
        }
        mo6869U(descriptor);
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: e */
    public final void mo6808e(byte b) {
        mo6879K(m12455Y(), b);
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: f */
    public final void mo6807f(@NotNull SerialDescriptor enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        mo6876N(m12455Y(), enumDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoding
    @NotNull
    /* renamed from: g */
    public Encoding mo6806g(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo6874P(m12455Y(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: h */
    public final void mo12453h(@NotNull SerialDescriptor descriptor, int i, char c) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo6878L(mo12456X(descriptor, i), c);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: i */
    public final void mo12452i(@NotNull SerialDescriptor descriptor, int i, byte b) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo6879K(mo12456X(descriptor, i), b);
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: j */
    public final void mo6805j(short s) {
        mo6871S(m12455Y(), s);
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: k */
    public final void mo6804k(boolean z) {
        mo6880J(m12455Y(), z);
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: l */
    public final void mo6803l(float f) {
        mo6875O(m12455Y(), f);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: m */
    public final void mo12451m(@NotNull SerialDescriptor descriptor, int i, int i2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo6873Q(mo12456X(descriptor, i), i2);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: n */
    public final void mo12450n(@NotNull SerialDescriptor descriptor, int i, boolean z) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo6880J(mo12456X(descriptor, i), z);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: o */
    public final void mo12449o(@NotNull SerialDescriptor descriptor, int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        mo6870T(mo12456X(descriptor, i), value);
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: r */
    public final void mo6800r(int i) {
        mo6873Q(m12455Y(), i);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: s */
    public final void mo12448s(@NotNull SerialDescriptor descriptor, int i, short s) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo6871S(mo12456X(descriptor, i), s);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    /* renamed from: t */
    public final void mo12447t(@NotNull SerialDescriptor descriptor, int i, long j) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        mo6872R(mo12456X(descriptor, i), j);
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: u */
    public final void mo6799u(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        mo6870T(m12455Y(), value);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37834d
    @NotNull
    /* renamed from: v */
    public final Encoding mo12446v(@NotNull SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo6874P(mo12456X(descriptor, i), descriptor.mo12263d(i));
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: w */
    public final void mo6798w(double d) {
        mo6877M(m12455Y(), d);
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: x */
    public abstract <T> void mo6797x(@NotNull InterfaceC39165j<? super T> interfaceC39165j, T t);

    @Override // kotlinx.serialization.encoding.Encoding
    @NotNull
    /* renamed from: y */
    public InterfaceC37834d mo12445y(@NotNull SerialDescriptor serialDescriptor, int i) {
        return Encoding.C37831a.m16048a(this, serialDescriptor, i);
    }

    @Override // kotlinx.serialization.encoding.Encoding
    /* renamed from: z */
    public final void mo6796z(long j) {
        mo6872R(m12455Y(), j);
    }
}
