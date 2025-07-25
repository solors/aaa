package com.mobilefuse.videoplayer.model.utils;

import android.text.TextUtils;
import com.mobilefuse.videoplayer.model.EnumWithValue;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.videoplayer.model.utils.StringEncodingAndFormattingKt */
/* loaded from: classes7.dex */
public final class StringEncodingAndFormatting {
    @NotNull
    public static final String encodeUriComponent(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            String encode = URLEncoder.encode(value, "UTF-8");
            Intrinsics.checkNotNullExpressionValue(encode, "URLEncoder.encode(value, \"UTF-8\")");
            return new Regex("%7E").replace(new Regex("%29").replace(new Regex("%28").replace(new Regex("%27").replace(new Regex("%21").replace(new Regex("\\+").replace(encode, "%20"), "!"), "'"), "("), ")"), "~");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return value;
        }
    }

    @NotNull
    public static final String enumCollectionToString(@NotNull Collection<? extends EnumWithValue<?>> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (collection.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((EnumWithValue) it.next()).getStringValue());
        }
        String join = TextUtils.join(",", arrayList);
        Intrinsics.checkNotNullExpressionValue(join, "TextUtils.join(\",\", values)");
        return join;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
        r3 = kotlin.text.StringNumberConversions.m16640m(r3);
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Long formattedTimeToMillis(@org.jetbrains.annotations.NotNull java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.videoplayer.model.utils.StringEncodingAndFormatting.formattedTimeToMillis(java.lang.String):java.lang.Long");
    }

    @NotNull
    public static final String getIso8601Timestamp() {
        String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(Date())");
        return format;
    }

    @NotNull
    public static final String millisToFormattedTime(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(Long.valueOf(j));
        Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(millis)");
        return format;
    }

    @NotNull
    public static final String encodeUriComponent(@NotNull Collection<String> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (collection.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (String str : collection) {
            arrayList.add(encodeUriComponent(str));
        }
        String join = TextUtils.join(",", arrayList);
        Intrinsics.checkNotNullExpressionValue(join, "TextUtils.join(\",\", encodedItems)");
        return join;
    }
}
