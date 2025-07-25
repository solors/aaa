package re;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1062yd.JvmClassMapping;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Caching.kt */
@Metadata
/* renamed from: re.p0 */
/* loaded from: classes8.dex */
public final class C39531p0 implements KType {
    @NotNull

    /* renamed from: b */
    private final KType f103899b;

    public C39531p0(@NotNull KType origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f103899b = origin;
    }

    public boolean equals(@Nullable Object obj) {
        C39531p0 c39531p0;
        KType kType;
        KType kType2;
        if (obj == null) {
            return false;
        }
        KType kType3 = this.f103899b;
        KClassifier kClassifier = null;
        if (obj instanceof C39531p0) {
            c39531p0 = (C39531p0) obj;
        } else {
            c39531p0 = null;
        }
        if (c39531p0 != null) {
            kType = c39531p0.f103899b;
        } else {
            kType = null;
        }
        if (!Intrinsics.m17075f(kType3, kType)) {
            return false;
        }
        KClassifier classifier = getClassifier();
        if (classifier instanceof KClass) {
            if (obj instanceof KType) {
                kType2 = (KType) obj;
            } else {
                kType2 = null;
            }
            if (kType2 != null) {
                kClassifier = kType2.getClassifier();
            }
            if (kClassifier != null && (kClassifier instanceof KClass)) {
                return Intrinsics.m17075f(JvmClassMapping.m913a((KClass) classifier), JvmClassMapping.m913a((KClass) kClassifier));
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.f103899b.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    @NotNull
    public List<KTypeProjection> getArguments() {
        return this.f103899b.getArguments();
    }

    @Override // kotlin.reflect.KType
    @Nullable
    public KClassifier getClassifier() {
        return this.f103899b.getClassifier();
    }

    public int hashCode() {
        return this.f103899b.hashCode();
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return this.f103899b.isMarkedNullable();
    }

    @NotNull
    public String toString() {
        return "KTypeWrapper: " + this.f103899b;
    }
}
