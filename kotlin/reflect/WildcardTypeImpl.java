package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TypesJVM.kt */
@Metadata
/* loaded from: classes7.dex */
public final class WildcardTypeImpl implements WildcardType, TypeImpl {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final WildcardTypeImpl STAR = new WildcardTypeImpl(null, null);
    @Nullable
    private final Type lowerBound;
    @Nullable
    private final Type upperBound;

    /* compiled from: TypesJVM.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final WildcardTypeImpl getSTAR() {
            return WildcardTypeImpl.STAR;
        }
    }

    public WildcardTypeImpl(@Nullable Type type, @Nullable Type type2) {
        this.upperBound = type;
        this.lowerBound = type2;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public Type[] getLowerBounds() {
        Type type = this.lowerBound;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    @NotNull
    public String getTypeName() {
        String typeToString;
        String typeToString2;
        if (this.lowerBound != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("? super ");
            typeToString2 = TypesJVMKt.typeToString(this.lowerBound);
            sb2.append(typeToString2);
            return sb2.toString();
        }
        Type type = this.upperBound;
        if (type != null && !Intrinsics.m17075f(type, Object.class)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("? extends ");
            typeToString = TypesJVMKt.typeToString(this.upperBound);
            sb3.append(typeToString);
            return sb3.toString();
        }
        return "?";
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.upperBound;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }
}
