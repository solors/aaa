package com.bytedance.sdk.component.p275zx.p277bX;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.p275zx.InterfaceC7770IL;
import com.bytedance.sdk.component.p275zx.InterfaceC7776Kg;
import com.bytedance.sdk.component.p275zx.InterfaceC7777LZ;
import com.bytedance.sdk.component.p275zx.InterfaceC7781VB;
import com.bytedance.sdk.component.p275zx.InterfaceC7783WR;
import com.bytedance.sdk.component.p275zx.InterfaceC7831eo;
import com.bytedance.sdk.component.p275zx.InterfaceC7847iR;
import com.bytedance.sdk.component.p275zx.InterfaceC7851xxp;
import com.bytedance.sdk.component.p275zx.InterfaceC7852yDt;
import com.bytedance.sdk.component.p275zx.eqN.C7834Kg;
import com.bytedance.sdk.component.p275zx.eqN.C7840bX;
import com.bytedance.sdk.component.p275zx.eqN.InterfaceC7839WR;
import com.bytedance.sdk.component.p275zx.p277bX.p280bg.C7808bg;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.bytedance.sdk.component.zx.bX.bX */
/* loaded from: classes3.dex */
public class C7788bX implements InterfaceC7783WR {
    private boolean DDQ;

    /* renamed from: Fy */
    private boolean f16964Fy;

    /* renamed from: IL */
    private String f16965IL;
    private InterfaceC7770IL JAA;

    /* renamed from: Ja */
    private int f16966Ja;

    /* renamed from: Kg */
    private int f16967Kg;

    /* renamed from: LZ */
    private InterfaceC7847iR f16968LZ;

    /* renamed from: Lq */
    private boolean f16969Lq;

    /* renamed from: PX */
    private WeakReference<ImageView> f16970PX;

    /* renamed from: Ta */
    private volatile boolean f16971Ta;

    /* renamed from: Uq */
    private ExecutorService f16972Uq;

    /* renamed from: Uw */
    private int f16973Uw;

    /* renamed from: VB */
    private int f16974VB;

    /* renamed from: VW */
    private InterfaceC7852yDt f16975VW;
    private Queue<InterfaceC7839WR> VzQ;

    /* renamed from: WR */
    private int f16976WR;
    private boolean aGH;

    /* renamed from: bX */
    private String f16977bX;

    /* renamed from: bg */
    Future<?> f16978bg;

    /* renamed from: eo */
    private InterfaceC7776Kg f16979eo;
    private String eqN;

    /* renamed from: iR */
    private Bitmap.Config f16980iR;
    private C7798bg kMt;
    private ImageView.ScaleType ldr;
    private C7822ldr rri;

    /* renamed from: tC */
    private int f16981tC;
    private final Handler tuV;

    /* renamed from: vb */
    private InterfaceC7777LZ f16982vb;
    private int xxp;
    private boolean yDt;

    /* renamed from: zx */
    private InterfaceC7851xxp f16983zx;

    /* renamed from: com.bytedance.sdk.component.zx.bX.bX$IL */
    /* loaded from: classes3.dex */
    public static class C7790IL implements InterfaceC7831eo {

        /* renamed from: Fy */
        private boolean f16985Fy;

        /* renamed from: IL */
        private ImageView f16986IL;

        /* renamed from: Kg */
        private int f16987Kg;

        /* renamed from: LZ */
        private ExecutorService f16988LZ;

        /* renamed from: Lq */
        private InterfaceC7770IL f16989Lq;

        /* renamed from: PX */
        private boolean f16990PX;

        /* renamed from: Ta */
        private boolean f16991Ta;

        /* renamed from: VB */
        private InterfaceC7777LZ f16992VB;
        private int VzQ;

        /* renamed from: bX */
        private String f16994bX;

        /* renamed from: bg */
        private InterfaceC7851xxp f16995bg;
        private String eqN;

        /* renamed from: iR */
        private int f16997iR;
        private Bitmap.Config ldr;
        private InterfaceC7852yDt rri;

        /* renamed from: tC */
        private boolean f16998tC;
        private int tuV;

        /* renamed from: vb */
        private C7822ldr f16999vb;
        private InterfaceC7776Kg xxp;
        private String yDt;

        /* renamed from: zx */
        private ImageView.ScaleType f17000zx;

