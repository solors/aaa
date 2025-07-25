package com.mobilefuse.sdk.p543rx;

import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.p543rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Flow.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.rx.FlowKt */
/* loaded from: classes7.dex */
public final class FlowKt {
    @NotNull
    /* renamed from: catch  reason: not valid java name */
    public static final <T> Flow<T> m110236catch(@NotNull Flow<? extends T> flow, @NotNull Function2<? super FlowCollector<? super T>, ? super Throwable, Unit> transform) {
        Intrinsics.checkNotNullParameter(flow, "$this$catch");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new FlowKt$catch$$inlined$transformForConcurrency$1(flow, transform));
    }

    @NotNull
    public static final <T> Flow<T> catchElse(@NotNull Flow<? extends T> catchElse, @NotNull Function2<? super FlowCollector<? super T>, ? super Throwable, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(catchElse, "$this$catchElse");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new FlowKt$catchElse$$inlined$transformForConcurrency$1(catchElse, transform));
    }

    public static final <T> void collectResult(@NotNull Flow<? extends T> collectResult, @NotNull final Function1<? super T, Unit> transform) {
        Intrinsics.checkNotNullParameter(collectResult, "$this$collectResult");
        Intrinsics.checkNotNullParameter(transform, "transform");
        collectResult.collect(new FlowCollector() { // from class: com.mobilefuse.sdk.rx.FlowKt$collectResult$1
            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof SuccessResult) {
                    transform.invoke(((SuccessResult) result).getValue());
                }
            }

            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public void emitError(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                FlowCollector.DefaultImpls.emitError(this, error);
            }

            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public void emitSuccess(T t) {
                FlowCollector.DefaultImpls.emitSuccess(this, t);
            }
        });
    }

    public static final <T> void emit(@NotNull FlowCollector<? super T> emit, T t) {
        Intrinsics.checkNotNullParameter(emit, "$this$emit");
        emit.emit(new SuccessResult(t));
    }

    @NotNull
    public static final <T> Flow<T> emitOn(@NotNull Flow<? extends T> emitOn, @NotNull Schedulers scheduler) {
        Intrinsics.checkNotNullParameter(emitOn, "$this$emitOn");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        return flow(new FlowKt$emitOn$$inlined$transformOnThread$1(emitOn, scheduler));
    }

    @NotNull
    public static final <T> Flow<T> filter(@NotNull Flow<? extends T> filter, @NotNull Function1<? super T, Boolean> transform) {
        Intrinsics.checkNotNullParameter(filter, "$this$filter");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new FlowKt$filter$$inlined$transform$1(filter, transform));
    }

    @NotNull
    public static final <T> Flow<T> flow(@NotNull Function1<? super FlowCollector<? super T>, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new BaseFlow(block);
    }

    @NotNull
    public static final <T> Flow<T> flowSingle(T t) {
        return flow(new FlowKt$flowSingle$1(t));
    }

    @NotNull
    public static final <T, R> Flow<R> map(@NotNull Flow<? extends T> map, @NotNull Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new FlowKt$map$$inlined$transform$1(map, transform));
    }

    @NotNull
    public static final <T, R> Flow<Either<BaseError, R>> mapEitherSuccessResult(@NotNull Flow<? extends Either<? extends BaseError, ? extends T>> mapEitherSuccessResult, @NotNull Function1<? super T, ? extends Either<? extends BaseError, ? extends R>> transform) {
        Intrinsics.checkNotNullParameter(mapEitherSuccessResult, "$this$mapEitherSuccessResult");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new FlowKt$mapEitherSuccessResult$$inlined$transform$1(mapEitherSuccessResult, transform));
    }

    @NotNull
    public static final <T> Flow<T> mapIf(@NotNull Flow<? extends T> mapIf, @NotNull Function1<? super T, Boolean> condition, @NotNull Function1<? super T, ? extends T> transform) {
        Intrinsics.checkNotNullParameter(mapIf, "$this$mapIf");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new FlowKt$mapIf$$inlined$transform$1(mapIf, condition, transform));
    }

    @NotNull
    public static final <T> Flow<T> run(@NotNull Flow<? extends T> run, @NotNull Function1<? super T, Unit> transform) {
        Intrinsics.checkNotNullParameter(run, "$this$run");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new FlowKt$run$1(run, transform));
    }

    @NotNull
    public static final <T> Flow<T> runOn(@NotNull Flow<? extends T> runOn, @NotNull Schedulers scheduler) {
        Intrinsics.checkNotNullParameter(runOn, "$this$runOn");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        return flow(new FlowKt$runOn$$inlined$transformForConcurrency$1(runOn, scheduler));
    }

    @NotNull
    public static final <T> Flow<T> toFlow(T t) {
        return flow(new FlowKt$toFlow$1(t));
    }

    @NotNull
    public static final <T, R> Flow<R> transform(@NotNull Flow<? extends T> transform, @NotNull Function2<? super FlowCollector<? super R>, ? super T, Unit> transform2) {
        Intrinsics.checkNotNullParameter(transform, "$this$transform");
        Intrinsics.checkNotNullParameter(transform2, "transform");
        return flow(new FlowKt$transform$1(transform, transform2));
    }

    @NotNull
    public static final <T, R> Flow<R> transformForConcurrency(@NotNull Flow<? extends T> transformForConcurrency, @NotNull Function2<? super FlowCollector<? super R>, ? super Either<? extends Throwable, ? extends T>, Unit> transform) {
        Intrinsics.checkNotNullParameter(transformForConcurrency, "$this$transformForConcurrency");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new FlowKt$transformForConcurrency$1(transformForConcurrency, transform));
    }

    @NotNull
    public static final <T, R> Flow<R> transformOnThread(@NotNull Flow<? extends T> transformOnThread, @NotNull Schedulers scheduler, @NotNull Function2<? super FlowCollector<? super R>, ? super Either<? extends Throwable, ? extends T>, Unit> transform) {
        Intrinsics.checkNotNullParameter(transformOnThread, "$this$transformOnThread");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new FlowKt$transformOnThread$1(transformOnThread, scheduler, transform));
    }

    @NotNull
    public static final <T1, T2, R> Flow<R> zip(@NotNull Flow<? extends T1> zip, @NotNull Flow<? extends T2> other, @NotNull Function2<? super T1, ? super T2, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zip, "$this$zip");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new FlowKt$zip$$inlined$transform$1(zip, other, transform));
    }

    @NotNull
    public static final <T1, T2, R> Flow<Either<BaseError, R>> zip2(@NotNull Flow<? extends Either<? extends BaseError, ? extends T1>> zip2, @NotNull Function1<? super T1, ? extends Flow<? extends Either<? extends BaseError, ? extends T2>>> other, @NotNull Function2<? super T1, ? super T2, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(zip2, "$this$zip2");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return flow(new FlowKt$zip2$$inlined$transform$1(zip2, other, transform));
    }

    @NotNull
    public static final <T> Flow<T> flowSingle(@NotNull Functions<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return flow(new FlowKt$flowSingle$2(block));
    }
}
