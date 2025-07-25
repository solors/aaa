package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.jvm.internal.t */
/* loaded from: classes7.dex */
public abstract class Lambda<R> implements FunctionBase<R>, Serializable {
    private final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String m17033k = Reflection.m17033k(this);
        Intrinsics.checkNotNullExpressionValue(m17033k, "renderLambdaToString(...)");
        return m17033k;
    }
}
