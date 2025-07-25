package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
final class TopicOperation {

    /* renamed from: d */
    private static final Pattern f43283d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    private final String f43284a;

    /* renamed from: b */
    private final String f43285b;

    /* renamed from: c */
    private final String f43286c;

    private TopicOperation(@TopicOperations String str, String str2) {
        this.f43284a = m66528b(str2, str);
        this.f43285b = str;
        this.f43286c = str + "!" + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public static TopicOperation m66529a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new TopicOperation(split[0], split[1]);
    }

    @NonNull
    /* renamed from: b */
    private static String m66528b(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w(Constants.TAG, String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && f43283d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    public static TopicOperation subscribe(@NonNull String str) {
        return new TopicOperation(ExifInterface.LATITUDE_SOUTH, str);
    }

    public static TopicOperation unsubscribe(@NonNull String str) {
        return new TopicOperation("U", str);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TopicOperation)) {
            return false;
        }
        TopicOperation topicOperation = (TopicOperation) obj;
        if (!this.f43284a.equals(topicOperation.f43284a) || !this.f43285b.equals(topicOperation.f43285b)) {
            return false;
        }
        return true;
    }

    public String getOperation() {
        return this.f43285b;
    }

    public String getTopic() {
        return this.f43284a;
    }

    public int hashCode() {
        return Objects.hashCode(this.f43285b, this.f43284a);
    }

    public String serialize() {
        return this.f43286c;
    }
}
