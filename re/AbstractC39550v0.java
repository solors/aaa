package re;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringNumberConversions;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p851qe.AbstractC39408h;
import p851qe.AbstractC39411i;

/* compiled from: CollectionDescriptors.kt */
@Metadata
/* renamed from: re.v0 */
/* loaded from: classes8.dex */
public abstract class AbstractC39550v0 implements SerialDescriptor {
    @NotNull

    /* renamed from: a */
    private final SerialDescriptor f103918a;

    /* renamed from: b */
    private final int f103919b;

    public /* synthetic */ AbstractC39550v0(SerialDescriptor serialDescriptor, DefaultConstructorMarker defaultConstructorMarker) {
        this(serialDescriptor);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo12265b() {
        return SerialDescriptor.C37827a.m16054c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo12264c(@NotNull String name) {
        Integer m16640m;
        Intrinsics.checkNotNullParameter(name, "name");
        m16640m = StringNumberConversions.m16640m(name);
        if (m16640m != null) {
            return m16640m.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: d */
    public SerialDescriptor mo12263d(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.f103918a;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo12259h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public int mo12262e() {
        return this.f103919b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC39550v0)) {
            return false;
        }
        AbstractC39550v0 abstractC39550v0 = (AbstractC39550v0) obj;
        if (Intrinsics.m17075f(this.f103918a, abstractC39550v0.f103918a) && Intrinsics.m17075f(mo12259h(), abstractC39550v0.mo12259h())) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: f */
    public String mo12261f(int i) {
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: g */
    public List<Annotation> mo12260g(int i) {
        boolean z;
        List<Annotation> m17166m;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo12259h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        return SerialDescriptor.C37827a.m16056a(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public AbstractC39408h getKind() {
        return AbstractC39411i.C39413b.f103626a;
    }

    public int hashCode() {
        return (this.f103918a.hashCode() * 31) + mo12259h().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public boolean mo12258i(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo12259h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.C37827a.m16055b(this);
    }

    @NotNull
    public String toString() {
        return mo12259h() + '(' + this.f103918a + ')';
    }

    private AbstractC39550v0(SerialDescriptor serialDescriptor) {
        this.f103918a = serialDescriptor;
        this.f103919b = 1;
    }
}
