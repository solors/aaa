package com.smaato.sdk.core.locationaware;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.core.locationaware.a */
/* loaded from: classes7.dex */
public final class AutoValue_TxtRecord extends TxtRecord {

    /* renamed from: a */
    private final String f71634a;

    /* renamed from: b */
    private final int f71635b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_TxtRecord(String str, int i) {
        if (str != null) {
            this.f71634a = str;
            this.f71635b = i;
            return;
        }
        throw new NullPointerException("Null data");
    }

    @Override // com.smaato.sdk.core.locationaware.TxtRecord
    public String data() {
        return this.f71634a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TxtRecord)) {
            return false;
        }
        TxtRecord txtRecord = (TxtRecord) obj;
        if (this.f71634a.equals(txtRecord.data()) && this.f71635b == txtRecord.ttl()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f71634a.hashCode() ^ 1000003) * 1000003) ^ this.f71635b;
    }

    public String toString() {
        return "TxtRecord{data=" + this.f71634a + ", ttl=" + this.f71635b + "}";
    }

    @Override // com.smaato.sdk.core.locationaware.TxtRecord
    public int ttl() {
        return this.f71635b;
    }
}
