package com.bytedance.sdk.component.p257iR.p258IL;

import android.text.TextUtils;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7194VB;
import com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7177IL;
import com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7198bX;
import com.bytedance.sdk.component.p257iR.C7608IL;
import com.bytedance.sdk.component.p257iR.p260bg.AbstractC7632bg;
import com.google.common.net.HttpHeaders;
import com.inmobi.unification.sdk.InitializationStatus;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.iR.IL.bg */
/* loaded from: classes3.dex */
public class C7612bg extends AbstractC7611bX {

    /* renamed from: IL */
    public File f16599IL;

    /* renamed from: bg */
    public File f16600bg;

    /* renamed from: eo */
    private volatile boolean f16601eo;

    public C7612bg(AbstractC7194VB abstractC7194VB) {
        super(abstractC7194VB);
    }

    public void eqN() {
        try {
            this.f16600bg.delete();
        } catch (Throwable unused) {
        }
        try {
            this.f16599IL.delete();
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: iR */
    public static boolean m88386iR(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), "gzip");
    }

    public static long ldr(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else if (map.containsKey("Content-Length")) {
            str = map.get("Content-Length");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || str == null) {
            return 0L;
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: zx */
    public static boolean m88385zx(Map<String, String> map) {
        if (TextUtils.equals(map.get(HttpHeaders.ACCEPT_RANGES), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        if (str != null && str.startsWith("bytes")) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.p257iR.p258IL.AbstractC7611bX
    /* renamed from: IL */
    public void mo88395IL() {
        this.f16601eo = true;
        super.mo88395IL();
    }

    /* renamed from: bg */
    public void m88388bg(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f16600bg = new File(str, str2);
        this.f16599IL = new File(str, str2 + ".temp");
    }

    /* renamed from: bg */
    public void m88389bg(final AbstractC7632bg abstractC7632bg) {
        File file = this.f16600bg;
        if (file == null || this.f16599IL == null) {
            if (abstractC7632bg != null) {
                abstractC7632bg.mo83461bg(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.f16600bg.length() != 0 && abstractC7632bg != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C7608IL c7608il = new C7608IL(true, 200, InitializationStatus.SUCCESS, null, null, currentTimeMillis, currentTimeMillis);
            c7608il.m88410bg(this.f16600bg);
            abstractC7632bg.mo83462bg(this, c7608il);
            return;
        }
        long length = this.f16599IL.length();
        final long j = length >= 0 ? length : 0L;
        AbstractC7191Ta.C7192bg c7192bg = new AbstractC7191Ta.C7192bg();
        c7192bg.m89651bg((Object) m88400bX());
        m88401IL("Range", "bytes=" + j + "-");
        if (TextUtils.isEmpty(this.f16594Kg)) {
            abstractC7632bg.mo83461bg(this, new IOException("Url is Empty"));
            return;
        }
        try {
            c7192bg.m89658IL(this.f16594Kg);
            if (!TextUtils.isEmpty(this.f16598zx)) {
                c7192bg.m89650bg(this.f16598zx);
            }
            int i = this.ldr;
            if (i > 0) {
                c7192bg.m89655bg(i);
            }
            m88397bg(c7192bg);
            this.f16596bX.mo89615bg(c7192bg.m89656bg().m89659IL()).mo89624bg(new InterfaceC7198bX() { // from class: com.bytedance.sdk.component.iR.IL.bg.1
                {
                    C7612bg.this = this;
                }

                @Override // com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7198bX
                /* renamed from: bg */
                public void mo83141bg(InterfaceC7177IL interfaceC7177IL, IOException iOException) {
                    AbstractC7632bg abstractC7632bg2 = abstractC7632bg;
                    if (abstractC7632bg2 != null) {
                        abstractC7632bg2.mo83461bg(C7612bg.this, iOException);
                    }
                    C7612bg.this.eqN();
                }

                /* JADX WARN: Code restructure failed: missing block: B:213:0x0173, code lost:
                    r10.seek(r14);
                    r10.write(r0, 0, r11);
                    r14 = r14 + r11;
                    r11 = 0;
                 */
                /* JADX WARN: Removed duplicated region for block: B:205:0x0158  */
                /* JADX WARN: Removed duplicated region for block: B:293:0x0196 A[SYNTHETIC] */
                @Override // com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7198bX
                /* renamed from: bg */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void mo83142bg(com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7177IL r20, com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq r21) throws java.io.IOException {
                    /*
                        Method dump skipped, instructions count: 599
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p257iR.p258IL.C7612bg.C76131.mo83142bg(com.bytedance.sdk.component.IL.bg.IL, com.bytedance.sdk.component.IL.bg.Lq):void");
                }
            });
        } catch (IllegalArgumentException unused) {
            abstractC7632bg.mo83461bg(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:254:0x019e A[Catch: all -> 0x0236, TryCatch #12 {all -> 0x0236, blocks: (B:246:0x017f, B:248:0x0185, B:250:0x0189, B:251:0x018f, B:252:0x0196, B:254:0x019e, B:256:0x01ae, B:262:0x01ba, B:264:0x01c6, B:267:0x01cf, B:268:0x01d6, B:271:0x01dc, B:279:0x01f4, B:281:0x01fc, B:283:0x0206, B:285:0x0210, B:293:0x0226, B:276:0x01ea), top: B:347:0x017f }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x01ba A[Catch: all -> 0x0236, TryCatch #12 {all -> 0x0236, blocks: (B:246:0x017f, B:248:0x0185, B:250:0x0189, B:251:0x018f, B:252:0x0196, B:254:0x019e, B:256:0x01ae, B:262:0x01ba, B:264:0x01c6, B:267:0x01cf, B:268:0x01d6, B:271:0x01dc, B:279:0x01f4, B:281:0x01fc, B:283:0x0206, B:285:0x0210, B:293:0x0226, B:276:0x01ea), top: B:347:0x017f }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x01ca A[LOOP:1: B:252:0x0196->B:266:0x01ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x01d7 A[SYNTHETIC] */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.p257iR.C7608IL m88391bg() {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p257iR.p258IL.C7612bg.m88391bg():com.bytedance.sdk.component.iR.IL");
    }
}
