package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c */
/* loaded from: classes4.dex */
public abstract class AbstractC14892c {

    /* renamed from: A0 */
    public static final int f28690A0;

    /* renamed from: B0 */
    public static final int f28692B0;

    /* renamed from: C0 */
    public static final int f28694C0;

    /* renamed from: D0 */
    public static final int f28696D0;

    /* renamed from: E0 */
    public static final int f28698E0;

    /* renamed from: F0 */
    public static final int f28700F0;

    /* renamed from: G0 */
    public static final int f28702G0;

    /* renamed from: H0 */
    public static final int f28704H0;

    /* renamed from: I0 */
    public static final int f28706I0;

    /* renamed from: J0 */
    public static final int f28708J0;

    /* renamed from: K0 */
    public static final int f28710K0;

    /* renamed from: L0 */
    public static final int f28712L0;

    /* renamed from: M0 */
    public static final int f28714M0;

    /* renamed from: N0 */
    public static final int f28716N0;

    /* renamed from: O0 */
    public static final int f28718O0;

    /* renamed from: l0 */
    public static final int f28752l0;

    /* renamed from: m0 */
    public static final int f28754m0;

    /* renamed from: n0 */
    public static final int f28756n0;

    /* renamed from: o0 */
    public static final int f28758o0;

    /* renamed from: p0 */
    public static final int f28760p0;

    /* renamed from: q0 */
    public static final int f28762q0;

    /* renamed from: r0 */
    public static final int f28764r0;

    /* renamed from: s0 */
    public static final int f28766s0;

    /* renamed from: t0 */
    public static final int f28768t0;

    /* renamed from: u0 */
    public static final int f28770u0;

    /* renamed from: v0 */
    public static final int f28772v0;

    /* renamed from: w0 */
    public static final int f28774w0;

    /* renamed from: x0 */
    public static final int f28776x0;

    /* renamed from: y0 */
    public static final int f28778y0;

    /* renamed from: z0 */
    public static final int f28780z0;

    /* renamed from: a */
    public final int f28781a;

    /* renamed from: b */
    public static final int f28731b = AbstractC15133z.m77158a("ftyp");

    /* renamed from: c */
    public static final int f28733c = AbstractC15133z.m77158a("avc1");

    /* renamed from: d */
    public static final int f28735d = AbstractC15133z.m77158a("avc3");

    /* renamed from: e */
    public static final int f28737e = AbstractC15133z.m77158a("hvc1");

    /* renamed from: f */
    public static final int f28739f = AbstractC15133z.m77158a("hev1");

    /* renamed from: g */
    public static final int f28741g = AbstractC15133z.m77158a("s263");

    /* renamed from: h */
    public static final int f28743h = AbstractC15133z.m77158a("d263");

    /* renamed from: i */
    public static final int f28745i = AbstractC15133z.m77158a("mdat");

    /* renamed from: j */
    public static final int f28747j = AbstractC15133z.m77158a("mp4a");

    /* renamed from: k */
    public static final int f28749k = AbstractC15133z.m77158a(".mp3");

    /* renamed from: l */
    public static final int f28751l = AbstractC15133z.m77158a("wave");

    /* renamed from: m */
    public static final int f28753m = AbstractC15133z.m77158a("lpcm");

    /* renamed from: n */
    public static final int f28755n = AbstractC15133z.m77158a("sowt");

    /* renamed from: o */
    public static final int f28757o = AbstractC15133z.m77158a("ac-3");

    /* renamed from: p */
    public static final int f28759p = AbstractC15133z.m77158a("dac3");

    /* renamed from: q */
    public static final int f28761q = AbstractC15133z.m77158a("ec-3");

    /* renamed from: r */
    public static final int f28763r = AbstractC15133z.m77158a("dec3");

    /* renamed from: s */
    public static final int f28765s = AbstractC15133z.m77158a("dtsc");

    /* renamed from: t */
    public static final int f28767t = AbstractC15133z.m77158a("dtsh");

    /* renamed from: u */
    public static final int f28769u = AbstractC15133z.m77158a("dtsl");

    /* renamed from: v */
    public static final int f28771v = AbstractC15133z.m77158a("dtse");

    /* renamed from: w */
    public static final int f28773w = AbstractC15133z.m77158a("ddts");

    /* renamed from: x */
    public static final int f28775x = AbstractC15133z.m77158a("tfdt");

    /* renamed from: y */
    public static final int f28777y = AbstractC15133z.m77158a("tfhd");

    /* renamed from: z */
    public static final int f28779z = AbstractC15133z.m77158a("trex");

    /* renamed from: A */
    public static final int f28689A = AbstractC15133z.m77158a("trun");

    /* renamed from: B */
    public static final int f28691B = AbstractC15133z.m77158a("sidx");

    /* renamed from: C */
    public static final int f28693C = AbstractC15133z.m77158a("moov");

    /* renamed from: D */
    public static final int f28695D = AbstractC15133z.m77158a("mvhd");

    /* renamed from: E */
    public static final int f28697E = AbstractC15133z.m77158a("trak");

    /* renamed from: F */
    public static final int f28699F = AbstractC15133z.m77158a("mdia");

    /* renamed from: G */
    public static final int f28701G = AbstractC15133z.m77158a("minf");

    /* renamed from: H */
    public static final int f28703H = AbstractC15133z.m77158a("stbl");

