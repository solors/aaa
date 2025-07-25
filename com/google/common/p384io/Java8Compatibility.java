package com.google.common.p384io;

import com.google.common.annotations.GwtIncompatible;
import java.nio.Buffer;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* renamed from: com.google.common.io.Java8Compatibility */
/* loaded from: classes4.dex */
final class Java8Compatibility {
    private Java8Compatibility() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m68221a(Buffer buffer) {
        buffer.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m68220b(Buffer buffer) {
        buffer.flip();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m68219c(Buffer buffer, int i) {
        buffer.limit(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m68218d(Buffer buffer, int i) {
        buffer.position(i);
    }
}
