package com.bytedance.sdk.component.p238WR;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import com.bytedance.sdk.component.p238WR.p240bg.C7267bg;
import com.bytedance.sdk.component.utils.C7737Ja;
import com.bytedance.sdk.component.utils.C7755iR;
import com.bytedance.sdk.component.utils.JAA;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.WR.bg */
/* loaded from: classes3.dex */
public class View$OnTouchListenerC7263bg implements View.OnTouchListener, JAA.InterfaceC7736bg {

    /* renamed from: Fy */
    private View.OnTouchListener f15679Fy;

    /* renamed from: IL */
    private final int f15680IL;

    /* renamed from: Kg */
    private volatile float f15681Kg;

    /* renamed from: LZ */
    private ViewConfiguration f15682LZ;

    /* renamed from: PX */
    private long f15684PX;

    /* renamed from: Ta */
    private int f15685Ta;

    /* renamed from: VB */
    private long f15686VB;
    private float VzQ;

    /* renamed from: bX */
    private final int f15688bX;
    private final List<Integer> eqN;

    /* renamed from: iR */
    private volatile float f15691iR;
    private final Context ldr;
    private String tuV;

    /* renamed from: vb */
    private boolean f15693vb;
    private float xxp;

    /* renamed from: zx */
    private final int f15694zx;

    /* renamed from: WR */
    private float f15687WR = -1.0f;

    /* renamed from: eo */
    private float f15690eo = -1.0f;

    /* renamed from: Lq */
    private final Handler f15683Lq = new JAA(C7755iR.m87831bg().getLooper(), this);

    /* renamed from: bg */
    InterfaceC7265bg f15689bg = new InterfaceC7265bg() { // from class: com.bytedance.sdk.component.WR.bg.1
        @Override // com.bytedance.sdk.component.p238WR.View$OnTouchListenerC7263bg.InterfaceC7265bg
        /* renamed from: bg */
        public void mo89413bg() {
            if (View$OnTouchListenerC7263bg.this.f15687WR == -1.0f && View$OnTouchListenerC7263bg.this.f15690eo == -1.0f && View$OnTouchListenerC7263bg.this.f15684PX == -1) {
                float unused = View$OnTouchListenerC7263bg.this.f15687WR;
                float unused2 = View$OnTouchListenerC7263bg.this.f15690eo;
                View$OnTouchListenerC7263bg view$OnTouchListenerC7263bg = View$OnTouchListenerC7263bg.this;
                view$OnTouchListenerC7263bg.f15687WR = view$OnTouchListenerC7263bg.f15691iR;
                View$OnTouchListenerC7263bg view$OnTouchListenerC7263bg2 = View$OnTouchListenerC7263bg.this;
                view$OnTouchListenerC7263bg2.f15690eo = view$OnTouchListenerC7263bg2.f15681Kg;
                View$OnTouchListenerC7263bg view$OnTouchListenerC7263bg3 = View$OnTouchListenerC7263bg.this;
                view$OnTouchListenerC7263bg3.f15684PX = view$OnTouchListenerC7263bg3.f15686VB;
                View$OnTouchListenerC7263bg.this.f15693vb = true;
            }
            float unused3 = View$OnTouchListenerC7263bg.this.f15687WR;
            float unused4 = View$OnTouchListenerC7263bg.this.f15690eo;
        }

        @Override // com.bytedance.sdk.component.p238WR.View$OnTouchListenerC7263bg.InterfaceC7265bg
        /* renamed from: bg */
        public void mo89412bg(int i) {
            View$OnTouchListenerC7263bg.this.f15685Ta = i;
            View$OnTouchListenerC7263bg.this.m89432IL();
        }
    };

    /* renamed from: tC */
    private int f15692tC = -1;
    private final List<Integer> yDt = new ArrayList();

    /* renamed from: com.bytedance.sdk.component.WR.bg$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC7265bg {
        /* renamed from: bg */
        void mo89413bg();

