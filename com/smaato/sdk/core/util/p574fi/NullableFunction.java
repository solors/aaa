package com.smaato.sdk.core.util.p574fi;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.p574fi.NullableFunction;

/* renamed from: com.smaato.sdk.core.util.fi.NullableFunction */
/* loaded from: classes7.dex */
public interface NullableFunction<T, R> {
    @NonNull
    static <T> NullableFunction<T, T> identity() {
        return new NullableFunction() { // from class: s7.d
            @Override // com.smaato.sdk.core.util.p574fi.NullableFunction
            public final Object apply(Object obj) {
                Object lambda$identity$0;
                lambda$identity$0 = NullableFunction.lambda$identity$0(obj);
                return lambda$identity$0;
            }
        };
    }

    @Nullable
    R apply(@Nullable T t);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ Object lambda$identity$0(Object obj) {
        return obj;
    }
}
