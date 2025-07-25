package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.C7353IL;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7457Kg;
import com.bytedance.sdk.component.adexpress.dynamic.p252zx.C7476WR;
import com.bytedance.sdk.component.adexpress.eqN.C7489Kg;
import com.bytedance.sdk.component.adexpress.eqN.C7492bg;
import com.bytedance.sdk.component.adexpress.eqN.C7493eo;
import com.bytedance.sdk.component.adexpress.eqN.C7497ldr;
import com.bytedance.sdk.component.adexpress.ldr.C7508Ja;
import com.bytedance.sdk.component.adexpress.ldr.C7516Ta;
import com.bytedance.sdk.component.adexpress.ldr.C7532eo;
import com.bytedance.sdk.component.adexpress.p243bg.p246bg.C7324bg;
import com.bytedance.sdk.component.adexpress.p243bg.p246bg.InterfaceC7323bX;
import com.bytedance.sdk.component.p275zx.InterfaceC7776Kg;
import com.bytedance.sdk.component.p275zx.InterfaceC7778Lq;
import com.bytedance.sdk.component.p275zx.InterfaceC7781VB;
import com.bytedance.sdk.component.p275zx.InterfaceC7831eo;
import com.bytedance.sdk.component.p275zx.InterfaceC7851xxp;
import com.bytedance.sdk.component.utils.C7730Fy;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VB */
/* loaded from: classes3.dex */
public class C7411VB extends C7433ldr {

    /* renamed from: bg */
    private String f16035bg;

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VB$IL */
    /* loaded from: classes3.dex */
    private static class C7413IL implements InterfaceC7851xxp<Bitmap> {

        /* renamed from: IL */
        private Resources f16037IL;

        /* renamed from: bg */
        private WeakReference<View> f16038bg;

