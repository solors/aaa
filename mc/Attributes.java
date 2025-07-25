package mc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: mc.a */
/* loaded from: classes9.dex */
public final class Attributes<T> {
    @NotNull

    /* renamed from: a */
    private final String f101133a;

    public Attributes(@NotNull String name) {
        boolean z;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f101133a = name;
        if (name.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        throw new IllegalStateException("Name can't be blank");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Attributes.class == obj.getClass() && Intrinsics.m17075f(this.f101133a, ((Attributes) obj).f101133a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f101133a.hashCode();
    }

    @NotNull
    public String toString() {
        return "AttributeKey: " + this.f101133a;
    }
}
