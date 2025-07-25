package sg.bigo.ads.controller.p946b;

import android.os.Parcel;
import androidx.annotation.NonNull;
import org.json.JSONObject;
import sg.bigo.ads.api.p903a.InterfaceC43517d;
import sg.bigo.ads.common.C43722n;
import sg.bigo.ads.common.InterfaceC43615f;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.controller.b.c */
/* loaded from: classes10.dex */
public final class C43964c implements InterfaceC43517d {

    /* renamed from: n */
    private static final int[][] f115145n = {new int[]{1, 2}, new int[]{3, 4}};

    /* renamed from: h */
    int f115153h;

    /* renamed from: a */
    int f115146a = 0;

    /* renamed from: b */
    String f115147b = "";

    /* renamed from: c */
    String f115148c = "";

    /* renamed from: d */
    int f115149d = 0;

    /* renamed from: e */
    int f115150e = 0;

    /* renamed from: f */
    int f115151f = 0;

    /* renamed from: g */
    int f115152g = 0;
    @NonNull

    /* renamed from: i */
    final C43965a f115154i = new C43965a(3);
    @NonNull

    /* renamed from: j */
    final C43965a f115155j = new C43965a(4);
    @NonNull

    /* renamed from: k */
    final C43965a f115156k = new C43965a(12);
    @NonNull

    /* renamed from: l */
    final C43965a f115157l = new C43965a(1);
    @NonNull

    /* renamed from: m */
    final C43965a f115158m = new C43965a(20);

    /* renamed from: sg.bigo.ads.controller.b.c$a */
    /* loaded from: classes10.dex */
    class C43965a implements InterfaceC43615f {

        /* renamed from: a */
        public int f115159a = 0;

        /* renamed from: b */
        public int f115160b = 20;

        /* renamed from: c */
        public int f115161c = 5;

        /* renamed from: e */
        private int f115163e;

        C43965a(int i) {
            this.f115163e = i;
        }

        @Override // sg.bigo.ads.common.InterfaceC43615f
        /* renamed from: a */
        public final void mo4441a(@NonNull Parcel parcel) {
            parcel.writeInt(this.f115159a);
            parcel.writeInt(this.f115160b);
            parcel.writeInt(this.f115163e);
            parcel.writeInt(this.f115161c);
        }

        @Override // sg.bigo.ads.common.InterfaceC43615f
        /* renamed from: b */
        public final void mo4437b(@NonNull Parcel parcel) {
            this.f115159a = parcel.readInt();
            this.f115160b = parcel.readInt();
            this.f115163e = parcel.readInt();
            this.f115161c = parcel.readInt();
        }

