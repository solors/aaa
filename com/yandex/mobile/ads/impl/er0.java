package com.yandex.mobile.ads.impl;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.oh0;
import com.yandex.mobile.ads.impl.vt0;
import com.yandex.mobile.ads.impl.w12;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class er0 extends c12 {

    /* renamed from: com.yandex.mobile.ads.impl.er0$a */
    /* loaded from: classes8.dex */
    public static final class C30267a {

        /* renamed from: a */
        private final int f78759a;

        /* renamed from: b */
        private final int[] f78760b;

        /* renamed from: c */
        private final w02[] f78761c;

        /* renamed from: d */
        private final int[] f78762d;

        /* renamed from: e */
        private final int[][][] f78763e;

        /* renamed from: f */
        private final w02 f78764f;

        @VisibleForTesting
        C30267a(int[] iArr, w02[] w02VarArr, int[] iArr2, int[][][] iArr3, w02 w02Var) {
            this.f78760b = iArr;
            this.f78761c = w02VarArr;
            this.f78763e = iArr3;
            this.f78762d = iArr2;
            this.f78764f = w02Var;
            this.f78759a = iArr.length;
        }

        /* renamed from: a */
        public final int m34458a(int i, int i2) {
            int i3 = this.f78761c[i].m28081a(i2).f86517b;
            int[] iArr = new int[i3];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                if (m34457a(i, i2, i6) == 4) {
                    iArr[i5] = i6;
                    i5++;
                }
            }
            int[] copyOf = Arrays.copyOf(iArr, i5);
            int i7 = 16;
            int i8 = 0;
            String str = null;
            boolean z = false;
            while (i4 < copyOf.length) {
                String str2 = this.f78761c[i].m28081a(i2).m28579a(copyOf[i4]).f86623m;
                int i9 = i8 + 1;
                if (i8 == 0) {
                    str = str2;
                } else {
                    z |= !y32.m27076a(str, str2);
                }
                i7 = Math.min(i7, this.f78763e[i][i2][i4] & 24);
                i4++;
                i8 = i9;
            }
            return z ? Math.min(i7, this.f78762d[i]) : i7;
        }

        /* renamed from: b */
        public final w02 m34454b(int i) {
            return this.f78761c[i];
        }

        /* renamed from: b */
        public final w02 m34455b() {
            return this.f78764f;
        }

        /* renamed from: a */
        public final int m34460a() {
            return this.f78759a;
        }

        /* renamed from: a */
        public final int m34459a(int i) {
            return this.f78760b[i];
        }

        /* renamed from: a */
        public final int m34457a(int i, int i2, int i3) {
            return this.f78763e[i][i2][i3] & 7;
        }
    }

    /* renamed from: a */
    protected abstract Pair<rk1[], v40[]> mo34463a(C30267a c30267a, int[][][] iArr, int[] iArr2, vt0.C31682b c31682b, g02 g02Var) throws a40;

    @Override // com.yandex.mobile.ads.impl.c12
    /* renamed from: a */
    public final void mo34462a(@Nullable Object obj) {
        C30267a c30267a = (C30267a) obj;
    }

    @Override // com.yandex.mobile.ads.impl.c12
    /* renamed from: a */
    public final d12 mo34461a(qk1[] qk1VarArr, w02 w02Var, vt0.C31682b c31682b, g02 g02Var) throws a40 {
        boolean z;
        int[] iArr;
        w02 w02Var2 = w02Var;
        boolean z2 = true;
        int[] iArr2 = new int[qk1VarArr.length + 1];
        int length = qk1VarArr.length + 1;
        v02[][] v02VarArr = new v02[length];
        int[][][] iArr3 = new int[qk1VarArr.length + 1][];
        for (int i = 0; i < length; i++) {
            int i2 = w02Var2.f87076b;
            v02VarArr[i] = new v02[i2];
            iArr3[i] = new int[i2];
        }
        int length2 = qk1VarArr.length;
        int[] iArr4 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr4[i3] = qk1VarArr[i3].mo29133f();
        }
        int i4 = 0;
        while (i4 < w02Var2.f87076b) {
            v02 m28081a = w02Var2.m28081a(i4);
            boolean z3 = m28081a.f86519d == 5 ? z2 : false;
            int length3 = qk1VarArr.length;
            boolean z4 = z2;
            int i5 = 0;
            for (int i6 = 0; i6 < qk1VarArr.length; i6++) {
                qk1 qk1Var = qk1VarArr[i6];
                int i7 = 0;
                for (int i8 = 0; i8 < m28081a.f86517b; i8++) {
                    i7 = Math.max(i7, qk1Var.mo27871a(m28081a.m28579a(i8)) & 7);
                }
                boolean z5 = iArr2[i6] == 0;
                if (i7 > i5 || (i7 == i5 && z3 && !z4 && z5)) {
                    z4 = z5;
                    i5 = i7;
                    length3 = i6;
                }
            }
            if (length3 == qk1VarArr.length) {
                iArr = new int[m28081a.f86517b];
            } else {
                qk1 qk1Var2 = qk1VarArr[length3];
                int[] iArr5 = new int[m28081a.f86517b];
                for (int i9 = 0; i9 < m28081a.f86517b; i9++) {
                    iArr5[i9] = qk1Var2.mo27871a(m28081a.m28579a(i9));
                }
                iArr = iArr5;
            }
            int i10 = iArr2[length3];
            v02VarArr[length3][i10] = m28081a;
            iArr3[length3][i10] = iArr;
            iArr2[length3] = i10 + 1;
            i4++;
            z2 = true;
            w02Var2 = w02Var;
        }
        boolean z6 = z2;
        w02[] w02VarArr = new w02[qk1VarArr.length];
        String[] strArr = new String[qk1VarArr.length];
        int[] iArr6 = new int[qk1VarArr.length];
        for (int i11 = 0; i11 < qk1VarArr.length; i11++) {
            int i12 = iArr2[i11];
            w02VarArr[i11] = new w02((v02[]) y32.m27090a(i12, v02VarArr[i11]));
            iArr3[i11] = (int[][]) y32.m27090a(i12, iArr3[i11]);
            strArr[i11] = qk1VarArr[i11].getName();
            iArr6[i11] = ((AbstractC31461tj) qk1VarArr[i11]).mo29126m();
        }
        C30267a c30267a = new C30267a(iArr6, w02VarArr, iArr4, iArr3, new w02((v02[]) y32.m27090a(iArr2[qk1VarArr.length], v02VarArr[qk1VarArr.length])));
        Pair<rk1[], v40[]> mo34463a = mo34463a(c30267a, iArr3, iArr4, c31682b, g02Var);
        z02[] z02VarArr = (z02[]) mo34463a.second;
        List[] listArr = new List[z02VarArr.length];
        for (int i13 = 0; i13 < z02VarArr.length; i13++) {
            z02 z02Var = z02VarArr[i13];
            listArr[i13] = z02Var != null ? oh0.m31016a(z02Var) : oh0.m31009h();
        }
        oh0.C31039a c31039a = new oh0.C31039a();
        int i14 = 0;
        while (i14 < c30267a.f78759a) {
            w02 w02Var3 = c30267a.f78761c[i14];
            List list = listArr[i14];
            int i15 = 0;
            while (i15 < w02Var3.f87076b) {
                v02 m28081a2 = w02Var3.m28081a(i15);
                boolean z7 = c30267a.m34458a(i14, i15) != 0 ? z6 : false;
                int i16 = m28081a2.f86517b;
                int[] iArr7 = new int[i16];
                boolean[] zArr = new boolean[i16];
                for (int i17 = 0; i17 < m28081a2.f86517b; i17++) {
                    iArr7[i17] = c30267a.m34457a(i14, i15, i17);
                    int i18 = 0;
                    while (true) {
                        if (i18 >= list.size()) {
                            z = false;
                            break;
                        }
                        z02 z02Var2 = (z02) list.get(i18);
                        if (z02Var2.mo26485a().equals(m28081a2) && z02Var2.mo26481c(i17) != -1) {
                            z = true;
                            break;
                        }
                        i18++;
                    }
                    zArr[i17] = z;
                }
                c31039a.m31999b(new w12.C31716a(m28081a2, z7, iArr7, zArr));
                i15++;
                z6 = true;
            }
            i14++;
            z6 = true;
        }
        w02 w02Var4 = c30267a.f78764f;
        for (int i19 = 0; i19 < w02Var4.f87076b; i19++) {
            v02 m28081a3 = w02Var4.m28081a(i19);
            int[] iArr8 = new int[m28081a3.f86517b];
            Arrays.fill(iArr8, 0);
            c31039a.m31999b(new w12.C31716a(m28081a3, false, iArr8, new boolean[m28081a3.f86517b]));
        }
        return new d12((rk1[]) mo34463a.first, (v40[]) mo34463a.second, new w12(c31039a.m31008a()), c30267a);
    }
}
