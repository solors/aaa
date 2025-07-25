package com.google.android.exoplayer2.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class SubripDecoder extends SimpleSubtitleDecoder {

    /* renamed from: q */
    private static final Pattern f34919q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: r */
    private static final Pattern f34920r = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: o */
    private final StringBuilder f34921o;

    /* renamed from: p */
    private final ArrayList<String> f34922p;

    public SubripDecoder() {
        super("SubripDecoder");
        this.f34921o = new StringBuilder();
        this.f34922p = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: u */
    private Cue m73439u(Spanned spanned, @Nullable String str) {
        char c;
        char c2;
        Cue.Builder text = new Cue.Builder().setText(spanned);
        if (str == null) {
            return text.build();
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
        if (c != 0 && c != 1 && c != 2) {
            if (c != 3 && c != 4 && c != 5) {
                text.setPositionAnchor(1);
            } else {
                text.setPositionAnchor(2);
            }
        } else {
            text.setPositionAnchor(0);
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
        if (c2 != 0 && c2 != 1 && c2 != 2) {
            if (c2 != 3 && c2 != 4 && c2 != 5) {
                text.setLineAnchor(1);
            } else {
                text.setLineAnchor(0);
            }
        } else {
            text.setLineAnchor(2);
        }
        return text.setPosition(m73437w(text.getPositionAnchor())).setLine(m73437w(text.getLineAnchor()), 0).build();
    }

    /* renamed from: v */
    private Charset m73438v(ParsableByteArray parsableByteArray) {
        Charset readUtfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        if (readUtfCharsetFromBom == null) {
            return Charsets.UTF_8;
        }
        return readUtfCharsetFromBom;
    }

    /* renamed from: w */
    static float m73437w(int i) {
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

    /* renamed from: x */
    private static long m73436x(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 60 * 60 * 1000;
        } else {
            j = 0;
        }
        long parseLong = j + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(i + 2))) * 60 * 1000) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(i + 3))) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    /* renamed from: y */
    private String m73435y(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = f34920r.matcher(trim);
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

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    /* renamed from: s */
    protected Subtitle mo73353s(byte[] bArr, int i, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList();
        LongArray longArray = new LongArray();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i);
        Charset m73438v = m73438v(parsableByteArray);
        while (true) {
            String readLine = parsableByteArray.readLine(m73438v);
            int i2 = 0;
            if (readLine == null) {
                break;
            } else if (readLine.length() != 0) {
                try {
                    Integer.parseInt(readLine);
                    String readLine2 = parsableByteArray.readLine(m73438v);
                    if (readLine2 == null) {
                        Log.m72602w("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f34919q.matcher(readLine2);
                    if (matcher.matches()) {
                        longArray.add(m73436x(matcher, 1));
                        longArray.add(m73436x(matcher, 6));
                        this.f34921o.setLength(0);
                        this.f34922p.clear();
                        for (String readLine3 = parsableByteArray.readLine(m73438v); !TextUtils.isEmpty(readLine3); readLine3 = parsableByteArray.readLine(m73438v)) {
                            if (this.f34921o.length() > 0) {
                                this.f34921o.append("<br>");
                            }
                            this.f34921o.append(m73435y(readLine3, this.f34922p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f34921o.toString());
                        while (true) {
                            if (i2 < this.f34922p.size()) {
                                str = this.f34922p.get(i2);
                                if (str.matches("\\{\\\\an[1-9]\\}")) {
                                    break;
                                }
                                i2++;
                            } else {
                                str = null;
                                break;
                            }
                        }
                        arrayList.add(m73439u(fromHtml, str));
                        arrayList.add(Cue.EMPTY);
                    } else {
                        Log.m72602w("SubripDecoder", "Skipping invalid timing: " + readLine2);
                    }
                } catch (NumberFormatException unused) {
                    Log.m72602w("SubripDecoder", "Skipping invalid index: " + readLine);
                }
            }
        }
        return new SubripSubtitle((Cue[]) arrayList.toArray(new Cue[0]), longArray.toArray());
    }
}
