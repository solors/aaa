package sg.bigo.ads.api.core;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.p903a.InterfaceC43526j;
import sg.bigo.ads.common.InterfaceC43615f;

/* renamed from: sg.bigo.ads.api.core.m */
/* loaded from: classes10.dex */
public final class C43571m implements InterfaceC43526j, InterfaceC43615f {

    /* renamed from: a */
    public long f114118a = 0;

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        parcel.writeLong(this.f114118a);
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        this.f114118a = parcel.readLong();
    }

    public final String toString() {
        return "{value=" + this.f114118a + '}';
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43526j
    /* renamed from: a */
    public final boolean mo5375a(int i) {
        return (this.f114118a & (1 << i)) != 0;
    }
}
