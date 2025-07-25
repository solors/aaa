package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContinuationImpl.kt */
@Metadata
/* renamed from: kotlin.coroutines.jvm.internal.k */
/* loaded from: classes7.dex */
public abstract class AbstractC37595k extends AbstractC37594j implements FunctionBase<Object> {
    private final int arity;

    public AbstractC37595k(int i, @Nullable Continuation<Object> continuation) {
        super(continuation);
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public String toString() {
        if (getCompletion() == null) {
            String m17034j = Reflection.m17034j(this);
            Intrinsics.checkNotNullExpressionValue(m17034j, "renderLambdaToString(...)");
            return m17034j;
        }
        return super.toString();
    }

    public AbstractC37595k(int i) {
        this(i, null);
    }
}
