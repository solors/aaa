package sg.bigo.ads;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.AbstractC43610e;
import sg.bigo.ads.common.C43722n;

/* renamed from: sg.bigo.ads.a */
/* loaded from: classes10.dex */
public final class C42757a extends AbstractC43610e {

    /* renamed from: a */
    public String f111935a;

    public C42757a(@NonNull Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.common.AbstractC43610e
    /* renamed from: a */
    public final String mo4447a() {
        return "bigo_app.dat";
    }

    @Override // sg.bigo.ads.common.AbstractC43610e
    /* renamed from: b */
    public final String mo4443b() {
        return "bigo_app.dat";
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        parcel.writeString(this.f111935a);
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        this.f111935a = C43722n.m5124a(parcel, "");
    }
}
