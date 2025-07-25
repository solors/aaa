package com.facebook.ads.redexgen.p370X;

import java.io.File;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.0D */
/* loaded from: assets/audience_network.dex */
public final class C108770D implements Comparator<File> {
    public C108770D() {
    }

    private int A00(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A01 */
    public final int compare(File file, File file2) {
        return A00(file.lastModified(), file2.lastModified());
    }
}
