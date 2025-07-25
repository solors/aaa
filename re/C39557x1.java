package re;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p851qe.AbstractC39408h;

/* compiled from: NullableSerializer.kt */
@Metadata
/* renamed from: re.x1 */
/* loaded from: classes8.dex */
public final class C39557x1 implements SerialDescriptor, CachedNames {
    @NotNull

    /* renamed from: a */
    private final SerialDescriptor f103931a;
    @NotNull

    /* renamed from: b */
    private final String f103932b;
    @NotNull

    /* renamed from: c */
    private final Set<String> f103933c;

    public C39557x1(@NotNull SerialDescriptor original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.f103931a = original;
        this.f103932b = original.mo12259h() + '?';
        this.f103933c = C39525n1.m12362a(original);
    }

    @Override // re.CachedNames
    @NotNull
    /* renamed from: a */
    public Set<String> mo12281a() {
        return this.f103933c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: b */
    public boolean mo12265b() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: c */
    public int mo12264c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f103931a.mo12264c(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: d */
    public SerialDescriptor mo12263d(int i) {
        return this.f103931a.mo12263d(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e */
    public int mo12262e() {
        return this.f103931a.mo12262e();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C39557x1) && Intrinsics.m17075f(this.f103931a, ((C39557x1) obj).f103931a)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: f */
    public String mo12261f(int i) {
        return this.f103931a.mo12261f(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: g */
    public List<Annotation> mo12260g(int i) {
        return this.f103931a.mo12260g(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.f103931a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public AbstractC39408h getKind() {
        return this.f103931a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    /* renamed from: h */
    public String mo12259h() {
        return this.f103932b;
    }

    public int hashCode() {
        return this.f103931a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i */
    public boolean mo12258i(int i) {
        return this.f103931a.mo12258i(i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return this.f103931a.isInline();
    }

    @NotNull
    /* renamed from: j */
    public final SerialDescriptor m12280j() {
        return this.f103931a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f103931a);
        sb2.append('?');
        return sb2.toString();
    }
}