        /* renamed from: WR */
        private int f16993WR = 1;

        /* renamed from: eo */
        private int f16996eo = 5;

        public C7790IL(C7822ldr c7822ldr) {
            this.f16999vb = c7822ldr;
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7831eo
        /* renamed from: IL */
        public InterfaceC7831eo mo87578IL(int i) {
            this.f16987Kg = i;
            return this;
        }

        /* renamed from: bX */
        public InterfaceC7831eo m87727bX(String str) {
            this.eqN = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7831eo
        /* renamed from: bg */
        public InterfaceC7831eo mo87567bg(String str) {
            this.f16994bX = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7831eo
        public InterfaceC7831eo eqN(int i) {
            this.VzQ = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7831eo
        /* renamed from: zx */
        public InterfaceC7831eo mo87565zx(int i) {
            this.tuV = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7831eo
        /* renamed from: IL */
        public InterfaceC7831eo mo87577IL(String str) {
            this.yDt = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7831eo
        /* renamed from: bX */
        public InterfaceC7831eo mo87576bX(int i) {
            this.f16993WR = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7831eo
        /* renamed from: bg */
        public InterfaceC7831eo mo87573bg(ImageView.ScaleType scaleType) {
            this.f17000zx = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7831eo
        /* renamed from: bg */
        public InterfaceC7831eo mo87574bg(Bitmap.Config config) {
            this.ldr = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7831eo
        /* renamed from: bg */
        public InterfaceC7831eo mo87575bg(int i) {
            this.f16997iR = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7831eo
        /* renamed from: bg */
        public InterfaceC7831eo mo87570bg(InterfaceC7777LZ interfaceC7777LZ) {
            this.f16992VB = interfaceC7777LZ;
            return this;
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7831eo
        /* renamed from: bg */
        public InterfaceC7831eo mo87566bg(boolean z) {
            this.f16991Ta = z;
            return this;
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7831eo
        /* renamed from: bg */
        public InterfaceC7783WR mo87568bg(InterfaceC7851xxp interfaceC7851xxp, int i) {
            this.f16996eo = i;
            return mo87569bg(interfaceC7851xxp);
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7831eo
        /* renamed from: bg */
        public InterfaceC7783WR mo87569bg(InterfaceC7851xxp interfaceC7851xxp) {
            this.f16995bg = interfaceC7851xxp;
            return new C7788bX(this).kMt();
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7831eo
        /* renamed from: bg */
        public InterfaceC7783WR mo87572bg(ImageView imageView) {
            this.f16986IL = imageView;
            return new C7788bX(this).kMt();
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7831eo
        /* renamed from: bg */
        public InterfaceC7831eo mo87571bg(InterfaceC7776Kg interfaceC7776Kg) {
            this.xxp = interfaceC7776Kg;
            return this;
        }
    }

    /* renamed from: com.bytedance.sdk.component.zx.bX.bX$bg */
    /* loaded from: classes3.dex */
    private class C7791bg implements InterfaceC7851xxp {

        /* renamed from: IL */
        private InterfaceC7851xxp f17001IL;

        public C7791bg(InterfaceC7851xxp interfaceC7851xxp) {
            this.f17001IL = interfaceC7851xxp;
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7851xxp
        /* renamed from: bg */
        public void mo82307bg(final InterfaceC7781VB interfaceC7781VB) {
            Bitmap mo82306bg;
            final ImageView imageView = (ImageView) C7788bX.this.f16970PX.get();
            if (imageView != null && C7788bX.this.f16974VB != 3 && m87715bg(imageView) && (interfaceC7781VB.mo87629IL() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) interfaceC7781VB.mo87629IL();
                C7788bX.this.tuV.post(new Runnable() { // from class: com.bytedance.sdk.component.zx.bX.bX.bg.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            try {
                if (C7788bX.this.f16979eo != null && (interfaceC7781VB.mo87629IL() instanceof Bitmap) && (mo82306bg = C7788bX.this.f16979eo.mo82306bg((Bitmap) interfaceC7781VB.mo87629IL())) != null) {
                    interfaceC7781VB.mo87624bg(mo82306bg);
                }
            } catch (Throwable unused) {
            }
            if (C7788bX.this.xxp == 5) {
                C7788bX.this.tuV.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.zx.bX.bX.bg.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C7791bg.this.f17001IL != null) {
                            C7791bg.this.f17001IL.mo82307bg(interfaceC7781VB);
                        }
                    }
                });
                return;
            }
            InterfaceC7851xxp interfaceC7851xxp = this.f17001IL;
            if (interfaceC7851xxp != null) {
                interfaceC7851xxp.mo82307bg(interfaceC7781VB);
            }
        }

        /* renamed from: bg */
        private boolean m87715bg(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(C7788bX.this.f16977bX)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.p275zx.InterfaceC7851xxp
        /* renamed from: bg */
        public void mo82308bg(final int i, final String str, final Throwable th) {
            if (C7788bX.this.xxp == 5) {
                C7788bX.this.tuV.post(new Runnable() { // from class: com.bytedance.sdk.component.zx.bX.bX.bg.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (C7791bg.this.f17001IL != null) {
                            C7791bg.this.f17001IL.mo82308bg(i, str, th);
                        }
                    }
                });
                return;
            }
            InterfaceC7851xxp interfaceC7851xxp = this.f17001IL;
            if (interfaceC7851xxp != null) {
                interfaceC7851xxp.mo82308bg(i, str, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC7783WR kMt() {
        C7822ldr c7822ldr;
        ExecutorService executorService;
        try {
            c7822ldr = this.rri;
            executorService = null;
        } catch (Exception e) {
            Log.e("ImageRequest", e.getMessage());
        }
        if (c7822ldr == null) {
            InterfaceC7851xxp interfaceC7851xxp = this.f16983zx;
            if (interfaceC7851xxp != null) {
                interfaceC7851xxp.mo82308bg(1005, "not init !", null);
            }
            return this;
        }
        if (this.f16972Uq == null) {
            executorService = c7822ldr.ldr();
        }
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.zx.bX.bX.1
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC7839WR interfaceC7839WR;
                while (!C7788bX.this.f16971Ta && (interfaceC7839WR = (InterfaceC7839WR) C7788bX.this.VzQ.poll()) != null) {
                    try {
                        if (C7788bX.this.f16982vb != null) {
                            C7788bX.this.f16982vb.mo87343bg(interfaceC7839WR.mo87556bg(), C7788bX.this);
                        }
                        interfaceC7839WR.mo87554bg(C7788bX.this);
                        if (C7788bX.this.f16982vb != null) {
                            C7788bX.this.f16982vb.mo87345IL(interfaceC7839WR.mo87556bg(), C7788bX.this);
                        }
                    } catch (Throwable th) {
                        C7788bX.this.m87754bg(2000, th.getMessage(), th);
                        if (C7788bX.this.f16982vb != null) {
                            C7788bX.this.f16982vb.mo87345IL("exception", C7788bX.this);
                            return;
                        }
                        return;
                    }
                }
                if (C7788bX.this.f16971Ta) {
                    C7788bX.this.m87754bg(1003, "canceled", null);
                }
            }
        };
        if (this.aGH) {
            runnable.run();
        } else {
            ExecutorService executorService2 = this.f16972Uq;
            if (executorService2 != null) {
                this.f16978bg = executorService2.submit(runnable);
            } else if (executorService != null) {
                this.f16978bg = executorService.submit(runnable);
            }
        }
        return this;
    }

    /* renamed from: Fy */
    public InterfaceC7770IL m87771Fy() {
        return this.JAA;
    }

    /* renamed from: LZ */
    public boolean m87765LZ() {
        return this.DDQ;
    }

    /* renamed from: Lq */
    public boolean m87764Lq() {
        return this.f16964Fy;
    }

    /* renamed from: PX */
    public int m87763PX() {
        return this.f16974VB;
    }

    /* renamed from: Ta */
    public boolean m87762Ta() {
        return this.yDt;
    }

    /* renamed from: VB */
    public Bitmap.Config m87761VB() {
        return this.f16980iR;
    }

    public C7798bg VzQ() {
        return this.kMt;
    }

    public String rri() {
        return mo87739zx() + m87763PX();
    }

    /* renamed from: tC */
    public InterfaceC7852yDt m87741tC() {
        return this.f16975VW;
    }

    public C7822ldr tuV() {
        return this.rri;
    }

    /* renamed from: vb */
    public InterfaceC7847iR m87740vb() {
        return this.f16968LZ;
    }

    public int xxp() {
        return this.f16981tC;
    }

    public boolean yDt() {
        return this.f16969Lq;
    }

    private C7788bX(C7790IL c7790il) {
        this.VzQ = new LinkedBlockingQueue();
        this.tuV = new Handler(Looper.getMainLooper());
        this.f16964Fy = true;
        this.f16965IL = c7790il.eqN;
        this.f16983zx = new C7791bg(c7790il.f16995bg);
        this.f16970PX = new WeakReference<>(c7790il.f16986IL);
        this.ldr = c7790il.f17000zx;
        this.f16980iR = c7790il.ldr;
        this.f16967Kg = c7790il.f16997iR;
        this.f16976WR = c7790il.f16987Kg;
        this.f16974VB = c7790il.f16993WR;
        this.xxp = c7790il.f16996eo;
        this.f16982vb = c7790il.f16992VB;
        this.JAA = m87753bg(c7790il);
        if (!TextUtils.isEmpty(c7790il.f16994bX)) {
            m87768IL(c7790il.f16994bX);
            m87747bg(c7790il.f16994bX);
        }
        this.yDt = c7790il.f16990PX;
        this.f16969Lq = c7790il.f16991Ta;
        this.rri = c7790il.f16999vb;
        this.f16979eo = c7790il.xxp;
        this.f16973Uw = c7790il.tuV;
        this.f16966Ja = c7790il.VzQ;
        this.f16972Uq = c7790il.f16988LZ;
        this.DDQ = c7790il.f16985Fy;
        this.aGH = c7790il.f16998tC;
        this.f16975VW = c7790il.rri;
        this.VzQ.add(new C7840bX());
    }

    /* renamed from: IL */
    public void m87768IL(String str) {
        WeakReference<ImageView> weakReference = this.f16970PX;
        if (weakReference != null && weakReference.get() != null) {
            this.f16970PX.get().setTag(1094453505, str);
        }
        this.f16977bX = str;
    }

    /* renamed from: Kg */
    public int m87767Kg() {
        return this.f16973Uw;
    }

    /* renamed from: WR */
    public InterfaceC7851xxp m87760WR() {
        return this.f16983zx;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7783WR
    /* renamed from: bX */
    public int mo87758bX() {
        return this.f16976WR;
    }

    /* renamed from: eo */
    public String m87745eo() {
        return this.eqN;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7783WR
    public ImageView.ScaleType eqN() {
        return this.ldr;
    }

    /* renamed from: iR */
    public int m87743iR() {
        return this.f16966Ja;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7783WR
    public Bitmap.Config ldr() {
        return this.f16980iR;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7783WR
    /* renamed from: zx */
    public String mo87739zx() {
        return this.f16977bX;
    }

    /* renamed from: bg */
    private InterfaceC7770IL m87753bg(C7790IL c7790il) {
        if (c7790il.f16989Lq != null) {
            return c7790il.f16989Lq;
        }
        if (!TextUtils.isEmpty(c7790il.yDt)) {
            return C7808bg.m87683bg(new File(c7790il.yDt));
        }
        return C7808bg.m87682iR();
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7783WR
    /* renamed from: IL */
    public int mo87770IL() {
        return this.f16967Kg;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7783WR
    /* renamed from: bg */
    public String mo87756bg() {
        return this.f16965IL;
    }

    /* renamed from: bg */
    public void m87747bg(String str) {
        this.eqN = str;
    }

    /* renamed from: bg */
    public void m87746bg(boolean z) {
        this.f16964Fy = z;
    }

    /* renamed from: bg */
    public void m87748bg(InterfaceC7847iR interfaceC7847iR) {
        this.f16968LZ = interfaceC7847iR;
    }

    /* renamed from: bg */
    public void m87755bg(int i) {
        this.f16981tC = i;
    }

    /* renamed from: bg */
    public void m87750bg(C7798bg c7798bg) {
        this.kMt = c7798bg;
    }

    /* renamed from: bg */
    public boolean m87749bg(InterfaceC7839WR interfaceC7839WR) {
        if (this.f16971Ta) {
            return false;
        }
        return this.VzQ.add(interfaceC7839WR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public void m87754bg(int i, String str, Throwable th) {
        new C7834Kg(i, str, th).mo87554bg(this);
        this.VzQ.clear();
    }
}
