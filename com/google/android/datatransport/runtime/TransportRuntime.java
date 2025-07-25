package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes4.dex */
public class TransportRuntime implements TransportInternal {

    /* renamed from: e */
    private static volatile TransportRuntimeComponent f31064e;

    /* renamed from: a */
    private final Clock f31065a;

    /* renamed from: b */
    private final Clock f31066b;

    /* renamed from: c */
    private final Scheduler f31067c;

    /* renamed from: d */
    private final Uploader f31068d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransportRuntime(@WallTime Clock clock, @Monotonic Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        this.f31065a = clock;
        this.f31066b = clock2;
        this.f31067c = scheduler;
        this.f31068d = uploader;
        workInitializer.ensureContextsScheduled();
    }

    /* renamed from: a */
    private EventInternal m76309a(SendRequest sendRequest) {
        return EventInternal.builder().setEventMillis(this.f31065a.getTime()).setUptimeMillis(this.f31066b.getTime()).setTransportName(sendRequest.getTransportName()).setEncodedPayload(new EncodedPayload(sendRequest.getEncoding(), sendRequest.getPayload())).setCode(sendRequest.mo76317a().getCode()).build();
    }

    /* renamed from: b */
    private static Set<Encoding> m76308b(Destination destination) {
        if (destination instanceof EncodedDestination) {
            return Collections.unmodifiableSet(((EncodedDestination) destination).getSupportedEncodings());
        }
        return Collections.singleton(Encoding.m76344of("proto"));
    }

    public static TransportRuntime getInstance() {
        TransportRuntimeComponent transportRuntimeComponent = f31064e;
        if (transportRuntimeComponent != null) {
            return transportRuntimeComponent.mo76306b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void initialize(Context context) {
        if (f31064e == null) {
            synchronized (TransportRuntime.class) {
                if (f31064e == null) {
                    f31064e = DaggerTransportRuntimeComponent.builder().setApplicationContext(context).build();
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Uploader getUploader() {
        return this.f31068d;
    }

    @Deprecated
    public TransportFactory newFactory(String str) {
        return new TransportFactoryImpl(m76308b(null), TransportContext.builder().setBackendName(str).build(), this);
    }

    @Override // com.google.android.datatransport.runtime.TransportInternal
    public void send(SendRequest sendRequest, TransportScheduleCallback transportScheduleCallback) {
        this.f31067c.schedule(sendRequest.getTransportContext().withPriority(sendRequest.mo76317a().getPriority()), m76309a(sendRequest), transportScheduleCallback);
    }

    public TransportFactory newFactory(Destination destination) {
        return new TransportFactoryImpl(m76308b(destination), TransportContext.builder().setBackendName(destination.getName()).setExtras(destination.getExtras()).build(), this);
    }
}
