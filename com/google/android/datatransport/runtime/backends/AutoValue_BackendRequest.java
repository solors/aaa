package com.google.android.datatransport.runtime.backends;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class AutoValue_BackendRequest extends BackendRequest {

    /* renamed from: a */
    private final Iterable<EventInternal> f31074a;

    /* renamed from: b */
    private final byte[] f31075b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends BackendRequest.Builder {

        /* renamed from: a */
        private Iterable<EventInternal> f31076a;

        /* renamed from: b */
        private byte[] f31077b;

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest build() {
            String str = "";
            if (this.f31076a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new AutoValue_BackendRequest(this.f31076a, this.f31077b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest.Builder setEvents(Iterable<EventInternal> iterable) {
            if (iterable != null) {
                this.f31076a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest.Builder setExtras(@Nullable byte[] bArr) {
            this.f31077b = bArr;
            return this;
        }
    }

    public boolean equals(Object obj) {
        byte[] extras;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendRequest)) {
            return false;
        }
        BackendRequest backendRequest = (BackendRequest) obj;
        if (this.f31074a.equals(backendRequest.getEvents())) {
            byte[] bArr = this.f31075b;
            if (backendRequest instanceof AutoValue_BackendRequest) {
                extras = ((AutoValue_BackendRequest) backendRequest).f31075b;
            } else {
                extras = backendRequest.getExtras();
            }
            if (Arrays.equals(bArr, extras)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public Iterable<EventInternal> getEvents() {
        return this.f31074a;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    @Nullable
    public byte[] getExtras() {
        return this.f31075b;
    }

    public int hashCode() {
        return ((this.f31074a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f31075b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f31074a + ", extras=" + Arrays.toString(this.f31075b) + "}";
    }

    private AutoValue_BackendRequest(Iterable<EventInternal> iterable, @Nullable byte[] bArr) {
        this.f31074a = iterable;
        this.f31075b = bArr;
    }
}
