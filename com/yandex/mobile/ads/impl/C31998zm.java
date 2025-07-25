package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.maticoo.sdk.utils.error.ErrorCode;
import com.yandex.mobile.ads.impl.C31840xt;
import com.yandex.mobile.ads.impl.C31998zm;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.zm */
/* loaded from: classes8.dex */
public final class C31998zm extends AbstractC29951an {

    /* renamed from: g */
    private final cc1 f88946g = new cc1();

    /* renamed from: h */
    private final bc1 f88947h = new bc1();

    /* renamed from: i */
    private int f88948i = -1;

    /* renamed from: j */
    private final int f88949j;

    /* renamed from: k */
    private final C32000b[] f88950k;

    /* renamed from: l */
    private C32000b f88951l;
    @Nullable

    /* renamed from: m */
    private List<C31840xt> f88952m;
    @Nullable

    /* renamed from: n */
    private List<C31840xt> f88953n;
    @Nullable

    /* renamed from: o */
    private C32001c f88954o;

    /* renamed from: p */
    private int f88955p;

    /* renamed from: com.yandex.mobile.ads.impl.zm$a */
    /* loaded from: classes8.dex */
    public static final class C31999a {

        /* renamed from: c */
        private static final Comparator<C31999a> f88956c = new Comparator() { // from class: com.yandex.mobile.ads.impl.x13
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m26136a;
                m26136a = C31998zm.C31999a.m26136a((C31998zm.C31999a) obj, (C31998zm.C31999a) obj2);
                return m26136a;
            }
        };

        /* renamed from: a */
        public final C31840xt f88957a;

        /* renamed from: b */
        public final int f88958b;

