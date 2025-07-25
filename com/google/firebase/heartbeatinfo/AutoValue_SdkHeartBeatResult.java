package com.google.firebase.heartbeatinfo;

/* loaded from: classes4.dex */
final class AutoValue_SdkHeartBeatResult extends SdkHeartBeatResult {

    /* renamed from: b */
    private final String f43033b;

    /* renamed from: c */
    private final long f43034c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_SdkHeartBeatResult(String str, long j) {
        if (str != null) {
            this.f43033b = str;
            this.f43034c = j;
            return;
        }
        throw new NullPointerException("Null sdkName");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkHeartBeatResult)) {
            return false;
        }
        SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
        if (this.f43033b.equals(sdkHeartBeatResult.getSdkName()) && this.f43034c == sdkHeartBeatResult.getMillis()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public long getMillis() {
        return this.f43034c;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public String getSdkName() {
        return this.f43033b;
    }

    public int hashCode() {
        long j = this.f43034c;
        return ((this.f43033b.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.f43033b + ", millis=" + this.f43034c + "}";
    }
}
