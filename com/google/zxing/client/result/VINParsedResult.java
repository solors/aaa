package com.google.zxing.client.result;

/* loaded from: classes5.dex */
public final class VINParsedResult extends ParsedResult {

    /* renamed from: b */
    private final String f44319b;

    /* renamed from: c */
    private final String f44320c;

    /* renamed from: d */
    private final String f44321d;

    /* renamed from: e */
    private final String f44322e;

    /* renamed from: f */
    private final String f44323f;

    /* renamed from: g */
    private final String f44324g;

    /* renamed from: h */
    private final int f44325h;

    /* renamed from: i */
    private final char f44326i;

    /* renamed from: j */
    private final String f44327j;

    public VINParsedResult(String str, String str2, String str3, String str4, String str5, String str6, int i, char c, String str7) {
        super(ParsedResultType.VIN);
        this.f44319b = str;
        this.f44320c = str2;
        this.f44321d = str3;
        this.f44322e = str4;
        this.f44323f = str5;
        this.f44324g = str6;
        this.f44325h = i;
        this.f44326i = c;
        this.f44327j = str7;
    }

    public String getCountryCode() {
        return this.f44323f;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append(this.f44320c);
        sb2.append(' ');
        sb2.append(this.f44321d);
        sb2.append(' ');
        sb2.append(this.f44322e);
        sb2.append('\n');
        String str = this.f44323f;
        if (str != null) {
            sb2.append(str);
            sb2.append(' ');
        }
        sb2.append(this.f44325h);
        sb2.append(' ');
        sb2.append(this.f44326i);
        sb2.append(' ');
        sb2.append(this.f44327j);
        sb2.append('\n');
        return sb2.toString();
    }

    public int getModelYear() {
        return this.f44325h;
    }

    public char getPlantCode() {
        return this.f44326i;
    }

    public String getSequentialNumber() {
        return this.f44327j;
    }

    public String getVIN() {
        return this.f44319b;
    }

    public String getVehicleAttributes() {
        return this.f44324g;
    }

    public String getVehicleDescriptorSection() {
        return this.f44321d;
    }

    public String getVehicleIdentifierSection() {
        return this.f44322e;
    }

    public String getWorldManufacturerID() {
        return this.f44320c;
    }
}
