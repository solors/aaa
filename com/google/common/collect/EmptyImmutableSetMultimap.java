package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class EmptyImmutableSetMultimap extends ImmutableSetMultimap<Object, Object> {

    /* renamed from: m */
    static final EmptyImmutableSetMultimap f39931m = new EmptyImmutableSetMultimap();

    private EmptyImmutableSetMultimap() {
        super(ImmutableMap.m69397of(), 0, null);
    }

    private Object readResolve() {
        return f39931m;
    }
}
