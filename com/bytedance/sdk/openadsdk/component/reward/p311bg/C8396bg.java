package com.bytedance.sdk.openadsdk.component.reward.p311bg;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.JAA;
import com.bytedance.sdk.openadsdk.activity.AbstractC8067ldr;
import com.bytedance.sdk.openadsdk.common.C8199Ta;
import com.bytedance.sdk.openadsdk.component.reward.p310IL.AbstractC8308IL;
import com.bytedance.sdk.openadsdk.component.reward.top.C8464bX;
import com.bytedance.sdk.openadsdk.component.reward.view.C8469Kg;
import com.bytedance.sdk.openadsdk.component.reward.view.C8473VB;
import com.bytedance.sdk.openadsdk.component.reward.view.C8474WR;
import com.bytedance.sdk.openadsdk.component.reward.view.C8485eo;
import com.bytedance.sdk.openadsdk.component.reward.view.C8490iR;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.core.model.C8969xxp;
import com.bytedance.sdk.openadsdk.core.p321Ta.eqN.InterfaceC8732IL;
import com.bytedance.sdk.openadsdk.core.settings.C9011xxp;
import com.bytedance.sdk.openadsdk.p289PX.C7895Kg;
import com.bytedance.sdk.openadsdk.utils.InterfaceC9518VB;
import com.bytedance.sdk.openadsdk.utils.RunnableC9558ldr;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.bg.bg */
/* loaded from: classes3.dex */
public class C8396bg {
    public boolean ApA;
    public final C8490iR CQc;
    public final C8377VB DDQ;

    /* renamed from: Dt */
    public InterfaceC9518VB f18409Dt;
    public final Context Dxa;

    /* renamed from: GZ */
    public int f18411GZ;

    /* renamed from: IL */
    public final AbstractC8967tuV f18412IL;
    public final C8364Kg JAA;

    /* renamed from: Ja */
    public final C8469Kg f18413Ja;
    public final C8485eo LKE;

    /* renamed from: Ld */
    public boolean f18416Ld;

    /* renamed from: Ny */
    public boolean f18418Ny;
    public String Pae;

    /* renamed from: RJ */
    public boolean f18420RJ;
    public boolean RiO;

    /* renamed from: Uq */
    public final C8404ldr f18422Uq;

    /* renamed from: Uw */
    public final C8370PX f18423Uw;

    /* renamed from: VJ */
    public final C8412tuV f18425VJ;

    /* renamed from: VW */
    public C7895Kg f18426VW;

    /* renamed from: Ys */
    public boolean f18428Ys;
    public final C8440zx ZQc;
    public final C8394bX aGH;
    @NonNull
    public final C8439yDt ayS;
    public boolean bCU;

    /* renamed from: bN */
    public final JAA f18429bN;
    public C8464bX bOf;

    /* renamed from: bX */
    public final boolean f18430bX;

    /* renamed from: bg */
    public final int f18431bg;

    /* renamed from: dS */
    public AbstractC8308IL f18432dS;
    public final C8365Lq daV;
    private long eDa;
    public final boolean eqN;
    public int gXn;

    /* renamed from: iR */
    public final boolean f18434iR;

    /* renamed from: jz */
    public final boolean f18435jz;
    public final C8400eqN kMt;
    @Nullable

    /* renamed from: kU */
    public AbstractC8067ldr f18436kU;

    /* renamed from: lM */
    public float f18437lM;
    public final int ldr;

    /* renamed from: qC */
    public final InterfaceC8732IL f18438qC;

    /* renamed from: qp */
    private long f18439qp;
    @NonNull
    public final C8383VzQ rri;
    public int sVc;
    @NonNull

    /* renamed from: uu */
    public final Activity f18441uu;

    /* renamed from: wS */
    public boolean f18443wS;
    public C8199Ta zCS;

    /* renamed from: zx */
    public final String f18444zx;

    /* renamed from: Kg */
    public int f18414Kg = 0;

    /* renamed from: WR */
    public int f18427WR = 0;

    /* renamed from: eo */
    public final AtomicBoolean f18433eo = new AtomicBoolean(false);

    /* renamed from: VB */
    public final AtomicBoolean f18424VB = new AtomicBoolean(false);

    /* renamed from: PX */
    public final AtomicBoolean f18419PX = new AtomicBoolean(false);

    /* renamed from: Ta */
    public final AtomicBoolean f18421Ta = new AtomicBoolean(false);
    public final AtomicBoolean yDt = new AtomicBoolean(false);

    /* renamed from: Lq */
    public final AtomicBoolean f18417Lq = new AtomicBoolean(false);

