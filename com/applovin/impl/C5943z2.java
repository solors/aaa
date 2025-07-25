package com.applovin.impl;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.impl.C3989a5;
import com.applovin.impl.C5943z2;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.maticoo.sdk.utils.error.ErrorCode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.applovin.impl.z2 */
/* loaded from: classes2.dex */
public final class C5943z2 extends AbstractC3983a3 {

    /* renamed from: g */
    private final C4066ah f12418g = new C4066ah();

    /* renamed from: h */
    private final C5971zg f12419h = new C5971zg();

    /* renamed from: i */
    private int f12420i = -1;

    /* renamed from: j */
    private final boolean f12421j;

    /* renamed from: k */
    private final int f12422k;

    /* renamed from: l */
    private final C5945b[] f12423l;

    /* renamed from: m */
    private C5945b f12424m;

    /* renamed from: n */
    private List f12425n;

    /* renamed from: o */
    private List f12426o;

    /* renamed from: p */
    private C5946c f12427p;

    /* renamed from: q */
    private int f12428q;

    /* renamed from: com.applovin.impl.z2$a */
    /* loaded from: classes2.dex */
    public static final class C5944a {

        /* renamed from: c */
        private static final Comparator f12429c = new Comparator() { // from class: com.applovin.impl.z80
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m92566a;
                m92566a = C5943z2.C5944a.m92566a((C5943z2.C5944a) obj, (C5943z2.C5944a) obj2);
                return m92566a;
            }
        };

        /* renamed from: a */
        public final C3989a5 f12430a;

        /* renamed from: b */
        public final int f12431b;

