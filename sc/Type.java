package sc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: sc.a */
/* loaded from: classes9.dex */
public final class Type {
    @NotNull

    /* renamed from: a */
    private final KClass<?> f111776a;
    @NotNull

    /* renamed from: b */
    private final java.lang.reflect.Type f111777b;
    @Nullable

    /* renamed from: c */
    private final KType f111778c;

    public Type(@NotNull KClass<?> type, @NotNull java.lang.reflect.Type reifiedType, @Nullable KType kType) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reifiedType, "reifiedType");
        this.f111776a = type;
        this.f111777b = reifiedType;
        this.f111778c = kType;
    }

    @NotNull
    /* renamed from: a */
    public final KClass<?> m6971a() {
        return this.f111776a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Type)) {
            return false;
        }
        Type type = (Type) obj;
        if (Intrinsics.m17075f(this.f111776a, type.f111776a) && Intrinsics.m17075f(this.f111777b, type.f111777b) && Intrinsics.m17075f(this.f111778c, type.f111778c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f111776a.hashCode() * 31) + this.f111777b.hashCode()) * 31;
        KType kType = this.f111778c;
        if (kType == null) {
            hashCode = 0;
        } else {
            hashCode = kType.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public String toString() {
        return "TypeInfo(type=" + this.f111776a + ", reifiedType=" + this.f111777b + ", kotlinType=" + this.f111778c + ')';
    }
}