    /* renamed from: vb */
    public final AtomicBoolean f18442vb = new AtomicBoolean(false);
    public final AtomicBoolean xxp = new AtomicBoolean(false);
    public final AtomicBoolean VzQ = new AtomicBoolean(false);
    public final AtomicBoolean tuV = new AtomicBoolean(false);

    /* renamed from: Fy */
    public final AtomicBoolean f18410Fy = new AtomicBoolean(false);

    /* renamed from: LZ */
    public final AtomicBoolean f18415LZ = new AtomicBoolean(false);

    /* renamed from: tC */
    public final AtomicBoolean f18440tC = new AtomicBoolean(false);
    public boolean txA = false;
    public int GvG = 1;
    public long cZH = 0;

    public C8396bg(@NonNull Activity activity, JAA jaa, @NonNull AbstractC8967tuV abstractC8967tuV, InterfaceC8732IL interfaceC8732IL, int i) {
        boolean z;
        boolean z2;
        String str;
        C8370PX c8370px;
        C8485eo c8474wr;
        this.f18441uu = activity;
        this.f18438qC = interfaceC8732IL;
        Context m84740bg = C8838VzQ.m84740bg();
        this.Dxa = m84740bg;
        this.f18412IL = abstractC8967tuV;
        this.f18431bg = i;
        if (i != 0 && i != 2) {
            z = false;
        } else {
            z = true;
        }
        this.f18435jz = z;
        if (i != 0 && i != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.RiO = z2;
        this.f18429bN = jaa;
        boolean z3 = abstractC8967tuV.mo84077VW().getDurationSlotType() == 7;
        this.eqN = z3;
        if (z3) {
            str = "rewarded_video";
        } else {
            str = "fullscreen_interstitial_ad";
        }
        this.f18444zx = str;
        this.f18428Ys = abstractC8967tuV.m84057bg();
        this.f18434iR = C8969xxp.m83932WR(abstractC8967tuV);
        int IGR = abstractC8967tuV.IGR();
        this.ldr = IGR;
        this.f18420RJ = C8838VzQ.eqN().xxp(String.valueOf(IGR));
        this.f18430bX = C9011xxp.m83746zU().yDt(String.valueOf(IGR));
        if (i == 2) {
            c8370px = new C8376Ta(this);
        } else {
            c8370px = new C8370PX(this);
        }
        this.f18423Uw = c8370px;
        if (i == 2) {
            c8474wr = new C8473VB(this);
        } else if (abstractC8967tuV.m84057bg()) {
            c8474wr = new C8485eo(this);
        } else {
            c8474wr = new C8474WR(this);
        }
        this.LKE = c8474wr;
        this.CQc = new C8490iR(this);
        this.rri = new C8383VzQ(this);
        this.kMt = new C8400eqN(this);
        this.JAA = new C8364Kg(this, abstractC8967tuV);
        this.f18413Ja = new C8469Kg(this);
        this.f18425VJ = new C8412tuV(this);
        this.daV = new C8365Lq(this);
        this.ayS = new C8439yDt(this);
        this.ZQc = new C8440zx(this);
        this.DDQ = new C8377VB(this);
        this.f18422Uq = new C8404ldr(this);
        this.aGH = new C8394bX(this);
        this.f18426VW = new C7895Kg(m84740bg);
        this.f18409Dt = RunnableC9558ldr.m82403bg(activity, new RunnableC9558ldr.InterfaceC9560bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.bg.1
            @Override // com.bytedance.sdk.openadsdk.utils.RunnableC9558ldr.InterfaceC9560bg
            /* renamed from: IL */
            public void mo82395IL() {
                C8439yDt c8439yDt = C8396bg.this.ayS;
                if (c8439yDt != null) {
                    c8439yDt.ldr();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.utils.RunnableC9558ldr.InterfaceC9560bg
            /* renamed from: bg */
            public View mo82394bg() {
                C8485eo c8485eo = C8396bg.this.LKE;
                if (c8485eo != null) {
                    return c8485eo.mo85972eo();
                }
                return null;
            }
        });
    }

    /* renamed from: IL */
    public void m86235IL() {
        if (this.f18439qp <= 0) {
            this.f18439qp = SystemClock.elapsedRealtime();
        }
        this.eDa += SystemClock.elapsedRealtime() - this.f18439qp;
    }

    /* renamed from: bX */
    public long m86234bX() {
        return this.eDa + (SystemClock.elapsedRealtime() - this.f18439qp);
    }

    /* renamed from: bg */
    public void m86232bg(boolean z) {
        this.f18416Ld = z;
        this.ayS.eqN(z);
    }

    /* renamed from: bg */
    public void m86233bg() {
        this.f18439qp = SystemClock.elapsedRealtime();
    }
}
