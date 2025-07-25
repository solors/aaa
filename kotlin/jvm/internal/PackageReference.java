package kotlin.jvm.internal;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.reflect.KCallable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1062yd.KotlinReflectionNotSupportedError;

@Metadata
/* renamed from: kotlin.jvm.internal.a0 */
/* loaded from: classes7.dex */
public final class PackageReference implements ClassBasedDeclarationContainer {
    @NotNull

    /* renamed from: b */
    private final Class<?> f99304b;
    @NotNull

    /* renamed from: c */
    private final String f99305c;

    public PackageReference(@NotNull Class<?> jClass, @NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        this.f99304b = jClass;
        this.f99305c = moduleName;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    /* renamed from: a */
    public Class<?> mo17053a() {
        return this.f99304b;
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof PackageReference) && Intrinsics.m17075f(mo17053a(), ((PackageReference) obj).mo17053a())) {
            return true;
        }
        return false;
    }

    @Override // kotlin.reflect.KDeclarationContainer
    @NotNull
    public Collection<KCallable<?>> getMembers() {
        throw new KotlinReflectionNotSupportedError();
    }

    public int hashCode() {
        return mo17053a().hashCode();
    }

    @NotNull
    public String toString() {
        return mo17053a().toString() + " (Kotlin reflection is not available)";
    }
}
