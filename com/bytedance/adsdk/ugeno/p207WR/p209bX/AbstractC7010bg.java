package com.bytedance.adsdk.ugeno.p207WR.p209bX;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.p207WR.eqN.C7018bX;
import com.bytedance.adsdk.ugeno.p207WR.eqN.C7025bg;
import com.bytedance.adsdk.ugeno.p222iR.C7118bg;

/* renamed from: com.bytedance.adsdk.ugeno.WR.bX.bg */
/* loaded from: classes3.dex */
public abstract class AbstractC7010bg extends C7018bX {
    private int gCm;

    public AbstractC7010bg(Context context) {
        super(context);
        this.gCm = ViewCompat.MEASURED_STATE_MASK;
    }

    /* renamed from: WR */
    private String m90284WR(String str) {
        String mo84932iR = mo84932iR(str);
        if (TextUtils.isEmpty(mo84932iR)) {
            return "";
        }
        return "local://".concat(String.valueOf(mo84932iR));
    }

    @Override // com.bytedance.adsdk.ugeno.p207WR.eqN.C7018bX, com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX
    /* renamed from: IL */
    public void mo84928IL() {
        ((C7018bX) this).f15030bg = m90284WR(((C7018bX) this).f15030bg);
        super.mo84928IL();
        ((C7025bg) this.ldr).setColorFilter(this.gCm);
        ((C7025bg) this.ldr).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    @Override // com.bytedance.adsdk.ugeno.p207WR.eqN.C7018bX, com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX
    /* renamed from: bg */
    public void mo84929bg(String str, String str2) {
        super.mo84929bg(str, str2);
        str.hashCode();
        if (str.equals("textColor")) {
            this.gCm = C7118bg.m89995bg(str2);
        }
    }

    /* renamed from: iR */
    public abstract String mo84932iR(String str);
}
