package com.smaato.sdk.core.util.p574fi;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.p574fi.FunctionUtils;

/* renamed from: com.smaato.sdk.core.util.fi.FunctionUtils */
/* loaded from: classes7.dex */
public final class FunctionUtils {
    private static final Runnable EMPTY_ACTION = new Runnable() { // from class: s7.a
        @Override // java.lang.Runnable
        public final void run() {
            FunctionUtils.m39335c();
        }
    };
    private static final Consumer<?> EMPTY_CONSUMER = new Consumer() { // from class: s7.b
        @Override // com.smaato.sdk.core.util.p574fi.Consumer
        public final void accept(Object obj) {
            FunctionUtils.m39337a(obj);
        }
    };

    private FunctionUtils() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m39337a(Object obj) {
        lambda$static$1(obj);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m39336b(Object obj) {
        return lambda$identity$2(obj);
    }

    /* renamed from: c */
    public static /* synthetic */ void m39335c() {
        lambda$static$0();
    }

    @NonNull
    public static Runnable emptyAction() {
        return EMPTY_ACTION;
    }

    @NonNull
    public static <T> Consumer<T> emptyConsumer() {
        return (Consumer<T>) EMPTY_CONSUMER;
    }

    @NonNull
    public static <T> Function<T, T> identity() {
        return new Function() { // from class: s7.c
            @Override // com.smaato.sdk.core.util.p574fi.Function
            public final Object apply(Object obj) {
                return FunctionUtils.m39336b(obj);
            }
        };
    }

    public static /* synthetic */ void lambda$static$0() {
    }

    public static /* synthetic */ Object lambda$identity$2(Object obj) {
        return obj;
    }

    public static /* synthetic */ void lambda$static$1(Object obj) {
    }
}
