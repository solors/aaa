package com.smaato.sdk.core.violationreporter;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.violationreporter.Report;
import java.util.List;

/* renamed from: com.smaato.sdk.core.violationreporter.b */
/* loaded from: classes7.dex */
final class AutoValue_Report extends Report {

    /* renamed from: a */
    private final String f71981a;

    /* renamed from: b */
    private final String f71982b;

    /* renamed from: c */
    private final String f71983c;

    /* renamed from: d */
    private final String f71984d;

    /* renamed from: e */
    private final String f71985e;

    /* renamed from: f */
    private final String f71986f;

    /* renamed from: g */
    private final String f71987g;

    /* renamed from: h */
    private final String f71988h;

    /* renamed from: i */
    private final String f71989i;

    /* renamed from: j */
    private final String f71990j;

    /* renamed from: k */
    private final String f71991k;

    /* renamed from: l */
    private final String f71992l;

    /* renamed from: m */
    private final String f71993m;

    /* renamed from: n */
    private final String f71994n;

    /* renamed from: o */
    private final String f71995o;

    /* renamed from: p */
    private final String f71996p;

    /* renamed from: q */
    private final String f71997q;

    /* renamed from: r */
    private final String f71998r;

    /* renamed from: s */
    private final String f71999s;

    /* renamed from: t */
    private final List<String> f72000t;

    /* compiled from: AutoValue_Report.java */
    /* renamed from: com.smaato.sdk.core.violationreporter.b$b */
    /* loaded from: classes7.dex */
    static final class C27326b extends Report.Builder {

        /* renamed from: a */
        private String f72001a;

        /* renamed from: b */
        private String f72002b;

        /* renamed from: c */
        private String f72003c;

        /* renamed from: d */
        private String f72004d;

        /* renamed from: e */
        private String f72005e;

        /* renamed from: f */
        private String f72006f;

        /* renamed from: g */
        private String f72007g;

        /* renamed from: h */
        private String f72008h;

        /* renamed from: i */
        private String f72009i;

        /* renamed from: j */
        private String f72010j;

        /* renamed from: k */
        private String f72011k;

        /* renamed from: l */
        private String f72012l;

        /* renamed from: m */
        private String f72013m;

        /* renamed from: n */
        private String f72014n;

        /* renamed from: o */
        private String f72015o;

        /* renamed from: p */
        private String f72016p;

        /* renamed from: q */
        private String f72017q;

        /* renamed from: r */
        private String f72018r;

        /* renamed from: s */
        private String f72019s;

