package com.meevii.soniclib.largepush;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes5.dex */
public class LargePushData implements Parcelable {
    public static final Parcelable.Creator<LargePushData> CREATOR = new C23347a();
    private String bodyContent;
    private String btnContent;
    private String contentId;
    private String pushId;
    private int uiStyle;

    /* renamed from: com.meevii.soniclib.largepush.LargePushData$a */
    /* loaded from: classes5.dex */
    class C23347a implements Parcelable.Creator<LargePushData> {
        C23347a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public LargePushData createFromParcel(Parcel parcel) {
            return new LargePushData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public LargePushData[] newArray(int i) {
            return new LargePushData[i];
        }
    }

    public LargePushData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBodyContent() {
        return this.bodyContent;
    }

    public String getBtnContent() {
        return this.btnContent;
    }

    public String getContentId() {
        return this.contentId;
    }

    public String getPushId() {
        return this.pushId;
    }

    public int getUiStyle() {
        return this.uiStyle;
    }

    public boolean isDirty() {
        if (!TextUtils.isEmpty(this.pushId) && !TextUtils.isEmpty(this.contentId) && !TextUtils.isEmpty(this.bodyContent) && !TextUtils.isEmpty(this.btnContent)) {
            return false;
        }
        return true;
    }

    public void setBodyContent(String str) {
        this.bodyContent = str;
    }

    public void setBtnContent(String str) {
        this.btnContent = str;
    }

    public void setContentId(String str) {
        this.contentId = str;
    }

    public void setPushId(String str) {
        this.pushId = str;
    }

    public void setUiStyle(int i) {
        this.uiStyle = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.pushId);
        parcel.writeString(this.contentId);
        parcel.writeString(this.bodyContent);
        parcel.writeString(this.btnContent);
        parcel.writeInt(this.uiStyle);
    }

    protected LargePushData(Parcel parcel) {
        this.pushId = parcel.readString();
        this.contentId = parcel.readString();
        this.bodyContent = parcel.readString();
        this.btnContent = parcel.readString();
        this.uiStyle = parcel.readInt();
    }
}
