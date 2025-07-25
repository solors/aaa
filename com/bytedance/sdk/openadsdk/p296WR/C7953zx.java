package com.bytedance.sdk.openadsdk.p296WR;

import com.bytedance.sdk.component.p275zx.InterfaceC7777LZ;
import com.bytedance.sdk.component.p275zx.InterfaceC7783WR;
import com.bytedance.sdk.component.p275zx.p277bX.C7788bX;
import com.bytedance.sdk.component.p275zx.p277bX.C7798bg;
import com.ironsource.C21114v8;

/* renamed from: com.bytedance.sdk.openadsdk.WR.zx */
/* loaded from: classes3.dex */
public class C7953zx implements InterfaceC7777LZ {

    /* renamed from: bg */
    private static int f17306bg;

    /* renamed from: IL */
    private long f17307IL = 0;

    /* renamed from: bX */
    private long f17308bX;
    private boolean eqN;

    /* renamed from: zx */
    private final String f17309zx;

    public C7953zx() {
        f17306bg++;
        this.f17309zx = "image_request_" + f17306bg;
    }

    /* renamed from: bX */
    private String m87344bX(String str, InterfaceC7783WR interfaceC7783WR) {
        C7798bg VzQ;
        String str2;
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1867169789:
                    if (str.equals("success")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1584526165:
                    if (str.equals("raw_cache")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1442758754:
                    if (str.equals("image_type")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1428113824:
                    if (str.equals("disk_cache")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1335717394:
                    if (str.equals("decode")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1281977283:
                    if (str.equals("failed")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1076854124:
                    if (str.equals("check_duplicate")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1017400004:
                    if (str.equals("memory_cache")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1478448621:
                    if (str.equals("net_request")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 1718821013:
                    if (str.equals("generate_key")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 2067979407:
                    if (str.equals("cache_policy")) {
                        c = '\n';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return "success";
                case 1:
                    return "raw cache";
                case 2:
                    return "image type：";
                case 3:
                    return "disk cache";
                case 4:
                    return "decode";
                case 5:
                    if ((interfaceC7783WR instanceof C7788bX) && (VzQ = ((C7788bX) interfaceC7783WR).VzQ()) != null) {
                        Throwable m87711bX = VzQ.m87711bX();
                        StringBuilder sb2 = new StringBuilder("fail：code:");
                        sb2.append(VzQ.m87710bg());
                        sb2.append(", msg:");
                        sb2.append(VzQ.m87712IL());
                        sb2.append(", exception:");
                        if (m87711bX != null) {
                            str2 = m87711bX.getMessage();
                        } else {
                            str2 = "null \r\n";
                        }
                        sb2.append(str2);
                        return sb2.toString();
                    }
                    return C21114v8.C21120f.f53958e;
                case 6:
                    return "duplicate request";
                case 7:
                    return "memory cache";
                case '\b':
                    return "net request";
                case '\t':
                    return "generate key:" + interfaceC7783WR.mo87739zx();
                case '\n':
                    return "cache policy";
            }
        }
        return str;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7777LZ
    /* renamed from: IL */
    public void mo87345IL(String str, InterfaceC7783WR interfaceC7783WR) {
        this.f17308bX += System.currentTimeMillis() - this.f17307IL;
        m87344bX(str, interfaceC7783WR);
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7777LZ
    /* renamed from: bg */
    public void mo87343bg(String str, InterfaceC7783WR interfaceC7783WR) {
        if (!this.eqN) {
            interfaceC7783WR.mo87756bg();
            interfaceC7783WR.mo87770IL();
            interfaceC7783WR.mo87758bX();
            this.eqN = true;
        }
        this.f17307IL = System.currentTimeMillis();
        m87344bX(str, interfaceC7783WR);
    }
}
