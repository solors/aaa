package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class SMSParsedResult extends ParsedResult {

    /* renamed from: b */
    private final String[] f44295b;

    /* renamed from: c */
    private final String[] f44296c;

    /* renamed from: d */
    private final String f44297d;

    /* renamed from: e */
    private final String f44298e;

    public SMSParsedResult(String str, String str2, String str3, String str4) {
        super(ParsedResultType.SMS);
        this.f44295b = new String[]{str};
        this.f44296c = new String[]{str2};
        this.f44297d = str3;
        this.f44298e = str4;
    }

    public String getBody() {
        return this.f44298e;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(100);
        ParsedResult.maybeAppend(this.f44295b, sb2);
        ParsedResult.maybeAppend(this.f44297d, sb2);
        ParsedResult.maybeAppend(this.f44298e, sb2);
        return sb2.toString();
    }

    public String[] getNumbers() {
        return this.f44295b;
    }

    public String getSMSURI() {
        boolean z;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sms:");
        boolean z2 = true;
        boolean z3 = true;
        for (int i = 0; i < this.f44295b.length; i++) {
            if (z3) {
                z3 = false;
            } else {
                sb2.append(',');
            }
            sb2.append(this.f44295b[i]);
            String[] strArr = this.f44296c;
            if (strArr != null && strArr[i] != null) {
                sb2.append(";via=");
                sb2.append(this.f44296c[i]);
            }
        }
        if (this.f44298e != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.f44297d == null) {
            z2 = false;
        }
        if (z || z2) {
            sb2.append('?');
            if (z) {
                sb2.append("body=");
                sb2.append(this.f44298e);
            }
            if (z2) {
                if (z) {
                    sb2.append('&');
                }
                sb2.append("subject=");
                sb2.append(this.f44297d);
            }
        }
        return sb2.toString();
    }

    public String getSubject() {
        return this.f44297d;
    }

    public String[] getVias() {
        return this.f44296c;
    }

    public SMSParsedResult(String[] strArr, String[] strArr2, String str, String str2) {
        super(ParsedResultType.SMS);
        this.f44295b = strArr;
        this.f44296c = strArr2;
        this.f44297d = str;
        this.f44298e = str2;
    }
}