        public C7413IL(View view, Resources resources) {
            this.f16038bg = new WeakReference<>(view);
            this.f16037IL = resources;
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7851xxp
        /* renamed from: bg */
        public void mo82308bg(int i, String str, @Nullable Throwable th) {
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7851xxp
        /* renamed from: bg */
        public void mo82307bg(InterfaceC7781VB<Bitmap> interfaceC7781VB) {
            Bitmap mo87629IL;
            View view = this.f16038bg.get();
            if (view == null || (mo87629IL = interfaceC7781VB.mo87629IL()) == null || interfaceC7781VB.mo87628bX() == null) {
                return;
            }
            view.setBackground(new BitmapDrawable(this.f16037IL, mo87629IL));
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VB$bg */
    /* loaded from: classes3.dex */
    private static class C7414bg implements InterfaceC7776Kg {

        /* renamed from: bg */
        private final WeakReference<Context> f16039bg;

        public C7414bg(Context context) {
            this.f16039bg = new WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7776Kg
        /* renamed from: bg */
        public Bitmap mo82306bg(Bitmap bitmap) {
            Context context = this.f16039bg.get();
            if (context != null) {
                return C7492bg.m88670bg(context, bitmap, 25);
            }
            return null;
        }
    }

    public C7411VB(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull C7457Kg c7457Kg) {
        super(context, dynamicRootView, c7457Kg);
        if (!TextUtils.isEmpty(this.f16115PX.m88921Dt()) && c7457Kg.tuV()) {
            C7532eo c7532eo = new C7532eo(context);
            c7532eo.setAnimationsLoop(this.f16115PX.m88911Ny());
            c7532eo.setImageLottieTosPath(this.f16115PX.m88921Dt());
            c7532eo.setLottieAppNameMaxLength(this.f16115PX.m88886qp());
            c7532eo.setLottieAdTitleMaxLength(this.f16115PX.m88889kU());
            c7532eo.setLottieAdDescMaxLength(this.f16115PX.bOf());
            c7532eo.setData(c7457Kg.m89002Fy());
            this.f16114Lq = c7532eo;
        } else if (this.f16115PX.m88912Lq() > 0.0f) {
            C7508Ja c7508Ja = new C7508Ja(context);
            this.f16114Lq = c7508Ja;
            c7508Ja.setXRound((int) C7489Kg.m88675bg(context, this.f16115PX.m88912Lq()));
            ((C7508Ja) this.f16114Lq).setYRound((int) C7489Kg.m88675bg(context, this.f16115PX.m88912Lq()));
        } else if (!m89014Kg() && "arrowButton".equals(c7457Kg.m88977eo().m88764IL())) {
            C7353IL c7353il = new C7353IL(context);
            c7353il.setBrickNativeValue(this.f16115PX);
            this.f16114Lq = c7353il;
        } else if (C7493eo.m88669IL(this.f16115PX.m88905VB())) {
            this.f16114Lq = new C7516Ta(context);
        } else {
            this.f16114Lq = new ImageView(context);
        }
        this.f16035bg = getImageKey();
        this.f16114Lq.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(c7457Kg.m88977eo().m88764IL())) {
            if (this.f16115PX.m88918IL() <= 0 && this.f16115PX.m88898bg() <= 0) {
                int max = Math.max(this.f16122iR, this.f16112Kg);
                this.f16122iR = max;
                this.f16112Kg = Math.max(max, this.f16112Kg);
            } else {
                int min = Math.min(this.f16122iR, this.f16112Kg);
                this.f16122iR = min;
                this.f16112Kg = Math.min(min, this.f16112Kg);
                this.f16118WR = (int) (this.f16118WR + C7489Kg.m88675bg(context, this.f16115PX.m88918IL() + (this.f16115PX.m88898bg() / 2) + 0.5f));
            }
            this.f16115PX.m88897bg(this.f16122iR / 2);
        }
        addView(this.f16114Lq, new FrameLayout.LayoutParams(this.f16122iR, this.f16112Kg));
    }

    /* renamed from: bg */
    private boolean m89043bg() {
        String m88910PX = this.f16115PX.m88910PX();
        if (this.f16115PX.m88920Fy()) {
            return true;
        }
        if (TextUtils.isEmpty(m88910PX)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(m88910PX);
            return Math.abs((((float) this.f16122iR) / (((float) this.f16112Kg) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    private String getImageKey() {
        Map<String, String> m89336VB = this.yDt.getRenderRequest().m89336VB();
        if (m89336VB != null && m89336VB.size() > 0) {
            return m89336VB.get(this.f16115PX.m88905VB());
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C7433ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ayS
    /* renamed from: WR */
    public boolean mo89018WR() {
        int i;
        String str;
        super.mo89018WR();
        if (!TextUtils.isEmpty(this.f16115PX.m88921Dt())) {
            ((ImageView) this.f16114Lq).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int i2 = 0;
        if ("arrowButton".equals(this.f16116Ta.m88977eo().m88764IL())) {
            ((ImageView) this.f16114Lq).setImageResource(C7730Fy.eqN(this.f16117VB, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.f16114Lq).getDrawable() != null) {
                ((ImageView) this.f16114Lq).getDrawable().setAutoMirrored(true);
            }
            this.f16114Lq.setPadding(0, 0, 0, 0);
            ((ImageView) this.f16114Lq).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.f16114Lq.setBackgroundColor(this.f16115PX.DDQ());
        String m88761bX = this.f16116Ta.m88977eo().m88761bX();
        if ("user".equals(m88761bX)) {
            ((ImageView) this.f16114Lq).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.f16114Lq).setColorFilter(this.f16115PX.m88892iR());
            ((ImageView) this.f16114Lq).setImageDrawable(C7730Fy.m87919bX(getContext(), "tt_user"));
            int i3 = this.f16122iR;
            ((ImageView) this.f16114Lq).setPadding(i3 / 10, this.f16112Kg / 5, i3 / 10, 0);
        } else if (m88761bX != null && m88761bX.startsWith("@")) {
            try {
                ((ImageView) this.f16114Lq).setImageResource(Integer.parseInt(m88761bX.substring(1)));
            } catch (Exception unused) {
            }
        }
        InterfaceC7778Lq m89113zx = C7324bg.m89118bg().m89113zx();
        String m88905VB = this.f16115PX.m88905VB();
        if (!TextUtils.isEmpty(m88905VB) && !m88905VB.startsWith("http:") && !m88905VB.startsWith("https:")) {
            DynamicRootView dynamicRootView = this.yDt;
            if (dynamicRootView != null && dynamicRootView.getRenderRequest() != null) {
                str = this.yDt.getRenderRequest().kMt();
            } else {
                str = null;
            }
            m88905VB = C7476WR.m88721IL(m88905VB, str);
        }
        InterfaceC7323bX m89119bX = C7324bg.m89118bg().m89119bX();
        if (m89119bX != null) {
            i2 = m89119bX.mo85792Lq();
            i = m89119bX.mo85781vb();
        } else {
            i = 0;
        }
        InterfaceC7831eo mo87565zx = m89113zx.mo87369bg(m88905VB).mo87567bg(this.f16035bg).mo87575bg(this.f16122iR).mo87578IL(this.f16112Kg).eqN(i2).mo87565zx(i);
        String yDt = this.yDt.getRenderRequest().yDt();
        if (!TextUtils.isEmpty(yDt)) {
            mo87565zx.mo87577IL(yDt);
        }
        if (m89043bg()) {
            ((ImageView) this.f16114Lq).setScaleType(ImageView.ScaleType.FIT_CENTER);
            mo87565zx.mo87574bg(Bitmap.Config.ARGB_4444).mo87576bX(2).mo87571bg(new C7414bg(this.f16117VB)).mo87569bg(new C7413IL(this.f16114Lq, getResources()));
        } else {
            if (C7487eqN.m88685IL()) {
                mo87565zx.mo87572bg((ImageView) this.f16114Lq);
            }
            ((ImageView) this.f16114Lq).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.f16114Lq instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.f16114Lq).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        if (!C7487eqN.m88685IL()) {
            m89042bg(mo87565zx);
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C7433ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC7449zx, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.f16114Lq).getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            ((AnimatedImageDrawable) drawable).start();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C7433ldr, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC7449zx, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.f16114Lq).getDrawable();
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            ((AnimatedImageDrawable) drawable).stop();
        }
    }

    /* renamed from: bg */
    private void m89042bg(InterfaceC7831eo interfaceC7831eo) {
        interfaceC7831eo.mo87576bX(3).mo87569bg(new InterfaceC7851xxp() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.VB.1
            {
                C7411VB.this = this;
            }

            @Override // com.bytedance.sdk.component.p275zx.InterfaceC7851xxp
            /* renamed from: bg */
            public void mo82308bg(int i, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.p275zx.InterfaceC7851xxp
            /* renamed from: bg */
            public void mo82307bg(InterfaceC7781VB interfaceC7781VB) {
                Object mo87629IL = interfaceC7781VB.mo87629IL();
                if (mo87629IL instanceof byte[]) {
                    C7411VB c7411vb = C7411VB.this;
                    View view = c7411vb.f16114Lq;
                    if (view instanceof ImageView) {
                        C7497ldr.m88661IL((ImageView) view, (byte[]) mo87629IL, c7411vb.f16122iR, c7411vb.f16112Kg);
                    }
                }
            }
        });
    }
}
