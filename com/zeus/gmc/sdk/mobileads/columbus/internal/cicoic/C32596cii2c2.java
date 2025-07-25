package com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cicoic.cii2c2 */
/* loaded from: classes8.dex */
public class C32596cii2c2 {
    private long c2oc2i;
    private long c2oc2o;
    private boolean cco22 = false;
    private long cioccoiococ;
    private String coi222o222;
    private int coo2iico;

    public C32596cii2c2(int i, String str, long j, long j2, long j3) {
        this.coo2iico = i;
        this.coi222o222 = str;
        this.c2oc2i = j;
        this.cioccoiococ = j2;
        this.c2oc2o = j3;
    }

    public void c2oc2i(long j) {
        this.c2oc2i = j;
    }

    public String c2oc2o() {
        return this.coi222o222;
    }

    public boolean cco22() {
        return this.cco22;
    }

    public long cioccoiococ() {
        return this.c2oc2i;
    }

    public int coi222o222() {
        return this.coo2iico;
    }

    public void coo2iico(boolean z) {
        this.cco22 = z;
    }

    public String toString() {
        return "GMCDownloadThreadInfo{id=" + this.coo2iico + ", url='" + this.coi222o222 + "', start='" + this.c2oc2i + "', end='" + this.cioccoiococ + "', finish=" + this.c2oc2o + '}';
    }

    public long c2oc2i() {
        return this.c2oc2o;
    }

    public void coi222o222(long j) {
        this.c2oc2o = j;
    }

    public void coo2iico(int i) {
        this.coo2iico = i;
    }

    public void coo2iico(String str) {
        this.coi222o222 = str;
    }

    public long coo2iico() {
        return this.cioccoiococ;
    }

    public void coo2iico(long j) {
        this.cioccoiococ = j;
    }
}