        public C5944a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            C3989a5.C3991b m101034d = new C3989a5.C3991b().m101044a(charSequence).m101039b(alignment).m101048a(f, i).m101047a(i2).m101042b(f2).m101040b(i3).m101034d(f3);
            if (z) {
                m101034d.m101033d(i4);
            }
            this.f12430a = m101034d.m101050a();
            this.f12431b = i5;
        }

        /* renamed from: a */
        public static /* synthetic */ int m92566a(C5944a c5944a, C5944a c5944a2) {
            return Integer.compare(c5944a2.f12431b, c5944a.f12431b);
        }
    }

    /* renamed from: com.applovin.impl.z2$c */
    /* loaded from: classes2.dex */
    public static final class C5946c {

        /* renamed from: a */
        public final int f12465a;

        /* renamed from: b */
        public final int f12466b;

        /* renamed from: c */
        public final byte[] f12467c;

        /* renamed from: d */
        int f12468d = 0;

        public C5946c(int i, int i2) {
            this.f12465a = i;
            this.f12466b = i2;
            this.f12467c = new byte[(i2 * 2) - 1];
        }
    }

    public C5943z2(int i, List list) {
        boolean z = true;
        this.f12422k = i == -1 ? 1 : i;
        this.f12421j = (list == null || !AbstractC5046o3.m96878a(list)) ? false : z;
        this.f12423l = new C5945b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f12423l[i2] = new C5945b();
        }
        this.f12424m = this.f12423l[0];
    }

    /* renamed from: c */
    private void m92586c(int i) {
        if (i > 7) {
            if (i <= 15) {
                this.f12419h.m92390d(8);
            } else if (i <= 23) {
                this.f12419h.m92390d(16);
            } else if (i <= 31) {
                this.f12419h.m92390d(24);
            }
        }
    }

    /* renamed from: d */
    private void m92585d(int i) {
        if (i <= 135) {
            this.f12419h.m92390d(32);
        } else if (i <= 143) {
            this.f12419h.m92390d(40);
        } else if (i <= 159) {
            this.f12419h.m92390d(2);
            this.f12419h.m92390d(this.f12419h.m92403a(6) * 8);
        }
    }

    /* renamed from: h */
    private void m92578h(int i) {
        if (i != 32) {
            if (i != 33) {
                if (i != 37) {
                    if (i != 42) {
                        if (i != 44) {
                            if (i != 63) {
                                if (i != 57) {
                                    if (i != 58) {
                                        if (i != 60) {
                                            if (i != 61) {
                                                switch (i) {
                                                    case 48:
                                                        this.f12424m.m92563a((char) 9608);
                                                        return;
                                                    case 49:
                                                        this.f12424m.m92563a((char) 8216);
                                                        return;
                                                    case 50:
                                                        this.f12424m.m92563a((char) 8217);
                                                        return;
                                                    case 51:
                                                        this.f12424m.m92563a((char) 8220);
                                                        return;
                                                    case 52:
                                                        this.f12424m.m92563a((char) 8221);
                                                        return;
                                                    case 53:
                                                        this.f12424m.m92563a((char) 8226);
                                                        return;
                                                    default:
                                                        switch (i) {
                                                            case 118:
                                                                this.f12424m.m92563a((char) 8539);
                                                                return;
                                                            case 119:
                                                                this.f12424m.m92563a((char) 8540);
                                                                return;
                                                            case 120:
                                                                this.f12424m.m92563a((char) 8541);
                                                                return;
                                                            case 121:
                                                                this.f12424m.m92563a((char) 8542);
                                                                return;
                                                            case 122:
                                                                this.f12424m.m92563a((char) 9474);
                                                                return;
                                                            case 123:
                                                                this.f12424m.m92563a((char) 9488);
                                                                return;
                                                            case 124:
                                                                this.f12424m.m92563a((char) 9492);
                                                                return;
                                                            case 125:
                                                                this.f12424m.m92563a((char) 9472);
                                                                return;
                                                            case 126:
                                                                this.f12424m.m92563a((char) 9496);
                                                                return;
                                                            case 127:
                                                                this.f12424m.m92563a((char) 9484);
                                                                return;
                                                            default:
                                                                AbstractC5063oc.m96800d("Cea708Decoder", "Invalid G2 character: " + i);
                                                                return;
                                                        }
                                                }
                                            }
                                            this.f12424m.m92563a((char) 8480);
                                            return;
                                        }
                                        this.f12424m.m92563a((char) 339);
                                        return;
                                    }
                                    this.f12424m.m92563a((char) 353);
                                    return;
                                }
                                this.f12424m.m92563a((char) 8482);
                                return;
                            }
                            this.f12424m.m92563a((char) 376);
                            return;
                        }
                        this.f12424m.m92563a((char) 338);
                        return;
                    }
                    this.f12424m.m92563a((char) 352);
                    return;
                }
                this.f12424m.m92563a((char) 8230);
                return;
            }
            this.f12424m.m92563a((char) 160);
            return;
        }
        this.f12424m.m92563a(' ');
    }

    /* renamed from: i */
    private void m92577i(int i) {
        if (i == 160) {
            this.f12424m.m92563a((char) 13252);
            return;
        }
        AbstractC5063oc.m96800d("Cea708Decoder", "Invalid G3 character: " + i);
        this.f12424m.m92563a('_');
    }

    /* renamed from: k */
    private void m92575k() {
        if (this.f12427p == null) {
            return;
        }
        m92569q();
        this.f12427p = null;
    }

    /* renamed from: l */
    private List m92574l() {
        C5944a m92555b;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f12423l[i].m92550f() && this.f12423l[i].m92549g() && (m92555b = this.f12423l[i].m92555b()) != null) {
                arrayList.add(m92555b);
            }
        }
        Collections.sort(arrayList, C5944a.f12429c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C5944a) arrayList.get(i2)).f12430a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: m */
    private void m92573m() {
        this.f12424m.m92559a(this.f12419h.m92403a(4), this.f12419h.m92403a(2), this.f12419h.m92403a(2), this.f12419h.m92387f(), this.f12419h.m92387f(), this.f12419h.m92403a(3), this.f12419h.m92403a(3));
    }

    /* renamed from: n */
    private void m92572n() {
        int m92560a = C5945b.m92560a(this.f12419h.m92403a(2), this.f12419h.m92403a(2), this.f12419h.m92403a(2), this.f12419h.m92403a(2));
        int m92560a2 = C5945b.m92560a(this.f12419h.m92403a(2), this.f12419h.m92403a(2), this.f12419h.m92403a(2), this.f12419h.m92403a(2));
        this.f12419h.m92390d(2);
        this.f12424m.m92554b(m92560a, m92560a2, C5945b.m92561a(this.f12419h.m92403a(2), this.f12419h.m92403a(2), this.f12419h.m92403a(2)));
    }

    /* renamed from: o */
    private void m92571o() {
        this.f12419h.m92390d(4);
        int m92403a = this.f12419h.m92403a(4);
        this.f12419h.m92390d(2);
        this.f12424m.m92562a(m92403a, this.f12419h.m92403a(6));
    }

    /* renamed from: p */
    private void m92570p() {
        int m92560a = C5945b.m92560a(this.f12419h.m92403a(2), this.f12419h.m92403a(2), this.f12419h.m92403a(2), this.f12419h.m92403a(2));
        int m92403a = this.f12419h.m92403a(2);
        int m92561a = C5945b.m92561a(this.f12419h.m92403a(2), this.f12419h.m92403a(2), this.f12419h.m92403a(2));
        if (this.f12419h.m92387f()) {
            m92403a |= 4;
        }
        boolean m92387f = this.f12419h.m92387f();
        int m92403a2 = this.f12419h.m92403a(2);
        int m92403a3 = this.f12419h.m92403a(2);
        int m92403a4 = this.f12419h.m92403a(2);
        this.f12419h.m92390d(8);
        this.f12424m.m92558a(m92560a, m92561a, m92387f, m92403a, m92403a2, m92403a3, m92403a4);
    }

    /* renamed from: q */
    private void m92569q() {
        C5946c c5946c = this.f12427p;
        if (c5946c.f12468d != (c5946c.f12466b * 2) - 1) {
            AbstractC5063oc.m96809a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f12427p.f12466b * 2) - 1) + ", but current index is " + this.f12427p.f12468d + " (sequence number " + this.f12427p.f12465a + ");");
        }
        C5971zg c5971zg = this.f12419h;
        C5946c c5946c2 = this.f12427p;
        c5971zg.m92398a(c5946c2.f12467c, c5946c2.f12468d);
        int m92403a = this.f12419h.m92403a(3);
        int m92403a2 = this.f12419h.m92403a(5);
        if (m92403a == 7) {
            this.f12419h.m92390d(2);
            m92403a = this.f12419h.m92403a(6);
            if (m92403a < 7) {
                AbstractC5063oc.m96800d("Cea708Decoder", "Invalid extended service number: " + m92403a);
            }
        }
        if (m92403a2 == 0) {
            if (m92403a != 0) {
                AbstractC5063oc.m96800d("Cea708Decoder", "serviceNumber is non-zero (" + m92403a + ") when blockSize is 0");
            }
        } else if (m92403a != this.f12422k) {
        } else {
            boolean z = false;
            while (this.f12419h.m92396b() > 0) {
                int m92403a3 = this.f12419h.m92403a(8);
                if (m92403a3 != 16) {
                    if (m92403a3 <= 31) {
                        m92592a(m92403a3);
                    } else {
                        if (m92403a3 <= 127) {
                            m92581f(m92403a3);
                        } else if (m92403a3 <= 159) {
                            m92588b(m92403a3);
                        } else if (m92403a3 <= 255) {
                            m92579g(m92403a3);
                        } else {
                            AbstractC5063oc.m96800d("Cea708Decoder", "Invalid base command: " + m92403a3);
                        }
                        z = true;
                    }
                } else {
                    int m92403a4 = this.f12419h.m92403a(8);
                    if (m92403a4 <= 31) {
                        m92586c(m92403a4);
                    } else {
                        if (m92403a4 <= 127) {
                            m92578h(m92403a4);
                        } else if (m92403a4 <= 159) {
                            m92585d(m92403a4);
                        } else if (m92403a4 <= 255) {
                            m92577i(m92403a4);
                        } else {
                            AbstractC5063oc.m96800d("Cea708Decoder", "Invalid extended command: " + m92403a4);
                        }
                        z = true;
                    }
                }
            }
            if (z) {
                this.f12425n = m92574l();
            }
        }
    }

    /* renamed from: r */
    private void m92568r() {
        for (int i = 0; i < 8; i++) {
            this.f12423l[i].m92548h();
        }
    }

    @Override // com.applovin.impl.AbstractC3983a3
    /* renamed from: a */
    protected void mo92590a(C5278rl c5278rl) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC4100b1.m100583a(c5278rl.f8725c);
        this.f12418g.m100791a(byteBuffer.array(), byteBuffer.limit());
        while (this.f12418g.m100797a() >= 3) {
            int m100762w = this.f12418g.m100762w();
            int i = m100762w & 3;
            boolean z = (m100762w & 4) == 4;
            byte m100762w2 = (byte) this.f12418g.m100762w();
            byte m100762w3 = (byte) this.f12418g.m100762w();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m92575k();
                        int i2 = (m100762w2 & 192) >> 6;
                        int i3 = this.f12420i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m92568r();
                            AbstractC5063oc.m96800d("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f12420i + " current=" + i2);
                        }
                        this.f12420i = i2;
                        int i4 = m100762w2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C5946c c5946c = new C5946c(i2, i4);
                        this.f12427p = c5946c;
                        byte[] bArr = c5946c.f12467c;
                        int i5 = c5946c.f12468d;
                        c5946c.f12468d = i5 + 1;
                        bArr[i5] = m100762w3;
                    } else {
                        AbstractC4100b1.m100580a(i == 2);
                        C5946c c5946c2 = this.f12427p;
                        if (c5946c2 == null) {
                            AbstractC5063oc.m96805b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c5946c2.f12467c;
                            int i6 = c5946c2.f12468d;
                            bArr2[i6] = m100762w2;
                            c5946c2.f12468d = i6 + 2;
                            bArr2[i6 + 1] = m100762w3;
                        }
                    }
                    C5946c c5946c3 = this.f12427p;
                    if (c5946c3.f12468d == (c5946c3.f12466b * 2) - 1) {
                        m92575k();
                    }
                }
            }
        }
    }

    @Override // com.applovin.impl.AbstractC3983a3, com.applovin.impl.InterfaceC4749l5
    /* renamed from: b */
    public void mo92589b() {
        super.mo92589b();
        this.f12425n = null;
        this.f12426o = null;
        this.f12428q = 0;
        this.f12424m = this.f12423l[0];
        m92568r();
        this.f12427p = null;
    }

    @Override // com.applovin.impl.AbstractC3983a3
    /* renamed from: e */
    protected InterfaceC5019nl mo92584e() {
        List list = this.f12425n;
        this.f12426o = list;
        return new C4102b3((List) AbstractC4100b1.m100583a(list));
    }

    @Override // com.applovin.impl.AbstractC3983a3
    /* renamed from: f */
    public /* bridge */ /* synthetic */ C5278rl mo92582f() {
        return super.mo97860d();
    }

    @Override // com.applovin.impl.AbstractC3983a3
    /* renamed from: g */
    public /* bridge */ /* synthetic */ AbstractC5519sl mo92580g() {
        return super.mo92869c();
    }

    @Override // com.applovin.impl.AbstractC3983a3
    /* renamed from: j */
    protected boolean mo92576j() {
        if (this.f12425n != this.f12426o) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m92581f(int i) {
        if (i == 127) {
            this.f12424m.m92563a((char) 9835);
        } else {
            this.f12424m.m92563a((char) (i & 255));
        }
    }

    /* renamed from: g */
    private void m92579g(int i) {
        this.f12424m.m92563a((char) (i & 255));
    }

    /* renamed from: e */
    private void m92583e(int i) {
        C5945b c5945b = this.f12423l[i];
        this.f12419h.m92390d(2);
        boolean m92387f = this.f12419h.m92387f();
        boolean m92387f2 = this.f12419h.m92387f();
        boolean m92387f3 = this.f12419h.m92387f();
        int m92403a = this.f12419h.m92403a(3);
        boolean m92387f4 = this.f12419h.m92387f();
        int m92403a2 = this.f12419h.m92403a(7);
        int m92403a3 = this.f12419h.m92403a(8);
        int m92403a4 = this.f12419h.m92403a(4);
        int m92403a5 = this.f12419h.m92403a(4);
        this.f12419h.m92390d(2);
        int m92403a6 = this.f12419h.m92403a(6);
        this.f12419h.m92390d(2);
        c5945b.m92556a(m92387f, m92387f2, m92387f3, m92403a, m92387f4, m92403a2, m92403a3, m92403a5, m92403a6, m92403a4, this.f12419h.m92403a(3), this.f12419h.m92403a(3));
    }

    /* renamed from: b */
    private void m92588b(int i) {
        C5945b c5945b;
        int i2 = 1;
        switch (i) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i3 = i - 128;
                if (this.f12428q != i3) {
                    this.f12428q = i3;
                    this.f12424m = this.f12423l[i3];
                    return;
                }
                return;
            case 136:
                while (i2 <= 8) {
                    if (this.f12419h.m92387f()) {
                        this.f12423l[8 - i2].m92552d();
                    }
                    i2++;
                }
                return;
            case 137:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.f12419h.m92387f()) {
                        this.f12423l[8 - i4].m92557a(true);
                    }
                }
                return;
            case 138:
                while (i2 <= 8) {
                    if (this.f12419h.m92387f()) {
                        this.f12423l[8 - i2].m92557a(false);
                    }
                    i2++;
                }
                return;
            case 139:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.f12419h.m92387f()) {
                        this.f12423l[8 - i5].m92557a(!c5945b.m92549g());
                    }
                }
                return;
            case IronSourceConstants.USING_CACHE_FOR_INIT_EVENT /* 140 */:
                while (i2 <= 8) {
                    if (this.f12419h.m92387f()) {
                        this.f12423l[8 - i2].m92548h();
                    }
                    i2++;
                }
                return;
            case ErrorCode.CODE_INIT_DEVICE_ERROR /* 141 */:
                this.f12419h.m92390d(8);
                return;
            case 142:
                return;
            case 143:
                m92568r();
                return;
            case 144:
                if (!this.f12424m.m92551e()) {
                    this.f12419h.m92390d(16);
                    return;
                } else {
                    m92573m();
                    return;
                }
            case 145:
                if (!this.f12424m.m92551e()) {
                    this.f12419h.m92390d(24);
                    return;
                } else {
                    m92572n();
                    return;
                }
            case 146:
                if (!this.f12424m.m92551e()) {
                    this.f12419h.m92390d(16);
                    return;
                } else {
                    m92571o();
                    return;
                }
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                AbstractC5063oc.m96800d("Cea708Decoder", "Invalid C1 command: " + i);
                return;
            case ErrorCode.CODE_INIT_UNKNOWN_ERROR /* 151 */:
                if (!this.f12424m.m92551e()) {
                    this.f12419h.m92390d(32);
                    return;
                } else {
                    m92570p();
                    return;
                }
            case ErrorCode.CODE_NOT_TRACK_STATUS /* 152 */:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i6 = i - 152;
                m92583e(i6);
                if (this.f12428q != i6) {
                    this.f12428q = i6;
                    this.f12424m = this.f12423l[i6];
                    return;
                }
                return;
        }
    }

    /* renamed from: com.applovin.impl.z2$b */
    /* loaded from: classes2.dex */
    public static final class C5945b {

        /* renamed from: A */
        private static final int[] f12432A;

        /* renamed from: B */
        private static final int[] f12433B;

        /* renamed from: C */
        private static final boolean[] f12434C;

        /* renamed from: D */
        private static final int[] f12435D;

        /* renamed from: E */
        private static final int[] f12436E;

        /* renamed from: F */
        private static final int[] f12437F;

        /* renamed from: G */
        private static final int[] f12438G;

        /* renamed from: w */
        public static final int f12439w = m92560a(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f12440x;

        /* renamed from: y */
        public static final int f12441y;

        /* renamed from: z */
        private static final int[] f12442z;

        /* renamed from: a */
        private final List f12443a = new ArrayList();

        /* renamed from: b */
        private final SpannableStringBuilder f12444b = new SpannableStringBuilder();

        /* renamed from: c */
        private boolean f12445c;

        /* renamed from: d */
        private boolean f12446d;

        /* renamed from: e */
        private int f12447e;

        /* renamed from: f */
        private boolean f12448f;

        /* renamed from: g */
        private int f12449g;

        /* renamed from: h */
        private int f12450h;

        /* renamed from: i */
        private int f12451i;

        /* renamed from: j */
        private int f12452j;

        /* renamed from: k */
        private boolean f12453k;

        /* renamed from: l */
        private int f12454l;

        /* renamed from: m */
        private int f12455m;

        /* renamed from: n */
        private int f12456n;

        /* renamed from: o */
        private int f12457o;

        /* renamed from: p */
        private int f12458p;

        /* renamed from: q */
        private int f12459q;

        /* renamed from: r */
        private int f12460r;

        /* renamed from: s */
        private int f12461s;

        /* renamed from: t */
        private int f12462t;

        /* renamed from: u */
        private int f12463u;

        /* renamed from: v */
        private int f12464v;

        static {
            int m92560a = m92560a(0, 0, 0, 0);
            f12440x = m92560a;
            int m92560a2 = m92560a(0, 0, 0, 3);
            f12441y = m92560a2;
            f12442z = new int[]{0, 0, 0, 0, 0, 2, 0};
            f12432A = new int[]{0, 0, 0, 0, 0, 0, 2};
            f12433B = new int[]{3, 3, 3, 3, 3, 3, 1};
            f12434C = new boolean[]{false, false, false, true, true, true, false};
            f12435D = new int[]{m92560a, m92560a2, m92560a, m92560a, m92560a2, m92560a, m92560a};
            f12436E = new int[]{0, 1, 2, 3, 4, 3, 4};
            f12437F = new int[]{0, 0, 0, 0, 0, 3, 3};
            f12438G = new int[]{m92560a, m92560a, m92560a, m92560a, m92560a, m92560a2, m92560a2};
        }

        public C5945b() {
            m92548h();
        }

        /* renamed from: a */
        public void m92563a(char c) {
            if (c == '\n') {
                this.f12443a.add(m92553c());
                this.f12444b.clear();
                if (this.f12458p != -1) {
                    this.f12458p = 0;
                }
                if (this.f12459q != -1) {
                    this.f12459q = 0;
                }
                if (this.f12460r != -1) {
                    this.f12460r = 0;
                }
                if (this.f12462t != -1) {
                    this.f12462t = 0;
                }
                while (true) {
                    if ((!this.f12453k || this.f12443a.size() < this.f12452j) && this.f12443a.size() < 15) {
                        return;
                    }
                    this.f12443a.remove(0);
                }
            } else {
                this.f12444b.append(c);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:66:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00a6  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.applovin.impl.C5943z2.C5944a m92555b() {
            /*
                Method dump skipped, instructions count: 189
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C5943z2.C5945b.m92555b():com.applovin.impl.z2$a");
        }

        /* renamed from: c */
        public SpannableString m92553c() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f12444b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f12458p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f12458p, length, 33);
                }
                if (this.f12459q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f12459q, length, 33);
                }
                if (this.f12460r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f12461s), this.f12460r, length, 33);
                }
                if (this.f12462t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f12463u), this.f12462t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: d */
        public void m92552d() {
            this.f12443a.clear();
            this.f12444b.clear();
            this.f12458p = -1;
            this.f12459q = -1;
            this.f12460r = -1;
            this.f12462t = -1;
            this.f12464v = 0;
        }

        /* renamed from: e */
        public boolean m92551e() {
            return this.f12445c;
        }

        /* renamed from: f */
        public boolean m92550f() {
            if (m92551e() && (!this.f12443a.isEmpty() || this.f12444b.length() != 0)) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public boolean m92549g() {
            return this.f12446d;
        }

        /* renamed from: h */
        public void m92548h() {
            m92552d();
            this.f12445c = false;
            this.f12446d = false;
            this.f12447e = 4;
            this.f12448f = false;
            this.f12449g = 0;
            this.f12450h = 0;
            this.f12451i = 0;
            this.f12452j = 15;
            this.f12453k = true;
            this.f12454l = 0;
            this.f12455m = 0;
            this.f12456n = 0;
            int i = f12440x;
            this.f12457o = i;
            this.f12461s = f12439w;
            this.f12463u = i;
        }

        /* renamed from: a */
        public void m92564a() {
            int length = this.f12444b.length();
            if (length > 0) {
                this.f12444b.delete(length - 1, length);
            }
        }

        /* renamed from: a */
        public void m92556a(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f12445c = true;
            this.f12446d = z;
            this.f12453k = z2;
            this.f12447e = i;
            this.f12448f = z4;
            this.f12449g = i2;
            this.f12450h = i3;
            this.f12451i = i6;
            int i9 = i4 + 1;
            if (this.f12452j != i9) {
                this.f12452j = i9;
                while (true) {
                    if ((!z2 || this.f12443a.size() < this.f12452j) && this.f12443a.size() < 15) {
                        break;
                    }
                    this.f12443a.remove(0);
                }
            }
            if (i7 != 0 && this.f12455m != i7) {
                this.f12455m = i7;
                int i10 = i7 - 1;
                m92558a(f12435D[i10], f12441y, f12434C[i10], 0, f12432A[i10], f12433B[i10], f12442z[i10]);
            }
            if (i8 == 0 || this.f12456n == i8) {
                return;
            }
            this.f12456n = i8;
            int i11 = i8 - 1;
            m92559a(0, 1, 1, false, false, f12437F[i11], f12436E[i11]);
            m92554b(f12439w, f12438G[i11], f12440x);
        }

        /* renamed from: b */
        public void m92554b(int i, int i2, int i3) {
            if (this.f12460r != -1 && this.f12461s != i) {
                this.f12444b.setSpan(new ForegroundColorSpan(this.f12461s), this.f12460r, this.f12444b.length(), 33);
            }
            if (i != f12439w) {
                this.f12460r = this.f12444b.length();
                this.f12461s = i;
            }
            if (this.f12462t != -1 && this.f12463u != i2) {
                this.f12444b.setSpan(new BackgroundColorSpan(this.f12463u), this.f12462t, this.f12444b.length(), 33);
            }
            if (i2 != f12440x) {
                this.f12462t = this.f12444b.length();
                this.f12463u = i2;
            }
        }

        /* renamed from: a */
        public static int m92561a(int i, int i2, int i3) {
            return m92560a(i, i2, i3, 0);
        }

        /* renamed from: a */
        public static int m92560a(int i, int i2, int i3, int i4) {
            AbstractC4100b1.m100584a(i, 0, 4);
            AbstractC4100b1.m100584a(i2, 0, 4);
            AbstractC4100b1.m100584a(i3, 0, 4);
            AbstractC4100b1.m100584a(i4, 0, 4);
            return Color.argb(i4 != 2 ? i4 != 3 ? 255 : 0 : 127, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
        }

        /* renamed from: a */
        public void m92559a(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f12458p != -1) {
                if (!z) {
                    this.f12444b.setSpan(new StyleSpan(2), this.f12458p, this.f12444b.length(), 33);
                    this.f12458p = -1;
                }
            } else if (z) {
                this.f12458p = this.f12444b.length();
            }
            if (this.f12459q == -1) {
                if (z2) {
                    this.f12459q = this.f12444b.length();
                }
            } else if (z2) {
            } else {
                this.f12444b.setSpan(new UnderlineSpan(), this.f12459q, this.f12444b.length(), 33);
                this.f12459q = -1;
            }
        }

        /* renamed from: a */
        public void m92562a(int i, int i2) {
            if (this.f12464v != i) {
                m92563a('\n');
            }
            this.f12464v = i;
        }

        /* renamed from: a */
        public void m92557a(boolean z) {
            this.f12446d = z;
        }

        /* renamed from: a */
        public void m92558a(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f12457o = i;
            this.f12454l = i6;
        }
    }

    /* renamed from: a */
    private void m92592a(int i) {
        if (i != 0) {
            if (i == 3) {
                this.f12425n = m92574l();
            } else if (i != 8) {
                switch (i) {
                    case 12:
                        m92568r();
                        return;
                    case 13:
                        this.f12424m.m92563a('\n');
                        return;
                    case 14:
                        return;
                    default:
                        if (i >= 17 && i <= 23) {
                            AbstractC5063oc.m96800d("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                            this.f12419h.m92390d(8);
                            return;
                        } else if (i >= 24 && i <= 31) {
                            AbstractC5063oc.m96800d("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                            this.f12419h.m92390d(16);
                            return;
                        } else {
                            AbstractC5063oc.m96800d("Cea708Decoder", "Invalid C0 command: " + i);
                            return;
                        }
                }
            } else {
                this.f12424m.m92564a();
            }
        }
    }

    @Override // com.applovin.impl.AbstractC3983a3, com.applovin.impl.InterfaceC4749l5
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo92593a() {
        super.mo92593a();
    }

    @Override // com.applovin.impl.AbstractC3983a3, com.applovin.impl.InterfaceC5075ol
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo92591a(long j) {
        super.mo92591a(j);
    }

    @Override // com.applovin.impl.AbstractC3983a3
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo92587b(C5278rl c5278rl) {
        super.mo97861a(c5278rl);
    }
}
