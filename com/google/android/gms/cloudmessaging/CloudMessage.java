package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.Constants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
@SafeParcelable.Class(creator = "CloudMessageCreator")
/* loaded from: classes4.dex */
public final class CloudMessage extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<CloudMessage> CREATOR = new zza();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;
    @NonNull
    @SafeParcelable.Field(m72314id = 1)
    Intent zza;
    private Map<String, String> zzb;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface MessagePriority {
    }

    @SafeParcelable.Constructor
    public CloudMessage(@NonNull @SafeParcelable.Param(m72313id = 1) Intent intent) {
        this.zza = intent;
    }

    private static int zza(@Nullable String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if ("normal".equals(str)) {
            return 2;
        }
        return 0;
    }

    @Nullable
    public String getCollapseKey() {
        return this.zza.getStringExtra(Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    @NonNull
    public synchronized Map<String, String> getData() {
        if (this.zzb == null) {
            Bundle extras = this.zza.getExtras();
            ArrayMap arrayMap = new ArrayMap();
            if (extras != null) {
                for (String str : extras.keySet()) {
                    Object obj = extras.get(str);
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!str.startsWith(Constants.MessagePayloadKeys.RESERVED_PREFIX) && !str.equals(Constants.MessagePayloadKeys.FROM) && !str.equals(Constants.MessagePayloadKeys.MESSAGE_TYPE) && !str.equals(Constants.MessagePayloadKeys.COLLAPSE_KEY)) {
                            arrayMap.put(str, str2);
                        }
                    }
                }
            }
            this.zzb = arrayMap;
        }
        return this.zzb;
    }

    @Nullable
    public String getFrom() {
        return this.zza.getStringExtra(Constants.MessagePayloadKeys.FROM);
    }

    @NonNull
    public Intent getIntent() {
        return this.zza;
    }

    @Nullable
    public String getMessageId() {
        String stringExtra = this.zza.getStringExtra(Constants.MessagePayloadKeys.MSGID);
        if (stringExtra == null) {
            return this.zza.getStringExtra(Constants.MessagePayloadKeys.MSGID_SERVER);
        }
        return stringExtra;
    }

    @Nullable
    public String getMessageType() {
        return this.zza.getStringExtra(Constants.MessagePayloadKeys.MESSAGE_TYPE);
    }

    public int getOriginalPriority() {
        String stringExtra = this.zza.getStringExtra(Constants.MessagePayloadKeys.ORIGINAL_PRIORITY);
        if (stringExtra == null) {
            stringExtra = this.zza.getStringExtra(Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return zza(stringExtra);
    }

    public int getPriority() {
        String stringExtra = this.zza.getStringExtra(Constants.MessagePayloadKeys.DELIVERED_PRIORITY);
        if (stringExtra == null) {
            if ("1".equals(this.zza.getStringExtra(Constants.MessagePayloadKeys.PRIORITY_REDUCED_V19))) {
                return 2;
            }
            stringExtra = this.zza.getStringExtra(Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return zza(stringExtra);
    }

    @Nullable
    public byte[] getRawData() {
        return this.zza.getByteArrayExtra(Constants.MessagePayloadKeys.RAW_DATA);
    }

    @Nullable
    public String getSenderId() {
        return this.zza.getStringExtra(Constants.MessagePayloadKeys.SENDER_ID);
    }

    public long getSentTime() {
        Object obj;
        Bundle extras = this.zza.getExtras();
        if (extras != null) {
            obj = extras.get(Constants.MessagePayloadKeys.SENT_TIME);
        } else {
            obj = null;
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 19);
                sb2.append("Invalid sent time: ");
                sb2.append(valueOf);
                Log.w("CloudMessage", sb2.toString());
                return 0L;
            }
        }
        return 0L;
    }

    @Nullable
    public String getTo() {
        return this.zza.getStringExtra(Constants.MessagePayloadKeys.f43179TO);
    }

    public int getTtl() {
        Object obj;
        Bundle extras = this.zza.getExtras();
        if (extras != null) {
            obj = extras.get(Constants.MessagePayloadKeys.TTL);
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(obj);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 13);
                sb2.append("Invalid TTL: ");
                sb2.append(valueOf);
                Log.w("CloudMessage", sb2.toString());
                return 0;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
