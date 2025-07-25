package com.google.zxing.client.result;

import androidx.core.net.MailTo;

/* loaded from: classes5.dex */
public final class EmailAddressParsedResult extends ParsedResult {

    /* renamed from: b */
    private final String[] f44259b;

    /* renamed from: c */
    private final String[] f44260c;

    /* renamed from: d */
    private final String[] f44261d;

    /* renamed from: e */
    private final String f44262e;

    /* renamed from: f */
    private final String f44263f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public EmailAddressParsedResult(String str) {
        this(new String[]{str}, null, null, null, null);
    }

    public String[] getBCCs() {
        return this.f44261d;
    }

    public String getBody() {
        return this.f44263f;
    }

    public String[] getCCs() {
        return this.f44260c;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(30);
        ParsedResult.maybeAppend(this.f44259b, sb2);
        ParsedResult.maybeAppend(this.f44260c, sb2);
        ParsedResult.maybeAppend(this.f44261d, sb2);
        ParsedResult.maybeAppend(this.f44262e, sb2);
        ParsedResult.maybeAppend(this.f44263f, sb2);
        return sb2.toString();
    }

    @Deprecated
    public String getEmailAddress() {
        String[] strArr = this.f44259b;
        if (strArr != null && strArr.length != 0) {
            return strArr[0];
        }
        return null;
    }

    @Deprecated
    public String getMailtoURI() {
        return MailTo.MAILTO_SCHEME;
    }

    public String getSubject() {
        return this.f44262e;
    }

    public String[] getTos() {
        return this.f44259b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public EmailAddressParsedResult(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        super(ParsedResultType.EMAIL_ADDRESS);
        this.f44259b = strArr;
        this.f44260c = strArr2;
        this.f44261d = strArr3;
        this.f44262e = str;
        this.f44263f = str2;
    }
}
