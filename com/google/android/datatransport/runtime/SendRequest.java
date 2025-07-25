package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.AutoValue_SendRequest;
import com.google.auto.value.AutoValue;

/* JADX INFO: Access modifiers changed from: package-private */
@AutoValue
/* loaded from: classes4.dex */
public abstract class SendRequest {

    @AutoValue.Builder
    /* loaded from: classes4.dex */
    public static abstract class Builder {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract Builder mo76315a(Encoding encoding);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract Builder mo76314b(Event<?> event);

        public abstract SendRequest build();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract Builder mo76313c(Transformer<?, byte[]> transformer);

        public <T> Builder setEvent(Event<T> event, Encoding encoding, Transformer<T, byte[]> transformer) {
            mo76314b(event);
            mo76315a(encoding);
            mo76313c(transformer);
            return this;
        }

        public abstract Builder setTransportContext(TransportContext transportContext);

        public abstract Builder setTransportName(String str);
    }

    public static Builder builder() {
        return new AutoValue_SendRequest.Builder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Event<?> mo76317a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract Transformer<?, byte[]> mo76316b();

    public abstract Encoding getEncoding();

    public byte[] getPayload() {
        return mo76316b().apply(mo76317a().getPayload());
    }

    public abstract TransportContext getTransportContext();

    public abstract String getTransportName();
}