    /* renamed from: I */
    public static final int f28705I = AbstractC15133z.m77158a("avcC");

    /* renamed from: J */
    public static final int f28707J = AbstractC15133z.m77158a("hvcC");

    /* renamed from: K */
    public static final int f28709K = AbstractC15133z.m77158a("esds");

    /* renamed from: L */
    public static final int f28711L = AbstractC15133z.m77158a("moof");

    /* renamed from: M */
    public static final int f28713M = AbstractC15133z.m77158a("traf");

    /* renamed from: N */
    public static final int f28715N = AbstractC15133z.m77158a("mvex");

    /* renamed from: O */
    public static final int f28717O = AbstractC15133z.m77158a("mehd");

    /* renamed from: P */
    public static final int f28719P = AbstractC15133z.m77158a("tkhd");

    /* renamed from: Q */
    public static final int f28720Q = AbstractC15133z.m77158a("edts");

    /* renamed from: R */
    public static final int f28721R = AbstractC15133z.m77158a("elst");

    /* renamed from: S */
    public static final int f28722S = AbstractC15133z.m77158a("mdhd");

    /* renamed from: T */
    public static final int f28723T = AbstractC15133z.m77158a("hdlr");

    /* renamed from: U */
    public static final int f28724U = AbstractC15133z.m77158a("stsd");

    /* renamed from: V */
    public static final int f28725V = AbstractC15133z.m77158a("pssh");

    /* renamed from: W */
    public static final int f28726W = AbstractC15133z.m77158a("sinf");

    /* renamed from: X */
    public static final int f28727X = AbstractC15133z.m77158a("schm");

    /* renamed from: Y */
    public static final int f28728Y = AbstractC15133z.m77158a("schi");

    /* renamed from: Z */
    public static final int f28729Z = AbstractC15133z.m77158a("tenc");

    /* renamed from: a0 */
    public static final int f28730a0 = AbstractC15133z.m77158a("encv");

    /* renamed from: b0 */
    public static final int f28732b0 = AbstractC15133z.m77158a("enca");

    /* renamed from: c0 */
    public static final int f28734c0 = AbstractC15133z.m77158a("frma");

    /* renamed from: d0 */
    public static final int f28736d0 = AbstractC15133z.m77158a("saiz");

    /* renamed from: e0 */
    public static final int f28738e0 = AbstractC15133z.m77158a("saio");

    /* renamed from: f0 */
    public static final int f28740f0 = AbstractC15133z.m77158a("sbgp");

    /* renamed from: g0 */
    public static final int f28742g0 = AbstractC15133z.m77158a("sgpd");

    /* renamed from: h0 */
    public static final int f28744h0 = AbstractC15133z.m77158a(CommonUrlParts.UUID);

    /* renamed from: i0 */
    public static final int f28746i0 = AbstractC15133z.m77158a("senc");

    /* renamed from: j0 */
    public static final int f28748j0 = AbstractC15133z.m77158a("pasp");

    /* renamed from: k0 */
    public static final int f28750k0 = AbstractC15133z.m77158a("TTML");

    static {
        AbstractC15133z.m77158a("vmhd");
        f28752l0 = AbstractC15133z.m77158a("mp4v");
        f28754m0 = AbstractC15133z.m77158a("stts");
        f28756n0 = AbstractC15133z.m77158a("stss");
        f28758o0 = AbstractC15133z.m77158a("ctts");
        f28760p0 = AbstractC15133z.m77158a("stsc");
        f28762q0 = AbstractC15133z.m77158a("stsz");
        f28764r0 = AbstractC15133z.m77158a("stz2");
        f28766s0 = AbstractC15133z.m77158a("stco");
        f28768t0 = AbstractC15133z.m77158a("co64");
        f28770u0 = AbstractC15133z.m77158a("tx3g");
        f28772v0 = AbstractC15133z.m77158a("wvtt");
        f28774w0 = AbstractC15133z.m77158a("stpp");
        f28776x0 = AbstractC15133z.m77158a("c608");
        f28778y0 = AbstractC15133z.m77158a("samr");
        f28780z0 = AbstractC15133z.m77158a("sawb");
        f28690A0 = AbstractC15133z.m77158a("udta");
        f28692B0 = AbstractC15133z.m77158a("meta");
        f28694C0 = AbstractC15133z.m77158a("ilst");
        f28696D0 = AbstractC15133z.m77158a("mean");
        f28698E0 = AbstractC15133z.m77158a("name");
        f28700F0 = AbstractC15133z.m77158a("data");
        f28702G0 = AbstractC15133z.m77158a("emsg");
        f28704H0 = AbstractC15133z.m77158a("st3d");
        f28706I0 = AbstractC15133z.m77158a("sv3d");
        f28708J0 = AbstractC15133z.m77158a("proj");
        f28710K0 = AbstractC15133z.m77158a("vp08");
        f28712L0 = AbstractC15133z.m77158a("vp09");
        f28714M0 = AbstractC15133z.m77158a("vpcC");
        f28716N0 = AbstractC15133z.m77158a("camm");
        f28718O0 = AbstractC15133z.m77158a("alac");
    }

    public AbstractC14892c(int i) {
        this.f28781a = i;
    }

    /* renamed from: a */
    public static String m77462a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        return m77462a(this.f28781a);
    }
}
