package com.smaato.sdk.video.p577fi;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.p577fi.CheckedFunction;
import com.smaato.sdk.video.p577fi.CheckedFunctionUtils;

/* renamed from: com.smaato.sdk.video.fi.CheckedFunctionUtils */
/* loaded from: classes7.dex */
public final class CheckedFunctionUtils {
    private CheckedFunctionUtils() {
    }

    /* renamed from: a */
    public static /* synthetic */ Object m38947a(CheckedFunction checkedFunction, CheckedFunction checkedFunction2, Object obj) {
        return lambda$andThen$2(checkedFunction, checkedFunction2, obj);
    }

    public static <V, T, R> CheckedFunction<T, V> andThen(@NonNull final CheckedFunction<? super T, ? extends R> checkedFunction, @NonNull final CheckedFunction<? super R, ? extends V> checkedFunction2) {
        Objects.requireNonNull(checkedFunction2);
        return new CheckedFunction() { // from class: a8.a
            @Override // com.smaato.sdk.video.p577fi.CheckedFunction
            public final Object apply(Object obj) {
                return CheckedFunctionUtils.m38947a(CheckedFunction.this, checkedFunction, obj);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ Object m38946b(CheckedFunction checkedFunction, CheckedFunction checkedFunction2, Object obj) {
        return lambda$compose$1(checkedFunction, checkedFunction2, obj);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m38945c(Object obj) {
        return lambda$identity$0(obj);
    }

    public static <V, T, R> CheckedFunction<V, R> compose(@NonNull final CheckedFunction<? super T, ? extends R> checkedFunction, @NonNull final CheckedFunction<? super V, ? extends T> checkedFunction2) {
        Objects.requireNonNull(checkedFunction2);
        return new CheckedFunction() { // from class: a8.b
            @Override // com.smaato.sdk.video.p577fi.CheckedFunction
            public final Object apply(Object obj) {
                return CheckedFunctionUtils.m38946b(CheckedFunction.this, checkedFunction2, obj);
            }
        };
    }

    public static <T> CheckedFunction<T, T> identity() {
        return new CheckedFunction() { // from class: a8.c
            @Override // com.smaato.sdk.video.p577fi.CheckedFunction
            public final Object apply(Object obj) {
                return CheckedFunctionUtils.m38945c(obj);
            }
        };
    }

    public static /* synthetic */ Object lambda$andThen$2(CheckedFunction checkedFunction, CheckedFunction checkedFunction2, Object obj) throws Exception {
        return checkedFunction.apply(checkedFunction2.apply(obj));
    }

    public static /* synthetic */ Object lambda$compose$1(CheckedFunction checkedFunction, CheckedFunction checkedFunction2, Object obj) throws Exception {
        return checkedFunction.apply(checkedFunction2.apply(obj));
    }

    public static /* synthetic */ Object lambda$identity$0(Object obj) throws Exception {
        return obj;
    }
}
