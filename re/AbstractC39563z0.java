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
/* renamed from: re.z0 */
/* loaded from: classes8.dex */
public abstract class AbstractC39563z0 implements SerialDescriptor {
    @NotNull

    /* renamed from: a */
    private final String f103947a;
    @NotNull

    /* renamed from: b */
    private final SerialDescriptor f103948b;
    @NotNull

    /* renamed from: c */
    private final SerialDescriptor f103949c;

    /* renamed from: d */
    private final int f103950d;

    public /* synthetic */ AbstractC39563z0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, serialDescriptor, serialDescriptor2);
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
        throw new IllegalArgumentException(name + " is not a valid map index");
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
            int i2 = i % 2;
            if (i2 != 0) {
                if (i2 == 1) {
                    return this.f103949c;
                }
                throw new IllegalStateException("Unreached".toString());
            }
            return this.f103948b;
        }
        throw new IllegalArgumentException(("Illegal index " + i + ", " + mo12259h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public int mo12262e() {
        return this.f103950d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC39563z0)) {
            return false;
        }
        AbstractC39563z0 abstractC39563z0 = (AbstractC39563z0) obj;
        if (Intrinsics.m17075f(mo12259h(), abstractC39563z0.mo12259h()) && Intrinsics.m17075f(this.f103948b, abstractC39563z0.f103948b) && Intrinsics.m17075f(this.f103949c, abstractC39563z0.f103949c)) {
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
        return AbstractC39411i.C39414c.f103627a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: h */
    public String mo12259h() {
        return this.f103947a;
    }

    public int hashCode() {
        return (((mo12259h().hashCode() * 31) + this.f103948b.hashCode()) * 31) + this.f103949c.hashCode();
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
        return mo12259h() + '(' + this.f103948b + ", " + this.f103949c + ')';
    }

    private AbstractC39563z0(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f103947a = str;
        this.f103948b = serialDescriptor;
        this.f103949c = serialDescriptor2;
        this.f103950d = 2;
    }
}
