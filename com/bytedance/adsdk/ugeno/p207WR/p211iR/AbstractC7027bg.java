package com.bytedance.adsdk.ugeno.p207WR.p211iR;

import android.content.Context;
import com.bytedance.adsdk.ugeno.p205IL.C6988bg;
import com.bytedance.adsdk.ugeno.p207WR.p208IL.C7009bg;

/* renamed from: com.bytedance.adsdk.ugeno.WR.iR.bg */
/* loaded from: classes3.dex */
public abstract class AbstractC7027bg extends C6988bg<C7009bg> {
    public AbstractC7027bg(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.p205IL.C6988bg, com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX
    /* renamed from: IL */
    public void mo84928IL() {
        super.mo84928IL();
    }

    @Override // com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX
    /* renamed from: bg */
    public void mo84929bg(String str, String str2) {
        super.mo84929bg(str, str2);
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -411339735:
                if (str.equals("onVideoProgress")) {
                    c = 0;
                    break;
                }
                break;
            case 1139576207:
                if (str.equals("onVideoFinish")) {
                    c = 1;
                    break;
                }
                break;
            case 1302043440:
                if (str.equals("onVideoPlay")) {
                    c = 2;
                    break;
                }
                break;
            case 1479592233:
                if (str.equals("onVideoResume")) {
                    c = 3;
                    break;
                }
                break;
            case 1708332410:
                if (str.equals("onVideoPause")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                m90385IL(str, str2);
                return;
            default:
                return;
        }
    }
}
