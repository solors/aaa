package com.google.firebase.heartbeatinfo;

import java.util.List;

/* loaded from: classes4.dex */
final class AutoValue_HeartBeatResult extends HeartBeatResult {

    /* renamed from: a */
    private final String f43031a;

    /* renamed from: b */
    private final List<String> f43032b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_HeartBeatResult(String str, List<String> list) {
        if (str != null) {
            this.f43031a = str;
            if (list != null) {
                this.f43032b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        if (this.f43031a.equals(heartBeatResult.getUserAgent()) && this.f43032b.equals(heartBeatResult.getUsedDates())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public List<String> getUsedDates() {
        return this.f43032b;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public String getUserAgent() {
        return this.f43031a;
    }

    public int hashCode() {
        return ((this.f43031a.hashCode() ^ 1000003) * 1000003) ^ this.f43032b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f43031a + ", usedDates=" + this.f43032b + "}";
    }
}
