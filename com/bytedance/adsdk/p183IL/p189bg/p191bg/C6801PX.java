package com.bytedance.adsdk.p183IL.p189bg.p191bg;

import android.annotation.TargetApi;
import android.graphics.Path;
import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6716WR;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@TargetApi(19)
/* renamed from: com.bytedance.adsdk.IL.bg.bg.PX */
/* loaded from: classes3.dex */
public class C6801PX implements InterfaceC6803Ta, InterfaceC6811eo {
    private final String eqN;
    private final C6716WR ldr;

    /* renamed from: bg */
    private final Path f14552bg = new Path();

    /* renamed from: IL */
    private final Path f14550IL = new Path();

    /* renamed from: bX */
    private final Path f14551bX = new Path();

    /* renamed from: zx */
    private final List<InterfaceC6803Ta> f14553zx = new ArrayList();

    /* renamed from: com.bytedance.adsdk.IL.bg.bg.PX$1 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C68021 {

        /* renamed from: bg */
        static final /* synthetic */ int[] f14554bg;

        static {
            int[] iArr = new int[C6716WR.EnumC6717bg.values().length];
            f14554bg = iArr;
            try {
                iArr[C6716WR.EnumC6717bg.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14554bg[C6716WR.EnumC6717bg.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14554bg[C6716WR.EnumC6717bg.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14554bg[C6716WR.EnumC6717bg.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14554bg[C6716WR.EnumC6717bg.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C6801PX(C6716WR c6716wr) {
        this.eqN = c6716wr.m91043bg();
        this.ldr = c6716wr;
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6811eo
    /* renamed from: bg */
    public void mo90779bg(ListIterator<InterfaceC6807bX> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC6807bX previous = listIterator.previous();
            if (previous instanceof InterfaceC6803Ta) {
                this.f14553zx.add((InterfaceC6803Ta) previous);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6803Ta
    public Path eqN() {
        this.f14551bX.reset();
        if (this.ldr.m91044bX()) {
            return this.f14551bX;
        }
        int i = C68021.f14554bg[this.ldr.m91045IL().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            m90803bg(Path.Op.XOR);
                        }
                    } else {
                        m90803bg(Path.Op.INTERSECT);
                    }
                } else {
                    m90803bg(Path.Op.REVERSE_DIFFERENCE);
                }
            } else {
                m90803bg(Path.Op.UNION);
            }
        } else {
            m90804bg();
        }
        return this.f14551bX;
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6807bX
    /* renamed from: bg */
    public void mo90775bg(List<InterfaceC6807bX> list, List<InterfaceC6807bX> list2) {
        for (int i = 0; i < this.f14553zx.size(); i++) {
            this.f14553zx.get(i).mo90775bg(list, list2);
        }
    }

    /* renamed from: bg */
    private void m90804bg() {
        for (int i = 0; i < this.f14553zx.size(); i++) {
            this.f14551bX.addPath(this.f14553zx.get(i).eqN());
        }
    }

    @TargetApi(19)
    /* renamed from: bg */
    private void m90803bg(Path.Op op) {
        this.f14550IL.reset();
        this.f14552bg.reset();
        for (int size = this.f14553zx.size() - 1; size > 0; size--) {
            InterfaceC6803Ta interfaceC6803Ta = this.f14553zx.get(size);
            if (interfaceC6803Ta instanceof C6812eqN) {
                C6812eqN c6812eqN = (C6812eqN) interfaceC6803Ta;
                List<InterfaceC6803Ta> m90790IL = c6812eqN.m90790IL();
                for (int size2 = m90790IL.size() - 1; size2 >= 0; size2--) {
                    Path eqN = m90790IL.get(size2).eqN();
                    eqN.transform(c6812eqN.m90789bX());
                    this.f14550IL.addPath(eqN);
                }
            } else {
                this.f14550IL.addPath(interfaceC6803Ta.eqN());
            }
        }
        InterfaceC6803Ta interfaceC6803Ta2 = this.f14553zx.get(0);
        if (interfaceC6803Ta2 instanceof C6812eqN) {
            C6812eqN c6812eqN2 = (C6812eqN) interfaceC6803Ta2;
            List<InterfaceC6803Ta> m90790IL2 = c6812eqN2.m90790IL();
            for (int i = 0; i < m90790IL2.size(); i++) {
                Path eqN2 = m90790IL2.get(i).eqN();
                eqN2.transform(c6812eqN2.m90789bX());
                this.f14552bg.addPath(eqN2);
            }
        } else {
            this.f14552bg.set(interfaceC6803Ta2.eqN());
        }
        this.f14551bX.op(this.f14552bg, this.f14550IL, op);
    }
}
