package com.google.common.hash;

import com.google.common.annotations.GwtIncompatible;
import java.nio.Buffer;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class Java8Compatibility {
    private Java8Compatibility() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m68326a(Buffer buffer) {
        buffer.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m68325b(Buffer buffer) {
        buffer.flip();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m68324c(Buffer buffer, int i) {
        buffer.limit(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m68323d(Buffer buffer, int i) {
        buffer.position(i);
    }
}
