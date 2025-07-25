package com.mobilefuse.sdk.exception;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: Either.kt */
@Metadata
/* loaded from: classes7.dex */
public final class EitherKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, A, B> Either<E, B> flatMap(@NotNull Either<? extends E, ? extends A> flatMap, @NotNull Function1<? super A, ? extends Either<? extends E, ? extends B>> f) {
        Intrinsics.checkNotNullParameter(flatMap, "$this$flatMap");
        Intrinsics.checkNotNullParameter(f, "f");
        if (!(flatMap instanceof ErrorResult)) {
            if (flatMap instanceof SuccessResult) {
                return (Either) ((Either<? extends E, ? extends B>) f.invoke((Object) ((SuccessResult) flatMap).getValue()));
            }
            throw new NoWhenBranchMatchedException();
        }
        return flatMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, A, B> Either<E, B> map(@NotNull Either<? extends E, ? extends A> map, @NotNull Function1<? super A, ? extends B> f) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(f, "f");
        if (map instanceof ErrorResult) {
            return map;
        }
        if (map instanceof SuccessResult) {
            return new SuccessResult(f.invoke((Object) ((SuccessResult) map).getValue()));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, T> Either<E, T> mapError(@NotNull Either<? extends E, ? extends T> mapError, @NotNull Function1<? super E, ? extends Either<? extends E, ? extends T>> f) {
        Intrinsics.checkNotNullParameter(mapError, "$this$mapError");
        Intrinsics.checkNotNullParameter(f, "f");
        if (mapError instanceof ErrorResult) {
            return (Either) ((Either<? extends E, ? extends T>) f.invoke((Object) ((ErrorResult) mapError).getValue()));
        }
        if (mapError instanceof SuccessResult) {
            return mapError;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <E, A> void onError(@NotNull Either<? extends E, ? extends A> onError, @NotNull Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(onError, "$this$onError");
        Intrinsics.checkNotNullParameter(block, "block");
        if (onError instanceof ErrorResult) {
            block.invoke((Object) ((ErrorResult) onError).getValue());
        }
    }

    public static final <E, A> void onSuccess(@NotNull Either<? extends E, ? extends A> onSuccess, @NotNull Function1<? super A, Unit> block) {
        Intrinsics.checkNotNullParameter(onSuccess, "$this$onSuccess");
        Intrinsics.checkNotNullParameter(block, "block");
        if (onSuccess instanceof SuccessResult) {
            block.invoke((Object) ((SuccessResult) onSuccess).getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, A> Either<E, A> orElse(@NotNull Either<? extends E, ? extends A> orElse, @NotNull Functions<? extends Either<? extends E, ? extends A>> f) {
        Intrinsics.checkNotNullParameter(orElse, "$this$orElse");
        Intrinsics.checkNotNullParameter(f, "f");
        if (orElse instanceof ErrorResult) {
            return (Either) ((Either<? extends E, ? extends A>) f.invoke());
        }
        if (orElse instanceof SuccessResult) {
            return orElse;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, A> Either<E, A> unwrapSuccess(@NotNull Either<? extends E, ? extends Either<? extends E, ? extends A>> unwrapSuccess) {
        Intrinsics.checkNotNullParameter(unwrapSuccess, "$this$unwrapSuccess");
        if (!(unwrapSuccess instanceof ErrorResult)) {
            if (unwrapSuccess instanceof SuccessResult) {
                Either<E, A> either = (Either) ((SuccessResult) unwrapSuccess).getValue();
                if (!(either instanceof ErrorResult)) {
                    if (either instanceof SuccessResult) {
                        return new SuccessResult(((SuccessResult) either).getValue());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return either;
            }
            throw new NoWhenBranchMatchedException();
        }
        return unwrapSuccess;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, T> Either<E, T> whenError(@NotNull Either<? extends E, ? extends T> whenError, @NotNull Function1<? super E, Unit> block) {
        Intrinsics.checkNotNullParameter(whenError, "$this$whenError");
        Intrinsics.checkNotNullParameter(block, "block");
        if (whenError instanceof ErrorResult) {
            block.invoke((Object) ((ErrorResult) whenError).getValue());
        }
        return whenError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, T> Either<E, T> whenSuccess(@NotNull Either<? extends E, ? extends T> whenSuccess, @NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(whenSuccess, "$this$whenSuccess");
        Intrinsics.checkNotNullParameter(block, "block");
        if (whenSuccess instanceof SuccessResult) {
            block.invoke((Object) ((SuccessResult) whenSuccess).getValue());
        }
        return whenSuccess;
    }

    public static final <E, A> A withErrorFallback(@NotNull Either<? extends E, ? extends A> withErrorFallback, @NotNull Function1<? super E, ? extends A> f) {
        Intrinsics.checkNotNullParameter(withErrorFallback, "$this$withErrorFallback");
        Intrinsics.checkNotNullParameter(f, "f");
        if (withErrorFallback instanceof ErrorResult) {
            return f.invoke((Object) ((ErrorResult) withErrorFallback).getValue());
        }
        if (withErrorFallback instanceof SuccessResult) {
            return (A) ((SuccessResult) withErrorFallback).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <E, A, B, C> Either<E, C> map(@NotNull Either<? extends E, ? extends A> map, @NotNull Either<? extends E, ? extends B> eitherB, @NotNull Function2<? super A, ? super B, ? extends C> f) {
        Intrinsics.checkNotNullParameter(map, "$this$map");
        Intrinsics.checkNotNullParameter(eitherB, "eitherB");
        Intrinsics.checkNotNullParameter(f, "f");
        if (map instanceof ErrorResult) {
            return map;
        }
        if (map instanceof SuccessResult) {
            Object obj = (Object) ((SuccessResult) map).getValue();
            if (!(eitherB instanceof ErrorResult)) {
                if (!(eitherB instanceof SuccessResult)) {
                    throw new NoWhenBranchMatchedException();
                }
                eitherB = new SuccessResult<>(f.mo105910invoke(obj, (Object) ((SuccessResult) eitherB).getValue()));
            }
            return (Either<E, C>) eitherB;
        }
        throw new NoWhenBranchMatchedException();
    }
}
