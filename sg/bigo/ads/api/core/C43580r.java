package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.p903a.InterfaceC43530n;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.api.core.r */
/* loaded from: classes10.dex */
public final class C43580r implements InterfaceC43530n {

    /* renamed from: a */
    private int f114132a = 0;

    /* renamed from: b */
    private long f114133b = 5000;

    /* renamed from: c */
    private long f114134c = 21600000;

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        parcel.writeString(this.f114132a + "," + this.f114133b + "," + this.f114134c);
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43530n
    /* renamed from: b */
    public final long mo5367b() {
        return this.f114133b;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43530n
    /* renamed from: c */
    public final long mo5366c() {
        return this.f114134c;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43530n
    /* renamed from: a */
    public final void mo5368a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f114132a = jSONObject.optInt("duration_on", 0);
            this.f114133b = jSONObject.optLong("duration_valid_interval", 5000L);
            this.f114134c = jSONObject.optLong("suspend_limit", 21600000L);
        }
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        if (parcel.dataAvail() > 0) {
            String readString = parcel.readString();
            if (TextUtils.isEmpty(readString)) {
                return;
            }
            String[] split = readString.split(",");
            if (split.length >= 3) {
                this.f114132a = C43836q.m4834a(split[0], 0);
                this.f114133b = C43836q.m4833a(split[1], 5000L);
                this.f114134c = C43836q.m4833a(split[2], 21600000L);
            }
        }
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43530n
    /* renamed from: a */
    public final boolean mo5369a() {
        return this.f114132a == 1;
    }
}
