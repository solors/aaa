package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6493IL;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.p321Ta.p322IL.InterfaceC8691bg;
import com.bytedance.sdk.openadsdk.p290Ta.C7905Lq;
import com.bytedance.sdk.openadsdk.utils.C9514Ta;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.Fy */
/* loaded from: classes3.dex */
public class C9043Fy {

    /* renamed from: IL */
    private TextView f20156IL;

    /* renamed from: Kg */
    private ViewGroup f20157Kg;

    /* renamed from: bX */
    private Context f20158bX;

    /* renamed from: bg */
    private View f20159bg;
    private InterfaceC8691bg eqN;

    /* renamed from: iR */
    private C6493IL f20160iR;
    private boolean ldr = false;

    /* renamed from: zx */
    private InterfaceC9045IL f20161zx;

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.Fy$IL */
    /* loaded from: classes3.dex */
    public interface InterfaceC9045IL {
        /* renamed from: VB */
        void mo83701VB();

        /* renamed from: eo */
        boolean mo83700eo();
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.Fy$bg */
    /* loaded from: classes3.dex */
    public enum EnumC9046bg {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bX */
    public void m83712bX() {
        if (this.f20158bX == null) {
            return;
        }
        eqN();
    }

    private void eqN() {
        View view = this.f20159bg;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: IL */
    private void m83714IL() {
        this.f20160iR = null;
    }

    /* renamed from: bg */
    public void m83707bg(Context context, ViewGroup viewGroup) {
        if (context == null || !(viewGroup instanceof ViewGroup)) {
            return;
        }
        this.f20157Kg = viewGroup;
        this.f20158bX = C8838VzQ.m84740bg().getApplicationContext();
    }

    /* renamed from: bg */
    private void m83708bg(Context context, View view, boolean z) {
        ViewGroup.LayoutParams m83706bg;
        if (context == null || view == null || this.f20159bg != null || (m83706bg = m83706bg(this.f20157Kg)) == null) {
            return;
        }
        C7905Lq c7905Lq = new C7905Lq(context);
        this.f20159bg = c7905Lq;
        c7905Lq.setLayoutParams(m83706bg);
        this.f20157Kg.addView(this.f20159bg);
        this.f20156IL = (TextView) this.f20159bg.findViewById(C9514Ta.f21180IE);
        View findViewById = this.f20159bg.findViewById(C9514Ta.f21201Vm);
        if (z) {
            findViewById.setClickable(true);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.Fy.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    C9043Fy.this.m83712bX();
                    if (C9043Fy.this.eqN != null) {
                        C9043Fy.this.eqN.mo85091bg(EnumC9046bg.START_VIDEO, (String) null);
                    }
                }
            });
            return;
        }
        findViewById.setOnClickListener(null);
        findViewById.setClickable(false);
    }

    /* renamed from: bg */
    private ViewGroup.LayoutParams m83706bg(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    /* renamed from: bg */
    public void m83704bg(InterfaceC8691bg interfaceC8691bg, InterfaceC9045IL interfaceC9045IL) {
        this.f20161zx = interfaceC9045IL;
        this.eqN = interfaceC8691bg;
    }

    /* renamed from: bg */
    public boolean m83709bg(int i, C6493IL c6493il, boolean z) {
        Context context = this.f20158bX;
        if (context == null || c6493il == null) {
            return true;
        }
        m83708bg(context, this.f20157Kg, z);
        this.f20160iR = c6493il;
        if (i == 1 || i == 2) {
            return m83710bg(i);
        }
        return true;
    }

    /* renamed from: bg */
    private boolean m83710bg(int i) {
        InterfaceC9045IL interfaceC9045IL;
        if (m83711bg() || this.ldr) {
            return true;
        }
        if (this.eqN != null && (interfaceC9045IL = this.f20161zx) != null) {
            if (interfaceC9045IL.mo83700eo()) {
                this.eqN.mo85082zx(null, null);
            }
            this.eqN.mo85091bg(EnumC9046bg.PAUSE_VIDEO, (String) null);
        }
        m83705bg(this.f20160iR, true);
        return false;
    }

    /* renamed from: bg */
    public void m83702bg(boolean z) {
        if (z) {
            m83714IL();
        }
        eqN();
    }

    /* renamed from: bg */
    public boolean m83711bg() {
        View view = this.f20159bg;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: bg */
    private void m83705bg(C6493IL c6493il, boolean z) {
        View view;
        String str;
        View view2;
        if (c6493il == null || (view = this.f20159bg) == null || this.f20158bX == null || view.getVisibility() == 0) {
            return;
        }
        InterfaceC9045IL interfaceC9045IL = this.f20161zx;
        if (interfaceC9045IL != null) {
            interfaceC9045IL.mo83701VB();
        }
        double ceil = Math.ceil((c6493il.m91726zx() * 1.0d) / 1048576.0d);
        if (z) {
            str = String.format(C7730Fy.m87917bg(this.f20158bX, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(ceil).floatValue()));
        } else {
            str = C7730Fy.m87917bg(this.f20158bX, "tt_video_without_wifi_tips") + C7730Fy.m87917bg(this.f20158bX, "tt_video_bytesize");
        }
        ZQc.m82524bg(this.f20159bg, 0);
        ZQc.m82515bg(this.f20156IL, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!ZQc.eqN(this.f20159bg) || (view2 = this.f20159bg) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
