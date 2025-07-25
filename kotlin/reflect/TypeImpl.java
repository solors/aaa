package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypesJVM.kt */
@Metadata
/* loaded from: classes7.dex */
interface TypeImpl extends Type {
    @Override // kotlin.reflect.TypeImpl
    @NotNull
    String getTypeName();
}