        /* renamed from: a */
        public final void m4490a(JSONObject jSONObject) {
            String str;
            int i = this.f115163e;
            if (i == 1) {
                this.f115159a = jSONObject.optInt("nat_load_fail_fill", 0);
                this.f115161c = jSONObject.optInt("nat_time_for_check_process", 5);
                str = "nat_min_video_loading_pro";
            } else if (i == 12) {
                this.f115159a = jSONObject.optInt("spl_load_fail_fill", 0);
                this.f115161c = jSONObject.optInt("spl_time_for_check_process", 5);
                str = "spl_min_video_loading_pro";
            } else if (i == 20) {
                this.f115159a = jSONObject.optInt("pop_load_fail_fill", 0);
                this.f115161c = jSONObject.optInt("pop_time_for_check_process", 5);
                this.f115160b = jSONObject.optInt("pop_min_video_loading_pro", 20);
                return;
            } else if (i == 3) {
                this.f115159a = jSONObject.optInt("int_load_fail_fill", 0);
                this.f115161c = jSONObject.optInt("int_time_for_check_process", 5);
                str = "int_min_video_loading_pro";
            } else if (i != 4) {
                return;
            } else {
                this.f115159a = jSONObject.optInt("rew_load_fail_fill", 0);
                this.f115161c = jSONObject.optInt("rew_time_for_check_process", 5);
                str = "rew_min_video_loading_pro";
            }
            this.f115160b = jSONObject.optInt(str, 20);
        }
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43517d
    /* renamed from: a */
    public final int mo4496a() {
        return this.f115146a;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43517d
    /* renamed from: b */
    public final int mo4493b(int i) {
        C43965a c43965a;
        if (i == 1) {
            c43965a = this.f115157l;
        } else if (i == 12) {
            c43965a = this.f115156k;
        } else if (i == 20) {
            c43965a = this.f115158m;
        } else if (i == 3) {
            c43965a = this.f115154i;
        } else if (i != 4) {
            return 5;
        } else {
            c43965a = this.f115155j;
        }
        return c43965a.f115161c;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43517d
    /* renamed from: c */
    public final boolean mo4492c(int i) {
        if (i != 1) {
            if (i != 12) {
                if (i != 20) {
                    if (i != 3) {
                        if (i != 4 || this.f115155j.f115159a != 1) {
                            return false;
                        }
                        return true;
                    } else if (this.f115154i.f115159a != 1) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (this.f115158m.f115159a != 1) {
                    return false;
                } else {
                    return true;
                }
            } else if (this.f115156k.f115159a != 1) {
                return false;
            } else {
                return true;
            }
        } else if (this.f115157l.f115159a != 1) {
            return false;
        } else {
            return true;
        }
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43517d
    /* renamed from: d */
    public final int mo4491d(int i) {
        C43965a c43965a;
        if (i != 1) {
            if (i != 12) {
                if (i != 20) {
                    if (i != 3) {
                        if (i != 4) {
                            return 20;
                        }
                        c43965a = this.f115155j;
                    } else {
                        c43965a = this.f115154i;
                    }
                } else {
                    c43965a = this.f115158m;
                }
            } else {
                c43965a = this.f115156k;
            }
        } else {
            c43965a = this.f115157l;
        }
        return c43965a.f115160b;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43517d
    /* renamed from: a */
    public final int mo4495a(int i) {
        if (i != 1) {
            if (i != 12) {
                if (i != 20) {
                    if (i != 3) {
                        if (i != 4) {
                            return 0;
                        }
                        return this.f115150e;
                    }
                    return this.f115149d;
                }
                return this.f115153h;
            }
            return this.f115151f;
        }
        return this.f115152g;
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        this.f115146a = parcel.readInt();
        this.f115147b = parcel.readString();
        this.f115148c = parcel.readString();
        this.f115149d = parcel.readInt();
        this.f115150e = parcel.readInt();
        this.f115151f = parcel.readInt();
        this.f115152g = parcel.readInt();
        C43722n.m5113b(parcel, this.f115154i);
        C43722n.m5113b(parcel, this.f115155j);
        C43722n.m5113b(parcel, this.f115156k);
        C43722n.m5113b(parcel, this.f115157l);
        this.f115153h = parcel.readInt();
        C43722n.m5113b(parcel, this.f115158m);
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        parcel.writeInt(this.f115146a);
        parcel.writeString(this.f115147b);
        parcel.writeString(this.f115148c);
        parcel.writeInt(this.f115149d);
        parcel.writeInt(this.f115150e);
        parcel.writeInt(this.f115151f);
        parcel.writeInt(this.f115152g);
        C43722n.m5118a(parcel, this.f115154i);
        C43722n.m5118a(parcel, this.f115155j);
        C43722n.m5118a(parcel, this.f115156k);
        C43722n.m5118a(parcel, this.f115157l);
        parcel.writeInt(this.f115153h);
        C43722n.m5118a(parcel, this.f115158m);
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43517d
    /* renamed from: a */
    public final boolean mo4494a(String str, int i) {
        int i2 = !C43836q.m4837a((CharSequence) this.f115147b) ? 1 : 0;
        int i3 = !C43836q.m4837a((CharSequence) this.f115148c) ? 1 : 0;
        if (mo4495a(i) > 0) {
            int i4 = f115145n[i2][i3];
            if (i4 != 1) {
                if (i4 != 2) {
                    return i4 == 3 && C43836q.m4828a(this.f115147b.split(","), str);
                } else if (!C43836q.m4828a(this.f115148c.split(","), str)) {
                }
            }
            return true;
        }
        return false;
    }
}
