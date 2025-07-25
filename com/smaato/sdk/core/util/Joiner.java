package com.smaato.sdk.core.util;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public final class Joiner {
    private Joiner() {
    }

    @NonNull
    public static String join(@NonNull CharSequence charSequence, @NonNull Iterable iterable) {
        Objects.requireNonNull(charSequence);
        Objects.requireNonNull(iterable);
        StringBuilder sb2 = new StringBuilder();
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            sb2.append(it.next());
            while (it.hasNext()) {
                sb2.append(charSequence);
                sb2.append(it.next());
            }
        }
        return sb2.toString();
    }

    @NonNull
    public static String join(@NonNull CharSequence charSequence, @NonNull Object... objArr) {
        Objects.requireNonNull(charSequence);
        Objects.requireNonNull(objArr);
        StringBuilder sb2 = new StringBuilder();
        boolean z = true;
        for (Object obj : objArr) {
            if (obj != null) {
                if (z) {
                    z = false;
                } else {
                    sb2.append(charSequence);
                }
                sb2.append(obj);
            }
        }
        return sb2.toString();
    }
}
