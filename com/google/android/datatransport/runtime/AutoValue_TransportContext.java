package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class AutoValue_TransportContext extends TransportContext {

    /* renamed from: a */
    private final String f31030a;

    /* renamed from: b */
    private final byte[] f31031b;

    /* renamed from: c */
    private final Priority f31032c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends TransportContext.Builder {

        /* renamed from: a */
        private String f31033a;

        /* renamed from: b */
        private byte[] f31034b;

        /* renamed from: c */
        private Priority f31035c;

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext build() {
            String str = "";
            if (this.f31033a == null) {
                str = " backendName";
            }
            if (this.f31035c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new AutoValue_TransportContext(this.f31033a, this.f31034b, this.f31035c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setBackendName(String str) {
            if (str != null) {
                this.f31033a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setExtras(@Nullable byte[] bArr) {
            this.f31034b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setPriority(Priority priority) {
            if (priority != null) {
                this.f31035c = priority;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public boolean equals(Object obj) {
        byte[] extras;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransportContext)) {
            return false;
        }
        TransportContext transportContext = (TransportContext) obj;
        if (this.f31030a.equals(transportContext.getBackendName())) {
            byte[] bArr = this.f31031b;
            if (transportContext instanceof AutoValue_TransportContext) {
                extras = ((AutoValue_TransportContext) transportContext).f31031b;
            } else {
                extras = transportContext.getExtras();
            }
            if (Arrays.equals(bArr, extras) && this.f31032c.equals(transportContext.getPriority())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public String getBackendName() {
        return this.f31030a;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    @Nullable
    public byte[] getExtras() {
        return this.f31031b;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Priority getPriority() {
        return this.f31032c;
    }

    public int hashCode() {
        return ((((this.f31030a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f31031b)) * 1000003) ^ this.f31032c.hashCode();
    }

    private AutoValue_TransportContext(String str, @Nullable byte[] bArr, Priority priority) {
        this.f31030a = str;
        this.f31031b = bArr;
        this.f31032c = priority;
    }
}
