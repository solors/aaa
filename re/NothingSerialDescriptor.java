package re;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.ExceptionsH;
import p851qe.AbstractC39408h;
import p851qe.AbstractC39411i;

@Metadata
/* renamed from: re.f1 */
/* loaded from: classes8.dex */
public final class NothingSerialDescriptor implements SerialDescriptor {
    @NotNull

    /* renamed from: a */
    public static final NothingSerialDescriptor f103833a = new NothingSerialDescriptor();
    @NotNull

    /* renamed from: b */
    private static final AbstractC39408h f103834b = AbstractC39411i.C39415d.f103628a;
    @NotNull

    /* renamed from: c */
    private static final String f103835c = "kotlin.Nothing";

    private NothingSerialDescriptor() {
    }

    /* renamed from: a */
    private final Void m12437a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
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
        m12437a();
        throw new ExceptionsH();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: d */
    public SerialDescriptor mo12263d(int i) {
        m12437a();
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
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: f */
    public String mo12261f(int i) {
        m12437a();
        throw new ExceptionsH();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: g */
    public List<Annotation> mo12260g(int i) {
        m12437a();
        throw new ExceptionsH();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        return SerialDescriptor.C37827a.m16056a(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public AbstractC39408h getKind() {
        return f103834b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: h */
    public String mo12259h() {
        return f103835c;
    }

    public int hashCode() {
        return mo12259h().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public boolean mo12258i(int i) {
        m12437a();
        throw new ExceptionsH();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return SerialDescriptor.C37827a.m16055b(this);
    }

    @NotNull
    public String toString() {
        return "NothingSerialDescriptor";
    }
}
