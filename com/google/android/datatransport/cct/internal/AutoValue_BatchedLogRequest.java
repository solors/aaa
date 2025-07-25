package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* loaded from: classes4.dex */
final class AutoValue_BatchedLogRequest extends BatchedLogRequest {

    /* renamed from: a */
    private final List<LogRequest> f30938a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_BatchedLogRequest(List<LogRequest> list) {
        if (list != null) {
            this.f30938a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BatchedLogRequest) {
            return this.f30938a.equals(((BatchedLogRequest) obj).getLogRequests());
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.BatchedLogRequest
    @NonNull
    @Encodable.Field(name = "logRequest")
    public List<LogRequest> getLogRequests() {
        return this.f30938a;
    }

    public int hashCode() {
        return this.f30938a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f30938a + "}";
    }
}
