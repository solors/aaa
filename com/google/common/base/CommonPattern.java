package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class CommonPattern {
    public static CommonPattern compile(String str) {
        return Platform.m70052a(str);
    }

    public static boolean isPcreLike() {
        return Platform.m70046g();
    }

    public abstract int flags();

    public abstract CommonMatcher matcher(CharSequence charSequence);

    public abstract String pattern();

    public abstract String toString();
}
