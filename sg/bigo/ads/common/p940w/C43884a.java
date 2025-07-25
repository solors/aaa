package sg.bigo.ads.common.p940w;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import sg.bigo.ads.common.p940w.C43900c;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(api = 19)
/* renamed from: sg.bigo.ads.common.w.a */
/* loaded from: classes10.dex */
public final class C43884a {

    /* renamed from: g */
    private static final Comparator<C43886a> f114910g = new Comparator<C43886a>() { // from class: sg.bigo.ads.common.w.a.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(C43886a c43886a, C43886a c43886a2) {
            return c43886a2.m4695a() - c43886a.m4695a();
        }
    };

    /* renamed from: a */
    final int[] f114911a;

    /* renamed from: b */
    final int[] f114912b;

    /* renamed from: c */
    final List<C43900c.C43904c> f114913c;

    /* renamed from: e */
    final C43900c.InterfaceC43903b[] f114915e;

    /* renamed from: f */
    private final float[] f114916f = new float[3];
    @Nullable

    /* renamed from: d */
    final TimingLogger f114914d = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.common.w.a$a */
    /* loaded from: classes10.dex */
    public class C43886a {

        /* renamed from: a */
        int f114917a;

        /* renamed from: c */
        private int f114919c;

        /* renamed from: d */
        private int f114920d;

        /* renamed from: e */
        private int f114921e;

        /* renamed from: f */
        private int f114922f;

        /* renamed from: g */
        private int f114923g;

        /* renamed from: h */
        private int f114924h;

        /* renamed from: i */
        private int f114925i;

        /* renamed from: j */
        private int f114926j;

        C43886a(int i, int i2) {
            this.f114919c = i;
            this.f114917a = i2;
            m4693c();
        }

        /* renamed from: f */
        private int m4690f() {
            return (this.f114917a + 1) - this.f114919c;
        }

        /* renamed from: a */
        final int m4695a() {
            return ((this.f114922f - this.f114921e) + 1) * ((this.f114924h - this.f114923g) + 1) * ((this.f114926j - this.f114925i) + 1);
        }

        /* renamed from: b */
        final boolean m4694b() {
            if (m4690f() > 1) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        final void m4693c() {
            C43884a c43884a = C43884a.this;
            int[] iArr = c43884a.f114911a;
            int[] iArr2 = c43884a.f114912b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = 0;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = this.f114919c; i8 <= this.f114917a; i8++) {
                int i9 = iArr[i8];
                i5 += iArr2[i9];
                int m4705a = C43884a.m4705a(i9);
                int m4699b = C43884a.m4699b(i9);
                int m4697c = C43884a.m4697c(i9);
                if (m4705a > i2) {
                    i2 = m4705a;
                }
                if (m4705a < i) {
                    i = m4705a;
                }
                if (m4699b > i3) {
                    i3 = m4699b;
                }
                if (m4699b < i6) {
                    i6 = m4699b;
                }
                if (m4697c > i4) {
                    i4 = m4697c;
                }
                if (m4697c < i7) {
                    i7 = m4697c;
                }
            }
            this.f114921e = i;
            this.f114922f = i2;
            this.f114923g = i6;
            this.f114924h = i3;
            this.f114925i = i7;
            this.f114926j = i4;
            this.f114920d = i5;
        }

        /* renamed from: d */
        final int m4692d() {
            int i;
            int i2 = this.f114922f - this.f114921e;
            int i3 = this.f114924h - this.f114923g;
            int i4 = this.f114926j - this.f114925i;
            if (i2 >= i3 && i2 >= i4) {
                i = -3;
            } else if (i3 >= i2 && i3 >= i4) {
                i = -2;
            } else {
                i = -1;
            }
            C43884a c43884a = C43884a.this;
            int[] iArr = c43884a.f114911a;
            int[] iArr2 = c43884a.f114912b;
            C43884a.m4700a(iArr, i, this.f114919c, this.f114917a);
            Arrays.sort(iArr, this.f114919c, this.f114917a + 1);
            C43884a.m4700a(iArr, i, this.f114919c, this.f114917a);
            int i5 = this.f114920d / 2;
            int i6 = this.f114919c;
            int i7 = 0;
            while (true) {
                int i8 = this.f114917a;
                if (i6 <= i8) {
                    i7 += iArr2[iArr[i6]];
                    if (i7 >= i5) {
                        return Math.min(i8 - 1, i6);
                    }
                    i6++;
                } else {
                    return this.f114919c;
                }
            }
        }

        /* renamed from: e */
        final C43900c.C43904c m4691e() {
            C43884a c43884a = C43884a.this;
            int[] iArr = c43884a.f114911a;
            int[] iArr2 = c43884a.f114912b;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.f114919c; i5 <= this.f114917a; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += C43884a.m4705a(i6) * i7;
                i3 += C43884a.m4699b(i6) * i7;
                i4 += i7 * C43884a.m4697c(i6);
            }
            float f = i2;
            return new C43900c.C43904c(C43884a.m4704a(Math.round(i / f), Math.round(i3 / f), Math.round(i4 / f)), i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C43884a(int[] iArr, int i, C43900c.InterfaceC43903b[] interfaceC43903bArr) {
        this.f114915e = interfaceC43903bArr;
        int[] iArr2 = new int[32768];
        this.f114912b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int m4698b = m4698b(Color.blue(i3), 8, 5) | (m4698b(Color.red(i3), 8, 5) << 10) | (m4698b(Color.green(i3), 8, 5) << 5);
            iArr[i2] = m4698b;
            iArr2[m4698b] = iArr2[m4698b] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                C43887b.m4681a(m4696d(i5), this.f114916f);
                if (m4701a(this.f114916f)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.f114911a = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 <= i) {
            this.f114913c = new ArrayList();
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = iArr3[i8];
                this.f114913c.add(new C43900c.C43904c(m4696d(i9), iArr2[i9]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, f114910g);
        priorityQueue.offer(new C43886a(0, this.f114911a.length - 1));
        m4702a(priorityQueue, i);
        this.f114913c = m4703a(priorityQueue);
    }

    /* renamed from: a */
    static int m4705a(int i) {
        return (i >> 10) & 31;
    }

    /* renamed from: b */
    static int m4699b(int i) {
        return (i >> 5) & 31;
    }

    /* renamed from: c */
    static int m4697c(int i) {
        return i & 31;
    }

    /* renamed from: d */
    private static int m4696d(int i) {
        return m4704a((i >> 10) & 31, (i >> 5) & 31, i & 31);
    }

    /* renamed from: a */
    static int m4704a(int i, int i2, int i3) {
        return Color.rgb(m4698b(i, 5, 8), m4698b(i2, 5, 8), m4698b(i3, 5, 8));
    }

    /* renamed from: b */
    private static int m4698b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* renamed from: a */
    private List<C43900c.C43904c> m4703a(Collection<C43886a> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C43886a c43886a : collection) {
            C43900c.C43904c m4691e = c43886a.m4691e();
            if (!m4701a(m4691e.m4660a())) {
                arrayList.add(m4691e);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m4702a(PriorityQueue<C43886a> priorityQueue, int i) {
        C43886a poll;
        while (priorityQueue.size() < i && (poll = priorityQueue.poll()) != null && poll.m4694b()) {
            if (!poll.m4694b()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int m4692d = poll.m4692d();
            C43886a c43886a = new C43886a(m4692d + 1, poll.f114917a);
            poll.f114917a = m4692d;
            poll.m4693c();
            priorityQueue.offer(c43886a);
            priorityQueue.offer(poll);
        }
    }

    /* renamed from: a */
    static void m4700a(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
        } else if (i != -1) {
        } else {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
                i2++;
            }
        }
    }

    /* renamed from: a */
    private boolean m4701a(float[] fArr) {
        C43900c.InterfaceC43903b[] interfaceC43903bArr = this.f114915e;
        if (interfaceC43903bArr != null && interfaceC43903bArr.length > 0) {
            int length = interfaceC43903bArr.length;
            for (int i = 0; i < length; i++) {
                if (!this.f114915e[i].mo4661a(fArr)) {
                    return true;
                }
            }
        }
        return false;
    }
}
