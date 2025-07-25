package io.bidmachine.rendering.internal.event;

import android.text.TextUtils;
import io.bidmachine.rendering.internal.AbstractC37037k;
import io.bidmachine.rendering.model.EventTaskParams;
import io.bidmachine.rendering.model.EventTaskType;
import io.bidmachine.rendering.model.EventType;
import io.bidmachine.rendering.utils.Utils;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.bidmachine.rendering.internal.event.b */
/* loaded from: classes9.dex */
public class C37028b implements InterfaceC37027a {

    /* renamed from: a */
    private final String f97734a;

    /* renamed from: b */
    private final InterfaceC37030c f97735b;

    /* renamed from: c */
    private final Map f97736c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.bidmachine.rendering.internal.event.b$a */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class C37029a {

        /* renamed from: a */
        static final /* synthetic */ int[] f97737a;

        static {
            int[] iArr = new int[EventTaskType.values().length];
            f97737a = iArr;
            try {
                iArr[EventTaskType.Track.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f97737a[EventTaskType.Open.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f97737a[EventTaskType.NotifyOpen.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f97737a[EventTaskType.Skip.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f97737a[EventTaskType.Close.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f97737a[EventTaskType.Mute.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f97737a[EventTaskType.UnMute.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f97737a[EventTaskType.Show.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f97737a[EventTaskType.Hide.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f97737a[EventTaskType.Progress.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f97737a[EventTaskType.Schedule.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f97737a[EventTaskType.Start.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f97737a[EventTaskType.LockVisibility.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f97737a[EventTaskType.UnlockVisibility.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f97737a[EventTaskType.SimulateClick.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public C37028b(String str, InterfaceC37030c interfaceC37030c, Map map) {
        this.f97734a = str;
        this.f97735b = interfaceC37030c;
        this.f97736c = map == null ? new EnumMap(EventType.class) : map;
    }

    /* renamed from: a */
    private void m19212a(EventType eventType, EventTaskParams eventTaskParams, Object... objArr) {
        m19209a(eventType, eventTaskParams.getEventTaskType(), eventTaskParams.getTarget(), eventTaskParams.getValue(), objArr);
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: b */
    public void mo19204b() {
        m19207a(EventType.OnResume, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: c */
    public void mo19203c() {
        m19207a(EventType.OnUnMute, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: d */
    public void mo19202d() {
        m19207a(EventType.OnThirdQuartile, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: e */
    public void mo19201e() {
        m19207a(EventType.OnSkip, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: f */
    public void mo19200f() {
        m19207a(EventType.OnMute, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: g */
    public String mo19199g() {
        return this.f97734a;
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: h */
    public void mo19198h() {
        m19207a(EventType.OnPause, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: i */
    public void mo19197i() {
        m19207a(EventType.OnClick, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: j */
    public void mo19196j() {
        m19207a(EventType.OnMidpoint, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: k */
    public void mo19195k() {
        m19207a(EventType.OnScheduled, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: l */
    public void mo19194l() {
        m19207a(EventType.OnFirstQuartile, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: m */
    public void mo19193m() {
        m19207a(EventType.OnStart, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: n */
    public void mo19192n() {
        m19207a(EventType.OnClose, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: o */
    public void mo19191o() {
        m19207a(EventType.OnImpression, new Object[0]);
    }

    /* renamed from: a */
    private void m19209a(EventType eventType, EventTaskType eventTaskType, String str, Object obj, Object... objArr) {
        try {
            switch (C37029a.f97737a[eventTaskType.ordinal()]) {
                case 1:
                    String utils = Utils.toString(obj);
                    if (utils == null) {
                        m19210a(eventType, eventTaskType, "track url");
                        return;
                    }
                    m19208a(eventType, eventTaskType, "%s", utils);
                    this.f97735b.mo19177h(utils);
                    return;
                case 2:
                    String utils2 = Utils.toString(obj);
                    if (TextUtils.isEmpty(utils2) && objArr != null && objArr.length >= 1) {
                        utils2 = Utils.toString(objArr[0]);
                    }
                    if (TextUtils.isEmpty(utils2)) {
                        m19210a(eventType, eventTaskType, "open url");
                        return;
                    }
                    m19208a(eventType, eventTaskType, "%s", utils2);
                    this.f97735b.mo19182d(utils2);
                    return;
                case 3:
                    String utils3 = Utils.toString(obj);
                    if (TextUtils.isEmpty(utils3) && objArr != null && objArr.length >= 1) {
                        utils3 = Utils.toString(objArr[0]);
                    }
                    if (TextUtils.isEmpty(utils3)) {
                        m19210a(eventType, eventTaskType, "notify open url");
                        return;
                    }
                    m19208a(eventType, eventTaskType, "%s", utils3);
                    this.f97735b.mo19181e(utils3);
                    return;
                case 4:
                    m19211a(eventType, eventTaskType);
                    this.f97735b.mo19180f();
                    return;
                case 5:
                    m19211a(eventType, eventTaskType);
                    this.f97735b.mo19185b();
                    return;
                case 6:
                    m19208a(eventType, eventTaskType, "target - %s", str);
                    this.f97735b.mo19183c(str);
                    return;
                case 7:
                    m19208a(eventType, eventTaskType, "target - %s", str);
                    this.f97735b.mo19176i(str);
                    return;
                case 8:
                    m19208a(eventType, eventTaskType, "target - %s", str);
                    this.f97735b.mo19190a(str);
                    return;
                case 9:
                    m19208a(eventType, eventTaskType, "target - %s", str);
                    this.f97735b.mo19184b(str);
                    return;
                case 10:
                    if (objArr != null && objArr.length >= 2) {
                        Long l = Utils.toLong(objArr[0]);
                        Long l2 = Utils.toLong(objArr[1]);
                        if (l != null && l2 != null) {
                            this.f97735b.mo19188a(str, l.longValue(), l2.longValue(), (((float) l2.longValue()) * 100.0f) / ((float) l.longValue()));
                            return;
                        }
                        m19210a(eventType, eventTaskType, "maxProgressMs, currentProgressMs");
                        return;
                    }
                    m19210a(eventType, eventTaskType, "progress parameters");
                    return;
                case 11:
                    Long l3 = Utils.toLong(obj);
                    if (l3 == null) {
                        m19210a(eventType, eventTaskType, "schedule time");
                        return;
                    }
                    m19208a(eventType, eventTaskType, "target - %s, timeMs - %s", str, l3);
                    this.f97735b.mo19189a(str, l3.longValue());
                    return;
                case 12:
                    String utils4 = Utils.toString(obj);
                    if (utils4 == null) {
                        return;
                    }
                    m19208a(eventType, eventTaskType, "target - %s, value - %s", str, utils4);
                    this.f97735b.mo19187a(str, utils4);
                    return;
                case 13:
                    Boolean bool = Utils.toBoolean(obj);
                    if (bool == null && objArr != null && objArr.length >= 1) {
                        bool = Utils.toBoolean(objArr[0]);
                    }
                    if (bool == null) {
                        m19210a(eventType, eventTaskType, "visibility value");
                        return;
                    }
                    m19208a(eventType, eventTaskType, "target - %s, lockVisibility - %s", str, bool);
                    this.f97735b.mo19186a(str, bool.booleanValue());
                    return;
                case 14:
                    m19208a(eventType, eventTaskType, "target - %s", str);
                    this.f97735b.mo19179f(str);
                    return;
                case 15:
                    m19208a(eventType, eventTaskType, "target - %s", str);
                    this.f97735b.mo19178g(str);
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            AbstractC37037k.m19161b(th);
        }
    }

    /* renamed from: a */
    private void m19207a(EventType eventType, Object... objArr) {
        List<EventTaskParams> list = (List) this.f97736c.get(eventType);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (EventTaskParams eventTaskParams : list) {
            m19212a(eventType, eventTaskParams, objArr);
        }
    }

    /* renamed from: a */
    private void m19211a(EventType eventType, EventTaskType eventTaskType) {
        m19208a(eventType, eventTaskType, null, new Object[0]);
    }

    /* renamed from: a */
    private void m19208a(EventType eventType, EventTaskType eventTaskType, String str, Object... objArr) {
        if (AbstractC37037k.m19169a()) {
            if (str == null || objArr == null) {
                AbstractC37037k.m19162b("Event", "Event - %s (source - %s), Task - %s", eventType.getKey(), mo19199g(), eventTaskType.getKey());
                return;
            }
            try {
                AbstractC37037k.m19162b("Event", "Event - %s (source - %s), Task - %s (%s)", eventType.getKey(), mo19199g(), eventTaskType.getKey(), String.format(str, objArr));
            } catch (Throwable th) {
                AbstractC37037k.m19161b(th);
            }
        }
    }

    /* renamed from: a */
    private static void m19210a(EventType eventType, EventTaskType eventTaskType, String str) {
        AbstractC37037k.m19167a("Event", "Could not find required params (%s) for execute task (%s, %s)", str, eventType, eventTaskType);
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: a */
    public void mo19214a() {
        m19207a(EventType.OnComplete, new Object[0]);
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: a */
    public void mo19206a(String str) {
        m19207a(EventType.OnNavigate, str);
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: a */
    public void mo19213a(long j, long j2) {
        m19207a(EventType.OnProgress, Long.valueOf(j), Long.valueOf(j2));
    }

    @Override // io.bidmachine.rendering.internal.event.InterfaceC37027a
    /* renamed from: a */
    public void mo19205a(boolean z) {
        m19207a(EventType.OnUseCustomClose, Boolean.valueOf(z));
    }
}
