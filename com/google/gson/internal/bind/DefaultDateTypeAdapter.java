package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {

    /* renamed from: a */
    private final DateType<T> f44018a;

    /* renamed from: b */
    private final List<DateFormat> f44019b;

    /* loaded from: classes5.dex */
    public static abstract class DateType<T extends Date> {
        public static final DateType<Date> DATE = new DateType<Date>(Date.class) { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.1
            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
            /* renamed from: b */
            protected Date mo66157b(Date date) {
                return date;
            }
        };

        /* renamed from: a */
        private final Class<T> f44020a;

        /* JADX INFO: Access modifiers changed from: protected */
        public DateType(Class<T> cls) {
            this.f44020a = cls;
        }

        /* renamed from: a */
        private final TypeAdapterFactory m66186a(DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
            return TypeAdapters.newFactory(this.f44020a, defaultDateTypeAdapter);
        }

        /* renamed from: b */
        protected abstract T mo66157b(Date date);

        public final TypeAdapterFactory createAdapterFactory(String str) {
            return m66186a(new DefaultDateTypeAdapter<>(this, str));
        }

        public final TypeAdapterFactory createDefaultsAdapterFactory() {
            return m66186a(new DefaultDateTypeAdapter<>(this, 2, 2));
        }

        public final TypeAdapterFactory createAdapterFactory(int i) {
            return m66186a(new DefaultDateTypeAdapter<>(this, i));
        }

        public final TypeAdapterFactory createAdapterFactory(int i, int i2) {
            return m66186a(new DefaultDateTypeAdapter<>(this, i, i2));
        }
    }

    /* renamed from: a */
    private Date m66187a(String str) {
        synchronized (this.f44019b) {
            for (DateFormat dateFormat : this.f44019b) {
                try {
                    return dateFormat.parse(str);
                } catch (ParseException unused) {
                }
            }
            try {
                return ISO8601Utils.parse(str, new ParsePosition(0));
            } catch (ParseException e) {
                throw new JsonSyntaxException(str, e);
            }
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f44019b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // com.google.gson.TypeAdapter
    public T read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.f44018a.mo66157b(m66187a(jsonReader.nextString()));
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.f44019b) {
            jsonWriter.value(this.f44019b.get(0).format(date));
        }
    }

    private DefaultDateTypeAdapter(DateType<T> dateType, String str) {
        ArrayList arrayList = new ArrayList();
        this.f44019b = arrayList;
        this.f44018a = (DateType) C$Gson$Preconditions.checkNotNull(dateType);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private DefaultDateTypeAdapter(DateType<T> dateType, int i) {
        ArrayList arrayList = new ArrayList();
        this.f44019b = arrayList;
        this.f44018a = (DateType) C$Gson$Preconditions.checkNotNull(dateType);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateInstance(i, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateInstance(i));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUSDateFormat(i));
        }
    }

    private DefaultDateTypeAdapter(DateType<T> dateType, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.f44019b = arrayList;
        this.f44018a = (DateType) C$Gson$Preconditions.checkNotNull(dateType);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUSDateTimeFormat(i, i2));
        }
    }
}