        public C31999a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
            C31840xt.C31841a m27232d = new C31840xt.C31841a().m27244a(spannableStringBuilder).m27239b(alignment).m27248a(0, f).m27249a(i).m27242b(f2).m27241b(i2).m27232d(-3.4028235E38f);
            if (z) {
                m27232d.m27231d(i3);
            }
            this.f88957a = m27232d.m27251a();
            this.f88958b = i4;
        }

        /* renamed from: a */
        public static /* synthetic */ int m26136a(C31999a c31999a, C31999a c31999a2) {
            return Integer.compare(c31999a2.f88958b, c31999a.f88958b);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zm$b */
    /* loaded from: classes8.dex */
    public static final class C32000b {

        /* renamed from: A */
        private static final int[] f88959A;

        /* renamed from: B */
        private static final boolean[] f88960B;

        /* renamed from: C */
        private static final int[] f88961C;

        /* renamed from: D */
        private static final int[] f88962D;

        /* renamed from: E */
        private static final int[] f88963E;

        /* renamed from: F */
        private static final int[] f88964F;

        /* renamed from: w */
        public static final int f88965w = m26115a(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f88966x;

        /* renamed from: y */
        private static final int[] f88967y;

        /* renamed from: z */
        private static final int[] f88968z;

        /* renamed from: a */
        private final ArrayList f88969a = new ArrayList();

        /* renamed from: b */
        private final SpannableStringBuilder f88970b = new SpannableStringBuilder();

        /* renamed from: c */
        private boolean f88971c;

        /* renamed from: d */
        private boolean f88972d;

        /* renamed from: e */
        private int f88973e;

        /* renamed from: f */
        private boolean f88974f;

        /* renamed from: g */
        private int f88975g;

        /* renamed from: h */
        private int f88976h;

        /* renamed from: i */
        private int f88977i;

        /* renamed from: j */
        private int f88978j;

        /* renamed from: k */
        private boolean f88979k;

        /* renamed from: l */
        private int f88980l;

        /* renamed from: m */
        private int f88981m;

        /* renamed from: n */
        private int f88982n;

        /* renamed from: o */
        private int f88983o;

        /* renamed from: p */
        private int f88984p;

        /* renamed from: q */
        private int f88985q;

        /* renamed from: r */
        private int f88986r;

        /* renamed from: s */
        private int f88987s;

        /* renamed from: t */
        private int f88988t;

        /* renamed from: u */
        private int f88989u;

        /* renamed from: v */
        private int f88990v;

        static {
            int m26115a = m26115a(0, 0, 0, 0);
            f88966x = m26115a;
            int m26115a2 = m26115a(0, 0, 0, 3);
            f88967y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f88968z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f88959A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f88960B = new boolean[]{false, false, false, true, true, true, false};
            f88961C = new int[]{m26115a, m26115a2, m26115a, m26115a, m26115a2, m26115a, m26115a};
            f88962D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f88963E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f88964F = new int[]{m26115a, m26115a, m26115a, m26115a, m26115a, m26115a2, m26115a2};
        }

        public C32000b() {
            m26112b();
        }

        /* renamed from: a */
        public final void m26117a(char c) {
            if (c == '\n') {
                this.f88969a.add(m26118a());
                this.f88970b.clear();
                if (this.f88984p != -1) {
                    this.f88984p = 0;
                }
                if (this.f88985q != -1) {
                    this.f88985q = 0;
                }
                if (this.f88986r != -1) {
                    this.f88986r = 0;
                }
                if (this.f88988t != -1) {
                    this.f88988t = 0;
                }
                while (true) {
                    if ((!this.f88979k || this.f88969a.size() < this.f88978j) && this.f88969a.size() < 15) {
                        return;
                    }
                    this.f88969a.remove(0);
                }
            } else {
                this.f88970b.append(c);
            }
        }

        /* renamed from: b */
        public final void m26112b() {
            this.f88969a.clear();
            this.f88970b.clear();
            this.f88984p = -1;
            this.f88985q = -1;
            this.f88986r = -1;
            this.f88988t = -1;
            this.f88990v = 0;
            this.f88971c = false;
            this.f88972d = false;
            this.f88973e = 4;
            this.f88974f = false;
            this.f88975g = 0;
            this.f88976h = 0;
            this.f88977i = 0;
            this.f88978j = 15;
            this.f88979k = true;
            this.f88980l = 0;
            this.f88981m = 0;
            this.f88982n = 0;
            int i = f88966x;
            this.f88983o = i;
            this.f88987s = f88965w;
            this.f88989u = i;
        }

        /* renamed from: a */
        public static int m26115a(int i, int i2, int i3, int i4) {
            C30937nf.m31572a(i, 4);
            C30937nf.m31572a(i2, 4);
            C30937nf.m31572a(i3, 4);
            C30937nf.m31572a(i4, 4);
            return Color.argb(i4 != 2 ? i4 != 3 ? 255 : 0 : 127, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
        }

        /* renamed from: a */
        public final void m26113a(boolean z, boolean z2) {
            if (this.f88984p != -1) {
                if (!z) {
                    this.f88970b.setSpan(new StyleSpan(2), this.f88984p, this.f88970b.length(), 33);
                    this.f88984p = -1;
                }
            } else if (z) {
                this.f88984p = this.f88970b.length();
            }
            if (this.f88985q == -1) {
                if (z2) {
                    this.f88985q = this.f88970b.length();
                }
            } else if (z2) {
            } else {
                this.f88970b.setSpan(new UnderlineSpan(), this.f88985q, this.f88970b.length(), 33);
                this.f88985q = -1;
            }
        }

        /* renamed from: a */
        public final void m26116a(int i, int i2) {
            if (this.f88986r != -1 && this.f88987s != i) {
                this.f88970b.setSpan(new ForegroundColorSpan(this.f88987s), this.f88986r, this.f88970b.length(), 33);
            }
            if (i != f88965w) {
                this.f88986r = this.f88970b.length();
                this.f88987s = i;
            }
            if (this.f88988t != -1 && this.f88989u != i2) {
                this.f88970b.setSpan(new BackgroundColorSpan(this.f88989u), this.f88988t, this.f88970b.length(), 33);
            }
            if (i2 != f88966x) {
                this.f88988t = this.f88970b.length();
                this.f88989u = i2;
            }
        }

        /* renamed from: a */
        public final SpannableString m26118a() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f88970b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f88984p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f88984p, length, 33);
                }
                if (this.f88985q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f88985q, length, 33);
                }
                if (this.f88986r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f88987s), this.f88986r, length, 33);
                }
                if (this.f88988t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f88989u), this.f88988t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zm$c */
    /* loaded from: classes8.dex */
    public static final class C32001c {

        /* renamed from: a */
        public final int f88991a;

        /* renamed from: b */
        public final int f88992b;

        /* renamed from: c */
        public final byte[] f88993c;

        /* renamed from: d */
        int f88994d = 0;

        public C32001c(int i, int i2) {
            this.f88991a = i;
            this.f88992b = i2;
            this.f88993c = new byte[(i2 * 2) - 1];
        }
    }

    public C31998zm(int i, @Nullable List<byte[]> list) {
        this.f88949j = i == -1 ? 1 : i;
        if (list != null) {
            C30575ip.m33157a(list);
        }
        this.f88950k = new C32000b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f88950k[i2] = new C32000b();
        }
        this.f88951l = this.f88950k[0];
    }

    /* renamed from: i */
    private void m26138i() {
        boolean z;
        int i;
        char c;
        C32000b c32000b;
        C32001c c32001c = this.f88954o;
        if (c32001c == null) {
            return;
        }
        int i2 = 2;
        if (c32001c.f88994d != (c32001c.f88992b * 2) - 1) {
            gq0.m33798a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f88954o.f88992b * 2) - 1) + ", but current index is " + this.f88954o.f88994d + " (sequence number " + this.f88954o.f88991a + ");");
        }
        bc1 bc1Var = this.f88947h;
        C32001c c32001c2 = this.f88954o;
        bc1Var.m35505a(c32001c2.f88994d, c32001c2.f88993c);
        boolean z2 = false;
        while (true) {
            if (this.f88947h.m35503b() > 0) {
                int i3 = 3;
                int m35502b = this.f88947h.m35502b(3);
                int m35502b2 = this.f88947h.m35502b(5);
                int i4 = 7;
                if (m35502b == 7) {
                    this.f88947h.m35497d(i2);
                    m35502b = this.f88947h.m35502b(6);
                    if (m35502b < 7) {
                        zo0.m26074a("Invalid extended service number: ", m35502b, "Cea708Decoder");
                    }
                }
                if (m35502b2 == 0) {
                    if (m35502b != 0) {
                        gq0.m33792d("Cea708Decoder", "serviceNumber is non-zero (" + m35502b + ") when blockSize is 0");
                    }
                } else if (m35502b != this.f88949j) {
                    this.f88947h.m35495e(m35502b2);
                } else {
                    int m35496e = (m35502b2 * 8) + this.f88947h.m35496e();
                    while (this.f88947h.m35496e() < m35496e) {
                        int m35502b3 = this.f88947h.m35502b(8);
                        if (m35502b3 == 16) {
                            z = true;
                            int m35502b4 = this.f88947h.m35502b(8);
                            if (m35502b4 <= 31) {
                                i4 = 7;
                                if (m35502b4 > 7) {
                                    if (m35502b4 <= 15) {
                                        this.f88947h.m35497d(8);
                                    } else if (m35502b4 <= 23) {
                                        this.f88947h.m35497d(16);
                                    } else if (m35502b4 <= 31) {
                                        this.f88947h.m35497d(24);
                                    }
                                }
                            } else {
                                i4 = 7;
                                if (m35502b4 <= 127) {
                                    if (m35502b4 == 32) {
                                        this.f88951l.m26117a(' ');
                                    } else if (m35502b4 == 33) {
                                        this.f88951l.m26117a((char) 160);
                                    } else if (m35502b4 == 37) {
                                        this.f88951l.m26117a((char) 8230);
                                    } else if (m35502b4 == 42) {
                                        this.f88951l.m26117a((char) 352);
                                    } else if (m35502b4 == 44) {
                                        this.f88951l.m26117a((char) 338);
                                    } else if (m35502b4 == 63) {
                                        this.f88951l.m26117a((char) 376);
                                    } else if (m35502b4 == 57) {
                                        this.f88951l.m26117a((char) 8482);
                                    } else if (m35502b4 == 58) {
                                        this.f88951l.m26117a((char) 353);
                                    } else if (m35502b4 == 60) {
                                        this.f88951l.m26117a((char) 339);
                                    } else if (m35502b4 != 61) {
                                        switch (m35502b4) {
                                            case 48:
                                                this.f88951l.m26117a((char) 9608);
                                                break;
                                            case 49:
                                                this.f88951l.m26117a((char) 8216);
                                                break;
                                            case 50:
                                                this.f88951l.m26117a((char) 8217);
                                                break;
                                            case 51:
                                                this.f88951l.m26117a((char) 8220);
                                                break;
                                            case 52:
                                                this.f88951l.m26117a((char) 8221);
                                                break;
                                            case 53:
                                                this.f88951l.m26117a((char) 8226);
                                                break;
                                            default:
                                                switch (m35502b4) {
                                                    case 118:
                                                        this.f88951l.m26117a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f88951l.m26117a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.f88951l.m26117a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.f88951l.m26117a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f88951l.m26117a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.f88951l.m26117a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f88951l.m26117a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.f88951l.m26117a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f88951l.m26117a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f88951l.m26117a((char) 9484);
                                                        break;
                                                    default:
                                                        zo0.m26074a("Invalid G2 character: ", m35502b4, "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f88951l.m26117a((char) 8480);
                                    }
                                    i = 2;
                                    c = 6;
                                    z2 = z;
                                } else if (m35502b4 > 159) {
                                    i = 2;
                                    c = 6;
                                    if (m35502b4 <= 255) {
                                        if (m35502b4 == 160) {
                                            this.f88951l.m26117a((char) 13252);
                                        } else {
                                            zo0.m26074a("Invalid G3 character: ", m35502b4, "Cea708Decoder");
                                            this.f88951l.m26117a('_');
                                        }
                                        z2 = z;
                                    } else {
                                        zo0.m26074a("Invalid extended command: ", m35502b4, "Cea708Decoder");
                                    }
                                } else if (m35502b4 <= 135) {
                                    this.f88947h.m35497d(32);
                                } else if (m35502b4 <= 143) {
                                    this.f88947h.m35497d(40);
                                } else if (m35502b4 <= 159) {
                                    i = 2;
                                    this.f88947h.m35497d(2);
                                    c = 6;
                                    this.f88947h.m35497d(this.f88947h.m35502b(6) * 8);
                                }
                            }
                            i = 2;
                            c = 6;
                        } else if (m35502b3 <= 31) {
                            if (m35502b3 != 0) {
                                if (m35502b3 == i3) {
                                    this.f88952m = m26137j();
                                } else if (m35502b3 != 8) {
                                    switch (m35502b3) {
                                        case 12:
                                            for (int i5 = 0; i5 < 8; i5++) {
                                                this.f88950k[i5].m26112b();
                                            }
                                            break;
                                        case 13:
                                            this.f88951l.m26117a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (m35502b3 < 17 || m35502b3 > 23) {
                                                if (m35502b3 >= 24 && m35502b3 <= 31) {
                                                    zo0.m26074a("Currently unsupported COMMAND_P16 Command: ", m35502b3, "Cea708Decoder");
                                                    this.f88947h.m35497d(16);
                                                    break;
                                                } else {
                                                    zo0.m26074a("Invalid C0 command: ", m35502b3, "Cea708Decoder");
                                                    break;
                                                }
                                            } else {
                                                zo0.m26074a("Currently unsupported COMMAND_EXT1 Command: ", m35502b3, "Cea708Decoder");
                                                this.f88947h.m35497d(8);
                                                break;
                                            }
                                    }
                                } else {
                                    C32000b c32000b2 = this.f88951l;
                                    int length = c32000b2.f88970b.length();
                                    if (length > 0) {
                                        c32000b2.f88970b.delete(length - 1, length);
                                    }
                                }
                            }
                            i = i2;
                            z = true;
                            c = 6;
                        } else {
                            if (m35502b3 > 127) {
                                if (m35502b3 <= 159) {
                                    switch (m35502b3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z = true;
                                            int i6 = m35502b3 - 128;
                                            if (this.f88955p != i6) {
                                                this.f88955p = i6;
                                                this.f88951l = this.f88950k[i6];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z = true;
                                            for (int i7 = 1; i7 <= 8; i7++) {
                                                if (this.f88947h.m35494f()) {
                                                    C32000b c32000b3 = this.f88950k[8 - i7];
                                                    c32000b3.f88969a.clear();
                                                    c32000b3.f88970b.clear();
                                                    c32000b3.f88984p = -1;
                                                    c32000b3.f88985q = -1;
                                                    c32000b3.f88986r = -1;
                                                    c32000b3.f88988t = -1;
                                                    c32000b3.f88990v = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i8 = 1; i8 <= 8; i8++) {
                                                if (this.f88947h.m35494f()) {
                                                    this.f88950k[8 - i8].f88972d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (this.f88947h.m35494f()) {
                                                    this.f88950k[8 - i9].f88972d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (this.f88947h.m35494f()) {
                                                    this.f88950k[8 - i10].f88972d = !c32000b.f88972d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case IronSourceConstants.USING_CACHE_FOR_INIT_EVENT /* 140 */:
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (this.f88947h.m35494f()) {
                                                    this.f88950k[8 - i11].m26112b();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case ErrorCode.CODE_INIT_DEVICE_ERROR /* 141 */:
                                            this.f88947h.m35497d(8);
                                            z = true;
                                            break;
                                        case 142:
                                            break;
                                        case 143:
                                            for (int i12 = 0; i12 < 8; i12++) {
                                                this.f88950k[i12].m26112b();
                                            }
                                            z = true;
                                            break;
                                        case 144:
                                            if (!this.f88951l.f88971c) {
                                                this.f88947h.m35497d(16);
                                                z = true;
                                                i3 = 3;
                                                break;
                                            } else {
                                                this.f88947h.m35502b(4);
                                                this.f88947h.m35502b(2);
                                                this.f88947h.m35502b(2);
                                                boolean m35494f = this.f88947h.m35494f();
                                                boolean m35494f2 = this.f88947h.m35494f();
                                                i3 = 3;
                                                this.f88947h.m35502b(3);
                                                this.f88947h.m35502b(3);
                                                this.f88951l.m26113a(m35494f, m35494f2);
                                                z = true;
                                            }
                                        case 145:
                                            if (!this.f88951l.f88971c) {
                                                this.f88947h.m35497d(24);
                                            } else {
                                                int m26115a = C32000b.m26115a(this.f88947h.m35502b(2), this.f88947h.m35502b(2), this.f88947h.m35502b(2), this.f88947h.m35502b(2));
                                                int m26115a2 = C32000b.m26115a(this.f88947h.m35502b(2), this.f88947h.m35502b(2), this.f88947h.m35502b(2), this.f88947h.m35502b(2));
                                                this.f88947h.m35497d(2);
                                                C32000b.m26115a(this.f88947h.m35502b(2), this.f88947h.m35502b(2), this.f88947h.m35502b(2), 0);
                                                this.f88951l.m26116a(m26115a, m26115a2);
                                            }
                                            z = true;
                                            i3 = 3;
                                            break;
                                        case 146:
                                            if (!this.f88951l.f88971c) {
                                                this.f88947h.m35497d(16);
                                            } else {
                                                this.f88947h.m35497d(4);
                                                int m35502b5 = this.f88947h.m35502b(4);
                                                this.f88947h.m35497d(2);
                                                this.f88947h.m35502b(6);
                                                C32000b c32000b4 = this.f88951l;
                                                if (c32000b4.f88990v != m35502b5) {
                                                    c32000b4.m26117a('\n');
                                                }
                                                c32000b4.f88990v = m35502b5;
                                            }
                                            z = true;
                                            i3 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            z = true;
                                            zo0.m26074a("Invalid C1 command: ", m35502b3, "Cea708Decoder");
                                            break;
                                        case ErrorCode.CODE_INIT_UNKNOWN_ERROR /* 151 */:
                                            if (!this.f88951l.f88971c) {
                                                this.f88947h.m35497d(32);
                                            } else {
                                                int m26115a3 = C32000b.m26115a(this.f88947h.m35502b(2), this.f88947h.m35502b(2), this.f88947h.m35502b(2), this.f88947h.m35502b(2));
                                                this.f88947h.m35502b(2);
                                                C32000b.m26115a(this.f88947h.m35502b(2), this.f88947h.m35502b(2), this.f88947h.m35502b(2), 0);
                                                this.f88947h.m35494f();
                                                this.f88947h.m35494f();
                                                this.f88947h.m35502b(2);
                                                this.f88947h.m35502b(2);
                                                int m35502b6 = this.f88947h.m35502b(2);
                                                this.f88947h.m35497d(8);
                                                C32000b c32000b5 = this.f88951l;
                                                c32000b5.f88983o = m26115a3;
                                                c32000b5.f88980l = m35502b6;
                                            }
                                            z = true;
                                            i3 = 3;
                                            break;
                                        case ErrorCode.CODE_NOT_TRACK_STATUS /* 152 */:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i13 = m35502b3 - 152;
                                            C32000b c32000b6 = this.f88950k[i13];
                                            this.f88947h.m35497d(i2);
                                            boolean m35494f3 = this.f88947h.m35494f();
                                            boolean m35494f4 = this.f88947h.m35494f();
                                            this.f88947h.m35494f();
                                            int m35502b7 = this.f88947h.m35502b(i3);
                                            boolean m35494f5 = this.f88947h.m35494f();
                                            int m35502b8 = this.f88947h.m35502b(i4);
                                            int m35502b9 = this.f88947h.m35502b(8);
                                            int m35502b10 = this.f88947h.m35502b(4);
                                            int m35502b11 = this.f88947h.m35502b(4);
                                            this.f88947h.m35497d(i2);
                                            this.f88947h.m35502b(6);
                                            this.f88947h.m35497d(i2);
                                            int m35502b12 = this.f88947h.m35502b(3);
                                            int m35502b13 = this.f88947h.m35502b(3);
                                            c32000b6.f88971c = true;
                                            c32000b6.f88972d = m35494f3;
                                            c32000b6.f88979k = m35494f4;
                                            c32000b6.f88973e = m35502b7;
                                            c32000b6.f88974f = m35494f5;
                                            c32000b6.f88975g = m35502b8;
                                            c32000b6.f88976h = m35502b9;
                                            c32000b6.f88977i = m35502b10;
                                            int i14 = m35502b11 + 1;
                                            if (c32000b6.f88978j != i14) {
                                                c32000b6.f88978j = i14;
                                                while (true) {
                                                    if ((m35494f4 && c32000b6.f88969a.size() >= c32000b6.f88978j) || c32000b6.f88969a.size() >= 15) {
                                                        c32000b6.f88969a.remove(0);
                                                    }
                                                }
                                            }
                                            if (m35502b12 != 0 && c32000b6.f88981m != m35502b12) {
                                                c32000b6.f88981m = m35502b12;
                                                int i15 = m35502b12 - 1;
                                                int i16 = C32000b.f88961C[i15];
                                                boolean z3 = C32000b.f88960B[i15];
                                                int i17 = C32000b.f88968z[i15];
                                                int i18 = C32000b.f88959A[i15];
                                                int i19 = C32000b.f88967y[i15];
                                                c32000b6.f88983o = i16;
                                                c32000b6.f88980l = i19;
                                            }
                                            if (m35502b13 != 0 && c32000b6.f88982n != m35502b13) {
                                                c32000b6.f88982n = m35502b13;
                                                int i20 = m35502b13 - 1;
                                                int i21 = C32000b.f88963E[i20];
                                                int i22 = C32000b.f88962D[i20];
                                                c32000b6.m26113a(false, false);
                                                c32000b6.m26116a(C32000b.f88965w, C32000b.f88964F[i20]);
                                            }
                                            if (this.f88955p != i13) {
                                                this.f88955p = i13;
                                                this.f88951l = this.f88950k[i13];
                                            }
                                            z = true;
                                            i3 = 3;
                                            break;
                                    }
                                    c = 6;
                                    z2 = z;
                                } else {
                                    z = true;
                                    if (m35502b3 <= 255) {
                                        this.f88951l.m26117a((char) (m35502b3 & 255));
                                    } else {
                                        zo0.m26074a("Invalid base command: ", m35502b3, "Cea708Decoder");
                                        i4 = 7;
                                        i = 2;
                                        c = 6;
                                    }
                                }
                                i4 = 7;
                                i = 2;
                                c = 6;
                                z2 = z;
                            } else if (m35502b3 == 127) {
                                this.f88951l.m26117a((char) 9835);
                            } else {
                                this.f88951l.m26117a((char) (m35502b3 & 255));
                            }
                            i = i2;
                            z = true;
                            c = 6;
                            z2 = z;
                        }
                        i2 = i;
                    }
                }
            }
        }
        if (z2) {
            this.f88952m = m26137j();
        }
        this.f88954o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0105  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.yandex.mobile.ads.impl.C31840xt> m26137j() {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C31998zm.m26137j():java.util.List");
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC29951an
    /* renamed from: b */
    protected final void mo26141b(sy1 sy1Var) {
        boolean z;
        ByteBuffer byteBuffer = sy1Var.f79793d;
        byteBuffer.getClass();
        this.f88946g.m35296a(byteBuffer.limit(), byteBuffer.array());
        while (this.f88946g.m35299a() >= 3) {
            int m35270t = this.f88946g.m35270t();
            int i = m35270t & 3;
            if ((m35270t & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            byte m35270t2 = (byte) this.f88946g.m35270t();
            byte m35270t3 = (byte) this.f88946g.m35270t();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m26138i();
                        int i2 = (m35270t2 & 192) >> 6;
                        int i3 = this.f88948i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            for (int i4 = 0; i4 < 8; i4++) {
                                this.f88950k[i4].m26112b();
                            }
                            gq0.m33792d("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f88948i + " current=" + i2);
                        }
                        this.f88948i = i2;
                        int i5 = m35270t2 & 63;
                        if (i5 == 0) {
                            i5 = 64;
                        }
                        C32001c c32001c = new C32001c(i2, i5);
                        this.f88954o = c32001c;
                        byte[] bArr = c32001c.f88993c;
                        c32001c.f88994d = 1;
                        bArr[0] = m35270t3;
                    } else if (i == 2) {
                        C32001c c32001c2 = this.f88954o;
                        if (c32001c2 == null) {
                            gq0.m33795b("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c32001c2.f88993c;
                            int i6 = c32001c2.f88994d;
                            bArr2[i6] = m35270t2;
                            c32001c2.f88994d = i6 + 2;
                            bArr2[i6 + 1] = m35270t3;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                    C32001c c32001c3 = this.f88954o;
                    if (c32001c3.f88994d == (c32001c3.f88992b * 2) - 1) {
                        m26138i();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC29951an
    /* renamed from: c */
    protected final oy1 mo26140c() {
        List<C31840xt> list = this.f88952m;
        this.f88953n = list;
        list.getClass();
        return new C30035bn(list);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC29951an, com.yandex.mobile.ads.impl.InterfaceC30196dx
    public final void flush() {
        super.flush();
        this.f88952m = null;
        this.f88953n = null;
        this.f88955p = 0;
        this.f88951l = this.f88950k[0];
        for (int i = 0; i < 8; i++) {
            this.f88950k[i].m26112b();
        }
        this.f88954o = null;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC29951an
    /* renamed from: h */
    protected final boolean mo26139h() {
        if (this.f88952m != this.f88953n) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30196dx
    public final /* bridge */ /* synthetic */ void release() {
    }
}
