package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class EmptyImmutableListMultimap extends ImmutableListMultimap<Object, Object> {

    /* renamed from: k */
    static final EmptyImmutableListMultimap f39930k = new EmptyImmutableListMultimap();

    private EmptyImmutableListMultimap() {
        super(ImmutableMap.m69397of(), 0);
    }

    private Object readResolve() {
        return f39930k;
    }
}
