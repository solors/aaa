package p1038x5;

import android.os.Bundle;
import com.meevii.adsdk.common.AdType;
import com.meevii.adsdk.common.Platform;
import com.meevii.adsdk.core.config.model.Segment;
import java.util.List;

/* renamed from: x5.a */
/* loaded from: classes6.dex */
public class AdUnit {

    /* renamed from: a */
    private String f117429a;

    /* renamed from: b */
    private String f117430b;

    /* renamed from: c */
    private String f117431c;

    /* renamed from: d */
    private int f117432d;

    /* renamed from: e */
    private int f117433e;

    /* renamed from: f */
    private double f117434f;

    /* renamed from: g */
    private double f117435g;

    /* renamed from: h */
    private Platform f117436h;

    /* renamed from: i */
    private AdType f117437i;

    /* renamed from: j */
    private String f117438j;

    /* renamed from: k */
    private List<RequestAttachNetworkInfo> f117439k;

    /* renamed from: l */
    private String f117440l;

    /* renamed from: m */
    private String f117441m;

    /* renamed from: n */
    private Segment f117442n;

    /* renamed from: o */
    private String f117443o;

    /* renamed from: p */
    private String f117444p;

    /* renamed from: q */
    private String f117445q;

    /* renamed from: f */
    public static double m2000f(Bundle bundle) {
        return bundle.getDouble("ad_value", 0.0d) * 1000.0d;
    }

    /* renamed from: A */
    public void m2014A(String str) {
        this.f117445q = str;
    }

    /* renamed from: B */
    public void m2013B(Platform platform) {
        this.f117436h = platform;
    }

    /* renamed from: C */
    public void m2012C(int i) {
        this.f117432d = i;
    }

    /* renamed from: D */
    public void m2011D(int i) {
        this.f117433e = i;
    }

    /* renamed from: E */
    public void m2010E(String str) {
        this.f117441m = str;
    }

    /* renamed from: F */
    public void m2009F(String str) {
        this.f117440l = str;
    }

    /* renamed from: G */
    public void m2008G(Segment segment) {
        this.f117442n = segment;
    }

    /* renamed from: H */
    public void m2007H(String str) {
        this.f117444p = str;
    }

    /* renamed from: I */
    public void m2006I(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        double m2000f = m2000f(bundle);
        if (m2000f > 0.0d) {
            m1983w(m2000f);
        }
        m2009F(bundle.getString("secondary_network", ""));
        m2010E(bundle.getString("secondary_ad_unit_id", ""));
    }

    /* renamed from: a */
    public AdType m2005a() {
        return this.f117437i;
    }

    /* renamed from: b */
    public String m2004b() {
        return this.f117430b;
    }

    /* renamed from: c */
    public String m2003c() {
        return this.f117443o;
    }

    /* renamed from: d */
    public double m2002d() {
        return this.f117435g;
    }

    /* renamed from: e */
    public double m2001e() {
        return this.f117434f;
    }

    /* renamed from: g */
    public String m1999g() {
        return this.f117438j;
    }

    /* renamed from: h */
    public String m1998h() {
        return this.f117429a;
    }

    /* renamed from: i */
    public String m1997i() {
        return this.f117445q;
    }

    /* renamed from: j */
    public Platform m1996j() {
        return this.f117436h;
    }

    /* renamed from: k */
    public RequestAttachNetworkInfo m1995k(Platform platform) {
        for (RequestAttachNetworkInfo requestAttachNetworkInfo : this.f117439k) {
            if (platform == requestAttachNetworkInfo.m1943c()) {
                return requestAttachNetworkInfo;
            }
        }
        return null;
    }

    /* renamed from: l */
    public int m1994l() {
        return this.f117433e;
    }

    /* renamed from: m */
    public String m1993m() {
        return this.f117441m;
    }

    /* renamed from: n */
    public String m1992n() {
        return this.f117440l;
    }

    /* renamed from: o */
    public Segment m1991o() {
        return this.f117442n;
    }

    /* renamed from: p */
    public String m1990p() {
        Segment segment = this.f117442n;
        if (segment == null) {
            return "void";
        }
        return segment.getSegmentMsg();
    }

    /* renamed from: q */
    public String m1989q() {
        return this.f117444p;
    }

    /* renamed from: r */
    public void m1988r(AdType adType) {
        this.f117437i = adType;
    }

    /* renamed from: s */
    public void m1987s(String str) {
        this.f117430b = str;
    }

    /* renamed from: t */
    public void m1986t(String str) {
        this.f117443o = str;
    }

    /* renamed from: u */
    public void m1985u(List<RequestAttachNetworkInfo> list) {
        this.f117439k = list;
    }

    /* renamed from: v */
    public void m1984v(double d) {
        this.f117435g = d;
    }

    /* renamed from: w */
    public void m1983w(double d) {
        this.f117434f = d;
    }

    /* renamed from: x */
    public void m1982x(String str) {
        this.f117431c = str;
    }

    /* renamed from: y */
    public void m1981y(String str) {
        this.f117438j = str;
    }

    /* renamed from: z */
    public void m1980z(String str) {
        this.f117429a = str;
    }
}