        /* renamed from: t */
        private List<String> f72020t;

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report build() {
            String str = "";
            if (this.f72001a == null) {
                str = " type";
            }
            if (this.f72002b == null) {
                str = str + " sci";
            }
            if (this.f72003c == null) {
                str = str + " timestamp";
            }
            if (this.f72004d == null) {
                str = str + " error";
            }
            if (this.f72005e == null) {
                str = str + " sdkVersion";
            }
            if (this.f72006f == null) {
                str = str + " bundleId";
            }
            if (this.f72007g == null) {
                str = str + " violatedUrl";
            }
            if (this.f72008h == null) {
                str = str + " publisher";
            }
            if (this.f72009i == null) {
                str = str + " platform";
            }
            if (this.f72010j == null) {
                str = str + " adSpace";
            }
            if (this.f72011k == null) {
                str = str + " sessionId";
            }
            if (this.f72012l == null) {
                str = str + " apiKey";
            }
            if (this.f72013m == null) {
                str = str + " apiVersion";
            }
            if (this.f72014n == null) {
                str = str + " originalUrl";
            }
            if (this.f72015o == null) {
                str = str + " creativeId";
            }
            if (this.f72016p == null) {
                str = str + " asnId";
            }
            if (this.f72017q == null) {
                str = str + " redirectUrl";
            }
            if (this.f72018r == null) {
                str = str + " clickUrl";
            }
            if (this.f72019s == null) {
                str = str + " adMarkup";
            }
            if (this.f72020t == null) {
                str = str + " traceUrls";
            }
            if (str.isEmpty()) {
                return new AutoValue_Report(this.f72001a, this.f72002b, this.f72003c, this.f72004d, this.f72005e, this.f72006f, this.f72007g, this.f72008h, this.f72009i, this.f72010j, this.f72011k, this.f72012l, this.f72013m, this.f72014n, this.f72015o, this.f72016p, this.f72017q, this.f72018r, this.f72019s, this.f72020t);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setAdMarkup(String str) {
            if (str != null) {
                this.f72019s = str;
                return this;
            }
            throw new NullPointerException("Null adMarkup");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setAdSpace(String str) {
            if (str != null) {
                this.f72010j = str;
                return this;
            }
            throw new NullPointerException("Null adSpace");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setApiKey(String str) {
            if (str != null) {
                this.f72012l = str;
                return this;
            }
            throw new NullPointerException("Null apiKey");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setApiVersion(String str) {
            if (str != null) {
                this.f72013m = str;
                return this;
            }
            throw new NullPointerException("Null apiVersion");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setAsnId(String str) {
            if (str != null) {
                this.f72016p = str;
                return this;
            }
            throw new NullPointerException("Null asnId");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setBundleId(String str) {
            if (str != null) {
                this.f72006f = str;
                return this;
            }
            throw new NullPointerException("Null bundleId");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setClickUrl(String str) {
            if (str != null) {
                this.f72018r = str;
                return this;
            }
            throw new NullPointerException("Null clickUrl");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setCreativeId(String str) {
            if (str != null) {
                this.f72015o = str;
                return this;
            }
            throw new NullPointerException("Null creativeId");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setError(String str) {
            if (str != null) {
                this.f72004d = str;
                return this;
            }
            throw new NullPointerException("Null error");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setOriginalUrl(String str) {
            if (str != null) {
                this.f72014n = str;
                return this;
            }
            throw new NullPointerException("Null originalUrl");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setPlatform(String str) {
            if (str != null) {
                this.f72009i = str;
                return this;
            }
            throw new NullPointerException("Null platform");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setPublisher(String str) {
            if (str != null) {
                this.f72008h = str;
                return this;
            }
            throw new NullPointerException("Null publisher");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setRedirectUrl(String str) {
            if (str != null) {
                this.f72017q = str;
                return this;
            }
            throw new NullPointerException("Null redirectUrl");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setSci(String str) {
            if (str != null) {
                this.f72002b = str;
                return this;
            }
            throw new NullPointerException("Null sci");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setSdkVersion(String str) {
            if (str != null) {
                this.f72005e = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setSessionId(String str) {
            if (str != null) {
                this.f72011k = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setTimestamp(String str) {
            if (str != null) {
                this.f72003c = str;
                return this;
            }
            throw new NullPointerException("Null timestamp");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setTraceUrls(List<String> list) {
            if (list != null) {
                this.f72020t = list;
                return this;
            }
            throw new NullPointerException("Null traceUrls");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setType(String str) {
            if (str != null) {
                this.f72001a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        @Override // com.smaato.sdk.core.violationreporter.Report.Builder
        public Report.Builder setViolatedUrl(String str) {
            if (str != null) {
                this.f72007g = str;
                return this;
            }
            throw new NullPointerException("Null violatedUrl");
        }
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: b */
    public String mo39317b() {
        return this.f71999s;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: c */
    public String mo39316c() {
        return this.f71990j;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: d */
    public String mo39315d() {
        return this.f71992l;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: e */
    public String mo39314e() {
        return this.f71993m;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Report)) {
            return false;
        }
        Report report = (Report) obj;
        if (this.f71981a.equals(report.mo39299t()) && this.f71982b.equals(report.mo39304o()) && this.f71983c.equals(report.mo39301r()) && this.f71984d.equals(report.mo39309j()) && this.f71985e.equals(report.mo39303p()) && this.f71986f.equals(report.mo39312g()) && this.f71987g.equals(report.mo39298u()) && this.f71988h.equals(report.mo39306m()) && this.f71989i.equals(report.mo39307l()) && this.f71990j.equals(report.mo39316c()) && this.f71991k.equals(report.mo39302q()) && this.f71992l.equals(report.mo39315d()) && this.f71993m.equals(report.mo39314e()) && this.f71994n.equals(report.mo39308k()) && this.f71995o.equals(report.mo39310i()) && this.f71996p.equals(report.mo39313f()) && this.f71997q.equals(report.mo39305n()) && this.f71998r.equals(report.mo39311h()) && this.f71999s.equals(report.mo39317b()) && this.f72000t.equals(report.mo39300s())) {
            return true;
        }
        return false;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: f */
    public String mo39313f() {
        return this.f71996p;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: g */
    public String mo39312g() {
        return this.f71986f;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: h */
    public String mo39311h() {
        return this.f71998r;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((this.f71981a.hashCode() ^ 1000003) * 1000003) ^ this.f71982b.hashCode()) * 1000003) ^ this.f71983c.hashCode()) * 1000003) ^ this.f71984d.hashCode()) * 1000003) ^ this.f71985e.hashCode()) * 1000003) ^ this.f71986f.hashCode()) * 1000003) ^ this.f71987g.hashCode()) * 1000003) ^ this.f71988h.hashCode()) * 1000003) ^ this.f71989i.hashCode()) * 1000003) ^ this.f71990j.hashCode()) * 1000003) ^ this.f71991k.hashCode()) * 1000003) ^ this.f71992l.hashCode()) * 1000003) ^ this.f71993m.hashCode()) * 1000003) ^ this.f71994n.hashCode()) * 1000003) ^ this.f71995o.hashCode()) * 1000003) ^ this.f71996p.hashCode()) * 1000003) ^ this.f71997q.hashCode()) * 1000003) ^ this.f71998r.hashCode()) * 1000003) ^ this.f71999s.hashCode()) * 1000003) ^ this.f72000t.hashCode();
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: i */
    public String mo39310i() {
        return this.f71995o;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: j */
    public String mo39309j() {
        return this.f71984d;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: k */
    public String mo39308k() {
        return this.f71994n;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: l */
    public String mo39307l() {
        return this.f71989i;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: m */
    public String mo39306m() {
        return this.f71988h;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: n */
    public String mo39305n() {
        return this.f71997q;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: o */
    public String mo39304o() {
        return this.f71982b;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: p */
    public String mo39303p() {
        return this.f71985e;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: q */
    public String mo39302q() {
        return this.f71991k;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: r */
    public String mo39301r() {
        return this.f71983c;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: s */
    public List<String> mo39300s() {
        return this.f72000t;
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: t */
    public String mo39299t() {
        return this.f71981a;
    }

    public String toString() {
        return "Report{type=" + this.f71981a + ", sci=" + this.f71982b + ", timestamp=" + this.f71983c + ", error=" + this.f71984d + ", sdkVersion=" + this.f71985e + ", bundleId=" + this.f71986f + ", violatedUrl=" + this.f71987g + ", publisher=" + this.f71988h + ", platform=" + this.f71989i + ", adSpace=" + this.f71990j + ", sessionId=" + this.f71991k + ", apiKey=" + this.f71992l + ", apiVersion=" + this.f71993m + ", originalUrl=" + this.f71994n + ", creativeId=" + this.f71995o + ", asnId=" + this.f71996p + ", redirectUrl=" + this.f71997q + ", clickUrl=" + this.f71998r + ", adMarkup=" + this.f71999s + ", traceUrls=" + this.f72000t + "}";
    }

    @Override // com.smaato.sdk.core.violationreporter.Report
    @NonNull
    /* renamed from: u */
    public String mo39298u() {
        return this.f71987g;
    }

    private AutoValue_Report(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, List<String> list) {
        this.f71981a = str;
        this.f71982b = str2;
        this.f71983c = str3;
        this.f71984d = str4;
        this.f71985e = str5;
        this.f71986f = str6;
        this.f71987g = str7;
        this.f71988h = str8;
        this.f71989i = str9;
        this.f71990j = str10;
        this.f71991k = str11;
        this.f71992l = str12;
        this.f71993m = str13;
        this.f71994n = str14;
        this.f71995o = str15;
        this.f71996p = str16;
        this.f71997q = str17;
        this.f71998r = str18;
        this.f71999s = str19;
        this.f72000t = list;
    }
}
