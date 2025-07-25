package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;
import sg.bigo.ads.api.p903a.InterfaceC43523g;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.api.core.l */
/* loaded from: classes10.dex */
public final class C43570l implements InterfaceC43523g {

    /* renamed from: a */
    private int f114115a = 2;

    /* renamed from: b */
    private int f114116b = 3;

    /* renamed from: c */
    private int f114117c = 5;

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        parcel.writeString(this.f114115a + "," + this.f114116b + "," + this.f114117c);
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43523g
    /* renamed from: b */
    public final int mo5377b() {
        return this.f114116b;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43523g
    /* renamed from: c */
    public final int mo5376c() {
        return this.f114117c;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43523g
    /* renamed from: a */
    public final void mo5378a(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f114115a = jSONObject.optInt("id_show_loading", 2);
            this.f114116b = jSONObject.optInt("loading_timeout", 3);
            this.f114117c = jSONObject.optInt("material_show_close_button", 5);
        }
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        String[] split;
        if (parcel.dataAvail() > 0) {
            String readString = parcel.readString();
            if (TextUtils.isEmpty(readString) || (split = readString.split(",")) == null || split.length != 3) {
                return;
            }
            this.f114115a = C43836q.m4834a(split[0], 2);
            this.f114116b = C43836q.m4834a(split[1], 3);
            this.f114117c = C43836q.m4834a(split[2], 5);
        }
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43523g
    /* renamed from: a */
    public final boolean mo5379a() {
        return this.f114115a == 2;
    }
}
