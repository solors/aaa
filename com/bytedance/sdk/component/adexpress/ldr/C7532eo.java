package com.bytedance.sdk.component.adexpress.ldr;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.adsdk.p183IL.C6821eo;
import com.bytedance.adsdk.p183IL.C6839ldr;
import com.bytedance.adsdk.p183IL.InterfaceC6823eqN;
import com.bytedance.sdk.component.adexpress.p243bg.p246bg.C7324bg;
import com.bytedance.sdk.component.p275zx.InterfaceC7776Kg;
import com.bytedance.sdk.component.p275zx.InterfaceC7781VB;
import com.bytedance.sdk.component.p275zx.InterfaceC7831eo;
import com.bytedance.sdk.component.p275zx.InterfaceC7851xxp;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.eo */
/* loaded from: classes3.dex */
public class C7532eo extends C6839ldr {

    /* renamed from: IL */
    private String f16389IL;

    /* renamed from: bg */
    private Map<String, Bitmap> f16390bg;

    /* renamed from: com.bytedance.sdk.component.adexpress.ldr.eo$bg */
    /* loaded from: classes3.dex */
    private static class C7535bg implements InterfaceC7851xxp<Bitmap> {

        /* renamed from: IL */
        private final C6821eo f16395IL;

        /* renamed from: bX */
        private final String f16396bX;

        /* renamed from: bg */
        private final WeakReference<C7532eo> f16397bg;
        private final Map<String, Bitmap> eqN;

        public C7535bg(C7532eo c7532eo, C6821eo c6821eo, String str, Map<String, Bitmap> map) {
            this.f16397bg = new WeakReference<>(c7532eo);
            this.f16395IL = c6821eo;
            this.f16396bX = str;
            this.eqN = map;
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7851xxp
        /* renamed from: bg */
        public void mo82308bg(int i, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7851xxp
        /* renamed from: bg */
        public void mo82307bg(InterfaceC7781VB<Bitmap> interfaceC7781VB) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(interfaceC7781VB.mo87629IL(), this.f16395IL.m90767bg(), this.f16395IL.m90771IL(), false);
            this.eqN.put(this.f16396bX, createScaledBitmap);
            C7532eo c7532eo = this.f16397bg.get();
            if (c7532eo != null) {
                c7532eo.m90671bg(this.f16395IL.m90764iR(), createScaledBitmap);
            }
        }
    }

    public C7532eo(Context context) {
        super(context);
        this.f16390bg = new HashMap();
    }

    /* renamed from: Kg */
    public void m88603Kg() {
        if (TextUtils.isEmpty(this.f16389IL)) {
            return;
        }
        setProgress(0.0f);
        m90669bg(true);
        setAnimationFromUrl(this.f16389IL);
        setImageAssetDelegate(new InterfaceC6823eqN() { // from class: com.bytedance.sdk.component.adexpress.ldr.eo.1
            @Override // com.bytedance.adsdk.p183IL.InterfaceC6823eqN
            /* renamed from: bg */
            public Bitmap mo88601bg(final C6821eo c6821eo) {
                final String m90764iR = c6821eo.m90764iR();
                String m90769WR = c6821eo.m90769WR();
                String m90770Kg = c6821eo.m90770Kg();
                if (TextUtils.equals(m90764iR, "image_0") && TextUtils.equals(m90770Kg, "Lark20201123-180048_2.png")) {
                    m90770Kg = "hand.png";
                }
                Bitmap bitmap = (Bitmap) C7532eo.this.f16390bg.get(m90764iR);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(m90769WR) || !TextUtils.isEmpty(m90770Kg)) {
                    if (!TextUtils.isEmpty(m90770Kg) && TextUtils.isEmpty(m90769WR)) {
                        m90769WR = m90770Kg;
                    } else if (!TextUtils.isEmpty(m90770Kg) && !TextUtils.isEmpty(m90769WR)) {
                        m90769WR = m90769WR + m90770Kg;
                    } else {
                        m90769WR = "";
                    }
                }
                if (TextUtils.isEmpty(m90769WR)) {
                    return null;
                }
                InterfaceC7831eo mo87571bg = C7324bg.m89118bg().m89113zx().mo87369bg(m90769WR).mo87571bg(new InterfaceC7776Kg() { // from class: com.bytedance.sdk.component.adexpress.ldr.eo.1.1
                    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7776Kg
                    /* renamed from: bg */
                    public Bitmap mo82306bg(Bitmap bitmap2) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, c6821eo.m90767bg(), c6821eo.m90771IL(), false);
                        C7532eo.this.f16390bg.put(m90764iR, createScaledBitmap);
                        return createScaledBitmap;
                    }
                });
                C7532eo c7532eo = C7532eo.this;
                mo87571bg.mo87569bg(new C7535bg(c7532eo, c6821eo, m90764iR, c7532eo.f16390bg));
                return (Bitmap) C7532eo.this.f16390bg.get(m90764iR);
            }
        });
        m90687bg();
    }

    public void setImageLottieTosPath(String str) {
        this.f16389IL = str;
    }

    public void setAnimationsLoop(boolean z) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setLottieAdDescMaxLength(int i) {
    }

    public void setLottieAdTitleMaxLength(int i) {
    }

    public void setLottieAppNameMaxLength(int i) {
    }
}
