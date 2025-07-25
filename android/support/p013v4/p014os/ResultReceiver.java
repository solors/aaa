package android.support.p013v4.p014os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p013v4.p014os.IResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: android.support.v4.os.ResultReceiver */
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0105a();

    /* renamed from: b */
    final boolean f287b = false;

    /* renamed from: c */
    final Handler f288c = null;

    /* renamed from: d */
    IResultReceiver f289d;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    /* loaded from: classes.dex */
    class C0105a implements Parcelable.Creator<ResultReceiver> {
        C0105a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    /* loaded from: classes.dex */
    class BinderC0106b extends IResultReceiver.AbstractBinderC0108a {
        BinderC0106b() {
        }

        @Override // android.support.p013v4.p014os.IResultReceiver
        /* renamed from: a */
        public void mo105530a(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f288c;
            if (handler != null) {
                handler.post(new RunnableC0107c(i, bundle));
            } else {
                resultReceiver.mo105535a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    /* loaded from: classes.dex */
    class RunnableC0107c implements Runnable {

        /* renamed from: b */
        final int f291b;

        /* renamed from: c */
        final Bundle f292c;

        RunnableC0107c(int i, Bundle bundle) {
            this.f291b = i;
            this.f292c = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.mo105535a(this.f291b, this.f292c);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f289d = IResultReceiver.AbstractBinderC0108a.m105531c(parcel.readStrongBinder());
    }

    /* renamed from: c */
    public void m105534c(int i, Bundle bundle) {
        if (this.f287b) {
            Handler handler = this.f288c;
            if (handler != null) {
                handler.post(new RunnableC0107c(i, bundle));
                return;
            } else {
                mo105535a(i, bundle);
                return;
            }
        }
        IResultReceiver iResultReceiver = this.f289d;
        if (iResultReceiver != null) {
            try {
                iResultReceiver.mo105530a(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        synchronized (this) {
            if (this.f289d == null) {
                this.f289d = new BinderC0106b();
            }
            parcel.writeStrongBinder(this.f289d.asBinder());
        }
    }

    /* renamed from: a */
    protected void mo105535a(int i, Bundle bundle) {
    }
}
