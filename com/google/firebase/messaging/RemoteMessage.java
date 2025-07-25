package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.firebase.messaging.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new RemoteMessageCreator();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;
    @SafeParcelable.Field(m72314id = 2)

    /* renamed from: b */
    Bundle f43228b;

    /* renamed from: c */
    private Map<String, String> f43229c;

    /* renamed from: d */
    private Notification f43230d;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        private final Bundle f43231a;

        /* renamed from: b */
        private final Map<String, String> f43232b;

        public Builder(@NonNull String str) {
            Bundle bundle = new Bundle();
            this.f43231a = bundle;
            this.f43232b = new ArrayMap();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(Constants.MessagePayloadKeys.f43179TO, str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        @NonNull
        public Builder addData(@NonNull String str, @Nullable String str2) {
            this.f43232b.put(str, str2);
            return this;
        }

        @NonNull
        public RemoteMessage build() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.f43232b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.f43231a);
            this.f43231a.remove(Constants.MessagePayloadKeys.FROM);
            return new RemoteMessage(bundle);
        }

        @NonNull
        public Builder clearData() {
            this.f43232b.clear();
            return this;
        }

        @Nullable
        public String getCollapseKey() {
            return this.f43231a.getString(Constants.MessagePayloadKeys.MESSAGE_TYPE);
        }

        @NonNull
        public Map<String, String> getData() {
            return this.f43232b;
        }

        @NonNull
        public String getMessageId() {
            return this.f43231a.getString(Constants.MessagePayloadKeys.MSGID, "");
        }

        @Nullable
        public String getMessageType() {
            return this.f43231a.getString(Constants.MessagePayloadKeys.MESSAGE_TYPE);
        }

        @IntRange(from = 0, m105510to = 86400)
        public int getTtl() {
            return Integer.parseInt(this.f43231a.getString(Constants.MessagePayloadKeys.MESSAGE_TYPE, "0"));
        }

        @NonNull
        public Builder setCollapseKey(@Nullable String str) {
            this.f43231a.putString(Constants.MessagePayloadKeys.COLLAPSE_KEY, str);
            return this;
        }

        @NonNull
        public Builder setData(@NonNull Map<String, String> map) {
            this.f43232b.clear();
            this.f43232b.putAll(map);
            return this;
        }

        @NonNull
        public Builder setMessageId(@NonNull String str) {
            this.f43231a.putString(Constants.MessagePayloadKeys.MSGID, str);
            return this;
        }

        @NonNull
        public Builder setMessageType(@Nullable String str) {
            this.f43231a.putString(Constants.MessagePayloadKeys.MESSAGE_TYPE, str);
            return this;
        }

        @NonNull
        @ShowFirstParty
        public Builder setRawData(byte[] bArr) {
            this.f43231a.putByteArray(Constants.MessagePayloadKeys.RAW_DATA, bArr);
            return this;
        }

        @NonNull
        public Builder setTtl(@IntRange(from = 0, m105510to = 86400) int i) {
            this.f43231a.putString(Constants.MessagePayloadKeys.TTL, String.valueOf(i));
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface MessagePriority {
    }

    /* loaded from: classes4.dex */
    public static class Notification {

        /* renamed from: a */
        private final String f43233a;

        /* renamed from: b */
        private final String f43234b;

        /* renamed from: c */
        private final String[] f43235c;

        /* renamed from: d */
        private final String f43236d;

        /* renamed from: e */
        private final String f43237e;

        /* renamed from: f */
        private final String[] f43238f;

        /* renamed from: g */
        private final String f43239g;

        /* renamed from: h */
        private final String f43240h;

        /* renamed from: i */
        private final String f43241i;

        /* renamed from: j */
        private final String f43242j;

        /* renamed from: k */
        private final String f43243k;

        /* renamed from: l */
        private final String f43244l;

        /* renamed from: m */
        private final String f43245m;

        /* renamed from: n */
        private final Uri f43246n;

        /* renamed from: o */
        private final String f43247o;

        /* renamed from: p */
        private final Integer f43248p;

        /* renamed from: q */
        private final Integer f43249q;

        /* renamed from: r */
        private final Integer f43250r;

        /* renamed from: s */
        private final int[] f43251s;

        /* renamed from: t */
        private final Long f43252t;

        /* renamed from: u */
        private final boolean f43253u;

        /* renamed from: v */
        private final boolean f43254v;

        /* renamed from: w */
        private final boolean f43255w;

        /* renamed from: x */
        private final boolean f43256x;

        /* renamed from: y */
        private final boolean f43257y;

        /* renamed from: z */
        private final long[] f43258z;

        /* renamed from: a */
        private static String[] m66558a(NotificationParams notificationParams, String str) {
            Object[] localizationArgsForKey = notificationParams.getLocalizationArgsForKey(str);
            if (localizationArgsForKey == null) {
                return null;
            }
            String[] strArr = new String[localizationArgsForKey.length];
            for (int i = 0; i < localizationArgsForKey.length; i++) {
                strArr[i] = String.valueOf(localizationArgsForKey[i]);
            }
            return strArr;
        }

        @Nullable
        public String getBody() {
            return this.f43236d;
        }

        @Nullable
        public String[] getBodyLocalizationArgs() {
            return this.f43238f;
        }

        @Nullable
        public String getBodyLocalizationKey() {
            return this.f43237e;
        }

        @Nullable
        public String getChannelId() {
            return this.f43245m;
        }

        @Nullable
        public String getClickAction() {
            return this.f43244l;
        }

        @Nullable
        public String getColor() {
            return this.f43243k;
        }

        public boolean getDefaultLightSettings() {
            return this.f43257y;
        }

        public boolean getDefaultSound() {
            return this.f43255w;
        }

        public boolean getDefaultVibrateSettings() {
            return this.f43256x;
        }

        @Nullable
        public Long getEventTime() {
            return this.f43252t;
        }

        @Nullable
        public String getIcon() {
            return this.f43239g;
        }

        @Nullable
        public Uri getImageUrl() {
            String str = this.f43240h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        @Nullable
        public int[] getLightSettings() {
            return this.f43251s;
        }

        @Nullable
        public Uri getLink() {
            return this.f43246n;
        }

        public boolean getLocalOnly() {
            return this.f43254v;
        }

        @Nullable
        public Integer getNotificationCount() {
            return this.f43250r;
        }

        @Nullable
        public Integer getNotificationPriority() {
            return this.f43248p;
        }

        @Nullable
        public String getSound() {
            return this.f43241i;
        }

        public boolean getSticky() {
            return this.f43253u;
        }

        @Nullable
        public String getTag() {
            return this.f43242j;
        }

        @Nullable
        public String getTicker() {
            return this.f43247o;
        }

        @Nullable
        public String getTitle() {
            return this.f43233a;
        }

        @Nullable
        public String[] getTitleLocalizationArgs() {
            return this.f43235c;
        }

        @Nullable
        public String getTitleLocalizationKey() {
            return this.f43234b;
        }

        @Nullable
        public long[] getVibrateTimings() {
            return this.f43258z;
        }

        @Nullable
        public Integer getVisibility() {
            return this.f43249q;
        }

        private Notification(NotificationParams notificationParams) {
            this.f43233a = notificationParams.getString(Constants.MessageNotificationKeys.TITLE);
            this.f43234b = notificationParams.getLocalizationResourceForKey(Constants.MessageNotificationKeys.TITLE);
            this.f43235c = m66558a(notificationParams, Constants.MessageNotificationKeys.TITLE);
            this.f43236d = notificationParams.getString(Constants.MessageNotificationKeys.BODY);
            this.f43237e = notificationParams.getLocalizationResourceForKey(Constants.MessageNotificationKeys.BODY);
            this.f43238f = m66558a(notificationParams, Constants.MessageNotificationKeys.BODY);
            this.f43239g = notificationParams.getString(Constants.MessageNotificationKeys.ICON);
            this.f43241i = notificationParams.getSoundResourceName();
            this.f43242j = notificationParams.getString(Constants.MessageNotificationKeys.TAG);
            this.f43243k = notificationParams.getString(Constants.MessageNotificationKeys.COLOR);
            this.f43244l = notificationParams.getString(Constants.MessageNotificationKeys.CLICK_ACTION);
            this.f43245m = notificationParams.getString(Constants.MessageNotificationKeys.CHANNEL);
            this.f43246n = notificationParams.getLink();
            this.f43240h = notificationParams.getString(Constants.MessageNotificationKeys.IMAGE_URL);
            this.f43247o = notificationParams.getString(Constants.MessageNotificationKeys.TICKER);
            this.f43248p = notificationParams.getInteger(Constants.MessageNotificationKeys.NOTIFICATION_PRIORITY);
            this.f43249q = notificationParams.getInteger(Constants.MessageNotificationKeys.VISIBILITY);
            this.f43250r = notificationParams.getInteger(Constants.MessageNotificationKeys.NOTIFICATION_COUNT);
            this.f43253u = notificationParams.getBoolean(Constants.MessageNotificationKeys.STICKY);
            this.f43254v = notificationParams.getBoolean(Constants.MessageNotificationKeys.LOCAL_ONLY);
            this.f43255w = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_SOUND);
            this.f43256x = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_VIBRATE_TIMINGS);
            this.f43257y = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_LIGHT_SETTINGS);
            this.f43252t = notificationParams.getLong(Constants.MessageNotificationKeys.EVENT_TIME);
            this.f43251s = notificationParams.m66579b();
            this.f43258z = notificationParams.getVibrateTimings();
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(m72313id = 2) Bundle bundle) {
        this.f43228b = bundle;
    }

    /* renamed from: a */
    private int m66560a(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        if ("normal".equals(str)) {
            return 2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m66559f(Intent intent) {
        intent.putExtras(this.f43228b);
    }

    @Nullable
    public String getCollapseKey() {
        return this.f43228b.getString(Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    @NonNull
    public Map<String, String> getData() {
        if (this.f43229c == null) {
            this.f43229c = Constants.MessagePayloadKeys.extractDeveloperDefinedPayload(this.f43228b);
        }
        return this.f43229c;
    }

    @Nullable
    public String getFrom() {
        return this.f43228b.getString(Constants.MessagePayloadKeys.FROM);
    }

    @Nullable
    public String getMessageId() {
        String string = this.f43228b.getString(Constants.MessagePayloadKeys.MSGID);
        if (string == null) {
            return this.f43228b.getString(Constants.MessagePayloadKeys.MSGID_SERVER);
        }
        return string;
    }

    @Nullable
    public String getMessageType() {
        return this.f43228b.getString(Constants.MessagePayloadKeys.MESSAGE_TYPE);
    }

    @Nullable
    public Notification getNotification() {
        if (this.f43230d == null && NotificationParams.isNotification(this.f43228b)) {
            this.f43230d = new Notification(new NotificationParams(this.f43228b));
        }
        return this.f43230d;
    }

    public int getOriginalPriority() {
        String string = this.f43228b.getString(Constants.MessagePayloadKeys.ORIGINAL_PRIORITY);
        if (string == null) {
            string = this.f43228b.getString(Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return m66560a(string);
    }

    public int getPriority() {
        String string = this.f43228b.getString(Constants.MessagePayloadKeys.DELIVERED_PRIORITY);
        if (string == null) {
            if ("1".equals(this.f43228b.getString(Constants.MessagePayloadKeys.PRIORITY_REDUCED_V19))) {
                return 2;
            }
            string = this.f43228b.getString(Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return m66560a(string);
    }

    @Nullable
    @ShowFirstParty
    public byte[] getRawData() {
        return this.f43228b.getByteArray(Constants.MessagePayloadKeys.RAW_DATA);
    }

    @Nullable
    public String getSenderId() {
        return this.f43228b.getString(Constants.MessagePayloadKeys.SENDER_ID);
    }

    public long getSentTime() {
        Object obj = this.f43228b.get(Constants.MessagePayloadKeys.SENT_TIME);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                Log.w(Constants.TAG, "Invalid sent time: " + obj);
                return 0L;
            }
        }
        return 0L;
    }

    @Nullable
    public String getTo() {
        return this.f43228b.getString(Constants.MessagePayloadKeys.f43179TO);
    }

    public int getTtl() {
        Object obj = this.f43228b.get(Constants.MessagePayloadKeys.TTL);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w(Constants.TAG, "Invalid TTL: " + obj);
                return 0;
            }
        }
        return 0;
    }

    @KeepForSdk
    public Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtras(this.f43228b);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        RemoteMessageCreator.m66557a(this, parcel, i);
    }
}
