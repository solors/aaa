package sg.bigo.ads.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.api.p903a.InterfaceC43528l;
import sg.bigo.ads.api.p904b.InterfaceC43537c;

/* loaded from: classes10.dex */
public class IconAdsRequest extends AbstractC43532b implements InterfaceC43537c {

    /* renamed from: h */
    private final InterfaceC43528l f114005h;

    /* renamed from: i */
    private final InterfaceC43550c f114006i;

    /* renamed from: j */
    private final int f114007j;

    /* renamed from: k */
    private final int f114008k;

    /* renamed from: l */
    private final int f114009l;

    /* renamed from: m */
    private final InterfaceC43505b f114010m;

    /* renamed from: sg.bigo.ads.api.IconAdsRequest$a */
    /* loaded from: classes10.dex */
    public static class C43504a extends AbstractC43544c<C43504a, IconAdsRequest> {

        /* renamed from: a */
        public InterfaceC43528l f114011a;

        /* renamed from: b */
        public InterfaceC43550c f114012b;

        /* renamed from: c */
        public int f114013c;

        /* renamed from: d */
        public int f114014d = 1;

        /* renamed from: e */
        public int f114015e = 20;

        /* renamed from: f */
        public InterfaceC43505b f114016f;

        @Override // sg.bigo.ads.api.AbstractC43544c
        protected final /* synthetic */ IconAdsRequest createAdRequest() {
            if (this.f114011a == null) {
                return null;
            }
            return new IconAdsRequest(this, (byte) 0);
        }
    }

    /* renamed from: sg.bigo.ads.api.IconAdsRequest$b */
    /* loaded from: classes10.dex */
    public interface InterfaceC43505b {
        /* renamed from: a */
        int mo5485a();
    }

    private IconAdsRequest(@NonNull C43504a c43504a) {
        super(c43504a.mSlotId, null);
        this.f114005h = c43504a.f114011a;
        this.f114006i = c43504a.f114012b;
        this.f114007j = c43504a.f114013c;
        this.f114008k = c43504a.f114014d;
        this.f114009l = c43504a.f114015e;
        this.f114010m = c43504a.f114016f;
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    /* renamed from: c */
    public final int mo5358c() {
        return this.f114005h.mo4438b();
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    @Nullable
    /* renamed from: d */
    public final Map<String, Object> mo5460d() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC43550c interfaceC43550c = this.f114006i;
        if (interfaceC43550c != null) {
            linkedHashMap.put("host_slot", interfaceC43550c.mo4351b());
            linkedHashMap.put("host_placement", this.f114006i.mo4348c());
            linkedHashMap.put("host_ad_type", Integer.valueOf(this.f114006i.mo4326x()));
            linkedHashMap.put("host_adx_type", Integer.valueOf(this.f114006i.mo4327w()));
            linkedHashMap.put("dsp_source", this.f114006i.mo4328v());
            linkedHashMap.put("main_domain", this.f114006i.mo4339i());
            linkedHashMap.put("main_bundle", this.f114006i.mo4334n());
            linkedHashMap.put("main_adx_sid", Long.valueOf(this.f114006i.mo4325y()));
            linkedHashMap.put("main_ad_id", this.f114006i.mo4330r());
            linkedHashMap.put("dsp_extra", this.f114006i.mo4357an());
        }
        linkedHashMap.put("adx_type", 5);
        linkedHashMap.put("ad_type", Integer.valueOf(mo5358c()));
        linkedHashMap.put("icon_ads_type", Integer.valueOf(this.f114008k));
        linkedHashMap.put("scene_page", Integer.valueOf(this.f114007j));
        linkedHashMap.put("icon_num", Integer.valueOf(this.f114009l));
        return linkedHashMap;
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    /* renamed from: e */
    public final boolean mo5459e() {
        return true;
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    /* renamed from: f */
    public final boolean mo5458f() {
        return true;
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    /* renamed from: g */
    public final boolean mo5457g() {
        return true;
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    /* renamed from: h */
    public final InterfaceC43528l mo5456h() {
        return this.f114005h;
    }

    @Override // sg.bigo.ads.api.p904b.InterfaceC43536b
    /* renamed from: i */
    public final InterfaceC43550c mo5435i() {
        return this.f114006i;
    }

    @Override // sg.bigo.ads.api.p904b.InterfaceC43537c
    /* renamed from: j */
    public final int mo5434j() {
        return this.f114009l;
    }

    @Override // sg.bigo.ads.api.p904b.InterfaceC43537c
    /* renamed from: k */
    public final int mo5433k() {
        return this.f114007j;
    }

    @Override // sg.bigo.ads.api.p904b.InterfaceC43537c
    /* renamed from: l */
    public final int mo5432l() {
        InterfaceC43505b interfaceC43505b = this.f114010m;
        if (interfaceC43505b != null) {
            return interfaceC43505b.mo5485a();
        }
        return 1;
    }

    /* synthetic */ IconAdsRequest(C43504a c43504a, byte b) {
        this(c43504a);
    }
}
