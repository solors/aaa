package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class CollectPreconditions {
    CollectPreconditions() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m69728a(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 26);
            sb2.append("null value in entry: ");
            sb2.append(valueOf);
            sb2.append("=null");
            throw new NullPointerException(sb2.toString());
        }
        String valueOf2 = String.valueOf(obj2);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 24);
        sb3.append("null key in entry: null=");
        sb3.append(valueOf2);
        throw new NullPointerException(sb3.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: b */
    public static int m69727b(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    /* renamed from: c */
    public static long m69726c(long j, String str) {
        if (j >= 0) {
            return j;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 49);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m69725d(int i, String str) {
        if (i > 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 38);
        sb2.append(str);
        sb2.append(" must be positive but was: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m69724e(boolean z) {
        Preconditions.checkState(z, "no calls to next() since the last call to remove()");
    }
}
