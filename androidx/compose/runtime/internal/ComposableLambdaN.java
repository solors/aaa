package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p1076zd.FunctionN;

/* compiled from: ComposableLambdaN.jvm.kt */
@Stable
@ComposeCompilerApi
@Metadata
/* loaded from: classes.dex */
public interface ComposableLambdaN extends FunctionN<Object> {
    @Override // kotlin.jvm.internal.FunctionBase
    /* synthetic */ int getArity();

    @Override // p1076zd.FunctionN
    /* synthetic */ Object invoke(@NotNull Object... objArr);
}
