package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new Parcelable.Creator<BatchReportMessage>() { // from class: com.mbridge.msdk.foundation.same.report.BatchReportMessage.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BatchReportMessage[] newArray(int i) {
            return new BatchReportMessage[i];
        }
    };

    /* renamed from: a */
    private String f56696a;

    /* renamed from: b */
    private long f56697b;

    /* renamed from: c */
    private String f56698c;

    public BatchReportMessage(String str, String str2, long j) {
        this.f56698c = str;
        this.f56696a = str2;
        this.f56697b = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.f56696a;
    }

    public long getTimestamp() {
        return this.f56697b;
    }

    public String getUuid() {
        return this.f56698c;
    }

    public void setReportMessage(String str) {
        this.f56696a = str;
    }

    public void setTimestamp(long j) {
        this.f56697b = j;
    }

    public void setUuid(String str) {
        this.f56698c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f56698c);
        parcel.writeString(this.f56696a);
        parcel.writeLong(this.f56697b);
    }

    protected BatchReportMessage(Parcel parcel) {
        this.f56698c = parcel.readString();
        this.f56696a = parcel.readString();
        this.f56697b = parcel.readLong();
    }
}
