package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;

/* loaded from: classes4.dex */
final class AutoValue_BackendResponse extends BackendResponse {

    /* renamed from: a */
    private final BackendResponse.Status f31078a;

    /* renamed from: b */
    private final long f31079b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_BackendResponse(BackendResponse.Status status, long j) {
        if (status != null) {
            this.f31078a = status;
            this.f31079b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        if (this.f31078a.equals(backendResponse.getStatus()) && this.f31079b == backendResponse.getNextRequestWaitMillis()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long getNextRequestWaitMillis() {
        return this.f31079b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status getStatus() {
        return this.f31078a;
    }

    public int hashCode() {
        long j = this.f31079b;
        return ((this.f31078a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f31078a + ", nextRequestWaitMillis=" + this.f31079b + "}";
    }
}
