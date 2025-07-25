package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Platform {
    private Platform() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> T[] m68862a(Object[] objArr, int i, int i2, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i, i2, tArr.getClass());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T> T[] m68861b(T[] tArr, int i) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static <K, V> Map<K, V> m68860c(int i) {
        return CompactHashMap.createWithExpectedSize(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <E> Set<E> m68859d(int i) {
        return CompactHashSet.createWithExpectedSize(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static <K, V> Map<K, V> m68858e(int i) {
        return CompactLinkedHashMap.createWithExpectedSize(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static <E> Set<E> m68857f(int i) {
        return CompactLinkedHashSet.createWithExpectedSize(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static <E> Set<E> m68856g() {
        return CompactHashSet.create();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static <K, V> Map<K, V> m68855h() {
        return CompactHashMap.create();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static MapMaker m68854i(MapMaker mapMaker) {
        return mapMaker.weakKeys();
    }
}
