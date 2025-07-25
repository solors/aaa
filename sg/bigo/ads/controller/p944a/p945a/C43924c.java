package sg.bigo.ads.controller.p944a.p945a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import sg.bigo.ads.common.C43722n;

/* renamed from: sg.bigo.ads.controller.a.a.c */
/* loaded from: classes10.dex */
public final class C43924c extends C43918b {

    /* renamed from: d */
    public static final long f115019d = TimeUnit.HOURS.toMillis(1);

    /* renamed from: e */
    public static final long f115020e = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: f */
    public static final long f115021f = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: g */
    public long f115022g;

    /* renamed from: h */
    public long f115023h;

    /* renamed from: i */
    private long f115024i;

    public C43924c(@NonNull String str) {
        super(str, "");
        this.f115024i = f115019d;
    }

    @Override // sg.bigo.ads.controller.p944a.p945a.C43918b, sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        super.mo4441a(parcel);
        parcel.writeLong(this.f115024i);
        parcel.writeLong(this.f115022g);
        parcel.writeLong(this.f115023h);
    }

    @Override // sg.bigo.ads.controller.p944a.p945a.C43918b, sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        super.mo4437b(parcel);
        this.f115024i = C43722n.m5125a(parcel, f115019d);
        this.f115022g = C43722n.m5125a(parcel, 0L);
        this.f115023h = C43722n.m5125a(parcel, 0L);
    }

    @Override // sg.bigo.ads.controller.p944a.p945a.C43918b
    /* renamed from: a */
    public final void mo4569a(@NonNull JSONObject jSONObject) {
        super.mo4569a(jSONObject);
        this.f115024i = Math.max(jSONObject.optLong("interval", f115019d / 1000) * 1000, f115021f);
    }

    /* renamed from: a */
    public final boolean m4570a() {
        long j = this.f115022g;
        long j2 = this.f115023h;
        if (j == j2) {
            return true;
        }
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        long currentTimeMillis = System.currentTimeMillis();
        return i > 0 ? Math.abs(currentTimeMillis - this.f115022g) > f115020e : Math.abs(currentTimeMillis - this.f115023h) > this.f115024i;
    }
}
