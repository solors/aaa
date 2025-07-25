package com.bytedance.sdk.openadsdk.xxp.p362bg;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.eqN.C7492bg;
import com.bytedance.sdk.component.p275zx.InterfaceC7776Kg;
import com.bytedance.sdk.component.p275zx.InterfaceC7781VB;
import com.bytedance.sdk.component.p275zx.InterfaceC7851xxp;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.p296WR.C7943IL;
import com.bytedance.sdk.openadsdk.p296WR.C7949eqN;
import com.bytedance.sdk.openadsdk.utils.ZQc;
import com.bytedance.sdk.openadsdk.xxp.C9591bg;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.xxp.bg.bg */
/* loaded from: classes3.dex */
public class C9594bg {

    /* renamed from: com.bytedance.sdk.openadsdk.xxp.bg.bg$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC9597bg {
        /* renamed from: bg */
        void mo82305bg(int i, String str, Throwable th);

        /* renamed from: bg */
        void mo82304bg(String str, C9592IL c9592il);
    }

    /* renamed from: bg */
    public void m82309bg(C9591bg c9591bg, final InterfaceC9597bg interfaceC9597bg, int i, int i2, ImageView.ScaleType scaleType, String str, final int i3, AbstractC8967tuV abstractC8967tuV) {
        C7949eqN.m87364bg(c9591bg.f21392bg).mo87567bg(c9591bg.f21391IL).mo87575bg(i).mo87578IL(i2).mo87565zx(ZQc.eqN(C8838VzQ.m84740bg())).eqN(ZQc.m82538bX(C8838VzQ.m84740bg())).mo87577IL(str).mo87574bg(Bitmap.Config.RGB_565).mo87573bg(scaleType).mo87566bg(!TextUtils.isEmpty(str)).mo87571bg(new InterfaceC7776Kg() { // from class: com.bytedance.sdk.openadsdk.xxp.bg.bg.2
            @Override // com.bytedance.sdk.component.p275zx.InterfaceC7776Kg
            /* renamed from: bg */
            public Bitmap mo82306bg(Bitmap bitmap) {
                if (i3 <= 0) {
                    return bitmap;
                }
                return C7492bg.m88670bg(C8838VzQ.m84740bg(), bitmap, i3);
            }
        }).mo87569bg(new C7943IL(abstractC8967tuV, c9591bg.f21392bg, new InterfaceC7851xxp() { // from class: com.bytedance.sdk.openadsdk.xxp.bg.bg.1
            @Override // com.bytedance.sdk.component.p275zx.InterfaceC7851xxp
            /* renamed from: bg */
            public void mo82307bg(InterfaceC7781VB interfaceC7781VB) {
                C9594bg.this.mo82310bg(interfaceC7781VB, interfaceC9597bg);
            }

            @Override // com.bytedance.sdk.component.p275zx.InterfaceC7851xxp
            /* renamed from: bg */
            public void mo82308bg(int i4, String str2, Throwable th) {
                C9594bg.this.m82312bg(i4, str2, th, interfaceC9597bg);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public void mo82310bg(InterfaceC7781VB interfaceC7781VB, InterfaceC9597bg interfaceC9597bg) {
        if (interfaceC9597bg != null) {
            Object mo87629IL = interfaceC7781VB.mo87629IL();
            int m82311bg = m82311bg(interfaceC7781VB);
            if (mo87629IL instanceof byte[]) {
                interfaceC9597bg.mo82304bg(interfaceC7781VB.mo87627bg(), new C9592IL((byte[]) mo87629IL, m82311bg));
                return;
            }
            if (mo87629IL instanceof Bitmap) {
                interfaceC9597bg.mo82304bg(interfaceC7781VB.mo87627bg(), new C9592IL((Bitmap) mo87629IL, interfaceC7781VB.mo87628bX() instanceof Bitmap ? (Bitmap) interfaceC7781VB.mo87628bX() : null, m82311bg));
            } else {
                interfaceC9597bg.mo82305bg(0, "not bitmap or gif result!", null);
            }
        }
    }

    /* renamed from: bg */
    private int m82311bg(InterfaceC7781VB interfaceC7781VB) {
        String str;
        Map<String, String> eqN = interfaceC7781VB.eqN();
        if (eqN == null || (str = eqN.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(str instanceof Integer)) {
            return 0;
        }
        return ((Integer) str).intValue();
    }

    /* renamed from: bg */
    protected void m82312bg(int i, String str, Throwable th, InterfaceC9597bg interfaceC9597bg) {
        if (interfaceC9597bg != null) {
            interfaceC9597bg.mo82305bg(i, str, th);
        }
    }
}
