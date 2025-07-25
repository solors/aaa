package re;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.InterfaceC37832c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p821oe.KSerializer;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Tagged.kt */
@Metadata
/* renamed from: re.d2 */
/* loaded from: classes8.dex */
public abstract class AbstractC39487d2<Tag> implements Decoding, InterfaceC37832c {
    @NotNull

    /* renamed from: a */
    private final ArrayList<Tag> f103819a = new ArrayList<>();

    /* renamed from: b */
    private boolean f103820b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Tagged.kt */
    @Metadata
    /* renamed from: re.d2$a */
    /* loaded from: classes8.dex */
    static final class C39488a<T> extends Lambda implements Functions<T> {

        /* renamed from: g */
        final /* synthetic */ AbstractC39487d2<Tag> f103821g;

        /* renamed from: h */
        final /* synthetic */ KSerializer<T> f103822h;

        /* renamed from: i */
        final /* synthetic */ T f103823i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C39488a(AbstractC39487d2<Tag> abstractC39487d2, KSerializer<? extends T> kSerializer, T t) {
            super(0);
            this.f103821g = abstractC39487d2;
            this.f103822h = kSerializer;
            this.f103823i = t;
        }

        @Override // kotlin.jvm.functions.Functions
        @Nullable
        public final T invoke() {
            if (this.f103821g.mo6679D()) {
                return (T) this.f103821g.m12480I(this.f103822h, this.f103823i);
            }
            return (T) this.f103821g.mo6832g();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Tagged.kt */
    @Metadata
    /* renamed from: re.d2$b */
    /* loaded from: classes8.dex */
    static final class C39489b<T> extends Lambda implements Functions<T> {

        /* renamed from: g */
        final /* synthetic */ AbstractC39487d2<Tag> f103824g;

        /* renamed from: h */
        final /* synthetic */ KSerializer<T> f103825h;

        /* renamed from: i */
        final /* synthetic */ T f103826i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C39489b(AbstractC39487d2<Tag> abstractC39487d2, KSerializer<? extends T> kSerializer, T t) {
            super(0);
            this.f103824g = abstractC39487d2;
            this.f103825h = kSerializer;
            this.f103826i = t;
        }

        @Override // kotlin.jvm.functions.Functions
        public final T invoke() {
            return (T) this.f103824g.m12480I(this.f103825h, this.f103826i);
        }
    }

    public AbstractC39487d2() {
    }

    /* renamed from: Y */
    private final <E> E m12475Y(Tag tag, Functions<? extends E> functions) {
        m12476X(tag);
        E invoke = functions.invoke();
        if (!this.f103820b) {
            m12477W();
        }
        this.f103820b = false;
        return invoke;
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37832c
    /* renamed from: A */
    public final byte mo12485A(@NotNull SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo6915K(mo12478V(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37832c
    /* renamed from: B */
    public final <T> T mo6843B(@NotNull SerialDescriptor descriptor, int i, @NotNull KSerializer<? extends T> deserializer, @Nullable T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) m12475Y(mo12478V(descriptor, i), new C39489b(this, deserializer, t));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37832c
    /* renamed from: C */
    public final boolean mo12484C(@NotNull SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo6916J(mo12478V(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoding
    /* renamed from: D */
    public abstract boolean mo6679D();

    @Override // kotlinx.serialization.encoding.InterfaceC37832c
    /* renamed from: E */
    public final short mo12483E(@NotNull SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo6907S(mo12478V(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37832c
    /* renamed from: F */
    public final double mo12482F(@NotNull SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo6913M(mo12478V(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoding
    /* renamed from: G */
    public final byte mo6821G() {
        return mo6915K(m12477W());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37832c
    @Nullable
    /* renamed from: H */
    public final <T> T mo12481H(@NotNull SerialDescriptor descriptor, int i, @NotNull KSerializer<? extends T> deserializer, @Nullable T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) m12475Y(mo12478V(descriptor, i), new C39488a(this, deserializer, t));
    }

    /* renamed from: I */
    protected <T> T m12480I(@NotNull KSerializer<? extends T> deserializer, @Nullable T t) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) mo6830n(deserializer);
    }

    /* renamed from: J */
    protected abstract boolean mo6916J(Tag tag);

    /* renamed from: K */
    protected abstract byte mo6915K(Tag tag);

    /* renamed from: L */
    protected abstract char mo6914L(Tag tag);

    /* renamed from: M */
    protected abstract double mo6913M(Tag tag);

    /* renamed from: N */
    protected abstract int mo6912N(Tag tag, @NotNull SerialDescriptor serialDescriptor);

    /* renamed from: O */
    protected abstract float mo6911O(Tag tag);

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: P */
    public Decoding mo6910P(Tag tag, @NotNull SerialDescriptor inlineDescriptor) {
        Intrinsics.checkNotNullParameter(inlineDescriptor, "inlineDescriptor");
        m12476X(tag);
        return this;
    }

    /* renamed from: Q */
    protected abstract int mo6909Q(Tag tag);

    /* renamed from: R */
    protected abstract long mo6908R(Tag tag);

    /* renamed from: S */
    protected abstract short mo6907S(Tag tag);

    @NotNull
    /* renamed from: T */
    protected abstract String mo6906T(Tag tag);

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    /* renamed from: U */
    public final Tag m12479U() {
        Object m17576C0;
        m17576C0 = _Collections.m17576C0(this.f103819a);
        return (Tag) m17576C0;
    }

    /* renamed from: V */
    protected abstract Tag mo12478V(@NotNull SerialDescriptor serialDescriptor, int i);

    /* renamed from: W */
    protected final Tag m12477W() {
        int m17164o;
        ArrayList<Tag> arrayList = this.f103819a;
        m17164o = C37563v.m17164o(arrayList);
        Tag remove = arrayList.remove(m17164o);
        this.f103820b = true;
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public final void m12476X(Tag tag) {
        this.f103819a.add(tag);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37832c
    /* renamed from: e */
    public final long mo12474e(@NotNull SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo6908R(mo12478V(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37832c
    /* renamed from: f */
    public final int mo12473f(@NotNull SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo6909Q(mo12478V(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoding
    @Nullable
    /* renamed from: g */
    public final Void mo6832g() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.Decoding
    /* renamed from: h */
    public final long mo6819h() {
        return mo6908R(m12477W());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37832c
    @NotNull
    /* renamed from: i */
    public final String mo12472i(@NotNull SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo6906T(mo12478V(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37832c
    /* renamed from: j */
    public boolean mo12471j() {
        return InterfaceC37832c.C37833a.m16040b(this);
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37832c
    @NotNull
    /* renamed from: k */
    public final Decoding mo12470k(@NotNull SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo6910P(mo12478V(descriptor, i), descriptor.mo12263d(i));
    }

    @Override // kotlinx.serialization.encoding.Decoding
    /* renamed from: l */
    public final short mo6818l() {
        return mo6907S(m12477W());
    }

    @Override // kotlinx.serialization.encoding.Decoding
    /* renamed from: m */
    public final double mo6831m() {
        return mo6913M(m12477W());
    }

    @Override // kotlinx.serialization.encoding.Decoding
    /* renamed from: n */
    public abstract <T> T mo6830n(@NotNull KSerializer<? extends T> kSerializer);

    @Override // kotlinx.serialization.encoding.Decoding
    /* renamed from: o */
    public final char mo6829o() {
        return mo6914L(m12477W());
    }

    @Override // kotlinx.serialization.encoding.Decoding
    @NotNull
    /* renamed from: p */
    public final String mo6828p() {
        return mo6906T(m12477W());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37832c
    /* renamed from: q */
    public final char mo12469q(@NotNull SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo6914L(mo12478V(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoding
    /* renamed from: r */
    public final int mo6827r(@NotNull SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return mo6912N(m12477W(), enumDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoding
    /* renamed from: t */
    public final int mo6817t() {
        return mo6909Q(m12477W());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37832c
    /* renamed from: u */
    public int mo12468u(@NotNull SerialDescriptor serialDescriptor) {
        return InterfaceC37832c.C37833a.m16041a(this, serialDescriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoding
    @NotNull
    /* renamed from: w */
    public Decoding mo6825w(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo6910P(m12477W(), descriptor);
    }

    @Override // kotlinx.serialization.encoding.Decoding
    /* renamed from: x */
    public final float mo6824x() {
        return mo6911O(m12477W());
    }

    @Override // kotlinx.serialization.encoding.InterfaceC37832c
    /* renamed from: y */
    public final float mo12467y(@NotNull SerialDescriptor descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return mo6911O(mo12478V(descriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoding
    /* renamed from: z */
    public final boolean mo6823z() {
        return mo6916J(m12477W());
    }
}
