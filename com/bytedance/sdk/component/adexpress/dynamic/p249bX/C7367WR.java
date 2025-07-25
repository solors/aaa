package com.bytedance.sdk.component.adexpress.dynamic.p249bX;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.C7487eqN;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.AbstractC7449zx;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7461eo;
import com.bytedance.sdk.component.adexpress.dynamic.eqN.C7464iR;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.p250bg.View$OnTouchListenerC7373IL;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.p250bg.View$OnTouchListenerC7374Kg;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.p250bg.View$OnTouchListenerC7375bX;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.p250bg.View$OnTouchListenerC7376bg;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.p250bg.View$OnTouchListenerC7378eqN;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.p250bg.View$OnTouchListenerC7379iR;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.p250bg.View$OnTouchListenerC7381ldr;
import com.bytedance.sdk.component.adexpress.dynamic.p249bX.p250bg.View$OnTouchListenerC7382zx;
import com.bytedance.sdk.component.adexpress.ldr.C7499Fy;
import com.bytedance.sdk.component.adexpress.ldr.C7517Uw;
import com.bytedance.sdk.component.adexpress.ldr.C7529bX;
import com.bytedance.sdk.component.adexpress.ldr.C7540ldr;
import com.bytedance.sdk.component.adexpress.ldr.C7550tuV;
import com.bytedance.sdk.component.adexpress.p241IL.C7282Ta;
import com.bytedance.sdk.component.utils.C7741PX;
import net.pubnative.lite.sdk.models.Protocol;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.bX.WR */
/* loaded from: classes3.dex */
public class C7367WR extends FrameLayout implements InterfaceC7360Kg {

    /* renamed from: IL */
    private AbstractC7449zx f15912IL;

    /* renamed from: Kg */
    private View.OnTouchListener f15913Kg;

    /* renamed from: PX */
    private C7282Ta f15914PX;

    /* renamed from: VB */
    private C7461eo f15915VB;

    /* renamed from: WR */
    private int f15916WR;

    /* renamed from: bX */
    private C7464iR f15917bX;

    /* renamed from: bg */
    private Context f15918bg;

    /* renamed from: eo */
    private boolean f15919eo;
    private View eqN;

    /* renamed from: iR */
    private C7550tuV f15920iR;
    private String ldr;

    /* renamed from: zx */
    private InterfaceC7385iR f15921zx;

    public C7367WR(Context context, AbstractC7449zx abstractC7449zx, C7464iR c7464iR) {
        super(context);
        this.f15918bg = context;
        this.f15912IL = abstractC7449zx;
        this.f15917bX = c7464iR;
        m89081iR();
    }

