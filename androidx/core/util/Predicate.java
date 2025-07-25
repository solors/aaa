package androidx.core.util;

import android.annotation.SuppressLint;
import java.util.Objects;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public interface Predicate<T> {
    /* renamed from: a */
    static /* synthetic */ boolean m104922a(Object obj) {
        return Objects.isNull(obj);
    }

    /* renamed from: b */
    static /* synthetic */ boolean m104921b(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.lambda$or$2(predicate2, obj);
    }

    /* renamed from: c */
    static /* synthetic */ boolean m104920c(Predicate predicate, Predicate predicate2, Object obj) {
        return predicate.lambda$and$0(predicate2, obj);
    }

    /* renamed from: d */
    static /* synthetic */ boolean m104919d(Predicate predicate, Object obj) {
        return predicate.lambda$negate$1(obj);
    }

    /* renamed from: e */
    static /* synthetic */ boolean m104918e(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @SuppressLint({"MissingNullability"})
    static <T> Predicate<T> isEqual(@SuppressLint({"MissingNullability"}) final Object obj) {
        if (obj == null) {
            return new Predicate() { // from class: androidx.core.util.e
                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj2) {
                    return Predicate.m104922a(obj2);
                }
            };
        }
        return new Predicate() { // from class: androidx.core.util.f
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj2) {
                return Predicate.m104918e(obj, obj2);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$and$0(Predicate predicate, Object obj) {
        if (test(obj) && predicate.test(obj)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$negate$1(Object obj) {
        return !test(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$or$2(Predicate predicate, Object obj) {
        if (!test(obj) && !predicate.test(obj)) {
            return false;
        }
        return true;
    }

    @SuppressLint({"MissingNullability"})
    static <T> Predicate<T> not(@SuppressLint({"MissingNullability"}) Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return (Predicate<? super T>) predicate.negate();
    }

    @SuppressLint({"MissingNullability"})
    default Predicate<T> and(@SuppressLint({"MissingNullability"}) final Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new Predicate() { // from class: androidx.core.util.g
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return Predicate.m104920c(Predicate.this, predicate, obj);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    default Predicate<T> negate() {
        return new Predicate() { // from class: androidx.core.util.h
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return Predicate.m104919d(Predicate.this, obj);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    /* renamed from: or */
    default Predicate<T> m104917or(@SuppressLint({"MissingNullability"}) final Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new Predicate() { // from class: androidx.core.util.d
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return Predicate.m104921b(Predicate.this, predicate, obj);
            }
        };
    }

    boolean test(T t);
}
