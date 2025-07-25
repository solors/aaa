package p851qe;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* compiled from: SerialDescriptors.kt */
@Metadata
/* renamed from: qe.a */
/* loaded from: classes8.dex */
public final class C39388a {
    @NotNull

    /* renamed from: a */
    private final String f103595a;
    @NotNull

    /* renamed from: b */
    private List<? extends Annotation> f103596b;
    @NotNull

    /* renamed from: c */
    private final List<String> f103597c;
    @NotNull

    /* renamed from: d */
    private final Set<String> f103598d;
    @NotNull

    /* renamed from: e */
    private final List<SerialDescriptor> f103599e;
    @NotNull

    /* renamed from: f */
    private final List<List<Annotation>> f103600f;
    @NotNull

    /* renamed from: g */
    private final List<Boolean> f103601g;

    public C39388a(@NotNull String serialName) {
        List<? extends Annotation> m17166m;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f103595a = serialName;
        m17166m = C37563v.m17166m();
        this.f103596b = m17166m;
        this.f103597c = new ArrayList();
        this.f103598d = new HashSet();
        this.f103599e = new ArrayList();
        this.f103600f = new ArrayList();
        this.f103601g = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static /* synthetic */ void m12768b(C39388a c39388a, String str, SerialDescriptor serialDescriptor, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            list = C37563v.m17166m();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        c39388a.m12769a(str, serialDescriptor, list, z);
    }

    /* renamed from: a */
    public final void m12769a(@NotNull String elementName, @NotNull SerialDescriptor descriptor, @NotNull List<? extends Annotation> annotations, boolean z) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (this.f103598d.add(elementName)) {
            this.f103597c.add(elementName);
            this.f103599e.add(descriptor);
            this.f103600f.add(annotations);
            this.f103601g.add(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f103595a).toString());
    }

    @NotNull
    /* renamed from: c */
    public final List<Annotation> m12767c() {
        return this.f103596b;
    }

    @NotNull
    /* renamed from: d */
    public final List<List<Annotation>> m12766d() {
        return this.f103600f;
    }

    @NotNull
    /* renamed from: e */
    public final List<SerialDescriptor> m12765e() {
        return this.f103599e;
    }

    @NotNull
    /* renamed from: f */
    public final List<String> m12764f() {
        return this.f103597c;
    }

    @NotNull
    /* renamed from: g */
    public final List<Boolean> m12763g() {
        return this.f103601g;
    }

    /* renamed from: h */
    public final void m12762h(@NotNull List<? extends Annotation> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f103596b = list;
    }
}
