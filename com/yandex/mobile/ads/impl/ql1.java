package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public abstract class ql1 {

    /* renamed from: com.yandex.mobile.ads.impl.ql1$a */
    /* loaded from: classes8.dex */
    public static final class C31220a {
        private C31220a() {
        }

        /* renamed from: a */
        public static pl1 m30274a(byte[] bArr) {
            int length = bArr.length;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            long length2 = bArr.length;
            long j = 0;
            long j2 = length;
            byte[] bArr2 = z32.f88697a;
            if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
                return new pl1(null, bArr, length, 0);
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        public /* synthetic */ C31220a(int i) {
            this();
        }
    }

    @NotNull
    /* renamed from: a */
    public static final pl1 m30276a(@NotNull byte[] content) {
        Intrinsics.checkNotNullParameter(content, "content");
        int length = content.length;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        long length2 = content.length;
        long j = 0;
        long j2 = length;
        byte[] bArr = z32.f88697a;
        if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
            return new pl1(null, content, length, 0);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: a */
    public abstract long mo30278a() throws IOException;

    /* renamed from: a */
    public abstract void mo30277a(@NotNull BufferedSink bufferedSink) throws IOException;

    @Nullable
    /* renamed from: b */
    public abstract cu0 mo30275b();
}
