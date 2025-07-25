package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.adexpress.InterfaceC7299bX;
import com.bytedance.sdk.openadsdk.core.p313IL.AbstractView$OnClickListenerC8522bX;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.model.yDt */
/* loaded from: classes3.dex */
public class C8986yDt implements InterfaceC7299bX {

    /* renamed from: IL */
    public final float f20006IL;

    /* renamed from: Kg */
    public final int f20007Kg;

    /* renamed from: Lq */
    public final boolean f20008Lq;

    /* renamed from: PX */
    public int f20009PX;

    /* renamed from: Ta */
    public JSONObject f20010Ta;

    /* renamed from: VB */
    public final String f20011VB;
    public boolean VzQ;

    /* renamed from: WR */
    public final int f20012WR;

    /* renamed from: bX */
    public final float f20013bX;

    /* renamed from: bg */
    public final float f20014bg;

    /* renamed from: eo */
    public final int f20015eo;
    public final float eqN;

    /* renamed from: iR */
    public final int f20016iR;
    public final long ldr;

    /* renamed from: vb */
    public int f20017vb;
    public JSONObject xxp;
    public SparseArray<AbstractView$OnClickListenerC8522bX.C8523bg> yDt;

    /* renamed from: zx */
    public final long f20018zx;

    /* renamed from: com.bytedance.sdk.openadsdk.core.model.yDt$bg */
    /* loaded from: classes3.dex */
    public static class C8988bg {

        /* renamed from: IL */
        private long f20019IL;

        /* renamed from: Kg */
        private int f20020Kg;

        /* renamed from: Lq */
        private int f20021Lq;

        /* renamed from: PX */
        private String f20022PX;

        /* renamed from: Ta */
        private int f20023Ta;

        /* renamed from: VB */
        private int f20024VB;
        private boolean VzQ;

        /* renamed from: WR */
        private int f20025WR;

        /* renamed from: bX */
        private long f20026bX;

        /* renamed from: eo */
        private int f20028eo;
        private float eqN;

        /* renamed from: iR */
        private float f20029iR;
        private float ldr;

        /* renamed from: vb */
        private JSONObject f20030vb;
        private JSONObject yDt;

        /* renamed from: zx */
        private float f20031zx;
        private boolean xxp = false;

        /* renamed from: bg */
        protected SparseArray<AbstractView$OnClickListenerC8522bX.C8523bg> f20027bg = new SparseArray<>();

        /* renamed from: IL */
        public C8988bg m83908IL(int i) {
            this.f20023Ta = i;
            return this;
        }

        /* renamed from: bX */
        public C8988bg m83897bX(float f) {
            this.ldr = f;
            return this;
        }

        /* renamed from: bg */
        public C8988bg m83892bg(int i) {
            this.f20021Lq = i;
            return this;
        }

        public C8988bg eqN(float f) {
            this.f20029iR = f;
            return this;
        }

        public C8988bg ldr(int i) {
            this.f20024VB = i;
            return this;
        }

        /* renamed from: zx */
        public C8988bg m83882zx(int i) {
            this.f20028eo = i;
            return this;
        }

        /* renamed from: IL */
        public C8988bg m83907IL(long j) {
            this.f20026bX = j;
            return this;
        }

        /* renamed from: bX */
        public C8988bg m83896bX(int i) {
            this.f20020Kg = i;
            return this;
        }

        /* renamed from: bg */
        public C8988bg m83887bg(JSONObject jSONObject) {
            this.yDt = jSONObject;
            return this;
        }

        public C8988bg eqN(int i) {
            this.f20025WR = i;
            return this;
        }

        /* renamed from: IL */
        public C8988bg m83909IL(float f) {
            this.f20031zx = f;
            return this;
        }

        /* renamed from: bg */
        public C8988bg m83886bg(boolean z) {
            this.VzQ = z;
            return this;
        }

        /* renamed from: IL */
        public C8988bg m83905IL(JSONObject jSONObject) {
            this.f20030vb = jSONObject;
            return this;
        }

        /* renamed from: bg */
        public C8988bg m83891bg(long j) {
            this.f20019IL = j;
            return this;
        }

        /* renamed from: IL */
        public C8988bg m83904IL(boolean z) {
            this.xxp = z;
            return this;
        }

        /* renamed from: bg */
        public C8988bg m83893bg(float f) {
            this.eqN = f;
            return this;
        }

        /* renamed from: bg */
        public C8988bg m83888bg(String str) {
            this.f20022PX = str;
            return this;
        }

        /* renamed from: bg */
        public C8988bg m83890bg(SparseArray<AbstractView$OnClickListenerC8522bX.C8523bg> sparseArray) {
            this.f20027bg = sparseArray;
            return this;
        }

        /* renamed from: bg */
        public C8986yDt m83894bg() {
            return new C8986yDt(this);
        }
    }

    private C8986yDt(@NonNull C8988bg c8988bg) {
        this.VzQ = false;
        this.f20014bg = c8988bg.f20029iR;
        this.f20006IL = c8988bg.ldr;
        this.f20013bX = c8988bg.f20031zx;
        this.eqN = c8988bg.eqN;
        this.f20018zx = c8988bg.f20026bX;
        this.ldr = c8988bg.f20019IL;
        this.f20016iR = c8988bg.f20020Kg;
        this.f20007Kg = c8988bg.f20025WR;
        this.f20012WR = c8988bg.f20028eo;
        this.f20015eo = c8988bg.f20024VB;
        this.f20011VB = c8988bg.f20022PX;
        this.yDt = c8988bg.f20027bg;
        this.f20008Lq = c8988bg.VzQ;
        this.f20009PX = c8988bg.f20023Ta;
        this.f20010Ta = c8988bg.yDt;
        this.f20017vb = c8988bg.f20021Lq;
        this.xxp = c8988bg.f20030vb;
        this.VzQ = c8988bg.xxp;
    }
}
