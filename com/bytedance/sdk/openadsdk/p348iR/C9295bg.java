package com.bytedance.sdk.openadsdk.p348iR;

import android.util.Pair;
import com.bykv.p135vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.p135vk.openvk.preload.geckox.net.INetWork;
import com.bykv.p135vk.openvk.preload.geckox.net.Response;
import com.bykv.p135vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7194VB;
import com.bytedance.sdk.component.p228IL.p229bg.C7197WR;
import com.bytedance.sdk.component.p228IL.p229bg.C7219ldr;
import com.bytedance.sdk.component.p228IL.p229bg.C7221yDt;
import com.bytedance.sdk.component.p228IL.p229bg.C7223zx;
import com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7177IL;
import com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7198bX;
import com.learnings.purchase.event.EventUploader;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.openadsdk.iR.bg */
/* loaded from: classes3.dex */
public class C9295bg implements INetWork {

    /* renamed from: IL */
    protected AbstractC7194VB f20763IL;

    /* renamed from: bg */
    protected AbstractC7194VB f20764bg;

    public C9295bg() {
        AbstractC7194VB.C7195bg c7195bg = new AbstractC7194VB.C7195bg();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f20764bg = c7195bg.m89637bg(10L, timeUnit).m89640IL(10L, timeUnit).m89639bX(10L, timeUnit).m89638bg();
        this.f20763IL = new AbstractC7194VB.C7195bg().m89637bg(10L, timeUnit).m89640IL(30L, timeUnit).m89639bX(30L, timeUnit).m89638bg();
    }

    /* renamed from: bg */
    private Map<String, String> m83143bg(C7219ldr c7219ldr) {
        if (c7219ldr == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < c7219ldr.m89567bg(); i++) {
            hashMap.put(c7219ldr.m89566bg(i), c7219ldr.m89568IL(i));
        }
        return hashMap;
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) throws Exception {
        String str2;
        AbstractC7189Lq mo89629IL = this.f20764bg.mo89615bg(new AbstractC7191Ta.C7192bg().m89656bg().m89658IL(str).m89659IL()).mo89629IL();
        Map<String, String> m83143bg = m83143bg(mo89629IL.mo89606iR());
        if (mo89629IL.mo89611bX() == 200) {
            str2 = mo89629IL.ldr().mo89565IL();
        } else {
            str2 = null;
        }
        return new Response(m83143bg, str2, mo89629IL.mo89611bX(), mo89629IL.mo89605zx());
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) throws Exception {
        C7223zx.C7224bg c7224bg = new C7223zx.C7224bg();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                c7224bg.m89557bg((String) pair.first, (String) pair.second);
            }
        }
        AbstractC7189Lq mo89629IL = this.f20764bg.mo89615bg(new AbstractC7191Ta.C7192bg().m89658IL(str).m89652bg((C7221yDt) c7224bg.m89558bg()).m89659IL()).mo89629IL();
        return new Response(m83143bg(mo89629IL.mo89606iR()), mo89629IL.mo89611bX() == 200 ? mo89629IL.ldr().mo89565IL() : null, mo89629IL.mo89611bX(), mo89629IL.mo89605zx());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0076: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:25:0x0076 */
    @Override // com.bykv.p135vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j, BufferOutputStream bufferOutputStream) throws Exception {
        Exception e;
        Closeable closeable;
        Closeable closeable2 = null;
        int i = 0;
        try {
            try {
                try {
                    AbstractC7189Lq mo89629IL = this.f20763IL.mo89615bg(new AbstractC7191Ta.C7192bg().m89656bg().m89658IL(str).m89659IL()).mo89629IL();
                    int mo89611bX = mo89629IL.mo89611bX();
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(mo89629IL.ldr().mo89564bX());
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int read = bufferedInputStream.read(bArr, 0, 2048);
                                if (read != -1) {
                                    bufferOutputStream.write(bArr, 0, read);
                                } else {
                                    CloseableUtils.close(bufferedInputStream);
                                    return;
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = mo89611bX;
                            throw new RuntimeException("downloadFile failed, code: " + i + ", url:" + str + ", caused by:" + e.getMessage(), e);
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th) {
                    th = th;
                    CloseableUtils.close(closeable2);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
            closeable2 = closeable;
            CloseableUtils.close(closeable2);
            throw th;
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.f20764bg.mo89615bg(new AbstractC7191Ta.C7192bg().m89656bg().m89658IL(str).m89659IL()).mo89624bg(new InterfaceC7198bX() { // from class: com.bytedance.sdk.openadsdk.iR.bg.1
            @Override // com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7198bX
            /* renamed from: bg */
            public void mo83142bg(InterfaceC7177IL interfaceC7177IL, AbstractC7189Lq abstractC7189Lq) throws IOException {
            }

            @Override // com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7198bX
            /* renamed from: bg */
            public void mo83141bg(InterfaceC7177IL interfaceC7177IL, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) throws Exception {
        AbstractC7189Lq mo89629IL = this.f20764bg.mo89615bg(new AbstractC7191Ta.C7192bg().m89658IL(str).m89652bg(C7221yDt.m89560bg(C7197WR.m89634bg(EventUploader.MEDIA_TYPE_JSON), str2)).m89659IL()).mo89629IL();
        return new Response(m83143bg(mo89629IL.mo89606iR()), mo89629IL.mo89611bX() == 200 ? mo89629IL.ldr().mo89565IL() : null, mo89629IL.mo89611bX(), mo89629IL.mo89605zx());
    }
}
