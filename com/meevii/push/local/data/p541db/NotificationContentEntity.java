package com.meevii.push.local.data.p541db;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "push_content")
/* renamed from: com.meevii.push.local.data.db.NotificationContentEntity */
/* loaded from: classes5.dex */
public class NotificationContentEntity implements Parcelable {
    public static final Parcelable.Creator<NotificationContentEntity> CREATOR = new C23322a();
    @NonNull
    @PrimaryKey

    /* renamed from: b */
    private String f61566b;
    @ColumnInfo

    /* renamed from: c */
    private String f61567c;
    @ColumnInfo

    /* renamed from: d */
    private String f61568d;
    @ColumnInfo

    /* renamed from: f */
    private int f61569f;
    @ColumnInfo

    /* renamed from: g */
    private String f61570g;
    @ColumnInfo

    /* renamed from: h */
    private String f61571h;
    @ColumnInfo

    /* renamed from: i */
    private int f61572i;
    @ColumnInfo

    /* renamed from: j */
    private String f61573j;
    @ColumnInfo

    /* renamed from: k */
    private String f61574k;
    @ColumnInfo

    /* renamed from: l */
    private String f61575l;
    @ColumnInfo

    /* renamed from: m */
    private int f61576m;
    @ColumnInfo

    /* renamed from: n */
    private int f61577n;
    @ColumnInfo

    /* renamed from: o */
    private String f61578o;
    @ColumnInfo

    /* renamed from: p */
    private String f61579p;
    @ColumnInfo

    /* renamed from: q */
    private String f61580q;
    @ColumnInfo

    /* renamed from: r */
    private int f61581r;
    @ColumnInfo

    /* renamed from: s */
    private String f61582s;
    @ColumnInfo

    /* renamed from: t */
    private String f61583t;

    /* renamed from: com.meevii.push.local.data.db.NotificationContentEntity$a */
    /* loaded from: classes5.dex */
    class C23322a implements Parcelable.Creator<NotificationContentEntity> {
        C23322a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public NotificationContentEntity createFromParcel(Parcel parcel) {
            return new NotificationContentEntity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public NotificationContentEntity[] newArray(int i) {
            return new NotificationContentEntity[i];
        }
    }

    public NotificationContentEntity() {
    }

    protected NotificationContentEntity(Parcel parcel) {
        this.f61566b = parcel.readString();
        this.f61567c = parcel.readString();
        this.f61568d = parcel.readString();
        this.f61569f = parcel.readInt();
        this.f61570g = parcel.readString();
        this.f61571h = parcel.readString();
        this.f61572i = parcel.readInt();
        this.f61573j = parcel.readString();
        this.f61574k = parcel.readString();
        this.f61575l = parcel.readString();
        this.f61576m = parcel.readInt();
        this.f61577n = parcel.readInt();
        this.f61578o = parcel.readString();
        this.f61579p = parcel.readString();
        this.f61580q = parcel.readString();
        this.f61581r = parcel.readInt();
        this.f61582s = parcel.readString();
        this.f61583t = parcel.readString();
    }

    /* renamed from: A */
    public void m47957A(int i) {
        this.f61581r = i;
    }

    /* renamed from: B */
    public void m47956B(String str) {
        this.f61582s = str;
    }

    /* renamed from: C */
    public void m47955C(String str) {
        this.f61579p = str;
    }

    /* renamed from: D */
    public void m47954D(String str) {
        this.f61580q = str;
    }

    /* renamed from: E */
    public void m47953E(String str) {
        this.f61568d = str;
    }

    /* renamed from: F */
    public void m47952F(String str) {
        this.f61566b = str;
    }

    /* renamed from: G */
    public void m47951G(String str) {
        this.f61574k = str;
    }

    /* renamed from: H */
    public void m47950H(int i) {
        this.f61572i = i;
    }

    /* renamed from: I */
    public void m47949I(String str) {
        this.f61573j = str;
    }

    /* renamed from: J */
    public void m47948J(boolean z) {
        this.f61577n = z ? 1 : 0;
    }

    /* renamed from: K */
    public void m47947K(String str) {
        this.f61571h = str;
    }

    /* renamed from: L */
    public void m47946L(int i) {
        this.f61569f = i;
    }

    /* renamed from: M */
    public void m47945M(String str) {
        this.f61570g = str;
    }

    /* renamed from: N */
    public void m47944N(int i) {
        this.f61577n = i;
    }

    /* renamed from: O */
    public void m47943O(String str) {
        this.f61575l = str;
    }

