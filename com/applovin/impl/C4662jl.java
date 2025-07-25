package com.applovin.impl;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.applovin.impl.C3989a5;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.applovin.impl.jl */
/* loaded from: classes2.dex */
public final class C4662jl extends AbstractC4336ek {

    /* renamed from: q */
    private static final Pattern f7230q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r */
    private static final Pattern f7231r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o */
    private final StringBuilder f7232o;

    /* renamed from: p */
    private final ArrayList f7233p;

    public C4662jl() {
        super("SubripDecoder");
        this.f7232o = new StringBuilder();
        this.f7233p = new ArrayList();
    }

    /* renamed from: a */
    private static long m98151a(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 3600000 : 0L) + (Long.parseLong((String) AbstractC4100b1.m100583a((Object) matcher.group(i + 2))) * 60000) + (Long.parseLong((String) AbstractC4100b1.m100583a((Object) matcher.group(i + 3))) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    /* renamed from: b */
    static float m98150b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    /* renamed from: a */
    private String m98152a(String str, ArrayList arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f7231r.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i += length;
        }
        return sb2.toString();
    }

    @Override // com.applovin.impl.AbstractC4336ek
    /* renamed from: a */
    protected InterfaceC5019nl mo92614a(byte[] bArr, int i, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList();
        C5178qc c5178qc = new C5178qc();
        C4066ah c4066ah = new C4066ah(bArr, i);
        while (true) {
            String m100773l = c4066ah.m100773l();
            int i2 = 0;
            if (m100773l == null) {
                break;
            } else if (m100773l.length() != 0) {
                try {
                    Integer.parseInt(m100773l);
                    String m100773l2 = c4066ah.m100773l();
                    if (m100773l2 == null) {
                        AbstractC5063oc.m96800d("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f7230q.matcher(m100773l2);
                    if (matcher.matches()) {
                        c5178qc.m96392a(m98151a(matcher, 1));
                        c5178qc.m96392a(m98151a(matcher, 6));
                        this.f7232o.setLength(0);
                        this.f7233p.clear();
                        for (String m100773l3 = c4066ah.m100773l(); !TextUtils.isEmpty(m100773l3); m100773l3 = c4066ah.m100773l()) {
                            if (this.f7232o.length() > 0) {
                                this.f7232o.append("<br>");
                            }
                            this.f7232o.append(m98152a(m100773l3, this.f7233p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f7232o.toString());
                        while (true) {
                            if (i2 >= this.f7233p.size()) {
                                str = null;
                                break;
                            }
                            str = (String) this.f7233p.get(i2);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(m98153a(fromHtml, str));
                        arrayList.add(C3989a5.f4486s);
                    } else {
                        AbstractC5063oc.m96800d("SubripDecoder", "Skipping invalid timing: " + m100773l2);
                    }
                } catch (NumberFormatException unused) {
                    AbstractC5063oc.m96800d("SubripDecoder", "Skipping invalid index: " + m100773l);
                }
            }
        }
        return new C4722kl((C3989a5[]) arrayList.toArray(new C3989a5[0]), c5178qc.m96391b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    private C3989a5 m98153a(Spanned spanned, String str) {
        char c;
        char c2;
        C3989a5.C3991b m101044a = new C3989a5.C3991b().m101044a(spanned);
        if (str == null) {
            return m101044a.m101050a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2) {
            m101044a.m101040b(0);
        } else if (c != 3 && c != 4 && c != 5) {
            m101044a.m101040b(1);
        } else {
            m101044a.m101040b(2);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1 || c2 == 2) {
            m101044a.m101047a(2);
        } else if (c2 != 3 && c2 != 4 && c2 != 5) {
            m101044a.m101047a(1);
        } else {
            m101044a.m101047a(0);
        }
        return m101044a.m101042b(m98150b(m101044a.m101035d())).m101048a(m98150b(m101044a.m101038c()), 0).m101050a();
    }
}
