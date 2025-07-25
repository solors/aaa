package com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.cicic */
/* loaded from: classes8.dex */
public class C32595cicic {
    private long c2oc2i;
    private long cioccoiococ;
    private String coi222o222;
    private String coo2iico;

    public String c2oc2i() {
        return this.coi222o222;
    }

    public long cioccoiococ() {
        return this.cioccoiococ;
    }

    public void coi222o222(String str) {
        this.coi222o222 = str;
    }

    public void coo2iico(String str) {
        this.coo2iico = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("fileName = ");
        stringBuffer.append(this.coo2iico);
        stringBuffer.append(",");
        stringBuffer.append("videoFilePath = ");
        stringBuffer.append(this.coi222o222);
        stringBuffer.append(",");
        stringBuffer.append("lastUsedTime = ");
        stringBuffer.append(this.c2oc2i);
        stringBuffer.append(",");
        stringBuffer.append("videoSize = ");
        stringBuffer.append(this.cioccoiococ);
        return stringBuffer.toString();
    }

    public void coi222o222(long j) {
        this.cioccoiococ = j;
    }

    public String coo2iico() {
        return this.coo2iico;
    }

    public long coi222o222() {
        return this.c2oc2i;
    }

    public void coo2iico(long j) {
        this.c2oc2i = j;
    }
}
