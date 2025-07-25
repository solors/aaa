package com.mobilefuse.sdk.p543rx;

import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Flow.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.rx.FlowCollector */
/* loaded from: classes7.dex */
public interface FlowCollector<T> {

    /* compiled from: Flow.kt */
    @Metadata
    /* renamed from: com.mobilefuse.sdk.rx.FlowCollector$DefaultImpls */
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static <T> void emitError(@NotNull FlowCollector<? super T> flowCollector, @NotNull Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            flowCollector.emit(new ErrorResult(error));
        }

        public static <T> void emitSuccess(@NotNull FlowCollector<? super T> flowCollector, T t) {
            flowCollector.emit(new SuccessResult(t));
        }
    }

    void emit(@NotNull Either<? extends Throwable, ? extends T> either);

    void emitError(@NotNull Throwable th);

    void emitSuccess(T t);
}
