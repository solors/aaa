package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import com.ironsource.C20517nb;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class GeneralAppIdDecoder {

    /* renamed from: a */
    private final BitArray f44588a;

    /* renamed from: b */
    private final CurrentParsingState f44589b = new CurrentParsingState();

    /* renamed from: c */
    private final StringBuilder f44590c = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    public GeneralAppIdDecoder(BitArray bitArray) {
        this.f44588a = bitArray;
    }

    /* renamed from: b */
    private DecodedChar m65747b(int i) {
        char c;
        int m65743f = m65743f(i, 5);
        if (m65743f == 15) {
            return new DecodedChar(i + 5, '$');
        }
        if (m65743f >= 5 && m65743f < 15) {
            return new DecodedChar(i + 5, (char) ((m65743f + 48) - 5));
        }
        int m65743f2 = m65743f(i, 6);
        if (m65743f2 >= 32 && m65743f2 < 58) {
            return new DecodedChar(i + 6, (char) (m65743f2 + 33));
        }
        switch (m65743f2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(m65743f2)));
        }
        return new DecodedChar(i + 6, c);
    }

    /* renamed from: d */
    private DecodedChar m65745d(int i) throws FormatException {
        char c;
        int m65743f = m65743f(i, 5);
        if (m65743f == 15) {
            return new DecodedChar(i + 5, '$');
        }
        if (m65743f >= 5 && m65743f < 15) {
            return new DecodedChar(i + 5, (char) ((m65743f + 48) - 5));
        }
        int m65743f2 = m65743f(i, 7);
        if (m65743f2 >= 64 && m65743f2 < 90) {
            return new DecodedChar(i + 7, (char) (m65743f2 + 1));
        }
        if (m65743f2 >= 90 && m65743f2 < 116) {
            return new DecodedChar(i + 7, (char) (m65743f2 + 7));
        }
        switch (m65743f(i, 8)) {
            case 232:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = '&';
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = '<';
                break;
            case 248:
                c = C20517nb.f52173T;
                break;
            case 249:
                c = '>';
                break;
            case 250:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw FormatException.getFormatInstance();
        }
        return new DecodedChar(i + 8, c);
    }

    /* renamed from: e */
    private DecodedNumeric m65744e(int i) throws FormatException {
        int i2 = i + 7;
        if (i2 > this.f44588a.getSize()) {
            int m65743f = m65743f(i, 4);
            if (m65743f == 0) {
                return new DecodedNumeric(this.f44588a.getSize(), 10, 10);
            }
            return new DecodedNumeric(this.f44588a.getSize(), m65743f - 1, 10);
        }
        int m65743f2 = m65743f(i, 7) - 8;
        return new DecodedNumeric(i2, m65743f2 / 11, m65743f2 % 11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m65742g(BitArray bitArray, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (bitArray.get(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: h */
    private boolean m65741h(int i) {
        int i2 = i + 3;
        if (i2 > this.f44588a.getSize()) {
            return false;
        }
        while (i < i2) {
            if (this.f44588a.get(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m65740i(int i) {
        int i2;
        if (i + 1 > this.f44588a.getSize()) {
            return false;
        }
        for (int i3 = 0; i3 < 5 && (i2 = i3 + i) < this.f44588a.getSize(); i3++) {
            if (i3 == 2) {
                if (!this.f44588a.get(i + 2)) {
                    return false;
                }
            } else if (this.f44588a.get(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    private boolean m65739j(int i) {
        int i2;
        if (i + 1 > this.f44588a.getSize()) {
            return false;
        }
        for (int i3 = 0; i3 < 4 && (i2 = i3 + i) < this.f44588a.getSize(); i3++) {
            if (this.f44588a.get(i2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    private boolean m65738k(int i) {
        int m65743f;
        if (i + 5 > this.f44588a.getSize()) {
            return false;
        }
        int m65743f2 = m65743f(i, 5);
        if (m65743f2 >= 5 && m65743f2 < 16) {
            return true;
        }
        if (i + 6 > this.f44588a.getSize() || (m65743f = m65743f(i, 6)) < 16 || m65743f >= 63) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private boolean m65737l(int i) {
        int m65743f;
        if (i + 5 > this.f44588a.getSize()) {
            return false;
        }
        int m65743f2 = m65743f(i, 5);
        if (m65743f2 >= 5 && m65743f2 < 16) {
            return true;
        }
        if (i + 7 > this.f44588a.getSize()) {
            return false;
        }
        int m65743f3 = m65743f(i, 7);
        if (m65743f3 >= 64 && m65743f3 < 116) {
            return true;
        }
        if (i + 8 > this.f44588a.getSize() || (m65743f = m65743f(i, 8)) < 232 || m65743f >= 253) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m65736m(int i) {
        if (i + 7 > this.f44588a.getSize()) {
            if (i + 4 <= this.f44588a.getSize()) {
                return true;
            }
            return false;
        }
        int i2 = i;
        while (true) {
            int i3 = i + 3;
            if (i2 < i3) {
                if (this.f44588a.get(i2)) {
                    return true;
                }
                i2++;
            } else {
                return this.f44588a.get(i3);
            }
        }
    }

    /* renamed from: n */
    private BlockParsedResult m65735n() {
        while (m65738k(this.f44589b.m65769a())) {
            DecodedChar m65747b = m65747b(this.f44589b.m65769a());
            this.f44589b.m65762h(m65747b.m65752a());
            if (m65747b.m65760c()) {
                return new BlockParsedResult(new DecodedInformation(this.f44589b.m65769a(), this.f44590c.toString()), true);
            }
            this.f44590c.append(m65747b.m65761b());
        }
        if (m65741h(this.f44589b.m65769a())) {
            this.f44589b.m65768b(3);
            this.f44589b.m65763g();
        } else if (m65740i(this.f44589b.m65769a())) {
            if (this.f44589b.m65769a() + 5 < this.f44588a.getSize()) {
                this.f44589b.m65768b(5);
            } else {
                this.f44589b.m65762h(this.f44588a.getSize());
            }
            this.f44589b.m65764f();
        }
        return new BlockParsedResult(false);
    }

    /* renamed from: o */
    private DecodedInformation m65734o() throws FormatException {
        BlockParsedResult m65732q;
        boolean m65770b;
        boolean z;
        do {
            int m65769a = this.f44589b.m65769a();
            if (this.f44589b.m65767c()) {
                m65732q = m65735n();
                m65770b = m65732q.m65770b();
            } else if (this.f44589b.m65766d()) {
                m65732q = m65733p();
                m65770b = m65732q.m65770b();
            } else {
                m65732q = m65732q();
                m65770b = m65732q.m65770b();
            }
            if (m65769a != this.f44589b.m65769a()) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !m65770b) {
                break;
            }
        } while (!m65770b);
        return m65732q.m65771a();
    }

    /* renamed from: p */
    private BlockParsedResult m65733p() throws FormatException {
        while (m65737l(this.f44589b.m65769a())) {
            DecodedChar m65745d = m65745d(this.f44589b.m65769a());
            this.f44589b.m65762h(m65745d.m65752a());
            if (m65745d.m65760c()) {
                return new BlockParsedResult(new DecodedInformation(this.f44589b.m65769a(), this.f44590c.toString()), true);
            }
            this.f44590c.append(m65745d.m65761b());
        }
        if (m65741h(this.f44589b.m65769a())) {
            this.f44589b.m65768b(3);
            this.f44589b.m65763g();
        } else if (m65740i(this.f44589b.m65769a())) {
            if (this.f44589b.m65769a() + 5 < this.f44588a.getSize()) {
                this.f44589b.m65768b(5);
            } else {
                this.f44589b.m65762h(this.f44588a.getSize());
            }
            this.f44589b.m65765e();
        }
        return new BlockParsedResult(false);
    }

    /* renamed from: q */
    private BlockParsedResult m65732q() throws FormatException {
        DecodedInformation decodedInformation;
        while (m65736m(this.f44589b.m65769a())) {
            DecodedNumeric m65744e = m65744e(this.f44589b.m65769a());
            this.f44589b.m65762h(m65744e.m65752a());
            if (m65744e.m65754d()) {
                if (m65744e.m65753e()) {
                    decodedInformation = new DecodedInformation(this.f44589b.m65769a(), this.f44590c.toString());
                } else {
                    decodedInformation = new DecodedInformation(this.f44589b.m65769a(), this.f44590c.toString(), m65744e.m65755c());
                }
                return new BlockParsedResult(decodedInformation, true);
            }
            this.f44590c.append(m65744e.m65756b());
            if (m65744e.m65753e()) {
                return new BlockParsedResult(new DecodedInformation(this.f44589b.m65769a(), this.f44590c.toString()), true);
            }
            this.f44590c.append(m65744e.m65755c());
        }
        if (m65739j(this.f44589b.m65769a())) {
            this.f44589b.m65765e();
            this.f44589b.m65768b(4);
        }
        return new BlockParsedResult(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m65748a(StringBuilder sb2, int i) throws NotFoundException, FormatException {
        String str;
        String str2 = null;
        while (true) {
            DecodedInformation m65746c = m65746c(i, str2);
            String m65751a = FieldParser.m65751a(m65746c.m65759b());
            if (m65751a != null) {
                sb2.append(m65751a);
            }
            if (m65746c.m65757d()) {
                str = String.valueOf(m65746c.m65758c());
            } else {
                str = null;
            }
            if (i != m65746c.m65752a()) {
                i = m65746c.m65752a();
                str2 = str;
            } else {
                return sb2.toString();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public DecodedInformation m65746c(int i, String str) throws FormatException {
        this.f44590c.setLength(0);
        if (str != null) {
            this.f44590c.append(str);
        }
        this.f44589b.m65762h(i);
        DecodedInformation m65734o = m65734o();
        if (m65734o != null && m65734o.m65757d()) {
            return new DecodedInformation(this.f44589b.m65769a(), this.f44590c.toString(), m65734o.m65758c());
        }
        return new DecodedInformation(this.f44589b.m65769a(), this.f44590c.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m65743f(int i, int i2) {
        return m65742g(this.f44588a, i, i2);
    }
}
