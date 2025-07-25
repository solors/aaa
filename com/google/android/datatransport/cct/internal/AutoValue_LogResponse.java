package com.google.android.datatransport.cct.internal;

/* loaded from: classes4.dex */
final class AutoValue_LogResponse extends LogResponse {

    /* renamed from: a */
    private final long f30971a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_LogResponse(long j) {
        this.f30971a = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof LogResponse) && this.f30971a == ((LogResponse) obj).getNextRequestWaitMillis()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.LogResponse
    public long getNextRequestWaitMillis() {
        return this.f30971a;
    }

    public int hashCode() {
        long j = this.f30971a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f30971a + "}";
    }
}