    /* renamed from: Kg */
    private boolean m89088Kg() {
        if (this.f15917bX.m88919GZ() || TextUtils.equals("9", this.ldr) || TextUtils.equals("16", this.ldr) || TextUtils.equals("17", this.ldr) || TextUtils.equals("18", this.ldr) || TextUtils.equals("20", this.ldr) || TextUtils.equals("29", this.ldr) || TextUtils.equals("10", this.ldr)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: WR */
    public void m89087WR() {
        if (this.f15913Kg != null) {
            setOnClickListener((View.OnClickListener) this.f15912IL.getDynamicClickListener());
            performClick();
            if (!this.f15917bX.eDa()) {
                setVisibility(8);
            }
        }
    }

    /* renamed from: iR */
    private void m89081iR() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.ldr = this.f15917bX.Dxa();
        this.f15916WR = this.f15917bX.Pae();
        this.f15919eo = this.f15917bX.m88919GZ();
        InterfaceC7385iR m89075bg = C7383eo.m89075bg(this.f15918bg, this.f15912IL, this.f15917bX, this.f15915VB, this.f15914PX);
        this.f15921zx = m89075bg;
        if (m89075bg != null) {
            this.eqN = m89075bg.mo89072bX();
            if (this.f15917bX.m88900bN()) {
                setBackgroundColor(Color.parseColor("#50000000"));
            }
            if (TextUtils.equals(this.ldr, "6")) {
                if (this.f15917bX.bCU() && !TextUtils.isEmpty(this.f15917bX.m88913Ld())) {
                    this.f15920iR = new C7550tuV(this.f15918bg, C7464iR.m88895bg(this.f15917bX.m88913Ld()));
                } else {
                    this.f15920iR = new C7550tuV(this.f15918bg, Color.parseColor("#99000000"));
                }
                FrameLayout frameLayout = new FrameLayout(this.f15918bg);
                frameLayout.addView(this.f15920iR, new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setClipChildren(true);
                addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bX.WR.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C7367WR.this.f15920iR.m88577IL();
                    }
                });
            }
            if (m89082bg(this.ldr) && C7487eqN.m88685IL()) {
                int parseColor = Color.parseColor("#99000000");
                if (this.f15917bX.bCU() && !TextUtils.isEmpty(this.f15917bX.m88913Ld())) {
                    try {
                        parseColor = C7464iR.m88895bg(this.f15917bX.m88913Ld());
                    } catch (Exception unused) {
                    }
                }
                View view = new View(this.f15918bg);
                view.setBackgroundColor(parseColor);
                addView(view, new FrameLayout.LayoutParams(-1, -1));
            }
            addView(this.f15921zx.mo89072bX());
            m89084bg(this.f15921zx.mo89072bX());
            setVisibility(0);
        }
    }

    /* renamed from: bX */
    public void m89086bX() {
        InterfaceC7385iR interfaceC7385iR = this.f15921zx;
        if (interfaceC7385iR != null) {
            interfaceC7385iR.mo89070bg();
        }
    }

    public void eqN() {
        InterfaceC7385iR interfaceC7385iR = this.f15921zx;
        if (interfaceC7385iR != null) {
            interfaceC7385iR.mo89071IL();
        }
    }

    public void ldr() {
        if (this.eqN != null && TextUtils.equals(this.ldr, "2")) {
            View view = this.eqN;
            if (view instanceof C7529bX) {
                ((C7529bX) view).eqN();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            InterfaceC7385iR interfaceC7385iR = this.f15921zx;
            if (interfaceC7385iR != null) {
                interfaceC7385iR.mo89071IL();
            }
        } catch (Exception e) {
            C7741PX.m87880IL(e.getMessage());
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f15913Kg instanceof View$OnTouchListenerC7375bX) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: zx */
    public void m89080zx() {
        if (this.eqN != null && TextUtils.equals(this.ldr, "2")) {
            View view = this.eqN;
            if (view instanceof C7529bX) {
                ((C7529bX) view).m88610bX();
            }
        }
    }

    /* renamed from: bg */
    private boolean m89082bg(String str) {
        return TextUtils.equals(str, "24") || TextUtils.equals(str, "23") || TextUtils.equals(str, "25") || TextUtils.equals(str, "22") || TextUtils.equals(str, "1");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7360Kg
    /* renamed from: IL */
    public void mo89090IL() {
        if (m89088Kg()) {
            setOnClickListener((View.OnClickListener) this.f15912IL.getDynamicClickListener());
            performClick();
            if (this.f15917bX.eDa()) {
                return;
            }
            setVisibility(8);
        }
    }

    public C7367WR(Context context, AbstractC7449zx abstractC7449zx, C7464iR c7464iR, C7461eo c7461eo, C7282Ta c7282Ta) {
        super(context);
        this.f15918bg = context;
        this.f15912IL = abstractC7449zx;
        this.f15917bX = c7464iR;
        this.f15915VB = c7461eo;
        this.f15914PX = c7282Ta;
        m89081iR();
    }

    /* renamed from: bg */
    private void m89084bg(ViewGroup viewGroup) {
        if (this.eqN == null) {
            return;
        }
        String str = this.ldr;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c = 0;
                    break;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    c = 1;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c = 2;
                    break;
                }
                break;
            case 53:
                if (str.equals("5")) {
                    c = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c = 4;
                    break;
                }
                break;
            case 55:
                if (str.equals("7")) {
                    c = 5;
                    break;
                }
                break;
            case 56:
                if (str.equals("8")) {
                    c = 6;
                    break;
                }
                break;
            case 57:
                if (str.equals("9")) {
                    c = 7;
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c = '\b';
                    break;
                }
                break;
            case 1568:
                if (str.equals(Protocol.VAST_4_1)) {
                    c = '\t';
                    break;
                }
                break;
            case 1569:
                if (str.equals(Protocol.VAST_4_1_WRAPPER)) {
                    c = '\n';
                    break;
                }
                break;
            case 1570:
                if (str.equals(Protocol.VAST_4_2)) {
                    c = 11;
                    break;
                }
                break;
            case 1571:
                if (str.equals(Protocol.VAST_4_2_WRAPPER)) {
                    c = '\f';
                    break;
                }
                break;
            case 1573:
                if (str.equals("16")) {
                    c = '\r';
                    break;
                }
                break;
            case 1574:
                if (str.equals("17")) {
                    c = 14;
                    break;
                }
                break;
            case 1575:
                if (str.equals("18")) {
                    c = 15;
                    break;
                }
                break;
            case 1598:
                if (str.equals("20")) {
                    c = 16;
                    break;
                }
                break;
            case 1600:
                if (str.equals("22")) {
                    c = 17;
                    break;
                }
                break;
            case 1601:
                if (str.equals("23")) {
                    c = 18;
                    break;
                }
                break;
            case 1602:
                if (str.equals("24")) {
                    c = 19;
                    break;
                }
                break;
            case 1603:
                if (str.equals("25")) {
                    c = 20;
                    break;
                }
                break;
            case 1607:
                if (str.equals("29")) {
                    c = 21;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f15913Kg = new View$OnTouchListenerC7382zx(this, this.f15916WR);
                setBackgroundColor(Color.parseColor("#80000000"));
                break;
            case 1:
            case 4:
                if (!this.f15917bX.bCU() || TextUtils.isEmpty(this.f15917bX.m88913Ld())) {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.f15913Kg = new View$OnTouchListenerC7381ldr(this);
                break;
            case 2:
            case 5:
                setBackgroundColor(Color.parseColor("#80000000"));
                this.f15913Kg = new View$OnTouchListenerC7373IL(this, this);
                break;
            case 3:
                if (this.f15917bX.bCU() && !TextUtils.isEmpty(this.f15917bX.m88913Ld())) {
                    setBackgroundColor(C7464iR.m88895bg(this.f15917bX.m88913Ld()));
                } else {
                    setBackgroundColor(Color.parseColor("#80000000"));
                }
                this.f15913Kg = new View$OnTouchListenerC7375bX(this);
                this.eqN.setTag(2);
                break;
            case 6:
            case '\t':
                this.f15912IL.setClipChildren(false);
                this.f15912IL.setClipChildren(false);
                ViewGroup viewGroup2 = (ViewGroup) this.f15912IL.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                this.f15913Kg = new View$OnTouchListenerC7381ldr(this);
                break;
            case 7:
            case 14:
                this.eqN.setTag(2);
                break;
            case '\b':
                this.f15913Kg = new View$OnTouchListenerC7378eqN(this, this.f15916WR, this.f15919eo);
                break;
            case '\n':
                this.f15913Kg = new View$OnTouchListenerC7375bX(this);
                this.eqN.setTag(2);
                break;
            case 11:
            case 19:
                if (this.ldr.equals("24") && C7487eqN.m88685IL()) {
                    this.f15912IL.setClipChildren(false);
                    this.f15913Kg = new View$OnTouchListenerC7381ldr(this);
                    break;
                } else {
                    this.f15913Kg = new View$OnTouchListenerC7382zx(this, this.f15916WR);
                    break;
                }
            case '\f':
                this.f15913Kg = new View$OnTouchListenerC7373IL(this, this);
                break;
            case '\r':
                View view = this.eqN;
                if (view != null && (view instanceof C7499Fy) && ((C7499Fy) view).getShakeLayout() != null) {
                    ((C7499Fy) this.eqN).getShakeLayout().setTag(2);
                }
                this.eqN.setTag(2);
                break;
            case 15:
                View view2 = this.eqN;
                if (view2 != null && (view2 instanceof C7517Uw) && ((C7517Uw) view2).getWriggleLayout() != null) {
                    ((C7517Uw) this.eqN).getWriggleLayout().setTag(2);
                }
                this.eqN.setTag(2);
                break;
            case 16:
                this.f15913Kg = new View$OnTouchListenerC7376bg(this, this.f15916WR, viewGroup);
                break;
            case 17:
                if (C7487eqN.m88685IL()) {
                    this.f15913Kg = new View$OnTouchListenerC7374Kg(this, this.f15919eo);
                    break;
                } else {
                    this.f15913Kg = new View$OnTouchListenerC7379iR(this, this.f15916WR, viewGroup);
                    break;
                }
            case 18:
                if (C7487eqN.m88685IL()) {
                    this.f15913Kg = new View$OnTouchListenerC7381ldr(this);
                    break;
                }
                break;
            case 20:
                if (C7487eqN.m88685IL()) {
                    this.f15913Kg = new View$OnTouchListenerC7374Kg(this, this.f15919eo);
                    break;
                }
                break;
            case 21:
                View view3 = this.eqN;
                if (view3 != null && (view3 instanceof C7540ldr) && ((C7540ldr) view3).getShakeView() != null) {
                    ((C7540ldr) this.eqN).getShakeView().setTag(2);
                }
                this.f15913Kg = new View$OnTouchListenerC7382zx(this, this.f15916WR);
                break;
        }
        View.OnTouchListener onTouchListener = this.f15913Kg;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (m89088Kg()) {
            this.eqN.setTag(2);
            setOnClickListener((View.OnClickListener) this.f15912IL.getDynamicClickListener());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.p249bX.InterfaceC7360Kg
    /* renamed from: bg */
    public void mo89085bg() {
        if (TextUtils.equals(this.ldr, "6")) {
            C7550tuV c7550tuV = this.f15920iR;
            if (c7550tuV != null) {
                c7550tuV.m88576bX();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bX.WR.2
                    @Override // java.lang.Runnable
                    public void run() {
                        C7367WR.this.m89087WR();
                    }
                }, 300L);
            }
        } else if (TextUtils.equals(this.ldr, "20")) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.bX.WR.3
                @Override // java.lang.Runnable
                public void run() {
                    C7367WR.this.m89087WR();
                }
            }, 400L);
        } else {
            m89087WR();
        }
    }
}
