package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.p903a.InterfaceC43531o;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.api.core.s */
/* loaded from: classes10.dex */
public final class C43581s implements InterfaceC43531o {

    /* renamed from: a */
    private int f114135a = 0;

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        parcel.writeString(String.valueOf(this.f114135a));
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        if (parcel.dataAvail() > 0) {
            String readString = parcel.readString();
            if (!TextUtils.isEmpty(readString)) {
                String[] split = readString.split(",");
                if (split.length > 0) {
                    this.f114135a = C43836q.m4834a(split[0], 0);
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43531o
    /* renamed from: a */
    public final void mo5364a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f114135a = jSONObject.optInt("ll_on", 0);
        }
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43531o
    /* renamed from: a */
    public final boolean mo5365a() {
        return this.f114135a == 1;
    }
}
