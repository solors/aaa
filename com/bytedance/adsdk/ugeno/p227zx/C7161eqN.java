package com.bytedance.adsdk.ugeno.p227zx;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.bytedance.adsdk.ugeno.p222iR.C7122ldr;
import com.bytedance.adsdk.ugeno.p222iR.C7123zx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.adsdk.ugeno.zx.eqN */
/* loaded from: classes3.dex */
class C7161eqN {

    /* renamed from: bX */
    static final /* synthetic */ boolean f15424bX = true;

    /* renamed from: IL */
    long[] f15425IL;

    /* renamed from: bg */
    int[] f15426bg;
    private final InterfaceC7160bg eqN;
    private long[] ldr;

    /* renamed from: zx */
    private boolean[] f15427zx;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.adsdk.ugeno.zx.eqN$IL */
    /* loaded from: classes3.dex */
    public static class C7163IL implements Comparable<C7163IL> {

        /* renamed from: IL */
        int f15428IL;

        /* renamed from: bg */
        int f15429bg;

        private C7163IL() {
        }

        @Override // java.lang.Comparable
        /* renamed from: bg */
        public int compareTo(C7163IL c7163il) {
            int i = this.f15428IL;
            int i2 = c7163il.f15428IL;
            if (i != i2) {
                return i - i2;
            }
            return this.f15429bg - c7163il.f15429bg;
        }

