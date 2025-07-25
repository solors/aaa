package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;

/* loaded from: classes4.dex */
final class TransportImpl<T> implements Transport<T> {

    /* renamed from: a */
    private final TransportContext f31059a;

    /* renamed from: b */
    private final String f31060b;

    /* renamed from: c */
    private final Encoding f31061c;

    /* renamed from: d */
    private final Transformer<T, byte[]> f31062d;

    /* renamed from: e */
    private final TransportInternal f31063e;

    public TransportImpl(TransportContext transportContext, String str, Encoding encoding, Transformer<T, byte[]> transformer, TransportInternal transportInternal) {
        this.f31059a = transportContext;
        this.f31060b = str;
        this.f31061c = encoding;
        this.f31062d = transformer;
        this.f31063e = transportInternal;
    }

    /* renamed from: b */
    public TransportContext m76311b() {
        return this.f31059a;
    }

    @Override // com.google.android.datatransport.Transport
    public void schedule(Event<T> event, TransportScheduleCallback transportScheduleCallback) {
        this.f31063e.send(SendRequest.builder().setTransportContext(this.f31059a).mo76314b(event).setTransportName(this.f31060b).mo76313c(this.f31062d).mo76315a(this.f31061c).build(), transportScheduleCallback);
    }

    @Override // com.google.android.datatransport.Transport
    public void send(Event<T> event) {
        schedule(event, new TransportScheduleCallback() { // from class: com.google.android.datatransport.runtime.a
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void onSchedule(Exception exc) {
                TransportImpl.m76310c(exc);
            }
        });
    }

    /* renamed from: c */
    public static /* synthetic */ void m76310c(Exception exc) {
    }
}
