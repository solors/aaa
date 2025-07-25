package re;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.ExceptionsH;
import p851qe.AbstractC39392e;

/* compiled from: Primitives.kt */
@Metadata
/* renamed from: re.u1 */
/* loaded from: classes8.dex */
public final class C39548u1 implements SerialDescriptor {
    @NotNull

    /* renamed from: a */
    private final String f103914a;
    @NotNull

    /* renamed from: b */
    private final AbstractC39392e f103915b;

    public C39548u1(@NotNull String serialName, @NotNull AbstractC39392e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f103914a = serialName;
        this.f103915b = kind;
    }

    /* renamed from: a */
    private final Void m12315a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo12265b() {
        return SerialDescriptor.C37827a.m16054c(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo12264c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        m12315a();
        throw new ExceptionsH();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: d */
    public SerialDescriptor mo12263d(int i) {
        m12315a();
        throw new ExceptionsH();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public int mo12262e() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39548u1)) {
            return false;
        }
        C39548u1 c39548u1 = (C39548u1) obj;
        if (Intrinsics.m17075f(mo12259h(), c39548u1.mo12259h()) && Intrinsics.m17075f(getKind(), c39548u1.getKind())) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: f */
    public String mo12261f(int i) {
        m12315a();
        throw new ExceptionsH();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: g */
    public List<Annotation> mo12260g(int i) {
        m12315a();
        throw new ExceptionsH();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        return SerialDescriptor.C37827a.m16056a(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: h */
    public String mo12259h() {
        return this.f103914a;
    }

    public int hashCode() {
        return mo12259h().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public boolean mo12258i(int i) {
        m12315a();
        throw new ExceptionsH();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.C37827a.m16055b(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: j */
    public AbstractC39392e getKind() {
        return this.f103915b;
    }

    @NotNull
    public String toString() {
        return "PrimitiveDescriptor(" + mo12259h() + ')';
    }
}