    /* renamed from: P */
    public void m47942P(String str) {
        this.f61567c = str;
    }

    /* renamed from: Q */
    public void m47941Q(boolean z) {
        this.f61576m = z ? 1 : 0;
    }

    /* renamed from: R */
    public void m47940R(int i) {
        this.f61576m = i;
    }

    /* renamed from: c */
    public String m47939c() {
        return this.f61578o;
    }

    /* renamed from: d */
    public String m47938d() {
        return this.f61583t;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public int m47937f() {
        return this.f61581r;
    }

    /* renamed from: g */
    public String m47936g() {
        return this.f61582s;
    }

    /* renamed from: h */
    public String m47935h() {
        return this.f61579p;
    }

    /* renamed from: i */
    public String m47934i() {
        return this.f61580q;
    }

    /* renamed from: j */
    public String m47933j() {
        return this.f61568d;
    }

    /* renamed from: k */
    public String m47932k() {
        return this.f61566b;
    }

    /* renamed from: l */
    public String m47931l() {
        return this.f61574k;
    }

    /* renamed from: m */
    public int m47930m() {
        return this.f61572i;
    }

    /* renamed from: n */
    public String m47929n() {
        return this.f61573j;
    }

    /* renamed from: o */
    public String m47928o() {
        String str;
        if (this.f61569f == 0 && TextUtils.isEmpty(this.f61571h)) {
            str = "text";
        } else {
            str = "image";
        }
        str = (this.f61572i == 0 && TextUtils.isEmpty(this.f61574k)) ? "bigimage" : "bigimage";
        if (!TextUtils.isEmpty(this.f61578o)) {
            if (!TextUtils.isEmpty(this.f61579p) && !TextUtils.isEmpty(this.f61580q)) {
                return "bg_color_btn";
            }
            return "bg_color";
        } else if (this.f61581r != 0 || !TextUtils.isEmpty(this.f61583t)) {
            return "bg_image";
        } else {
            return str;
        }
    }

    /* renamed from: p */
    public String m47927p() {
        return this.f61571h;
    }

    /* renamed from: q */
    public int m47926q() {
        return this.f61569f;
    }

    /* renamed from: r */
    public String m47925r() {
        return this.f61570g;
    }

    /* renamed from: s */
    public int m47924s() {
        return this.f61577n;
    }

    /* renamed from: t */
    public String m47923t() {
        return this.f61575l;
    }

    public String toString() {
        return "contentId = " + this.f61566b + ", title = " + this.f61567c + ", content= " + this.f61568d + ", largeIconRes = " + this.f61569f + ", largeIconResName = " + this.f61570g + ", largeIconFilePath = " + this.f61571h + ", contentImageRes = " + this.f61572i + ", contentImageResName = " + this.f61573j + ", contentImageFilePath= " + this.f61574k + ", sound= " + this.f61575l + ", vibration= " + this.f61576m + ", normalFloat= " + this.f61577n + ", bgColor= " + this.f61578o + ", btnBgColor= " + this.f61579p + ", btnContent= " + this.f61580q + ", bgImageRes= " + this.f61581r + ", bgImageResName= " + this.f61582s + ", bgImageFilePath= " + this.f61583t;
    }

    /* renamed from: u */
    public String m47922u() {
        return this.f61567c;
    }

    /* renamed from: v */
    public int m47921v() {
        return this.f61576m;
    }

    /* renamed from: w */
    public boolean m47920w() {
        if (this.f61577n == 1) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f61566b);
        parcel.writeString(this.f61567c);
        parcel.writeString(this.f61568d);
        parcel.writeInt(this.f61569f);
        parcel.writeString(this.f61570g);
        parcel.writeString(this.f61571h);
        parcel.writeInt(this.f61572i);
        parcel.writeString(this.f61573j);
        parcel.writeString(this.f61574k);
        parcel.writeString(this.f61575l);
        parcel.writeInt(this.f61576m);
        parcel.writeInt(this.f61577n);
        parcel.writeString(this.f61578o);
        parcel.writeString(this.f61579p);
        parcel.writeString(this.f61580q);
        parcel.writeInt(this.f61581r);
        parcel.writeString(this.f61582s);
        parcel.writeString(this.f61583t);
    }

    /* renamed from: x */
    public boolean m47919x() {
        if (this.f61576m == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public void m47918y(String str) {
        this.f61578o = str;
    }

    /* renamed from: z */
    public void m47917z(String str) {
        this.f61583t = str;
    }
}
