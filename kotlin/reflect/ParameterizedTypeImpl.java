package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypesJVM.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ParameterizedTypeImpl implements ParameterizedType, TypeImpl {
    @Nullable
    private final Type ownerType;
    @NotNull
    private final Class<?> rawType;
    @NotNull
    private final Type[] typeArguments;

    public ParameterizedTypeImpl(@NotNull Class<?> rawType, @Nullable Type type, @NotNull List<? extends Type> typeArguments) {
        Intrinsics.checkNotNullParameter(rawType, "rawType");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        this.rawType = rawType;
        this.ownerType = type;
        this.typeArguments = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (Intrinsics.m17075f(this.rawType, parameterizedType.getRawType()) && Intrinsics.m17075f(this.ownerType, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public Type[] getActualTypeArguments() {
        return this.typeArguments;
    }

    @Override // java.lang.reflect.ParameterizedType
    @Nullable
    public Type getOwnerType() {
        return this.ownerType;
    }

    @Override // java.lang.reflect.ParameterizedType
    @NotNull
    public Type getRawType() {
        return this.rawType;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    @NotNull
    public String getTypeName() {
        String typeToString;
        boolean z;
        String typeToString2;
        StringBuilder sb2 = new StringBuilder();
        Type type = this.ownerType;
        if (type != null) {
            typeToString2 = TypesJVMKt.typeToString(type);
            sb2.append(typeToString2);
            sb2.append("$");
            sb2.append(this.rawType.getSimpleName());
        } else {
            typeToString = TypesJVMKt.typeToString(this.rawType);
            sb2.append(typeToString);
        }
        Type[] typeArr = this.typeArguments;
        if (typeArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            _Arrays.m17316j0(typeArr, sb2, null, "<", ">", 0, null, ParameterizedTypeImpl$getTypeName$1$1.INSTANCE, 50, null);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public int hashCode() {
        int i;
        int hashCode = this.rawType.hashCode();
        Type type = this.ownerType;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return (hashCode ^ i) ^ Arrays.hashCode(getActualTypeArguments());
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
