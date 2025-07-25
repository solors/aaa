package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.p147bg.C6455IL;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.p147bg.InterfaceC6457bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6494bX;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.bg.bg */
/* loaded from: classes3.dex */
public class C6454bg extends MediaDataSource {

    /* renamed from: bg */
    public static final ConcurrentHashMap<String, C6454bg> f13464bg = new ConcurrentHashMap<>();

    /* renamed from: IL */
    private final InterfaceC6457bX f13465IL;

    /* renamed from: bX */
    private long f13466bX = -2147483648L;
    private final Context eqN;

    /* renamed from: zx */
    private final C6494bX f13467zx;

    public C6454bg(Context context, C6494bX c6494bX) {
        this.eqN = context;
        this.f13467zx = c6494bX;
        this.f13465IL = new C6455IL(context, c6494bX);
    }

    /* renamed from: bg */
    public C6494bX m91886bg() {
        return this.f13467zx;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13467zx.m91715Ta();
        InterfaceC6457bX interfaceC6457bX = this.f13465IL;
        if (interfaceC6457bX != null) {
            interfaceC6457bX.mo91873IL();
        }
        f13464bg.remove(this.f13467zx.yDt());
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        if (this.f13466bX == -2147483648L) {
            if (this.eqN != null && !TextUtils.isEmpty(this.f13467zx.m91715Ta())) {
                this.f13466bX = this.f13465IL.mo91872bX();
            } else {
                return -1L;
            }
        }
        return this.f13466bX;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        int mo91871bg = this.f13465IL.mo91871bg(j, bArr, i, i2);
        int length = bArr.length;
        Objects.toString(Thread.currentThread());
        return mo91871bg;
    }

    /* renamed from: bg */
    public static C6454bg m91885bg(Context context, C6494bX c6494bX) {
        C6454bg c6454bg = new C6454bg(context, c6494bX);
        f13464bg.put(c6494bX.yDt(), c6454bg);
        return c6454bg;
    }
}
