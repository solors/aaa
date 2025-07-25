package com.google.firebase.crashlytics.internal.common;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
class CLSUUID {

    /* renamed from: a */
    private static final AtomicLong f42300a = new AtomicLong(0);

    /* renamed from: b */
    private static String f42301b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CLSUUID(IdManager idManager) {
        byte[] bArr = new byte[10];
        m67193e(bArr);
        m67194d(bArr);
        m67195c(bArr);
        String sha1 = CommonUtils.sha1(idManager.getInstallIds().getCrashlyticsInstallId());
        String hexify = CommonUtils.hexify(bArr);
        Locale locale = Locale.US;
        f42301b = String.format(locale, "%s%s%s%s", hexify.substring(0, 12), hexify.substring(12, 16), hexify.subSequence(16, 20), sha1.substring(0, 12)).toUpperCase(locale);
    }

    /* renamed from: a */
    private static byte[] m67197a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private static byte[] m67196b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    private void m67195c(byte[] bArr) {
        byte[] m67196b = m67196b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = m67196b[0];
        bArr[9] = m67196b[1];
    }

    /* renamed from: d */
    private void m67194d(byte[] bArr) {
        byte[] m67196b = m67196b(f42300a.incrementAndGet());
        bArr[6] = m67196b[0];
        bArr[7] = m67196b[1];
    }

    /* renamed from: e */
    private void m67193e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] m67197a = m67197a(time / 1000);
        bArr[0] = m67197a[0];
        bArr[1] = m67197a[1];
        bArr[2] = m67197a[2];
        bArr[3] = m67197a[3];
        byte[] m67196b = m67196b(time % 1000);
        bArr[4] = m67196b[0];
        bArr[5] = m67196b[1];
    }

    public String toString() {
        return f42301b;
    }
}
