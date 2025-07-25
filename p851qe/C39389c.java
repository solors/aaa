package p851qe;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContextAware.kt */
@Metadata
/* renamed from: qe.c */
/* loaded from: classes8.dex */
final class C39389c implements SerialDescriptor {
    @NotNull

    /* renamed from: a */
    private final SerialDescriptor f103602a;
    @NotNull

    /* renamed from: b */
    public final KClass<?> f103603b;
    @NotNull

    /* renamed from: c */
    private final String f103604c;

    public C39389c(@NotNull SerialDescriptor original, @NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.f103602a = original;
        this.f103603b = kClass;
        this.f103604c = original.mo12259h() + '<' + kClass.getSimpleName() + '>';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo12265b() {
        return this.f103602a.mo12265b();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo12264c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f103602a.mo12264c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: d */
    public SerialDescriptor mo12263d(int i) {
        return this.f103602a.mo12263d(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public int mo12262e() {
        return this.f103602a.mo12262e();
    }

    public boolean equals(@Nullable Object obj) {
        C39389c c39389c;
        if (obj instanceof C39389c) {
            c39389c = (C39389c) obj;
        } else {
            c39389c = null;
        }
        if (c39389c == null || !Intrinsics.m17075f(this.f103602a, c39389c.f103602a) || !Intrinsics.m17075f(c39389c.f103603b, this.f103603b)) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: f */
    public String mo12261f(int i) {
        return this.f103602a.mo12261f(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: g */
    public List<Annotation> mo12260g(int i) {
        return this.f103602a.mo12260g(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.f103602a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public AbstractC39408h getKind() {
        return this.f103602a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: h */
    public String mo12259h() {
        return this.f103604c;
    }

    public int hashCode() {
        return (this.f103603b.hashCode() * 31) + mo12259h().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public boolean mo12258i(int i) {
        return this.f103602a.mo12258i(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f103602a.isInline();
    }

    @NotNull
    public String toString() {
        return "ContextDescriptor(kClass: " + this.f103603b + ", original: " + this.f103602a + ')';
    }
}
