package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
final class on0 implements Iterator<Object> {

    /* renamed from: b */
    public static final on0 f83563b;

    /* renamed from: c */
    private static final /* synthetic */ on0[] f83564c;

    static {
        on0 on0Var = new on0();
        f83563b = on0Var;
        f83564c = new on0[]{on0Var};
    }

    private on0() {
    }

    public static on0 valueOf(String str) {
        return (on0) Enum.valueOf(on0.class, str);
    }

    public static on0[] values() {
        return (on0[]) f83564c.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