        public String toString() {
            return "Order{order=" + this.f15428IL + ", index=" + this.f15429bg + '}';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.adsdk.ugeno.zx.eqN$bg */
    /* loaded from: classes3.dex */
    public static class C7164bg {

        /* renamed from: IL */
        int f15430IL;

        /* renamed from: bg */
        List<C7159bX> f15431bg;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: bg */
        public void m89799bg() {
            this.f15431bg = null;
            this.f15430IL = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7161eqN(InterfaceC7160bg interfaceC7160bg) {
        this.eqN = interfaceC7160bg;
    }

    /* renamed from: bX */
    private int m89827bX(boolean z) {
        if (z) {
            return this.eqN.getPaddingTop();
        }
        return this.eqN.getPaddingStart();
    }

    private int eqN(boolean z) {
        if (z) {
            return this.eqN.getPaddingBottom();
        }
        return this.eqN.getPaddingEnd();
    }

    private int ldr(InterfaceC7158IL interfaceC7158IL, boolean z) {
        if (z) {
            return interfaceC7158IL.mo89744vb();
        }
        return interfaceC7158IL.mo89757Lq();
    }

    /* renamed from: zx */
    private int m89801zx(InterfaceC7158IL interfaceC7158IL, boolean z) {
        if (z) {
            return interfaceC7158IL.yDt();
        }
        return interfaceC7158IL.mo89755Ta();
    }

    /* renamed from: IL */
    int m89836IL(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: bg */
    int m89817bg(long j) {
        return (int) j;
    }

    /* renamed from: IL */
    long m89840IL(int i, int i2) {
        return (i & 4294967295L) | (i2 << 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public int[] m89812bg(View view, int i, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.eqN.getFlexItemCount();
        List<C7163IL> m89841IL = m89841IL(flexItemCount);
        C7163IL c7163il = new C7163IL();
        if (view != null && (layoutParams instanceof InterfaceC7158IL)) {
            c7163il.f15428IL = ((InterfaceC7158IL) layoutParams).mo89752bX();
        } else {
            c7163il.f15428IL = 1;
        }
        if (i != -1 && i != flexItemCount) {
            if (i < this.eqN.getFlexItemCount()) {
                c7163il.f15429bg = i;
                while (i < flexItemCount) {
                    m89841IL.get(i).f15429bg++;
                    i++;
                }
            } else {
                c7163il.f15429bg = flexItemCount;
            }
        } else {
            c7163il.f15429bg = flexItemCount;
        }
        m89841IL.add(c7163il);
        return m89818bg(flexItemCount + 1, m89841IL, sparseIntArray);
    }

    /* renamed from: IL */
    private List<C7163IL> m89841IL(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            C7163IL c7163il = new C7163IL();
            c7163il.f15428IL = ((InterfaceC7158IL) this.eqN.mo89776bg(i2).getLayoutParams()).mo89752bX();
            c7163il.f15429bg = i2;
            arrayList.add(c7163il);
        }
        return arrayList;
    }

    /* renamed from: bX */
    private int m89828bX(InterfaceC7158IL interfaceC7158IL, boolean z) {
        if (z) {
            return interfaceC7158IL.mo89755Ta();
        }
        return interfaceC7158IL.yDt();
    }

    private int eqN(InterfaceC7158IL interfaceC7158IL, boolean z) {
        if (z) {
            return interfaceC7158IL.mo89757Lq();
        }
        return interfaceC7158IL.mo89744vb();
    }

    /* renamed from: bX */
    private void m89829bX(int i) {
        boolean[] zArr = this.f15427zx;
        if (zArr == null) {
            this.f15427zx = new boolean[Math.max(i, 10)];
        } else if (zArr.length < i) {
            this.f15427zx = new boolean[Math.max(zArr.length * 2, i)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public boolean m89835IL(SparseIntArray sparseIntArray) {
        int flexItemCount = this.eqN.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i = 0; i < flexItemCount; i++) {
            View mo89776bg = this.eqN.mo89776bg(i);
            if (mo89776bg != null && ((InterfaceC7158IL) mo89776bg.getLayoutParams()).mo89752bX() != sparseIntArray.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public void m89831IL(C7164bg c7164bg, int i, int i2) {
        m89805bg(c7164bg, i2, i, Integer.MAX_VALUE, 0, -1, (List<C7159bX>) null);
    }

    /* renamed from: IL */
    private int m89830IL(boolean z) {
        if (z) {
            return this.eqN.getPaddingEnd();
        }
        return this.eqN.getPaddingBottom();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public int[] m89816bg(SparseIntArray sparseIntArray) {
        int flexItemCount = this.eqN.getFlexItemCount();
        return m89818bg(flexItemCount, m89841IL(flexItemCount), sparseIntArray);
    }

    /* renamed from: IL */
    private int m89833IL(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: bg */
    private int[] m89818bg(int i, List<C7163IL> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int i2 = 0;
        for (C7163IL c7163il : list) {
            int i3 = c7163il.f15429bg;
            iArr[i2] = i3;
            sparseIntArray.append(i3, c7163il.f15428IL);
            i2++;
        }
        return iArr;
    }

    /* renamed from: IL */
    private int m89832IL(InterfaceC7158IL interfaceC7158IL, boolean z) {
        if (z) {
            return interfaceC7158IL.mo89761IL();
        }
        return interfaceC7158IL.mo89749bg();
    }

    /* renamed from: IL */
    private void m89838IL(int i, int i2, C7159bX c7159bX, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8 = c7159bX.f15423zx;
        float f = c7159bX.f15416VB;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 > i8) {
            return;
        }
        float f3 = (i8 - i3) / f;
        c7159bX.f15423zx = i4 + c7159bX.ldr;
        if (!z) {
            c7159bX.f15421iR = Integer.MIN_VALUE;
        }
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        float f4 = 0.0f;
        while (i9 < c7159bX.f15412Kg) {
            int i11 = c7159bX.f15413Lq + i9;
            View mo89784IL = this.eqN.mo89784IL(i11);
            if (mo89784IL == null || mo89784IL.getVisibility() == 8) {
                i5 = i8;
                i6 = i9;
            } else {
                InterfaceC7158IL interfaceC7158IL = (InterfaceC7158IL) mo89784IL.getLayoutParams();
                int flexDirection = this.eqN.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = mo89784IL.getMeasuredHeight();
                    long[] jArr = this.ldr;
                    if (jArr != null) {
                        measuredHeight = m89836IL(jArr[i11]);
                    }
                    int measuredWidth = mo89784IL.getMeasuredWidth();
                    long[] jArr2 = this.ldr;
                    if (jArr2 != null) {
                        measuredWidth = m89817bg(jArr2[i11]);
                    }
                    if (this.f15427zx[i11] || interfaceC7158IL.mo89743zx() <= f2) {
                        i5 = i8;
                        i6 = i9;
                    } else {
                        float mo89743zx = measuredHeight - (interfaceC7158IL.mo89743zx() * f3);
                        if (i9 == c7159bX.f15412Kg - 1) {
                            mo89743zx += f4;
                            f4 = f2;
                        }
                        int round = Math.round(mo89743zx);
                        if (round < interfaceC7158IL.mo89758Kg()) {
                            round = interfaceC7158IL.mo89758Kg();
                            this.f15427zx[i11] = true;
                            c7159bX.f15416VB -= interfaceC7158IL.mo89743zx();
                            i5 = i8;
                            i6 = i9;
                            z2 = true;
                        } else {
                            f4 += mo89743zx - round;
                            i5 = i8;
                            i6 = i9;
                            double d = f4;
                            if (d > 1.0d) {
                                round++;
                                f4 -= 1.0f;
                            } else if (d < -1.0d) {
                                round--;
                                f4 += 1.0f;
                            }
                        }
                        int m89819bg = m89819bg(i, interfaceC7158IL, c7159bX.f15415Ta);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        mo89784IL.measure(m89819bg, makeMeasureSpec);
                        measuredWidth = mo89784IL.getMeasuredWidth();
                        int measuredHeight2 = mo89784IL.getMeasuredHeight();
                        m89822bg(i11, m89819bg, makeMeasureSpec, mo89784IL);
                        measuredHeight = measuredHeight2;
                    }
                    i7 = Math.max(i10, measuredWidth + interfaceC7158IL.mo89755Ta() + interfaceC7158IL.mo89757Lq() + this.eqN.mo89770bg(mo89784IL));
                    c7159bX.f15423zx += measuredHeight + interfaceC7158IL.yDt() + interfaceC7158IL.mo89744vb();
                } else {
                    i5 = i8;
                    int i12 = i9;
                    int measuredWidth2 = mo89784IL.getMeasuredWidth();
                    long[] jArr3 = this.ldr;
                    if (jArr3 != null) {
                        measuredWidth2 = m89817bg(jArr3[i11]);
                    }
                    int measuredHeight3 = mo89784IL.getMeasuredHeight();
                    long[] jArr4 = this.ldr;
                    if (jArr4 != null) {
                        measuredHeight3 = m89836IL(jArr4[i11]);
                    }
                    if (this.f15427zx[i11] || interfaceC7158IL.mo89743zx() <= 0.0f) {
                        i6 = i12;
                    } else {
                        float mo89743zx2 = measuredWidth2 - (interfaceC7158IL.mo89743zx() * f3);
                        i6 = i12;
                        if (i6 == c7159bX.f15412Kg - 1) {
                            mo89743zx2 += f4;
                            f4 = 0.0f;
                        }
                        int round2 = Math.round(mo89743zx2);
                        if (round2 < interfaceC7158IL.mo89745iR()) {
                            round2 = interfaceC7158IL.mo89745iR();
                            this.f15427zx[i11] = true;
                            c7159bX.f15416VB -= interfaceC7158IL.mo89743zx();
                            z2 = true;
                        } else {
                            f4 += mo89743zx2 - round2;
                            double d2 = f4;
                            if (d2 > 1.0d) {
                                round2++;
                                f4 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                round2--;
                                f4 += 1.0f;
                            }
                        }
                        int m89837IL = m89837IL(i2, interfaceC7158IL, c7159bX.f15415Ta);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        mo89784IL.measure(makeMeasureSpec2, m89837IL);
                        int measuredWidth3 = mo89784IL.getMeasuredWidth();
                        int measuredHeight4 = mo89784IL.getMeasuredHeight();
                        m89822bg(i11, makeMeasureSpec2, m89837IL, mo89784IL);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int max = Math.max(i10, measuredHeight3 + interfaceC7158IL.yDt() + interfaceC7158IL.mo89744vb() + this.eqN.mo89770bg(mo89784IL));
                    c7159bX.f15423zx += measuredWidth2 + interfaceC7158IL.mo89755Ta() + interfaceC7158IL.mo89757Lq();
                    i7 = max;
                }
                c7159bX.f15421iR = Math.max(c7159bX.f15421iR, i7);
                i10 = i7;
            }
            i9 = i6 + 1;
            i8 = i5;
            f2 = 0.0f;
        }
        int i13 = i8;
        if (!z2 || i13 == c7159bX.f15423zx) {
            return;
        }
        m89838IL(i, i2, c7159bX, i3, i4, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m89806bg(C7164bg c7164bg, int i, int i2) {
        m89805bg(c7164bg, i, i2, Integer.MAX_VALUE, 0, -1, (List<C7159bX>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: bg */
    void m89805bg(C7164bg c7164bg, int i, int i2, int i3, int i4, int i5, List<C7159bX> list) {
        int i6;
        C7164bg c7164bg2;
        int i7;
        int i8;
        int i9;
        List<C7159bX> list2;
        int i10;
        View view;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i;
        int i19 = i2;
        int i20 = i5;
        boolean mo89777bg = this.eqN.mo89777bg();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        ArrayList arrayList = list == null ? new ArrayList() : list;
        c7164bg.f15431bg = arrayList;
        int i21 = i20 == -1 ? 1 : 0;
        int m89802bg = m89802bg(mo89777bg);
        int m89830IL = m89830IL(mo89777bg);
        int m89827bX = m89827bX(mo89777bg);
        int eqN = eqN(mo89777bg);
        C7159bX c7159bX = new C7159bX();
        int i22 = i4;
        c7159bX.f15413Lq = i22;
        int i23 = m89830IL + m89802bg;
        c7159bX.f15423zx = i23;
        int flexItemCount = this.eqN.getFlexItemCount();
        int i24 = i21;
        int i25 = Integer.MIN_VALUE;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (true) {
            if (i22 >= flexItemCount) {
                i6 = i27;
                c7164bg2 = c7164bg;
                break;
            }
            View mo89784IL = this.eqN.mo89784IL(i22);
            if (mo89784IL == null) {
                if (m89821bg(i22, flexItemCount, c7159bX)) {
                    m89803bg(arrayList, c7159bX, i22, i26);
                }
            } else if (mo89784IL.getVisibility() == 8) {
                c7159bX.f15417WR++;
                c7159bX.f15412Kg++;
                if (m89821bg(i22, flexItemCount, c7159bX)) {
                    m89803bg(arrayList, c7159bX, i22, i26);
                }
            } else {
                if (mo89784IL instanceof CompoundButton) {
                    m89808bg((CompoundButton) mo89784IL);
                }
                InterfaceC7158IL interfaceC7158IL = (InterfaceC7158IL) mo89784IL.getLayoutParams();
                int i29 = flexItemCount;
                if (interfaceC7158IL.ldr() == 4) {
                    c7159bX.yDt.add(Integer.valueOf(i22));
                }
                int m89807bg = m89807bg(interfaceC7158IL, mo89777bg);
                if (interfaceC7158IL.mo89756PX() != -1.0f && mode == 1073741824) {
                    m89807bg = Math.round(size * interfaceC7158IL.mo89756PX());
                }
                if (mo89777bg) {
                    int mo89774bg = this.eqN.mo89774bg(i18, i23 + m89828bX(interfaceC7158IL, true) + eqN(interfaceC7158IL, true), m89807bg);
                    i7 = size;
                    i8 = mode;
                    int mo89782IL = this.eqN.mo89782IL(i19, m89827bX + eqN + m89801zx(interfaceC7158IL, true) + ldr(interfaceC7158IL, true) + i26, m89832IL(interfaceC7158IL, true));
                    mo89784IL.measure(mo89774bg, mo89782IL);
                    m89822bg(i22, mo89774bg, mo89782IL, mo89784IL);
                    i9 = mo89774bg;
                } else {
                    i7 = size;
                    i8 = mode;
                    int mo89774bg2 = this.eqN.mo89774bg(i19, m89827bX + eqN + m89801zx(interfaceC7158IL, false) + ldr(interfaceC7158IL, false) + i26, m89832IL(interfaceC7158IL, false));
                    int mo89782IL2 = this.eqN.mo89782IL(i18, m89828bX(interfaceC7158IL, false) + i23 + eqN(interfaceC7158IL, false), m89807bg);
                    mo89784IL.measure(mo89774bg2, mo89782IL2);
                    m89822bg(i22, mo89774bg2, mo89782IL2, mo89784IL);
                    i9 = mo89782IL2;
                }
                m89815bg(mo89784IL, i22);
                i27 = View.combineMeasuredStates(i27, mo89784IL.getMeasuredState());
                int i30 = i26;
                int i31 = i23;
                C7159bX c7159bX2 = c7159bX;
                int i32 = i22;
                list2 = arrayList;
                int i33 = i9;
                if (m89813bg(mo89784IL, i8, i7, c7159bX.f15423zx, eqN(interfaceC7158IL, mo89777bg) + m89809bg(mo89784IL, mo89777bg) + m89828bX(interfaceC7158IL, mo89777bg), interfaceC7158IL, i32, i28, arrayList.size())) {
                    if (c7159bX2.m89844IL() > 0) {
                        m89803bg(list2, c7159bX2, i32 > 0 ? i32 - 1 : 0, i30);
                        i26 = c7159bX2.f15421iR + i30;
                    } else {
                        i26 = i30;
                    }
                    if (mo89777bg) {
                        if (interfaceC7158IL.mo89761IL() == -1) {
                            InterfaceC7160bg interfaceC7160bg = this.eqN;
                            i10 = i2;
                            i22 = i32;
                            view = mo89784IL;
                            view.measure(i33, interfaceC7160bg.mo89782IL(i10, interfaceC7160bg.getPaddingTop() + this.eqN.getPaddingBottom() + interfaceC7158IL.yDt() + interfaceC7158IL.mo89744vb() + i26, interfaceC7158IL.mo89761IL()));
                            m89815bg(view, i22);
                        } else {
                            i10 = i2;
                            view = mo89784IL;
                            i22 = i32;
                        }
                    } else {
                        i10 = i2;
                        view = mo89784IL;
                        i22 = i32;
                        if (interfaceC7158IL.mo89749bg() == -1) {
                            InterfaceC7160bg interfaceC7160bg2 = this.eqN;
                            view.measure(interfaceC7160bg2.mo89774bg(i10, interfaceC7160bg2.getPaddingLeft() + this.eqN.getPaddingRight() + interfaceC7158IL.mo89755Ta() + interfaceC7158IL.mo89757Lq() + i26, interfaceC7158IL.mo89749bg()), i33);
                            m89815bg(view, i22);
                        }
                    }
                    c7159bX = new C7159bX();
                    i12 = 1;
                    c7159bX.f15412Kg = 1;
                    i11 = i31;
                    c7159bX.f15423zx = i11;
                    c7159bX.f15413Lq = i22;
                    i14 = Integer.MIN_VALUE;
                    i13 = 0;
                } else {
                    i10 = i2;
                    view = mo89784IL;
                    i22 = i32;
                    c7159bX = c7159bX2;
                    i11 = i31;
                    i12 = 1;
                    c7159bX.f15412Kg++;
                    i13 = i28 + 1;
                    i26 = i30;
                    i14 = i25;
                }
                c7159bX.xxp = (c7159bX.xxp ? 1 : 0) | (interfaceC7158IL.eqN() != 0.0f ? i12 : 0);
                c7159bX.VzQ = (c7159bX.VzQ ? 1 : 0) | (interfaceC7158IL.mo89743zx() != 0.0f ? i12 : 0);
                int[] iArr = this.f15426bg;
                if (iArr != null) {
                    iArr[i22] = list2.size();
                }
                c7159bX.f15423zx += m89809bg(view, mo89777bg) + m89828bX(interfaceC7158IL, mo89777bg) + eqN(interfaceC7158IL, mo89777bg);
                c7159bX.f15420eo += interfaceC7158IL.eqN();
                c7159bX.f15416VB += interfaceC7158IL.mo89743zx();
                this.eqN.mo89768bg(view, i22, i13, c7159bX);
                int max = Math.max(i14, m89833IL(view, mo89777bg) + m89801zx(interfaceC7158IL, mo89777bg) + ldr(interfaceC7158IL, mo89777bg) + this.eqN.mo89770bg(view));
                c7159bX.f15421iR = Math.max(c7159bX.f15421iR, max);
                if (mo89777bg) {
                    if (this.eqN.getFlexWrap() != 2) {
                        c7159bX.f15414PX = Math.max(c7159bX.f15414PX, view.getBaseline() + interfaceC7158IL.yDt());
                    } else {
                        c7159bX.f15414PX = Math.max(c7159bX.f15414PX, (view.getMeasuredHeight() - view.getBaseline()) + interfaceC7158IL.mo89744vb());
                    }
                }
                i15 = i29;
                if (m89821bg(i22, i15, c7159bX)) {
                    m89803bg(list2, c7159bX, i22, i26);
                    i26 += c7159bX.f15421iR;
                }
                i16 = i5;
                if (i16 == -1 || list2.size() <= 0 || list2.get(list2.size() - i12).f15422vb < i16 || i22 < i16 || i24 != 0) {
                    i17 = i3;
                } else {
                    i26 = -c7159bX.m89843bg();
                    i17 = i3;
                    i24 = i12;
                }
                if (i26 > i17 && i24 != 0) {
                    c7164bg2 = c7164bg;
                    i6 = i27;
                    break;
                }
                i28 = i13;
                i25 = max;
                i22++;
                i18 = i;
                flexItemCount = i15;
                i19 = i10;
                i23 = i11;
                arrayList = list2;
                size = i7;
                i20 = i16;
                mode = i8;
            }
            i7 = size;
            i8 = mode;
            i10 = i19;
            i16 = i20;
            list2 = arrayList;
            i11 = i23;
            i15 = flexItemCount;
            i22++;
            i18 = i;
            flexItemCount = i15;
            i19 = i10;
            i23 = i11;
            arrayList = list2;
            size = i7;
            i20 = i16;
            mode = i8;
        }
        c7164bg2.f15430IL = i6;
    }

    /* renamed from: IL */
    private int m89837IL(int i, InterfaceC7158IL interfaceC7158IL, int i2) {
        InterfaceC7160bg interfaceC7160bg = this.eqN;
        int mo89782IL = interfaceC7160bg.mo89782IL(i, interfaceC7160bg.getPaddingTop() + this.eqN.getPaddingBottom() + interfaceC7158IL.yDt() + interfaceC7158IL.mo89744vb() + i2, interfaceC7158IL.mo89761IL());
        int size = View.MeasureSpec.getSize(mo89782IL);
        if (size > interfaceC7158IL.mo89746eo()) {
            return View.MeasureSpec.makeMeasureSpec(interfaceC7158IL.mo89746eo(), View.MeasureSpec.getMode(mo89782IL));
        }
        return size < interfaceC7158IL.mo89758Kg() ? View.MeasureSpec.makeMeasureSpec(interfaceC7158IL.mo89758Kg(), View.MeasureSpec.getMode(mo89782IL)) : mo89782IL;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public void m89839IL(int i, int i2, int i3) {
        int i4;
        int i5;
        int flexDirection = this.eqN.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (flexDirection != 2 && flexDirection != 3) {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
        } else {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        }
        List<C7159bX> flexLinesInternal = this.eqN.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.eqN.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f15421iR = i5 - i3;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.eqN.getAlignContent();
                if (alignContent == 1) {
                    int i7 = i5 - sumOfCrossSize;
                    C7159bX c7159bX = new C7159bX();
                    c7159bX.f15421iR = i7;
                    flexLinesInternal.add(0, c7159bX);
                } else if (alignContent == 2) {
                    this.eqN.setFlexLines(m89804bg(flexLinesInternal, i5, sumOfCrossSize));
                } else if (alignContent == 3) {
                    if (sumOfCrossSize < i5) {
                        float size2 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size3 = flexLinesInternal.size();
                        float f = 0.0f;
                        while (i6 < size3) {
                            arrayList.add(flexLinesInternal.get(i6));
                            if (i6 != flexLinesInternal.size() - 1) {
                                C7159bX c7159bX2 = new C7159bX();
                                if (i6 == flexLinesInternal.size() - 2) {
                                    c7159bX2.f15421iR = Math.round(f + size2);
                                    f = 0.0f;
                                } else {
                                    c7159bX2.f15421iR = Math.round(size2);
                                }
                                int i8 = c7159bX2.f15421iR;
                                f += size2 - i8;
                                if (f > 1.0f) {
                                    c7159bX2.f15421iR = i8 + 1;
                                    f -= 1.0f;
                                } else if (f < -1.0f) {
                                    c7159bX2.f15421iR = i8 - 1;
                                    f += 1.0f;
                                }
                                arrayList.add(c7159bX2);
                            }
                            i6++;
                        }
                        this.eqN.setFlexLines(arrayList);
                    }
                } else if (alignContent == 4) {
                    if (sumOfCrossSize >= i5) {
                        this.eqN.setFlexLines(m89804bg(flexLinesInternal, i5, sumOfCrossSize));
                        return;
                    }
                    int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    C7159bX c7159bX3 = new C7159bX();
                    c7159bX3.f15421iR = size4;
                    for (C7159bX c7159bX4 : flexLinesInternal) {
                        arrayList2.add(c7159bX3);
                        arrayList2.add(c7159bX4);
                        arrayList2.add(c7159bX3);
                    }
                    this.eqN.setFlexLines(arrayList2);
                } else if (alignContent == 5 && sumOfCrossSize < i5) {
                    float size5 = (i5 - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f2 = 0.0f;
                    while (i6 < size6) {
                        C7159bX c7159bX5 = flexLinesInternal.get(i6);
                        float f3 = c7159bX5.f15421iR + size5;
                        if (i6 == flexLinesInternal.size() - 1) {
                            f3 += f2;
                            f2 = 0.0f;
                        }
                        int round = Math.round(f3);
                        f2 += f3 - round;
                        if (f2 > 1.0f) {
                            round++;
                            f2 -= 1.0f;
                        } else if (f2 < -1.0f) {
                            round--;
                            f2 += 1.0f;
                        }
                        c7159bX5.f15421iR = round;
                        i6++;
                    }
                }
            }
        }
    }

    /* renamed from: bg */
    private void m89808bg(CompoundButton compoundButton) {
        InterfaceC7158IL interfaceC7158IL = (InterfaceC7158IL) compoundButton.getLayoutParams();
        int mo89745iR = interfaceC7158IL.mo89745iR();
        int mo89758Kg = interfaceC7158IL.mo89758Kg();
        Drawable m89985bg = C7123zx.m89985bg(compoundButton);
        int minimumWidth = m89985bg == null ? 0 : m89985bg.getMinimumWidth();
        int minimumHeight = m89985bg != null ? m89985bg.getMinimumHeight() : 0;
        if (mo89745iR == -1) {
            mo89745iR = minimumWidth;
        }
        interfaceC7158IL.mo89747bg(mo89745iR);
        if (mo89758Kg == -1) {
            mo89758Kg = minimumHeight;
        }
        interfaceC7158IL.mo89759IL(mo89758Kg);
    }

    /* renamed from: bg */
    private int m89802bg(boolean z) {
        if (z) {
            return this.eqN.getPaddingStart();
        }
        return this.eqN.getPaddingTop();
    }

    /* renamed from: bg */
    private int m89809bg(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: IL */
    private void m89834IL(View view, int i, int i2) {
        int measuredHeight;
        InterfaceC7158IL interfaceC7158IL = (InterfaceC7158IL) view.getLayoutParams();
        int min = Math.min(Math.max(((i - interfaceC7158IL.mo89755Ta()) - interfaceC7158IL.mo89757Lq()) - this.eqN.mo89770bg(view), interfaceC7158IL.mo89745iR()), interfaceC7158IL.mo89753WR());
        long[] jArr = this.ldr;
        if (jArr != null) {
            measuredHeight = m89836IL(jArr[i2]);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        m89822bg(i2, makeMeasureSpec2, makeMeasureSpec, view);
    }

    /* renamed from: bg */
    private int m89807bg(InterfaceC7158IL interfaceC7158IL, boolean z) {
        if (z) {
            return interfaceC7158IL.mo89749bg();
        }
        return interfaceC7158IL.mo89761IL();
    }

    /* renamed from: bg */
    private boolean m89813bg(View view, int i, int i2, int i3, int i4, InterfaceC7158IL interfaceC7158IL, int i5, int i6, int i7) {
        if (this.eqN.getFlexWrap() == 0) {
            return false;
        }
        if (interfaceC7158IL.mo89754VB()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int maxLine = this.eqN.getMaxLine();
        if (maxLine == -1 || maxLine > i7 + 1) {
            int mo89769bg = this.eqN.mo89769bg(view, i5, i6);
            if (mo89769bg > 0) {
                i4 += mo89769bg;
            }
            return i2 < i3 + i4;
        }
        return false;
    }

    /* renamed from: bg */
    private boolean m89821bg(int i, int i2, C7159bX c7159bX) {
        return i == i2 - 1 && c7159bX.m89844IL() != 0;
    }

    /* renamed from: bg */
    private void m89803bg(List<C7159bX> list, C7159bX c7159bX, int i, int i2) {
        c7159bX.f15415Ta = i2;
        this.eqN.mo89766bg(c7159bX);
        c7159bX.f15422vb = i;
        list.add(c7159bX);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m89815bg(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.bytedance.adsdk.ugeno.zx.IL r0 = (com.bytedance.adsdk.ugeno.p227zx.InterfaceC7158IL) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.mo89745iR()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.mo89745iR()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.mo89753WR()
            if (r1 <= r3) goto L26
            int r1 = r0.mo89753WR()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.mo89758Kg()
            if (r2 >= r5) goto L32
            int r2 = r0.mo89758Kg()
            goto L3e
        L32:
            int r5 = r0.mo89746eo()
            if (r2 <= r5) goto L3d
            int r2 = r0.mo89746eo()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L50
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.m89822bg(r8, r1, r0, r7)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.p227zx.C7161eqN.m89815bg(android.view.View, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m89824bg(int i, int i2) {
        m89823bg(i, i2, 0);
    }

    /* renamed from: bg */
    void m89823bg(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        m89829bX(this.eqN.getFlexItemCount());
        if (i3 >= this.eqN.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.eqN.getFlexDirection();
        int flexDirection2 = this.eqN.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.eqN.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = this.eqN.getPaddingLeft();
            paddingRight = this.eqN.getPaddingRight();
        } else if (flexDirection2 != 2 && flexDirection2 != 3) {
            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
        } else {
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = this.eqN.getLargestMainSize();
            }
            paddingLeft = this.eqN.getPaddingTop();
            paddingRight = this.eqN.getPaddingBottom();
        }
        int i4 = paddingLeft + paddingRight;
        int[] iArr = this.f15426bg;
        List<C7159bX> flexLinesInternal = this.eqN.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size2; i5++) {
            C7159bX c7159bX = flexLinesInternal.get(i5);
            int i6 = c7159bX.f15423zx;
            if (i6 < size && c7159bX.xxp) {
                m89820bg(i, i2, c7159bX, size, i4, false);
            } else if (i6 > size && c7159bX.VzQ) {
                m89838IL(i, i2, c7159bX, size, i4, false);
            }
        }
    }

    /* renamed from: bg */
    private void m89820bg(int i, int i2, C7159bX c7159bX, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        int i8;
        double d2;
        float f = c7159bX.f15420eo;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 < (i5 = c7159bX.f15423zx)) {
            return;
        }
        float f3 = (i3 - i5) / f;
        c7159bX.f15423zx = i4 + c7159bX.ldr;
        if (!z) {
            c7159bX.f15421iR = Integer.MIN_VALUE;
        }
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        float f4 = 0.0f;
        while (i9 < c7159bX.f15412Kg) {
            int i11 = c7159bX.f15413Lq + i9;
            View mo89784IL = this.eqN.mo89784IL(i11);
            if (mo89784IL == null || mo89784IL.getVisibility() == 8) {
                i6 = i5;
            } else {
                InterfaceC7158IL interfaceC7158IL = (InterfaceC7158IL) mo89784IL.getLayoutParams();
                int flexDirection = this.eqN.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = mo89784IL.getMeasuredHeight();
                    long[] jArr = this.ldr;
                    if (jArr != null) {
                        measuredHeight = m89836IL(jArr[i11]);
                    }
                    int measuredWidth = mo89784IL.getMeasuredWidth();
                    long[] jArr2 = this.ldr;
                    if (jArr2 != null) {
                        measuredWidth = m89817bg(jArr2[i11]);
                    }
                    if (this.f15427zx[i11] || interfaceC7158IL.eqN() <= f2) {
                        i8 = i5;
                    } else {
                        float eqN = measuredHeight + (interfaceC7158IL.eqN() * f3);
                        if (i9 == c7159bX.f15412Kg - 1) {
                            eqN += f4;
                            f4 = f2;
                        }
                        int round = Math.round(eqN);
                        if (round > interfaceC7158IL.mo89746eo()) {
                            round = interfaceC7158IL.mo89746eo();
                            this.f15427zx[i11] = true;
                            c7159bX.f15420eo -= interfaceC7158IL.eqN();
                            i8 = i5;
                            z2 = true;
                        } else {
                            f4 += eqN - round;
                            i8 = i5;
                            double d3 = f4;
                            if (d3 > 1.0d) {
                                round++;
                                d2 = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                round--;
                                d2 = d3 + 1.0d;
                            }
                            f4 = (float) d2;
                        }
                        int m89819bg = m89819bg(i, interfaceC7158IL, c7159bX.f15415Ta);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        mo89784IL.measure(m89819bg, makeMeasureSpec);
                        measuredWidth = mo89784IL.getMeasuredWidth();
                        int measuredHeight2 = mo89784IL.getMeasuredHeight();
                        m89822bg(i11, m89819bg, makeMeasureSpec, mo89784IL);
                        measuredHeight = measuredHeight2;
                    }
                    i7 = Math.max(i10, measuredWidth + interfaceC7158IL.mo89755Ta() + interfaceC7158IL.mo89757Lq() + this.eqN.mo89770bg(mo89784IL));
                    c7159bX.f15423zx += measuredHeight + interfaceC7158IL.yDt() + interfaceC7158IL.mo89744vb();
                    i6 = i8;
                } else {
                    int i12 = i5;
                    int measuredWidth2 = mo89784IL.getMeasuredWidth();
                    long[] jArr3 = this.ldr;
                    if (jArr3 != null) {
                        measuredWidth2 = m89817bg(jArr3[i11]);
                    }
                    int measuredHeight3 = mo89784IL.getMeasuredHeight();
                    long[] jArr4 = this.ldr;
                    i6 = i12;
                    if (jArr4 != null) {
                        measuredHeight3 = m89836IL(jArr4[i11]);
                    }
                    if (!this.f15427zx[i11] && interfaceC7158IL.eqN() > 0.0f) {
                        float eqN2 = measuredWidth2 + (interfaceC7158IL.eqN() * f3);
                        if (i9 == c7159bX.f15412Kg - 1) {
                            eqN2 += f4;
                            f4 = 0.0f;
                        }
                        int round2 = Math.round(eqN2);
                        if (round2 > interfaceC7158IL.mo89753WR()) {
                            round2 = interfaceC7158IL.mo89753WR();
                            this.f15427zx[i11] = true;
                            c7159bX.f15420eo -= interfaceC7158IL.eqN();
                            z2 = true;
                        } else {
                            f4 += eqN2 - round2;
                            double d4 = f4;
                            if (d4 > 1.0d) {
                                round2++;
                                d = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                round2--;
                                d = d4 + 1.0d;
                            }
                            f4 = (float) d;
                        }
                        int m89837IL = m89837IL(i2, interfaceC7158IL, c7159bX.f15415Ta);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        mo89784IL.measure(makeMeasureSpec2, m89837IL);
                        int measuredWidth3 = mo89784IL.getMeasuredWidth();
                        int measuredHeight4 = mo89784IL.getMeasuredHeight();
                        m89822bg(i11, makeMeasureSpec2, m89837IL, mo89784IL);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int max = Math.max(i10, measuredHeight3 + interfaceC7158IL.yDt() + interfaceC7158IL.mo89744vb() + this.eqN.mo89770bg(mo89784IL));
                    c7159bX.f15423zx += measuredWidth2 + interfaceC7158IL.mo89755Ta() + interfaceC7158IL.mo89757Lq();
                    i7 = max;
                }
                c7159bX.f15421iR = Math.max(c7159bX.f15421iR, i7);
                i10 = i7;
            }
            i9++;
            i5 = i6;
            f2 = 0.0f;
        }
        int i13 = i5;
        if (!z2 || i13 == c7159bX.f15423zx) {
            return;
        }
        m89820bg(i, i2, c7159bX, i3, i4, true);
    }

    /* renamed from: bg */
    private int m89819bg(int i, InterfaceC7158IL interfaceC7158IL, int i2) {
        InterfaceC7160bg interfaceC7160bg = this.eqN;
        int mo89774bg = interfaceC7160bg.mo89774bg(i, interfaceC7160bg.getPaddingLeft() + this.eqN.getPaddingRight() + interfaceC7158IL.mo89755Ta() + interfaceC7158IL.mo89757Lq() + i2, interfaceC7158IL.mo89749bg());
        int size = View.MeasureSpec.getSize(mo89774bg);
        if (size > interfaceC7158IL.mo89753WR()) {
            return View.MeasureSpec.makeMeasureSpec(interfaceC7158IL.mo89753WR(), View.MeasureSpec.getMode(mo89774bg));
        }
        return size < interfaceC7158IL.mo89745iR() ? View.MeasureSpec.makeMeasureSpec(interfaceC7158IL.mo89745iR(), View.MeasureSpec.getMode(mo89774bg)) : mo89774bg;
    }

    /* renamed from: bg */
    private List<C7159bX> m89804bg(List<C7159bX> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        C7159bX c7159bX = new C7159bX();
        c7159bX.f15421iR = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(c7159bX);
            }
            arrayList.add(list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(c7159bX);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m89826bg() {
        m89825bg(0);
    }

    /* renamed from: bg */
    void m89825bg(int i) {
        View mo89784IL;
        if (i >= this.eqN.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.eqN.getFlexDirection();
        if (this.eqN.getAlignItems() == 4) {
            int[] iArr = this.f15426bg;
            List<C7159bX> flexLinesInternal = this.eqN.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                C7159bX c7159bX = flexLinesInternal.get(i2);
                int i3 = c7159bX.f15412Kg;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = c7159bX.f15413Lq + i4;
                    if (i4 < this.eqN.getFlexItemCount() && (mo89784IL = this.eqN.mo89784IL(i5)) != null && mo89784IL.getVisibility() != 8) {
                        InterfaceC7158IL interfaceC7158IL = (InterfaceC7158IL) mo89784IL.getLayoutParams();
                        if (interfaceC7158IL.ldr() == -1 || interfaceC7158IL.ldr() == 4) {
                            if (flexDirection == 0 || flexDirection == 1) {
                                m89814bg(mo89784IL, c7159bX.f15421iR, i5);
                            } else if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                            } else {
                                m89834IL(mo89784IL, c7159bX.f15421iR, i5);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (C7159bX c7159bX2 : this.eqN.getFlexLinesInternal()) {
            for (Integer num : c7159bX2.yDt) {
                View mo89784IL2 = this.eqN.mo89784IL(num.intValue());
                if (flexDirection == 0 || flexDirection == 1) {
                    m89814bg(mo89784IL2, c7159bX2.f15421iR, num.intValue());
                } else if (flexDirection != 2 && flexDirection != 3) {
                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                } else {
                    m89834IL(mo89784IL2, c7159bX2.f15421iR, num.intValue());
                }
            }
        }
    }

    /* renamed from: bg */
    private void m89814bg(View view, int i, int i2) {
        int measuredWidth;
        InterfaceC7158IL interfaceC7158IL = (InterfaceC7158IL) view.getLayoutParams();
        int min = Math.min(Math.max(((i - interfaceC7158IL.yDt()) - interfaceC7158IL.mo89744vb()) - this.eqN.mo89770bg(view), interfaceC7158IL.mo89758Kg()), interfaceC7158IL.mo89746eo());
        long[] jArr = this.ldr;
        if (jArr != null) {
            measuredWidth = m89817bg(jArr[i2]);
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        m89822bg(i2, makeMeasureSpec, makeMeasureSpec2, view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m89811bg(View view, C7159bX c7159bX, int i, int i2, int i3, int i4) {
        InterfaceC7158IL interfaceC7158IL = (InterfaceC7158IL) view.getLayoutParams();
        int alignItems = this.eqN.getAlignItems();
        if (interfaceC7158IL.ldr() != -1) {
            alignItems = interfaceC7158IL.ldr();
        }
        int i5 = c7159bX.f15421iR;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.eqN.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - interfaceC7158IL.mo89744vb(), i3, i6 - interfaceC7158IL.mo89744vb());
                    return;
                }
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + interfaceC7158IL.yDt(), i3, (i4 - i5) + view.getMeasuredHeight() + interfaceC7158IL.yDt());
                return;
            } else if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + interfaceC7158IL.yDt()) - interfaceC7158IL.mo89744vb()) / 2;
                if (this.eqN.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                }
                int i8 = i2 - measuredHeight;
                view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                return;
            } else if (alignItems == 3) {
                if (this.eqN.getFlexWrap() != 2) {
                    int max = Math.max(c7159bX.f15414PX - view.getBaseline(), interfaceC7158IL.yDt());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                }
                int max2 = Math.max((c7159bX.f15414PX - view.getMeasuredHeight()) + view.getBaseline(), interfaceC7158IL.mo89744vb());
                view.layout(i, i2 - max2, i3, i4 - max2);
                return;
            } else if (alignItems != 4) {
                return;
            }
        }
        if (this.eqN.getFlexWrap() != 2) {
            view.layout(i, i2 + interfaceC7158IL.yDt(), i3, i4 + interfaceC7158IL.yDt());
        } else {
            view.layout(i, i2 - interfaceC7158IL.mo89744vb(), i3, i4 - interfaceC7158IL.mo89744vb());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m89810bg(View view, C7159bX c7159bX, boolean z, int i, int i2, int i3, int i4) {
        InterfaceC7158IL interfaceC7158IL = (InterfaceC7158IL) view.getLayoutParams();
        int alignItems = this.eqN.getAlignItems();
        if (interfaceC7158IL.ldr() != -1) {
            alignItems = interfaceC7158IL.ldr();
        }
        int i5 = c7159bX.f15421iR;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - interfaceC7158IL.mo89757Lq(), i2, ((i3 + i5) - view.getMeasuredWidth()) - interfaceC7158IL.mo89757Lq(), i4);
                    return;
                } else {
                    view.layout((i - i5) + view.getMeasuredWidth() + interfaceC7158IL.mo89755Ta(), i2, (i3 - i5) + view.getMeasuredWidth() + interfaceC7158IL.mo89755Ta(), i4);
                    return;
                }
            } else if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + C7122ldr.m89986bg(marginLayoutParams)) - C7122ldr.m89987IL(marginLayoutParams)) / 2;
                if (!z) {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                } else {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    return;
                }
            } else if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z) {
            view.layout(i + interfaceC7158IL.mo89755Ta(), i2, i3 + interfaceC7158IL.mo89755Ta(), i4);
        } else {
            view.layout(i - interfaceC7158IL.mo89757Lq(), i2, i3 - interfaceC7158IL.mo89757Lq(), i4);
        }
    }

    /* renamed from: bg */
    private void m89822bg(int i, int i2, int i3, View view) {
        long[] jArr = this.f15425IL;
        if (jArr != null) {
            jArr[i] = m89840IL(i2, i3);
        }
        long[] jArr2 = this.ldr;
        if (jArr2 != null) {
            jArr2[i] = m89840IL(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }
}
