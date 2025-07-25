package com.bytedance.sdk.component.ldr.p261bg.ldr;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.bytedance.sdk.component.ldr.p261bg.C7659Kg;
import com.bytedance.sdk.component.ldr.p261bg.InterfaceC7724zx;
import com.bytedance.sdk.component.ldr.p261bg.p274zx.AbstractRunnableC7729zx;
import com.bytedance.sdk.component.ldr.p261bg.p274zx.InterfaceC7726bX;
import com.bytedance.sdk.component.ldr.p261bg.p274zx.InterfaceC7728eqN;
import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.ldr.bg.ldr.bX */
/* loaded from: classes3.dex */
public class C7716bX implements InterfaceC7714IL {

    /* renamed from: IL */
    private final InterfaceC7723zx f16876IL;

    /* renamed from: bg */
    private final Context f16877bg;

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.bytedance.sdk.component.ldr.bg.ldr.bX$bg */
    /* loaded from: classes3.dex */
    public class C7719bg extends AbstractRunnableC7729zx {

        /* renamed from: IL */
        private final C7721eqN f16884IL;

        /* renamed from: bX */
        private final String f16885bX;
        private final Map<String, String> eqN;

        /* renamed from: bX */
        private String m87960bX(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("{TS}") || str.contains("__TS__")) {
                    long currentTimeMillis = System.currentTimeMillis();
                    str = str.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
                }
                if ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.f16885bX)) {
                    return str.replace("{UID}", this.f16885bX).replace("__UID__", this.f16885bX);
                }
                return str;
            }
            return str;
        }

        /* renamed from: IL */
        String m87961IL(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    return str.replace("[ss_random]", String.valueOf(C7716bX.m87970IL().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
                } catch (Exception unused) {
                    return str;
                }
            }
            return str;
        }

        /* renamed from: bg */
        boolean m87959bg(String str) {
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("http://") || str.startsWith(DtbConstants.HTTPS)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC7728eqN interfaceC7728eqN;
            InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
            if (m88153vb == null || C7659Kg.m88154iR().ldr() == null || !m88153vb.mo83362bX() || !m87959bg(this.f16884IL.m87955IL())) {
                return;
            }
            if (this.f16884IL.eqN() >= m88153vb.mo83361bX(this.f16884IL.ldr())) {
                C7716bX.this.f16876IL.mo87937bX(this.f16884IL);
                return;
            }
            try {
                m88153vb.mo83365Ta();
                if (this.f16884IL.m87951VB()) {
                    C7716bX.this.f16876IL.mo87935bg(this.f16884IL);
                }
                if (!m88153vb.mo83359bg(C7716bX.this.m87968bg())) {
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                String m87955IL = this.f16884IL.m87955IL();
                if (m88153vb.ldr() == 0) {
                    m87955IL = m87960bX(this.f16884IL.m87955IL());
                    if (this.f16884IL.m87949bX()) {
                        m87955IL = m87961IL(m87955IL);
                    }
                }
                InterfaceC7726bX mo83354eo = m88153vb.mo83354eo();
                if (mo83354eo == null) {
                    return;
                }
                mo83354eo.mo83292bg("User-Agent", m88153vb.mo83363WR());
                mo83354eo.mo83292bg("csj_client_source_from", "1");
                if (this.eqN != null) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, String> entry : this.eqN.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                    mo83354eo.mo83292bg("csj_extra_info", jSONObject.toString());
                }
                mo83354eo.mo83293bg(m87955IL);
                try {
                    interfaceC7728eqN = mo83354eo.mo83294bg();
                    try {
                        m88153vb.mo83356bg(interfaceC7728eqN.mo83349bg());
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    interfaceC7728eqN = null;
                }
                C7721eqN c7721eqN = this.f16884IL;
                c7721eqN.m87946bg(c7721eqN.eqN() + 1);
                if (interfaceC7728eqN != null && interfaceC7728eqN.mo83349bg()) {
                    C7716bX.this.f16876IL.mo87937bX(this.f16884IL);
                    this.f16884IL.m87955IL();
                    m88153vb.mo83355bg(true, 200, System.currentTimeMillis() - currentTimeMillis, this.f16884IL);
                    return;
                }
                if (interfaceC7728eqN != null) {
                    this.f16884IL.m87954IL(interfaceC7728eqN.mo83351IL());
                    this.f16884IL.m87948bX(interfaceC7728eqN.mo83350bX());
                }
                if (interfaceC7728eqN != null && interfaceC7728eqN.mo83351IL() == 8848) {
                    interfaceC7728eqN.mo83350bX();
                    C7716bX.this.f16876IL.mo87937bX(this.f16884IL);
                } else {
                    this.f16884IL.m87955IL();
                    if (this.f16884IL.eqN() >= m88153vb.mo83361bX(this.f16884IL.ldr())) {
                        C7716bX.this.f16876IL.mo87937bX(this.f16884IL);
                        this.f16884IL.m87955IL();
                    } else {
                        C7716bX.this.f16876IL.mo87938IL(this.f16884IL);
                    }
                }
                m88153vb.mo83355bg(false, this.f16884IL.m87952Kg(), System.currentTimeMillis() - currentTimeMillis, this.f16884IL);
            } catch (Throwable unused3) {
            }
        }

        private C7719bg(C7721eqN c7721eqN, String str, Map<String, String> map) {
            super("AdsStats");
            this.f16884IL = c7721eqN;
            this.f16885bX = str;
            this.eqN = map;
        }
    }

    public C7716bX(Context context, InterfaceC7723zx interfaceC7723zx) {
        this.f16877bg = context;
        this.f16876IL = interfaceC7723zx;
    }

    /* renamed from: IL */
    static /* synthetic */ Random m87970IL() {
        return m87969bX();
    }

    /* renamed from: bX */
    private static Random m87969bX() {
        SecureRandom instanceStrong;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                instanceStrong = SecureRandom.getInstanceStrong();
                return instanceStrong;
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    /* renamed from: bg */
    public Context m87968bg() {
        Context context = this.f16877bg;
        return context == null ? C7659Kg.m88154iR().ldr() : context;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.ldr.InterfaceC7714IL
    /* renamed from: bg */
    public void mo87964bg(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
        if (m88153vb == null || C7659Kg.m88154iR().ldr() == null || m88153vb.eqN() == null || !m88153vb.mo83362bX() || list == null || list.size() == 0) {
            return;
        }
        for (String str3 : list) {
            m88153vb.eqN().execute(new C7719bg(new C7721eqN(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), str3, z, i, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.ldr.InterfaceC7714IL
    /* renamed from: bg */
    public Runnable mo87965bg(final C7721eqN c7721eqN, final String str, final Map<String, String> map) {
        if (c7721eqN == null || TextUtils.isEmpty(c7721eqN.m87947bg())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.ldr.bg.ldr.bX.1
            @Override // java.lang.Runnable
            public void run() {
                if (C7716bX.this.f16876IL.mo87934bg(c7721eqN.m87947bg()) != null) {
                    new C7719bg(c7721eqN, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.ldr.InterfaceC7714IL
    /* renamed from: bg */
    public void mo87963bg(final String str, final boolean z) {
        InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
        if (m88153vb == null || C7659Kg.m88154iR().ldr() == null || !m88153vb.mo83362bX()) {
            return;
        }
        AbstractRunnableC7729zx abstractRunnableC7729zx = new AbstractRunnableC7729zx("trackFailedUrls") { // from class: com.bytedance.sdk.component.ldr.bg.ldr.bX.2
            @Override // java.lang.Runnable
            public void run() {
                C7716bX.this.m87962bg(C7716bX.this.f16876IL.mo87936bg(), str, z);
            }
        };
        abstractRunnableC7729zx.m87930bg(1);
        if (m88153vb.eqN() != null) {
            m88153vb.eqN().execute(abstractRunnableC7729zx);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public void m87962bg(List<C7721eqN> list, String str, boolean z) {
        if (list == null || list.size() == 0) {
            return;
        }
        InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
        for (C7721eqN c7721eqN : list) {
            if (m88153vb != null && m88153vb.eqN() != null) {
                c7721eqN.m87943bg(z);
                m88153vb.eqN().execute(new C7719bg(c7721eqN, str, null));
            }
        }
    }
}
