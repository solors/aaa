package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class AddressBookParsedResult extends ParsedResult {

    /* renamed from: b */
    private final String[] f44229b;

    /* renamed from: c */
    private final String[] f44230c;

    /* renamed from: d */
    private final String f44231d;

    /* renamed from: e */
    private final String[] f44232e;

    /* renamed from: f */
    private final String[] f44233f;

    /* renamed from: g */
    private final String[] f44234g;

    /* renamed from: h */
    private final String[] f44235h;

    /* renamed from: i */
    private final String f44236i;

    /* renamed from: j */
    private final String f44237j;

    /* renamed from: k */
    private final String[] f44238k;

    /* renamed from: l */
    private final String[] f44239l;

    /* renamed from: m */
    private final String f44240m;

    /* renamed from: n */
    private final String f44241n;

    /* renamed from: o */
    private final String f44242o;

    /* renamed from: p */
    private final String[] f44243p;

    /* renamed from: q */
    private final String[] f44244q;

    public AddressBookParsedResult(String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7) {
        this(strArr, null, null, strArr2, strArr3, strArr4, strArr5, null, null, strArr6, strArr7, null, null, null, null, null);
    }

    public String[] getAddressTypes() {
        return this.f44239l;
    }

    public String[] getAddresses() {
        return this.f44238k;
    }

    public String getBirthday() {
        return this.f44241n;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(100);
        ParsedResult.maybeAppend(this.f44229b, sb2);
        ParsedResult.maybeAppend(this.f44230c, sb2);
        ParsedResult.maybeAppend(this.f44231d, sb2);
        ParsedResult.maybeAppend(this.f44242o, sb2);
        ParsedResult.maybeAppend(this.f44240m, sb2);
        ParsedResult.maybeAppend(this.f44238k, sb2);
        ParsedResult.maybeAppend(this.f44232e, sb2);
        ParsedResult.maybeAppend(this.f44234g, sb2);
        ParsedResult.maybeAppend(this.f44236i, sb2);
        ParsedResult.maybeAppend(this.f44243p, sb2);
        ParsedResult.maybeAppend(this.f44241n, sb2);
        ParsedResult.maybeAppend(this.f44244q, sb2);
        ParsedResult.maybeAppend(this.f44237j, sb2);
        return sb2.toString();
    }

    public String[] getEmailTypes() {
        return this.f44235h;
    }

    public String[] getEmails() {
        return this.f44234g;
    }

    public String[] getGeo() {
        return this.f44244q;
    }

    public String getInstantMessenger() {
        return this.f44236i;
    }

    public String[] getNames() {
        return this.f44229b;
    }

    public String[] getNicknames() {
        return this.f44230c;
    }

    public String getNote() {
        return this.f44237j;
    }

    public String getOrg() {
        return this.f44240m;
    }

    public String[] getPhoneNumbers() {
        return this.f44232e;
    }

    public String[] getPhoneTypes() {
        return this.f44233f;
    }

    public String getPronunciation() {
        return this.f44231d;
    }

    public String getTitle() {
        return this.f44242o;
    }

    public String[] getURLs() {
        return this.f44243p;
    }

    public AddressBookParsedResult(String[] strArr, String[] strArr2, String str, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String str2, String str3, String[] strArr7, String[] strArr8, String str4, String str5, String str6, String[] strArr9, String[] strArr10) {
        super(ParsedResultType.ADDRESSBOOK);
        if (strArr3 != null && strArr4 != null && strArr3.length != strArr4.length) {
            throw new IllegalArgumentException("Phone numbers and types lengths differ");
        }
        if (strArr5 != null && strArr6 != null && strArr5.length != strArr6.length) {
            throw new IllegalArgumentException("Emails and types lengths differ");
        }
        if (strArr7 != null && strArr8 != null && strArr7.length != strArr8.length) {
            throw new IllegalArgumentException("Addresses and types lengths differ");
        }
        this.f44229b = strArr;
        this.f44230c = strArr2;
        this.f44231d = str;
        this.f44232e = strArr3;
        this.f44233f = strArr4;
        this.f44234g = strArr5;
        this.f44235h = strArr6;
        this.f44236i = str2;
        this.f44237j = str3;
        this.f44238k = strArr7;
        this.f44239l = strArr8;
        this.f44240m = str4;
        this.f44241n = str5;
        this.f44242o = str6;
        this.f44243p = strArr9;
        this.f44244q = strArr10;
    }
}
