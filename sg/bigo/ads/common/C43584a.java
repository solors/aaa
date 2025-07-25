package sg.bigo.ads.common;

import android.os.Parcel;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import sg.bigo.ads.common.utils.C43837r;

/* renamed from: sg.bigo.ads.common.a */
/* loaded from: classes10.dex */
public final class C43584a implements InterfaceC43615f {

    /* renamed from: a */
    public static final C43584a f114136a = new C43584a();

    /* renamed from: b */
    public String f114137b;

    /* renamed from: c */
    public boolean f114138c;

    /* renamed from: d */
    private long f114139d;

    private C43584a() {
        this.f114137b = "";
        this.f114138c = true;
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        parcel.writeString(this.f114137b);
        parcel.writeInt(this.f114138c ? 1 : 0);
        parcel.writeLong(this.f114139d);
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        boolean z;
        this.f114137b = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f114138c = z;
        this.f114139d = parcel.readLong();
    }

    public final String toString() {
        return "{advertisingId='" + this.f114137b + "', isLimitAdTrackingEnabled=" + this.f114138c + ", lastUpdateTime=" + this.f114139d + '}';
    }

    public C43584a(@NonNull Parcel parcel) {
        mo4437b(parcel);
    }

    /* renamed from: a */
    public final boolean m5356a() {
        return Math.abs(C43837r.m4817b() - this.f114139d) > TimeUnit.DAYS.toMillis(1L);
    }

    public C43584a(@NonNull String str, boolean z) {
        this.f114137b = str;
        this.f114138c = z;
        this.f114139d = C43837r.m4817b();
    }
}
