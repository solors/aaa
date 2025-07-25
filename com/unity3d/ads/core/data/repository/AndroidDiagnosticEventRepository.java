package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.p687v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.p687v1.NativeConfigurationOuterClass;
import ge.C33323f0;
import ge.C33329j;
import ge.C33361p0;
import ge.InterfaceC33420y;
import ge.InterfaceC33421z;
import ge.SharedFlow;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences._Sequences;
import kotlinx.coroutines.C37756k;
import kotlinx.coroutines.C37785p0;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidDiagnosticEventRepository.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {
    @NotNull
    private final InterfaceC33420y<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> _diagnosticEvents;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents;
    @NotNull
    private final InterfaceC33421z<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> batch;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents;
    @NotNull
    private final InterfaceC33421z<Boolean> configured;
    @NotNull
    private final CoroutineScope coroutineScope;
    @NotNull
    private final SharedFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> diagnosticEvents;
    @NotNull
    private final InterfaceC33421z<Boolean> enabled;
    @NotNull
    private final CoroutineTimer flushTimer;
    @NotNull
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    public AndroidDiagnosticEventRepository(@NotNull CoroutineTimer flushTimer, @NotNull GetDiagnosticEventRequest getDiagnosticEventRequest, @NotNull CoroutineDispatcher dispatcher) {
        List m17166m;
        Intrinsics.checkNotNullParameter(flushTimer, "flushTimer");
        Intrinsics.checkNotNullParameter(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.flushTimer = flushTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.coroutineScope = C37785p0.m16122j(C37785p0.m16131a(dispatcher), new CoroutineName("DiagnosticEventRepository"));
        m17166m = C37563v.m17166m();
        this.batch = C33361p0.m24033a(m17166m);
        this.maxBatchSize = Integer.MAX_VALUE;
        this.allowedEvents = Collections.synchronizedSet(new LinkedHashSet());
        this.blockedEvents = Collections.synchronizedSet(new LinkedHashSet());
        Boolean bool = Boolean.FALSE;
        this.enabled = C33361p0.m24033a(bool);
        this.configured = C33361p0.m24033a(bool);
        InterfaceC33420y<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> m24127b = C33323f0.m24127b(100, 0, null, 6, null);
        this._diagnosticEvents = m24127b;
        this.diagnosticEvents = C33329j.m24099b(m24127b);
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(@NotNull DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> m17568K0;
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value2;
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> m17568K02;
        Intrinsics.checkNotNullParameter(diagnosticEvent, "diagnosticEvent");
        if (!this.configured.getValue().booleanValue()) {
            InterfaceC33421z<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> interfaceC33421z = this.batch;
            do {
                value2 = interfaceC33421z.getValue();
                m17568K02 = _Collections.m17568K0(value2, diagnosticEvent);
            } while (!interfaceC33421z.mo23981a(value2, m17568K02));
        } else if (!this.enabled.getValue().booleanValue()) {
        } else {
            InterfaceC33421z<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> interfaceC33421z2 = this.batch;
            do {
                value = interfaceC33421z2.getValue();
                m17568K0 = _Collections.m17568K0(value, diagnosticEvent);
            } while (!interfaceC33421z2.mo23981a(value, m17568K0));
            if (this.batch.getValue().size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> m17166m;
        InterfaceC33421z<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> interfaceC33421z = this.batch;
        do {
            value = interfaceC33421z.getValue();
            m17166m = C37563v.m17166m();
        } while (!interfaceC33421z.mo23981a(value, m17166m));
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(@NotNull NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticsEventsConfiguration) {
        Intrinsics.checkNotNullParameter(diagnosticsEventsConfiguration, "diagnosticsEventsConfiguration");
        this.configured.setValue(Boolean.TRUE);
        this.enabled.setValue(Boolean.valueOf(diagnosticsEventsConfiguration.getEnabled()));
        if (!this.enabled.getValue().booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticsEventsConfiguration.getMaxBatchSize();
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set = this.allowedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = diagnosticsEventsConfiguration.getAllowedEventsList();
        Intrinsics.checkNotNullExpressionValue(allowedEventsList, "diagnosticsEventsConfiguration.allowedEventsList");
        set.addAll(allowedEventsList);
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set2 = this.blockedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = diagnosticsEventsConfiguration.getBlockedEventsList();
        Intrinsics.checkNotNullExpressionValue(blockedEventsList, "diagnosticsEventsConfiguration.blockedEventsList");
        set2.addAll(blockedEventsList);
        this.flushTimer.start(0L, diagnosticsEventsConfiguration.getMaxBatchIntervalMs(), new AndroidDiagnosticEventRepository$configure$1(this));
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() {
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> value;
        List<DiagnosticEventRequestOuterClass.DiagnosticEvent> m17166m;
        Sequence m17548e0;
        Sequence m16804z;
        Sequence m16814p;
        Sequence m16814p2;
        List m16822J;
        if (!this.enabled.getValue().booleanValue()) {
            return;
        }
        InterfaceC33421z<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> interfaceC33421z = this.batch;
        do {
            value = interfaceC33421z.getValue();
            m17166m = C37563v.m17166m();
        } while (!interfaceC33421z.mo23981a(value, m17166m));
        m17548e0 = _Collections.m17548e0(value);
        m16804z = _Sequences.m16804z(m17548e0, new AndroidDiagnosticEventRepository$flush$events$2(this));
        m16814p = _Sequences.m16814p(m16804z, new AndroidDiagnosticEventRepository$flush$events$3(this));
        m16814p2 = _Sequences.m16814p(m16814p, new AndroidDiagnosticEventRepository$flush$events$4(this));
        m16822J = _Sequences.m16822J(m16814p2);
        if (!m16822J.isEmpty()) {
            DeviceLog.debug("Unity Ads Sending diagnostic batch enabled: " + this.enabled.getValue().booleanValue() + " size: " + m16822J.size() + " :: " + m16822J);
            C37756k.m16221d(this.coroutineScope, null, null, new AndroidDiagnosticEventRepository$flush$1(this, m16822J, null), 3, null);
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    @NotNull
    public SharedFlow<List<DiagnosticEventRequestOuterClass.DiagnosticEvent>> getDiagnosticEvents() {
        return this.diagnosticEvents;
    }
}
