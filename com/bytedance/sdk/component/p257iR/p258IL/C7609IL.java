package com.bytedance.sdk.component.p257iR.p258IL;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7194VB;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7220xxp;
import com.bytedance.sdk.component.p228IL.p229bg.C7199bg;
import com.bytedance.sdk.component.p228IL.p229bg.C7216iR;
import com.bytedance.sdk.component.p228IL.p229bg.C7219ldr;
import com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7177IL;
import com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7198bX;
import com.bytedance.sdk.component.p257iR.C7608IL;
import com.bytedance.sdk.component.p257iR.p260bg.AbstractC7632bg;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.sdk.component.iR.IL.IL */
/* loaded from: classes3.dex */
public class C7609IL extends AbstractC7611bX {

    /* renamed from: PX */
    private Map<String, String> f16589PX;

    /* renamed from: VB */
    private boolean f16590VB;

    /* renamed from: eo */
    private C7199bg f16591eo;

    /* renamed from: bg */
    public static final C7199bg f16588bg = new C7199bg.C7200bg().m89631bg().m89632IL();

    /* renamed from: IL */
    public static final C7199bg f16587IL = new C7199bg.C7200bg().m89632IL();

    public C7609IL(AbstractC7194VB abstractC7194VB) {
        super(abstractC7194VB);
        this.f16591eo = f16588bg;
        this.f16590VB = false;
        this.f16589PX = new HashMap();
    }

    /* renamed from: bg */
    public void m88404bg(String str, String str2) {
        if (str == null) {
            return;
        }
        this.f16589PX.put(str, str2);
    }

    /* renamed from: bg */
    public void m88403bg(boolean z) {
        this.f16590VB = z;
    }

    /* renamed from: bg */
    public void m88405bg(final AbstractC7632bg abstractC7632bg) {
        try {
            AbstractC7191Ta.C7192bg c7192bg = new AbstractC7191Ta.C7192bg();
            if (this.f16590VB) {
                c7192bg.m89658IL(this.f16594Kg);
            } else {
                C7216iR.C7217bg c7217bg = new C7216iR.C7217bg();
                Uri parse = Uri.parse(this.f16594Kg);
                c7217bg.m89575bg(parse.getScheme());
                c7217bg.m89582IL(parse.getHost());
                String encodedPath = parse.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                        encodedPath = encodedPath.substring(1);
                    }
                    c7217bg.m89579bX(encodedPath);
                }
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str : queryParameterNames) {
                        this.f16589PX.put(str, parse.getQueryParameter(str));
                    }
                }
                for (Map.Entry<String, String> entry : this.f16589PX.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String encode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        c7217bg.m89572bg(encode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                c7192bg.m89653bg(c7217bg.m89583IL());
            }
            m88397bg(c7192bg);
            c7192bg.m89654bg(this.f16591eo);
            c7192bg.m89651bg((Object) m88400bX());
            if (!TextUtils.isEmpty(this.f16598zx)) {
                c7192bg.m89650bg(this.f16598zx);
            }
            int i = this.ldr;
            if (i > 0) {
                c7192bg.m89655bg(i);
            }
            this.f16596bX.mo89615bg(c7192bg.m89656bg().m89659IL()).mo89624bg(new InterfaceC7198bX() { // from class: com.bytedance.sdk.component.iR.IL.IL.1
                {
                    C7609IL.this = this;
                }

                @Override // com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7198bX
                /* renamed from: bg */
                public void mo83141bg(InterfaceC7177IL interfaceC7177IL, IOException iOException) {
                    AbstractC7632bg abstractC7632bg2 = abstractC7632bg;
                    if (abstractC7632bg2 != null) {
                        abstractC7632bg2.mo83461bg(C7609IL.this, iOException);
                    }
                }

                @Override // com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7198bX
                /* renamed from: bg */
                public void mo83142bg(InterfaceC7177IL interfaceC7177IL, AbstractC7189Lq abstractC7189Lq) throws IOException {
                    if (abstractC7632bg != null) {
                        HashMap hashMap = new HashMap();
                        if (abstractC7189Lq != null) {
                            C7219ldr mo89606iR = abstractC7189Lq.mo89606iR();
                            if (mo89606iR != null) {
                                for (int i2 = 0; i2 < mo89606iR.m89567bg(); i2++) {
                                    hashMap.put(mo89606iR.m89566bg(i2), mo89606iR.m89568IL(i2));
                                }
                            }
                            AbstractC7220xxp ldr = abstractC7189Lq.ldr();
                            abstractC7632bg.mo83462bg(C7609IL.this, new C7608IL(abstractC7189Lq.eqN(), abstractC7189Lq.mo89611bX(), abstractC7189Lq.mo89605zx(), hashMap, ldr == null ? "" : ldr.mo89565IL(), abstractC7189Lq.mo89614IL(), abstractC7189Lq.mo89610bg()));
                        }
                    }
                }
            });
        } catch (Throwable th) {
            if (abstractC7632bg != null) {
                abstractC7632bg.mo83461bg(this, new IOException(th.getMessage()));
            }
        }
    }

    /* renamed from: bg */
    public C7608IL m88406bg() {
        try {
            AbstractC7191Ta.C7192bg c7192bg = new AbstractC7191Ta.C7192bg();
            String str = "";
            if (this.f16590VB) {
                c7192bg.m89658IL(this.f16594Kg);
            } else {
                C7216iR.C7217bg c7217bg = new C7216iR.C7217bg();
                Uri parse = Uri.parse(this.f16594Kg);
                c7217bg.m89575bg(parse.getScheme());
                c7217bg.m89582IL(parse.getHost());
                String encodedPath = parse.getEncodedPath();
                if (!TextUtils.isEmpty(encodedPath)) {
                    if (encodedPath.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                        encodedPath = encodedPath.substring(1);
                    }
                    c7217bg.m89579bX(encodedPath);
                }
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames != null && queryParameterNames.size() > 0) {
                    for (String str2 : queryParameterNames) {
                        this.f16589PX.put(str2, parse.getQueryParameter(str2));
                    }
                }
                for (Map.Entry<String, String> entry : this.f16589PX.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        String encode = URLEncoder.encode(key, "UTF-8");
                        if (value == null) {
                            value = "";
                        }
                        c7217bg.m89572bg(encode, URLEncoder.encode(value, "UTF-8"));
                    }
                }
                c7192bg.m89653bg(c7217bg.m89583IL());
            }
            m88397bg(c7192bg);
            c7192bg.m89654bg(this.f16591eo);
            c7192bg.m89651bg((Object) m88400bX());
            AbstractC7189Lq mo89629IL = this.f16596bX.mo89615bg(c7192bg.m89656bg().m89659IL()).mo89629IL();
            if (mo89629IL != null) {
                HashMap hashMap = new HashMap();
                C7219ldr mo89606iR = mo89629IL.mo89606iR();
                if (mo89606iR != null) {
                    for (int i = 0; i < mo89606iR.m89567bg(); i++) {
                        hashMap.put(mo89606iR.m89566bg(i), mo89606iR.m89568IL(i));
                    }
                }
                AbstractC7220xxp ldr = mo89629IL.ldr();
                if (ldr != null) {
                    str = ldr.mo89565IL();
                }
                return new C7608IL(mo89629IL.eqN(), mo89629IL.mo89611bX(), mo89629IL.mo89605zx(), hashMap, str, mo89629IL.mo89614IL(), mo89629IL.mo89610bg());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
