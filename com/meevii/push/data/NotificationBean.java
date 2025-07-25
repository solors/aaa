package com.meevii.push.data;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import com.meevii.push.notification.IDisplayPushData;
import p844q6.DataManager;

/* loaded from: classes5.dex */
public class NotificationBean implements Parcelable, IDisplayPushData {
    public static final Parcelable.Creator<NotificationBean> CREATOR = new C23319a();

    /* renamed from: b */
    private int f61545b;

    /* renamed from: c */
    private String f61546c;

    /* renamed from: d */
    private String f61547d;

    /* renamed from: f */
    private String f61548f;

    /* renamed from: g */
    private String f61549g;

    /* renamed from: h */
    private String f61550h;

    /* renamed from: i */
    private String f61551i;

    /* renamed from: j */
    private String f61552j;

    /* renamed from: k */
    private String f61553k;

    /* renamed from: l */
    private boolean f61554l;

    /* renamed from: m */
    private String f61555m;

    /* renamed from: n */
    private String f61556n;

    /* renamed from: o */
    private boolean f61557o;

    /* renamed from: p */
    private String f61558p;

    /* renamed from: q */
    private String f61559q;

    /* renamed from: r */
    private String f61560r;

    /* renamed from: s */
    private String f61561s;

    /* renamed from: t */
    private boolean f61562t;

    /* renamed from: com.meevii.push.data.NotificationBean$a */
    /* loaded from: classes5.dex */
    class C23319a implements Parcelable.Creator<NotificationBean> {
        C23319a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public NotificationBean createFromParcel(Parcel parcel) {
            return new NotificationBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public NotificationBean[] newArray(int i) {
            return new NotificationBean[i];
        }
    }

    public NotificationBean() {
        this.f61555m = CustomTabsCallback.ONLINE_EXTRAS_KEY;
        this.f61545b = DataManager.m12928g().m12931d();
    }

    /* renamed from: c */
    public String m47984c() {
        return this.f61559q;
    }

    /* renamed from: d */
    public String m47983d() {
        return this.f61558p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public String m47982f() {
        return this.f61552j;
    }

    /* renamed from: g */
    public String m47981g() {
        return this.f61560r;
    }

    /* renamed from: h */
    public String m47980h() {
        return this.f61561s;
    }

    /* renamed from: i */
    public String m47979i() {
        return this.f61549g;
    }

    /* renamed from: j */
    public String m47978j() {
        return this.f61548f;
    }

    /* renamed from: k */
    public String m47977k() {
        return this.f61550h;
    }

    /* renamed from: l */
    public String m47976l() {
        return this.f61546c;
    }

    /* renamed from: m */
    public String m47975m() {
        return this.f61553k;
    }

    /* renamed from: n */
    public String m47974n() {
        return this.f61551i;
    }

    /* renamed from: o */
    public String m47973o() {
        String str;
        if (!TextUtils.isEmpty(this.f61551i)) {
            str = "image";
        } else {
            str = "text";
        }
        if (!TextUtils.isEmpty(this.f61552j)) {
            str = "bigimage";
        }
        if (!TextUtils.isEmpty(this.f61559q)) {
            if (!TextUtils.isEmpty(this.f61560r) && !TextUtils.isEmpty(this.f61561s)) {
                return "bg_color_btn";
            }
            return "bg_color";
        } else if (!TextUtils.isEmpty(this.f61558p)) {
            return "bg_image";
        } else {
            return str;
        }
    }

    /* renamed from: p */
    public int m47972p() {
        return this.f61545b;
    }

    /* renamed from: q */
    public String m47971q() {
        return this.f61556n;
    }

    /* renamed from: r */
    public String m47970r() {
        return this.f61547d;
    }

    /* renamed from: s */
    public boolean m47969s() {
        return this.f61562t;
    }

    /* renamed from: t */
    public boolean m47968t() {
        return this.f61557o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f61545b);
        parcel.writeString(this.f61546c);
        parcel.writeString(this.f61547d);
        parcel.writeString(this.f61549g);
        parcel.writeString(this.f61550h);
        parcel.writeString(this.f61551i);
        parcel.writeString(this.f61552j);
        parcel.writeString(this.f61553k);
        parcel.writeString(this.f61555m);
        parcel.writeByte(this.f61554l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f61548f);
        parcel.writeString(this.f61556n);
        parcel.writeByte(this.f61557o ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f61558p);
        parcel.writeString(this.f61559q);
        parcel.writeString(this.f61560r);
        parcel.writeString(this.f61561s);
        parcel.writeByte(this.f61562t ? (byte) 1 : (byte) 0);
    }

    public NotificationBean(Intent intent) {
        this.f61555m = CustomTabsCallback.ONLINE_EXTRAS_KEY;
        this.f61546c = intent.getStringExtra("hms_id");
        this.f61548f = intent.getStringExtra("hms_content_id");
        this.f61547d = intent.getStringExtra("hms_title");
        this.f61549g = intent.getStringExtra("hms_content");
        this.f61551i = intent.getStringExtra("hms_image_url");
        this.f61552j = intent.getStringExtra("hms_big_image_url");
        this.f61554l = "true".equals(intent.getStringExtra("hms_sound"));
        this.f61550h = intent.getStringExtra("hms_extension_msg");
        String stringExtra = intent.getStringExtra("hms_style");
        this.f61553k = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            this.f61553k = "1";
        }
        this.f61545b = TextUtils.isEmpty(this.f61546c) ? DataManager.m12928g().m12931d() : this.f61546c.hashCode();
        this.f61556n = intent.getStringExtra("hms_sound_url");
        this.f61557o = TextUtils.equals("true", intent.getStringExtra("hms_vibration"));
        this.f61558p = intent.getStringExtra("hms_bg_image_url");
        this.f61559q = intent.getStringExtra("hms_bg_color");
        this.f61560r = intent.getStringExtra("hms_btn_bg_color");
        this.f61561s = intent.getStringExtra("hms_btn_content");
        this.f61562t = TextUtils.equals("true", intent.getStringExtra("hms_float"));
    }

    protected NotificationBean(Parcel parcel) {
        this.f61555m = CustomTabsCallback.ONLINE_EXTRAS_KEY;
        this.f61545b = parcel.readInt();
        this.f61546c = parcel.readString();
        this.f61547d = parcel.readString();
        this.f61549g = parcel.readString();
        this.f61550h = parcel.readString();
        this.f61551i = parcel.readString();
        this.f61552j = parcel.readString();
        this.f61553k = parcel.readString();
        this.f61555m = parcel.readString();
        this.f61554l = parcel.readByte() == 1;
        this.f61548f = parcel.readString();
        this.f61556n = parcel.readString();
        this.f61557o = parcel.readByte() == 1;
        this.f61558p = parcel.readString();
        this.f61559q = parcel.readString();
        this.f61560r = parcel.readString();
        this.f61561s = parcel.readString();
        this.f61562t = parcel.readByte() == 1;
    }
}
