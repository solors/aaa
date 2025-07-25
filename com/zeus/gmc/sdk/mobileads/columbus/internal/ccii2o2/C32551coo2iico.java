package com.zeus.gmc.sdk.mobileads.columbus.internal.ccii2o2;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ccii2o2.C32544coi222o222;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccii2o2.coo2iico */
/* loaded from: classes8.dex */
public final class C32551coo2iico {
    private static final Comparator<C32552coi222o222> c2oicci2 = new C32553coo2iico();
    private static final int ccoc2oic = 5;
    static final int cicc2iiccc = -1;
    static final int cicic = -2;
    private static final String cii2c2 = "ColorCutQuantizer";
    private static final boolean ciii2coi2 = false;
    static final int coiic = -3;
    private static final int coiio2 = 31;
    final List<C32544coi222o222.C32546c2oc2o> c2oc2i;
    final C32544coi222o222.InterfaceC32545c2oc2i[] c2oc2o;
    final int[] coi222o222;
    final int[] coo2iico;
    @Nullable
    final TimingLogger cioccoiococ = null;
    private final float[] cco22 = new float[3];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccii2o2.coo2iico$coi222o222 */
    /* loaded from: classes8.dex */
    public class C32552coi222o222 {
        private int c2oc2i;
        private int c2oc2o;
        private int cco22;
        private int cii2c2;
        private int ciii2coi2;
        private int cioccoiococ;
        private int coi222o222;
        private int coiic;
        private int coo2iico;

        C32552coi222o222(int i, int i2) {
            this.coo2iico = i;
            this.coi222o222 = i2;
            c2oc2i();
        }

        final void c2oc2i() {
            C32551coo2iico c32551coo2iico = C32551coo2iico.this;
            int[] iArr = c32551coo2iico.coo2iico;
            int[] iArr2 = c32551coo2iico.coi222o222;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = this.coo2iico; i8 <= this.coi222o222; i8++) {
                int i9 = iArr[i8];
                i5 += iArr2[i9];
                int cco22 = C32551coo2iico.cco22(i9);
                int c2oc2o = C32551coo2iico.c2oc2o(i9);
                int cioccoiococ = C32551coo2iico.cioccoiococ(i9);
                if (cco22 > i2) {
                    i2 = cco22;
                }
                if (cco22 < i) {
                    i = cco22;
                }
                if (c2oc2o > i3) {
                    i3 = c2oc2o;
                }
                if (c2oc2o < i6) {
                    i6 = c2oc2o;
                }
                if (cioccoiococ > i4) {
                    i4 = cioccoiococ;
                }
                if (cioccoiococ < i7) {
                    i7 = cioccoiococ;
                }
            }
            this.cioccoiococ = i;
            this.c2oc2o = i2;
            this.cco22 = i6;
            this.cii2c2 = i3;
            this.ciii2coi2 = i7;
            this.coiic = i4;
            this.c2oc2i = i5;
        }

        final int c2oc2o() {
            return (this.coi222o222 + 1) - this.coo2iico;
        }

        final int cco22() {
            int i = this.c2oc2o - this.cioccoiococ;
            int i2 = this.cii2c2 - this.cco22;
            int i3 = this.coiic - this.ciii2coi2;
            if (i >= i2 && i >= i3) {
                return -3;
            }
            if (i2 >= i && i2 >= i3) {
                return -2;
            }
            return -1;
        }

        final int cii2c2() {
            return ((this.c2oc2o - this.cioccoiococ) + 1) * ((this.cii2c2 - this.cco22) + 1) * ((this.coiic - this.ciii2coi2) + 1);
        }

        final C32552coi222o222 ciii2coi2() {
            if (coo2iico()) {
                int coi222o222 = coi222o222();
                C32551coo2iico c32551coo2iico = C32551coo2iico.this;
                Objects.requireNonNull(c32551coo2iico);
                C32552coi222o222 c32552coi222o222 = new C32552coi222o222(coi222o222 + 1, this.coi222o222);
                this.coi222o222 = coi222o222;
                c2oc2i();
                return c32552coi222o222;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }

        final C32544coi222o222.C32546c2oc2o cioccoiococ() {
            C32551coo2iico c32551coo2iico = C32551coo2iico.this;
            int[] iArr = c32551coo2iico.coo2iico;
            int[] iArr2 = c32551coo2iico.coi222o222;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.coo2iico; i5 <= this.coi222o222; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i4 += i7;
                i3 += C32551coo2iico.cco22(i6) * i7;
                i2 += C32551coo2iico.c2oc2o(i6) * i7;
                i += i7 * C32551coo2iico.cioccoiococ(i6);
            }
            float f = i4;
            return new C32544coi222o222.C32546c2oc2o(C32551coo2iico.coo2iico(Math.round(i3 / f), Math.round(i2 / f), Math.round(i / f)), i4);
        }

