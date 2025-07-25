package com.bytedance.adsdk.p183IL.p189bg.p191bg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.p183IL.C6687WR;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.ldr.C6863ldr;
import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6729xxp;
import com.bytedance.adsdk.p183IL.p185bX.p186IL.InterfaceC6718bX;
import com.bytedance.adsdk.p183IL.p185bX.p187bX.AbstractC6742bg;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6754PX;
import com.bytedance.adsdk.p183IL.p189bg.C6795bg;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.C6792xxp;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bg.bg.eqN */
/* loaded from: classes3.dex */
public class C6812eqN implements AbstractC6781bg.InterfaceC6785bg, InterfaceC6803Ta, InterfaceC6820zx {

    /* renamed from: IL */
    private final RectF f14581IL;

    /* renamed from: Kg */
    private final List<InterfaceC6807bX> f14582Kg;

    /* renamed from: VB */
    private C6792xxp f14583VB;

    /* renamed from: WR */
    private final C6687WR f14584WR;

    /* renamed from: bX */
    private final Matrix f14585bX;

    /* renamed from: bg */
    private final Paint f14586bg;

    /* renamed from: eo */
    private List<InterfaceC6803Ta> f14587eo;
    private final Path eqN;

    /* renamed from: iR */
    private final boolean f14588iR;
    private final String ldr;

    /* renamed from: zx */
    private final RectF f14589zx;

    public C6812eqN(C6687WR c6687wr, AbstractC6742bg abstractC6742bg, C6729xxp c6729xxp, C6832iR c6832iR) {
        this(c6687wr, abstractC6742bg, c6729xxp.m91001bg(), c6729xxp.m91002bX(), m90788bg(c6687wr, c6832iR, abstractC6742bg, c6729xxp.m91003IL()), m90787bg(c6729xxp.m91003IL()));
    }

