package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.p147bg;

import android.content.Context;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p148zx.C6488IL;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.C6492bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6494bX;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7194VB;
import com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7177IL;
import com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7198bX;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL */
/* loaded from: classes3.dex */
public class C6455IL implements InterfaceC6457bX {

    /* renamed from: WR */
    private RandomAccessFile f13470WR;

    /* renamed from: bX */
    private File f13471bX;

    /* renamed from: eo */
    private final C6494bX f13473eo;
    private File eqN;

    /* renamed from: zx */
    private long f13475zx;

    /* renamed from: bg */
    private volatile long f13472bg = -2147483648L;

    /* renamed from: IL */
    private final Object f13468IL = new Object();
    private volatile long ldr = -1;

    /* renamed from: iR */
    private volatile boolean f13474iR = false;

    /* renamed from: Kg */
    private volatile boolean f13469Kg = false;

    public C6455IL(Context context, C6494bX c6494bX) {
        this.f13475zx = 0L;
        this.f13470WR = null;
        this.f13473eo = c6494bX;
        try {
            this.f13471bX = C6488IL.m91770IL(c6494bX.m91722IL(), c6494bX.yDt());
            this.eqN = C6488IL.m91769bX(c6494bX.m91722IL(), c6494bX.yDt());
            if (eqN()) {
                this.f13470WR = new RandomAccessFile(this.eqN, "r");
            } else {
                this.f13470WR = new RandomAccessFile(this.f13471bX, "rw");
            }
            if (!eqN()) {
                this.f13475zx = this.f13471bX.length();
                m91880bg();
            }
        } catch (Throwable unused) {
            c6494bX.m91715Ta();
        }
    }

    private boolean eqN() {
        return this.eqN.exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ldr() throws IOException {
        synchronized (this.f13468IL) {
            if (eqN()) {
                this.f13473eo.m91715Ta();
                this.f13473eo.yDt();
            } else if (this.f13471bX.renameTo(this.eqN)) {
                RandomAccessFile randomAccessFile = this.f13470WR;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f13470WR = new RandomAccessFile(this.eqN, "rw");
                this.f13473eo.yDt();
                this.f13473eo.m91715Ta();
            } else {
                throw new IOException("Error renaming file " + this.f13471bX + " to " + this.eqN + " for completion!");
            }
        }
    }

    /* renamed from: zx */
    private long m91875zx() {
        if (eqN()) {
            return this.eqN.length();
        }
        return this.f13471bX.length();
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.p147bg.InterfaceC6457bX
    /* renamed from: IL */
    public void mo91873IL() {
        try {
            if (!this.f13474iR) {
                this.f13470WR.close();
            }
            File file = this.f13471bX;
            if (file != null) {
                file.setLastModified(System.currentTimeMillis());
            }
            File file2 = this.eqN;
            if (file2 != null) {
                file2.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        this.f13474iR = true;
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.p147bg.InterfaceC6457bX
    /* renamed from: bX */
    public long mo91872bX() throws IOException {
        if (eqN()) {
            this.f13472bg = this.eqN.length();
        } else {
            synchronized (this.f13468IL) {
                int i = 0;
                do {
                    if (this.f13472bg == -2147483648L) {
                        i += 15;
                        try {
                            this.f13468IL.wait(5L);
                        } catch (InterruptedException unused) {
                            throw new IOException("total length InterruptException");
                        }
                    }
                } while (i <= 20000);
                return -1L;
            }
        }
        return this.f13472bg;
    }

    /* renamed from: bg */
    public void m91880bg() {
        AbstractC7194VB.C7195bg c7195bg;
        if (C6492bX.eqN() != null) {
            c7195bg = C6492bX.eqN().m89641IL();
        } else {
            c7195bg = new AbstractC7194VB.C7195bg("v_cache");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c7195bg.m89637bg(this.f13473eo.m91700vb(), timeUnit).m89640IL(this.f13473eo.xxp(), timeUnit).m89639bX(this.f13473eo.VzQ(), timeUnit);
        AbstractC7194VB m89638bg = c7195bg.m89638bg();
        this.f13473eo.yDt();
        AbstractC7191Ta.C7192bg c7192bg = new AbstractC7191Ta.C7192bg();
        m89638bg.mo89615bg(c7192bg.m89648bg("RANGE", "bytes=" + this.f13475zx + "-").m89658IL(this.f13473eo.m91715Ta()).m89656bg().m89650bg("videoLoadWhenPlaying").m89655bg(9).m89659IL()).mo89624bg(new InterfaceC7198bX() { // from class: com.bykv.vk.openvk.bg.bg.IL.bg.bg.IL.1
            @Override // com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7198bX
            /* renamed from: bg */
            public void mo83141bg(InterfaceC7177IL interfaceC7177IL, IOException iOException) {
                C6455IL.this.f13469Kg = false;
                C6455IL.this.f13472bg = -1L;
            }

            /* JADX WARN: Removed duplicated region for block: B:106:0x00c0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:108:0x0079 A[SYNTHETIC] */
            @Override // com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7198bX
            /* renamed from: bg */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void mo83142bg(com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7177IL r17, com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq r18) throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 460
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.p147bg.C6455IL.C64561.mo83142bg(com.bytedance.sdk.component.IL.bg.IL, com.bytedance.sdk.component.IL.bg.Lq):void");
            }
        });
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.p147bg.InterfaceC6457bX
    /* renamed from: bg */
    public int mo91871bg(long j, byte[] bArr, int i, int i2) throws IOException {
        try {
            if (j == this.f13472bg) {
                return -1;
            }
            int i3 = 0;
            int i4 = 0;
            while (!this.f13474iR) {
                synchronized (this.f13468IL) {
                    if (j < m91875zx()) {
                        this.f13470WR.seek(j);
                        i4 = this.f13470WR.read(bArr, i, i2);
                    } else {
                        i3 += 33;
                        this.f13468IL.wait(33L);
                    }
                }
                if (i4 > 0) {
                    return i4;
                }
                if (i3 >= 20000) {
                    throw new SocketTimeoutException();
                }
            }
            return -1;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new IOException();
        }
    }
}