        final int coi222o222() {
            int cco22 = cco22();
            C32551coo2iico c32551coo2iico = C32551coo2iico.this;
            int[] iArr = c32551coo2iico.coo2iico;
            int[] iArr2 = c32551coo2iico.coi222o222;
            C32551coo2iico.coo2iico(iArr, cco22, this.coo2iico, this.coi222o222);
            Arrays.sort(iArr, this.coo2iico, this.coi222o222 + 1);
            C32551coo2iico.coo2iico(iArr, cco22, this.coo2iico, this.coi222o222);
            int i = this.c2oc2i / 2;
            int i2 = this.coo2iico;
            int i3 = 0;
            while (true) {
                int i4 = this.coi222o222;
                if (i2 <= i4) {
                    i3 += iArr2[iArr[i2]];
                    if (i3 >= i) {
                        return Math.min(i4 - 1, i2);
                    }
                    i2++;
                } else {
                    return this.coo2iico;
                }
            }
        }

        final boolean coo2iico() {
            if (c2oc2o() > 1) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ccii2o2.coo2iico$coo2iico */
    /* loaded from: classes8.dex */
    class C32553coo2iico implements Comparator<C32552coi222o222> {
        C32553coo2iico() {
        }

        @Override // java.util.Comparator
        /* renamed from: coo2iico */
        public int compare(C32552coi222o222 c32552coi222o222, C32552coi222o222 c32552coi222o2222) {
            return c32552coi222o2222.cii2c2() - c32552coi222o222.cii2c2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C32551coo2iico(int[] iArr, int i, C32544coi222o222.InterfaceC32545c2oc2i[] interfaceC32545c2oc2iArr) {
        this.c2oc2o = interfaceC32545c2oc2iArr;
        int[] iArr2 = new int[32768];
        this.coi222o222 = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int coi222o222 = coi222o222(iArr[i2]);
            iArr[i2] = coi222o222;
            iArr2[coi222o222] = iArr2[coi222o222] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 32768; i4++) {
            if (iArr2[i4] > 0 && cii2c2(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.coo2iico = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < 32768; i6++) {
            if (iArr2[i6] > 0) {
                iArr3[i5] = i6;
                i5++;
            }
        }
        if (i3 <= i) {
            this.c2oc2i = new ArrayList();
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = iArr3[i7];
                this.c2oc2i.add(new C32544coi222o222.C32546c2oc2o(coo2iico(i8), iArr2[i8]));
            }
            return;
        }
        this.c2oc2i = c2oc2i(i);
    }

    private List<C32544coi222o222.C32546c2oc2o> c2oc2i(int i) {
        PriorityQueue<C32552coi222o222> priorityQueue = new PriorityQueue<>(i, c2oicci2);
        priorityQueue.offer(new C32552coi222o222(0, this.coo2iico.length - 1));
        coo2iico(priorityQueue, i);
        return coo2iico(priorityQueue);
    }

    static int c2oc2o(int i) {
        return (i >> 5) & 31;
    }

    static int cco22(int i) {
        return (i >> 10) & 31;
    }

    private boolean cii2c2(int i) {
        int coo2iico = coo2iico(i);
        ColorUtils.colorToHSL(coo2iico, this.cco22);
        return coo2iico(coo2iico, this.cco22);
    }

    static int cioccoiococ(int i) {
        return i & 31;
    }

    private static int coi222o222(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<C32544coi222o222.C32546c2oc2o> coo2iico() {
        return this.c2oc2i;
    }

    private static int coi222o222(int i) {
        return coi222o222(Color.blue(i), 8, 5) | (coi222o222(Color.red(i), 8, 5) << 10) | (coi222o222(Color.green(i), 8, 5) << 5);
    }

    private void coo2iico(PriorityQueue<C32552coi222o222> priorityQueue, int i) {
        C32552coi222o222 poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.coo2iico()) {
            priorityQueue.offer(poll.ciii2coi2());
            priorityQueue.offer(poll);
        }
    }

    private List<C32544coi222o222.C32546c2oc2o> coo2iico(Collection<C32552coi222o222> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C32552coi222o222 c32552coi222o222 : collection) {
            C32544coi222o222.C32546c2oc2o cioccoiococ = c32552coi222o222.cioccoiococ();
            if (!coo2iico(cioccoiococ)) {
                arrayList.add(cioccoiococ);
            }
        }
        return arrayList;
    }

    static void coo2iico(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = cioccoiococ(i4) | (c2oc2o(i4) << 10) | (cco22(i4) << 5);
                i2++;
            }
        } else if (i != -1) {
        } else {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = cco22(i5) | (cioccoiococ(i5) << 10) | (c2oc2o(i5) << 5);
                i2++;
            }
        }
    }

    private boolean coo2iico(C32544coi222o222.C32546c2oc2o c32546c2oc2o) {
        return coo2iico(c32546c2oc2o.c2oc2o(), c32546c2oc2o.c2oc2i());
    }

    private boolean coo2iico(int i, float[] fArr) {
        C32544coi222o222.InterfaceC32545c2oc2i[] interfaceC32545c2oc2iArr = this.c2oc2o;
        if (interfaceC32545c2oc2iArr != null && interfaceC32545c2oc2iArr.length > 0) {
            int length = interfaceC32545c2oc2iArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.c2oc2o[i2].coo2iico(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    static int coo2iico(int i, int i2, int i3) {
        return Color.rgb(coi222o222(i, 5, 8), coi222o222(i2, 5, 8), coi222o222(i3, 5, 8));
    }

    private static int coo2iico(int i) {
        return coo2iico(cco22(i), c2oc2o(i), cioccoiococ(i));
    }
}
