package com.bykv.p135vk.openvk.preload.geckox.utils;

/* renamed from: com.bykv.vk.openvk.preload.geckox.utils.h */
/* loaded from: classes3.dex */
public final class UnZipUtils {

    /* renamed from: a */
    private static byte[] f14130a = {80, 75, 3, 4};

    /* renamed from: b */
    private static byte[] f14131b = {80, 75, 5, 6};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:5:0x0011, B:7:0x0017, B:9:0x0024, B:11:0x002c, B:17:0x003a, B:19:0x0051, B:21:0x0057, B:23:0x0066, B:24:0x006a, B:25:0x0085, B:26:0x0086, B:28:0x0095, B:31:0x00a9, B:35:0x00b1, B:36:0x00b4, B:37:0x00b5, B:38:0x00c0, B:39:0x00c1, B:40:0x00d0, B:43:0x00d6, B:45:0x00df, B:46:0x00ee, B:47:0x00ef, B:48:0x00fe), top: B:58:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m91211a(java.io.InputStream r8, java.lang.String r9, java.lang.String r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p135vk.openvk.preload.geckox.utils.UnZipUtils.m91211a(java.io.InputStream, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (java.util.Arrays.equals(com.bykv.p135vk.openvk.preload.geckox.utils.UnZipUtils.f14131b, r1) != false) goto L13;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m91212a(java.io.InputStream r4) throws java.lang.Exception {
        /*
            r0 = 4
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L23
            r2 = 0
            int r3 = r4.read(r1, r2, r0)     // Catch: java.lang.Throwable -> L23
            if (r3 != r0) goto L1f
            byte[] r0 = com.bykv.p135vk.openvk.preload.geckox.utils.UnZipUtils.f14130a     // Catch: java.lang.Throwable -> L23
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L1a
            byte[] r0 = com.bykv.p135vk.openvk.preload.geckox.utils.UnZipUtils.f14131b     // Catch: java.lang.Throwable -> L23
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L1b
        L1a:
            r2 = 1
        L1b:
            com.bykv.p135vk.openvk.preload.geckox.utils.CloseableUtils.close(r4)
            return r2
        L1f:
            com.bykv.p135vk.openvk.preload.geckox.utils.CloseableUtils.close(r4)
            return r2
        L23:
            r0 = move-exception
            com.bykv.p135vk.openvk.preload.geckox.utils.CloseableUtils.close(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p135vk.openvk.preload.geckox.utils.UnZipUtils.m91212a(java.io.InputStream):boolean");
    }
}
