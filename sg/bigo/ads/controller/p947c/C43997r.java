package sg.bigo.ads.controller.p947c;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import org.json.JSONObject;
import sg.bigo.ads.api.core.InterfaceC43573o;

/* renamed from: sg.bigo.ads.controller.c.r */
/* loaded from: classes10.dex */
public final class C43997r implements InterfaceC43573o.InterfaceC43577d {

    /* renamed from: a */
    private final boolean f115404a;

    /* renamed from: b */
    private final int f115405b;

    /* renamed from: c */
    private boolean f115406c = false;

    /* renamed from: d */
    private final long f115407d;

    /* renamed from: e */
    private final long f115408e;

    /* renamed from: f */
    private long f115409f;

    public C43997r(@NonNull JSONObject jSONObject) {
        this.f115404a = jSONObject.optInt("play_ad_downloading", 0) == 1;
        this.f115405b = jSONObject.optInt("play_ad_threshold", 50);
        this.f115407d = jSONObject.optLong("play_ad_min_second", 6L) * 1000;
        this.f115408e = jSONObject.optLong("threshold_max_second", 15L) * 1000;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43573o.InterfaceC43577d
    /* renamed from: a */
    public final long mo4202a() {
        return this.f115409f;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43573o.InterfaceC43577d
    /* renamed from: b */
    public final boolean mo4199b() {
        return this.f115404a;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43573o.InterfaceC43577d
    @IntRange(from = 1, m105510to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
    /* renamed from: c */
    public final int mo4198c() {
        if (this.f115404a) {
            long j = this.f115409f;
            if (j > this.f115407d) {
                long j2 = this.f115408e;
                if (j <= j2) {
                    return this.f115405b;
                }
                if (j < (3 * j2) / 2) {
                    return (int) ((this.f115405b * j2) / j);
                }
                return (this.f115405b * 2) / 3;
            }
            return 100;
        }
        return 100;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43573o.InterfaceC43577d
    /* renamed from: d */
    public final boolean mo4197d() {
        return this.f115406c;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43573o.InterfaceC43577d
    /* renamed from: a */
    public final void mo4201a(long j) {
        this.f115409f = j;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43573o.InterfaceC43577d
    /* renamed from: a */
    public final void mo4200a(boolean z) {
        this.f115406c = z;
    }
}