    /* renamed from: bg */
    private static List<InterfaceC6807bX> m90788bg(C6687WR c6687wr, C6832iR c6832iR, AbstractC6742bg abstractC6742bg, List<InterfaceC6718bX> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            InterfaceC6807bX mo90894bg = list.get(i).mo90894bg(c6687wr, c6832iR, abstractC6742bg);
            if (mo90894bg != null) {
                arrayList.add(mo90894bg);
            }
        }
        return arrayList;
    }

    /* renamed from: zx */
    private boolean m90786zx() {
        int i = 0;
        for (int i2 = 0; i2 < this.f14582Kg.size(); i2++) {
            if ((this.f14582Kg.get(i2) instanceof InterfaceC6820zx) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: IL */
    public List<InterfaceC6803Ta> m90790IL() {
        if (this.f14587eo == null) {
            this.f14587eo = new ArrayList();
            for (int i = 0; i < this.f14582Kg.size(); i++) {
                InterfaceC6807bX interfaceC6807bX = this.f14582Kg.get(i);
                if (interfaceC6807bX instanceof InterfaceC6803Ta) {
                    this.f14587eo.add((InterfaceC6803Ta) interfaceC6807bX);
                }
            }
        }
        return this.f14587eo;
    }

    /* renamed from: bX */
    public Matrix m90789bX() {
        C6792xxp c6792xxp = this.f14583VB;
        if (c6792xxp != null) {
            return c6792xxp.eqN();
        }
        this.f14585bX.reset();
        return this.f14585bX;
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6803Ta
    public Path eqN() {
        this.f14585bX.reset();
        C6792xxp c6792xxp = this.f14583VB;
        if (c6792xxp != null) {
            this.f14585bX.set(c6792xxp.eqN());
        }
        this.eqN.reset();
        if (this.f14588iR) {
            return this.eqN;
        }
        for (int size = this.f14582Kg.size() - 1; size >= 0; size--) {
            InterfaceC6807bX interfaceC6807bX = this.f14582Kg.get(size);
            if (interfaceC6807bX instanceof InterfaceC6803Ta) {
                this.eqN.addPath(((InterfaceC6803Ta) interfaceC6807bX).eqN(), this.f14585bX);
            }
        }
        return this.eqN;
    }

    public C6812eqN(C6687WR c6687wr, AbstractC6742bg abstractC6742bg, String str, boolean z, List<InterfaceC6807bX> list, C6754PX c6754px) {
        this.f14586bg = new C6795bg();
        this.f14581IL = new RectF();
        this.f14585bX = new Matrix();
        this.eqN = new Path();
        this.f14589zx = new RectF();
        this.ldr = str;
        this.f14584WR = c6687wr;
        this.f14588iR = z;
        this.f14582Kg = list;
        if (c6754px != null) {
            C6792xxp m90893eo = c6754px.m90893eo();
            this.f14583VB = m90893eo;
            m90893eo.m90819bg(abstractC6742bg);
            this.f14583VB.m90818bg(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC6807bX interfaceC6807bX = list.get(size);
            if (interfaceC6807bX instanceof InterfaceC6811eo) {
                arrayList.add((InterfaceC6811eo) interfaceC6807bX);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((InterfaceC6811eo) arrayList.get(size2)).mo90779bg(list.listIterator(list.size()));
        }
    }

    /* renamed from: bg */
    static C6754PX m90787bg(List<InterfaceC6718bX> list) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC6718bX interfaceC6718bX = list.get(i);
            if (interfaceC6718bX instanceof C6754PX) {
                return (C6754PX) interfaceC6718bX;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6785bg
    /* renamed from: bg */
    public void mo90776bg() {
        this.f14584WR.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6807bX
    /* renamed from: bg */
    public void mo90775bg(List<InterfaceC6807bX> list, List<InterfaceC6807bX> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f14582Kg.size());
        arrayList.addAll(list);
        for (int size = this.f14582Kg.size() - 1; size >= 0; size--) {
            InterfaceC6807bX interfaceC6807bX = this.f14582Kg.get(size);
            interfaceC6807bX.mo90775bg(arrayList, this.f14582Kg.subList(0, size));
            arrayList.add(interfaceC6807bX);
        }
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6820zx
    /* renamed from: bg */
    public void mo90773bg(Canvas canvas, Matrix matrix, int i) {
        if (this.f14588iR) {
            return;
        }
        this.f14585bX.set(matrix);
        C6792xxp c6792xxp = this.f14583VB;
        if (c6792xxp != null) {
            this.f14585bX.preConcat(c6792xxp.eqN());
            i = (int) (((((this.f14583VB.m90821bg() == null ? 100 : this.f14583VB.m90821bg().mo90813iR().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.f14584WR.m91089iR() && m90786zx() && i != 255;
        if (z) {
            this.f14581IL.set(0.0f, 0.0f, 0.0f, 0.0f);
            mo90772bg(this.f14581IL, this.f14585bX, true);
            this.f14586bg.setAlpha(i);
            C6863ldr.m90616bg(canvas, this.f14581IL, this.f14586bg);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.f14582Kg.size() - 1; size >= 0; size--) {
            InterfaceC6807bX interfaceC6807bX = this.f14582Kg.get(size);
            if (interfaceC6807bX instanceof InterfaceC6820zx) {
                ((InterfaceC6820zx) interfaceC6807bX).mo90773bg(canvas, this.f14585bX, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6820zx
    /* renamed from: bg */
    public void mo90772bg(RectF rectF, Matrix matrix, boolean z) {
        this.f14585bX.set(matrix);
        C6792xxp c6792xxp = this.f14583VB;
        if (c6792xxp != null) {
            this.f14585bX.preConcat(c6792xxp.eqN());
        }
        this.f14589zx.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f14582Kg.size() - 1; size >= 0; size--) {
            InterfaceC6807bX interfaceC6807bX = this.f14582Kg.get(size);
            if (interfaceC6807bX instanceof InterfaceC6820zx) {
                ((InterfaceC6820zx) interfaceC6807bX).mo90772bg(this.f14589zx, this.f14585bX, z);
                rectF.union(this.f14589zx);
            }
        }
    }
}