        /* renamed from: bg */
        void mo89412bg(int i);
    }

    public View$OnTouchListenerC7263bg(Context context, int i, int i2, List<Integer> list, int i3) {
        this.ldr = context;
        if (i == -1) {
            this.f15680IL = C7737Ja.m87903bg(context);
        } else {
            this.f15680IL = C7737Ja.m87902bg(context, i);
        }
        this.f15688bX = C7737Ja.m87902bg(context, i2);
        this.eqN = list;
        this.f15694zx = i3;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        this.f15686VB = SystemClock.elapsedRealtime();
        this.f15691iR = x;
        this.f15681Kg = y;
        if (action != 0) {
            if (action == 1 && m89427bg(x, y)) {
                int m89426bg = m89426bg(this.f15691iR, this.f15681Kg, this.f15686VB);
                boolean z = !this.yDt.contains(Integer.valueOf(this.f15685Ta));
                m89424bg(view, motionEvent, m89426bg, z);
                if (z) {
                    this.yDt.add(Integer.valueOf(this.f15685Ta));
                }
                if (m89426bg == 0) {
                    motionEvent.setAction(3);
                }
            }
        } else {
            this.xxp = x;
            this.VzQ = y;
        }
        View.OnTouchListener onTouchListener = this.f15679Fy;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public void m89432IL() {
        this.f15687WR = -1.0f;
        this.f15690eo = -1.0f;
        this.f15684PX = -1L;
    }

    /* renamed from: bg */
    public void m89425bg(View.OnTouchListener onTouchListener) {
        this.f15679Fy = onTouchListener;
    }

    /* renamed from: bg */
    public InterfaceC7265bg m89428bg() {
        return this.f15689bg;
    }

    /* renamed from: bg */
    private void m89424bg(View view, MotionEvent motionEvent, int i, boolean z) {
        String url;
        JSONObject jSONObject = new JSONObject();
        WebView webView = view instanceof WebView ? (WebView) view : null;
        if (webView != null) {
            try {
                url = webView.getUrl();
            } catch (Throwable unused) {
            }
        } else {
            url = "";
        }
        jSONObject.put("arbi_current_url", url);
        jSONObject.put("click_x", motionEvent.getX());
        jSONObject.put("click_y", motionEvent.getY());
        int i2 = 1;
        jSONObject.put("is_interceptor", i == 0 ? 1 : 0);
        if (!z) {
            i2 = 0;
        }
        jSONObject.put("is_first_click", i2);
        jSONObject.put("click_timestamp", System.currentTimeMillis());
        jSONObject.put("arbi_interceptor_type", i);
        jSONObject.put("current_url_index", this.f15685Ta);
        Message obtain = Message.obtain();
        obtain.what = 100;
        obtain.obj = jSONObject;
        this.f15683Lq.sendMessageDelayed(obtain, 200L);
    }

    /* renamed from: bg */
    private boolean m89427bg(float f, float f2) {
        if (this.f15682LZ == null) {
            this.f15682LZ = ViewConfiguration.get(this.ldr);
        }
        if (this.f15692tC == -1) {
            this.f15692tC = this.f15682LZ.getScaledTouchSlop();
        }
        return Math.abs(f - this.xxp) <= ((float) this.f15692tC) && Math.abs(f2 - this.VzQ) <= ((float) this.f15692tC);
    }

    /* renamed from: bg */
    public void m89418bg(String str) {
        this.tuV = str;
    }

    /* renamed from: bg */
    private int m89426bg(float f, float f2, long j) {
        if (this.f15687WR == -1.0f && this.f15690eo == -1.0f && this.f15684PX == -1) {
            return 1;
        }
        if (this.eqN.contains(Integer.valueOf(this.f15685Ta))) {
            if (j - this.f15684PX > this.f15694zx) {
                m89432IL();
                return 3;
            }
            float abs = Math.abs(f - this.f15687WR);
            float abs2 = Math.abs(f2 - this.f15690eo);
            if (abs > this.f15680IL / 2.0f || abs2 > this.f15688bX / 2.0f) {
                m89432IL();
                return 4;
            }
            return 0;
        }
        return 2;
    }

    @Override // com.bytedance.sdk.component.utils.JAA.InterfaceC7736bg
    /* renamed from: bg */
    public void mo83648bg(Message message) {
        int i = message.what;
        Object obj = message.obj;
        JSONObject jSONObject = new JSONObject();
        if (i == 100) {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                try {
                    jSONObject.put("is_trigger_jump", this.f15693vb ? 1 : 0);
                    this.f15693vb = false;
                } catch (Throwable unused) {
                }
            }
            if (C7267bg.m89414bg().m89415IL() != null) {
                C7267bg.m89414bg().m89415IL().mo85777bg(this.tuV, "arbitrage_click_event", jSONObject);
            }
        }
    }
}
